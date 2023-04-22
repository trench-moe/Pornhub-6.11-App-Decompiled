package io.reactivex.internal.util;

import io.reactivex.functions.BiFunction;
import java.util.List;

/* loaded from: classes2.dex */
public enum ListAddBiConsumer implements BiFunction<List, Object, List> {
    INSTANCE;

    public static <T> BiFunction<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.functions.BiFunction
    public List apply(List list, Object obj) {
        list.add(obj);
        return list;
    }
}
