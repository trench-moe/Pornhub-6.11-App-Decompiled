package f3;

import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.jvm.internal.Intrinsics;
import x2.a0;
import x2.k0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9385a;

    public p(b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f9385a = currentUserRepository;
    }

    public final Observable<UseCaseResult<UserMetaData>> a(Single<UserMetaData> single) {
        Observable<UseCaseResult<UserMetaData>> startWith = single.toObservable().map(a0.A).onErrorReturn(k0.f17770u).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "source\n            .toOb…th(UseCaseResult.Loading)");
        return startWith;
    }
}
