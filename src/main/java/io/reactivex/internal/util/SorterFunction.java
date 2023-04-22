package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class SorterFunction<T> implements Function<List<T>, List<T>> {
    public final Comparator<? super T> comparator;

    public SorterFunction(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return apply((List) ((List) obj));
    }

    public List<T> apply(List<T> list) {
        Collections.sort(list, this.comparator);
        return list;
    }
}
