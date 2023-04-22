package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class ComparatorOrdering<T> extends h<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator<T> comparator;

    public ComparatorOrdering(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.comparator = comparator;
    }

    @Override // com.google.common.collect.h, java.util.Comparator
    public int compare(T t2, T t8) {
        return this.comparator.compare(t2, t8);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) obj).comparator);
        }
        return false;
    }

    public int hashCode() {
        return this.comparator.hashCode();
    }

    public String toString() {
        return this.comparator.toString();
    }
}
