package q2;

import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import pe.t;

/* loaded from: classes2.dex */
public final class q implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f14290a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<pe.h> f14291b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<CertificatePinner> f14292c;
    public final ie.a<p2.b> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<p2.c> f14293e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a<pe.q> f14294f;

    /* renamed from: g  reason: collision with root package name */
    public final ie.a<pe.q> f14295g;

    public q(a0.b bVar, ie.a<pe.h> aVar, ie.a<CertificatePinner> aVar2, ie.a<p2.b> aVar3, ie.a<p2.c> aVar4, ie.a<pe.q> aVar5, ie.a<pe.q> aVar6) {
        this.f14290a = bVar;
        this.f14291b = aVar;
        this.f14292c = aVar2;
        this.d = aVar3;
        this.f14293e = aVar4;
        this.f14294f = aVar5;
        this.f14295g = aVar6;
    }

    @Override // ie.a
    public Object get() {
        a0.b bVar = this.f14290a;
        pe.h connectionSpec = this.f14291b.get();
        CertificatePinner certificatePinner = this.f14292c.get();
        p2.b authenticator = this.d.get();
        p2.c tokenInterceptor = this.f14293e.get();
        pe.q seedInterceptor = this.f14294f.get();
        pe.q loggingInterceptor = this.f14295g.get();
        Objects.requireNonNull(bVar);
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(tokenInterceptor, "tokenInterceptor");
        Intrinsics.checkNotNullParameter(seedInterceptor, "seedInterceptor");
        Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
        Log.e("TAG", "OVO JE RELEASE");
        t.a aVar = new t.a();
        List<? extends Protocol> singletonList = Collections.singletonList(Protocol.HTTP_1_1);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(Protocol.HTTP_1_1)");
        aVar.f(singletonList);
        aVar.e(CollectionsKt.listOf(connectionSpec));
        aVar.c(certificatePinner);
        aVar.a(seedInterceptor);
        aVar.a(tokenInterceptor);
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        aVar.f14034g = authenticator;
        aVar.a(loggingInterceptor);
        return new pe.t(aVar);
    }
}
