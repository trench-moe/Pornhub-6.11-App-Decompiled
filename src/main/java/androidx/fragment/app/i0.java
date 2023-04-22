package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: b  reason: collision with root package name */
    public int f2152b;

    /* renamed from: c  reason: collision with root package name */
    public int f2153c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f2154e;

    /* renamed from: f  reason: collision with root package name */
    public int f2155f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2156g;

    /* renamed from: i  reason: collision with root package name */
    public String f2158i;

    /* renamed from: j  reason: collision with root package name */
    public int f2159j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2160k;

    /* renamed from: l  reason: collision with root package name */
    public int f2161l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2162m;
    public ArrayList<String> n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<String> f2163o;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f2151a = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f2157h = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2164p = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2165a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f2166b;

        /* renamed from: c  reason: collision with root package name */
        public int f2167c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f2168e;

        /* renamed from: f  reason: collision with root package name */
        public int f2169f;

        /* renamed from: g  reason: collision with root package name */
        public Lifecycle.State f2170g;

        /* renamed from: h  reason: collision with root package name */
        public Lifecycle.State f2171h;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f2165a = i10;
            this.f2166b = fragment;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f2170g = state;
            this.f2171h = state;
        }

        public a(int i10, Fragment fragment, Lifecycle.State state) {
            this.f2165a = i10;
            this.f2166b = fragment;
            this.f2170g = fragment.f2007e0;
            this.f2171h = state;
        }
    }

    public i0(u uVar, ClassLoader classLoader) {
    }

    public void b(a aVar) {
        this.f2151a.add(aVar);
        aVar.f2167c = this.f2152b;
        aVar.d = this.f2153c;
        aVar.f2168e = this.d;
        aVar.f2169f = this.f2154e;
    }

    public i0 c(String str) {
        if (this.f2157h) {
            this.f2156g = true;
            this.f2158i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int d();

    public abstract void e();

    public abstract i0 f(Fragment fragment);

    public abstract void g(int i10, Fragment fragment, String str, int i11);

    public abstract i0 h(Fragment fragment);

    public i0 i(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            g(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public abstract i0 j(Fragment fragment, Lifecycle.State state);
}
