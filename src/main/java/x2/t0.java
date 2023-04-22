package x2;

import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.model.performer.PerformerAdditionalFilter;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.performer.PerformerSortingConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.subjects.PublishSubject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class t0 implements b3.i {

    /* renamed from: a  reason: collision with root package name */
    public final w2.i f17859a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.a f17860b;

    /* renamed from: c  reason: collision with root package name */
    public final y2.a f17861c;
    public final b3.e d;

    /* renamed from: e  reason: collision with root package name */
    public PerformerSortingConfig f17862e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f17863f;

    /* renamed from: g  reason: collision with root package name */
    public final PublishSubject<Map<String, String>> f17864g;

    /* renamed from: h  reason: collision with root package name */
    public UserOrientation f17865h;

    public t0(w2.i performersService, s2.a modelMapper, y2.a exceptionMapper, b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(performersService, "performersService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f17859a = performersService;
        this.f17860b = modelMapper;
        this.f17861c = exceptionMapper;
        this.d = currentUserRepository;
        this.f17863f = new LinkedHashMap();
        PublishSubject<Map<String, String>> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create<Map<String, String>>()");
        this.f17864g = create;
    }

    @Override // b3.i
    public List<PerformerAdditionalFilter> a() {
        PerformerSortingConfig performerSortingConfig = this.f17862e;
        List<PerformerAdditionalFilter> additionalFilters = performerSortingConfig == null ? null : performerSortingConfig.getAdditionalFilters();
        return additionalFilters == null ? CollectionsKt.emptyList() : additionalFilters;
    }

    @Override // b3.i
    public Single<List<PerformerMetaData>> b(String order, String str, int i10, int i11, PerformersConfig.PerformerType performerType, String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(performerType, "performerType");
        w2.i iVar = this.f17859a;
        UserOrientation userOrientation = this.d.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str3 = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str3 = "gay";
        }
        Single<List<PerformerMetaData>> map = m9.a.i(iVar.c(order, str, i10, i11, str3, PerformersConfig.Companion.serializePerformerType(performerType), str2 == null || str2.length() == 0 ? null : new Regex(" ").replace(str2, "+"), this.f17863f)).doOnError(new a(this, 3)).map(new d(this, 3));
        Intrinsics.checkNotNullExpressionValue(map, "performersService.getPor…esponse(it)\n            }");
        return map;
    }

    @Override // b3.i
    public void c() {
        this.f17863f.clear();
    }

    @Override // b3.i
    public Single<PerformerContainer> d(String slug, String order, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(order, "order");
        Single<PerformerContainer> map = m9.a.i(this.f17859a.a(i10, i11, order, slug, z10 ? 1 : null)).doOnError(new c(this, 4)).map(new j(this, 3));
        Intrinsics.checkNotNullExpressionValue(map, "performersService.getPor…esponse(it)\n            }");
        return map;
    }

    @Override // b3.i
    public Observable<Map<String, String>> e() {
        return this.f17864g;
    }

    @Override // b3.i
    public Map<String, String> f() {
        return MapsKt.toMutableMap(this.f17863f);
    }

    @Override // b3.i
    public void g(Map<String, String> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f17863f.clear();
        this.f17863f.putAll(filters);
        this.f17864g.onNext(filters);
    }

    @Override // b3.i
    public Single<PerformerSortingConfig> h(UserOrientation userOrientation) {
        String str;
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (!Intrinsics.areEqual(userOrientation, this.f17865h)) {
            this.f17863f.clear();
            this.f17862e = null;
            this.f17865h = userOrientation;
        }
        PerformerSortingConfig performerSortingConfig = this.f17862e;
        if (performerSortingConfig != null) {
            Single<PerformerSortingConfig> just = Single.just(performerSortingConfig);
            Intrinsics.checkNotNullExpressionValue(just, "just(cachedPerformerSortingConfig)");
            return just;
        }
        w2.i iVar = this.f17859a;
        UserOrientation userOrientation2 = this.d.i();
        Intrinsics.checkNotNullParameter(userOrientation2, "userOrientation");
        if (Intrinsics.areEqual(userOrientation2, UserOrientation.Straight.INSTANCE)) {
            str = "straight";
        } else if (!Intrinsics.areEqual(userOrientation2, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "gay";
        }
        Single<PerformerSortingConfig> map = m9.a.i(iVar.b(str)).onErrorResumeNext(new i(this, 4)).map(new s0(this, 1));
        Intrinsics.checkNotNullExpressionValue(map, "performersService.getPer…rtingConfig\n            }");
        return map;
    }

    @Override // b3.i
    public Single<PerformerContainer> i(String slug, String order, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(slug, "slug");
        Intrinsics.checkNotNullParameter(order, "order");
        Single<PerformerContainer> map = m9.a.i(this.f17859a.d(i10, i11, order, slug, z10 ? 1 : null)).doOnError(new b(this, 3)).map(new s0(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "performersService.getAma…esponse(it)\n            }");
        return map;
    }
}
