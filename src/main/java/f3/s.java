package f3;

import com.app.pornhub.domain.model.Optional;
import com.app.pornhub.domain.model.OptionalKt;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserMetaData;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import x2.k0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9388a;

    public s(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9388a = currentUserRepository;
    }

    public final Observable<UserAuthLevel> a(boolean z10) {
        Observable<Optional<UserMetaData>> s10 = this.f9388a.s();
        UserMetaData p10 = this.f9388a.p();
        if (z10) {
            s10 = Observable.merge(Observable.just(OptionalKt.asOptional(p10)), s10);
        }
        Observable map = s10.map(k0.f17771w);
        Intrinsics.checkNotNullExpressionValue(map, "source.map {\n           …alue?.userType)\n        }");
        return map;
    }
}
