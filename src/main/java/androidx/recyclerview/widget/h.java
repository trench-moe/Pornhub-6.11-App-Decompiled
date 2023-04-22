package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class h extends e0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f2988s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2989h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2990i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<e> f2991j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<d> f2992k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.z>> f2993l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<e>> f2994m = new ArrayList<>();
    public ArrayList<ArrayList<d>> n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2995o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2996p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2997q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f2998r = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2999c;

        public a(ArrayList arrayList) {
            this.f2999c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2999c.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                h hVar = h.this;
                RecyclerView.z zVar = eVar.f3010a;
                int i10 = eVar.f3011b;
                int i11 = eVar.f3012c;
                int i12 = eVar.d;
                int i13 = eVar.f3013e;
                Objects.requireNonNull(hVar);
                View view = zVar.f2885a;
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                if (i14 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i15 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                hVar.f2996p.add(zVar);
                animate.setDuration(hVar.f2816e).setListener(new k(hVar, zVar, i14, view, i15, animate)).start();
            }
            this.f2999c.clear();
            h.this.f2994m.remove(this.f2999c);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3001c;

        public b(ArrayList arrayList) {
            this.f3001c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3001c.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                h hVar = h.this;
                Objects.requireNonNull(hVar);
                RecyclerView.z zVar = dVar.f3005a;
                View view = null;
                View view2 = zVar == null ? null : zVar.f2885a;
                RecyclerView.z zVar2 = dVar.f3006b;
                if (zVar2 != null) {
                    view = zVar2.f2885a;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(hVar.f2817f);
                    hVar.f2998r.add(dVar.f3005a);
                    duration.translationX(dVar.f3008e - dVar.f3007c);
                    duration.translationY(dVar.f3009f - dVar.d);
                    duration.alpha(0.0f).setListener(new l(hVar, dVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    hVar.f2998r.add(dVar.f3006b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(hVar.f2817f).alpha(1.0f).setListener(new m(hVar, dVar, animate, view)).start();
                }
            }
            this.f3001c.clear();
            h.this.n.remove(this.f3001c);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3003c;

        public c(ArrayList arrayList) {
            this.f3003c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3003c.iterator();
            while (it.hasNext()) {
                RecyclerView.z zVar = (RecyclerView.z) it.next();
                h hVar = h.this;
                Objects.requireNonNull(hVar);
                View view = zVar.f2885a;
                ViewPropertyAnimator animate = view.animate();
                hVar.f2995o.add(zVar);
                animate.alpha(1.0f).setDuration(hVar.f2815c).setListener(new j(hVar, zVar, view, animate)).start();
            }
            this.f3003c.clear();
            h.this.f2993l.remove(this.f3003c);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.z f3005a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.z f3006b;

        /* renamed from: c  reason: collision with root package name */
        public int f3007c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f3008e;

        /* renamed from: f  reason: collision with root package name */
        public int f3009f;

        public d(RecyclerView.z zVar, RecyclerView.z zVar2, int i10, int i11, int i12, int i13) {
            this.f3005a = zVar;
            this.f3006b = zVar2;
            this.f3007c = i10;
            this.d = i11;
            this.f3008e = i12;
            this.f3009f = i13;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("ChangeInfo{oldHolder=");
            m10.append(this.f3005a);
            m10.append(", newHolder=");
            m10.append(this.f3006b);
            m10.append(", fromX=");
            m10.append(this.f3007c);
            m10.append(", fromY=");
            m10.append(this.d);
            m10.append(", toX=");
            m10.append(this.f3008e);
            m10.append(", toY=");
            return android.support.v4.media.a.i(m10, this.f3009f, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.z f3010a;

        /* renamed from: b  reason: collision with root package name */
        public int f3011b;

        /* renamed from: c  reason: collision with root package name */
        public int f3012c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f3013e;

        public e(RecyclerView.z zVar, int i10, int i11, int i12, int i13) {
            this.f3010a = zVar;
            this.f3011b = i10;
            this.f3012c = i11;
            this.d = i12;
            this.f3013e = i13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean c(RecyclerView.z zVar, List<Object> list) {
        return !list.isEmpty() || super.c(zVar, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void f(RecyclerView.z zVar) {
        View view = zVar.f2885a;
        view.animate().cancel();
        int size = this.f2991j.size();
        loop0: while (true) {
            while (true) {
                size--;
                if (size < 0) {
                    break loop0;
                } else if (this.f2991j.get(size).f3010a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    d(zVar);
                    this.f2991j.remove(size);
                }
            }
        }
        q(this.f2992k, zVar);
        if (this.f2989h.remove(zVar)) {
            view.setAlpha(1.0f);
            d(zVar);
        }
        if (this.f2990i.remove(zVar)) {
            view.setAlpha(1.0f);
            d(zVar);
        }
        int size2 = this.n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<d> arrayList = this.n.get(size2);
            q(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        int size3 = this.f2994m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<e> arrayList2 = this.f2994m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f3010a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    d(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2994m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f2993l.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f2997q.remove(zVar);
                this.f2995o.remove(zVar);
                this.f2998r.remove(zVar);
                this.f2996p.remove(zVar);
                p();
                return;
            }
            ArrayList<RecyclerView.z> arrayList3 = this.f2993l.get(size5);
            if (arrayList3.remove(zVar)) {
                view.setAlpha(1.0f);
                d(zVar);
                if (arrayList3.isEmpty()) {
                    this.f2993l.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void g() {
        int size = this.f2991j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = this.f2991j.get(size);
            View view = eVar.f3010a.f2885a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            d(eVar.f3010a);
            this.f2991j.remove(size);
        }
        int size2 = this.f2989h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            d(this.f2989h.get(size2));
            this.f2989h.remove(size2);
        }
        int size3 = this.f2990i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.z zVar = this.f2990i.get(size3);
            zVar.f2885a.setAlpha(1.0f);
            d(zVar);
            this.f2990i.remove(size3);
        }
        int size4 = this.f2992k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            d dVar = this.f2992k.get(size4);
            RecyclerView.z zVar2 = dVar.f3005a;
            if (zVar2 != null) {
                r(dVar, zVar2);
            }
            RecyclerView.z zVar3 = dVar.f3006b;
            if (zVar3 != null) {
                r(dVar, zVar3);
            }
        }
        this.f2992k.clear();
        if (!h()) {
            return;
        }
        int size5 = this.f2994m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<e> arrayList = this.f2994m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    e eVar2 = arrayList.get(size6);
                    View view2 = eVar2.f3010a.f2885a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    d(eVar2.f3010a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2994m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f2993l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.z> arrayList2 = this.f2993l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.z zVar4 = arrayList2.get(size8);
                    zVar4.f2885a.setAlpha(1.0f);
                    d(zVar4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2993l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.n.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                o(this.f2997q);
                o(this.f2996p);
                o(this.f2995o);
                o(this.f2998r);
                e();
                return;
            }
            ArrayList<d> arrayList3 = this.n.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    d dVar2 = arrayList3.get(size10);
                    RecyclerView.z zVar5 = dVar2.f3005a;
                    if (zVar5 != null) {
                        r(dVar2, zVar5);
                    }
                    RecyclerView.z zVar6 = dVar2.f3006b;
                    if (zVar6 != null) {
                        r(dVar2, zVar6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean h() {
        if (this.f2990i.isEmpty() && this.f2992k.isEmpty() && this.f2991j.isEmpty() && this.f2989h.isEmpty() && this.f2996p.isEmpty() && this.f2997q.isEmpty() && this.f2995o.isEmpty() && this.f2998r.isEmpty() && this.f2994m.isEmpty() && this.f2993l.isEmpty()) {
            if (this.n.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void j() {
        boolean z10 = !this.f2989h.isEmpty();
        boolean z11 = !this.f2991j.isEmpty();
        boolean z12 = !this.f2992k.isEmpty();
        boolean z13 = !this.f2990i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.z> it = this.f2989h.iterator();
            while (it.hasNext()) {
                RecyclerView.z next = it.next();
                View view = next.f2885a;
                ViewPropertyAnimator animate = view.animate();
                this.f2997q.add(next);
                animate.setDuration(this.d).alpha(0.0f).setListener(new i(this, next, animate, view)).start();
            }
            this.f2989h.clear();
            if (z11) {
                ArrayList<e> arrayList = new ArrayList<>();
                arrayList.addAll(this.f2991j);
                this.f2994m.add(arrayList);
                this.f2991j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    View view2 = arrayList.get(0).f3010a.f2885a;
                    long j10 = this.d;
                    WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                    x.d.n(view2, aVar, j10);
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<d> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f2992k);
                this.n.add(arrayList2);
                this.f2992k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    View view3 = arrayList2.get(0).f3005a.f2885a;
                    long j11 = this.d;
                    WeakHashMap<View, n0.a0> weakHashMap2 = n0.x.f13156a;
                    x.d.n(view3, bVar, j11);
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.z> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f2990i);
                this.f2993l.add(arrayList3);
                this.f2990i.clear();
                c cVar = new c(arrayList3);
                if (!z10 && !z11) {
                    if (!z12) {
                        cVar.run();
                        return;
                    }
                }
                long j12 = z10 ? this.d : 0L;
                long j13 = z11 ? this.f2816e : 0L;
                long j14 = z12 ? this.f2817f : 0L;
                View view4 = arrayList3.get(0).f2885a;
                WeakHashMap<View, n0.a0> weakHashMap3 = n0.x.f13156a;
                x.d.n(view4, cVar, Math.max(j13, j14) + j12);
            }
        }
    }

    @Override // androidx.recyclerview.widget.e0
    public boolean k(RecyclerView.z zVar) {
        s(zVar);
        zVar.f2885a.setAlpha(0.0f);
        this.f2990i.add(zVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.e0
    public boolean l(RecyclerView.z zVar, RecyclerView.z zVar2, int i10, int i11, int i12, int i13) {
        if (zVar == zVar2) {
            return m(zVar, i10, i11, i12, i13);
        }
        float translationX = zVar.f2885a.getTranslationX();
        float translationY = zVar.f2885a.getTranslationY();
        float alpha = zVar.f2885a.getAlpha();
        s(zVar);
        zVar.f2885a.setTranslationX(translationX);
        zVar.f2885a.setTranslationY(translationY);
        zVar.f2885a.setAlpha(alpha);
        s(zVar2);
        zVar2.f2885a.setTranslationX(-((int) ((i12 - i10) - translationX)));
        zVar2.f2885a.setTranslationY(-((int) ((i13 - i11) - translationY)));
        zVar2.f2885a.setAlpha(0.0f);
        this.f2992k.add(new d(zVar, zVar2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.e0
    public boolean m(RecyclerView.z zVar, int i10, int i11, int i12, int i13) {
        View view = zVar.f2885a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) zVar.f2885a.getTranslationY());
        s(zVar);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            d(zVar);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f2991j.add(new e(zVar, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.e0
    public boolean n(RecyclerView.z zVar) {
        s(zVar);
        this.f2989h.add(zVar);
        return true;
    }

    public void o(List<RecyclerView.z> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            list.get(size).f2885a.animate().cancel();
        }
    }

    public void p() {
        if (!h()) {
            e();
        }
    }

    public final void q(List<d> list, RecyclerView.z zVar) {
        int size = list.size();
        while (true) {
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                d dVar = list.get(size);
                if (r(dVar, zVar) && dVar.f3005a == null && dVar.f3006b == null) {
                    list.remove(dVar);
                }
            }
        }
    }

    public final boolean r(d dVar, RecyclerView.z zVar) {
        if (dVar.f3006b == zVar) {
            dVar.f3006b = null;
        } else if (dVar.f3005a != zVar) {
            return false;
        } else {
            dVar.f3005a = null;
        }
        zVar.f2885a.setAlpha(1.0f);
        zVar.f2885a.setTranslationX(0.0f);
        zVar.f2885a.setTranslationY(0.0f);
        d(zVar);
        return true;
    }

    public final void s(RecyclerView.z zVar) {
        if (f2988s == null) {
            f2988s = new ValueAnimator().getInterpolator();
        }
        zVar.f2885a.animate().setInterpolator(f2988s);
        f(zVar);
    }
}
