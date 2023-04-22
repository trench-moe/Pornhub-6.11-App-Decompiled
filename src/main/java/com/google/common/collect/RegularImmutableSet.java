package com.google.common.collect;

import kb.x;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final RegularImmutableSet<Object> y = new RegularImmutableSet<>(new Object[0], 0, null, 0, 0);

    /* renamed from: m  reason: collision with root package name */
    public final transient Object[] f7975m;
    public final transient Object[] n;

    /* renamed from: t  reason: collision with root package name */
    public final transient int f7976t;

    /* renamed from: u  reason: collision with root package name */
    public final transient int f7977u;

    /* renamed from: w  reason: collision with root package name */
    public final transient int f7978w;

    public RegularImmutableSet(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f7975m = objArr;
        this.n = objArr2;
        this.f7976t = i11;
        this.f7977u = i10;
        this.f7978w = i12;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.n;
        if (obj == null || objArr == null) {
            return false;
        }
        int c10 = kb.f.c(obj);
        while (true) {
            int i10 = c10 & this.f7976t;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e(Object[] objArr, int i10) {
        System.arraycopy(this.f7975m, 0, objArr, i10, this.f7978w);
        return i10 + this.f7978w;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] g() {
        return this.f7975m;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int h() {
        return this.f7978w;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f7977u;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int j() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean l() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m */
    public x<E> iterator() {
        return b().listIterator();
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> s() {
        return ImmutableList.p(this.f7975m, this.f7978w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7978w;
    }
}
