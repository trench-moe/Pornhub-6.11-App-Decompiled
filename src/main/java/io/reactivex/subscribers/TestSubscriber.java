package io.reactivex.subscribers;

import a0.a;
import df.c;
import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, d {
    private volatile boolean cancelled;
    private final c<? super T> downstream;
    private final AtomicLong missedRequested;
    private QueueSubscription<T> qs;
    private final AtomicReference<d> upstream;

    /* loaded from: classes2.dex */
    public enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
        }
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public TestSubscriber(long j10) {
        this(EmptySubscriber.INSTANCE, j10);
    }

    public TestSubscriber(c<? super T> cVar) {
        this(cVar, Long.MAX_VALUE);
    }

    public TestSubscriber(c<? super T> cVar, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Negative initial request not allowed");
        }
        this.downstream = cVar;
        this.upstream = new AtomicReference<>();
        this.missedRequested = new AtomicLong(j10);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    public static <T> TestSubscriber<T> create(long j10) {
        return new TestSubscriber<>(j10);
    }

    public static <T> TestSubscriber<T> create(c<? super T> cVar) {
        return new TestSubscriber<>(cVar);
    }

    public static String fusionModeToString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? a.k("Unknown(", i10, ")") : "ASYNC" : "SYNC" : "NONE";
    }

    public final TestSubscriber<T> assertFuseable() {
        if (this.qs != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    public final TestSubscriber<T> assertFusionMode(int i10) {
        int i11 = this.establishedFusionMode;
        if (i11 != i10) {
            if (this.qs != null) {
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

    public final TestSubscriber<T> assertNotFuseable() {
        if (this.qs == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertNotSubscribed() {
        if (this.upstream.get() == null) {
            if (this.errors.isEmpty()) {
                return this;
            }
            throw fail("Not subscribed but errors found");
        }
        throw fail("Subscribed!");
    }

    public final TestSubscriber<T> assertOf(Consumer<? super TestSubscriber<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    @Override // df.d
    public final void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
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
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onError(Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.errors.add(th);
            if (th == null) {
                this.errors.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.downstream.onError(th);
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
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
                T poll = this.qs.poll();
                if (poll == null) {
                    return;
                }
                this.values.add(poll);
            } catch (Throwable th) {
                this.errors.add(th);
                this.qs.cancel();
                return;
            }
        }
    }

    public void onStart() {
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onSubscribe(d dVar) {
        this.lastThread = Thread.currentThread();
        if (dVar == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.upstream.compareAndSet(null, dVar)) {
            dVar.cancel();
            if (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + dVar));
            }
        } else {
            int i10 = this.initialFusionMode;
            if (i10 != 0 && (dVar instanceof QueueSubscription)) {
                QueueSubscription<T> queueSubscription = (QueueSubscription) dVar;
                this.qs = queueSubscription;
                int requestFusion = queueSubscription.requestFusion(i10);
                this.establishedFusionMode = requestFusion;
                if (requestFusion == 1) {
                    this.checkSubscriptionOnce = true;
                    this.lastThread = Thread.currentThread();
                    while (true) {
                        try {
                            T poll = this.qs.poll();
                            if (poll == null) {
                                this.completions++;
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
            this.downstream.onSubscribe(dVar);
            long andSet = this.missedRequested.getAndSet(0L);
            if (andSet != 0) {
                dVar.request(andSet);
            }
            onStart();
        }
    }

    @Override // df.d
    public final void request(long j10) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j10);
    }

    public final TestSubscriber<T> requestMore(long j10) {
        request(j10);
        return this;
    }

    public final TestSubscriber<T> setInitialFusionMode(int i10) {
        this.initialFusionMode = i10;
        return this;
    }
}
