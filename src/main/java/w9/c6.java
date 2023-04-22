package w9;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.measurement.zzix;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class c6 extends z4 implements RandomAccess, d6 {

    /* renamed from: f  reason: collision with root package name */
    public final List f17096f;

    static {
        new c6(10).f17389c = false;
    }

    public c6() {
        this(10);
    }

    public c6(int i10) {
        this.f17096f = new ArrayList(i10);
    }

    public c6(ArrayList arrayList) {
        this.f17096f = arrayList;
    }

    public static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzix) {
            zzix zzixVar = (zzix) obj;
            return zzixVar.g() == 0 ? BuildConfig.FLAVOR : zzixVar.l(b6.f17081a);
        }
        return new String((byte[]) obj, b6.f17081a);
    }

    @Override // w9.d6
    public final Object F(int i10) {
        return this.f17096f.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        b();
        this.f17096f.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof d6) {
            collection = ((d6) collection).zzh();
        }
        boolean addAll = this.f17096f.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // w9.z4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // w9.z4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f17096f.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // w9.d6
    public final d6 d() {
        return this.f17389c ? new r7(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i10) {
        Object obj = this.f17096f.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzix) {
            zzix zzixVar = (zzix) obj;
            String l10 = zzixVar.g() == 0 ? BuildConfig.FLAVOR : zzixVar.l(b6.f17081a);
            if (zzixVar.o()) {
                this.f17096f.set(i10, l10);
            }
            return l10;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, b6.f17081a);
        if (com.google.android.gms.internal.measurement.h.f6998a.A(bArr, 0, bArr.length)) {
            this.f17096f.set(i10, str);
        }
        return str;
    }

    @Override // w9.a6
    public final /* bridge */ /* synthetic */ a6 i(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f17096f);
            return new c6(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // w9.d6
    public final void n(zzix zzixVar) {
        b();
        this.f17096f.add(zzixVar);
        ((AbstractList) this).modCount++;
    }

    @Override // w9.z4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        Object remove = this.f17096f.remove(i10);
        ((AbstractList) this).modCount++;
        return g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        b();
        return g(this.f17096f.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17096f.size();
    }

    @Override // w9.d6
    public final List zzh() {
        return Collections.unmodifiableList(this.f17096f);
    }
}
