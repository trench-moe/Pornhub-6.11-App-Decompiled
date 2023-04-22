package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CollectionsKt {
    public static final <T> void addIfNotNull(Collection<T> collection, T t2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (t2 != null) {
            collection.add(t2);
        }
    }

    private static final int capacity(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return (i10 / 3) + i10 + 1;
    }

    public static final <T> List<T> compact(ArrayList<T> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                arrayList.trimToSize();
                return arrayList;
            }
            return kotlin.collections.CollectionsKt.listOf(kotlin.collections.CollectionsKt.first((List<? extends Object>) arrayList));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final <K> Map<K, Integer> mapToIndex(Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (K k10 : iterable) {
            linkedHashMap.put(k10, Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i10) {
        return new HashMap<>(capacity(i10));
    }

    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i10) {
        return new HashSet<>(capacity(i10));
    }

    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i10) {
        return new LinkedHashSet<>(capacity(i10));
    }
}
