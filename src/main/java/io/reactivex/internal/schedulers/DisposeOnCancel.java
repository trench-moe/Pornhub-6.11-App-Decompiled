package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class DisposeOnCancel implements Future<Object> {
    public final Disposable upstream;

    public DisposeOnCancel(Disposable disposable) {
        this.upstream = disposable;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        this.upstream.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }
}
