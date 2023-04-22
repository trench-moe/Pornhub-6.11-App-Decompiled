package g4;

import android.app.Application;
import com.app.pornhub.view.home.NavigationViewModel;

/* loaded from: classes.dex */
public final class z implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<Application> f9775a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<f3.s> f9776b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<f3.k> f9777c;
    public final ie.a<q3.d> d;

    public z(ie.a<Application> aVar, ie.a<f3.s> aVar2, ie.a<f3.k> aVar3, ie.a<q3.d> aVar4) {
        this.f9775a = aVar;
        this.f9776b = aVar2;
        this.f9777c = aVar3;
        this.d = aVar4;
    }

    @Override // ie.a
    public Object get() {
        return new NavigationViewModel(this.f9775a.get(), this.f9776b.get(), this.f9777c.get(), this.d.get());
    }
}
