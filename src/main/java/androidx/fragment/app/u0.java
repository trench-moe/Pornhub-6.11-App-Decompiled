package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public class u0 implements androidx.savedstate.c, androidx.lifecycle.b0 {

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.a0 f2267c;

    /* renamed from: f  reason: collision with root package name */
    public androidx.lifecycle.l f2268f = null;

    /* renamed from: j  reason: collision with root package name */
    public androidx.savedstate.b f2269j = null;

    public u0(Fragment fragment, androidx.lifecycle.a0 a0Var) {
        this.f2267c = a0Var;
    }

    public void a(Lifecycle.Event event) {
        androidx.lifecycle.l lVar = this.f2268f;
        lVar.d("handleLifecycleEvent");
        lVar.g(event.b());
    }

    @Override // androidx.lifecycle.k
    public Lifecycle b() {
        d();
        return this.f2268f;
    }

    public void d() {
        if (this.f2268f == null) {
            this.f2268f = new androidx.lifecycle.l(this);
            this.f2269j = new androidx.savedstate.b(this);
        }
    }

    @Override // androidx.lifecycle.b0
    public androidx.lifecycle.a0 j() {
        d();
        return this.f2267c;
    }

    @Override // androidx.savedstate.c
    public androidx.savedstate.a l() {
        d();
        return this.f2269j.f3134b;
    }
}
