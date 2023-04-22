package com.google.common.collect;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NaturalOrdering extends h<Comparable> implements Serializable {

    /* renamed from: c */
    public static final NaturalOrdering f7963c = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return f7963c;
    }

    @Override // com.google.common.collect.h
    public <S extends Comparable> h<S> c() {
        return ReverseNaturalOrdering.f7979c;
    }

    @Override // com.google.common.collect.h, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
