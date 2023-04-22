package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class ReverseOrdering<T> extends h<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final h<? super T> forwardOrder;

    public ReverseOrdering(h<? super T> hVar) {
        this.forwardOrder = hVar;
    }

    @Override // com.google.common.collect.h
    public <S extends T> h<S> c() {
        return (h<? super T>) this.forwardOrder;
    }

    @Override // com.google.common.collect.h, java.util.Comparator
    public int compare(T t2, T t8) {
        return this.forwardOrder.compare(t8, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public String toString() {
        return this.forwardOrder + ".reverse()";
    }
}
