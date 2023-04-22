package io.reactivex.observers;

import a0.a;
import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {
    private final Observer<? super T> downstream;

    /* renamed from: qd  reason: collision with root package name */
    private QueueDisposable<T> f10790qd;
    private final AtomicReference<Disposable> upstream;

    /* loaded from: classes2.dex */
    public enum EmptyObserver implements Observer<Object> {
        INSTANCE;

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    public TestObserver(Observer<? super T> observer) {
        this.upstream = new AtomicReference<>();
        this.downstream = observer;
    }

    public static <T> TestObserver<T> create() {
        return new TestObserver<>();
    }

    public static <T> TestObserver<T> create(Observer<? super T> observer) {
        return new TestObserver<>(observer);
    }

    public static String fusionModeToString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? a.k("Unknown(", i10, ")") : "ASYNC" : "SYNC" : "NONE";
    }

    public final TestObserver<T> assertFuseable() {
        if (this.f10790qd != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final TestObserver<T> assertFusionMode(int i10) {
        int i11 = this.establishedFusionMode;
        if (i11 != i10) {
            if (this.f10790qd != null) {
                StringBuilder m10 = a1.a.m("Fusion mode different. Expected: ");
                m10.append(fusionModeToString(i10));
                m10.append(", actual: ");
                m10.append(fusionModeToString(i11));
                throw new AssertionError(m10.toString());
            }
            throw fail("Upstream is not fuseable");
        }
        return this;
    }

    public final TestObserver<T> assertNotFuseable() {
        if (this.f10790qd == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestObserver<T> assertNotSubscribed() {
        if (this.upstream.get() == null) {
            if (this.errors.isEmpty()) {
                return this;
            }
            throw fail("Not subscribed but errors found");
        }
        throw fail("Subscribed!");
    }

    public final TestObserver<T> assertOf(Consumer<? super TestObserver<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestObserver<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    public final boolean isCancelled() {
        return isDisposed();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.downstream.onComplete();
            this.done.countDown();
        } catch (Throwable th) {
            this.done.countDown();
            throw th;
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            if (th == null) {
                this.errors.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.errors.add(th);
            }
            this.downstream.onError(th);
            this.done.countDown();
        } catch (Throwable th2) {
            this.done.countDown();
            throw th2;
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t2) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t2);
            if (t2 == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t2);
            return;
        }
        while (true) {
            try {
                T poll = this.f10790qd.poll();
                if (poll == null) {
                    break;
                }
                this.values.add(poll);
            } catch (Throwable th) {
                this.errors.add(th);
                this.f10790qd.dispose();
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        this.lastThread = Thread.currentThread();
        if (disposable == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.upstream.compareAndSet(null, disposable)) {
            disposable.dispose();
            if (this.upstream.get() != DisposableHelper.DISPOSED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
            }
        } else {
            int i10 = this.initialFusionMode;
            if (i10 != 0 && (disposable instanceof QueueDisposable)) {
                QueueDisposable<T> queueDisposable = (QueueDisposable) disposable;
                this.f10790qd = queueDisposable;
                int requestFusion = queueDisposable.requestFusion(i10);
                this.establishedFusionMode = requestFusion;
                if (requestFusion == 1) {
                    this.checkSubscriptionOnce = true;
                    this.lastThread = Thread.currentThread();
                    while (true) {
                        try {
                            T poll = this.f10790qd.poll();
                            if (poll == null) {
                                this.completions++;
                                this.upstream.lazySet(DisposableHelper.DISPOSED);
                                return;
                            }
                            this.values.add(poll);
                        } catch (Throwable th) {
                            this.errors.add(th);
                            return;
                        }
                    }
                }
            }
            this.downstream.onSubscribe(disposable);
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t2) {
        onNext(t2);
        onComplete();
    }

    public final TestObserver<T> setInitialFusionMode(int i10) {
        this.initialFusionMode = i10;
        return this;
    }
}
