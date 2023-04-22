package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {
    public final Function<? super T, ? extends b<U>> debounceSelector;

    /* loaded from: classes2.dex */
    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 6725975399620862591L;
        public final Function<? super T, ? extends b<U>> debounceSelector;
        public final AtomicReference<Disposable> debouncer = new AtomicReference<>();
        public boolean done;
        public final c<? super T> downstream;
        public volatile long index;
        public d upstream;

        /* loaded from: classes2.dex */
        public static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {
            public boolean done;
            public final long index;
            public final AtomicBoolean once = new AtomicBoolean();
            public final DebounceSubscriber<T, U> parent;
            public final T value;

            public DebounceInnerSubscriber(DebounceSubscriber<T, U> debounceSubscriber, long j10, T t2) {
                this.parent = debounceSubscriber;
                this.index = j10;
                this.value = t2;
            }

            public void emit() {
                if (this.once.compareAndSet(false, true)) {
                    this.parent.emit(this.index, this.value);
                }
            }

            @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
            public void onComplete() {
                if (this.done) {
                    return;
                }
                this.done = true;
                emit();
            }

            @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
            public void onError(Throwable th) {
                if (this.done) {
                    RxJavaPlugins.onError(th);
                    return;
                }
                this.done = true;
                this.parent.onError(th);
            }

            @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
            public void onNext(U u2) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cancel();
                emit();
            }
        }

        public DebounceSubscriber(c<? super T> cVar, Function<? super T, ? extends b<U>> function) {
            this.downstream = cVar;
            this.debounceSelector = function;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.debouncer);
        }

        public void emit(long j10, T t2) {
            if (j10 == this.index) {
                if (get() != 0) {
                    this.downstream.onNext(t2);
                    BackpressureHelper.produced(this, 1L);
                    return;
                }
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            Disposable disposable = this.debouncer.get();
            if (!DisposableHelper.isDisposed(disposable)) {
                DebounceInnerSubscriber debounceInnerSubscriber = (DebounceInnerSubscriber) disposable;
                if (debounceInnerSubscriber != null) {
                    debounceInnerSubscriber.emit();
                }
                DisposableHelper.dispose(this.debouncer);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.debouncer);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            long j10 = this.index + 1;
            this.index = j10;
            Disposable disposable = this.debouncer.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.debounceSelector.apply(t2), "The publisher supplied is null");
                DebounceInnerSubscriber debounceInnerSubscriber = new DebounceInnerSubscriber(this, j10, t2);
                if (this.debouncer.compareAndSet(disposable, debounceInnerSubscriber)) {
                    bVar.subscribe(debounceInnerSubscriber);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }
    }

    public FlowableDebounce(Flowable<T> flowable, Function<? super T, ? extends b<U>> function) {
        super(flowable);
        this.debounceSelector = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new DebounceSubscriber(new SerializedSubscriber(cVar), this.debounceSelector));
    }
}
