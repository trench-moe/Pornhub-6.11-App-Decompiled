package io.reactivex.internal.operators.parallel;

import df.b;
import df.c;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;

/* loaded from: classes2.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends b<? extends R>> mapper;
    public final int prefetch;
    public final ParallelFlowable<T> source;

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends b<? extends R>> function, int i10, ErrorMode errorMode) {
        this.source = parallelFlowable;
        this.mapper = (Function) ObjectHelper.requireNonNull(function, "mapper");
        this.prefetch = i10;
        this.errorMode = (ErrorMode) ObjectHelper.requireNonNull(errorMode, "errorMode");
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
                cVarArr2[i10] = FlowableConcatMap.subscribe(cVarArr[i10], this.mapper, this.prefetch, this.errorMode);
            }
            this.source.subscribe(cVarArr2);
        }
    }
}
