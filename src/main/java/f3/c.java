package f3;

import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.user.UserSettings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9371a;

    public c(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9371a = currentUserRepository;
    }

    public final void a(UserOrientation userOrientation) {
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        this.f9371a.b(UserSettings.copy$default(this.f9371a.f(), userOrientation, null, false, false, false, false, 62, null));
    }
}
