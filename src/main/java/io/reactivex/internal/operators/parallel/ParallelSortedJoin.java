package io.reactivex.internal.operators.parallel;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {
    public final Comparator<? super T> comparator;
    public final ParallelFlowable<List<T>> source;

    /* loaded from: classes2.dex */
    public static final class SortedJoinInnerSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        public final int index;
        public final SortedJoinSubscription<T> parent;

        public SortedJoinInnerSubscriber(SortedJoinSubscription<T> sortedJoinSubscription, int i10) {
            this.parent = sortedJoinSubscription;
            this.index = i10;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            onNext((List) ((List) obj));
        }

        public void onNext(List<T> list) {
            this.parent.innerNext(list, this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SortedJoinSubscription<T> extends AtomicInteger implements d {
        private static final long serialVersionUID = 3481980673745556697L;
        public volatile boolean cancelled;
        public final Comparator<? super T> comparator;
        public final c<? super T> downstream;
        public final int[] indexes;
        public final List<T>[] lists;
        public final SortedJoinInnerSubscriber<T>[] subscribers;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicInteger remaining = new AtomicInteger();
        public final AtomicReference<Throwable> error = new AtomicReference<>();

        public SortedJoinSubscription(c<? super T> cVar, int i10, Comparator<? super T> comparator) {
            this.downstream = cVar;
            this.comparator = comparator;
            SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new SortedJoinInnerSubscriber[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                sortedJoinInnerSubscriberArr[i11] = new SortedJoinInnerSubscriber<>(this, i11);
            }
            this.subscribers = sortedJoinInnerSubscriberArr;
            this.lists = new List[i10];
            this.indexes = new int[i10];
            this.remaining.lazySet(i10);
        }

        @Override // df.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    Arrays.fill(this.lists, (Object) null);
                }
            }
        }

        public void cancelAll() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.subscribers) {
                sortedJoinInnerSubscriber.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
            if (r15 != 0) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
            if (r16.cancelled == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
            java.util.Arrays.fill(r3, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
            r10 = r16.error.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
            if (r10 == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
            cancelAll();
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onError(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00cb, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00cd, code lost:
            if (r5 >= r4) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
            if (r0[r5] == r3[r5].size()) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
            r13 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00de, code lost:
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
            if (r13 == false) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00e2, code lost:
            java.util.Arrays.fill(r3, (java.lang.Object) null);
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00ea, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
            if (r11 == 0) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00f8, code lost:
            if (r7 == Long.MAX_VALUE) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00fa, code lost:
            r16.requested.addAndGet(-r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0100, code lost:
            r5 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0104, code lost:
            if (r5 != r6) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0106, code lost:
            r5 = addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x010b, code lost:
            if (r5 != 0) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x010d, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instructions count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription.drain():void");
        }

        public void innerError(Throwable th) {
            if (this.error.compareAndSet(null, th)) {
                drain();
            } else if (th != this.error.get()) {
                RxJavaPlugins.onError(th);
            }
        }

        public void innerNext(List<T> list, int i10) {
            this.lists[i10] = list;
            if (this.remaining.decrementAndGet() == 0) {
                drain();
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                if (this.remaining.get() == 0) {
                    drain();
                }
            }
        }
    }

    public ParallelSortedJoin(ParallelFlowable<List<T>> parallelFlowable, Comparator<? super T> comparator) {
        this.source = parallelFlowable;
        this.comparator = comparator;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        SortedJoinSubscription sortedJoinSubscription = new SortedJoinSubscription(cVar, this.source.parallelism(), this.comparator);
        cVar.onSubscribe(sortedJoinSubscription);
        this.source.subscribe(sortedJoinSubscription.subscribers);
    }
}
