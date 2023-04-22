package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableOperator;

/* loaded from: classes2.dex */
public final class FlowableLift<R, T> extends AbstractFlowableWithUpstream<T, R> {
    public final FlowableOperator<? extends R, ? super T> operator;

    public FlowableLift(Flowable<T> flowable, FlowableOperator<? extends R, ? super T> flowableOperator) {
        super(flowable);
        this.operator = flowableOperator;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // io.reactivex.Flowable
    public void subscribeActual(df.c<? super R> r6) {
        /*
            r5 = this;
            java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            io.reactivex.FlowableOperator<? extends R, ? super T> r0 = r5.operator     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            r3 = 6
            df.c r6 = r0.apply(r6)     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            if (r6 == 0) goto L13
            io.reactivex.Flowable<T> r0 = r5.source     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            r3 = 2
            r0.subscribe(r6)     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            r4 = 7
            return
        L13:
            r3 = 4
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            r4 = 3
            r0.<init>()     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            r3 = 2
            java.lang.String r2 = "Operator "
            r1 = r2
            r0.append(r1)     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            io.reactivex.FlowableOperator<? extends R, ? super T> r1 = r5.operator     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            r3 = 7
            r0.append(r1)     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            java.lang.String r2 = " returned a null Subscriber"
            r1 = r2
            r0.append(r1)     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            r0 = r2
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
            r3 = 6
            throw r6     // Catch: java.lang.Throwable -> L39 java.lang.NullPointerException -> L4f
        L39:
            r6 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
            r3 = 6
            io.reactivex.plugins.RxJavaPlugins.onError(r6)
            r3 = 1
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "Actually not, but can't throw other exceptions due to RS"
            r1 = r2
            r0.<init>(r1)
            r0.initCause(r6)
            throw r0
            r3 = 5
        L4f:
            r6 = move-exception
            throw r6
            r4 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableLift.subscribeActual(df.c):void");
    }
}
