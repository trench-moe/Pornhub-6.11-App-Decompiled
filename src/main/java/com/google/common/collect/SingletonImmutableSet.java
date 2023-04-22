package com.google.common.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Objects;
import kb.i;
import kb.x;

/* loaded from: classes.dex */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: m  reason: collision with root package name */
    public final transient E f7980m;
    @LazyInit
    public transient int n;

    public SingletonImmutableSet(E e10) {
        Objects.requireNonNull(e10);
        this.f7980m = e10;
    }

    public SingletonImmutableSet(E e10, int i10) {
        this.f7980m = e10;
        this.n = i10;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f7980m.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e(Object[] objArr, int i10) {
        objArr[i10] = this.f7980m;
        return i10 + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.n;
        if (i10 == 0) {
            i10 = this.f7980m.hashCode();
            this.n = i10;
        }
        return i10;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean l() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m */
    public x<E> iterator() {
        return new i(this.f7980m);
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> s() {
        return ImmutableList.x(this.f7980m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder m10 = a0.a.m('[');
        m10.append(this.f7980m.toString());
        m10.append(']');
        return m10.toString();
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean u() {
        return this.n != 0;
    }
}
