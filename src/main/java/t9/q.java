package t9;

import android.widget.ProgressBar;
import w8.g;

/* loaded from: classes2.dex */
public final class q extends y8.a implements g.d {

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f15326b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15327c;

    public q(ProgressBar progressBar, long j10) {
        this.f15326b = progressBar;
        this.f15327c = j10;
        f();
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
    public final void d(v8.d dVar) {
        super.d(dVar);
        w8.g gVar = this.f18545a;
        if (gVar != null) {
            gVar.b(this, this.f15327c);
        }
        f();
    }

    @Override // y8.a
    public final void e() {
        w8.g gVar = this.f18545a;
        if (gVar != null) {
            gVar.s(this);
        }
        this.f18545a = null;
        f();
    }

    public final void f() {
        w8.g gVar = this.f18545a;
        if (gVar != null && gVar.j()) {
            if (!gVar.l()) {
                this.f15326b.setMax((int) gVar.i());
                this.f15326b.setProgress((int) gVar.c());
                return;
            }
        }
        this.f15326b.setMax(1);
        this.f15326b.setProgress(0);
    }
}
