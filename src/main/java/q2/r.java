package q2;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import pe.t;

/* loaded from: classes2.dex */
public final class r implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f14296a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<pe.q> f14297b;

    public r(a0.b bVar, ie.a<pe.q> aVar) {
        this.f14296a = bVar;
        this.f14297b = aVar;
    }

    @Override // ie.a
    public Object get() {
        a0.b bVar = this.f14296a;
        pe.q loggingInterceptor = this.f14297b.get();
        Objects.requireNonNull(bVar);
        Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
        t.a aVar = new t.a();
        List<? extends Protocol> singletonList = Collections.singletonList(Protocol.HTTP_1_1);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(Protocol.HTTP_1_1)");
        aVar.f(singletonList);
        aVar.a(loggingInterceptor);
        return new pe.t(aVar);
    }
}
