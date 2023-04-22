package io.reactivex.internal.operators.parallel;

import df.b;
import df.c;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;

/* loaded from: classes2.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    public final boolean delayError;
    public final Function<? super T, ? extends b<? extends R>> mapper;
    public final int maxConcurrency;
    public final int prefetch;
    public final ParallelFlowable<T> source;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends b<? extends R>> function, boolean z10, int i10, int i11) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z10;
        this.maxConcurrency = i10;
        this.prefetch = i11;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c<? super R>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c<? super T>[] cVarArr2 = new c[length];
            for (int i10 = 0; i10 < length; i10++) {
                cVarArr2[i10] = FlowableFlatMap.subscribe(cVarArr[i10], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
            }
            this.source.subscribe(cVarArr2);
        }
    }
}
