package f3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9390a;

    public u(b3.e currentUserRepository, int i10) {
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
            this.f9390a = currentUserRepository;
            return;
        }
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9390a = currentUserRepository;
    }
}
