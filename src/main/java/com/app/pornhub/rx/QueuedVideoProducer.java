package com.app.pornhub.rx;

import io.reactivex.ObservableEmitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import t3.m;

/* loaded from: classes.dex */
public final class QueuedVideoProducer<T> extends AtomicLong implements Observer<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4912c = new Object();
    private static final long serialVersionUID = 7277121710709137533L;
    private final ObservableEmitter<? super T> child;
    private volatile boolean done;
    private Throwable error;
    private final Queue<Object> queue;
    private final AtomicInteger wip;

    public QueuedVideoProducer(ObservableEmitter<? super T> observableEmitter) {
        m mVar = new m();
        this.child = observableEmitter;
        this.queue = mVar;
        this.wip = new AtomicInteger();
    }

    public final boolean a(boolean z10, boolean z11) {
        if (this.child.isDisposed()) {
            return true;
        }
        if (z10) {
            Throwable th = this.error;
            if (th != null) {
                this.queue.clear();
                this.child.onError(th);
                return true;
            } else if (z11) {
                this.child.onComplete();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (this.wip.getAndIncrement() == 0) {
            ObservableEmitter<? super T> observableEmitter = this.child;
            Queue<Object> queue = this.queue;
            while (!a(this.done, queue.isEmpty())) {
                this.wip.lazySet(1);
                long j10 = get();
                long j11 = 0;
                while (j10 != 0) {
                    boolean z10 = this.done;
                    Object poll = queue.poll();
                    if (a(z10, poll == null)) {
                        return;
                    }
                    if (poll == null) {
                        break;
                    }
                    try {
                        if (poll == f4912c) {
                            observableEmitter.onNext(null);
                        } else {
                            observableEmitter.onNext(poll);
                        }
                        j10--;
                        j11++;
                    } catch (Throwable th) {
                        Exceptions.propagate(th);
                        return;
                    }
                }
                if (j11 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j11);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public boolean c(T t2) {
        if (t2 == null) {
            if (!this.queue.offer(f4912c)) {
                return false;
            }
        } else if (!this.queue.offer(t2)) {
            return false;
        }
        b();
        return true;
    }

    public void d(long j10) {
        long j11;
        long j12;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (i10 > 0) {
            do {
                j11 = get();
                j12 = j11 + j10;
                if (j12 < 0) {
                    j12 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j11, j12));
            b();
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.done = true;
        b();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        b();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t2) {
        if (!c(t2)) {
            this.error = new MissingBackpressureException();
            this.done = true;
            b();
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
    }
}
