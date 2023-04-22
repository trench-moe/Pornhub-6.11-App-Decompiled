package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final int bufferSize;
    public final boolean delayErrors;
    public final Function<? super T, ? extends b<? extends R>> mapper;

    /* loaded from: classes2.dex */
    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<d> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;
        public final long index;
        public final SwitchMapSubscriber<T, R> parent;
        public volatile SimpleQueue<R> queue;

        public SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j10, int i10) {
            this.parent = switchMapSubscriber;
            this.index = j10;
            this.bufferSize = i10;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index != switchMapSubscriber.unique || !switchMapSubscriber.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!switchMapSubscriber.delayErrors) {
                switchMapSubscriber.upstream.cancel();
                switchMapSubscriber.done = true;
            }
            this.done = true;
            switchMapSubscriber.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(R r10) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode == 0 && !this.queue.offer(r10)) {
                    onError(new MissingBackpressureException("Queue full?!"));
                    return;
                }
                switchMapSubscriber.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        dVar.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                dVar.request(this.bufferSize);
            }
        }

        public void request(long j10) {
            if (this.fusionMode != 1) {
                get().request(j10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        public static final SwitchMapInnerSubscriber<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final c<? super R> downstream;
        public final Function<? super T, ? extends b<? extends R>> mapper;
        public volatile long unique;
        public d upstream;
        public final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();
        public final AtomicThrowable error = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1L, 1);
            CANCELLED = switchMapInnerSubscriber;
            switchMapInnerSubscriber.cancel();
        }

        public SwitchMapSubscriber(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function, int i10, boolean z10) {
            this.downstream = cVar;
            this.mapper = function;
            this.bufferSize = i10;
            this.delayErrors = z10;
        }

        @Override // df.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void disposeInner() {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber3 = CANCELLED;
            if (switchMapInnerSubscriber2 != switchMapInnerSubscriber3 && (switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.active.getAndSet(switchMapInnerSubscriber3)) != switchMapInnerSubscriber3 && switchMapInnerSubscriber != null) {
                switchMapInnerSubscriber.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:112:0x000d, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00e5, code lost:
            r14 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x011d, code lost:
            if (r12 == 0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0121, code lost:
            if (r17.cancelled != false) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x012a, code lost:
            if (r8 == Long.MAX_VALUE) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x012c, code lost:
            r17.requested.addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0132, code lost:
            r5.request(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0135, code lost:
            if (r14 == false) goto L77;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instructions count: 321
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber.drain():void");
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
            if (this.done || !this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (this.done) {
                return;
            }
            long j10 = this.unique + 1;
            this.unique = j10;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            if (switchMapInnerSubscriber2 != null) {
                switchMapInnerSubscriber2.cancel();
            }
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(t2), "The publisher returned is null");
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber3 = new SwitchMapInnerSubscriber<>(this, j10, this.bufferSize);
                do {
                    switchMapInnerSubscriber = this.active.get();
                    if (switchMapInnerSubscriber == CANCELLED) {
                        return;
                    }
                } while (!this.active.compareAndSet(switchMapInnerSubscriber, switchMapInnerSubscriber3));
                bVar.subscribe(switchMapInnerSubscriber3);
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
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                    return;
                }
                drain();
            }
        }
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends b<? extends R>> function, int i10, boolean z10) {
        super(flowable);
        this.mapper = function;
        this.bufferSize = i10;
        this.delayErrors = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new SwitchMapSubscriber(cVar, this.mapper, this.bufferSize, this.delayErrors));
    }
}
