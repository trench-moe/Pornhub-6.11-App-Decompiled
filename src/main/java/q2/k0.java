package q2;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x2.s1;

/* loaded from: classes2.dex */
public final class k0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final cb.e f14267a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<w2.p> f14268b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<b3.e> f14269c;
    public final ie.a<b3.b> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<s2.a> f14270e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a<y2.a> f14271f;

    public k0(cb.e eVar, ie.a<w2.p> aVar, ie.a<b3.e> aVar2, ie.a<b3.b> aVar3, ie.a<s2.a> aVar4, ie.a<y2.a> aVar5) {
        this.f14267a = eVar;
        this.f14268b = aVar;
        this.f14269c = aVar2;
        this.d = aVar3;
        this.f14270e = aVar4;
        this.f14271f = aVar5;
    }

    @Override // ie.a
    public Object get() {
        cb.e eVar = this.f14267a;
        w2.p videoService = this.f14268b.get();
        b3.e currentUserRepository = this.f14269c.get();
        b3.b categoriesRepository = this.d.get();
        s2.a modelMapper = this.f14270e.get();
        y2.a exceptionMapper = this.f14271f.get();
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(videoService, "videoService");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(categoriesRepository, "categoriesRepository");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        return new s1(videoService, currentUserRepository, categoriesRepository, modelMapper, exceptionMapper);
    }
}
