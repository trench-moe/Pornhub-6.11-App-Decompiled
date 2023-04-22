package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableGenerate<T, S> extends Flowable<T> {
    public final Consumer<? super S> disposeState;
    public final BiFunction<S, Emitter<T>, S> generator;
    public final Callable<S> stateSupplier;

    /* loaded from: classes2.dex */
    public static final class GeneratorSubscription<T, S> extends AtomicLong implements Emitter<T>, d {
        private static final long serialVersionUID = 7565982551505011832L;
        public volatile boolean cancelled;
        public final Consumer<? super S> disposeState;
        public final c<? super T> downstream;
        public final BiFunction<S, ? super Emitter<T>, S> generator;
        public boolean hasNext;
        public S state;
        public boolean terminate;

        public GeneratorSubscription(c<? super T> cVar, BiFunction<S, ? super Emitter<T>, S> biFunction, Consumer<? super S> consumer, S s10) {
            this.downstream = cVar;
            this.generator = biFunction;
            this.disposeState = consumer;
            this.state = s10;
        }

        private void dispose(S s10) {
            try {
                this.disposeState.accept(s10);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
        }

        @Override // df.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                if (BackpressureHelper.add(this, 1L) == 0) {
                    S s10 = this.state;
                    this.state = null;
                    dispose(s10);
                }
            }
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (this.terminate) {
                return;
            }
            this.terminate = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Emitter
        public void onError(Throwable th) {
            if (this.terminate) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.terminate = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t2) {
            if (this.terminate) {
                return;
            }
            if (this.hasNext) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t2 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.hasNext = true;
                this.downstream.onNext(t2);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10) && BackpressureHelper.add(this, j10) == 0) {
                S s10 = this.state;
                BiFunction<S, ? super Emitter<T>, S> biFunction = this.generator;
                do {
                    long j11 = 0;
                    while (true) {
                        if (j11 == j10) {
                            j10 = get();
                            if (j11 == j10) {
                                this.state = s10;
                                j10 = addAndGet(-j11);
                            }
                        } else if (this.cancelled) {
                            this.state = null;
                            dispose(s10);
                            return;
                        } else {
                            this.hasNext = false;
                            try {
                                s10 = biFunction.apply(s10, this);
                                if (this.terminate) {
                                    this.cancelled = true;
                                    this.state = null;
                                    dispose(s10);
                                    return;
                                }
                                j11++;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.cancelled = true;
                                this.state = null;
                                onError(th);
                                dispose(s10);
                                return;
                            }
                        }
                    }
                } while (j10 != 0);
            }
        }
    }

    public FlowableGenerate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.stateSupplier = callable;
        this.generator = biFunction;
        this.disposeState = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        try {
            cVar.onSubscribe(new GeneratorSubscription(cVar, this.generator, this.disposeState, this.stateSupplier.call()));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
