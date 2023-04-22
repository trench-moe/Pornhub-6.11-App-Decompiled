package c3;

import b3.e;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import x2.i1;
import x2.y;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b3.a f3723a;

    /* renamed from: b  reason: collision with root package name */
    public final e f3724b;

    public a(b3.a adsAndPromosRepository, e currentUserRepository) {
        Intrinsics.checkNotNullParameter(adsAndPromosRepository, "adsAndPromosRepository");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f3723a = adsAndPromosRepository;
        this.f3724b = currentUserRepository;
    }

    public final Observable<UseCaseResult<PromoBanner>> a() {
        UsersConfig.Companion companion = UsersConfig.Companion;
        UserMetaData p10 = this.f3724b.p();
        if (companion.isPremiumAllowed(companion.getUserAuthLevel(p10 == null ? null : p10.getUserType()))) {
            Observable<UseCaseResult<PromoBanner>> just = Observable.just(new UseCaseResult.Failure(new IllegalArgumentException("Can not display promo banner for premium users")));
            Intrinsics.checkNotNullExpressionValue(just, "{\n            Observable…emium users\")))\n        }");
            return just;
        }
        Observable<UseCaseResult<PromoBanner>> startWith = this.f3723a.c().toObservable().map(y.f17891j).onErrorReturn(i1.f17745j).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "{\n            adsAndProm…Result.Loading)\n        }");
        return startWith;
    }
}
