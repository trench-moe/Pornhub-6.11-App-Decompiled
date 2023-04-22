package io.reactivex.disposables;

import a1.a;
import io.reactivex.annotations.NonNull;

/* loaded from: classes2.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        StringBuilder m10 = a.m("RunnableDisposable(disposed=");
        m10.append(isDisposed());
        m10.append(", ");
        m10.append(get());
        m10.append(")");
        return m10.toString();
    }
}
