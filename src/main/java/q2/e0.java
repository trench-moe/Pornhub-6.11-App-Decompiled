package q2;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import pe.t;
import x2.m1;
import x2.r0;

/* loaded from: classes2.dex */
public final class e0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14209a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14210b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f14211c;
    public final ie.a d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a f14212e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a f14213f;

    public /* synthetic */ e0(Object obj, ie.a aVar, ie.a aVar2, ie.a aVar3, ie.a aVar4, int i10) {
        this.f14209a = i10;
        this.f14210b = obj;
        this.f14211c = aVar;
        this.d = aVar2;
        this.f14212e = aVar3;
        this.f14213f = aVar4;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14209a) {
            case 0:
                w2.c categoryService = (w2.c) this.f14211c.get();
                s2.a modelMapper = (s2.a) this.d.get();
                y2.a exceptionMapper = (y2.a) this.f14212e.get();
                b3.e currentUserRepository = (b3.e) this.f14213f.get();
                Objects.requireNonNull((cb.e) this.f14210b);
                Intrinsics.checkNotNullParameter(categoryService, "categoryService");
                Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
                Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
                return new x2.l(categoryService, modelMapper, exceptionMapper, currentUserRepository);
            case 1:
                w2.h gifsService = (w2.h) this.f14211c.get();
                s2.a modelMapper2 = (s2.a) this.d.get();
                y2.a exceptionMapper2 = (y2.a) this.f14212e.get();
                b3.e currentUserRepository2 = (b3.e) this.f14213f.get();
                Objects.requireNonNull((cb.e) this.f14210b);
                Intrinsics.checkNotNullParameter(gifsService, "gifsService");
                Intrinsics.checkNotNullParameter(modelMapper2, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper2, "exceptionMapper");
                Intrinsics.checkNotNullParameter(currentUserRepository2, "currentUserRepository");
                return new r0(gifsService, modelMapper2, exceptionMapper2, currentUserRepository2);
            case 2:
                b3.e currentUserRepository3 = (b3.e) this.f14211c.get();
                w2.o userService = (w2.o) this.d.get();
                s2.a modelMapper3 = (s2.a) this.f14212e.get();
                y2.a exceptionMapper3 = (y2.a) this.f14213f.get();
                Objects.requireNonNull((cb.e) this.f14210b);
                Intrinsics.checkNotNullParameter(currentUserRepository3, "currentUserRepository");
                Intrinsics.checkNotNullParameter(userService, "userService");
                Intrinsics.checkNotNullParameter(modelMapper3, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper3, "exceptionMapper");
                return new m1(currentUserRepository3, userService, modelMapper3, exceptionMapper3);
            default:
                pe.h connectionSpec = (pe.h) this.f14211c.get();
                CertificatePinner certificatePinner = (CertificatePinner) this.d.get();
                pe.q seedInterceptor = (pe.q) this.f14212e.get();
                pe.q loggingInterceptor = (pe.q) this.f14213f.get();
                Objects.requireNonNull((a0.b) this.f14210b);
                Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
                Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
                Intrinsics.checkNotNullParameter(seedInterceptor, "seedInterceptor");
                Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
                t.a aVar = new t.a();
                List<? extends Protocol> singletonList = Collections.singletonList(Protocol.HTTP_1_1);
                Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(Protocol.HTTP_1_1)");
                aVar.f(singletonList);
                aVar.e(CollectionsKt.listOf(connectionSpec));
                aVar.c(certificatePinner);
                aVar.a(seedInterceptor);
                aVar.a(loggingInterceptor);
                return new pe.t(aVar);
        }
    }
}
