package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long bufferSize;
    public final Action onOverflow;
    public final BackpressureOverflowStrategy strategy;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureOverflowStrategy;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            $SwitchMap$io$reactivex$BackpressureOverflowStrategy = iArr;
            try {
                iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureOverflowStrategy[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 3240706908776709697L;
        public final long bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final c<? super T> downstream;
        public Throwable error;
        public final Action onOverflow;
        public final BackpressureOverflowStrategy strategy;
        public d upstream;
        public final AtomicLong requested = new AtomicLong();
        public final Deque<T> deque = new ArrayDeque();

        public OnBackpressureBufferStrategySubscriber(c<? super T> cVar, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j10) {
            this.downstream = cVar;
            this.onOverflow = action;
            this.strategy = backpressureOverflowStrategy;
            this.bufferSize = j10;
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                clear(this.deque);
            }
        }

        public void clear(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
            if (r10 != 0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
            if (r15.cancelled == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
            clear(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
            r4 = r15.done;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x006b, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
            r14 = r0.isEmpty();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
            if (r4 == false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0074, code lost:
            r4 = r15.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0077, code lost:
            if (r4 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0079, code lost:
            clear(r0);
            r1.onError(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0080, code lost:
            if (r14 == false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0082, code lost:
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0087, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0088, code lost:
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x008b, code lost:
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0090, code lost:
            if (r8 == 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0092, code lost:
            io.reactivex.internal.util.BackpressureHelper.produced(r15.requested, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0097, code lost:
            r3 = addAndGet(-r3);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                r15 = this;
                int r0 = r15.getAndIncrement()
                if (r0 == 0) goto L8
                r14 = 1
                return
            L8:
                java.util.Deque<T> r0 = r15.deque
                df.c<? super T> r1 = r15.downstream
                r14 = 1
                r2 = r14
                r3 = 1
            Lf:
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L18:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                r14 = 1
                if (r10 == 0) goto L5d
                r14 = 4
                boolean r11 = r15.cancelled
                if (r11 == 0) goto L26
                r15.clear(r0)
                return
            L26:
                boolean r11 = r15.done
                monitor-enter(r0)
                r14 = 5
                java.lang.Object r14 = r0.poll()     // Catch: java.lang.Throwable -> L5a
                r12 = r14
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
                if (r12 != 0) goto L36
                r14 = 1
                r14 = 1
                r13 = r14
                goto L38
            L36:
                r14 = 6
                r13 = 0
            L38:
                if (r11 == 0) goto L4d
                java.lang.Throwable r11 = r15.error
                if (r11 == 0) goto L47
                r14 = 1
                r15.clear(r0)
                r1.onError(r11)
                r14 = 3
                return
            L47:
                if (r13 == 0) goto L4d
                r1.onComplete()
                return
            L4d:
                r14 = 1
                if (r13 == 0) goto L51
                goto L5e
            L51:
                r14 = 7
                r1.onNext(r12)
                r10 = 1
                long r8 = r8 + r10
                r14 = 2
                goto L18
            L5a:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
                throw r1
            L5d:
                r14 = 7
            L5e:
                if (r10 != 0) goto L8d
                boolean r4 = r15.cancelled
                if (r4 == 0) goto L68
                r15.clear(r0)
                return
            L68:
                r14 = 6
                boolean r4 = r15.done
                monitor-enter(r0)
                boolean r14 = r0.isEmpty()     // Catch: java.lang.Throwable -> L88
                r5 = r14
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
                if (r4 == 0) goto L8d
                java.lang.Throwable r4 = r15.error
                r14 = 2
                if (r4 == 0) goto L80
                r15.clear(r0)
                r1.onError(r4)
                return
            L80:
                if (r5 == 0) goto L8d
                r14 = 6
                r1.onComplete()
                r14 = 7
                return
            L88:
                r1 = move-exception
                r14 = 5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
                throw r1
                r14 = 5
            L8d:
                int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                r14 = 7
                if (r4 == 0) goto L97
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r4, r8)
            L97:
                int r3 = -r3
                r14 = 2
                int r14 = r15.addAndGet(r3)
                r3 = r14
                if (r3 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.OnBackpressureBufferStrategySubscriber.drain():void");
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            boolean z10;
            boolean z11;
            if (this.done) {
                return;
            }
            Deque<T> deque = this.deque;
            synchronized (deque) {
                try {
                    z10 = false;
                    z11 = true;
                    if (deque.size() == this.bufferSize) {
                        int i10 = AnonymousClass1.$SwitchMap$io$reactivex$BackpressureOverflowStrategy[this.strategy.ordinal()];
                        if (i10 == 1) {
                            deque.pollLast();
                            deque.offer(t2);
                        } else if (i10 == 2) {
                            deque.poll();
                            deque.offer(t2);
                        }
                        z10 = true;
                    } else {
                        deque.offer(t2);
                    }
                    z11 = false;
                } finally {
                }
            }
            if (z10) {
                Action action = this.onOverflow;
                if (action != null) {
                    try {
                        action.run();
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.upstream.cancel();
                        onError(th);
                    }
                }
            } else if (z11) {
                this.upstream.cancel();
                onError(new MissingBackpressureException());
            } else {
                drain();
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
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public FlowableOnBackpressureBufferStrategy(Flowable<T> flowable, long j10, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.bufferSize = j10;
        this.onOverflow = action;
        this.strategy = backpressureOverflowStrategy;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new OnBackpressureBufferStrategySubscriber(cVar, this.onOverflow, this.strategy, this.bufferSize));
    }
}
