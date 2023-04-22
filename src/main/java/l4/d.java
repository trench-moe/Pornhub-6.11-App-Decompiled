package l4;

import cb.e;
import com.app.pornhub.view.home.discover.DiscoverViewModel;
import com.app.pornhub.view.home.videolistings.VideoListingsViewModel;
import f3.h;
import f3.m;
import f3.s;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o3.f;
import o3.i;
import x2.t0;

/* loaded from: classes2.dex */
public final class d implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12229a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f12230b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f12231c;
    public final ie.a d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a f12232e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f12233f;

    public d(e eVar, ie.a aVar, ie.a aVar2, ie.a aVar3, ie.a aVar4) {
        this.f12229a = 2;
        this.f12233f = eVar;
        this.f12230b = aVar;
        this.f12231c = aVar2;
        this.d = aVar3;
        this.f12232e = aVar4;
    }

    public /* synthetic */ d(ie.a aVar, ie.a aVar2, ie.a aVar3, ie.a aVar4, ie.a aVar5, int i10) {
        this.f12229a = i10;
        this.f12230b = aVar;
        this.f12231c = aVar2;
        this.d = aVar3;
        this.f12232e = aVar4;
        this.f12233f = aVar5;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f12229a) {
            case 0:
                return new DiscoverViewModel((m) this.f12230b.get(), (s) this.f12231c.get(), (h) this.d.get(), (g3.a) this.f12232e.get(), (c3.a) ((ie.a) this.f12233f).get());
            case 1:
                return new VideoListingsViewModel((m) this.f12230b.get(), (f) this.f12231c.get(), (i) this.d.get(), (h) this.f12232e.get(), (o3.h) ((ie.a) this.f12233f).get());
            default:
                w2.i performersService = (w2.i) this.f12230b.get();
                s2.a modelMapper = (s2.a) this.f12231c.get();
                y2.a exceptionMapper = (y2.a) this.d.get();
                b3.e currentUserRepository = (b3.e) this.f12232e.get();
                Objects.requireNonNull((e) this.f12233f);
                Intrinsics.checkNotNullParameter(performersService, "performersService");
                Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
                Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
                Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
                return new t0(performersService, modelMapper, exceptionMapper, currentUserRepository);
        }
    }
}
