package q2;

import android.app.Application;
import android.content.SharedPreferences;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14186a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f14187b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f14188c;
    public final Object d;

    public /* synthetic */ b0(Object obj, ie.a aVar, ie.a aVar2, int i10) {
        this.f14186a = i10;
        this.d = obj;
        this.f14187b = aVar;
        this.f14188c = aVar2;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14186a) {
            case 0:
                p2.a tokenStorage = (p2.a) this.f14187b.get();
                b3.e currentUserRepository = (b3.e) this.f14188c.get();
                Objects.requireNonNull((a0.b) this.d);
                Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
                Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
                return new p2.c(tokenStorage, currentUserRepository);
            default:
                Application application = (Application) this.f14187b.get();
                SharedPreferences sharedPreferences = (SharedPreferences) this.f14188c.get();
                Objects.requireNonNull((cb.e) this.d);
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
                if (sharedPreferences.getBoolean(application.getString(R.string.pref_use_stage), false)) {
                    String string = sharedPreferences.getString(application.getString(R.string.pref_stage_input), BuildConfig.FLAVOR);
                    Intrinsics.checkNotNull(string);
                    return string;
                }
                return null;
        }
    }
}
