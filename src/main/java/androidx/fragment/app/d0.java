package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i0;
import androidx.lifecycle.Lifecycle;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public abstract class d0 extends y1.a {

    /* renamed from: c  reason: collision with root package name */
    public final y f2109c;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2112g;

    /* renamed from: e  reason: collision with root package name */
    public i0 f2110e = null;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f2111f = null;
    public final int d = 0;

    @Deprecated
    public d0(y yVar) {
        this.f2109c = yVar;
    }

    public static String n(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    @Override // y1.a
    public void c(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f2110e == null) {
            this.f2110e = new a(this.f2109c);
        }
        this.f2110e.f(fragment);
        if (fragment.equals(this.f2111f)) {
            this.f2111f = null;
        }
    }

    @Override // y1.a
    public void d(ViewGroup viewGroup) {
        i0 i0Var = this.f2110e;
        if (i0Var != null) {
            if (!this.f2112g) {
                try {
                    this.f2112g = true;
                    i0Var.e();
                } finally {
                    this.f2112g = false;
                }
            }
            this.f2110e = null;
        }
    }

    @Override // y1.a
    public Object g(ViewGroup viewGroup, int i10) {
        if (this.f2110e == null) {
            this.f2110e = new a(this.f2109c);
        }
        long j10 = i10;
        Fragment I = this.f2109c.I(n(viewGroup.getId(), j10));
        if (I != null) {
            i0 i0Var = this.f2110e;
            Objects.requireNonNull(i0Var);
            i0Var.b(new i0.a(7, I));
        } else {
            I = m(i10);
            this.f2110e.g(viewGroup.getId(), I, n(viewGroup.getId(), j10), 1);
        }
        if (I != this.f2111f) {
            I.D0(false);
            if (this.d == 1) {
                this.f2110e.j(I, Lifecycle.State.STARTED);
                return I;
            }
            I.H0(false);
        }
        return I;
    }

    @Override // y1.a
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).W == view;
    }

    @Override // y1.a
    public void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // y1.a
    public Parcelable j() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    @Override // y1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(android.view.ViewGroup r6, int r7, java.lang.Object r8) {
        /*
            r5 = this;
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            androidx.fragment.app.Fragment r6 = r5.f2111f
            r4 = 3
            if (r8 == r6) goto L64
            r3 = 6
            r7 = 1
            if (r6 == 0) goto L39
            r0 = 0
            r6.D0(r0)
            int r6 = r5.d
            r4 = 2
            if (r6 != r7) goto L32
            androidx.fragment.app.i0 r6 = r5.f2110e
            r4 = 3
            if (r6 != 0) goto L24
            r4 = 4
            androidx.fragment.app.y r6 = r5.f2109c
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r0.<init>(r6)
            r4 = 3
            r5.f2110e = r0
        L24:
            r4 = 6
            androidx.fragment.app.i0 r6 = r5.f2110e
            r3 = 4
            androidx.fragment.app.Fragment r0 = r5.f2111f
            r4 = 4
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            r3 = 6
            r6.j(r0, r1)
            goto L3a
        L32:
            androidx.fragment.app.Fragment r6 = r5.f2111f
            r3 = 2
            r6.H0(r0)
            r3 = 7
        L39:
            r4 = 3
        L3a:
            r8.D0(r7)
            int r6 = r5.d
            r3 = 3
            if (r6 != r7) goto L5d
            r4 = 7
            androidx.fragment.app.i0 r6 = r5.f2110e
            r3 = 3
            if (r6 != 0) goto L53
            androidx.fragment.app.y r6 = r5.f2109c
            androidx.fragment.app.a r7 = new androidx.fragment.app.a
            r4 = 7
            r7.<init>(r6)
            r5.f2110e = r7
            r4 = 3
        L53:
            r4 = 3
            androidx.fragment.app.i0 r6 = r5.f2110e
            r4 = 4
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            r6.j(r8, r7)
            goto L61
        L5d:
            r3 = 1
            r8.H0(r7)
        L61:
            r5.f2111f = r8
            r4 = 6
        L64:
            r4 = 6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d0.k(android.view.ViewGroup, int, java.lang.Object):void");
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
