package io.reactivex.internal.observers;

import df.c;
import df.d;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes2.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, d {
    public final c<? super T> subscriber;
    public Disposable upstream;

    public SubscriberCompletableObserver(c<? super T> cVar) {
        this.subscriber = cVar;
    }

    @Override // df.d
    public void cancel() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        this.subscriber.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        this.subscriber.onError(th);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.subscriber.onSubscribe(this);
        }
    }

    @Override // df.d
    public void request(long j10) {
    }
}
