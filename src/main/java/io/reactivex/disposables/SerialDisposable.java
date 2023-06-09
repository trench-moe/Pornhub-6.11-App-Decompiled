package io.reactivex.disposables;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class SerialDisposable implements Disposable {
    public final AtomicReference<Disposable> resource;

    public SerialDisposable() {
        this.resource = new AtomicReference<>();
    }

    public SerialDisposable(@Nullable Disposable disposable) {
        this.resource = new AtomicReference<>(disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this.resource);
    }

    @Nullable
    public Disposable get() {
        Disposable disposable = this.resource.get();
        if (disposable == DisposableHelper.DISPOSED) {
            disposable = Disposables.disposed();
        }
        return disposable;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.resource.get());
    }

    public boolean replace(@Nullable Disposable disposable) {
        return DisposableHelper.replace(this.resource, disposable);
    }

    public boolean set(@Nullable Disposable disposable) {
        return DisposableHelper.set(this.resource, disposable);
    }
}
