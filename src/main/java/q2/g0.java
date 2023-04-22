package q2;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x2.c1;

/* loaded from: classes2.dex */
public final class g0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14227a;

    /* renamed from: b  reason: collision with root package name */
    public final cb.e f14228b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f14229c;
    public final ie.a d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a f14230e;

    public /* synthetic */ g0(cb.e eVar, ie.a aVar, ie.a aVar2, ie.a aVar3, int i10) {
        this.f14227a = i10;
        this.f14228b = eVar;
        this.f14229c = aVar;
        this.d = aVar2;
        this.f14230e = aVar3;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14227a) {
            case 0:
                cb.e eVar = this.f14228b;
                w2.e commentsService = (w2.e) this.f14229c.get();
                s2.a modelMapper = (s2.a) this.d.get();
                y2.a exceptionMapper = (y2.a) this.f14230e.get();
                Objects.requireNonNull(eVar);
                Intrinsics.checkNotNullParameter(commentsService, "commentsService");
                Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
                return new x2.w(commentsService, modelMapper, exceptionMapper);
            default:
                cb.e eVar2 = this.f14228b;
                w2.k playlistsService = (w2.k) this.f14229c.get();
                s2.a modelMapper2 = (s2.a) this.d.get();
                y2.a exceptionMapper2 = (y2.a) this.f14230e.get();
                Objects.requireNonNull(eVar2);
                Intrinsics.checkNotNullParameter(playlistsService, "playlistsService");
                Intrinsics.checkNotNullParameter(modelMapper2, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper2, "exceptionMapper");
                return new c1(playlistsService, modelMapper2, exceptionMapper2);
        }
    }
}
