package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {
    public final Future<? extends T> future;
    public final long timeout;
    public final TimeUnit unit;

    public MaybeFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j10;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable empty = Disposables.empty();
        maybeObserver.onSubscribe(empty);
        if (!empty.isDisposed()) {
            try {
                long j10 = this.timeout;
                T t2 = j10 <= 0 ? (Object) this.future.get() : this.future.get(j10, this.unit);
                if (!empty.isDisposed()) {
                    if (t2 == null) {
                        maybeObserver.onComplete();
                    } else {
                        maybeObserver.onSuccess(t2);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (th instanceof ExecutionException) {
                    th = th.getCause();
                }
                Exceptions.throwIfFatal(th);
                if (!empty.isDisposed()) {
                    maybeObserver.onError(th);
                }
            }
        }
    }
}
