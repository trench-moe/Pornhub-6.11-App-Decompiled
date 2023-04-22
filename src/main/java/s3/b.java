package s3;

import com.app.pornhub.service.VideoDlService;
import io.realm.Case;
import io.realm.RealmQuery;
import io.realm.p;
import io.realm.v;
import java.util.Objects;
import k8.m;
import l6.q;
import r3.d;
import r6.i;
import t6.a;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements p.a, a.InterfaceC0268a, m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14813c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14814f;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f14813c = obj;
        this.f14814f = obj2;
    }

    public void a(p pVar) {
        int i10 = VideoDlService.C;
        Objects.requireNonNull((VideoDlService) this.f14813c);
        pVar.e();
        RealmQuery realmQuery = new RealmQuery(pVar, d.class);
        Case r42 = Case.SENSITIVE;
        realmQuery.f10812a.e();
        realmQuery.c("vkey", (String) this.f14814f, r42);
        d dVar = (d) realmQuery.e();
        if (dVar == null || !v.w(dVar)) {
            return;
        }
        dVar.u();
    }

    @Override // t6.a.InterfaceC0268a
    public Object e() {
        return Boolean.valueOf(((i) this.f14813c).f14704c.z((q) this.f14814f));
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        c0.a aVar = (c0.a) this.f14813c;
        z6.d dVar = (z6.d) this.f14814f;
        c0 c0Var = (c0) obj;
        c0Var.o0(aVar, dVar);
        c0Var.p(aVar, 1, dVar);
    }
}
