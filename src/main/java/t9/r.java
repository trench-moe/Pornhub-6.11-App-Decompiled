package t9;

import android.view.View;
import w8.g;

/* loaded from: classes2.dex */
public final class r extends y8.a implements g.d {

    /* renamed from: b  reason: collision with root package name */
    public final View f15331b;

    /* renamed from: c  reason: collision with root package name */
    public final o3.d f15332c;

    public r(View view, o3.d dVar) {
        this.f15331b = view;
        this.f15332c = dVar;
        view.setEnabled(false);
    }

    @Override // w8.g.d
    public final void a(long j10, long j11) {
        f();
    }

    @Override // y8.a
    public final void b() {
        f();
    }

    @Override // y8.a
    public final void c() {
        this.f15331b.setEnabled(false);
    }

    @Override // y8.a
    public final void d(v8.d dVar) {
        super.d(dVar);
        w8.g gVar = this.f18545a;
        if (gVar != null) {
            gVar.b(this, 1000L);
        }
        f();
    }

    @Override // y8.a
    public final void e() {
        w8.g gVar = this.f18545a;
        if (gVar != null) {
            gVar.s(this);
        }
        this.f15331b.setEnabled(false);
        this.f18545a = null;
        f();
    }

    public final void f() {
        w8.g gVar = this.f18545a;
        boolean z10 = false;
        if (gVar != null && gVar.j() && !gVar.p()) {
            if (!gVar.l()) {
                this.f15331b.setEnabled(true);
                return;
            }
            View view = this.f15331b;
            if (gVar.A()) {
                o3.d dVar = this.f15332c;
                if ((dVar.f() + dVar.b()) - (dVar.f() + dVar.e()) < 10000) {
                    view.setEnabled(z10);
                    return;
                }
                z10 = true;
            }
            view.setEnabled(z10);
            return;
        }
        this.f15331b.setEnabled(false);
    }
}
