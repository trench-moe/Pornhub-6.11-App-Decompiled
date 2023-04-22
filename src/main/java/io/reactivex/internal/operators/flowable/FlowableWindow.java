package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    public final int bufferSize;
    public final long size;
    public final long skip;

    /* loaded from: classes2.dex */
    public static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        public final int bufferSize;
        public final c<? super Flowable<T>> downstream;
        public long index;
        public final AtomicBoolean once;
        public final long size;
        public d upstream;
        public UnicastProcessor<T> window;

        public WindowExactSubscriber(c<? super Flowable<T>> cVar, long j10, int i10) {
            super(1);
            this.downstream = cVar;
            this.size = j10;
            this.once = new AtomicBoolean();
            this.bufferSize = i10;
        }

        @Override // df.d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            long j10 = this.index;
            UnicastProcessor<T> unicastProcessor = this.window;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessor = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessor;
                this.downstream.onNext(unicastProcessor);
            }
            long j11 = j10 + 1;
            unicastProcessor.onNext(t2);
            if (j11 != this.size) {
                this.index = j11;
                return;
            }
            this.index = 0L;
            this.window = null;
            unicastProcessor.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.upstream.request(BackpressureHelper.multiplyCap(this.size, j10));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final c<? super Flowable<T>> downstream;
        public Throwable error;
        public final AtomicBoolean firstRequest;
        public long index;
        public final AtomicBoolean once;
        public long produced;
        public final SpscLinkedArrayQueue<UnicastProcessor<T>> queue;
        public final AtomicLong requested;
        public final long size;
        public final long skip;
        public d upstream;
        public final ArrayDeque<UnicastProcessor<T>> windows;
        public final AtomicInteger wip;

        public WindowOverlapSubscriber(c<? super Flowable<T>> cVar, long j10, long j11, int i10) {
            super(1);
            this.downstream = cVar;
            this.size = j10;
            this.skip = j11;
            this.queue = new SpscLinkedArrayQueue<>(i10);
            this.windows = new ArrayDeque<>();
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.requested = new AtomicLong();
            this.wip = new AtomicInteger();
            this.bufferSize = i10;
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, c<?> cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (z10) {
                Throwable th = this.error;
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th);
                    return true;
                } else if (z11) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }

        public void drain() {
            int i10;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            c<? super Flowable<T>> cVar = this.downstream;
            SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.queue;
            int i11 = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (true) {
                    i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
                    if (i10 == 0) {
                        break;
                    }
                    boolean z10 = this.done;
                    UnicastProcessor<T> poll = spscLinkedArrayQueue.poll();
                    boolean z11 = poll == null;
                    if (checkTerminated(z10, z11, cVar, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    cVar.onNext(poll);
                    j11++;
                }
                if (i10 == 0 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                i11 = this.wip.addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.windows.clear();
            this.error = th;
            this.done = true;
            drain();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
        @Override // io.reactivex.FlowableSubscriber, df.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onNext(T r12) {
            /*
                r11 = this;
                r8 = r11
                boolean r0 = r8.done
                if (r0 == 0) goto L7
                r10 = 6
                return
            L7:
                long r0 = r8.index
                r2 = 0
                r10 = 6
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L2e
                boolean r4 = r8.cancelled
                r10 = 1
                if (r4 != 0) goto L2e
                r10 = 2
                r8.getAndIncrement()
                int r4 = r8.bufferSize
                io.reactivex.processors.UnicastProcessor r4 = io.reactivex.processors.UnicastProcessor.create(r4, r8)
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r5 = r8.windows
                r10 = 3
                r5.offer(r4)
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.processors.UnicastProcessor<T>> r5 = r8.queue
                r10 = 7
                r5.offer(r4)
                r8.drain()
            L2e:
                r10 = 3
                r4 = 1
                long r0 = r0 + r4
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r6 = r8.windows
                java.util.Iterator r6 = r6.iterator()
            L38:
                boolean r10 = r6.hasNext()
                r7 = r10
                if (r7 == 0) goto L4a
                r10 = 6
                java.lang.Object r7 = r6.next()
                df.a r7 = (df.a) r7
                r7.onNext(r12)
                goto L38
            L4a:
                long r6 = r8.produced
                long r6 = r6 + r4
                long r4 = r8.size
                int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r12 != 0) goto L6d
                r10 = 2
                long r4 = r8.skip
                r10 = 1
                long r6 = r6 - r4
                r8.produced = r6
                r10 = 7
                java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> r12 = r8.windows
                r10 = 4
                java.lang.Object r10 = r12.poll()
                r12 = r10
                df.a r12 = (df.a) r12
                if (r12 == 0) goto L70
                r10 = 6
                r12.onComplete()
                r10 = 7
                goto L71
            L6d:
                r8.produced = r6
                r10 = 3
            L70:
                r10 = 5
            L71:
                long r4 = r8.skip
                r10 = 7
                int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                r10 = 4
                if (r12 != 0) goto L7c
                r8.index = r2
                goto L7f
            L7c:
                r8.index = r0
                r10 = 5
            L7f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindow.WindowOverlapSubscriber.onNext(java.lang.Object):void");
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j10));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j10 - 1)));
                }
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        public final int bufferSize;
        public final c<? super Flowable<T>> downstream;
        public final AtomicBoolean firstRequest;
        public long index;
        public final AtomicBoolean once;
        public final long size;
        public final long skip;
        public d upstream;
        public UnicastProcessor<T> window;

        public WindowSkipSubscriber(c<? super Flowable<T>> cVar, long j10, long j11, int i10) {
            super(1);
            this.downstream = cVar;
            this.size = j10;
            this.skip = j11;
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.bufferSize = i10;
        }

        @Override // df.d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            long j10 = this.index;
            UnicastProcessor<T> unicastProcessor = this.window;
            if (j10 == 0) {
                getAndIncrement();
                unicastProcessor = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessor;
                this.downstream.onNext(unicastProcessor);
            }
            long j11 = j10 + 1;
            if (unicastProcessor != null) {
                unicastProcessor.onNext(t2);
            }
            if (j11 == this.size) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            if (j11 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j11;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                if (!this.firstRequest.get() && this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(this.size, j10), BackpressureHelper.multiplyCap(this.skip - this.size, j10 - 1)));
                    return;
                }
                this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j10));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public FlowableWindow(Flowable<T> flowable, long j10, long j11, int i10) {
        super(flowable);
        this.size = j10;
        this.skip = j11;
        this.bufferSize = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Flowable<T>> cVar) {
        long j10 = this.skip;
        long j11 = this.size;
        if (j10 == j11) {
            this.source.subscribe((FlowableSubscriber) new WindowExactSubscriber(cVar, this.size, this.bufferSize));
        } else if (j10 > j11) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(cVar, this.size, this.skip, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowOverlapSubscriber(cVar, this.size, this.skip, this.bufferSize));
        }
    }
}
