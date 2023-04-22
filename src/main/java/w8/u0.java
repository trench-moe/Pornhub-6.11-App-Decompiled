package w8;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import w8.d;
import w8.g;

/* loaded from: classes2.dex */
public final class u0 extends g.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f17047a;

    public u0(d dVar) {
        this.f17047a = dVar;
    }

    @Override // w8.g.a
    public final void d() {
        long e10 = this.f17047a.e();
        d dVar = this.f17047a;
        if (e10 != dVar.f16964b) {
            dVar.f16964b = e10;
            dVar.c();
            d dVar2 = this.f17047a;
            if (dVar2.f16964b != 0) {
                dVar2.d();
            }
        }
    }

    @Override // w8.g.a
    public final void e(int[] iArr) {
        List<Integer> g10 = a9.a.g(iArr);
        if (this.f17047a.d.equals(g10)) {
            return;
        }
        this.f17047a.h();
        this.f17047a.f16967f.evictAll();
        this.f17047a.f16968g.clear();
        d dVar = this.f17047a;
        dVar.d = g10;
        d.b(dVar);
        this.f17047a.g();
        this.f17047a.f();
    }

    @Override // w8.g.a
    public final void f(int[] iArr, int i10) {
        int i11;
        int length = iArr.length;
        if (i10 == 0) {
            i11 = this.f17047a.d.size();
        } else {
            i11 = this.f17047a.f16966e.get(i10, -1);
            if (i11 == -1) {
                this.f17047a.d();
                return;
            }
        }
        this.f17047a.h();
        this.f17047a.d.addAll(i11, a9.a.g(iArr));
        d.b(this.f17047a);
        for (d.a aVar : this.f17047a.f16974m) {
            Objects.requireNonNull(aVar);
        }
        this.f17047a.f();
    }

    @Override // w8.g.a
    public final void g(u8.m[] mVarArr) {
        HashSet hashSet = new HashSet();
        this.f17047a.f16968g.clear();
        for (u8.m mVar : mVarArr) {
            int i10 = mVar.f15727f;
            this.f17047a.f16967f.put(Integer.valueOf(i10), mVar);
            int i11 = this.f17047a.f16966e.get(i10, -1);
            if (i11 == -1) {
                this.f17047a.d();
                return;
            }
            hashSet.add(Integer.valueOf(i11));
        }
        for (Integer num : this.f17047a.f16968g) {
            int i12 = this.f17047a.f16966e.get(num.intValue(), -1);
            if (i12 != -1) {
                hashSet.add(Integer.valueOf(i12));
            }
        }
        this.f17047a.f16968g.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f17047a.h();
        d.a(this.f17047a, a9.a.i(arrayList));
        this.f17047a.f();
    }

    @Override // w8.g.a
    public final void h(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            this.f17047a.f16967f.remove(Integer.valueOf(i10));
            int i11 = this.f17047a.f16966e.get(i10, -1);
            if (i11 == -1) {
                this.f17047a.d();
                return;
            }
            this.f17047a.f16966e.delete(i10);
            arrayList.add(Integer.valueOf(i11));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        this.f17047a.h();
        this.f17047a.d.removeAll(a9.a.g(iArr));
        d.b(this.f17047a);
        d dVar = this.f17047a;
        a9.a.i(arrayList);
        for (d.a aVar : dVar.f16974m) {
            Objects.requireNonNull(aVar);
        }
        this.f17047a.f();
    }

    @Override // w8.g.a
    public final void i(List<Integer> list, List<Integer> list2, int i10) {
        ArrayList arrayList = new ArrayList();
        if (i10 == 0) {
            this.f17047a.d.size();
        } else if (list2.isEmpty()) {
            a9.b bVar = this.f17047a.f16963a;
            Log.w(bVar.f254a, bVar.e("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
        } else if (this.f17047a.f16966e.get(i10, -1) == -1) {
            this.f17047a.f16966e.get(list2.get(0).intValue(), -1);
        }
        for (Integer num : list2) {
            int i11 = this.f17047a.f16966e.get(num.intValue(), -1);
            if (i11 == -1) {
                this.f17047a.d();
                return;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        this.f17047a.h();
        d dVar = this.f17047a;
        dVar.d = list;
        d.b(dVar);
        for (d.a aVar : this.f17047a.f16974m) {
            Objects.requireNonNull(aVar);
        }
        this.f17047a.f();
    }

    @Override // w8.g.a
    public final void j(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            this.f17047a.f16967f.remove(Integer.valueOf(i10));
            int i11 = this.f17047a.f16966e.get(i10, -1);
            if (i11 == -1) {
                this.f17047a.d();
                return;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        Collections.sort(arrayList);
        this.f17047a.h();
        d.a(this.f17047a, a9.a.i(arrayList));
        this.f17047a.f();
    }

    @Override // w8.g.a
    public final void k() {
        this.f17047a.d();
    }
}
