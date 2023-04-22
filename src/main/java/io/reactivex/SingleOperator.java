package io.reactivex;

import io.reactivex.annotations.NonNull;

/* loaded from: classes2.dex */
public interface SingleOperator<Downstream, Upstream> {
    @NonNull
    SingleObserver<? super Upstream> apply(@NonNull SingleObserver<? super Downstream> singleObserver);
}
