package z2;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18743a;

    /* renamed from: b  reason: collision with root package name */
    public final cb.e f18744b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f18745c;

    public /* synthetic */ c(cb.e eVar, ie.a aVar, int i10) {
        this.f18743a = i10;
        this.f18744b = eVar;
        this.f18745c = aVar;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f18743a) {
            case 0:
                cb.e eVar = this.f18744b;
                Application application = (Application) this.f18745c.get();
                Objects.requireNonNull(eVar);
                Intrinsics.checkNotNullParameter(application, "application");
                Context applicationContext = application.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
                return new t3.c(applicationContext);
            default:
                cb.e eVar2 = this.f18744b;
                Application application2 = (Application) this.f18745c.get();
                Objects.requireNonNull(eVar2);
                Intrinsics.checkNotNullParameter(application2, "application");
                SharedPreferences sharedPreferences = application2.getSharedPreferences("user_prefs", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "application.getSharedPre…ME, Context.MODE_PRIVATE)");
                Objects.requireNonNull(sharedPreferences, "Cannot return null from a non-@Nullable @Provides method");
                return sharedPreferences;
        }
    }
}
