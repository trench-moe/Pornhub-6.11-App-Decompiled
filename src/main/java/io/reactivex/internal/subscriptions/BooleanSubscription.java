package io.reactivex.internal.subscriptions;

import a1.a;
import df.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class BooleanSubscription extends AtomicBoolean implements d {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // df.d
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // df.d
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        StringBuilder m10 = a.m("BooleanSubscription(cancelled=");
        m10.append(get());
        m10.append(")");
        return m10.toString();
    }
}
