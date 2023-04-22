package p2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.o;
import pe.p;
import pe.q;
import pe.u;
import pe.x;
import pe.y;
import ue.g;

/* loaded from: classes2.dex */
public final class c implements q {

    /* renamed from: a  reason: collision with root package name */
    public final a f13783a;

    /* renamed from: b  reason: collision with root package name */
    public final b3.e f13784b;

    public c(a tokenStorage, b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f13783a = tokenStorage;
        this.f13784b = currentUserRepository;
    }

    @Override // pe.q
    public y a(q.a chain) {
        Map unmodifiableMap;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        u request = gVar.f15888f;
        Objects.requireNonNull(request);
        Intrinsics.checkNotNullParameter(request, "request");
        new LinkedHashMap();
        p pVar = request.f14049b;
        String str = request.f14050c;
        x xVar = request.f14051e;
        Map toImmutableMap = request.f14052f.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(request.f14052f);
        o.a g10 = request.d.g();
        if (this.f13783a.d().length() > 0) {
            String value = this.f13783a.d();
            Intrinsics.checkNotNullParameter("Authorization", AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullParameter(value, "value");
            g10.a("Authorization", value);
        }
        if (pVar != null) {
            o c10 = g10.c();
            byte[] bArr = qe.c.f14512a;
            Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
            if (toImmutableMap.isEmpty()) {
                unmodifiableMap = MapsKt.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
                Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            y c11 = gVar.c(new u(pVar, str, c10, xVar, unmodifiableMap));
            if (c11.f14065m == 403) {
                this.f13784b.l();
            }
            return c11;
        }
        throw new IllegalStateException("url == null".toString());
    }
}
