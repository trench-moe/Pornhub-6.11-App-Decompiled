package io.reactivex;

import df.b;
import io.reactivex.annotations.NonNull;

/* loaded from: classes2.dex */
public interface FlowableTransformer<Upstream, Downstream> {
    @NonNull
    b<Downstream> apply(@NonNull Flowable<Upstream> flowable);
}
