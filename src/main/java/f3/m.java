package f3;

import com.app.pornhub.domain.model.user.UserOrientation;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9382a;

    public m(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9382a = currentUserRepository;
    }

    public final Observable<UserOrientation> a(boolean z10) {
        Observable<UserOrientation> q10 = this.f9382a.q();
        if (z10) {
            Observable<UserOrientation> merge = Observable.merge(Observable.just(this.f9382a.f().getOrientation()), q10);
            Intrinsics.checkNotNullExpressionValue(merge, "merge(\n                O… observable\n            )");
            return merge;
        }
        return q10;
    }
}
