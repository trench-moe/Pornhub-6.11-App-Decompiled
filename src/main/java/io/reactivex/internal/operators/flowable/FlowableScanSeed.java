package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final BiFunction<R, ? super T, R> accumulator;
    public final Callable<R> seedSupplier;

    /* loaded from: classes2.dex */
    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -1776795561228106469L;
        public final BiFunction<R, ? super T, R> accumulator;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final c<? super R> downstream;
        public Throwable error;
        public final int limit;
        public final int prefetch;
        public final SimplePlainQueue<R> queue;
        public final AtomicLong requested;
        public d upstream;
        public R value;

        public ScanSeedSubscriber(c<? super R> cVar, BiFunction<R, ? super T, R> biFunction, R r10, int i10) {
            this.downstream = cVar;
            this.accumulator = biFunction;
            this.value = r10;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i10);
            this.queue = spscArrayQueue;
            spscArrayQueue.offer(r10);
            this.requested = new AtomicLong();
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
            if (r13 != 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
            if (r18.done == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
            r7 = r18.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
            if (r7 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
            r2.clear();
            r1.onError(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
            if (r2.isEmpty() == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
            if (r11 == 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
            io.reactivex.internal.util.BackpressureHelper.produced(r18.requested, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
            r18.consumed = r4;
            r6 = addAndGet(-r6);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                r18 = this;
                r0 = r18
                int r1 = r18.getAndIncrement()
                if (r1 == 0) goto L9
                return
            L9:
                df.c<? super R> r1 = r0.downstream
                io.reactivex.internal.fuseable.SimplePlainQueue<R> r2 = r0.queue
                int r3 = r0.limit
                int r4 = r0.consumed
                r5 = 0
                r5 = 1
                r6 = 6
                r6 = 1
            L15:
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r7 = r7.get()
                r9 = 0
                r11 = r9
            L1e:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto L66
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L2a
                r2.clear()
                return
            L2a:
                boolean r14 = r0.done
                if (r14 == 0) goto L39
                java.lang.Throwable r15 = r0.error
                if (r15 == 0) goto L39
                r2.clear()
                r1.onError(r15)
                return
            L39:
                java.lang.Object r15 = r2.poll()
                r16 = 0
                if (r15 != 0) goto L44
                r17 = 1
                goto L48
            L44:
                r17 = 27900(0x6cfc, float:3.9096E-41)
                r17 = 0
            L48:
                if (r14 == 0) goto L50
                if (r17 == 0) goto L50
                r1.onComplete()
                return
            L50:
                if (r17 == 0) goto L53
                goto L66
            L53:
                r1.onNext(r15)
                r13 = 1
                long r11 = r11 + r13
                int r4 = r4 + 1
                if (r4 != r3) goto L1e
                df.d r4 = r0.upstream
                long r13 = (long) r3
                r4.request(r13)
                r4 = 3
                r4 = 0
                goto L1e
            L66:
                if (r13 != 0) goto L81
                boolean r7 = r0.done
                if (r7 == 0) goto L81
                java.lang.Throwable r7 = r0.error
                if (r7 == 0) goto L77
                r2.clear()
                r1.onError(r7)
                return
            L77:
                boolean r7 = r2.isEmpty()
                if (r7 == 0) goto L81
                r1.onComplete()
                return
            L81:
                int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r7 == 0) goto L8a
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r7, r11)
            L8a:
                r0.consumed = r4
                int r6 = -r6
                int r6 = r0.addAndGet(r6)
                if (r6 != 0) goto L15
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableScanSeed.ScanSeedSubscriber.drain():void");
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            try {
                R r10 = (R) ObjectHelper.requireNonNull(this.accumulator.apply(this.value, t2), "The accumulator returned a null value");
                this.value = r10;
                this.queue.offer(r10);
                drain();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch - 1);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public FlowableScanSeed(Flowable<T> flowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.accumulator = biFunction;
        this.seedSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        try {
            this.source.subscribe((FlowableSubscriber) new ScanSeedSubscriber(cVar, this.accumulator, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seed supplied is null"), Flowable.bufferSize()));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
