package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;
import p.f;

/* loaded from: classes.dex */
public class c extends SpecialEffectsController {

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List f2096c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController.Operation f2097f;

        public a(List list, SpecialEffectsController.Operation operation) {
            this.f2096c = list;
            this.f2097f = operation;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2096c.contains(this.f2097f)) {
                this.f2096c.remove(this.f2097f);
                c cVar = c.this;
                SpecialEffectsController.Operation operation = this.f2097f;
                Objects.requireNonNull(cVar);
                operation.f2052a.b(operation.f2054c.W);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends C0029c {

        /* renamed from: c  reason: collision with root package name */
        public boolean f2099c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public s.a f2100e;

        public b(SpecialEffectsController.Operation operation, i0.b bVar, boolean z10) {
            super(operation, bVar);
            this.d = false;
            this.f2099c = z10;
        }

        public s.a c(Context context) {
            if (this.d) {
                return this.f2100e;
            }
            SpecialEffectsController.Operation operation = this.f2101a;
            s.a a10 = s.a(context, operation.f2054c, operation.f2052a == SpecialEffectsController.Operation.State.VISIBLE, this.f2099c);
            this.f2100e = a10;
            this.d = true;
            return a10;
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0029c {

        /* renamed from: a  reason: collision with root package name */
        public final SpecialEffectsController.Operation f2101a;

        /* renamed from: b  reason: collision with root package name */
        public final i0.b f2102b;

        public C0029c(SpecialEffectsController.Operation operation, i0.b bVar) {
            this.f2101a = operation;
            this.f2102b = bVar;
        }

        public void a() {
            SpecialEffectsController.Operation operation = this.f2101a;
            if (operation.f2055e.remove(this.f2102b) && operation.f2055e.isEmpty()) {
                operation.b();
            }
        }

        public boolean b() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State d = SpecialEffectsController.Operation.State.d(this.f2101a.f2054c.W);
            SpecialEffectsController.Operation.State state2 = this.f2101a.f2052a;
            if (d != state2 && (d == (state = SpecialEffectsController.Operation.State.VISIBLE) || state2 == state)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends C0029c {

        /* renamed from: c  reason: collision with root package name */
        public final Object f2103c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f2104e;

        public d(SpecialEffectsController.Operation operation, i0.b bVar, boolean z10, boolean z11) {
            super(operation, bVar);
            Object obj;
            Object obj2;
            if (operation.f2052a == SpecialEffectsController.Operation.State.VISIBLE) {
                if (z10) {
                    obj2 = operation.f2054c.D();
                } else {
                    operation.f2054c.s();
                    obj2 = null;
                }
                this.f2103c = obj2;
                if (z10) {
                    Fragment.b bVar2 = operation.f2054c.Z;
                } else {
                    Fragment.b bVar3 = operation.f2054c.Z;
                }
                this.d = true;
            } else {
                if (z10) {
                    obj = operation.f2054c.F();
                } else {
                    operation.f2054c.v();
                    obj = null;
                }
                this.f2103c = obj;
                this.d = true;
            }
            if (!z11) {
                this.f2104e = null;
            } else if (z10) {
                this.f2104e = operation.f2054c.H();
            } else {
                operation.f2054c.G();
                this.f2104e = null;
            }
        }

        public final r0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            r0 r0Var = p0.f2225b;
            if (obj instanceof Transition) {
                return r0Var;
            }
            r0 r0Var2 = p0.f2226c;
            if (r0Var2 == null || !r0Var2.e(obj)) {
                throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f2101a.f2054c + " is not a valid framework Transition or AndroidX Transition");
            }
            return r0Var2;
        }
    }

    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SpecialEffectsController
    public void b(List<SpecialEffectsController.Operation> list, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        SpecialEffectsController.Operation.State state;
        String str;
        String str2;
        Iterator it;
        SpecialEffectsController.Operation operation;
        Object obj;
        SpecialEffectsController.Operation.State state2;
        View view;
        SpecialEffectsController.Operation.State state3;
        View view2;
        Object m10;
        Object obj2;
        SpecialEffectsController.Operation operation2;
        ArrayList<View> arrayList3;
        SpecialEffectsController.Operation.State state4;
        p.a aVar;
        ArrayList arrayList4;
        ArrayList arrayList5;
        HashMap hashMap2;
        String str3;
        ArrayList<View> arrayList6;
        SpecialEffectsController.Operation operation3;
        View view3;
        r0 r0Var;
        Rect rect;
        ArrayList<String> arrayList7;
        ArrayList<String> arrayList8;
        ArrayList<String> arrayList9;
        ArrayList<String> arrayList10;
        int i10;
        View view4;
        boolean z11 = z10;
        SpecialEffectsController.Operation.State state5 = SpecialEffectsController.Operation.State.GONE;
        SpecialEffectsController.Operation.State state6 = SpecialEffectsController.Operation.State.VISIBLE;
        SpecialEffectsController.Operation operation4 = null;
        SpecialEffectsController.Operation operation5 = null;
        for (SpecialEffectsController.Operation operation6 : list) {
            SpecialEffectsController.Operation.State d10 = SpecialEffectsController.Operation.State.d(operation6.f2054c.W);
            int ordinal = operation6.f2052a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                    }
                } else if (d10 != state6) {
                    operation5 = operation6;
                }
            }
            if (d10 == state6 && operation4 == null) {
                operation4 = operation6;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list);
        Iterator<SpecialEffectsController.Operation> it2 = list.iterator();
        while (it2.hasNext()) {
            SpecialEffectsController.Operation next = it2.next();
            i0.b bVar = new i0.b();
            next.d();
            next.f2055e.add(bVar);
            arrayList11.add(new b(next, bVar, z11));
            i0.b bVar2 = new i0.b();
            next.d();
            next.f2055e.add(bVar2);
            arrayList12.add(new d(next, bVar2, z11, !z11 ? next != operation5 : next != operation4));
            next.d.add(new a(arrayList13, next));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it3 = arrayList12.iterator();
        r0 r0Var2 = null;
        while (it3.hasNext()) {
            d dVar = (d) it3.next();
            if (!dVar.b()) {
                r0 c10 = dVar.c(dVar.f2103c);
                r0 c11 = dVar.c(dVar.f2104e);
                if (c10 != null && c11 != null && c10 != c11) {
                    StringBuilder m11 = a1.a.m("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    m11.append(dVar.f2101a.f2054c);
                    m11.append(" returned Transition ");
                    m11.append(dVar.f2103c);
                    m11.append(" which uses a different Transition  type than its shared element transition ");
                    m11.append(dVar.f2104e);
                    throw new IllegalArgumentException(m11.toString());
                }
                if (c10 == null) {
                    c10 = c11;
                }
                if (r0Var2 == null) {
                    r0Var2 = c10;
                } else if (c10 != null && r0Var2 != c10) {
                    StringBuilder m12 = a1.a.m("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    m12.append(dVar.f2101a.f2054c);
                    m12.append(" returned Transition ");
                    m12.append(dVar.f2103c);
                    m12.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(m12.toString());
                }
            }
        }
        if (r0Var2 == null) {
            Iterator it4 = arrayList12.iterator();
            while (it4.hasNext()) {
                d dVar2 = (d) it4.next();
                hashMap3.put(dVar2.f2101a, Boolean.FALSE);
                dVar2.a();
            }
            state = state5;
            arrayList = arrayList11;
            arrayList2 = arrayList13;
            hashMap = hashMap3;
            str = "FragmentManager";
        } else {
            View view5 = new View(this.f2048a.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList14 = new ArrayList<>();
            ArrayList<View> arrayList15 = new ArrayList<>();
            arrayList = arrayList11;
            p.a aVar2 = new p.a();
            Iterator it5 = arrayList12.iterator();
            Rect rect3 = rect2;
            Object obj3 = null;
            View view6 = null;
            boolean z12 = false;
            View view7 = view5;
            String str4 = "FragmentManager";
            SpecialEffectsController.Operation operation7 = operation4;
            SpecialEffectsController.Operation operation8 = operation5;
            while (it5.hasNext()) {
                SpecialEffectsController.Operation.State state7 = state6;
                Object obj4 = ((d) it5.next()).f2104e;
                if (!(obj4 != null) || operation7 == null || operation8 == null) {
                    arrayList3 = arrayList14;
                    state4 = state5;
                    aVar = aVar2;
                    arrayList4 = arrayList12;
                    arrayList5 = arrayList13;
                    hashMap2 = hashMap3;
                    str3 = str4;
                    arrayList6 = arrayList15;
                    operation3 = operation5;
                    view3 = view7;
                    r0Var = r0Var2;
                    rect = rect3;
                } else {
                    Object y = r0Var2.y(r0Var2.g(obj4));
                    Fragment.b bVar3 = operation8.f2054c.Z;
                    if (bVar3 == null || (arrayList7 = bVar3.f2031i) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    r0 r0Var3 = r0Var2;
                    Fragment.b bVar4 = operation7.f2054c.Z;
                    if (bVar4 == null || (arrayList8 = bVar4.f2031i) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    arrayList5 = arrayList13;
                    Fragment.b bVar5 = operation7.f2054c.Z;
                    if (bVar5 == null || (arrayList9 = bVar5.f2032j) == null) {
                        arrayList9 = new ArrayList<>();
                    }
                    state4 = state5;
                    arrayList4 = arrayList12;
                    int i11 = 0;
                    while (i11 < arrayList9.size()) {
                        int indexOf = arrayList7.indexOf(arrayList9.get(i11));
                        ArrayList<String> arrayList16 = arrayList9;
                        if (indexOf != -1) {
                            arrayList7.set(indexOf, arrayList8.get(i11));
                        }
                        i11++;
                        arrayList9 = arrayList16;
                    }
                    Fragment.b bVar6 = operation8.f2054c.Z;
                    if (bVar6 == null || (arrayList10 = bVar6.f2032j) == null) {
                        arrayList10 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList17 = arrayList10;
                    if (z11) {
                        operation7.f2054c.t();
                        operation8.f2054c.w();
                    } else {
                        operation7.f2054c.w();
                        operation8.f2054c.t();
                    }
                    int i12 = 0;
                    for (int size = arrayList7.size(); i12 < size; size = size) {
                        aVar2.put(arrayList7.get(i12), arrayList17.get(i12));
                        i12++;
                    }
                    p.a<String, View> aVar3 = new p.a<>();
                    k(aVar3, operation7.f2054c.W);
                    p.f.k(aVar3, arrayList7);
                    p.f.k(aVar2, aVar3.keySet());
                    p.a<String, View> aVar4 = new p.a<>();
                    k(aVar4, operation8.f2054c.W);
                    p.f.k(aVar4, arrayList17);
                    p.f.k(aVar4, aVar2.values());
                    p0.m(aVar2, aVar4);
                    l(aVar3, aVar2.keySet());
                    l(aVar4, aVar2.values());
                    if (aVar2.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        obj3 = null;
                        rect = rect3;
                        arrayList3 = arrayList14;
                        aVar = aVar2;
                        hashMap2 = hashMap3;
                        str3 = str4;
                        arrayList6 = arrayList15;
                        operation3 = operation5;
                        view3 = view7;
                        r0Var = r0Var3;
                    } else {
                        p0.c(operation8.f2054c, operation7.f2054c, z11, aVar3, true);
                        arrayList3 = arrayList14;
                        aVar = aVar2;
                        Rect rect4 = rect3;
                        ArrayList<String> arrayList18 = arrayList7;
                        SpecialEffectsController.Operation operation9 = operation5;
                        SpecialEffectsController.Operation operation10 = operation5;
                        HashMap hashMap4 = hashMap3;
                        View view8 = view7;
                        arrayList6 = arrayList15;
                        SpecialEffectsController.Operation operation11 = operation4;
                        str3 = str4;
                        r0Var = r0Var3;
                        n0.q.a(this.f2048a, new h(this, operation9, operation4, z10, aVar4));
                        arrayList3.addAll(aVar3.values());
                        if (arrayList18.isEmpty()) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            View view9 = aVar3.get(arrayList18.get(0));
                            r0Var.t(y, view9);
                            view6 = view9;
                        }
                        arrayList6.addAll(aVar4.values());
                        if (arrayList17.isEmpty() || (view4 = aVar4.get(arrayList17.get(i10))) == null) {
                            rect = rect4;
                            view3 = view8;
                        } else {
                            rect = rect4;
                            n0.q.a(this.f2048a, new i(this, r0Var, view4, rect));
                            view3 = view8;
                            z12 = true;
                        }
                        r0Var.w(y, view3, arrayList3);
                        r0Var.r(y, null, null, null, null, y, arrayList6);
                        Boolean bool = Boolean.TRUE;
                        hashMap2 = hashMap4;
                        operation4 = operation11;
                        hashMap2.put(operation4, bool);
                        operation3 = operation10;
                        hashMap2.put(operation3, bool);
                        obj3 = y;
                        operation7 = operation4;
                        operation8 = operation3;
                    }
                }
                view7 = view3;
                rect3 = rect;
                arrayList14 = arrayList3;
                r0Var2 = r0Var;
                operation5 = operation3;
                arrayList15 = arrayList6;
                state6 = state7;
                arrayList13 = arrayList5;
                arrayList12 = arrayList4;
                aVar2 = aVar;
                str4 = str3;
                z11 = z10;
                hashMap3 = hashMap2;
                state5 = state4;
            }
            ArrayList<View> arrayList19 = arrayList14;
            SpecialEffectsController.Operation.State state8 = state5;
            SpecialEffectsController.Operation.State state9 = state6;
            p.a aVar5 = aVar2;
            ArrayList arrayList20 = arrayList12;
            arrayList2 = arrayList13;
            hashMap = hashMap3;
            String str5 = str4;
            ArrayList<View> arrayList21 = arrayList15;
            SpecialEffectsController.Operation operation12 = operation5;
            View view10 = view7;
            r0 r0Var4 = r0Var2;
            Rect rect5 = rect3;
            ArrayList arrayList22 = new ArrayList();
            Iterator it6 = arrayList20.iterator();
            Object obj5 = null;
            Object obj6 = null;
            while (it6.hasNext()) {
                d dVar3 = (d) it6.next();
                if (dVar3.b()) {
                    it = it6;
                    operation = operation12;
                    hashMap.put(dVar3.f2101a, Boolean.FALSE);
                    dVar3.a();
                    view = view10;
                    obj = obj3;
                    operation2 = operation8;
                    obj2 = obj5;
                    view2 = view6;
                    state3 = state9;
                    state2 = state8;
                } else {
                    it = it6;
                    operation = operation12;
                    Object g10 = r0Var4.g(dVar3.f2103c);
                    SpecialEffectsController.Operation operation13 = dVar3.f2101a;
                    boolean z13 = obj3 != null && (operation13 == operation7 || operation13 == operation8);
                    if (g10 == null) {
                        if (!z13) {
                            hashMap.put(operation13, Boolean.FALSE);
                            dVar3.a();
                        }
                        view = view10;
                        obj = obj3;
                        m10 = obj5;
                        view2 = view6;
                        state3 = state9;
                        state2 = state8;
                    } else {
                        obj = obj3;
                        ArrayList<View> arrayList23 = new ArrayList<>();
                        Object obj7 = obj5;
                        j(arrayList23, operation13.f2054c.W);
                        if (z13) {
                            if (operation13 == operation7) {
                                arrayList23.removeAll(arrayList19);
                            } else {
                                arrayList23.removeAll(arrayList21);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            r0Var4.a(g10, view10);
                            view = view10;
                            state2 = state8;
                        } else {
                            r0Var4.b(g10, arrayList23);
                            r0Var4.r(g10, g10, arrayList23, null, null, null, null);
                            state2 = state8;
                            if (operation13.f2052a == state2) {
                                arrayList2.remove(operation13);
                                view = view10;
                                ArrayList arrayList24 = new ArrayList(arrayList23);
                                arrayList24.remove(operation13.f2054c.W);
                                r0Var4.q(g10, operation13.f2054c.W, arrayList24);
                                n0.q.a(this.f2048a, new j(this, arrayList23));
                            } else {
                                view = view10;
                            }
                        }
                        state3 = state9;
                        if (operation13.f2052a == state3) {
                            arrayList22.addAll(arrayList23);
                            if (z12) {
                                r0Var4.s(g10, rect5);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            r0Var4.t(g10, view2);
                        }
                        hashMap.put(operation13, Boolean.TRUE);
                        if (dVar3.d) {
                            obj6 = r0Var4.m(obj6, g10, null);
                            m10 = obj7;
                        } else {
                            m10 = r0Var4.m(obj7, g10, null);
                        }
                    }
                    obj2 = m10;
                    operation2 = operation;
                }
                view6 = view2;
                state9 = state3;
                state8 = state2;
                view10 = view;
                operation12 = operation;
                operation8 = operation2;
                obj5 = obj2;
                obj3 = obj;
                it6 = it;
            }
            SpecialEffectsController.Operation operation14 = operation12;
            Object obj8 = obj5;
            state = state8;
            Object l10 = r0Var4.l(obj6, obj8, obj3);
            Iterator it7 = arrayList20.iterator();
            while (it7.hasNext()) {
                d dVar4 = (d) it7.next();
                if (!dVar4.b()) {
                    Object obj9 = dVar4.f2103c;
                    SpecialEffectsController.Operation operation15 = dVar4.f2101a;
                    SpecialEffectsController.Operation operation16 = operation14;
                    boolean z14 = obj3 != null && (operation15 == operation7 || operation15 == operation16);
                    if (obj9 != null || z14) {
                        ViewGroup viewGroup = this.f2048a;
                        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                        if (x.g.c(viewGroup)) {
                            r0Var4.u(dVar4.f2101a.f2054c, l10, dVar4.f2102b, new k(this, dVar4));
                            operation7 = operation7;
                            operation14 = operation16;
                        } else {
                            if (y.P(2)) {
                                StringBuilder m13 = a1.a.m("SpecialEffectsController: Container ");
                                m13.append(this.f2048a);
                                m13.append(" has not been laid out. Completing operation ");
                                m13.append(operation15);
                                str2 = str5;
                                Log.v(str2, m13.toString());
                            } else {
                                str2 = str5;
                            }
                            dVar4.a();
                        }
                    } else {
                        str2 = str5;
                    }
                    str5 = str2;
                    operation14 = operation16;
                }
            }
            str = str5;
            ViewGroup viewGroup2 = this.f2048a;
            WeakHashMap<View, n0.a0> weakHashMap2 = n0.x.f13156a;
            if (x.g.c(viewGroup2)) {
                p0.o(arrayList22, 4);
                ArrayList<String> n = r0Var4.n(arrayList21);
                r0Var4.c(this.f2048a, l10);
                r0Var4.v(this.f2048a, arrayList19, arrayList21, n, aVar5);
                p0.o(arrayList22, 0);
                r0Var4.x(obj3, arrayList19, arrayList21);
            }
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup3 = this.f2048a;
        Context context = viewGroup3.getContext();
        ArrayList arrayList25 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        boolean z15 = false;
        while (it8.hasNext()) {
            b bVar7 = (b) it8.next();
            if (bVar7.b()) {
                bVar7.a();
            } else {
                s.a c12 = bVar7.c(context);
                if (c12 == null) {
                    bVar7.a();
                } else {
                    Animator animator = c12.f2256b;
                    if (animator == null) {
                        arrayList25.add(bVar7);
                    } else {
                        SpecialEffectsController.Operation operation17 = bVar7.f2101a;
                        Fragment fragment = operation17.f2054c;
                        if (Boolean.TRUE.equals(hashMap.get(operation17))) {
                            if (y.P(2)) {
                                Log.v(str, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            bVar7.a();
                        } else {
                            boolean z16 = operation17.f2052a == state;
                            ArrayList arrayList26 = arrayList2;
                            if (z16) {
                                arrayList26.remove(operation17);
                            }
                            View view11 = fragment.W;
                            viewGroup3.startViewTransition(view11);
                            animator.addListener(new androidx.fragment.app.d(this, viewGroup3, view11, z16, operation17, bVar7));
                            animator.setTarget(view11);
                            animator.start();
                            bVar7.f2102b.b(new e(this, animator));
                            z15 = true;
                            arrayList2 = arrayList26;
                            state = state;
                            hashMap = hashMap;
                        }
                    }
                }
            }
        }
        ArrayList arrayList27 = arrayList2;
        Iterator it9 = arrayList25.iterator();
        while (it9.hasNext()) {
            b bVar8 = (b) it9.next();
            SpecialEffectsController.Operation operation18 = bVar8.f2101a;
            Fragment fragment2 = operation18.f2054c;
            if (containsValue) {
                if (y.P(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                bVar8.a();
            } else if (z15) {
                if (y.P(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                bVar8.a();
            } else {
                View view12 = fragment2.W;
                s.a c13 = bVar8.c(context);
                Objects.requireNonNull(c13);
                Animation animation = c13.f2255a;
                Objects.requireNonNull(animation);
                if (operation18.f2052a != SpecialEffectsController.Operation.State.REMOVED) {
                    view12.startAnimation(animation);
                    bVar8.a();
                } else {
                    viewGroup3.startViewTransition(view12);
                    s.b bVar9 = new s.b(animation, viewGroup3, view12);
                    bVar9.setAnimationListener(new f(this, viewGroup3, view12, bVar8));
                    view12.startAnimation(bVar9);
                }
                bVar8.f2102b.b(new g(this, view12, viewGroup3, bVar8));
            }
        }
        Iterator it10 = arrayList27.iterator();
        while (it10.hasNext()) {
            SpecialEffectsController.Operation operation19 = (SpecialEffectsController.Operation) it10.next();
            operation19.f2052a.b(operation19.f2054c.W);
        }
        arrayList27.clear();
    }

    public void j(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                j(arrayList, childAt);
            }
        }
    }

    public void k(Map<String, View> map, View view) {
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        String k10 = x.i.k(view);
        if (k10 != null) {
            map.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(p.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((f.b) aVar.entrySet()).iterator();
        while (true) {
            f.d dVar = (f.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            if (!collection.contains(x.i.k((View) dVar.getValue()))) {
                dVar.remove();
            }
        }
    }
}
