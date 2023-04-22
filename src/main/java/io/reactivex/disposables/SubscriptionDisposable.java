package io.reactivex.disposables;

import df.d;
import io.reactivex.annotations.NonNull;

/* loaded from: classes2.dex */
final class SubscriptionDisposable extends ReferenceDisposable<d> {
    private static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(d dVar) {
        super(dVar);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull d dVar) {
        dVar.cancel();
    }
}
