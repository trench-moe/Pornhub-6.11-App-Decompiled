package i4;

import com.app.pornhub.view.home.albums.AlbumsViewModel;
import com.app.pornhub.view.home.explore.ExploreFragmentViewModel;
import f3.k;
import f3.m;
import f3.s;

/* loaded from: classes2.dex */
public final class i implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10518a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f10519b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f10520c;
    public final ie.a d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a f10521e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a f10522f;

    public /* synthetic */ i(ie.a aVar, ie.a aVar2, ie.a aVar3, ie.a aVar4, ie.a aVar5, int i10) {
        this.f10518a = i10;
        this.f10519b = aVar;
        this.f10520c = aVar2;
        this.d = aVar3;
        this.f10521e = aVar4;
        this.f10522f = aVar5;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f10518a) {
            case 0:
                return new AlbumsViewModel((m) this.f10519b.get(), (i3.c) this.f10520c.get(), (i3.e) this.d.get(), (i3.b) this.f10521e.get(), (k) this.f10522f.get());
            default:
                return new ExploreFragmentViewModel((m) this.f10519b.get(), (s) this.f10520c.get(), (f3.h) this.d.get(), (g3.b) this.f10521e.get(), (c3.a) this.f10522f.get());
        }
    }
}
