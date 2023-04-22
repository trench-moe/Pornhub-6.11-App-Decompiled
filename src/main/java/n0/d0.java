package n0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes2.dex */
public class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f13112b;

    /* renamed from: a  reason: collision with root package name */
    public final k f13113a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f13114a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f13115b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f13116c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f13114a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f13115b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f13116c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e10) {
                StringBuilder m10 = a1.a.m("Failed to get visible insets from AttachInfo ");
                m10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", m10.toString(), e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends e {
        public static Field d;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f13117e;

        /* renamed from: f  reason: collision with root package name */
        public static Constructor<WindowInsets> f13118f;

        /* renamed from: g  reason: collision with root package name */
        public static boolean f13119g;

        /* renamed from: b  reason: collision with root package name */
        public WindowInsets f13120b;

        /* renamed from: c  reason: collision with root package name */
        public e0.b f13121c;

        public b() {
            this.f13120b = e();
        }

        public b(d0 d0Var) {
            super(d0Var);
            this.f13120b = d0Var.i();
        }

        private static WindowInsets e() {
            if (!f13117e) {
                try {
                    d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f13117e = true;
            }
            Field field = d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f13119g) {
                try {
                    f13118f = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f13119g = true;
            }
            Constructor<WindowInsets> constructor = f13118f;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // n0.d0.e
        public d0 b() {
            a();
            d0 j10 = d0.j(this.f13120b);
            j10.f13113a.m(null);
            j10.f13113a.o(this.f13121c);
            return j10;
        }

        @Override // n0.d0.e
        public void c(e0.b bVar) {
            this.f13121c = bVar;
        }

        @Override // n0.d0.e
        public void d(e0.b bVar) {
            WindowInsets windowInsets = this.f13120b;
            if (windowInsets != null) {
                this.f13120b = windowInsets.replaceSystemWindowInsets(bVar.f8967a, bVar.f8968b, bVar.f8969c, bVar.d);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets.Builder f13122b;

        public c() {
            this.f13122b = new WindowInsets.Builder();
        }

        public c(d0 d0Var) {
            super(d0Var);
            WindowInsets i10 = d0Var.i();
            this.f13122b = i10 != null ? new WindowInsets.Builder(i10) : new WindowInsets.Builder();
        }

        @Override // n0.d0.e
        public d0 b() {
            a();
            d0 j10 = d0.j(this.f13122b.build());
            j10.f13113a.m(null);
            return j10;
        }

        @Override // n0.d0.e
        public void c(e0.b bVar) {
            this.f13122b.setStableInsets(bVar.c());
        }

        @Override // n0.d0.e
        public void d(e0.b bVar) {
            this.f13122b.setSystemWindowInsets(bVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends c {
        public d() {
        }

        public d(d0 d0Var) {
            super(d0Var);
        }
    }

    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final d0 f13123a;

        public e() {
            this(new d0((d0) null));
        }

        public e(d0 d0Var) {
            this.f13123a = d0Var;
        }

        public final void a() {
        }

        public d0 b() {
            throw null;
        }

        public void c(e0.b bVar) {
            throw null;
        }

        public void d(e0.b bVar) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f13124h;

        /* renamed from: i  reason: collision with root package name */
        public static Method f13125i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f13126j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f13127k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f13128l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f13129c;
        public e0.b[] d;

        /* renamed from: e  reason: collision with root package name */
        public e0.b f13130e;

        /* renamed from: f  reason: collision with root package name */
        public d0 f13131f;

        /* renamed from: g  reason: collision with root package name */
        public e0.b f13132g;

        public f(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var);
            this.f13130e = null;
            this.f13129c = windowInsets;
        }

        private e0.b p(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f13124h) {
                    q();
                }
                Method method = f13125i;
                if (method != null && f13126j != null) {
                    if (f13127k != null) {
                        try {
                            Object invoke = method.invoke(view, new Object[0]);
                            if (invoke == null) {
                                Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                                return null;
                            }
                            Rect rect = (Rect) f13127k.get(f13128l.get(invoke));
                            if (rect != null) {
                                return e0.b.a(rect.left, rect.top, rect.right, rect.bottom);
                            }
                            return null;
                        } catch (ReflectiveOperationException e10) {
                            StringBuilder m10 = a1.a.m("Failed to get visible insets. (Reflection error). ");
                            m10.append(e10.getMessage());
                            Log.e("WindowInsetsCompat", m10.toString(), e10);
                        }
                    }
                    return null;
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void q() {
            try {
                f13125i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f13126j = cls;
                f13127k = cls.getDeclaredField("mVisibleInsets");
                f13128l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f13127k.setAccessible(true);
                f13128l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder m10 = a1.a.m("Failed to get visible insets. (Reflection error). ");
                m10.append(e10.getMessage());
                Log.e("WindowInsetsCompat", m10.toString(), e10);
            }
            f13124h = true;
        }

        @Override // n0.d0.k
        public void d(View view) {
            e0.b p10 = p(view);
            if (p10 == null) {
                p10 = e0.b.f8966e;
            }
            r(p10);
        }

        @Override // n0.d0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f13132g, ((f) obj).f13132g);
            }
            return false;
        }

        @Override // n0.d0.k
        public final e0.b i() {
            if (this.f13130e == null) {
                this.f13130e = e0.b.a(this.f13129c.getSystemWindowInsetLeft(), this.f13129c.getSystemWindowInsetTop(), this.f13129c.getSystemWindowInsetRight(), this.f13129c.getSystemWindowInsetBottom());
            }
            return this.f13130e;
        }

        @Override // n0.d0.k
        public d0 j(int i10, int i11, int i12, int i13) {
            d0 j10 = d0.j(this.f13129c);
            int i14 = Build.VERSION.SDK_INT;
            e dVar = i14 >= 30 ? new d(j10) : i14 >= 29 ? new c(j10) : new b(j10);
            dVar.d(d0.f(i(), i10, i11, i12, i13));
            dVar.c(d0.f(g(), i10, i11, i12, i13));
            return dVar.b();
        }

        @Override // n0.d0.k
        public boolean l() {
            return this.f13129c.isRound();
        }

        @Override // n0.d0.k
        public void m(e0.b[] bVarArr) {
            this.d = bVarArr;
        }

        @Override // n0.d0.k
        public void n(d0 d0Var) {
            this.f13131f = d0Var;
        }

        public void r(e0.b bVar) {
            this.f13132g = bVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public e0.b f13133m;

        public g(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
            this.f13133m = null;
        }

        @Override // n0.d0.k
        public d0 b() {
            return d0.j(this.f13129c.consumeStableInsets());
        }

        @Override // n0.d0.k
        public d0 c() {
            return d0.j(this.f13129c.consumeSystemWindowInsets());
        }

        @Override // n0.d0.k
        public final e0.b g() {
            if (this.f13133m == null) {
                this.f13133m = e0.b.a(this.f13129c.getStableInsetLeft(), this.f13129c.getStableInsetTop(), this.f13129c.getStableInsetRight(), this.f13129c.getStableInsetBottom());
            }
            return this.f13133m;
        }

        @Override // n0.d0.k
        public boolean k() {
            return this.f13129c.isConsumed();
        }

        @Override // n0.d0.k
        public void o(e0.b bVar) {
            this.f13133m = bVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class h extends g {
        public h(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        @Override // n0.d0.k
        public d0 a() {
            return d0.j(this.f13129c.consumeDisplayCutout());
        }

        @Override // n0.d0.k
        public n0.d e() {
            DisplayCutout displayCutout = this.f13129c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new n0.d(displayCutout);
        }

        @Override // n0.d0.f, n0.d0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return Objects.equals(this.f13129c, hVar.f13129c) && Objects.equals(this.f13132g, hVar.f13132g);
            }
            return false;
        }

        @Override // n0.d0.k
        public int hashCode() {
            return this.f13129c.hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static class i extends h {
        public e0.b n;

        /* renamed from: o  reason: collision with root package name */
        public e0.b f13134o;

        /* renamed from: p  reason: collision with root package name */
        public e0.b f13135p;

        public i(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
            this.n = null;
            this.f13134o = null;
            this.f13135p = null;
        }

        @Override // n0.d0.k
        public e0.b f() {
            if (this.f13134o == null) {
                this.f13134o = e0.b.b(this.f13129c.getMandatorySystemGestureInsets());
            }
            return this.f13134o;
        }

        @Override // n0.d0.k
        public e0.b h() {
            if (this.n == null) {
                this.n = e0.b.b(this.f13129c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // n0.d0.f, n0.d0.k
        public d0 j(int i10, int i11, int i12, int i13) {
            return d0.j(this.f13129c.inset(i10, i11, i12, i13));
        }

        @Override // n0.d0.g, n0.d0.k
        public void o(e0.b bVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final d0 f13136q = d0.j(WindowInsets.CONSUMED);

        public j(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        @Override // n0.d0.f, n0.d0.k
        public final void d(View view) {
        }
    }

    /* loaded from: classes2.dex */
    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final d0 f13137b;

        /* renamed from: a  reason: collision with root package name */
        public final d0 f13138a;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f13137b = (i10 >= 30 ? new d() : i10 >= 29 ? new c() : new b()).b().f13113a.a().f13113a.b().a();
        }

        public k(d0 d0Var) {
            this.f13138a = d0Var;
        }

        public d0 a() {
            return this.f13138a;
        }

        public d0 b() {
            return this.f13138a;
        }

        public d0 c() {
            return this.f13138a;
        }

        public void d(View view) {
        }

        public n0.d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return l() == kVar.l() && k() == kVar.k() && Objects.equals(i(), kVar.i()) && Objects.equals(g(), kVar.g()) && Objects.equals(e(), kVar.e());
            }
            return false;
        }

        public e0.b f() {
            return i();
        }

        public e0.b g() {
            return e0.b.f8966e;
        }

        public e0.b h() {
            return i();
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
        }

        public e0.b i() {
            return e0.b.f8966e;
        }

        public d0 j(int i10, int i11, int i12, int i13) {
            return f13137b;
        }

        public boolean k() {
            return false;
        }

        public boolean l() {
            return false;
        }

        public void m(e0.b[] bVarArr) {
        }

        public void n(d0 d0Var) {
        }

        public void o(e0.b bVar) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f13112b = j.f13136q;
        } else {
            f13112b = k.f13137b;
        }
    }

    public d0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f13113a = new j(this, windowInsets);
        } else if (i10 >= 29) {
            this.f13113a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f13113a = new h(this, windowInsets);
        } else {
            this.f13113a = new g(this, windowInsets);
        }
    }

    public d0(d0 d0Var) {
        this.f13113a = new k(this);
    }

    public static e0.b f(e0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f8967a - i10);
        int max2 = Math.max(0, bVar.f8968b - i11);
        int max3 = Math.max(0, bVar.f8969c - i12);
        int max4 = Math.max(0, bVar.d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : e0.b.a(max, max2, max3, max4);
    }

    public static d0 j(WindowInsets windowInsets) {
        return k(windowInsets, null);
    }

    public static d0 k(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        d0 d0Var = new d0(windowInsets);
        if (view != null) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.g.b(view)) {
                d0Var.f13113a.n(Build.VERSION.SDK_INT >= 23 ? x.j.a(view) : x.i.j(view));
                d0Var.f13113a.d(view.getRootView());
            }
        }
        return d0Var;
    }

    @Deprecated
    public d0 a() {
        return this.f13113a.c();
    }

    @Deprecated
    public int b() {
        return this.f13113a.i().d;
    }

    @Deprecated
    public int c() {
        return this.f13113a.i().f8967a;
    }

    @Deprecated
    public int d() {
        return this.f13113a.i().f8969c;
    }

    @Deprecated
    public int e() {
        return this.f13113a.i().f8968b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return Objects.equals(this.f13113a, ((d0) obj).f13113a);
        }
        return false;
    }

    public boolean g() {
        return this.f13113a.k();
    }

    @Deprecated
    public d0 h(int i10, int i11, int i12, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        e dVar = i14 >= 30 ? new d(this) : i14 >= 29 ? new c(this) : new b(this);
        dVar.d(e0.b.a(i10, i11, i12, i13));
        return dVar.b();
    }

    public int hashCode() {
        k kVar = this.f13113a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public WindowInsets i() {
        k kVar = this.f13113a;
        if (kVar instanceof f) {
            return ((f) kVar).f13129c;
        }
        return null;
    }
}
