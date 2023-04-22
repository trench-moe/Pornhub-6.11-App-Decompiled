package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r0;
import androidx.transition.Transition;
import i0.b;
import java.util.ArrayList;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class b extends r0 {

    /* loaded from: classes.dex */
    public class a extends Transition.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f3243a;

        public a(b bVar, Rect rect) {
            this.f3243a = rect;
        }

        @Override // androidx.transition.Transition.c
        public Rect a(Transition transition) {
            return this.f3243a;
        }
    }

    /* renamed from: androidx.transition.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0040b implements Transition.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3244a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3245b;

        public C0040b(b bVar, View view, ArrayList arrayList) {
            this.f3244a = view;
            this.f3245b = arrayList;
        }

        @Override // androidx.transition.Transition.d
        public void a(Transition transition) {
            transition.A(this);
            transition.a(this);
        }

        @Override // androidx.transition.Transition.d
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            transition.A(this);
            this.f3244a.setVisibility(8);
            int size = this.f3245b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f3245b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void e(Transition transition) {
        }
    }

    /* loaded from: classes.dex */
    public class c extends androidx.transition.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3246a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3247b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f3248c;
        public final /* synthetic */ ArrayList d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f3249e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f3250f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3246a = obj;
            this.f3247b = arrayList;
            this.f3248c = obj2;
            this.d = arrayList2;
            this.f3249e = obj3;
            this.f3250f = arrayList3;
        }

        @Override // androidx.transition.c, androidx.transition.Transition.d
        public void a(Transition transition) {
            Object obj = this.f3246a;
            if (obj != null) {
                b.this.p(obj, this.f3247b, null);
            }
            Object obj2 = this.f3248c;
            if (obj2 != null) {
                b.this.p(obj2, this.d, null);
            }
            Object obj3 = this.f3249e;
            if (obj3 != null) {
                b.this.p(obj3, this.f3250f, null);
            }
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            transition.A(this);
        }
    }

    /* loaded from: classes.dex */
    public class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Transition f3252a;

        public d(b bVar, Transition transition) {
            this.f3252a = transition;
        }

        @Override // i0.b.a
        public void a() {
            this.f3252a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public class e implements Transition.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f3253a;

        public e(b bVar, Runnable runnable) {
            this.f3253a = runnable;
        }

        @Override // androidx.transition.Transition.d
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            this.f3253a.run();
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void e(Transition transition) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends Transition.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f3254a;

        public f(b bVar, Rect rect) {
            this.f3254a = rect;
        }

        @Override // androidx.transition.Transition.c
        public Rect a(Transition transition) {
            Rect rect = this.f3254a;
            if (rect != null && !rect.isEmpty()) {
                return this.f3254a;
            }
            return null;
        }
    }

    public static boolean z(Transition transition) {
        return (r0.k(transition.n) && r0.k(null) && r0.k(null)) ? false : true;
    }

    @Override // androidx.fragment.app.r0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.r0
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.P.size();
            while (i10 < size) {
                b(transitionSet.N(i10), arrayList);
                i10++;
            }
        } else if (z(transition) || !r0.k(transition.f3216t)) {
        } else {
            int size2 = arrayList.size();
            while (i10 < size2) {
                transition.b(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.r0
    public void c(ViewGroup viewGroup, Object obj) {
        androidx.transition.d.a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.r0
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.r0
    public Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.r0
    public Object l(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.M(transition);
            transitionSet.M(transition2);
            transitionSet.Q(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet2 = new TransitionSet();
            if (transition != null) {
                transitionSet2.M(transition);
            }
            transitionSet2.M(transition3);
            return transitionSet2;
        }
        return transition;
    }

    @Override // androidx.fragment.app.r0
    public Object m(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.M((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.M((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.M((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.r0
    public void o(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).B(view);
        }
    }

    @Override // androidx.fragment.app.r0
    public void p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.P.size();
            while (i10 < size) {
                p(transitionSet.N(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!z(transition)) {
            ArrayList<View> arrayList3 = transition.f3216t;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size2) {
                    transition.b(arrayList2.get(i10));
                    i10++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    transition.B(arrayList.get(size3));
                }
            }
        }
    }

    @Override // androidx.fragment.app.r0
    public void q(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).a(new C0040b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.r0
    public void r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.r0
    public void s(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).F(new f(this, rect));
        }
    }

    @Override // androidx.fragment.app.r0
    public void t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            j(view, rect);
            ((Transition) obj).F(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.r0
    public void u(Fragment fragment, Object obj, i0.b bVar, Runnable runnable) {
        Transition transition = (Transition) obj;
        bVar.b(new d(this, transition));
        transition.a(new e(this, runnable));
    }

    @Override // androidx.fragment.app.r0
    public void w(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f3216t;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            r0.d(arrayList2, arrayList.get(i10));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.r0
    public void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.f3216t.clear();
            transitionSet.f3216t.addAll(arrayList2);
            p(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.r0
    public Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.M((Transition) obj);
        return transitionSet;
    }
}
