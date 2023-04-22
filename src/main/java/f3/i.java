package f3;

import com.appsflyer.oaid.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9378a;

    public i(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9378a = currentUserRepository;
    }

    public final String a() {
        String c10 = this.f9378a.c();
        return c10 == null ? BuildConfig.FLAVOR : c10;
    }
}
