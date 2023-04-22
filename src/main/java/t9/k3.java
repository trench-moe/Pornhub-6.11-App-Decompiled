package t9;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class k3 extends AbstractList<String> implements RandomAccess, v1 {

    /* renamed from: c  reason: collision with root package name */
    public final v1 f15283c;

    public k3(v1 v1Var) {
        this.f15283c = v1Var;
    }

    @Override // t9.v1
    public final v1 c() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((u1) this.f15283c).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new j3(this);
    }

    @Override // t9.v1
    public final Object k(int i10) {
        return this.f15283c.k(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new i3(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15283c.size();
    }

    @Override // t9.v1
    public final List<?> zzh() {
        return this.f15283c.zzh();
    }
}
