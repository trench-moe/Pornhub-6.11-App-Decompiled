package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    /* loaded from: classes2.dex */
    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 163080509307634843L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final c<? super T> downstream;
        public Throwable error;
        public d upstream;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<T> current = new AtomicReference<>();

        public BackpressureLatestSubscriber(c<? super T> cVar) {
            this.downstream = cVar;
        }

        @Override // df.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.current.lazySet(null);
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, c<?> cVar, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z10) {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
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
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            c<? super T> cVar = this.downstream;
            AtomicLong atomicLong = this.requested;
            AtomicReference<T> atomicReference = this.current;
            int i10 = 1;
            do {
                long j10 = 0;
                while (true) {
                    z10 = false;
                    if (j10 == atomicLong.get()) {
                        break;
                    }
                    boolean z11 = this.done;
                    Object obj = (T) atomicReference.getAndSet(null);
                    boolean z12 = obj == null;
                    if (checkTerminated(z11, z12, cVar, atomicReference)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    cVar.onNext(obj);
                    j10++;
                }
                if (j10 == atomicLong.get()) {
                    boolean z13 = this.done;
                    if (atomicReference.get() == null) {
                        z10 = true;
                    }
                    if (checkTerminated(z13, z10, cVar, atomicReference)) {
                        return;
                    }
                }
                if (j10 != 0) {
                    BackpressureHelper.produced(atomicLong, j10);
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.current.lazySet(t2);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
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

    public FlowableOnBackpressureLatest(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(cVar));
    }
}
