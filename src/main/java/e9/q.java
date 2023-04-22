package e9;

import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends c1 {

    /* renamed from: t  reason: collision with root package name */
    public final p.c<a<?>> f9243t;

    /* renamed from: u  reason: collision with root package name */
    public final d f9244u;

    public q(f fVar, d dVar, c9.e eVar) {
        super(fVar, eVar);
        this.f9243t = new p.c<>(0);
        this.f9244u = dVar;
        fVar.d("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e() {
        if (!this.f9243t.isEmpty()) {
            this.f9244u.a(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g() {
        this.f9166f = true;
        if (this.f9243t.isEmpty()) {
            return;
        }
        this.f9244u.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        this.f9166f = false;
        d dVar = this.f9244u;
        Objects.requireNonNull(dVar);
        synchronized (d.H) {
            if (dVar.A == this) {
                dVar.A = null;
                dVar.B.clear();
            }
        }
    }
}
