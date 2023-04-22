package io.reactivex.internal.operators.maybe;

import df.b;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;

/* loaded from: classes2.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, b<Object>> {
    INSTANCE;

    public static <T> Function<MaybeSource<T>, b<T>> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public b<Object> apply(MaybeSource<Object> maybeSource) {
        return new MaybeToFlowable(maybeSource);
    }
}
