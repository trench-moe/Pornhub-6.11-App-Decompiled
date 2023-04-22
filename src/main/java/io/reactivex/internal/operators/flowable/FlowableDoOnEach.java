package io.reactivex.internal.operators.flowable;

import df.c;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public final class FlowableDoOnEach<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Action onAfterTerminate;
    public final Action onComplete;
    public final Consumer<? super Throwable> onError;
    public final Consumer<? super T> onNext;

    /* loaded from: classes2.dex */
    public static final class DoOnEachConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        public final Action onAfterTerminate;
        public final Action onComplete;
        public final Consumer<? super Throwable> onError;
        public final Consumer<? super T> onNext;

        public DoOnEachConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.onNext = consumer;
            this.onError = consumer2;
            this.onComplete = action;
            this.onAfterTerminate = action2;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.onComplete.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.onAfterTerminate.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            boolean z10 = true;
            this.done = true;
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
                z10 = false;
            }
            if (z10) {
                this.downstream.onError(th);
            }
            try {
                this.onAfterTerminate.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.onNext.accept(t2);
                this.downstream.onNext(t2);
            } catch (Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            try {
                T poll = this.qs.poll();
                if (poll != null) {
                    try {
                        this.onNext.accept(poll);
                        this.onAfterTerminate.run();
                    } catch (Throwable th) {
                        try {
                            Exceptions.throwIfFatal(th);
                            this.onError.accept(th);
                            throw ExceptionHelper.throwIfThrowable(th);
                        } catch (Throwable th2) {
                            this.onAfterTerminate.run();
                            throw th2;
                        }
                    }
                } else if (this.sourceMode == 1) {
                    this.onComplete.run();
                    this.onAfterTerminate.run();
                }
                return poll;
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                try {
                    this.onError.accept(th3);
                    throw ExceptionHelper.throwIfThrowable(th3);
                } catch (Throwable th4) {
                    throw new CompositeException(th3, th4);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            return transitiveBoundaryFusion(i10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t2) {
            if (this.done) {
                return false;
            }
            try {
                this.onNext.accept(t2);
                return this.downstream.tryOnNext(t2);
            } catch (Throwable th) {
                fail(th);
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class DoOnEachSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        public final Action onAfterTerminate;
        public final Action onComplete;
        public final Consumer<? super Throwable> onError;
        public final Consumer<? super T> onNext;

        public DoOnEachSubscriber(c<? super T> cVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(cVar);
            this.onNext = consumer;
            this.onError = consumer2;
            this.onComplete = action;
            this.onAfterTerminate = action2;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.onComplete.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.onAfterTerminate.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            boolean z10 = true;
            this.done = true;
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
                z10 = false;
            }
            if (z10) {
                this.downstream.onError(th);
            }
            try {
                this.onAfterTerminate.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.onNext.accept(t2);
                this.downstream.onNext(t2);
            } catch (Throwable th) {
                fail(th);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @io.reactivex.annotations.Nullable
        public T poll() {
            /*
                r9 = this;
                r6 = r9
                r8 = 0
                r0 = r8
                r1 = 2
                r8 = 1
                r2 = r8
                r8 = 3
                io.reactivex.internal.fuseable.QueueSubscription<T> r3 = r6.qs     // Catch: java.lang.Throwable -> L57
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L57
                if (r3 == 0) goto L47
                r8 = 6
                r8 = 4
                io.reactivex.functions.Consumer<? super T> r4 = r6.onNext     // Catch: java.lang.Throwable -> L1d
                r8 = 6
                r4.accept(r3)     // Catch: java.lang.Throwable -> L1d
                io.reactivex.functions.Action r0 = r6.onAfterTerminate
                r0.run()
                goto L56
            L1d:
                r3 = move-exception
                r8 = 2
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)     // Catch: java.lang.Throwable -> L3f
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r6.onError     // Catch: java.lang.Throwable -> L2f
                r8 = 2
                r4.accept(r3)     // Catch: java.lang.Throwable -> L2f
                r8 = 6
                java.lang.Exception r8 = io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(r3)     // Catch: java.lang.Throwable -> L3f
                r0 = r8
                throw r0     // Catch: java.lang.Throwable -> L3f
            L2f:
                r4 = move-exception
                io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException     // Catch: java.lang.Throwable -> L3f
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]     // Catch: java.lang.Throwable -> L3f
                r8 = 5
                r1[r0] = r3     // Catch: java.lang.Throwable -> L3f
                r8 = 1
                r1[r2] = r4     // Catch: java.lang.Throwable -> L3f
                r5.<init>(r1)     // Catch: java.lang.Throwable -> L3f
                r8 = 3
                throw r5     // Catch: java.lang.Throwable -> L3f
            L3f:
                r0 = move-exception
                io.reactivex.functions.Action r1 = r6.onAfterTerminate
                r1.run()
                r8 = 5
                throw r0
            L47:
                r8 = 7
                int r0 = r6.sourceMode
                if (r0 != r2) goto L56
                io.reactivex.functions.Action r0 = r6.onComplete
                r0.run()
                io.reactivex.functions.Action r0 = r6.onAfterTerminate
                r0.run()
            L56:
                return r3
            L57:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r8 = 4
                r8 = 1
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r6.onError     // Catch: java.lang.Throwable -> L69
                r4.accept(r3)     // Catch: java.lang.Throwable -> L69
                java.lang.Exception r8 = io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(r3)
                r0 = r8
                throw r0
                r8 = 2
            L69:
                r4 = move-exception
                io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                r1[r0] = r3
                r1[r2] = r4
                r5.<init>(r1)
                r8 = 4
                throw r5
                r8 = 2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableDoOnEach.DoOnEachSubscriber.poll():java.lang.Object");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            return transitiveBoundaryFusion(i10);
        }
    }

    public FlowableDoOnEach(Flowable<T> flowable, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(flowable);
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onAfterTerminate = action2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new DoOnEachConditionalSubscriber((ConditionalSubscriber) cVar, this.onNext, this.onError, this.onComplete, this.onAfterTerminate));
        } else {
            this.source.subscribe((FlowableSubscriber) new DoOnEachSubscriber(cVar, this.onNext, this.onError, this.onComplete, this.onAfterTerminate));
        }
    }
}
