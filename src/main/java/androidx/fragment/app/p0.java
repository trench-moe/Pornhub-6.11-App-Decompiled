package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2224a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f2225b = new q0();

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f2226c;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f2227a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2228b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.fragment.app.a f2229c;
        public Fragment d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2230e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.fragment.app.a f2231f;
    }

    static {
        r0 r0Var;
        try {
            r0Var = (r0) androidx.transition.b.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            r0Var = null;
        }
        f2226c = r0Var;
    }

    public static void a(ArrayList<View> arrayList, p.a<String, View> aVar, Collection<String> collection) {
        for (int i10 = aVar.f13768j - 1; i10 >= 0; i10--) {
            View l10 = aVar.l(i10);
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            if (collection.contains(x.i.k(l10))) {
                arrayList.add(l10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
        if (r0.P != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0096, code lost:
        if (r0.P == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(androidx.fragment.app.a r10, androidx.fragment.app.i0.a r11, android.util.SparseArray<androidx.fragment.app.p0.b> r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p0.b(androidx.fragment.app.a, androidx.fragment.app.i0$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(Fragment fragment, Fragment fragment2, boolean z10, p.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.t();
        } else {
            fragment.t();
        }
    }

    public static boolean d(r0 r0Var, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!r0Var.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static p.a<String, View> e(r0 r0Var, p.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        Fragment fragment = bVar.f2227a;
        View view = fragment.W;
        if (!aVar.isEmpty() && obj != null) {
            if (view != null) {
                p.a<String, View> aVar2 = new p.a<>();
                r0Var.i(aVar2, view);
                androidx.fragment.app.a aVar3 = bVar.f2229c;
                if (bVar.f2228b) {
                    fragment.w();
                    arrayList = aVar3.n;
                } else {
                    fragment.t();
                    arrayList = aVar3.f2163o;
                }
                if (arrayList != null) {
                    p.f.k(aVar2, arrayList);
                    p.f.k(aVar2, aVar.values());
                }
                m(aVar, aVar2);
                return aVar2;
            }
        }
        aVar.clear();
        return null;
    }

    public static p.a<String, View> f(r0 r0Var, p.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        if (!aVar.isEmpty() && obj != null) {
            Fragment fragment = bVar.d;
            p.a<String, View> aVar2 = new p.a<>();
            r0Var.i(aVar2, fragment.v0());
            androidx.fragment.app.a aVar3 = bVar.f2231f;
            if (bVar.f2230e) {
                fragment.t();
                arrayList = aVar3.f2163o;
            } else {
                fragment.w();
                arrayList = aVar3.n;
            }
            if (arrayList != null) {
                p.f.k(aVar2, arrayList);
            }
            p.f.k(aVar, aVar2.keySet());
            return aVar2;
        }
        aVar.clear();
        return null;
    }

    public static r0 g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            fragment.v();
            Object F = fragment.F();
            if (F != null) {
                arrayList.add(F);
            }
            Object H = fragment.H();
            if (H != null) {
                arrayList.add(H);
            }
        }
        if (fragment2 != null) {
            fragment2.s();
            Object D = fragment2.D();
            if (D != null) {
                arrayList.add(D);
            }
            fragment2.G();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        r0 r0Var = f2225b;
        if (d(r0Var, arrayList)) {
            return r0Var;
        }
        r0 r0Var2 = f2226c;
        if (r0Var2 == null || !d(r0Var2, arrayList)) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return r0Var2;
    }

    public static ArrayList<View> h(r0 r0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2;
        if (obj != null) {
            arrayList2 = new ArrayList<>();
            View view2 = fragment.W;
            if (view2 != null) {
                r0Var.f(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                r0Var.b(obj, arrayList2);
                return arrayList2;
            }
        } else {
            arrayList2 = null;
        }
        return arrayList2;
    }

    public static Object i(r0 r0Var, Fragment fragment, boolean z10) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            obj = fragment.D();
        } else {
            fragment.s();
        }
        return r0Var.g(obj);
    }

    public static Object j(r0 r0Var, Fragment fragment, boolean z10) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            obj = fragment.F();
        } else {
            fragment.v();
        }
        return r0Var.g(obj);
    }

    public static View k(p.a<String, View> aVar, b bVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = bVar.f2229c;
        if (obj == null || aVar == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get(z10 ? aVar2.n.get(0) : aVar2.f2163o.get(0));
    }

    public static Object l(r0 r0Var, Fragment fragment, Fragment fragment2, boolean z10) {
        Object obj;
        if (z10) {
            obj = fragment2.H();
        } else {
            fragment.G();
            obj = null;
        }
        return r0Var.y(r0Var.g(obj));
    }

    public static void m(p.a<String, String> aVar, p.a<String, View> aVar2) {
        int i10 = aVar.f13768j;
        while (true) {
            while (true) {
                i10--;
                if (i10 < 0) {
                    return;
                }
                if (!aVar2.containsKey(aVar.l(i10))) {
                    aVar.j(i10);
                }
            }
        }
    }

    public static void n(r0 r0Var, Object obj, Object obj2, p.a<String, View> aVar, boolean z10, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get(z10 ? aVar2.f2163o.get(0) : aVar2.n.get(0));
        r0Var.t(obj, view);
        if (obj2 != null) {
            r0Var.t(obj2, view);
        }
    }

    public static void o(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(android.content.Context r37, af.c r38, java.util.ArrayList<androidx.fragment.app.a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, androidx.fragment.app.p0.a r44) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p0.p(android.content.Context, af.c, java.util.ArrayList, java.util.ArrayList, int, int, boolean, androidx.fragment.app.p0$a):void");
    }
}
