package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {
    public final Function<? super TLeft, ? extends b<TLeftEnd>> leftEnd;
    public final b<? extends TRight> other;
    public final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> resultSelector;
    public final Function<? super TRight, ? extends b<TRightEnd>> rightEnd;

    /* loaded from: classes2.dex */
    public static final class GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements d, JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        public volatile boolean cancelled;
        public final c<? super R> downstream;
        public final Function<? super TLeft, ? extends b<TLeftEnd>> leftEnd;
        public int leftIndex;
        public final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> resultSelector;
        public final Function<? super TRight, ? extends b<TRightEnd>> rightEnd;
        public int rightIndex;
        public static final Integer LEFT_VALUE = 1;
        public static final Integer RIGHT_VALUE = 2;
        public static final Integer LEFT_CLOSE = 3;
        public static final Integer RIGHT_CLOSE = 4;
        public final AtomicLong requested = new AtomicLong();
        public final CompositeDisposable disposables = new CompositeDisposable();
        public final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        public final Map<Integer, UnicastProcessor<TRight>> lefts = new LinkedHashMap();
        public final Map<Integer, TRight> rights = new LinkedHashMap();
        public final AtomicReference<Throwable> error = new AtomicReference<>();
        public final AtomicInteger active = new AtomicInteger(2);

        public GroupJoinSubscription(c<? super R> cVar, Function<? super TLeft, ? extends b<TLeftEnd>> function, Function<? super TRight, ? extends b<TRightEnd>> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
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
            int i10 = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    spscLinkedArrayQueue.clear();
                    cancelAll();
                    errorAll(cVar);
                    return;
                }
                boolean z10 = this.active.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    for (UnicastProcessor<TRight> unicastProcessor : this.lefts.values()) {
                        unicastProcessor.onComplete();
                    }
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    cVar.onComplete();
                    return;
                } else if (z11) {
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    Object poll = spscLinkedArrayQueue.poll();
                    if (num == LEFT_VALUE) {
                        UnicastProcessor<TRight> create = UnicastProcessor.create();
                        int i11 = this.leftIndex;
                        this.leftIndex = i11 + 1;
                        this.lefts.put(Integer.valueOf(i11), create);
                        try {
                            b bVar = (b) ObjectHelper.requireNonNull(this.leftEnd.apply(poll), "The leftEnd returned a null Publisher");
                            LeftRightEndSubscriber leftRightEndSubscriber = new LeftRightEndSubscriber(this, true, i11);
                            this.disposables.add(leftRightEndSubscriber);
                            bVar.subscribe(leftRightEndSubscriber);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(cVar);
                                return;
                            }
                            try {
                                Object obj = (Object) ObjectHelper.requireNonNull(this.resultSelector.apply(poll, create), "The resultSelector returned a null value");
                                if (this.requested.get() == 0) {
                                    fail(new MissingBackpressureException("Could not emit value due to lack of requests"), cVar, spscLinkedArrayQueue);
                                    return;
                                }
                                cVar.onNext(obj);
                                BackpressureHelper.produced(this.requested, 1L);
                                for (TRight tright : this.rights.values()) {
                                    create.onNext(tright);
                                }
                            } catch (Throwable th) {
                                fail(th, cVar, spscLinkedArrayQueue);
                                return;
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
                            LeftRightEndSubscriber leftRightEndSubscriber2 = new LeftRightEndSubscriber(this, false, i12);
                            this.disposables.add(leftRightEndSubscriber2);
                            bVar2.subscribe(leftRightEndSubscriber2);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(cVar);
                                return;
                            }
                            for (UnicastProcessor<TRight> unicastProcessor2 : this.lefts.values()) {
                                unicastProcessor2.onNext(poll);
                            }
                        } catch (Throwable th3) {
                            fail(th3, cVar, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        LeftRightEndSubscriber leftRightEndSubscriber3 = (LeftRightEndSubscriber) poll;
                        UnicastProcessor<TRight> remove = this.lefts.remove(Integer.valueOf(leftRightEndSubscriber3.index));
                        this.disposables.remove(leftRightEndSubscriber3);
                        if (remove != null) {
                            remove.onComplete();
                        }
                    } else if (num == RIGHT_CLOSE) {
                        LeftRightEndSubscriber leftRightEndSubscriber4 = (LeftRightEndSubscriber) poll;
                        this.rights.remove(Integer.valueOf(leftRightEndSubscriber4.index));
                        this.disposables.remove(leftRightEndSubscriber4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void errorAll(c<?> cVar) {
            Throwable terminate = ExceptionHelper.terminate(this.error);
            for (UnicastProcessor<TRight> unicastProcessor : this.lefts.values()) {
                unicastProcessor.onError(terminate);
            }
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
        public void innerClose(boolean z10, LeftRightEndSubscriber leftRightEndSubscriber) {
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
        public void innerComplete(LeftRightSubscriber leftRightSubscriber) {
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
                this.queue.offer(z10 ? LEFT_VALUE : RIGHT_VALUE, obj);
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

    /* loaded from: classes2.dex */
    public interface JoinSupport {
        void innerClose(boolean z10, LeftRightEndSubscriber leftRightEndSubscriber);

        void innerCloseError(Throwable th);

        void innerComplete(LeftRightSubscriber leftRightSubscriber);

        void innerError(Throwable th);

        void innerValue(boolean z10, Object obj);
    }

    /* loaded from: classes2.dex */
    public static final class LeftRightEndSubscriber extends AtomicReference<d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        public final int index;
        public final boolean isLeft;
        public final JoinSupport parent;

        public LeftRightEndSubscriber(JoinSupport joinSupport, boolean z10, int i10) {
            this.parent = joinSupport;
            this.isLeft = z10;
            this.index = i10;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.parent.innerCloseError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LeftRightSubscriber extends AtomicReference<d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        public final boolean isLeft;
        public final JoinSupport parent;

        public LeftRightSubscriber(JoinSupport joinSupport, boolean z10) {
            this.parent = joinSupport;
            this.isLeft = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }
    }

    public FlowableGroupJoin(Flowable<TLeft> flowable, b<? extends TRight> bVar, Function<? super TLeft, ? extends b<TLeftEnd>> function, Function<? super TRight, ? extends b<TRightEnd>> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
        super(flowable);
        this.other = bVar;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        GroupJoinSubscription groupJoinSubscription = new GroupJoinSubscription(cVar, this.leftEnd, this.rightEnd, this.resultSelector);
        cVar.onSubscribe(groupJoinSubscription);
        LeftRightSubscriber leftRightSubscriber = new LeftRightSubscriber(groupJoinSubscription, true);
        groupJoinSubscription.disposables.add(leftRightSubscriber);
        LeftRightSubscriber leftRightSubscriber2 = new LeftRightSubscriber(groupJoinSubscription, false);
        groupJoinSubscription.disposables.add(leftRightSubscriber2);
        this.source.subscribe((FlowableSubscriber) leftRightSubscriber);
        this.other.subscribe(leftRightSubscriber2);
    }
}
