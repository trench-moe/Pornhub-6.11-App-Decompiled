package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.y;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f2279a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final y f2280b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final y.k f2281a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2282b;

        public a(y.k kVar, boolean z10) {
            this.f2281a = kVar;
            this.f2282b = z10;
        }
    }

    public x(y yVar) {
        this.f2280b = yVar;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.a(fragment, bundle, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (!z10 || next.f2282b) {
                    Objects.requireNonNull(next.f2281a);
                }
            }
            return;
        }
    }

    public void b(Fragment fragment, boolean z10) {
        Objects.requireNonNull(this.f2280b.f2297q);
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.b(fragment, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (z10 && !next.f2282b) {
                    break;
                }
                Objects.requireNonNull(next.f2281a);
            }
            return;
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.c(fragment, bundle, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2282b) {
                next.f2281a.a(this.f2280b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.d(fragment, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (z10 && !next.f2282b) {
            }
            Objects.requireNonNull(next.f2281a);
        }
    }

    public void e(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.e(fragment, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2282b) {
                Objects.requireNonNull(next.f2281a);
            }
        }
    }

    public void f(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.f(fragment, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (!z10 || next.f2282b) {
                    Objects.requireNonNull(next.f2281a);
                }
            }
            return;
        }
    }

    public void g(Fragment fragment, boolean z10) {
        Objects.requireNonNull(this.f2280b.f2297q);
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.g(fragment, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f2282b) {
                Objects.requireNonNull(next.f2281a);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.h(fragment, bundle, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (!z10 || next.f2282b) {
                    Objects.requireNonNull(next.f2281a);
                }
            }
            return;
        }
    }

    public void i(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.i(fragment, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (!z10 || next.f2282b) {
                    Objects.requireNonNull(next.f2281a);
                }
            }
            return;
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.j(fragment, bundle, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (z10 && !next.f2282b) {
                    break;
                }
                Objects.requireNonNull(next.f2281a);
            }
            return;
        }
    }

    public void k(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.k(fragment, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (z10 && !next.f2282b) {
                    break;
                }
                Objects.requireNonNull(next.f2281a);
            }
            return;
        }
    }

    public void l(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.l(fragment, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (z10 && !next.f2282b) {
                    break;
                }
                Objects.requireNonNull(next.f2281a);
            }
            return;
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (z10 && !next.f2282b) {
                    break;
                }
                next.f2281a.b(this.f2280b, fragment, view, bundle);
            }
            return;
        }
    }

    public void n(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f2280b.f2299s;
        if (fragment2 != null) {
            fragment2.z().n.n(fragment, true);
        }
        Iterator<a> it = this.f2279a.iterator();
        while (true) {
            while (it.hasNext()) {
                a next = it.next();
                if (!z10 || next.f2282b) {
                    Objects.requireNonNull(next.f2281a);
                }
            }
            return;
        }
    }
}
