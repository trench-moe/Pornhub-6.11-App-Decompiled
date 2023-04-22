package f3;

import com.app.pornhub.domain.model.user.UserSettings;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9383a;

    public n(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9383a = currentUserRepository;
    }

    public final Observable<UserSettings> a(boolean z10) {
        Observable<UserSettings> j10 = this.f9383a.j();
        if (z10) {
            Observable<UserSettings> merge = Observable.merge(Observable.just(this.f9383a.f()), j10);
            Intrinsics.checkNotNullExpressionValue(merge, "merge(\n                O… observable\n            )");
            return merge;
        }
        return j10;
    }
}
