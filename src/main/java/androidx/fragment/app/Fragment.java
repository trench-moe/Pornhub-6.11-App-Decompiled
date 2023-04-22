package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.z;
import c0.a;
import com.app.pornhub.R;
import e1.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.k, androidx.lifecycle.b0, androidx.savedstate.c {

    /* renamed from: m0  reason: collision with root package name */
    public static final Object f2001m0 = new Object();
    public Boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public y I;
    public v<?> J;
    public y K;
    public Fragment L;
    public int M;
    public int N;
    public String O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public ViewGroup V;
    public View W;
    public boolean X;
    public boolean Y;
    public b Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2002a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f2003b0;

    /* renamed from: c  reason: collision with root package name */
    public int f2004c;

    /* renamed from: c0  reason: collision with root package name */
    public LayoutInflater f2005c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2006d0;

    /* renamed from: e0  reason: collision with root package name */
    public Lifecycle.State f2007e0;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f2008f;

    /* renamed from: f0  reason: collision with root package name */
    public androidx.lifecycle.l f2009f0;

    /* renamed from: g0  reason: collision with root package name */
    public u0 f2010g0;

    /* renamed from: h0  reason: collision with root package name */
    public androidx.lifecycle.p<androidx.lifecycle.k> f2011h0;

    /* renamed from: i0  reason: collision with root package name */
    public z.b f2012i0;

    /* renamed from: j  reason: collision with root package name */
    public SparseArray<Parcelable> f2013j;

    /* renamed from: j0  reason: collision with root package name */
    public androidx.savedstate.b f2014j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f2015k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList<c> f2016l0;

    /* renamed from: m  reason: collision with root package name */
    public Bundle f2017m;
    public Boolean n;

    /* renamed from: t  reason: collision with root package name */
    public String f2018t;

    /* renamed from: u  reason: collision with root package name */
    public Bundle f2019u;

    /* renamed from: w  reason: collision with root package name */
    public Fragment f2020w;
    public String y;

    /* renamed from: z  reason: collision with root package name */
    public int f2021z;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public class a extends af.c {
        public a() {
        }

        @Override // af.c
        public View m(int i10) {
            View view = Fragment.this.W;
            if (view != null) {
                return view.findViewById(i10);
            }
            StringBuilder m10 = a1.a.m("Fragment ");
            m10.append(Fragment.this);
            m10.append(" does not have a view");
            throw new IllegalStateException(m10.toString());
        }

        @Override // af.c
        public boolean p() {
            return Fragment.this.W != null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f2024a;

        /* renamed from: b  reason: collision with root package name */
        public Animator f2025b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2026c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f2027e;

        /* renamed from: f  reason: collision with root package name */
        public int f2028f;

        /* renamed from: g  reason: collision with root package name */
        public int f2029g;

        /* renamed from: h  reason: collision with root package name */
        public int f2030h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList<String> f2031i;

        /* renamed from: j  reason: collision with root package name */
        public ArrayList<String> f2032j;

        /* renamed from: k  reason: collision with root package name */
        public Object f2033k;

        /* renamed from: l  reason: collision with root package name */
        public Object f2034l;

        /* renamed from: m  reason: collision with root package name */
        public Object f2035m;
        public float n;

        /* renamed from: o  reason: collision with root package name */
        public View f2036o;

        /* renamed from: p  reason: collision with root package name */
        public d f2037p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f2038q;

        public b() {
            Object obj = Fragment.f2001m0;
            this.f2033k = obj;
            this.f2034l = obj;
            this.f2035m = obj;
            this.n = 1.0f;
            this.f2036o = null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f2039c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Bundle bundle) {
            this.f2039c = bundle;
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2039c = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f2039c);
        }
    }

    public Fragment() {
        this.f2004c = -1;
        this.f2018t = UUID.randomUUID().toString();
        this.y = null;
        this.A = null;
        this.K = new z();
        this.T = true;
        this.Y = true;
        this.f2007e0 = Lifecycle.State.RESUMED;
        this.f2011h0 = new androidx.lifecycle.p<>();
        new AtomicInteger();
        this.f2016l0 = new ArrayList<>();
        this.f2009f0 = new androidx.lifecycle.l(this);
        this.f2014j0 = new androidx.savedstate.b(this);
        this.f2012i0 = null;
    }

    public Fragment(int i10) {
        this();
        this.f2015k0 = i10;
    }

    public boolean A() {
        b bVar = this.Z;
        if (bVar == null) {
            return false;
        }
        return bVar.f2026c;
    }

    public void A0(Bundle bundle) {
        y yVar = this.I;
        if (yVar != null) {
            if (yVar == null ? false : yVar.T()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f2019u = bundle;
    }

    public int B() {
        b bVar = this.Z;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2028f;
    }

    public void B0(View view) {
        m().f2036o = null;
    }

    public int C() {
        b bVar = this.Z;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2029g;
    }

    public void C0(boolean z10) {
        m().f2038q = z10;
    }

    public Object D() {
        b bVar = this.Z;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f2034l;
        if (obj == f2001m0) {
            v();
            return null;
        }
        return obj;
    }

    public void D0(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (this.S && L() && !this.P) {
                this.J.x();
            }
        }
    }

    public final Resources E() {
        return u0().getResources();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        ((androidx.fragment.app.y.o) r6).f2321c++;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E0(androidx.fragment.app.Fragment.d r6) {
        /*
            r5 = this;
            r5.m()
            androidx.fragment.app.Fragment$b r0 = r5.Z
            androidx.fragment.app.Fragment$d r0 = r0.f2037p
            if (r6 != r0) goto La
            return
        La:
            if (r6 == 0) goto L2b
            if (r0 != 0) goto Lf
            goto L2c
        Lf:
            r3 = 5
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r4 = 5
            r0.<init>()
            java.lang.String r1 = "Trying to set a replacement startPostponedEnterTransition on "
            r3 = 4
            r0.append(r1)
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            r0 = r2
            r6.<init>(r0)
            throw r6
            r4 = 3
        L2b:
            r4 = 2
        L2c:
            if (r6 == 0) goto L3a
            r4 = 4
            androidx.fragment.app.y$o r6 = (androidx.fragment.app.y.o) r6
            int r0 = r6.f2321c
            r3 = 6
            int r0 = r0 + 1
            r3 = 5
            r6.f2321c = r0
            r3 = 2
        L3a:
            r3 = 6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.E0(androidx.fragment.app.Fragment$d):void");
    }

    public Object F() {
        b bVar = this.Z;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f2033k;
        if (obj == f2001m0) {
            s();
            return null;
        }
        return obj;
    }

    public void F0(boolean z10) {
        if (this.Z == null) {
            return;
        }
        m().f2026c = z10;
    }

    public Object G() {
        b bVar = this.Z;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    @Deprecated
    public void G0(Fragment fragment, int i10) {
        y yVar = this.I;
        y yVar2 = fragment.I;
        if (yVar != null && yVar2 != null) {
            if (yVar != yVar2) {
                throw new IllegalArgumentException(a1.a.k("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
            }
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.J()) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (this.I == null || fragment.I == null) {
            this.y = null;
            this.f2020w = fragment;
        } else {
            this.y = fragment.f2018t;
            this.f2020w = null;
        }
        this.f2021z = i10;
    }

    public Object H() {
        b bVar = this.Z;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f2035m;
        if (obj == f2001m0) {
            G();
            return null;
        }
        return obj;
    }

    @Deprecated
    public void H0(boolean z10) {
        if (!this.Y && z10 && this.f2004c < 5 && this.I != null && L() && this.f2006d0) {
            y yVar = this.I;
            yVar.X(yVar.h(this));
        }
        this.Y = z10;
        this.X = this.f2004c < 5 && !z10;
        if (this.f2008f != null) {
            this.n = Boolean.valueOf(z10);
        }
    }

    public final String I(int i10) {
        return E().getString(i10);
    }

    public void I0(@SuppressLint({"UnknownNullness"}) Intent intent) {
        v<?> vVar = this.J;
        if (vVar == null) {
            throw new IllegalStateException(a1.a.k("Fragment ", this, " not attached to Activity"));
        }
        Context context = vVar.f2271f;
        Object obj = c0.a.f3717a;
        a.C0047a.b(context, intent, null);
    }

    @Deprecated
    public final Fragment J() {
        String str;
        Fragment fragment = this.f2020w;
        if (fragment != null) {
            return fragment;
        }
        y yVar = this.I;
        if (yVar == null || (str = this.y) == null) {
            return null;
        }
        return yVar.G(str);
    }

    public void J0() {
        if (this.Z != null) {
            Objects.requireNonNull(m());
        }
    }

    public androidx.lifecycle.k K() {
        u0 u0Var = this.f2010g0;
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean L() {
        return this.J != null && this.B;
    }

    public final boolean M() {
        return this.H > 0;
    }

    public boolean N() {
        return false;
    }

    public final boolean O() {
        Fragment fragment = this.L;
        return fragment != null && (fragment.C || fragment.O());
    }

    public final boolean P() {
        View view;
        return (!L() || this.P || (view = this.W) == null || view.getWindowToken() == null || this.W.getVisibility() != 0) ? false : true;
    }

    @Deprecated
    public void Q(int i10, int i11, Intent intent) {
        if (y.P(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Deprecated
    public void R(Activity activity) {
        this.U = true;
    }

    public void S(Context context) {
        this.U = true;
        v<?> vVar = this.J;
        Activity activity = vVar == null ? null : vVar.f2270c;
        if (activity != null) {
            this.U = false;
            R(activity);
        }
    }

    @Deprecated
    public void T(Fragment fragment) {
    }

    public void U(Bundle bundle) {
        Parcelable parcelable;
        boolean z10 = true;
        this.U = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.K.c0(parcelable);
            this.K.m();
        }
        y yVar = this.K;
        if (yVar.f2296p < 1) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        yVar.m();
    }

    public void V(Menu menu, MenuInflater menuInflater) {
    }

    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f2015k0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void X() {
        this.U = true;
    }

    public void Y() {
        this.U = true;
    }

    public void Z() {
        this.U = true;
    }

    public LayoutInflater a0(Bundle bundle) {
        v<?> vVar = this.J;
        if (vVar != null) {
            LayoutInflater u2 = vVar.u();
            u2.setFactory2(this.K.f2287f);
            return u2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Override // androidx.lifecycle.k
    public Lifecycle b() {
        return this.f2009f0;
    }

    public void b0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.U = true;
        v<?> vVar = this.J;
        if ((vVar == null ? null : vVar.f2270c) != null) {
            this.U = false;
            this.U = true;
        }
    }

    public boolean c0(MenuItem menuItem) {
        return false;
    }

    public void d0() {
        this.U = true;
    }

    public void e0(boolean z10) {
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Deprecated
    public void f0(int i10, String[] strArr, int[] iArr) {
    }

    public void g0() {
        this.U = true;
    }

    public void h0(Bundle bundle) {
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public af.c i() {
        return new a();
    }

    public void i0() {
        this.U = true;
    }

    @Override // androidx.lifecycle.b0
    public androidx.lifecycle.a0 j() {
        if (this.I != null) {
            if (y() != 1) {
                b0 b0Var = this.I.J;
                androidx.lifecycle.a0 a0Var = b0Var.f2092e.get(this.f2018t);
                if (a0Var == null) {
                    a0Var = new androidx.lifecycle.a0();
                    b0Var.f2092e.put(this.f2018t, a0Var);
                }
                return a0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void j0() {
        this.U = true;
    }

    public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.M));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.N));
        printWriter.print(" mTag=");
        printWriter.println(this.O);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2004c);
        printWriter.print(" mWho=");
        printWriter.print(this.f2018t);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.B);
        printWriter.print(" mRemoving=");
        printWriter.print(this.C);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.D);
        printWriter.print(" mInLayout=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.P);
        printWriter.print(" mDetached=");
        printWriter.print(this.Q);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.T);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.S);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.R);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Y);
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.J);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.L);
        }
        if (this.f2019u != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2019u);
        }
        if (this.f2008f != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2008f);
        }
        if (this.f2013j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2013j);
        }
        if (this.f2017m != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2017m);
        }
        Fragment J = J();
        if (J != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(J);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2021z);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(A());
        if (r() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(r());
        }
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(u());
        }
        if (B() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(B());
        }
        if (C() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(C());
        }
        if (this.V != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.V);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.W);
        }
        if (o() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(o());
        }
        if (q() != null) {
            e1.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.K + ":");
        this.K.y(a1.a.l(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public void k0(View view, Bundle bundle) {
    }

    @Override // androidx.savedstate.c
    public final androidx.savedstate.a l() {
        return this.f2014j0.f3134b;
    }

    public void l0(Bundle bundle) {
        this.U = true;
    }

    public final b m() {
        if (this.Z == null) {
            this.Z = new b();
        }
        return this.Z;
    }

    public void m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.K.W();
        boolean z10 = true;
        this.G = true;
        this.f2010g0 = new u0(this, j());
        View W = W(layoutInflater, viewGroup, bundle);
        this.W = W;
        if (W != null) {
            this.f2010g0.d();
            this.W.setTag(R.id.view_tree_lifecycle_owner, this.f2010g0);
            this.W.setTag(R.id.view_tree_view_model_store_owner, this.f2010g0);
            this.W.setTag(R.id.view_tree_saved_state_registry_owner, this.f2010g0);
            this.f2011h0.l(this.f2010g0);
            return;
        }
        if (this.f2010g0.f2268f == null) {
            z10 = false;
        }
        if (z10) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.f2010g0 = null;
    }

    public final o n() {
        v<?> vVar = this.J;
        if (vVar == null) {
            return null;
        }
        return (o) vVar.f2270c;
    }

    public void n0() {
        this.K.w(1);
        if (this.W != null) {
            u0 u0Var = this.f2010g0;
            u0Var.d();
            if (u0Var.f2268f.f2375b.compareTo(Lifecycle.State.CREATED) >= 0) {
                this.f2010g0.a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.f2004c = 1;
        this.U = false;
        Y();
        if (!this.U) {
            throw new SuperNotCalledException(a1.a.k("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        b.C0124b c0124b = ((e1.b) e1.a.b(this)).f8992b;
        int j10 = c0124b.f8993c.j();
        for (int i10 = 0; i10 < j10; i10++) {
            Objects.requireNonNull(c0124b.f8993c.k(i10));
        }
        this.G = false;
    }

    public View o() {
        b bVar = this.Z;
        if (bVar == null) {
            return null;
        }
        return bVar.f2024a;
    }

    public LayoutInflater o0(Bundle bundle) {
        LayoutInflater a02 = a0(bundle);
        this.f2005c0 = a02;
        return a02;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.U = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        s0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.U = true;
    }

    public final y p() {
        if (this.J != null) {
            return this.K;
        }
        throw new IllegalStateException(a1.a.k("Fragment ", this, " has not been attached yet."));
    }

    public void p0() {
        onLowMemory();
        this.K.p();
    }

    public Context q() {
        v<?> vVar = this.J;
        if (vVar == null) {
            return null;
        }
        return vVar.f2271f;
    }

    public boolean q0(Menu menu) {
        boolean z10 = false;
        if (this.P) {
            return false;
        }
        if (this.S && this.T) {
            z10 = true;
        }
        return z10 | this.K.v(menu);
    }

    public int r() {
        b bVar = this.Z;
        if (bVar == null) {
            return 0;
        }
        return bVar.d;
    }

    @Deprecated
    public final void r0(String[] strArr, int i10) {
        if (this.J == null) {
            throw new IllegalStateException(a1.a.k("Fragment ", this, " not attached to Activity"));
        }
        y z10 = z();
        if (z10.y == null) {
            Objects.requireNonNull(z10.f2297q);
            return;
        }
        z10.f2305z.addLast(new y.l(this.f2018t, i10));
        z10.y.a(strArr);
    }

    public Object s() {
        b bVar = this.Z;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public final o s0() {
        o n = n();
        if (n != null) {
            return n;
        }
        throw new IllegalStateException(a1.a.k("Fragment ", this, " not attached to an activity."));
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        if (this.J == null) {
            throw new IllegalStateException(a1.a.k("Fragment ", this, " not attached to Activity"));
        }
        y z10 = z();
        if (z10.f2303w != null) {
            z10.f2305z.addLast(new y.l(this.f2018t, i10));
            z10.f2303w.a(intent);
            return;
        }
        v<?> vVar = z10.f2297q;
        Objects.requireNonNull(vVar);
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        Context context = vVar.f2271f;
        Object obj = c0.a.f3717a;
        a.C0047a.b(context, intent, null);
    }

    public void t() {
        b bVar = this.Z;
        if (bVar == null) {
            return;
        }
        Objects.requireNonNull(bVar);
    }

    public final Bundle t0() {
        Bundle bundle = this.f2019u;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a1.a.k("Fragment ", this, " does not have any arguments."));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f2018t);
        if (this.M != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.M));
        }
        if (this.O != null) {
            sb2.append(" tag=");
            sb2.append(this.O);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        b bVar = this.Z;
        if (bVar == null) {
            return 0;
        }
        return bVar.f2027e;
    }

    public final Context u0() {
        Context q10 = q();
        if (q10 != null) {
            return q10;
        }
        throw new IllegalStateException(a1.a.k("Fragment ", this, " not attached to a context."));
    }

    public Object v() {
        b bVar = this.Z;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public final View v0() {
        View view = this.W;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a1.a.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void w() {
        b bVar = this.Z;
        if (bVar == null) {
            return;
        }
        Objects.requireNonNull(bVar);
    }

    public void w0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.K.c0(parcelable);
            this.K.m();
        }
    }

    public final LayoutInflater x() {
        LayoutInflater layoutInflater = this.f2005c0;
        if (layoutInflater == null) {
            layoutInflater = o0(null);
        }
        return layoutInflater;
    }

    public void x0(View view) {
        m().f2024a = view;
    }

    public final int y() {
        Lifecycle.State state = this.f2007e0;
        if (state != Lifecycle.State.INITIALIZED && this.L != null) {
            return Math.min(state.ordinal(), this.L.y());
        }
        return state.ordinal();
    }

    public void y0(int i10, int i11, int i12, int i13) {
        if (this.Z == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m().d = i10;
        m().f2027e = i11;
        m().f2028f = i12;
        m().f2029g = i13;
    }

    public final y z() {
        y yVar = this.I;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException(a1.a.k("Fragment ", this, " not associated with a fragment manager."));
    }

    public void z0(Animator animator) {
        m().f2025b = animator;
    }
}
