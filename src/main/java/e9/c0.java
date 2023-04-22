package e9;

import com.google.android.gms.common.api.Scope;
import d9.a;
import h9.b;
import java.util.Set;

/* loaded from: classes.dex */
public final class c0 implements b.c, o0 {

    /* renamed from: a  reason: collision with root package name */
    public final a.f f9161a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?> f9162b;

    /* renamed from: c  reason: collision with root package name */
    public h9.h f9163c = null;
    public Set<Scope> d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9164e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f9165f;

    public c0(d dVar, a.f fVar, a<?> aVar) {
        this.f9165f = dVar;
        this.f9161a = fVar;
        this.f9162b = aVar;
    }

    @Override // h9.b.c
    public final void a(c9.b bVar) {
        this.f9165f.D.post(new b0(this, bVar));
    }

    public final void b(c9.b bVar) {
        z<?> zVar = this.f9165f.f9176z.get(this.f9162b);
        if (zVar != null) {
            h9.o.c(zVar.f9270m.D);
            a.f fVar = zVar.f9260b;
            String name = fVar.getClass().getName();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
            sb2.append("onSignInFailed for ");
            sb2.append(name);
            sb2.append(" with ");
            sb2.append(valueOf);
            fVar.disconnect(sb2.toString());
            zVar.q(bVar, null);
        }
    }
}
