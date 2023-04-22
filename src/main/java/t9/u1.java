package t9;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.cast.zzoe;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class u1 extends x0<String> implements RandomAccess, v1 {

    /* renamed from: f  reason: collision with root package name */
    public final List<Object> f15357f;

    static {
        new u1(10).f15365c = false;
    }

    public u1() {
        this(10);
    }

    public u1(int i10) {
        this.f15357f = new ArrayList(i10);
    }

    public u1(ArrayList<Object> arrayList) {
        this.f15357f = arrayList;
    }

    public static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzoe) {
            zzoe zzoeVar = (zzoe) obj;
            return zzoeVar.g() == 0 ? BuildConfig.FLAVOR : zzoeVar.l(t1.f15353a);
        }
        return new String((byte[]) obj, t1.f15353a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        b();
        this.f15357f.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // t9.x0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof v1) {
            collection = ((v1) collection).zzh();
        }
        boolean addAll = this.f15357f.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // t9.x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // t9.v1
    public final v1 c() {
        return this.f15365c ? new k3(this) : this;
    }

    @Override // t9.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f15357f.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i10) {
        Object obj = this.f15357f.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzoe) {
            zzoe zzoeVar = (zzoe) obj;
            String l10 = zzoeVar.g() == 0 ? BuildConfig.FLAVOR : zzoeVar.l(t1.f15353a);
            if (zzoeVar.o()) {
                this.f15357f.set(i10, l10);
            }
            return l10;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, t1.f15353a);
        if (com.google.android.gms.internal.cast.o1.f6907a.f(bArr, 0, bArr.length)) {
            this.f15357f.set(i10, str);
        }
        return str;
    }

    @Override // t9.v1
    public final Object k(int i10) {
        return this.f15357f.get(i10);
    }

    @Override // t9.x0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        b();
        Object remove = this.f15357f.remove(i10);
        ((AbstractList) this).modCount++;
        return g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        b();
        return g(this.f15357f.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15357f.size();
    }

    @Override // t9.s1
    public final /* bridge */ /* synthetic */ s1 zzg(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f15357f);
            return new u1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // t9.v1
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.f15357f);
    }
}
