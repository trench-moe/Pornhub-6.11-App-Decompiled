package q6;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import l6.q;
import l6.v;
import r6.m;

/* loaded from: classes2.dex */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f14410f = Logger.getLogger(v.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final m f14411a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f14412b;

    /* renamed from: c  reason: collision with root package name */
    public final m6.d f14413c;
    public final s6.d d;

    /* renamed from: e  reason: collision with root package name */
    public final t6.a f14414e;

    public c(Executor executor, m6.d dVar, m mVar, s6.d dVar2, t6.a aVar) {
        this.f14412b = executor;
        this.f14413c = dVar;
        this.f14411a = mVar;
        this.d = dVar2;
        this.f14414e = aVar;
    }

    @Override // q6.e
    public void a(q qVar, l6.m mVar, i6.f fVar) {
        this.f14412b.execute(new a(this, qVar, fVar, mVar, 0));
    }
}
