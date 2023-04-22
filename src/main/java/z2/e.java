package z2;

import android.app.Application;
import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final cb.e f18799a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<Application> f18800b;

    public e(cb.e eVar, ie.a<Application> aVar) {
        this.f18799a = eVar;
        this.f18800b = aVar;
    }

    @Override // ie.a
    public Object get() {
        cb.e eVar = this.f18799a;
        Application application = this.f18800b.get();
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(application, "application");
        Context applicationContext = application.getApplicationContext();
        Objects.requireNonNull(applicationContext, "Cannot return null from a non-@Nullable @Provides method");
        return applicationContext;
    }
}
