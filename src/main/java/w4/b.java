package w4;

import android.content.SharedPreferences;
import com.app.pornhub.view.login.LoginViewModel;
import f3.g;
import f3.h;
import f3.o;
import f3.p;
import f3.r;
import f3.t;

/* loaded from: classes2.dex */
public final class b implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<p> f16385a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<r> f16386b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<t> f16387c;
    public final ie.a<h> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<o> f16388e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a<g> f16389f;

    /* renamed from: g  reason: collision with root package name */
    public final ie.a<q3.d> f16390g;

    /* renamed from: h  reason: collision with root package name */
    public final ie.a<SharedPreferences> f16391h;

    public b(ie.a<p> aVar, ie.a<r> aVar2, ie.a<t> aVar3, ie.a<h> aVar4, ie.a<o> aVar5, ie.a<g> aVar6, ie.a<q3.d> aVar7, ie.a<SharedPreferences> aVar8) {
        this.f16385a = aVar;
        this.f16386b = aVar2;
        this.f16387c = aVar3;
        this.d = aVar4;
        this.f16388e = aVar5;
        this.f16389f = aVar6;
        this.f16390g = aVar7;
        this.f16391h = aVar8;
    }

    @Override // ie.a
    public Object get() {
        return new LoginViewModel(this.f16385a.get(), this.f16386b.get(), this.f16387c.get(), this.d.get(), this.f16388e.get(), this.f16389f.get(), this.f16390g.get(), this.f16391h.get());
    }
}
