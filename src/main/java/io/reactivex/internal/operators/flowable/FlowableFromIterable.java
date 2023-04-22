package io.reactivex.internal.operators.flowable;

import df.c;
import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {
    public final Iterable<? extends T> source;

    /* loaded from: classes2.dex */
    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;
        public Iterator<? extends T> it;
        public boolean once;

        public BaseRangeSubscription(Iterator<? extends T> it) {
            this.it = it;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.it = null;
        }

        public abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.it;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            Iterator<? extends T> it = this.it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) ObjectHelper.requireNonNull(this.it.next(), "Iterator.next() returned a null value");
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10) && BackpressureHelper.add(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    fastPath();
                    return;
                }
                slowPath(j10);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 1;
        }

        public abstract void slowPath(long j10);
    }

    /* loaded from: classes2.dex */
    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final ConditionalSubscriber<? super T> downstream;

        public IteratorConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<? extends T> it) {
            super(it);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            Iterator<? extends T> it = this.it;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            while (!this.cancelled) {
                try {
                    Object obj = (T) it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (obj == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.tryOnNext(obj);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
            r13 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
            if (r4 != r13) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
            r13 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void slowPath(long r13) {
            /*
                r12 = this;
                r8 = r12
                java.util.Iterator<? extends T> r0 = r8.it
                r10 = 7
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1 = r8.downstream
                r10 = 5
                r2 = 0
            L9:
                r4 = r2
            La:
                r10 = 2
            Lb:
                int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
                r10 = 5
                if (r6 == 0) goto L64
                r10 = 6
                boolean r6 = r8.cancelled
                r11 = 2
                if (r6 == 0) goto L17
                return
            L17:
                java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L5c
                r6 = r10
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L21
                return
            L21:
                if (r6 != 0) goto L30
                r11 = 1
                java.lang.NullPointerException r13 = new java.lang.NullPointerException
                r10 = 2
                java.lang.String r14 = "Iterator.next() returned a null value"
                r13.<init>(r14)
                r1.onError(r13)
                return
            L30:
                boolean r10 = r1.tryOnNext(r6)
                r6 = r10
                boolean r7 = r8.cancelled
                if (r7 == 0) goto L3a
                return
            L3a:
                r11 = 4
                r11 = 3
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L53
                if (r7 != 0) goto L4c
                r10 = 2
                boolean r13 = r8.cancelled
                if (r13 != 0) goto L4b
                r11 = 3
                r1.onComplete()
            L4b:
                return
            L4c:
                if (r6 == 0) goto La
                r11 = 2
                r6 = 1
                long r4 = r4 + r6
                goto Lb
            L53:
                r13 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r13)
                r10 = 2
                r1.onError(r13)
                return
            L5c:
                r13 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r13)
                r1.onError(r13)
                return
            L64:
                r11 = 7
                long r13 = r8.get()
                int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
                if (r6 != 0) goto La
                r11 = 7
                long r13 = -r4
                r11 = 2
                long r13 = r8.addAndGet(r13)
                int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
                r10 = 1
                if (r4 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorConditionalSubscription.slowPath(long):void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final c<? super T> downstream;

        public IteratorSubscription(c<? super T> cVar, Iterator<? extends T> it) {
            super(it);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void fastPath() {
            Iterator<? extends T> it = this.it;
            c<? super T> cVar = this.downstream;
            while (!this.cancelled) {
                try {
                    Object obj = (T) it.next();
                    if (this.cancelled) {
                        return;
                    }
                    if (obj == null) {
                        cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    cVar.onNext(obj);
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (!this.cancelled) {
                                cVar.onComplete();
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        public void slowPath(long j10) {
            Iterator<? extends T> it = this.it;
            c<? super T> cVar = this.downstream;
            do {
                long j11 = 0;
                do {
                    while (j11 != j10) {
                        if (this.cancelled) {
                            return;
                        }
                        try {
                            Object obj = (T) it.next();
                            if (this.cancelled) {
                                return;
                            }
                            if (obj == null) {
                                cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            cVar.onNext(obj);
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.cancelled) {
                                        return;
                                    }
                                    cVar.onComplete();
                                    return;
                                }
                                j11++;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                cVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            cVar.onError(th2);
                            return;
                        }
                    }
                    j10 = get();
                } while (j11 != j10);
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.source = iterable;
    }

    public static <T> void subscribe(c<? super T> cVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(cVar);
            } else if (cVar instanceof ConditionalSubscriber) {
                cVar.onSubscribe(new IteratorConditionalSubscription((ConditionalSubscriber) cVar, it));
            } else {
                cVar.onSubscribe(new IteratorSubscription(cVar, it));
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        try {
            subscribe(cVar, this.source.iterator());
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
