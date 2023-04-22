package io.reactivex.internal.subscriptions;

import df.d;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<d> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i10) {
        super(i10);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        d andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                d dVar = get(i10);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (dVar != subscriptionHelper && (andSet = getAndSet(i10, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public d replaceResource(int i10, d dVar) {
        d dVar2;
        do {
            dVar2 = get(i10);
            if (dVar2 == SubscriptionHelper.CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return null;
            }
        } while (!compareAndSet(i10, dVar2, dVar));
        return dVar2;
    }

    public boolean setResource(int i10, d dVar) {
        d dVar2;
        do {
            dVar2 = get(i10);
            if (dVar2 == SubscriptionHelper.CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return false;
            }
        } while (!compareAndSet(i10, dVar2, dVar));
        if (dVar2 != null) {
            dVar2.cancel();
        }
        return true;
    }
}
