package t9;

import android.view.View;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class s extends y8.a {

    /* renamed from: b  reason: collision with root package name */
    public final View f15336b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15337c;

    public s(View view, int i10) {
        this.f15336b = view;
        this.f15337c = i10;
        view.setEnabled(false);
    }

    @Override // y8.a
    public final void b() {
        f();
    }

    @Override // y8.a
    public final void c() {
        this.f15336b.setEnabled(false);
    }

    @Override // y8.a
    public final void d(v8.d dVar) {
        super.d(dVar);
        f();
    }

    @Override // y8.a
    public final void e() {
        this.f15336b.setEnabled(false);
        this.f18545a = null;
    }

    public final void f() {
        Integer p02;
        w8.g gVar = this.f18545a;
        if (gVar != null && gVar.j()) {
            u8.o g10 = gVar.g();
            Objects.requireNonNull(g10, "null reference");
            if (!g10.r0(64L)) {
                if (g10.F != 0 || ((p02 = g10.p0(g10.f15738j)) != null && p02.intValue() < g10.G.size() - 1)) {
                }
            }
            if (!gVar.p()) {
                this.f15336b.setVisibility(0);
                this.f15336b.setEnabled(true);
                return;
            }
        }
        this.f15336b.setVisibility(this.f15337c);
        this.f15336b.setEnabled(false);
    }
}
