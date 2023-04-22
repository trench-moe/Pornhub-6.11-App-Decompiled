package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {
    public final Function<? super TLeft, ? extends b<TLeftEnd>> leftEnd;
    public final b<? extends TRight> other;
    public final BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
    public final Function<? super TRight, ? extends b<TRightEnd>> rightEnd;

    /* loaded from: classes2.dex */
    public static final class JoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements d, FlowableGroupJoin.JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        public volatile boolean cancelled;
        public final c<? super R> downstream;
        public final Function<? super TLeft, ? extends b<TLeftEnd>> leftEnd;
        public int leftIndex;
        public final BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
        public final Function<? super TRight, ? extends b<TRightEnd>> rightEnd;
        public int rightIndex;
        public static final Integer LEFT_VALUE = 1;
        public static final Integer RIGHT_VALUE = 2;
        public static final Integer LEFT_CLOSE = 3;
        public static final Integer RIGHT_CLOSE = 4;
        public final AtomicLong requested = new AtomicLong();
        public final CompositeDisposable disposables = new CompositeDisposable();
        public final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        public final Map<Integer, TLeft> lefts = new LinkedHashMap();
        public final Map<Integer, TRight> rights = new LinkedHashMap();
        public final AtomicReference<Throwable> error = new AtomicReference<>();
        public final AtomicInteger active = new AtomicInteger(2);

        public JoinSubscription(c<? super R> cVar, Function<? super TLeft, ? extends b<TLeftEnd>> function, Function<? super TRight, ? extends b<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.downstream = cVar;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
        }

        @Override // df.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void cancelAll() {
            this.disposables.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            c<? super R> cVar = this.downstream;
            boolean z10 = true;
            int i10 = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    spscLinkedArrayQueue.clear();
                    cancelAll();
                    errorAll(cVar);
                    return;
                }
                boolean z11 = this.active.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z12 = num == null;
                if (z11 && z12) {
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    cVar.onComplete();
                    return;
                } else if (z12) {
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    Object poll = spscLinkedArrayQueue.poll();
                    if (num == LEFT_VALUE) {
                        int i11 = this.leftIndex;
                        this.leftIndex = i11 + 1;
                        this.lefts.put(Integer.valueOf(i11), poll);
                        try {
                            b bVar = (b) ObjectHelper.requireNonNull(this.leftEnd.apply(poll), "The leftEnd returned a null Publisher");
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber = new FlowableGroupJoin.LeftRightEndSubscriber(this, z10, i11);
                            this.disposables.add(leftRightEndSubscriber);
                            bVar.subscribe(leftRightEndSubscriber);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(cVar);
                                return;
                            }
                            long j10 = this.requested.get();
                            long j11 = 0;
                            for (TRight tright : this.rights.values()) {
                                try {
                                    Object obj = (Object) ObjectHelper.requireNonNull(this.resultSelector.apply(poll, tright), "The resultSelector returned a null value");
                                    if (j11 == j10) {
                                        ExceptionHelper.addThrowable(this.error, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        cancelAll();
                                        errorAll(cVar);
                                        return;
                                    }
                                    cVar.onNext(obj);
                                    j11++;
                                } catch (Throwable th) {
                                    fail(th, cVar, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                BackpressureHelper.produced(this.requested, j11);
                            }
                        } catch (Throwable th2) {
                            fail(th2, cVar, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i12 = this.rightIndex;
                        this.rightIndex = i12 + 1;
                        this.rights.put(Integer.valueOf(i12), poll);
                        try {
                            b bVar2 = (b) ObjectHelper.requireNonNull(this.rightEnd.apply(poll), "The rightEnd returned a null Publisher");
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber2 = new FlowableGroupJoin.LeftRightEndSubscriber(this, false, i12);
                            this.disposables.add(leftRightEndSubscriber2);
                            bVar2.subscribe(leftRightEndSubscriber2);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(cVar);
                                return;
                            }
                            long j12 = this.requested.get();
                            long j13 = 0;
                            for (TLeft tleft : this.lefts.values()) {
                                try {
                                    Object obj2 = (Object) ObjectHelper.requireNonNull(this.resultSelector.apply(tleft, poll), "The resultSelector returned a null value");
                                    if (j13 == j12) {
                                        ExceptionHelper.addThrowable(this.error, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        cancelAll();
                                        errorAll(cVar);
                                        return;
                                    }
                                    cVar.onNext(obj2);
                                    j13++;
                                } catch (Throwable th3) {
                                    fail(th3, cVar, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j13 != 0) {
                                BackpressureHelper.produced(this.requested, j13);
                            }
                        } catch (Throwable th4) {
                            fail(th4, cVar, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber3 = (FlowableGroupJoin.LeftRightEndSubscriber) poll;
                        this.lefts.remove(Integer.valueOf(leftRightEndSubscriber3.index));
                        this.disposables.remove(leftRightEndSubscriber3);
                    } else if (num == RIGHT_CLOSE) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber4 = (FlowableGroupJoin.LeftRightEndSubscriber) poll;
                        this.rights.remove(Integer.valueOf(leftRightEndSubscriber4.index));
                        this.disposables.remove(leftRightEndSubscriber4);
                    }
                    z10 = true;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void errorAll(c<?> cVar) {
            Throwable terminate = ExceptionHelper.terminate(this.error);
            this.lefts.clear();
            this.rights.clear();
            cVar.onError(terminate);
        }

        public void fail(Throwable th, c<?> cVar, SimpleQueue<?> simpleQueue) {
            Exceptions.throwIfFatal(th);
            ExceptionHelper.addThrowable(this.error, th);
            simpleQueue.clear();
            cancelAll();
            errorAll(cVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerClose(boolean z10, FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                this.queue.offer(z10 ? LEFT_CLOSE : RIGHT_CLOSE, leftRightEndSubscriber);
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerCloseError(Throwable th) {
            if (ExceptionHelper.addThrowable(this.error, th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerComplete(FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber) {
            this.disposables.delete(leftRightSubscriber);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerError(Throwable th) {
            if (!ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerValue(boolean z10, Object obj) {
            synchronized (this) {
                try {
                    this.queue.offer(z10 ? LEFT_VALUE : RIGHT_VALUE, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            drain();
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
            }
        }
    }

    public FlowableJoin(Flowable<TLeft> flowable, b<? extends TRight> bVar, Function<? super TLeft, ? extends b<TLeftEnd>> function, Function<? super TRight, ? extends b<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(flowable);
        this.other = bVar;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        JoinSubscription joinSubscription = new JoinSubscription(cVar, this.leftEnd, this.rightEnd, this.resultSelector);
        cVar.onSubscribe(joinSubscription);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, true);
        joinSubscription.disposables.add(leftRightSubscriber);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber2 = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, false);
        joinSubscription.disposables.add(leftRightSubscriber2);
        this.source.subscribe((FlowableSubscriber) leftRightSubscriber);
        this.other.subscribe(leftRightSubscriber2);
    }
}
