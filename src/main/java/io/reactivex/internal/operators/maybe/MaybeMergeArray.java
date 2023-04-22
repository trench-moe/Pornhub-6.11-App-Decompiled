package io.reactivex.internal.operators.maybe;

import df.c;
import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class MaybeMergeArray<T> extends Flowable<T> {
    public final MaybeSource<? extends T>[] sources;

    /* loaded from: classes2.dex */
    public static final class ClqSimpleQueue<T> extends ConcurrentLinkedQueue<T> implements SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -4025173261791142821L;
        public int consumerIndex;
        public final AtomicInteger producerIndex = new AtomicInteger();

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int consumerIndex() {
            return this.consumerIndex;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public void drop() {
            poll();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t2) {
            this.producerIndex.getAndIncrement();
            return super.offer(t2);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t2, T t8) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T t2 = (T) super.poll();
            if (t2 != null) {
                this.consumerIndex++;
            }
            return t2;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int producerIndex() {
            return this.producerIndex.get();
        }
    }

    /* loaded from: classes2.dex */
    public static final class MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = -660395290758764731L;
        public volatile boolean cancelled;
        public long consumed;
        public final c<? super T> downstream;
        public boolean outputFused;
        public final SimpleQueueWithConsumerIndex<Object> queue;
        public final int sourceCount;
        public final CompositeDisposable set = new CompositeDisposable();
        public final AtomicLong requested = new AtomicLong();
        public final AtomicThrowable error = new AtomicThrowable();

        public MergeMaybeObserver(c<? super T> cVar, int i10, SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex) {
            this.downstream = cVar;
            this.sourceCount = i10;
            this.queue = simpleQueueWithConsumerIndex;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.set.dispose();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void drainFused() {
            c<? super T> cVar = this.downstream;
            SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex = this.queue;
            int i10 = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    simpleQueueWithConsumerIndex.clear();
                    cVar.onError(th);
                    return;
                }
                boolean z10 = simpleQueueWithConsumerIndex.producerIndex() == this.sourceCount;
                if (!simpleQueueWithConsumerIndex.isEmpty()) {
                    cVar.onNext(null);
                }
                if (z10) {
                    cVar.onComplete();
                    return;
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
            simpleQueueWithConsumerIndex.clear();
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
            if (r7 != 0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
            if (r13.error.get() == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
            r1.clear();
            r0.onError(r13.error.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
            if (r1.peek() != io.reactivex.internal.util.NotificationLite.COMPLETE) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
            r1.drop();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
            if (r1.consumerIndex() != r13.sourceCount) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
            r0.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
            r13.consumed = r2;
            r4 = addAndGet(-r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drainNormal() {
            /*
                r13 = this;
                r10 = r13
                df.c<? super T> r0 = r10.downstream
                r12 = 7
                io.reactivex.internal.operators.maybe.MaybeMergeArray$SimpleQueueWithConsumerIndex<java.lang.Object> r1 = r10.queue
                long r2 = r10.consumed
                r4 = 1
                r12 = 6
            La:
                java.util.concurrent.atomic.AtomicLong r5 = r10.requested
                long r5 = r5.get()
            L10:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L5e
                r12 = 7
                boolean r8 = r10.cancelled
                if (r8 == 0) goto L1d
                r1.clear()
                return
            L1d:
                r12 = 3
                io.reactivex.internal.util.AtomicThrowable r8 = r10.error
                java.lang.Object r12 = r8.get()
                r8 = r12
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                if (r8 == 0) goto L39
                r1.clear()
                r12 = 7
                io.reactivex.internal.util.AtomicThrowable r1 = r10.error
                r12 = 2
                java.lang.Throwable r12 = r1.terminate()
                r1 = r12
                r0.onError(r1)
                return
            L39:
                r12 = 3
                int r8 = r1.consumerIndex()
                int r9 = r10.sourceCount
                if (r8 != r9) goto L47
                r0.onComplete()
                r12 = 1
                return
            L47:
                r12 = 6
                java.lang.Object r12 = r1.poll()
                r8 = r12
                if (r8 != 0) goto L51
                r12 = 2
                goto L5e
            L51:
                r12 = 1
                io.reactivex.internal.util.NotificationLite r7 = io.reactivex.internal.util.NotificationLite.COMPLETE
                if (r8 == r7) goto L10
                r12 = 7
                r0.onNext(r8)
                r7 = 1
                long r2 = r2 + r7
                goto L10
            L5e:
                if (r7 != 0) goto L97
                r12 = 7
                io.reactivex.internal.util.AtomicThrowable r5 = r10.error
                java.lang.Object r5 = r5.get()
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 == 0) goto L7b
                r12 = 1
                r1.clear()
                io.reactivex.internal.util.AtomicThrowable r1 = r10.error
                r12 = 6
                java.lang.Throwable r12 = r1.terminate()
                r1 = r12
                r0.onError(r1)
                return
            L7b:
                java.lang.Object r5 = r1.peek()
                io.reactivex.internal.util.NotificationLite r6 = io.reactivex.internal.util.NotificationLite.COMPLETE
                r12 = 7
                if (r5 != r6) goto L89
                r1.drop()
                r12 = 5
                goto L7b
            L89:
                int r5 = r1.consumerIndex()
                int r6 = r10.sourceCount
                r12 = 2
                if (r5 != r6) goto L97
                r0.onComplete()
                r12 = 3
                return
            L97:
                r10.consumed = r2
                int r4 = -r4
                r12 = 3
                int r4 = r10.addAndGet(r4)
                if (r4 != 0) goto La
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.maybe.MaybeMergeArray.MergeMaybeObserver.drainNormal():void");
        }

        public boolean isCancelled() {
            return this.cancelled;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.queue.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.set.dispose();
            this.queue.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.set.add(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t2) {
            this.queue.offer(t2);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T t2;
            do {
                t2 = (T) this.queue.poll();
            } while (t2 == NotificationLite.COMPLETE);
            return t2;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class MpscFillOnceSimpleQueue<T> extends AtomicReferenceArray<T> implements SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -7969063454040569579L;
        public int consumerIndex;
        public final AtomicInteger producerIndex;

        public MpscFillOnceSimpleQueue(int i10) {
            super(i10);
            this.producerIndex = new AtomicInteger();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int consumerIndex() {
            return this.consumerIndex;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public void drop() {
            int i10 = this.consumerIndex;
            lazySet(i10, null);
            this.consumerIndex = i10 + 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.consumerIndex == producerIndex();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t2) {
            ObjectHelper.requireNonNull(t2, "value is null");
            int andIncrement = this.producerIndex.getAndIncrement();
            if (andIncrement < length()) {
                lazySet(andIncrement, t2);
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t2, T t8) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public T peek() {
            int i10 = this.consumerIndex;
            if (i10 == length()) {
                return null;
            }
            return get(i10);
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            int i10 = this.consumerIndex;
            if (i10 == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.producerIndex;
            do {
                T t2 = get(i10);
                if (t2 != null) {
                    this.consumerIndex = i10 + 1;
                    lazySet(i10, null);
                    return t2;
                }
            } while (atomicInteger.get() != i10);
            return null;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public int producerIndex() {
            return this.producerIndex.get();
        }
    }

    /* loaded from: classes2.dex */
    public interface SimpleQueueWithConsumerIndex<T> extends SimpleQueue<T> {
        int consumerIndex();

        void drop();

        T peek();

        @Override // java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        T poll();

        int producerIndex();
    }

    public MaybeMergeArray(MaybeSource<? extends T>[] maybeSourceArr) {
        this.sources = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        MaybeSource[] maybeSourceArr = this.sources;
        int length = maybeSourceArr.length;
        MergeMaybeObserver mergeMaybeObserver = new MergeMaybeObserver(cVar, length, length <= Flowable.bufferSize() ? new MpscFillOnceSimpleQueue(length) : new ClqSimpleQueue());
        cVar.onSubscribe(mergeMaybeObserver);
        AtomicThrowable atomicThrowable = mergeMaybeObserver.error;
        for (MaybeSource maybeSource : maybeSourceArr) {
            if (!mergeMaybeObserver.isCancelled() && atomicThrowable.get() == null) {
                maybeSource.subscribe(mergeMaybeObserver);
            }
            return;
        }
    }
}
