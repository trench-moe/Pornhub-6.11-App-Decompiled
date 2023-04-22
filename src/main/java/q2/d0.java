package q2;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final cb.e f14201a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<w2.a> f14202b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<b3.e> f14203c;
    public final ie.a<s2.a> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<y2.a> f14204e;

    public d0(cb.e eVar, ie.a<w2.a> aVar, ie.a<b3.e> aVar2, ie.a<s2.a> aVar3, ie.a<y2.a> aVar4) {
        this.f14201a = eVar;
        this.f14202b = aVar;
        this.f14203c = aVar2;
        this.d = aVar3;
        this.f14204e = aVar4;
    }

    @Override // ie.a
    public Object get() {
        cb.e eVar = this.f14201a;
        w2.a adsAndPromosService = this.f14202b.get();
        b3.e currentUserRepository = this.f14203c.get();
        s2.a modelMapper = this.d.get();
        y2.a exceptionMapper = this.f14204e.get();
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(adsAndPromosService, "adsAndPromosService");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        return new x2.f(adsAndPromosService, currentUserRepository, modelMapper, exceptionMapper);
    }
}
