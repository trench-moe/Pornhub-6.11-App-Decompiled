package b5;

import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;
import f3.o;
import j3.e;

/* loaded from: classes.dex */
public final class a implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<o> f3570a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<e> f3571b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<j3.b> f3572c;

    public a(ie.a<o> aVar, ie.a<e> aVar2, ie.a<j3.b> aVar3) {
        this.f3570a = aVar;
        this.f3571b = aVar2;
        this.f3572c = aVar3;
    }

    @Override // ie.a
    public Object get() {
        return new PlaylistDetailsViewModel(this.f3570a.get(), this.f3571b.get(), this.f3572c.get());
    }
}
