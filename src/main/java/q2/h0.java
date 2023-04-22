package q2;

import android.content.SharedPreferences;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x2.m0;

/* loaded from: classes2.dex */
public final class h0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final cb.e f14235a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<w2.b> f14236b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<s2.a> f14237c;
    public final ie.a<r2.a> d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a<y2.a> f14238e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a<p2.d> f14239f;

    /* renamed from: g  reason: collision with root package name */
    public final ie.a<p2.a> f14240g;

    /* renamed from: h  reason: collision with root package name */
    public final ie.a<String> f14241h;

    /* renamed from: i  reason: collision with root package name */
    public final ie.a<SharedPreferences> f14242i;

    /* renamed from: j  reason: collision with root package name */
    public final ie.a<SharedPreferences> f14243j;

    public h0(cb.e eVar, ie.a<w2.b> aVar, ie.a<s2.a> aVar2, ie.a<r2.a> aVar3, ie.a<y2.a> aVar4, ie.a<p2.d> aVar5, ie.a<p2.a> aVar6, ie.a<String> aVar7, ie.a<SharedPreferences> aVar8, ie.a<SharedPreferences> aVar9) {
        this.f14235a = eVar;
        this.f14236b = aVar;
        this.f14237c = aVar2;
        this.d = aVar3;
        this.f14238e = aVar4;
        this.f14239f = aVar5;
        this.f14240g = aVar6;
        this.f14241h = aVar7;
        this.f14242i = aVar8;
        this.f14243j = aVar9;
    }

    @Override // ie.a
    public Object get() {
        cb.e eVar = this.f14235a;
        w2.b authService = this.f14236b.get();
        s2.a modelMapper = this.f14237c.get();
        r2.a serializationHelper = this.d.get();
        y2.a exceptionMapper = this.f14238e.get();
        p2.d tokenService = this.f14239f.get();
        p2.a tokenStorage = this.f14240g.get();
        String androidId = this.f14241h.get();
        SharedPreferences persistentPreferences = this.f14242i.get();
        SharedPreferences userPreferences = this.f14243j.get();
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(authService, "authService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(serializationHelper, "serializationHelper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(tokenService, "tokenService");
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(persistentPreferences, "persistentPreferences");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        return new m0(authService, tokenService, tokenStorage, modelMapper, serializationHelper, exceptionMapper, androidId, persistentPreferences, userPreferences);
    }
}
