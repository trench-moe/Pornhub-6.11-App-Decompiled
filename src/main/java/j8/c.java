package j8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import k8.c0;

/* loaded from: classes.dex */
public abstract class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11563a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<t> f11564b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    public int f11565c;
    public h d;

    public c(boolean z10) {
        this.f11563a = z10;
    }

    @Override // j8.f
    public Map k() {
        return Collections.emptyMap();
    }

    @Override // j8.f
    public final void n(t tVar) {
        Objects.requireNonNull(tVar);
        if (!this.f11564b.contains(tVar)) {
            this.f11564b.add(tVar);
            this.f11565c++;
        }
    }

    public final void p(int i10) {
        h hVar = this.d;
        int i11 = c0.f11939a;
        for (int i12 = 0; i12 < this.f11565c; i12++) {
            this.f11564b.get(i12).a(this, hVar, this.f11563a, i10);
        }
    }

    public final void q() {
        h hVar = this.d;
        int i10 = c0.f11939a;
        for (int i11 = 0; i11 < this.f11565c; i11++) {
            this.f11564b.get(i11).e(this, hVar, this.f11563a);
        }
        this.d = null;
    }

    public final void r(h hVar) {
        for (int i10 = 0; i10 < this.f11565c; i10++) {
            this.f11564b.get(i10).b(this, hVar, this.f11563a);
        }
    }

    public final void s(h hVar) {
        this.d = hVar;
        for (int i10 = 0; i10 < this.f11565c; i10++) {
            this.f11564b.get(i10).g(this, hVar, this.f11563a);
        }
    }
}
