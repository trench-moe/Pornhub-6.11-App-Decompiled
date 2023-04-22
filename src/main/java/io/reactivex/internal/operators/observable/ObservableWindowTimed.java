package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ObservableWindowTimed<T> extends AbstractObservableWithUpstream<T, Observable<T>> {
    public final int bufferSize;
    public final long maxSize;
    public final boolean restartTimerOnMaxSize;
    public final Scheduler scheduler;
    public final long timeskip;
    public final long timespan;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class WindowExactBoundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
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
        public Disposable upstream;
        public UnicastSubject<T> window;
        public final Scheduler.Worker worker;

        /* loaded from: classes2.dex */
        public static final class ConsumerIndexHolder implements Runnable {
            public final long index;
            public final WindowExactBoundedObserver<?> parent;

            public ConsumerIndexHolder(long j10, WindowExactBoundedObserver<?> windowExactBoundedObserver) {
                this.index = j10;
                this.parent = windowExactBoundedObserver;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedObserver<?> windowExactBoundedObserver = this.parent;
                if (windowExactBoundedObserver.cancelled) {
                    windowExactBoundedObserver.terminated = true;
                } else {
                    windowExactBoundedObserver.queue.offer(this);
                }
                if (windowExactBoundedObserver.enter()) {
                    windowExactBoundedObserver.drainLoop();
                }
            }
        }

        public WindowExactBoundedObserver(Observer<? super Observable<T>> observer, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, long j11, boolean z10) {
            super(observer, new MpscLinkedQueue());
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

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        public void disposeTimer() {
            DisposableHelper.dispose(this.timer);
            Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [io.reactivex.Observer<? super V>, io.reactivex.Observer] */
        /* JADX WARN: Type inference failed for: r2v1 */
        public void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            ?? r1 = this.downstream;
            UnicastSubject unicastSubject = this.window;
            int i10 = 1;
            loop0: while (true) {
                while (!this.terminated) {
                    boolean z10 = this.done;
                    Object poll = mpscLinkedQueue.poll();
                    boolean z11 = poll == null;
                    boolean z12 = poll instanceof ConsumerIndexHolder;
                    if (z10 && (z11 || z12)) {
                        break loop0;
                    } else if (z11) {
                        i10 = leave(-i10);
                        if (i10 == 0) {
                            return;
                        }
                    } else if (z12) {
                        ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) poll;
                        if (!this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                            unicastSubject.onComplete();
                            this.count = 0L;
                            unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                            this.window = unicastSubject;
                            r1.onNext(unicastSubject);
                        }
                    } else {
                        unicastSubject.onNext(NotificationLite.getValue(poll));
                        long j10 = this.count + 1;
                        if (j10 >= this.maxSize) {
                            this.producerIndex++;
                            this.count = 0L;
                            unicastSubject.onComplete();
                            unicastSubject = UnicastSubject.create(this.bufferSize);
                            this.window = unicastSubject;
                            this.downstream.onNext(unicastSubject);
                            if (this.restartTimerOnMaxSize) {
                                Disposable disposable = this.timer.get();
                                disposable.dispose();
                                Scheduler.Worker worker = this.worker;
                                ConsumerIndexHolder consumerIndexHolder2 = new ConsumerIndexHolder(this.producerIndex, this);
                                long j11 = this.timespan;
                                Disposable schedulePeriodically = worker.schedulePeriodically(consumerIndexHolder2, j11, j11, this.unit);
                                if (!this.timer.compareAndSet(disposable, schedulePeriodically)) {
                                    schedulePeriodically.dispose();
                                }
                            }
                        } else {
                            this.count = j10;
                        }
                    }
                }
                this.upstream.dispose();
                mpscLinkedQueue.clear();
                disposeTimer();
                return;
            }
            this.window = null;
            mpscLinkedQueue.clear();
            Throwable th = this.error;
            if (th != null) {
                unicastSubject.onError(th);
            } else {
                unicastSubject.onComplete();
            }
            disposeTimer();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
        @Override // io.reactivex.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onNext(T r12) {
            /*
                r11 = this;
                boolean r0 = r11.terminated
                r8 = 7
                if (r0 == 0) goto L6
                return
            L6:
                boolean r0 = r11.fastEnter()
                if (r0 == 0) goto L78
                r10 = 6
                io.reactivex.subjects.UnicastSubject<T> r0 = r11.window
                r0.onNext(r12)
                long r1 = r11.count
                r3 = 1
                long r1 = r1 + r3
                r10 = 3
                long r5 = r11.maxSize
                int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                r9 = 6
                if (r12 < 0) goto L6a
                r9 = 1
                long r1 = r11.producerIndex
                long r1 = r1 + r3
                r11.producerIndex = r1
                r1 = 0
                r11.count = r1
                r0.onComplete()
                r8 = 4
                int r12 = r11.bufferSize
                io.reactivex.subjects.UnicastSubject r7 = io.reactivex.subjects.UnicastSubject.create(r12)
                r12 = r7
                r11.window = r12
                io.reactivex.Observer<? super V> r0 = r11.downstream
                r0.onNext(r12)
                boolean r12 = r11.restartTimerOnMaxSize
                if (r12 == 0) goto L6d
                r10 = 4
                io.reactivex.internal.disposables.SequentialDisposable r12 = r11.timer
                r9 = 3
                java.lang.Object r12 = r12.get()
                io.reactivex.disposables.Disposable r12 = (io.reactivex.disposables.Disposable) r12
                r9 = 6
                r12.dispose()
                r10 = 6
                io.reactivex.Scheduler$Worker r0 = r11.worker
                r10 = 6
                io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver$ConsumerIndexHolder r1 = new io.reactivex.internal.operators.observable.ObservableWindowTimed$WindowExactBoundedObserver$ConsumerIndexHolder
                long r2 = r11.producerIndex
                r8 = 5
                r1.<init>(r2, r11)
                long r4 = r11.timespan
                r10 = 2
                java.util.concurrent.TimeUnit r6 = r11.unit
                r8 = 4
                r2 = r4
                io.reactivex.disposables.Disposable r12 = r0.schedulePeriodically(r1, r2, r4, r6)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r11.timer
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r12)
                goto L6e
            L6a:
                r11.count = r1
                r10 = 7
            L6d:
                r8 = 1
            L6e:
                r7 = -1
                r12 = r7
                int r12 = r11.leave(r12)
                if (r12 != 0) goto L8c
                r9 = 1
                return
            L78:
                io.reactivex.internal.fuseable.SimplePlainQueue<U> r0 = r11.queue
                r8 = 1
                java.lang.Object r7 = io.reactivex.internal.util.NotificationLite.next(r12)
                r12 = r7
                r0.offer(r12)
                boolean r7 = r11.enter()
                r12 = r7
                if (r12 != 0) goto L8c
                r10 = 5
                return
            L8c:
                r8 = 6
                r11.drainLoop()
                r8 = 2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.onNext(java.lang.Object):void");
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            Disposable schedulePeriodicallyDirect;
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                this.window = create;
                observer.onNext(create);
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
                this.timer.replace(schedulePeriodicallyDirect);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowExactUnboundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {
        public static final Object NEXT = new Object();
        public final int bufferSize;
        public final Scheduler scheduler;
        public volatile boolean terminated;
        public final SequentialDisposable timer;
        public final long timespan;
        public final TimeUnit unit;
        public Disposable upstream;
        public UnicastSubject<T> window;

        public WindowExactUnboundedObserver(Observer<? super Observable<T>> observer, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
            super(observer, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i10;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject unicastSubject = this.window;
            int i10 = 1;
            while (true) {
                boolean z10 = this.terminated;
                boolean z11 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (z11 && (poll == null || poll == NEXT)) {
                    break;
                } else if (poll == null) {
                    i10 = leave(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else if (poll == NEXT) {
                    unicastSubject.onComplete();
                    if (z10) {
                        this.upstream.dispose();
                    } else {
                        unicastSubject = UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(poll));
                }
            }
            this.window = null;
            mpscLinkedQueue.clear();
            Throwable th = this.error;
            if (th != null) {
                unicastSubject.onError(th);
            } else {
                unicastSubject.onComplete();
            }
            this.timer.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
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

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.window = UnicastSubject.create(this.bufferSize);
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                observer.onNext(this.window);
                if (!this.cancelled) {
                    Scheduler scheduler = this.scheduler;
                    long j10 = this.timespan;
                    this.timer.replace(scheduler.schedulePeriodicallyDirect(this, j10, j10, this.unit));
                }
            }
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
    public static final class WindowSkipObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {
        public final int bufferSize;
        public volatile boolean terminated;
        public final long timeskip;
        public final long timespan;
        public final TimeUnit unit;
        public Disposable upstream;
        public final List<UnicastSubject<T>> windows;
        public final Scheduler.Worker worker;

        /* loaded from: classes2.dex */
        public final class CompletionTask implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            private final UnicastSubject<T> f10765w;

            public CompletionTask(UnicastSubject<T> unicastSubject) {
                this.f10765w = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipObserver.this.complete(this.f10765w);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SubjectWork<T> {
            public final boolean open;

            /* renamed from: w  reason: collision with root package name */
            public final UnicastSubject<T> f10766w;

            public SubjectWork(UnicastSubject<T> unicastSubject, boolean z10) {
                this.f10766w = unicastSubject;
                this.open = z10;
            }
        }

        public WindowSkipObserver(Observer<? super Observable<T>> observer, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker, int i10) {
            super(observer, new MpscLinkedQueue());
            this.timespan = j10;
            this.timeskip = j11;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i10;
            this.windows = new LinkedList();
        }

        public void complete(UnicastSubject<T> unicastSubject) {
            this.queue.offer(new SubjectWork(unicastSubject, false));
            if (enter()) {
                drainLoop();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        public void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject<T>> list = this.windows;
            int i10 = 1;
            while (!this.terminated) {
                boolean z10 = this.done;
                T t2 = (T) mpscLinkedQueue.poll();
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
                            list.remove(subjectWork.f10766w);
                            subjectWork.f10766w.onComplete();
                            if (list.isEmpty() && this.cancelled) {
                                this.terminated = true;
                            }
                        } else if (!this.cancelled) {
                            UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                            list.add(create);
                            observer.onNext(create);
                            this.worker.schedule(new CompletionTask(create), this.timespan, this.unit);
                        }
                    } else {
                        for (UnicastSubject<T> unicastSubject : list) {
                            unicastSubject.onNext(t2);
                        }
                    }
                }
                mpscLinkedQueue.clear();
                Throwable th = this.error;
                if (th != null) {
                    for (UnicastSubject<T> unicastSubject2 : list) {
                        unicastSubject2.onError(th);
                    }
                } else {
                    for (UnicastSubject<T> unicastSubject3 : list) {
                        unicastSubject3.onComplete();
                    }
                }
                list.clear();
                this.worker.dispose();
                return;
            }
            this.upstream.dispose();
            mpscLinkedQueue.clear();
            list.clear();
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            if (fastEnter()) {
                for (UnicastSubject<T> unicastSubject : this.windows) {
                    unicastSubject.onNext(t2);
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

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                this.windows.add(create);
                this.downstream.onNext(create);
                this.worker.schedule(new CompletionTask(create), this.timespan, this.unit);
                Scheduler.Worker worker = this.worker;
                long j10 = this.timeskip;
                worker.schedulePeriodically(this, j10, j10, this.unit);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastSubject.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer(subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }
    }

    public ObservableWindowTimed(ObservableSource<T> observableSource, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, long j12, int i10, boolean z10) {
        super(observableSource);
        this.timespan = j10;
        this.timeskip = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j12;
        this.bufferSize = i10;
        this.restartTimerOnMaxSize = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        long j10 = this.timespan;
        long j11 = this.timeskip;
        if (j10 != j11) {
            this.source.subscribe(new WindowSkipObserver(serializedObserver, j10, j11, this.unit, this.scheduler.createWorker(), this.bufferSize));
            return;
        }
        long j12 = this.maxSize;
        if (j12 == Long.MAX_VALUE) {
            this.source.subscribe(new WindowExactUnboundedObserver(serializedObserver, this.timespan, this.unit, this.scheduler, this.bufferSize));
        } else {
            this.source.subscribe(new WindowExactBoundedObserver(serializedObserver, j10, this.unit, this.scheduler, this.bufferSize, j12, this.restartTimerOnMaxSize));
        }
    }
}
