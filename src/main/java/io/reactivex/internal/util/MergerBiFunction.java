package io.reactivex.internal.util;

import io.reactivex.functions.BiFunction;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class MergerBiFunction<T> implements BiFunction<List<T>, List<T>, List<T>> {
    public final Comparator<? super T> comparator;

    public MergerBiFunction(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    @Override // io.reactivex.functions.BiFunction
    public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        return apply((List) ((List) obj), (List) ((List) obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0042). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<T> apply(java.util.List<T> r9, java.util.List<T> r10) {
        /*
            r8 = this;
            r5 = r8
            int r0 = r9.size()
            int r1 = r10.size()
            int r1 = r1 + r0
            r7 = 7
            if (r1 != 0) goto L15
            r7 = 6
            java.util.ArrayList r9 = new java.util.ArrayList
            r7 = 1
            r9.<init>()
            return r9
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r7 = 4
            java.util.Iterator r7 = r9.iterator()
            r9 = r7
            java.util.Iterator r10 = r10.iterator()
            boolean r1 = r9.hasNext()
            r7 = 0
            r2 = r7
            if (r1 == 0) goto L32
            java.lang.Object r7 = r9.next()
            r1 = r7
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L40
            r7 = 7
            java.lang.Object r7 = r10.next()
            r3 = r7
            goto L42
        L40:
            r7 = 3
            r3 = r2
        L42:
            if (r1 == 0) goto L71
            if (r3 == 0) goto L71
            java.util.Comparator<? super T> r4 = r5.comparator
            r7 = 6
            int r7 = r4.compare(r1, r3)
            r4 = r7
            if (r4 >= 0) goto L62
            r0.add(r1)
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r7 = r9.next()
            r1 = r7
            goto L42
        L5f:
            r7 = 1
            r1 = r2
            goto L42
        L62:
            r7 = 3
            r0.add(r3)
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r10.next()
            goto L42
        L71:
            if (r1 == 0) goto L88
            r7 = 5
            r0.add(r1)
        L77:
            boolean r7 = r9.hasNext()
            r10 = r7
            if (r10 == 0) goto L9a
            r7 = 5
            java.lang.Object r7 = r9.next()
            r10 = r7
            r0.add(r10)
            goto L77
        L88:
            r0.add(r3)
        L8b:
            boolean r9 = r10.hasNext()
            if (r9 == 0) goto L9a
            java.lang.Object r7 = r10.next()
            r9 = r7
            r0.add(r9)
            goto L8b
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.MergerBiFunction.apply(java.util.List, java.util.List):java.util.List");
    }
}
