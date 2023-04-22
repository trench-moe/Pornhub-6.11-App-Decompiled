package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.Lifecycle;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final x f2126a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f2127b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f2128c;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f2129e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f2130c;

        public a(f0 f0Var, View view) {
            this.f2130c = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2130c.removeOnAttachStateChangeListener(this);
            View view2 = this.f2130c;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public f0(x xVar, h0 h0Var, Fragment fragment) {
        this.f2126a = xVar;
        this.f2127b = h0Var;
        this.f2128c = fragment;
    }

    public f0(x xVar, h0 h0Var, Fragment fragment, e0 e0Var) {
        this.f2126a = xVar;
        this.f2127b = h0Var;
        this.f2128c = fragment;
        fragment.f2013j = null;
        fragment.f2017m = null;
        fragment.H = 0;
        fragment.E = false;
        fragment.B = false;
        Fragment fragment2 = fragment.f2020w;
        fragment.y = fragment2 != null ? fragment2.f2018t : null;
        fragment.f2020w = null;
        Bundle bundle = e0Var.C;
        if (bundle != null) {
            fragment.f2008f = bundle;
        } else {
            fragment.f2008f = new Bundle();
        }
    }

    public f0(x xVar, h0 h0Var, ClassLoader classLoader, u uVar, e0 e0Var) {
        this.f2126a = xVar;
        this.f2127b = h0Var;
        Fragment a10 = uVar.a(classLoader, e0Var.f2114c);
        this.f2128c = a10;
        Bundle bundle = e0Var.f2121z;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.A0(e0Var.f2121z);
        a10.f2018t = e0Var.f2115f;
        a10.D = e0Var.f2116j;
        a10.F = true;
        a10.M = e0Var.f2117m;
        a10.N = e0Var.n;
        a10.O = e0Var.f2118t;
        a10.R = e0Var.f2119u;
        a10.C = e0Var.f2120w;
        a10.Q = e0Var.y;
        a10.P = e0Var.A;
        a10.f2007e0 = Lifecycle.State.values()[e0Var.B];
        Bundle bundle2 = e0Var.C;
        if (bundle2 != null) {
            a10.f2008f = bundle2;
        } else {
            a10.f2008f = new Bundle();
        }
        if (y.P(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public void a() {
        if (y.P(3)) {
            StringBuilder m10 = a1.a.m("moveto ACTIVITY_CREATED: ");
            m10.append(this.f2128c);
            Log.d("FragmentManager", m10.toString());
        }
        Fragment fragment = this.f2128c;
        Bundle bundle = fragment.f2008f;
        fragment.K.W();
        fragment.f2004c = 3;
        fragment.U = false;
        fragment.U = true;
        if (y.P(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + fragment);
        }
        View view = fragment.W;
        if (view != null) {
            Bundle bundle2 = fragment.f2008f;
            SparseArray<Parcelable> sparseArray = fragment.f2013j;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                fragment.f2013j = null;
            }
            if (fragment.W != null) {
                u0 u0Var = fragment.f2010g0;
                u0Var.f2269j.a(fragment.f2017m);
                fragment.f2017m = null;
            }
            fragment.U = false;
            fragment.l0(bundle2);
            if (!fragment.U) {
                throw new SuperNotCalledException(a1.a.k("Fragment ", fragment, " did not call through to super.onViewStateRestored()"));
            }
            if (fragment.W != null) {
                fragment.f2010g0.a(Lifecycle.Event.ON_CREATE);
            }
        }
        fragment.f2008f = null;
        y yVar = fragment.K;
        yVar.B = false;
        yVar.C = false;
        yVar.J.f2095h = false;
        yVar.w(4);
        x xVar = this.f2126a;
        Fragment fragment2 = this.f2128c;
        xVar.a(fragment2, fragment2.f2008f, false);
    }

    public void b() {
        View view;
        View view2;
        h0 h0Var = this.f2127b;
        Fragment fragment = this.f2128c;
        Objects.requireNonNull(h0Var);
        ViewGroup viewGroup = fragment.V;
        int i10 = -1;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) h0Var.f2145f).indexOf(fragment);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) h0Var.f2145f).size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) ((ArrayList) h0Var.f2145f).get(indexOf);
                        if (fragment2.V == viewGroup && (view = fragment2.W) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) ((ArrayList) h0Var.f2145f).get(i11);
                    if (fragment3.V == viewGroup && (view2 = fragment3.W) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        Fragment fragment4 = this.f2128c;
        fragment4.V.addView(fragment4.W, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
        r4.k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f0.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int d() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f0.d():int");
    }

    public void e() {
        if (y.P(3)) {
            StringBuilder m10 = a1.a.m("moveto CREATED: ");
            m10.append(this.f2128c);
            Log.d("FragmentManager", m10.toString());
        }
        Fragment fragment = this.f2128c;
        if (fragment.f2006d0) {
            fragment.w0(fragment.f2008f);
            this.f2128c.f2004c = 1;
            return;
        }
        this.f2126a.h(fragment, fragment.f2008f, false);
        final Fragment fragment2 = this.f2128c;
        Bundle bundle = fragment2.f2008f;
        fragment2.K.W();
        fragment2.f2004c = 1;
        fragment2.U = false;
        fragment2.f2009f0.a(new androidx.lifecycle.i() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.i
            public void c(androidx.lifecycle.k kVar, Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP && (view = fragment2.W) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        fragment2.f2014j0.a(bundle);
        fragment2.U(bundle);
        fragment2.f2006d0 = true;
        if (!fragment2.U) {
            throw new SuperNotCalledException(a1.a.k("Fragment ", fragment2, " did not call through to super.onCreate()"));
        }
        fragment2.f2009f0.e(Lifecycle.Event.ON_CREATE);
        x xVar = this.f2126a;
        Fragment fragment3 = this.f2128c;
        xVar.c(fragment3, fragment3.f2008f, false);
    }

    public void f() {
        String str;
        if (this.f2128c.D) {
            return;
        }
        if (y.P(3)) {
            StringBuilder m10 = a1.a.m("moveto CREATE_VIEW: ");
            m10.append(this.f2128c);
            Log.d("FragmentManager", m10.toString());
        }
        Fragment fragment = this.f2128c;
        LayoutInflater o02 = fragment.o0(fragment.f2008f);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f2128c;
        ViewGroup viewGroup2 = fragment2.V;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment2.N;
            if (i10 != 0) {
                if (i10 == -1) {
                    StringBuilder m11 = a1.a.m("Cannot create fragment ");
                    m11.append(this.f2128c);
                    m11.append(" for a container view with no id");
                    throw new IllegalArgumentException(m11.toString());
                }
                viewGroup = (ViewGroup) fragment2.I.f2298r.m(i10);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f2128c;
                    if (!fragment3.F) {
                        try {
                            str = fragment3.E().getResourceName(this.f2128c.N);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        StringBuilder m12 = a1.a.m("No view found for id 0x");
                        m12.append(Integer.toHexString(this.f2128c.N));
                        m12.append(" (");
                        m12.append(str);
                        m12.append(") for fragment ");
                        m12.append(this.f2128c);
                        throw new IllegalArgumentException(m12.toString());
                    }
                }
            }
        }
        Fragment fragment4 = this.f2128c;
        fragment4.V = viewGroup;
        fragment4.m0(o02, viewGroup, fragment4.f2008f);
        View view = this.f2128c.W;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f2128c;
            fragment5.W.setTag(R.id.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f2128c;
            if (fragment6.P) {
                fragment6.W.setVisibility(8);
            }
            View view2 = this.f2128c.W;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            if (x.g.b(view2)) {
                x.h.c(this.f2128c.W);
            } else {
                View view3 = this.f2128c.W;
                view3.addOnAttachStateChangeListener(new a(this, view3));
            }
            Fragment fragment7 = this.f2128c;
            fragment7.k0(fragment7.W, fragment7.f2008f);
            fragment7.K.w(2);
            x xVar = this.f2126a;
            Fragment fragment8 = this.f2128c;
            xVar.m(fragment8, fragment8.W, fragment8.f2008f, false);
            int visibility = this.f2128c.W.getVisibility();
            this.f2128c.m().n = this.f2128c.W.getAlpha();
            Fragment fragment9 = this.f2128c;
            if (fragment9.V != null && visibility == 0) {
                View findFocus = fragment9.W.findFocus();
                if (findFocus != null) {
                    this.f2128c.m().f2036o = findFocus;
                    if (y.P(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2128c);
                    }
                }
                this.f2128c.W.setAlpha(0.0f);
            }
        }
        this.f2128c.f2004c = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f0.g():void");
    }

    public void h() {
        View view;
        if (y.P(3)) {
            StringBuilder m10 = a1.a.m("movefrom CREATE_VIEW: ");
            m10.append(this.f2128c);
            Log.d("FragmentManager", m10.toString());
        }
        Fragment fragment = this.f2128c;
        ViewGroup viewGroup = fragment.V;
        if (viewGroup != null && (view = fragment.W) != null) {
            viewGroup.removeView(view);
        }
        this.f2128c.n0();
        this.f2126a.n(this.f2128c, false);
        Fragment fragment2 = this.f2128c;
        fragment2.V = null;
        fragment2.W = null;
        fragment2.f2010g0 = null;
        fragment2.f2011h0.l(null);
        this.f2128c.E = false;
    }

    public void i() {
        if (y.P(3)) {
            StringBuilder m10 = a1.a.m("movefrom ATTACHED: ");
            m10.append(this.f2128c);
            Log.d("FragmentManager", m10.toString());
        }
        Fragment fragment = this.f2128c;
        fragment.f2004c = -1;
        fragment.U = false;
        fragment.Z();
        fragment.f2005c0 = null;
        if (!fragment.U) {
            throw new SuperNotCalledException(a1.a.k("Fragment ", fragment, " did not call through to super.onDetach()"));
        }
        y yVar = fragment.K;
        if (!yVar.D) {
            yVar.o();
            fragment.K = new z();
        }
        this.f2126a.e(this.f2128c, false);
        Fragment fragment2 = this.f2128c;
        fragment2.f2004c = -1;
        fragment2.J = null;
        fragment2.L = null;
        fragment2.I = null;
        if ((fragment2.C && !fragment2.M()) || ((b0) this.f2127b.f2147m).d(this.f2128c)) {
            if (y.P(3)) {
                StringBuilder m11 = a1.a.m("initState called for fragment: ");
                m11.append(this.f2128c);
                Log.d("FragmentManager", m11.toString());
            }
            Fragment fragment3 = this.f2128c;
            Objects.requireNonNull(fragment3);
            fragment3.f2009f0 = new androidx.lifecycle.l(fragment3);
            fragment3.f2014j0 = new androidx.savedstate.b(fragment3);
            fragment3.f2012i0 = null;
            fragment3.f2018t = UUID.randomUUID().toString();
            fragment3.B = false;
            fragment3.C = false;
            fragment3.D = false;
            fragment3.E = false;
            fragment3.F = false;
            fragment3.H = 0;
            fragment3.I = null;
            fragment3.K = new z();
            fragment3.J = null;
            fragment3.M = 0;
            fragment3.N = 0;
            fragment3.O = null;
            fragment3.P = false;
            fragment3.Q = false;
        }
    }

    public void j() {
        Fragment fragment = this.f2128c;
        if (fragment.D && fragment.E && !fragment.G) {
            if (y.P(3)) {
                StringBuilder m10 = a1.a.m("moveto CREATE_VIEW: ");
                m10.append(this.f2128c);
                Log.d("FragmentManager", m10.toString());
            }
            Fragment fragment2 = this.f2128c;
            fragment2.m0(fragment2.o0(fragment2.f2008f), null, this.f2128c.f2008f);
            View view = this.f2128c.W;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2128c;
                fragment3.W.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2128c;
                if (fragment4.P) {
                    fragment4.W.setVisibility(8);
                }
                Fragment fragment5 = this.f2128c;
                fragment5.k0(fragment5.W, fragment5.f2008f);
                fragment5.K.w(2);
                x xVar = this.f2126a;
                Fragment fragment6 = this.f2128c;
                xVar.m(fragment6, fragment6.W, fragment6.f2008f, false);
                this.f2128c.f2004c = 2;
            }
        }
    }

    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = SpecialEffectsController.Operation.LifecycleImpact.NONE;
        if (this.d) {
            if (y.P(2)) {
                StringBuilder m10 = a1.a.m("Ignoring re-entrant call to moveToExpectedState() for ");
                m10.append(this.f2128c);
                Log.v("FragmentManager", m10.toString());
            }
            return;
        }
        try {
            this.d = true;
            while (true) {
                int d = d();
                Fragment fragment = this.f2128c;
                int i10 = fragment.f2004c;
                if (d == i10) {
                    if (fragment.f2002a0) {
                        if (fragment.W != null && (viewGroup = fragment.V) != null) {
                            SpecialEffectsController g10 = SpecialEffectsController.g(viewGroup, fragment.z().N());
                            if (this.f2128c.P) {
                                Objects.requireNonNull(g10);
                                if (y.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f2128c);
                                }
                                g10.a(SpecialEffectsController.Operation.State.GONE, lifecycleImpact, this);
                            } else {
                                Objects.requireNonNull(g10);
                                if (y.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f2128c);
                                }
                                g10.a(SpecialEffectsController.Operation.State.VISIBLE, lifecycleImpact, this);
                            }
                        }
                        Fragment fragment2 = this.f2128c;
                        y yVar = fragment2.I;
                        if (yVar != null && fragment2.B && yVar.Q(fragment2)) {
                            yVar.A = true;
                        }
                        this.f2128c.f2002a0 = false;
                    }
                    this.d = false;
                    return;
                } else if (d > i10) {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.W != null && (viewGroup2 = fragment.V) != null) {
                                SpecialEffectsController g11 = SpecialEffectsController.g(viewGroup2, fragment.z().N());
                                SpecialEffectsController.Operation.State c10 = SpecialEffectsController.Operation.State.c(this.f2128c.W.getVisibility());
                                Objects.requireNonNull(g11);
                                if (y.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f2128c);
                                }
                                g11.a(c10, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                            }
                            this.f2128c.f2004c = 4;
                            continue;
                        case 5:
                            q();
                            continue;
                        case 6:
                            fragment.f2004c = 6;
                            continue;
                        case 7:
                            n();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.f2128c.f2004c = 1;
                            continue;
                        case 2:
                            fragment.E = false;
                            fragment.f2004c = 2;
                            continue;
                        case 3:
                            if (y.P(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2128c);
                            }
                            Fragment fragment3 = this.f2128c;
                            if (fragment3.W != null && fragment3.f2013j == null) {
                                p();
                            }
                            Fragment fragment4 = this.f2128c;
                            if (fragment4.W != null && (viewGroup3 = fragment4.V) != null) {
                                SpecialEffectsController g12 = SpecialEffectsController.g(viewGroup3, fragment4.z().N());
                                Objects.requireNonNull(g12);
                                if (y.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f2128c);
                                }
                                g12.a(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                            }
                            this.f2128c.f2004c = 3;
                            continue;
                        case 4:
                            r();
                            continue;
                        case 5:
                            fragment.f2004c = 5;
                            continue;
                        case 6:
                            l();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public void l() {
        if (y.P(3)) {
            StringBuilder m10 = a1.a.m("movefrom RESUMED: ");
            m10.append(this.f2128c);
            Log.d("FragmentManager", m10.toString());
        }
        Fragment fragment = this.f2128c;
        fragment.K.w(5);
        if (fragment.W != null) {
            fragment.f2010g0.a(Lifecycle.Event.ON_PAUSE);
        }
        fragment.f2009f0.e(Lifecycle.Event.ON_PAUSE);
        fragment.f2004c = 6;
        fragment.U = false;
        fragment.d0();
        if (!fragment.U) {
            throw new SuperNotCalledException(a1.a.k("Fragment ", fragment, " did not call through to super.onPause()"));
        }
        this.f2126a.f(this.f2128c, false);
    }

    public void m(ClassLoader classLoader) {
        Bundle bundle = this.f2128c.f2008f;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2128c;
        fragment.f2013j = fragment.f2008f.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2128c;
        fragment2.f2017m = fragment2.f2008f.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2128c;
        fragment3.y = fragment3.f2008f.getString("android:target_state");
        Fragment fragment4 = this.f2128c;
        if (fragment4.y != null) {
            fragment4.f2021z = fragment4.f2008f.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2128c;
        Boolean bool = fragment5.n;
        if (bool != null) {
            fragment5.Y = bool.booleanValue();
            this.f2128c.n = null;
        } else {
            fragment5.Y = fragment5.f2008f.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2128c;
        if (fragment6.Y) {
            return;
        }
        fragment6.X = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f0.n():void");
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        Fragment fragment = this.f2128c;
        fragment.h0(bundle);
        fragment.f2014j0.b(bundle);
        Parcelable d02 = fragment.K.d0();
        if (d02 != null) {
            bundle.putParcelable("android:support:fragments", d02);
        }
        this.f2126a.j(this.f2128c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2128c.W != null) {
            p();
        }
        if (this.f2128c.f2013j != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2128c.f2013j);
        }
        if (this.f2128c.f2017m != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2128c.f2017m);
        }
        if (!this.f2128c.Y) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2128c.Y);
        }
        return bundle;
    }

    public void p() {
        if (this.f2128c.W == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2128c.W.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2128c.f2013j = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2128c.f2010g0.f2269j.b(bundle);
        if (!bundle.isEmpty()) {
            this.f2128c.f2017m = bundle;
        }
    }

    public void q() {
        if (y.P(3)) {
            StringBuilder m10 = a1.a.m("moveto STARTED: ");
            m10.append(this.f2128c);
            Log.d("FragmentManager", m10.toString());
        }
        Fragment fragment = this.f2128c;
        fragment.K.W();
        fragment.K.C(true);
        fragment.f2004c = 5;
        fragment.U = false;
        fragment.i0();
        if (!fragment.U) {
            throw new SuperNotCalledException(a1.a.k("Fragment ", fragment, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.l lVar = fragment.f2009f0;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        lVar.e(event);
        if (fragment.W != null) {
            fragment.f2010g0.a(event);
        }
        y yVar = fragment.K;
        yVar.B = false;
        yVar.C = false;
        yVar.J.f2095h = false;
        yVar.w(5);
        this.f2126a.k(this.f2128c, false);
    }

    public void r() {
        if (y.P(3)) {
            StringBuilder m10 = a1.a.m("movefrom STARTED: ");
            m10.append(this.f2128c);
            Log.d("FragmentManager", m10.toString());
        }
        Fragment fragment = this.f2128c;
        y yVar = fragment.K;
        yVar.C = true;
        yVar.J.f2095h = true;
        yVar.w(4);
        if (fragment.W != null) {
            fragment.f2010g0.a(Lifecycle.Event.ON_STOP);
        }
        fragment.f2009f0.e(Lifecycle.Event.ON_STOP);
        fragment.f2004c = 4;
        fragment.U = false;
        fragment.j0();
        if (!fragment.U) {
            throw new SuperNotCalledException(a1.a.k("Fragment ", fragment, " did not call through to super.onStop()"));
        }
        this.f2126a.l(this.f2128c, false);
    }
}
