package com.google.common.collect;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
final class ReverseNaturalOrdering extends h<Comparable> implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final ReverseNaturalOrdering f7979c = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return f7979c;
    }

    @Override // com.google.common.collect.h
    public <S extends Comparable> h<S> c() {
        return NaturalOrdering.f7963c;
    }

    @Override // com.google.common.collect.h, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
