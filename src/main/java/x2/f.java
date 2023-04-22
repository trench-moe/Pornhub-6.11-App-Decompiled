package x2;

import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.ads_promo.PornhubAd;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import io.reactivex.Single;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements b3.a {

    /* renamed from: a  reason: collision with root package name */
    public final w2.a f17719a;

    /* renamed from: b  reason: collision with root package name */
    public final b3.e f17720b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.a f17721c;
    public final y2.a d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17722e;

    /* renamed from: f  reason: collision with root package name */
    public final String f17723f;

    /* renamed from: g  reason: collision with root package name */
    public PromoBanner f17724g;

    /* renamed from: h  reason: collision with root package name */
    public UserAuthLevel f17725h;

    public f(w2.a adsAndPromosService, b3.e currentUserRepository, s2.a modelMapper, y2.a exceptionMapper) {
        Intrinsics.checkNotNullParameter(adsAndPromosService, "adsAndPromosService");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        this.f17719a = adsAndPromosService;
        this.f17720b = currentUserRepository;
        this.f17721c = modelMapper;
        this.d = exceptionMapper;
        this.f17722e = "https://a.adtng.com/tj/10012800";
        this.f17723f = "https://a.adtng.com/tj/10012821";
        UsersConfig.Companion companion = UsersConfig.Companion;
        UserMetaData p10 = currentUserRepository.p();
        this.f17725h = companion.getUserAuthLevel(p10 == null ? null : p10.getUserType());
    }

    @Override // b3.a
    public Single<PornhubAd> a() {
        Single<PornhubAd> map = m9.a.i(this.f17719a.b(UsersConfig.Companion.isGay(this.f17720b.i()) ? this.f17723f : this.f17722e)).doOnError(new a(this, 0)).map(new d(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "adsAndPromosService.getT…esponse(it)\n            }");
        return map;
    }

    @Override // b3.a
    public void b() {
        this.f17724g = new PromoBanner(null, null, 3, null);
    }

    @Override // b3.a
    public Single<PromoBanner> c() {
        String str;
        UsersConfig.Companion companion = UsersConfig.Companion;
        UserMetaData p10 = this.f17720b.p();
        UserAuthLevel userAuthLevel = companion.getUserAuthLevel(p10 == null ? null : p10.getUserType());
        if (!Intrinsics.areEqual(userAuthLevel, this.f17725h)) {
            this.f17724g = null;
        }
        this.f17725h = userAuthLevel;
        PromoBanner promoBanner = this.f17724g;
        if (promoBanner != null) {
            Single<PromoBanner> just = Single.just(promoBanner);
            Intrinsics.checkNotNullExpressionValue(just, "{\n            Single.jus…hedPromoBanner)\n        }");
            return just;
        }
        w2.a aVar = this.f17719a;
        UserOrientation userOrientation = this.f17720b.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "gay";
        }
        Single<PromoBanner> doOnSuccess = m9.a.i(aVar.a(str)).doOnError(new b(this, 0)).map(new e(this, 0)).doOnSuccess(new c(this, 0));
        Intrinsics.checkNotNullExpressionValue(doOnSuccess, "adsAndPromosService.getP…Banner = it\n            }");
        return doOnSuccess;
    }
}
