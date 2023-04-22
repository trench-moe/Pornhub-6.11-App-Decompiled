package q2;

import com.app.pornhub.view.home.playlists.PlaylistsViewModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x2.x0;

/* loaded from: classes2.dex */
public final class f0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14218a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14219b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f14220c;
    public final ie.a d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a f14221e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a f14222f;

    public /* synthetic */ f0(cb.e eVar, ie.a aVar, ie.a aVar2, ie.a aVar3, ie.a aVar4, int i10) {
        this.f14218a = i10;
        this.f14219b = eVar;
        this.f14220c = aVar;
        this.d = aVar2;
        this.f14221e = aVar3;
        this.f14222f = aVar4;
    }

    public f0(ie.a aVar, ie.a aVar2, ie.a aVar3, ie.a aVar4, ie.a aVar5) {
        this.f14218a = 2;
        this.f14220c = aVar;
        this.d = aVar2;
        this.f14221e = aVar3;
        this.f14222f = aVar4;
        this.f14219b = aVar5;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14218a) {
            case 0:
                w2.d channelsService = (w2.d) this.f14220c.get();
                s2.a modelMapper = (s2.a) this.d.get();
                y2.a exceptionMapper = (y2.a) this.f14221e.get();
                b3.e currentUserRepository = (b3.e) this.f14222f.get();
                Objects.requireNonNull((cb.e) this.f14219b);
                Intrinsics.checkNotNullParameter(channelsService, "channelsService");
                Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
                Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
                return new x2.o(channelsService, modelMapper, exceptionMapper, currentUserRepository);
            case 1:
                w2.j photosService = (w2.j) this.f14220c.get();
                s2.a modelMapper2 = (s2.a) this.d.get();
                y2.a exceptionMapper2 = (y2.a) this.f14221e.get();
                b3.e currentUserRepository2 = (b3.e) this.f14222f.get();
                Objects.requireNonNull((cb.e) this.f14219b);
                Intrinsics.checkNotNullParameter(photosService, "photosService");
                Intrinsics.checkNotNullParameter(modelMapper2, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper2, "exceptionMapper");
                Intrinsics.checkNotNullParameter(currentUserRepository2, "currentUserRepository");
                return new x0(photosService, modelMapper2, exceptionMapper2, currentUserRepository2);
            default:
                return new PlaylistsViewModel((f3.o) this.f14220c.get(), (f3.k) this.d.get(), (j3.f) this.f14221e.get(), (j3.g) this.f14222f.get(), (j3.b) ((ie.a) this.f14219b).get());
        }
    }
}
