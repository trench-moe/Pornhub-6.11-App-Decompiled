package io.reactivex.internal.subscriptions;

import df.d;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class SubscriptionArbiter extends AtomicInteger implements d {
    private static final long serialVersionUID = -2189523197179400958L;
    public d actual;
    public final boolean cancelOnReplace;
    public volatile boolean cancelled;
    public long requested;
    public boolean unbounded;
    public final AtomicReference<d> missedSubscription = new AtomicReference<>();
    public final AtomicLong missedRequested = new AtomicLong();
    public final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z10) {
        this.cancelOnReplace = z10;
    }

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    final void drainLoop() {
        int i10 = 1;
        d dVar = null;
        long j10 = 0;
        do {
            d dVar2 = this.missedSubscription.get();
            if (dVar2 != null) {
                dVar2 = this.missedSubscription.getAndSet(null);
            }
            long j11 = this.missedRequested.get();
            if (j11 != 0) {
                j11 = this.missedRequested.getAndSet(0L);
            }
            long j12 = this.missedProduced.get();
            if (j12 != 0) {
                j12 = this.missedProduced.getAndSet(0L);
            }
            d dVar3 = this.actual;
            if (this.cancelled) {
                if (dVar3 != null) {
                    dVar3.cancel();
                    this.actual = null;
                }
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else {
                long j13 = this.requested;
                if (j13 != Long.MAX_VALUE) {
                    j13 = BackpressureHelper.addCap(j13, j11);
                    if (j13 != Long.MAX_VALUE) {
                        j13 -= j12;
                        if (j13 < 0) {
                            SubscriptionHelper.reportMoreProduced(j13);
                            j13 = 0;
                        }
                    }
                    this.requested = j13;
                }
                if (dVar2 != null) {
                    if (dVar3 != null && this.cancelOnReplace) {
                        dVar3.cancel();
                    }
                    this.actual = dVar2;
                    if (j13 != 0) {
                        j10 = BackpressureHelper.addCap(j10, j13);
                        dVar = dVar2;
                    }
                } else if (dVar3 != null && j11 != 0) {
                    j10 = BackpressureHelper.addCap(j10, j11);
                    dVar = dVar3;
                }
            }
            i10 = addAndGet(-i10);
        } while (i10 != 0);
        if (j10 != 0) {
            dVar.request(j10);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j10) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedProduced, j10);
            drain();
            return;
        }
        long j11 = this.requested;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                SubscriptionHelper.reportMoreProduced(j12);
                j12 = 0;
            }
            this.requested = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    @Override // df.d
    public final void request(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            if (this.unbounded) {
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                long j11 = this.requested;
                if (j11 != Long.MAX_VALUE) {
                    long addCap = BackpressureHelper.addCap(j11, j10);
                    this.requested = addCap;
                    if (addCap == Long.MAX_VALUE) {
                        this.unbounded = true;
                    }
                }
                d dVar = this.actual;
                if (decrementAndGet() != 0) {
                    drainLoop();
                }
                if (dVar != null) {
                    dVar.request(j10);
                }
                return;
            }
            BackpressureHelper.add(this.missedRequested, j10);
            drain();
        }
    }

    public final void setSubscription(d dVar) {
        if (this.cancelled) {
            dVar.cancel();
            return;
        }
        ObjectHelper.requireNonNull(dVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            d andSet = this.missedSubscription.getAndSet(dVar);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        d dVar2 = this.actual;
        if (dVar2 != null && this.cancelOnReplace) {
            dVar2.cancel();
        }
        this.actual = dVar;
        long j10 = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j10 != 0) {
            dVar.request(j10);
        }
    }
}
