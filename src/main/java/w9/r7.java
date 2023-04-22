package w9;

import com.google.android.gms.internal.measurement.zzix;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class r7 extends AbstractList implements RandomAccess, d6 {

    /* renamed from: c  reason: collision with root package name */
    public final d6 f17297c;

    public r7(d6 d6Var) {
        this.f17297c = d6Var;
    }

    @Override // w9.d6
    public final Object F(int i10) {
        return this.f17297c.F(i10);
    }

    @Override // w9.d6
    public final d6 d() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((c6) this.f17297c).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new t9.j3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new t9.i3(this, i10);
    }

    @Override // w9.d6
    public final void n(zzix zzixVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17297c.size();
    }

    @Override // w9.d6
    public final List zzh() {
        return this.f17297c.zzh();
    }
}
