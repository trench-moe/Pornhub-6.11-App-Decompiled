package q6;

import com.google.android.exoplayer2.source.j;
import java.util.Objects;
import java.util.logging.Logger;
import l6.m;
import l6.q;
import m6.k;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14402c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14403f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14404j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f14405m;
    public final /* synthetic */ Object n;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f14402c = i10;
        this.f14403f = obj;
        this.f14404j = obj2;
        this.f14405m = obj3;
        this.n = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14402c) {
            case 0:
                c cVar = (c) this.f14403f;
                q qVar = (q) this.f14404j;
                i6.f fVar = (i6.f) this.f14405m;
                m mVar = (m) this.n;
                Objects.requireNonNull(cVar);
                try {
                    k kVar = cVar.f14413c.get(qVar.b());
                    if (kVar == null) {
                        String format = String.format("Transport backend '%s' is not registered", qVar.b());
                        c.f14410f.warning(format);
                        fVar.g(new IllegalArgumentException(format));
                    } else {
                        cVar.f14414e.c(new b(cVar, qVar, kVar.b(mVar), 0));
                        fVar.g(null);
                    }
                    return;
                } catch (Exception e10) {
                    Logger logger = c.f14410f;
                    logger.warning("Error scheduling event " + e10.getMessage());
                    fVar.g(e10);
                    return;
                }
            default:
                j.a aVar = (j.a) this.f14403f;
                ((j) this.f14404j).B(aVar.f6334a, aVar.f6335b, (w7.c) this.f14405m, (w7.d) this.n);
                return;
        }
    }
}
