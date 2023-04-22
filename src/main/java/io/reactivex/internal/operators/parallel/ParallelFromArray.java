package io.reactivex.internal.operators.parallel;

import df.b;
import df.c;
import io.reactivex.parallel.ParallelFlowable;

/* loaded from: classes2.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    public final b<T>[] sources;

    public ParallelFromArray(b<T>[] bVarArr) {
        this.sources = bVarArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c<? super T>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.sources[i10].subscribe(cVarArr[i10]);
            }
        }
    }
}
