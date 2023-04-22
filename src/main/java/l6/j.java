package l6;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Objects;
import java.util.concurrent.Executor;
import l6.n;
import s6.a0;
import s6.f;
import s6.h;
import s6.i;
import u6.b;
import u6.c;

/* loaded from: classes2.dex */
public final class j extends w {
    public ie.a<r6.i> A;
    public ie.a<r6.k> B;
    public ie.a<v> C;

    /* renamed from: c  reason: collision with root package name */
    public ie.a<Executor> f12295c;

    /* renamed from: f  reason: collision with root package name */
    public ie.a<Context> f12296f;

    /* renamed from: j  reason: collision with root package name */
    public ie.a f12297j;

    /* renamed from: m  reason: collision with root package name */
    public ie.a f12298m;
    public ie.a n;

    /* renamed from: t  reason: collision with root package name */
    public ie.a<String> f12299t;

    /* renamed from: u  reason: collision with root package name */
    public ie.a<s6.s> f12300u;

    /* renamed from: w  reason: collision with root package name */
    public ie.a<SchedulerConfig> f12301w;
    public ie.a<r6.m> y;

    /* renamed from: z  reason: collision with root package name */
    public ie.a<q6.c> f12302z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [o6.a] */
    public j(Context context, a aVar) {
        ie.a aVar2 = n.a.f12305a;
        Object obj = o6.a.f13601c;
        this.f12295c = aVar2 instanceof o6.a ? aVar2 : new o6.a(aVar2);
        Objects.requireNonNull(context, "instance cannot be null");
        o6.b bVar = new o6.b(context);
        this.f12296f = bVar;
        u6.b bVar2 = b.a.f15607a;
        u6.c cVar = c.a.f15608a;
        m6.h hVar = new m6.h(bVar, bVar2, cVar);
        this.f12297j = hVar;
        ie.a jVar = new m6.j(bVar, hVar);
        this.f12298m = jVar instanceof o6.a ? jVar : new o6.a(jVar);
        ie.a<Context> aVar3 = this.f12296f;
        a0 a0Var = new a0(aVar3, f.a.f14856a, h.a.f14858a);
        this.n = a0Var;
        s6.g gVar = new s6.g(aVar3);
        this.f12299t = gVar;
        s6.t tVar = new s6.t(bVar2, cVar, i.a.f14859a, a0Var, gVar);
        tVar = tVar instanceof o6.a ? tVar : new o6.a(tVar);
        this.f12300u = tVar;
        q6.f fVar = new q6.f(bVar2);
        this.f12301w = fVar;
        ie.a<Context> aVar4 = this.f12296f;
        q6.g gVar2 = new q6.g(aVar4, tVar, fVar, cVar);
        this.y = gVar2;
        ie.a<Executor> aVar5 = this.f12295c;
        ie.a aVar6 = this.f12298m;
        q6.d dVar = new q6.d(aVar5, aVar6, gVar2, tVar, tVar);
        this.f12302z = dVar;
        r6.j jVar2 = new r6.j(aVar4, aVar6, tVar, gVar2, aVar5, tVar, bVar2, cVar, tVar);
        this.A = jVar2;
        r6.l lVar = new r6.l(aVar5, tVar, gVar2, tVar);
        this.B = lVar;
        ie.a xVar = new x(bVar2, cVar, dVar, jVar2, lVar);
        this.C = xVar instanceof o6.a ? xVar : new o6.a(xVar);
    }
}
