package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends b<? extends R>> mapper;
    public final int prefetch;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$reactivex$internal$util$ErrorMode;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            $SwitchMap$io$reactivex$internal$util$ErrorMode = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$internal$util$ErrorMode[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, d {
        private static final long serialVersionUID = -3511336836796789179L;
        public volatile boolean active;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final int limit;
        public final Function<? super T, ? extends b<? extends R>> mapper;
        public final int prefetch;
        public SimpleQueue<T> queue;
        public int sourceMode;
        public d upstream;
        public final ConcatMapInner<R> inner = new ConcatMapInner<>(this);
        public final AtomicThrowable errors = new AtomicThrowable();

        public BaseConcatMapSubscriber(Function<? super T, ? extends b<? extends R>> function, int i10) {
            this.mapper = function;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // df.d
        public abstract /* synthetic */ void cancel();

        public abstract void drain();

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onNext(T t2) {
            if (this.sourceMode == 2 || this.queue.offer(t2)) {
                drain();
                return;
            }
            this.upstream.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        subscribeActual();
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        subscribeActual();
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                subscribeActual();
                dVar.request(this.prefetch);
            }
        }

        @Override // df.d
        public abstract /* synthetic */ void request(long j10);

        public abstract void subscribeActual();
    }

    /* loaded from: classes2.dex */
    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        public final c<? super R> downstream;
        public final boolean veryEnd;

        public ConcatMapDelayed(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function, int i10, boolean z10) {
            super(function, i10);
            this.downstream = cVar;
            this.veryEnd = z10;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, df.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00f5 A[SYNTHETIC] */
        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instructions count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapDelayed.drain():void");
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.veryEnd) {
                this.upstream.cancel();
                this.done = true;
            }
            this.active = false;
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r10) {
            this.downstream.onNext(r10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, df.d
        public void request(long j10) {
            this.inner.request(j10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        public final c<? super R> downstream;
        public final AtomicInteger wip;

        public ConcatMapImmediate(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function, int i10) {
            super(function, i10);
            this.downstream = cVar;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, df.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                while (true) {
                    while (!this.cancelled) {
                        if (!this.active) {
                            boolean z10 = this.done;
                            try {
                                T poll = this.queue.poll();
                                boolean z11 = poll == null;
                                if (z10 && z11) {
                                    this.downstream.onComplete();
                                    return;
                                } else if (!z11) {
                                    try {
                                        b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(poll), "The mapper returned a null Publisher");
                                        if (this.sourceMode != 1) {
                                            int i10 = this.consumed + 1;
                                            if (i10 == this.limit) {
                                                this.consumed = 0;
                                                this.upstream.request(i10);
                                            } else {
                                                this.consumed = i10;
                                            }
                                        }
                                        if (bVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) bVar).call();
                                                if (call != null) {
                                                    if (!this.inner.isUnbounded()) {
                                                        this.active = true;
                                                        this.inner.setSubscription(new SimpleScalarSubscription(call, this.inner));
                                                    } else if (get() == 0 && compareAndSet(0, 1)) {
                                                        this.downstream.onNext(call);
                                                        if (!compareAndSet(1, 0)) {
                                                            this.downstream.onError(this.errors.terminate());
                                                            return;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                Exceptions.throwIfFatal(th);
                                                this.upstream.cancel();
                                                this.errors.addThrowable(th);
                                                this.downstream.onError(this.errors.terminate());
                                                return;
                                            }
                                        } else {
                                            this.active = true;
                                            bVar.subscribe(this.inner);
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        this.upstream.cancel();
                                        this.errors.addThrowable(th2);
                                        this.downstream.onError(this.errors.terminate());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.upstream.cancel();
                                this.errors.addThrowable(th3);
                                this.downstream.onError(this.errors.terminate());
                                return;
                            }
                        }
                        if (this.wip.decrementAndGet() == 0) {
                            break;
                        }
                    }
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(r10);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.inner.cancel();
            if (getAndIncrement() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, df.d
        public void request(long j10) {
            this.inner.request(j10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        public final ConcatMapSupport<R> parent;
        public long produced;

        public ConcatMapInner(ConcatMapSupport<R> concatMapSupport) {
            super(false);
            this.parent = concatMapSupport;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            long j10 = this.produced;
            if (j10 != 0) {
                this.produced = 0L;
                produced(j10);
            }
            this.parent.innerComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            long j10 = this.produced;
            if (j10 != 0) {
                this.produced = 0L;
                produced(j10);
            }
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(R r10) {
            this.produced++;
            this.parent.innerNext(r10);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            setSubscription(dVar);
        }
    }

    /* loaded from: classes2.dex */
    public interface ConcatMapSupport<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t2);
    }

    /* loaded from: classes2.dex */
    public static final class SimpleScalarSubscription<T> extends AtomicBoolean implements d {
        public final c<? super T> downstream;
        public final T value;

        public SimpleScalarSubscription(T t2, c<? super T> cVar) {
            this.value = t2;
            this.downstream = cVar;
        }

        @Override // df.d
        public void cancel() {
        }

        @Override // df.d
        public void request(long j10) {
            if (j10 > 0 && compareAndSet(false, true)) {
                c<? super T> cVar = this.downstream;
                cVar.onNext((T) this.value);
                cVar.onComplete();
            }
        }
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends b<? extends R>> function, int i10, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i10;
        this.errorMode = errorMode;
    }

    public static <T, R> c<T> subscribe(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function, int i10, ErrorMode errorMode) {
        int i11 = AnonymousClass1.$SwitchMap$io$reactivex$internal$util$ErrorMode[errorMode.ordinal()];
        return i11 != 1 ? i11 != 2 ? new ConcatMapImmediate(cVar, function, i10) : new ConcatMapDelayed(cVar, function, i10, true) : new ConcatMapDelayed(cVar, function, i10, false);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe(subscribe(cVar, this.mapper, this.prefetch, this.errorMode));
    }
}
