package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public abstract class g0 extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public final y f2134c;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2139i;

    /* renamed from: e  reason: collision with root package name */
    public i0 f2135e = null;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<Fragment.e> f2136f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<Fragment> f2137g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public Fragment f2138h = null;
    public final int d = 0;

    @Deprecated
    public g0(y yVar) {
        this.f2134c = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // y1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.ViewGroup r8, int r9, java.lang.Object r10) {
        /*
            r7 = this;
            androidx.fragment.app.Fragment r10 = (androidx.fragment.app.Fragment) r10
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            androidx.fragment.app.i0 r8 = r7.f2135e
            if (r8 != 0) goto L13
            androidx.fragment.app.y r8 = r7.f2134c
            r5 = 6
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r5 = 2
            r0.<init>(r8)
            r7.f2135e = r0
        L13:
            java.util.ArrayList<androidx.fragment.app.Fragment$e> r8 = r7.f2136f
            r5 = 4
            int r8 = r8.size()
            r0 = 0
            if (r8 > r9) goto L23
            java.util.ArrayList<androidx.fragment.app.Fragment$e> r8 = r7.f2136f
            r8.add(r0)
            goto L13
        L23:
            java.util.ArrayList<androidx.fragment.app.Fragment$e> r8 = r7.f2136f
            boolean r1 = r10.L()
            if (r1 == 0) goto L6e
            androidx.fragment.app.y r1 = r7.f2134c
            androidx.fragment.app.h0 r2 = r1.f2285c
            r6 = 4
            java.lang.String r3 = r10.f2018t
            androidx.fragment.app.f0 r2 = r2.k(r3)
            if (r2 == 0) goto L59
            androidx.fragment.app.Fragment r3 = r2.f2128c
            r6 = 7
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L59
            androidx.fragment.app.Fragment r1 = r2.f2128c
            r6 = 2
            int r1 = r1.f2004c
            r3 = -1
            if (r1 <= r3) goto L6e
            r6 = 6
            android.os.Bundle r1 = r2.o()
            if (r1 == 0) goto L6e
            r5 = 4
            androidx.fragment.app.Fragment$e r2 = new androidx.fragment.app.Fragment$e
            r2.<init>(r1)
            java.lang.String r5 = "Ⓢⓜⓞⓑ⓸⓺"
            goto L6f
        L59:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r4 = "Fragment "
            r9 = r4
            java.lang.String r2 = " is not currently in the FragmentManager"
            java.lang.String r4 = a1.a.k(r9, r10, r2)
            r9 = r4
            r8.<init>(r9)
            r6 = 5
            r1.l0(r8)
            throw r0
            r5 = 6
        L6e:
            r2 = r0
        L6f:
            r8.set(r9, r2)
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.f2137g
            r6 = 7
            r8.set(r9, r0)
            androidx.fragment.app.i0 r8 = r7.f2135e
            r8.h(r10)
            androidx.fragment.app.Fragment r8 = r7.f2138h
            boolean r4 = r10.equals(r8)
            r8 = r4
            if (r8 == 0) goto L8a
            r6 = 2
            r7.f2138h = r0
            r5 = 5
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g0.c(android.view.ViewGroup, int, java.lang.Object):void");
    }

    @Override // y1.a
    public void d(ViewGroup viewGroup) {
        i0 i0Var = this.f2135e;
        if (i0Var != null) {
            if (!this.f2139i) {
                try {
                    this.f2139i = true;
                    i0Var.e();
                    this.f2139i = false;
                } catch (Throwable th) {
                    this.f2139i = false;
                    throw th;
                }
            }
            this.f2135e = null;
        }
    }

    @Override // y1.a
    public Object g(ViewGroup viewGroup, int i10) {
        Fragment.e eVar;
        Fragment fragment;
        if (this.f2137g.size() <= i10 || (fragment = this.f2137g.get(i10)) == null) {
            if (this.f2135e == null) {
                this.f2135e = new a(this.f2134c);
            }
            Fragment m10 = m(i10);
            if (this.f2136f.size() > i10 && (eVar = this.f2136f.get(i10)) != null) {
                if (m10.I != null) {
                    throw new IllegalStateException("Fragment already added");
                }
                Bundle bundle = eVar.f2039c;
                if (bundle == null) {
                    bundle = null;
                }
                m10.f2008f = bundle;
            }
            while (this.f2137g.size() <= i10) {
                this.f2137g.add(null);
            }
            m10.D0(false);
            if (this.d == 0) {
                m10.H0(false);
            }
            this.f2137g.set(i10, m10);
            this.f2135e.g(viewGroup.getId(), m10, null, 1);
            if (this.d == 1) {
                this.f2135e.j(m10, Lifecycle.State.STARTED);
            }
            return m10;
        }
        return fragment;
    }

    @Override // y1.a
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).W == view;
    }

    @Override // y1.a
    public void i(Parcelable parcelable, ClassLoader classLoader) {
        Fragment g10;
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f2136f.clear();
            this.f2137g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f2136f.add((Fragment.e) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    y yVar = this.f2134c;
                    Objects.requireNonNull(yVar);
                    String string = bundle.getString(str);
                    if (string == null) {
                        g10 = null;
                    } else {
                        g10 = yVar.f2285c.g(string);
                        if (g10 == null) {
                            yVar.l0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                            throw null;
                        }
                    }
                    if (g10 != null) {
                        while (this.f2137g.size() <= parseInt) {
                            this.f2137g.add(null);
                        }
                        g10.D0(false);
                        this.f2137g.set(parseInt, g10);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // y1.a
    public Parcelable j() {
        Bundle bundle;
        if (this.f2136f.size() > 0) {
            bundle = new Bundle();
            Fragment.e[] eVarArr = new Fragment.e[this.f2136f.size()];
            this.f2136f.toArray(eVarArr);
            bundle.putParcelableArray("states", eVarArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f2137g.size(); i10++) {
            Fragment fragment = this.f2137g.get(i10);
            if (fragment != null && fragment.L()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String j10 = a1.a.j("f", i10);
                y yVar = this.f2134c;
                Objects.requireNonNull(yVar);
                if (fragment.I != yVar) {
                    yVar.l0(new IllegalStateException(a1.a.k("Fragment ", fragment, " is not currently in the FragmentManager")));
                    throw null;
                }
                bundle.putString(j10, fragment.f2018t);
            }
        }
        return bundle;
    }

    @Override // y1.a
    public void k(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2138h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.D0(false);
                if (this.d == 1) {
                    if (this.f2135e == null) {
                        this.f2135e = new a(this.f2134c);
                    }
                    this.f2135e.j(this.f2138h, Lifecycle.State.STARTED);
                } else {
                    this.f2138h.H0(false);
                }
            }
            fragment.D0(true);
            if (this.d == 1) {
                if (this.f2135e == null) {
                    this.f2135e = new a(this.f2134c);
                }
                this.f2135e.j(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.H0(true);
            }
            this.f2138h = fragment;
        }
    }

    @Override // y1.a
    public void l(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment m(int i10);
}
