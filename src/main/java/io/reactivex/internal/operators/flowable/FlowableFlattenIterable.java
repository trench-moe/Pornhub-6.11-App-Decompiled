package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final Function<? super T, ? extends Iterable<? extends R>> mapper;
    public final int prefetch;

    /* loaded from: classes2.dex */
    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        public volatile boolean cancelled;
        public int consumed;
        public Iterator<? extends R> current;
        public volatile boolean done;
        public final c<? super R> downstream;
        public int fusionMode;
        public final int limit;
        public final Function<? super T, ? extends Iterable<? extends R>> mapper;
        public final int prefetch;
        public SimpleQueue<T> queue;
        public d upstream;
        public final AtomicReference<Throwable> error = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();

        public FlattenIterableSubscriber(c<? super R> cVar, Function<? super T, ? extends Iterable<? extends R>> function, int i10) {
            this.downstream = cVar;
            this.mapper = function;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, c<?> cVar, SimpleQueue<?> simpleQueue) {
            if (this.cancelled) {
                this.current = null;
                simpleQueue.clear();
                return true;
            }
            if (z10) {
                if (this.error.get() != null) {
                    Throwable terminate = ExceptionHelper.terminate(this.error);
                    this.current = null;
                    simpleQueue.clear();
                    cVar.onError(terminate);
                    return true;
                } else if (z11) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.current = null;
            this.queue.clear();
        }

        public void consumedOne(boolean z10) {
            if (z10) {
                int i10 = this.consumed + 1;
                if (i10 == this.limit) {
                    this.consumed = 0;
                    this.upstream.request(i10);
                    return;
                }
                this.consumed = i10;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:
            if (r6 == null) goto L57;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber.drain():void");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.current == null && this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done || !ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            if (this.fusionMode != 0 || this.queue.offer(t2)) {
                drain();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    } else if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
            r2 = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0.next(), "The iterator returned a null value");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
            if (r0.hasNext() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
            r8.current = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
            return r2;
         */
        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @io.reactivex.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public R poll() {
            /*
                r8 = this;
                r4 = r8
                java.util.Iterator<? extends R> r0 = r4.current
                r7 = 7
                r1 = 0
            L5:
                if (r0 != 0) goto L2e
                r6 = 5
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r4.queue
                java.lang.Object r6 = r0.poll()
                r0 = r6
                if (r0 != 0) goto L12
                return r1
            L12:
                r6 = 7
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2 = r4.mapper
                java.lang.Object r7 = r2.apply(r0)
                r0 = r7
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r6 = 5
                java.util.Iterator r0 = r0.iterator()
                boolean r2 = r0.hasNext()
                if (r2 != 0) goto L2a
                r6 = 4
                r0 = r1
                goto L5
            L2a:
                r6 = 5
                r4.current = r0
                r6 = 5
            L2e:
                r6 = 3
                java.lang.Object r2 = r0.next()
                java.lang.String r3 = "The iterator returned a null value"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)
                boolean r7 = r0.hasNext()
                r0 = r7
                if (r0 != 0) goto L43
                r4.current = r1
                r6 = 2
            L43:
                r7 = 6
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber.poll():java.lang.Object");
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            return ((i10 & 1) == 0 || this.fusionMode != 1) ? 0 : 1;
        }
    }

    public FlowableFlattenIterable(Flowable<T> flowable, Function<? super T, ? extends Iterable<? extends R>> function, int i10) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        Flowable<T> flowable = this.source;
        if (!(flowable instanceof Callable)) {
            flowable.subscribe((FlowableSubscriber) new FlattenIterableSubscriber(cVar, this.mapper, this.prefetch));
            return;
        }
        try {
            Object call = ((Callable) flowable).call();
            if (call == null) {
                EmptySubscription.complete(cVar);
                return;
            }
            try {
                FlowableFromIterable.subscribe(cVar, this.mapper.apply(call).iterator());
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, cVar);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, cVar);
        }
    }
}
