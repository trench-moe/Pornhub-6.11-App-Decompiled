package f3;

import com.app.pornhub.domain.model.user.UserMetaData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9380a;

    public k(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9380a = currentUserRepository;
    }

    public final UserMetaData a() {
        return this.f9380a.p();
    }
}
