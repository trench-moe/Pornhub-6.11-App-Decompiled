package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableRefCount<T> extends Flowable<T> {
    public RefConnection connection;
    public final int n;
    public final Scheduler scheduler;
    public final ConnectableFlowable<T> source;
    public final long timeout;
    public final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        public boolean connected;
        public boolean disconnectedEarly;
        public final FlowableRefCount<?> parent;
        public long subscriberCount;
        public Disposable timer;

        public RefConnection(FlowableRefCount<?> flowableRefCount) {
            this.parent = flowableRefCount;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((ResettableConnectable) this.parent.source).resetIf(disposable);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.timeout(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -7419642935409022375L;
        public final RefConnection connection;
        public final c<? super T> downstream;
        public final FlowableRefCount<T> parent;
        public d upstream;

        public RefCountSubscriber(c<? super T> cVar, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.downstream = cVar;
            this.parent = flowableRefCount;
            this.connection = refConnection;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
            if (compareAndSet(false, true)) {
                this.parent.cancel(this.connection);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.parent.terminated(this.connection);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // df.d
        public void request(long j10) {
            this.upstream.request(j10);
        }
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable) {
        this(connectableFlowable, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public FlowableRefCount(ConnectableFlowable<T> connectableFlowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.source = connectableFlowable;
        this.n = i10;
        this.timeout = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    public void cancel(RefConnection refConnection) {
        synchronized (this) {
            RefConnection refConnection2 = this.connection;
            if (refConnection2 != null && refConnection2 == refConnection) {
                long j10 = refConnection.subscriberCount - 1;
                refConnection.subscriberCount = j10;
                if (j10 == 0 && refConnection.connected) {
                    if (this.timeout == 0) {
                        timeout(refConnection);
                        return;
                    }
                    SequentialDisposable sequentialDisposable = new SequentialDisposable();
                    refConnection.timer = sequentialDisposable;
                    sequentialDisposable.replace(this.scheduler.scheduleDirect(refConnection, this.timeout, this.unit));
                }
            }
        }
    }

    public void clearTimer(RefConnection refConnection) {
        Disposable disposable = refConnection.timer;
        if (disposable != null) {
            disposable.dispose();
            refConnection.timer = null;
        }
    }

    public void reset(RefConnection refConnection) {
        ConnectableFlowable<T> connectableFlowable = this.source;
        if (connectableFlowable instanceof Disposable) {
            ((Disposable) connectableFlowable).dispose();
        } else if (connectableFlowable instanceof ResettableConnectable) {
            ((ResettableConnectable) connectableFlowable).resetIf(refConnection.get());
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        RefConnection refConnection;
        boolean z10;
        Disposable disposable;
        synchronized (this) {
            try {
                refConnection = this.connection;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.connection = refConnection;
                }
                long j10 = refConnection.subscriberCount;
                if (j10 == 0 && (disposable = refConnection.timer) != null) {
                    disposable.dispose();
                }
                long j11 = j10 + 1;
                refConnection.subscriberCount = j11;
                z10 = true;
                if (refConnection.connected || j11 != this.n) {
                    z10 = false;
                } else {
                    refConnection.connected = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.source.subscribe((FlowableSubscriber) new RefCountSubscriber(cVar, this, refConnection));
        if (z10) {
            this.source.connect(refConnection);
        }
    }

    public void terminated(RefConnection refConnection) {
        synchronized (this) {
            if (this.source instanceof FlowablePublishClassic) {
                RefConnection refConnection2 = this.connection;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    this.connection = null;
                    clearTimer(refConnection);
                }
                long j10 = refConnection.subscriberCount - 1;
                refConnection.subscriberCount = j10;
                if (j10 == 0) {
                    reset(refConnection);
                }
            } else {
                RefConnection refConnection3 = this.connection;
                if (refConnection3 != null && refConnection3 == refConnection) {
                    clearTimer(refConnection);
                    long j11 = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j11;
                    if (j11 == 0) {
                        this.connection = null;
                        reset(refConnection);
                    }
                }
            }
        }
    }

    public void timeout(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.subscriberCount == 0 && refConnection == this.connection) {
                this.connection = null;
                Disposable disposable = refConnection.get();
                DisposableHelper.dispose(refConnection);
                ConnectableFlowable<T> connectableFlowable = this.source;
                if (connectableFlowable instanceof Disposable) {
                    ((Disposable) connectableFlowable).dispose();
                } else if (connectableFlowable instanceof ResettableConnectable) {
                    if (disposable == null) {
                        refConnection.disconnectedEarly = true;
                    } else {
                        ((ResettableConnectable) connectableFlowable).resetIf(disposable);
                    }
                }
            }
        }
    }
}
