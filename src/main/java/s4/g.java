package s4;

import com.app.pornhub.view.home.pornstars.PerformersViewModel;
import f3.m;

/* loaded from: classes2.dex */
public final class g implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<k3.e> f14831a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<m> f14832b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<k3.b> f14833c;
    public final ie.a<k3.a> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<k3.f> f14834e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a<k3.g> f14835f;

    /* renamed from: g  reason: collision with root package name */
    public final ie.a<k3.d> f14836g;

    public g(ie.a<k3.e> aVar, ie.a<m> aVar2, ie.a<k3.b> aVar3, ie.a<k3.a> aVar4, ie.a<k3.f> aVar5, ie.a<k3.g> aVar6, ie.a<k3.d> aVar7) {
        this.f14831a = aVar;
        this.f14832b = aVar2;
        this.f14833c = aVar3;
        this.d = aVar4;
        this.f14834e = aVar5;
        this.f14835f = aVar6;
        this.f14836g = aVar7;
    }

    @Override // ie.a
    public Object get() {
        return new PerformersViewModel(this.f14831a.get(), this.f14832b.get(), this.f14833c.get(), this.d.get(), this.f14834e.get(), this.f14835f.get(), this.f14836g.get());
    }
}
