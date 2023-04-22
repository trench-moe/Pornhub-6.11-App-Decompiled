package f3;

import com.app.pornhub.domain.model.user.UserSettings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9384a;

    public o(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9384a = currentUserRepository;
    }

    public final UserSettings a() {
        return this.f9384a.f();
    }
}
