package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class h<T> implements Comparator<T> {
    public static <T> h<T> a(Comparator<T> comparator) {
        return comparator instanceof h ? (h) comparator : new ComparatorOrdering(comparator);
    }

    public static <C extends Comparable> h<C> b() {
        return NaturalOrdering.f7963c;
    }

    public <S extends T> h<S> c() {
        return new ReverseOrdering(this);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t2, @NullableDecl T t8);
}
