package t9;

import android.view.View;

/* loaded from: classes2.dex */
public final class u extends y8.a {

    /* renamed from: b  reason: collision with root package name */
    public final View f15355b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15356c;

    public u(View view, int i10) {
        this.f15355b = view;
        this.f15356c = i10;
    }

    @Override // y8.a
    public final void b() {
        f();
    }

    @Override // y8.a
    public final void d(v8.d dVar) {
        super.d(dVar);
        f();
    }

    @Override // y8.a
    public final void e() {
        this.f15355b.setVisibility(this.f15356c);
        this.f18545a = null;
    }

    public final void f() {
        w8.g gVar = this.f18545a;
        if (gVar != null && gVar.j()) {
            this.f15355b.setVisibility(0);
            return;
        }
        this.f15355b.setVisibility(this.f15356c);
    }
}
