package io.reactivex;

import df.c;
import io.reactivex.annotations.NonNull;

/* loaded from: classes2.dex */
public interface FlowableOperator<Downstream, Upstream> {
    @NonNull
    c<? super Upstream> apply(@NonNull c<? super Downstream> cVar);
}
