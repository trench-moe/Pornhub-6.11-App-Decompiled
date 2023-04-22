package t9;

import android.view.View;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t extends y8.a {

    /* renamed from: b  reason: collision with root package name */
    public final View f15341b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15342c;

    public t(View view, int i10) {
        this.f15341b = view;
        this.f15342c = i10;
        view.setEnabled(false);
    }

    @Override // y8.a
    public final void b() {
        f();
    }

    @Override // y8.a
    public final void c() {
        this.f15341b.setEnabled(false);
    }

    @Override // y8.a
    public final void d(v8.d dVar) {
        super.d(dVar);
        f();
    }

    @Override // y8.a
    public final void e() {
        this.f15341b.setEnabled(false);
        this.f18545a = null;
    }

    public final void f() {
        w8.g gVar = this.f18545a;
        if (gVar != null) {
            if (gVar.j()) {
                u8.o g10 = gVar.g();
                Objects.requireNonNull(g10, "null reference");
                if (!g10.r0(128L)) {
                    if (g10.F == 0) {
                        Integer p02 = g10.p0(g10.f15738j);
                        if (p02 != null && p02.intValue() > 0) {
                        }
                    }
                }
                if (!gVar.p()) {
                    this.f15341b.setVisibility(0);
                    this.f15341b.setEnabled(true);
                    return;
                }
            }
            this.f15341b.setVisibility(this.f15342c);
            this.f15341b.setEnabled(false);
        }
        this.f15341b.setVisibility(this.f15342c);
        this.f15341b.setEnabled(false);
    }
}
