package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class FlowableWindowTimed<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    public final int bufferSize;
    public final long maxSize;
    public final boolean restartTimerOnMaxSize;
    public final Scheduler scheduler;
    public final long timeskip;
    public final long timespan;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class WindowExactBoundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d {
        public final int bufferSize;
        public long count;
        public final long maxSize;
        public long producerIndex;
        public final boolean restartTimerOnMaxSize;
        public final Scheduler scheduler;
        public volatile boolean terminated;
        public final SequentialDisposable timer;
        public final long timespan;
        public final TimeUnit unit;
        public d upstream;
        public UnicastProcessor<T> window;
        public final Scheduler.Worker worker;

        /* loaded from: classes2.dex */
        public static final class ConsumerIndexHolder implements Runnable {
            public final long index;
            public final WindowExactBoundedSubscriber<?> parent;

            public ConsumerIndexHolder(long j10, WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber) {
                this.index = j10;
                this.parent = windowExactBoundedSubscriber;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber = this.parent;
                if (windowExactBoundedSubscriber.cancelled) {
                    windowExactBoundedSubscriber.terminated = true;
                } else {
                    windowExactBoundedSubscriber.queue.offer(this);
                }
                if (windowExactBoundedSubscriber.enter()) {
                    windowExactBoundedSubscriber.drainLoop();
                }
            }
        }

        public WindowExactBoundedSubscriber(c<? super Flowable<T>> cVar, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, long j11, boolean z10) {
            super(cVar, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i10;
            this.maxSize = j11;
            this.restartTimerOnMaxSize = z10;
            if (z10) {
                this.worker = scheduler.createWorker();
            } else {
                this.worker = null;
            }
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
        }

        public void disposeTimer() {
            this.timer.dispose();
            Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        public void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            c<? super V> cVar = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.window;
            int i10 = 1;
            while (!this.terminated) {
                boolean z10 = this.done;
                Object poll = simpleQueue.poll();
                boolean z11 = poll == null;
                boolean z12 = poll instanceof ConsumerIndexHolder;
                if (z10 && (z11 || z12)) {
                    this.window = null;
                    simpleQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        unicastProcessor.onError(th);
                    } else {
                        unicastProcessor.onComplete();
                    }
                    disposeTimer();
                    return;
                } else if (z11) {
                    i10 = leave(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    int i11 = i10;
                    if (z12) {
                        ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) poll;
                        if (!this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                            unicastProcessor.onComplete();
                            this.count = 0L;
                            unicastProcessor = UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            long requested = requested();
                            if (requested == 0) {
                                this.window = null;
                                this.queue.clear();
                                this.upstream.cancel();
                                cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                disposeTimer();
                                return;
                            }
                            cVar.onNext(unicastProcessor);
                            if (requested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                        }
                    } else {
                        unicastProcessor.onNext(NotificationLite.getValue(poll));
                        long j10 = this.count + 1;
                        if (j10 >= this.maxSize) {
                            this.producerIndex++;
                            this.count = 0L;
                            unicastProcessor.onComplete();
                            long requested2 = requested();
                            if (requested2 == 0) {
                                this.window = null;
                                this.upstream.cancel();
                                this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                                disposeTimer();
                                return;
                            }
                            UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                            this.window = create;
                            this.downstream.onNext(create);
                            if (requested2 != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            if (this.restartTimerOnMaxSize) {
                                this.timer.get().dispose();
                                Scheduler.Worker worker = this.worker;
                                ConsumerIndexHolder consumerIndexHolder2 = new ConsumerIndexHolder(this.producerIndex, this);
                                long j11 = this.timespan;
                                this.timer.replace(worker.schedulePeriodically(consumerIndexHolder2, j11, j11, this.unit));
                            }
                            unicastProcessor = create;
                        } else {
                            this.count = j10;
                        }
                    }
                    i10 = i11;
                }
            }
            this.upstream.cancel();
            simpleQueue.clear();
            disposeTimer();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                UnicastProcessor<T> unicastProcessor = this.window;
                unicastProcessor.onNext(t2);
                long j10 = this.count + 1;
                if (j10 >= this.maxSize) {
                    this.producerIndex++;
                    this.count = 0L;
                    unicastProcessor.onComplete();
                    long requested = requested();
                    if (requested == 0) {
                        this.window = null;
                        this.upstream.cancel();
                        this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        disposeTimer();
                        return;
                    }
                    UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                    this.window = create;
                    this.downstream.onNext(create);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (this.restartTimerOnMaxSize) {
                        this.timer.get().dispose();
                        Scheduler.Worker worker = this.worker;
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                        long j11 = this.timespan;
                        this.timer.replace(worker.schedulePeriodically(consumerIndexHolder, j11, j11, this.unit));
                    }
                } else {
                    this.count = j10;
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(t2));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            Disposable schedulePeriodicallyDirect;
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                c<? super V> cVar = this.downstream;
                cVar.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                this.window = create;
                long requested = requested();
                if (requested == 0) {
                    this.cancelled = true;
                    dVar.cancel();
                    cVar.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    return;
                }
                cVar.onNext(create);
                if (requested != Long.MAX_VALUE) {
                    produced(1L);
                }
                ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                if (this.restartTimerOnMaxSize) {
                    Scheduler.Worker worker = this.worker;
                    long j10 = this.timespan;
                    schedulePeriodicallyDirect = worker.schedulePeriodically(consumerIndexHolder, j10, j10, this.unit);
                } else {
                    Scheduler scheduler = this.scheduler;
                    long j11 = this.timespan;
                    schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(consumerIndexHolder, j11, j11, this.unit);
                }
                if (this.timer.replace(schedulePeriodicallyDirect)) {
                    dVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // df.d
        public void request(long j10) {
            requested(j10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowExactUnboundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d, Runnable {
        public static final Object NEXT = new Object();
        public final int bufferSize;
        public final Scheduler scheduler;
        public volatile boolean terminated;
        public final SequentialDisposable timer;
        public final long timespan;
        public final TimeUnit unit;
        public d upstream;
        public UnicastProcessor<T> window;

        public WindowExactUnboundedSubscriber(c<? super Flowable<T>> cVar, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
            super(cVar, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i10;
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
            if (r0 == null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
            r14.timer.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
            r14.window = null;
            r0.clear();
            r0 = r14.error;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drainLoop() {
            /*
                r14 = this;
                r10 = r14
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                df.c<? super V> r1 = r10.downstream
                r12 = 1
                io.reactivex.processors.UnicastProcessor<T> r2 = r10.window
                r13 = 1
                r3 = r13
            La:
                r12 = 2
            Lb:
                boolean r4 = r10.terminated
                r13 = 5
                boolean r5 = r10.done
                java.lang.Object r13 = r0.poll()
                r6 = r13
                r13 = 0
                r7 = r13
                if (r5 == 0) goto L3c
                if (r6 == 0) goto L20
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.NEXT
                r13 = 7
                if (r6 != r5) goto L3c
            L20:
                r12 = 7
                r10.window = r7
                r0.clear()
                r12 = 3
                java.lang.Throwable r0 = r10.error
                if (r0 == 0) goto L31
                r12 = 3
                r2.onError(r0)
                r13 = 7
                goto L34
            L31:
                r2.onComplete()
            L34:
                io.reactivex.internal.disposables.SequentialDisposable r0 = r10.timer
                r13 = 6
                r0.dispose()
                r13 = 6
                return
            L3c:
                r12 = 2
                if (r6 != 0) goto L4a
                int r3 = -r3
                r12 = 1
                int r12 = r10.leave(r3)
                r3 = r12
                if (r3 != 0) goto La
                r12 = 2
                return
            L4a:
                r13 = 6
                java.lang.Object r5 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.NEXT
                if (r6 != r5) goto La6
                r13 = 2
                r2.onComplete()
                if (r4 != 0) goto L9e
                int r2 = r10.bufferSize
                r13 = 5
                io.reactivex.processors.UnicastProcessor r2 = io.reactivex.processors.UnicastProcessor.create(r2)
                r10.window = r2
                long r4 = r10.requested()
                r8 = 0
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 == 0) goto L7c
                r1.onNext(r2)
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r13 = 3
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                r13 = 5
                if (r8 == 0) goto La
                r4 = 1
                r10.produced(r4)
                goto Lb
            L7c:
                r10.window = r7
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r10.queue
                r12 = 4
                r0.clear()
                r13 = 3
                df.d r0 = r10.upstream
                r0.cancel()
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r13 = "Could not deliver first window due to lack of requests."
                r2 = r13
                r0.<init>(r2)
                r12 = 4
                r1.onError(r0)
                r12 = 1
                io.reactivex.internal.disposables.SequentialDisposable r0 = r10.timer
                r12 = 7
                r0.dispose()
                return
            L9e:
                r12 = 6
                df.d r4 = r10.upstream
                r4.cancel()
                goto Lb
            La6:
                r12 = 6
                java.lang.Object r12 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r4 = r12
                r2.onNext(r4)
                goto Lb
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.drainLoop():void");
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                this.window.onNext(t2);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(t2));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.window = UnicastProcessor.create(this.bufferSize);
                c<? super V> cVar = this.downstream;
                cVar.onSubscribe(this);
                long requested = requested();
                if (requested == 0) {
                    this.cancelled = true;
                    dVar.cancel();
                    cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                    return;
                }
                cVar.onNext(this.window);
                if (requested != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (this.cancelled) {
                    return;
                }
                SequentialDisposable sequentialDisposable = this.timer;
                Scheduler scheduler = this.scheduler;
                long j10 = this.timespan;
                if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j10, j10, this.unit))) {
                    dVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // df.d
        public void request(long j10) {
            requested(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.terminated = true;
            }
            this.queue.offer(NEXT);
            if (enter()) {
                drainLoop();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowSkipSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d, Runnable {
        public final int bufferSize;
        public volatile boolean terminated;
        public final long timeskip;
        public final long timespan;
        public final TimeUnit unit;
        public d upstream;
        public final List<UnicastProcessor<T>> windows;
        public final Scheduler.Worker worker;

        /* loaded from: classes2.dex */
        public final class Completion implements Runnable {
            private final UnicastProcessor<T> processor;

            public Completion(UnicastProcessor<T> unicastProcessor) {
                this.processor = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipSubscriber.this.complete(this.processor);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SubjectWork<T> {
            public final boolean open;

            /* renamed from: w  reason: collision with root package name */
            public final UnicastProcessor<T> f10749w;

            public SubjectWork(UnicastProcessor<T> unicastProcessor, boolean z10) {
                this.f10749w = unicastProcessor;
                this.open = z10;
            }
        }

        public WindowSkipSubscriber(c<? super Flowable<T>> cVar, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker, int i10) {
            super(cVar, new MpscLinkedQueue());
            this.timespan = j10;
            this.timeskip = j11;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i10;
            this.windows = new LinkedList();
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
        }

        public void complete(UnicastProcessor<T> unicastProcessor) {
            this.queue.offer(new SubjectWork(unicastProcessor, false));
            if (enter()) {
                drainLoop();
            }
        }

        public void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            c<? super V> cVar = this.downstream;
            List<UnicastProcessor<T>> list = this.windows;
            int i10 = 1;
            while (!this.terminated) {
                boolean z10 = this.done;
                T t2 = (T) simpleQueue.poll();
                boolean z11 = t2 == null;
                boolean z12 = t2 instanceof SubjectWork;
                if (!z10 || (!z11 && !z12)) {
                    if (z11) {
                        i10 = leave(-i10);
                        if (i10 == 0) {
                            return;
                        }
                    } else if (z12) {
                        SubjectWork subjectWork = (SubjectWork) t2;
                        if (!subjectWork.open) {
                            list.remove(subjectWork.f10749w);
                            subjectWork.f10749w.onComplete();
                            if (list.isEmpty() && this.cancelled) {
                                this.terminated = true;
                            }
                        } else if (!this.cancelled) {
                            long requested = requested();
                            if (requested != 0) {
                                UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                                list.add(create);
                                cVar.onNext(create);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                                this.worker.schedule(new Completion(create), this.timespan, this.unit);
                            } else {
                                cVar.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                            }
                        }
                    } else {
                        for (UnicastProcessor<T> unicastProcessor : list) {
                            unicastProcessor.onNext(t2);
                        }
                    }
                }
                simpleQueue.clear();
                Throwable th = this.error;
                if (th != null) {
                    for (UnicastProcessor<T> unicastProcessor2 : list) {
                        unicastProcessor2.onError(th);
                    }
                } else {
                    for (UnicastProcessor<T> unicastProcessor3 : list) {
                        unicastProcessor3.onComplete();
                    }
                }
                list.clear();
                this.worker.dispose();
                return;
            }
            this.upstream.cancel();
            simpleQueue.clear();
            list.clear();
            this.worker.dispose();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (fastEnter()) {
                for (UnicastProcessor<T> unicastProcessor : this.windows) {
                    unicastProcessor.onNext(t2);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(t2);
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                long requested = requested();
                if (requested == 0) {
                    dVar.cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                    return;
                }
                UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                this.windows.add(create);
                this.downstream.onNext(create);
                if (requested != Long.MAX_VALUE) {
                    produced(1L);
                }
                this.worker.schedule(new Completion(create), this.timespan, this.unit);
                Scheduler.Worker worker = this.worker;
                long j10 = this.timeskip;
                worker.schedulePeriodically(this, j10, j10, this.unit);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // df.d
        public void request(long j10) {
            requested(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastProcessor.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer(subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, long j12, int i10, boolean z10) {
        super(flowable);
        this.timespan = j10;
        this.timeskip = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j12;
        this.bufferSize = i10;
        this.restartTimerOnMaxSize = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Flowable<T>> cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        long j10 = this.timespan;
        long j11 = this.timeskip;
        if (j10 != j11) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(serializedSubscriber, j10, j11, this.unit, this.scheduler.createWorker(), this.bufferSize));
            return;
        }
        long j12 = this.maxSize;
        if (j12 == Long.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new WindowExactUnboundedSubscriber(serializedSubscriber, this.timespan, this.unit, this.scheduler, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowExactBoundedSubscriber(serializedSubscriber, j10, this.unit, this.scheduler, this.bufferSize, j12, this.restartTimerOnMaxSize));
        }
    }
}
