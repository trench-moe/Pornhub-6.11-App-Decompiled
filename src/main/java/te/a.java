package te;

import java.io.IOException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RouteException;
import pe.q;
import pe.t;
import pe.y;

/* loaded from: classes3.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15415a = new a();

    @Override // pe.q
    public y a(q.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        ue.g chain2 = (ue.g) chain;
        e eVar = chain2.f15885b;
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (eVar) {
            if (!eVar.B) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!eVar.A)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!eVar.f15449z)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        d dVar = eVar.f15446t;
        Intrinsics.checkNotNull(dVar);
        t client = eVar.F;
        Objects.requireNonNull(dVar);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            int i10 = chain2.f15889g;
            int i11 = chain2.f15890h;
            int i12 = chain2.f15891i;
            Objects.requireNonNull(client);
            c cVar = new c(eVar, eVar.f15443f, dVar, dVar.a(i10, i11, i12, 0, client.f14025t, !Intrinsics.areEqual(chain2.f15888f.f14050c, "GET")).k(client, chain2));
            eVar.y = cVar;
            eVar.D = cVar;
            synchronized (eVar) {
                eVar.f15449z = true;
                eVar.A = true;
            }
            if (eVar.C) {
                throw new IOException("Canceled");
            }
            return ue.g.b(chain2, 0, cVar, null, 0, 0, 0, 61).c(chain2.f15888f);
        } catch (IOException e10) {
            dVar.c(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            dVar.c(e11.c());
            throw e11;
        }
    }
}
