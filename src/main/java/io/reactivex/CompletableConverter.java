package io.reactivex;

import io.reactivex.annotations.NonNull;

/* loaded from: classes2.dex */
public interface CompletableConverter<R> {
    @NonNull
    R apply(@NonNull Completable completable);
}
