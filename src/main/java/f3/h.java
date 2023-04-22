package f3;

import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserMetaData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9377a;

    public h(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9377a = currentUserRepository;
    }

    public final UserAuthLevel a() {
        UserMetaData p10 = this.f9377a.p();
        String userType = p10 == null ? null : p10.getUserType();
        if (userType != null) {
            switch (userType.hashCode()) {
                case 2198156:
                    if (userType.equals(UsersConfig.USER_TYPE_FREE)) {
                        return UserAuthLevel.Free.INSTANCE;
                    }
                    break;
                case 81075958:
                    if (userType.equals(UsersConfig.USER_TYPE_TRIAL)) {
                        return UserAuthLevel.Trial.INSTANCE;
                    }
                    break;
                case 355417861:
                    if (userType.equals(UsersConfig.USER_TYPE_EXPIRED)) {
                        return UserAuthLevel.Expired.INSTANCE;
                    }
                    break;
                case 1346201143:
                    if (userType.equals(UsersConfig.USER_TYPE_PREMIUM)) {
                        return UserAuthLevel.Premium.INSTANCE;
                    }
                    break;
            }
        }
        return UserAuthLevel.None.INSTANCE;
    }
}
