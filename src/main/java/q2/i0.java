package q2;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x2.d1;
import x2.n0;

/* loaded from: classes2.dex */
public final class i0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14248a;

    /* renamed from: b  reason: collision with root package name */
    public final cb.e f14249b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f14250c;
    public final ie.a d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a f14251e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a f14252f;

    public /* synthetic */ i0(cb.e eVar, ie.a aVar, ie.a aVar2, ie.a aVar3, ie.a aVar4, int i10) {
        this.f14248a = i10;
        this.f14249b = eVar;
        this.f14250c = aVar;
        this.d = aVar2;
        this.f14251e = aVar3;
        this.f14252f = aVar4;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14248a) {
            case 0:
                cb.e eVar = this.f14249b;
                w2.f dvdsService = (w2.f) this.f14250c.get();
                s2.a modelMapper = (s2.a) this.d.get();
                y2.a exceptionMapper = (y2.a) this.f14251e.get();
                b3.e currentUserRepository = (b3.e) this.f14252f.get();
                Objects.requireNonNull(eVar);
                Intrinsics.checkNotNullParameter(dvdsService, "dvdsService");
                Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
                Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
                return new n0(dvdsService, modelMapper, exceptionMapper, currentUserRepository);
            default:
                cb.e eVar2 = this.f14249b;
                w2.m searchSuggestionsService = (w2.m) this.f14250c.get();
                s2.a modelMapper2 = (s2.a) this.d.get();
                y2.a exceptionMapper2 = (y2.a) this.f14251e.get();
                b3.e currentUserRepository2 = (b3.e) this.f14252f.get();
                Objects.requireNonNull(eVar2);
                Intrinsics.checkNotNullParameter(searchSuggestionsService, "searchSuggestionsService");
                Intrinsics.checkNotNullParameter(modelMapper2, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper2, "exceptionMapper");
                Intrinsics.checkNotNullParameter(currentUserRepository2, "currentUserRepository");
                return new d1(searchSuggestionsService, modelMapper2, exceptionMapper2, currentUserRepository2);
        }
    }
}
