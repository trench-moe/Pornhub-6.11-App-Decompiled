package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/* loaded from: classes.dex */
public interface Observer<T> {
    void onComplete();

    void onError(@NonNull Throwable th);

    void onNext(@NonNull T t2);

    void onSubscribe(@NonNull Disposable disposable);
}
