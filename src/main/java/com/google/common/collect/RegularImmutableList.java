package com.google.common.collect;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList<Object> n = new RegularImmutableList(new Object[0], 0);

    /* renamed from: j  reason: collision with root package name */
    public final transient Object[] f7964j;

    /* renamed from: m  reason: collision with root package name */
    public final transient int f7965m;

    public RegularImmutableList(Object[] objArr, int i10) {
        this.f7964j = objArr;
        this.f7965m = i10;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int e(Object[] objArr, int i10) {
        System.arraycopy(this.f7964j, 0, objArr, i10, this.f7965m);
        return i10 + this.f7965m;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] g() {
        return this.f7964j;
    }

    @Override // java.util.List
    public E get(int i10) {
        jb.e.d(i10, this.f7965m);
        return (E) this.f7964j[i10];
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int h() {
        return this.f7965m;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int j() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7965m;
    }
}
