package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int bufferSize;
    public final boolean delayError;
    public final Action onOverflow;
    public final boolean unbounded;

    /* loaded from: classes2.dex */
    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final c<? super T> downstream;
        public Throwable error;
        public final Action onOverflow;
        public boolean outputFused;
        public final SimplePlainQueue<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public d upstream;

        public BackpressureBufferSubscriber(c<? super T> cVar, int i10, boolean z10, boolean z11, Action action) {
            this.downstream = cVar;
            this.onOverflow = action;
            this.delayError = z11;
            this.queue = z10 ? new SpscLinkedArrayQueue<>(i10) : new SpscArrayQueue<>(i10);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        public boolean checkTerminated(boolean z10, boolean z11, c<? super T> cVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z10) {
                if (!this.delayError) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z11) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z11) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            int i10;
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                c<? super T> cVar = this.downstream;
                int i11 = 1;
                while (!checkTerminated(this.done, simplePlainQueue.isEmpty(), cVar)) {
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (true) {
                        i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
                        if (i10 == 0) {
                            break;
                        }
                        boolean z10 = this.done;
                        Object obj = (T) simplePlainQueue.poll();
                        boolean z11 = obj == null;
                        if (checkTerminated(z10, z11, cVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        cVar.onNext(obj);
                        j11++;
                    }
                    if (i10 == 0 && checkTerminated(this.done, simplePlainQueue.isEmpty(), cVar)) {
                        return;
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j11);
                    }
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.queue.offer(t2)) {
                if (this.outputFused) {
                    this.downstream.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.upstream.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.onOverflow.run();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void request(long j10) {
            if (this.outputFused || !SubscriptionHelper.validate(j10)) {
                return;
            }
            BackpressureHelper.add(this.requested, j10);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i10, boolean z10, boolean z11, Action action) {
        super(flowable);
        this.bufferSize = i10;
        this.unbounded = z10;
        this.delayError = z11;
        this.onOverflow = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(cVar, this.bufferSize, this.unbounded, this.delayError, this.onOverflow));
    }
}
