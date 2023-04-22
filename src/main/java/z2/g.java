package z2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final cb.e f18854a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<Context> f18855b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<SharedPreferences> f18856c;
    public final ie.a<b3.e> d;

    public g(cb.e eVar, ie.a<Context> aVar, ie.a<SharedPreferences> aVar2, ie.a<b3.e> aVar3) {
        this.f18854a = eVar;
        this.f18855b = aVar;
        this.f18856c = aVar2;
        this.d = aVar3;
    }

    @Override // ie.a
    public Object get() {
        cb.e eVar = this.f18854a;
        Context context = this.f18855b.get();
        SharedPreferences preferences = this.f18856c.get();
        b3.e currentUserRepository = this.d.get();
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return new q3.g(resources, preferences, currentUserRepository);
    }
}
