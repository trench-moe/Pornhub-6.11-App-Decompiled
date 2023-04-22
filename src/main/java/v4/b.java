package v4;

import android.content.SharedPreferences;
import com.app.pornhub.view.launch.LaunchViewModel;
import f3.h;
import f3.l;
import f3.o;
import f3.q;

/* loaded from: classes2.dex */
public final class b implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<m3.a> f16003a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<l> f16004b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<SharedPreferences> f16005c;
    public final ie.a<h> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<o> f16006e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a<f3.d> f16007f;

    /* renamed from: g  reason: collision with root package name */
    public final ie.a<q3.a> f16008g;

    /* renamed from: h  reason: collision with root package name */
    public final ie.a<q> f16009h;

    /* renamed from: i  reason: collision with root package name */
    public final ie.a<q3.d> f16010i;

    public b(ie.a<m3.a> aVar, ie.a<l> aVar2, ie.a<SharedPreferences> aVar3, ie.a<h> aVar4, ie.a<o> aVar5, ie.a<f3.d> aVar6, ie.a<q3.a> aVar7, ie.a<q> aVar8, ie.a<q3.d> aVar9) {
        this.f16003a = aVar;
        this.f16004b = aVar2;
        this.f16005c = aVar3;
        this.d = aVar4;
        this.f16006e = aVar5;
        this.f16007f = aVar6;
        this.f16008g = aVar7;
        this.f16009h = aVar8;
        this.f16010i = aVar9;
    }

    @Override // ie.a
    public Object get() {
        return new LaunchViewModel(this.f16003a.get(), this.f16004b.get(), this.f16005c.get(), this.d.get(), this.f16006e.get(), this.f16007f.get(), this.f16008g.get(), this.f16009h.get(), this.f16010i.get());
    }
}
