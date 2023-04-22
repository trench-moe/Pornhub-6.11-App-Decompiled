package f3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9376a;

    public g(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9376a = currentUserRepository;
    }

    public final String a(String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        return this.f9376a.d(baseUrl);
    }
}
