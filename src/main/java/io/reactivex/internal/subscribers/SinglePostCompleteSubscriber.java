package io.reactivex.internal.subscribers;

import df.c;
import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, d {
    public static final long COMPLETE_MASK = Long.MIN_VALUE;
    public static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    public final c<? super R> downstream;
    public long produced;
    public d upstream;
    public R value;

    public SinglePostCompleteSubscriber(c<? super R> cVar) {
        this.downstream = cVar;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r10) {
        long j10 = this.produced;
        if (j10 != 0) {
            BackpressureHelper.produced(this, j10);
        }
        while (true) {
            long j11 = get();
            if ((j11 & Long.MIN_VALUE) != 0) {
                onDrop(r10);
                return;
            } else if ((j11 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r10);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r10;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                }
                this.value = null;
            }
        }
    }

    public abstract /* synthetic */ void onComplete();

    public void onDrop(R r10) {
    }

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(T t2);

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // df.d
    public final void request(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            while (true) {
                long j11 = get();
                if ((j11 & Long.MIN_VALUE) == 0) {
                    if (compareAndSet(j11, BackpressureHelper.addCap(j11, j10))) {
                        this.upstream.request(j10);
                        break;
                    }
                } else if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                    this.downstream.onNext((R) this.value);
                    this.downstream.onComplete();
                    return;
                }
            }
        }
    }
}
