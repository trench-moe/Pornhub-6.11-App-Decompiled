package com.app.pornhub.view.home;

import androidx.lifecycle.p;
import c3.b;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.Optional;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.search.SearchSuggestions;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.appsflyer.oaid.BuildConfig;
import f3.j;
import f3.m;
import f3.n;
import f3.s;
import i3.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import k3.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l3.a;
import o3.i;
import v3.d;
import x2.c;
import x2.h;

/* loaded from: classes.dex */
public final class HomeActivityViewModel extends d {
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final i f5007e;

    /* renamed from: f  reason: collision with root package name */
    public final g f5008f;

    /* renamed from: g  reason: collision with root package name */
    public final f f5009g;

    /* renamed from: h  reason: collision with root package name */
    public final a f5010h;

    /* renamed from: i  reason: collision with root package name */
    public final t3.b f5011i;

    /* renamed from: j  reason: collision with root package name */
    public final p<ActivityStateEvent> f5012j;

    /* renamed from: k  reason: collision with root package name */
    public final p<z3.a<FragmentStateEvent>> f5013k;

    /* renamed from: l  reason: collision with root package name */
    public final p<GlobalStateEvent> f5014l;

    /* renamed from: m  reason: collision with root package name */
    public UserAuthLevel f5015m;
    public UserOrientation n;

    /* renamed from: o  reason: collision with root package name */
    public UserMetaData f5016o;

    /* renamed from: p  reason: collision with root package name */
    public final PublishSubject<Pair<String, SearchSuggestionsConfig.SearchSource>> f5017p;

    /* renamed from: q  reason: collision with root package name */
    public Disposable f5018q;

    /* renamed from: r  reason: collision with root package name */
    public int f5019r;

    /* loaded from: classes.dex */
    public static abstract class ActivityStateEvent {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/HomeActivityViewModel$ActivityStateEvent$ShowPromoBanner;", "Lcom/app/pornhub/view/home/HomeActivityViewModel$ActivityStateEvent;", "Lcom/app/pornhub/domain/model/ads_promo/PromoBanner;", "component1", "promoBanner", "Lcom/app/pornhub/domain/model/ads_promo/PromoBanner;", "a", "()Lcom/app/pornhub/domain/model/ads_promo/PromoBanner;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ShowPromoBanner extends ActivityStateEvent {
            private final PromoBanner promoBanner;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowPromoBanner(PromoBanner promoBanner) {
                super(null);
                Intrinsics.checkNotNullParameter(promoBanner, "promoBanner");
                this.promoBanner = promoBanner;
            }

            public final PromoBanner a() {
                return this.promoBanner;
            }

            public final PromoBanner component1() {
                return this.promoBanner;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowPromoBanner) && Intrinsics.areEqual(this.promoBanner, ((ShowPromoBanner) obj).promoBanner);
            }

            public int hashCode() {
                return this.promoBanner.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ShowPromoBanner(promoBanner=");
                m10.append(this.promoBanner);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends ActivityStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public final int f5020a;

            public a(int i10) {
                super(null);
                this.f5020a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && this.f5020a == ((a) obj).f5020a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f5020a;
            }

            public String toString() {
                return android.support.v4.media.a.i(a1.a.m("AdditionalFiltersCountUpdate(count="), this.f5020a, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends ActivityStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5021a;

            public b(boolean z10) {
                super(null);
                this.f5021a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f5021a == ((b) obj).f5021a) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v2 */
            /* JADX WARN: Type inference failed for: r0v3 */
            public int hashCode() {
                boolean z10 = this.f5021a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                return r02;
            }

            public String toString() {
                return a0.a.l(a1.a.m("ChangeAdditionalFiltersVisibility(isVisible="), this.f5021a, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends ActivityStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5022a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f5023b;

            public c(boolean z10, boolean z11) {
                super(null);
                this.f5022a = z10;
                this.f5023b = z11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return this.f5022a == cVar.f5022a && this.f5023b == cVar.f5023b;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            public int hashCode() {
                boolean z10 = this.f5022a;
                int i10 = 1;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                int i11 = r02 * 31;
                boolean z11 = this.f5023b;
                if (!z11) {
                    i10 = z11 ? 1 : 0;
                }
                return i11 + i10;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("LogoImageUpdate(isPremium=");
                m10.append(this.f5022a);
                m10.append(", isGay=");
                return a0.a.l(m10, this.f5023b, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends ActivityStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5024a;

            public d(boolean z10) {
                super(null);
                this.f5024a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f5024a == ((d) obj).f5024a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v2 */
            /* JADX WARN: Type inference failed for: r0v3 */
            public int hashCode() {
                boolean z10 = this.f5024a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                return r02;
            }

            public String toString() {
                return a0.a.l(a1.a.m("SetAppBarScrollable(isScrollable="), this.f5024a, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends ActivityStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5025a;

            public e(boolean z10) {
                super(null);
                this.f5025a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f5025a == ((e) obj).f5025a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v2 */
            /* JADX WARN: Type inference failed for: r0v3 */
            public int hashCode() {
                boolean z10 = this.f5025a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                return r02;
            }

            public String toString() {
                return a0.a.l(a1.a.m("SetAppBarVisibility(isVisible="), this.f5025a, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends ActivityStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5026a;

            public f(boolean z10) {
                super(null);
                this.f5026a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f5026a == ((f) obj).f5026a;
            }

            public int hashCode() {
                boolean z10 = this.f5026a;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public String toString() {
                return a0.a.l(a1.a.m("SetCastButtonVisibility(isVisible="), this.f5026a, ')');
            }
        }

        public ActivityStateEvent() {
        }

        public ActivityStateEvent(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class FragmentStateEvent {

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/app/pornhub/view/home/HomeActivityViewModel$FragmentStateEvent$SearchQuerySubmitted;", "Lcom/app/pornhub/view/home/HomeActivityViewModel$FragmentStateEvent;", BuildConfig.FLAVOR, "component1", "query", "Ljava/lang/String;", "a", "()Ljava/lang/String;", BuildConfig.FLAVOR, "isSearchQuerySelected", "Z", "b", "()Z", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class SearchQuerySubmitted extends FragmentStateEvent {
            private final boolean isSearchQuerySelected;
            private final String query;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SearchQuerySubmitted(String query, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(query, "query");
                this.query = query;
                this.isSearchQuerySelected = z10;
            }

            public final String a() {
                return this.query;
            }

            public final boolean b() {
                return this.isSearchQuerySelected;
            }

            public final String component1() {
                return this.query;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SearchQuerySubmitted) {
                    SearchQuerySubmitted searchQuerySubmitted = (SearchQuerySubmitted) obj;
                    if (Intrinsics.areEqual(this.query, searchQuerySubmitted.query) && this.isSearchQuerySelected == searchQuerySubmitted.isSearchQuerySelected) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.query.hashCode() * 31;
                boolean z10 = this.isSearchQuerySelected;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                return hashCode + i10;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("SearchQuerySubmitted(query=");
                m10.append(this.query);
                m10.append(", isSearchQuerySelected=");
                return a0.a.l(m10, this.isSearchQuerySelected, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends FragmentStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public final int f5027a;

            /* renamed from: b  reason: collision with root package name */
            public final int f5028b;

            public a(int i10, int i11) {
                super(null);
                this.f5027a = i10;
                this.f5028b = i11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return this.f5027a == aVar.f5027a && this.f5028b == aVar.f5028b;
                }
                return false;
            }

            public int hashCode() {
                return (this.f5027a * 31) + this.f5028b;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("AppBarHeightChanged(totalHeight=");
                m10.append(this.f5027a);
                m10.append(", visibleHeight=");
                return android.support.v4.media.a.i(m10, this.f5028b, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends FragmentStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5029a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends FragmentStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public static final c f5030a = new c();

            public c() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends FragmentStateEvent {

            /* renamed from: a  reason: collision with root package name */
            public static final d f5031a = new d();

            public d() {
                super(null);
            }
        }

        public FragmentStateEvent() {
        }

        public FragmentStateEvent(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class GlobalStateEvent {

        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/app/pornhub/view/home/HomeActivityViewModel$GlobalStateEvent$SearchSuggestion;", "Lcom/app/pornhub/view/home/HomeActivityViewModel$GlobalStateEvent;", BuildConfig.FLAVOR, "component1", "query", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/app/pornhub/domain/model/Optional;", "Lcom/app/pornhub/domain/model/search/SearchSuggestions;", "suggestionOptional", "Lcom/app/pornhub/domain/model/Optional;", "b", "()Lcom/app/pornhub/domain/model/Optional;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class SearchSuggestion extends GlobalStateEvent {
            private final String query;
            private final Optional<SearchSuggestions> suggestionOptional;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SearchSuggestion(String query, Optional<SearchSuggestions> suggestionOptional) {
                super(null);
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(suggestionOptional, "suggestionOptional");
                this.query = query;
                this.suggestionOptional = suggestionOptional;
            }

            public final String a() {
                return this.query;
            }

            public final Optional<SearchSuggestions> b() {
                return this.suggestionOptional;
            }

            public final String component1() {
                return this.query;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SearchSuggestion) {
                    SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
                    return Intrinsics.areEqual(this.query, searchSuggestion.query) && Intrinsics.areEqual(this.suggestionOptional, searchSuggestion.suggestionOptional);
                }
                return false;
            }

            public int hashCode() {
                return this.suggestionOptional.hashCode() + (this.query.hashCode() * 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("SearchSuggestion(query=");
                m10.append(this.query);
                m10.append(", suggestionOptional=");
                m10.append(this.suggestionOptional);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/app/pornhub/view/home/HomeActivityViewModel$GlobalStateEvent$UserAuthLevelUpdate;", "Lcom/app/pornhub/view/home/HomeActivityViewModel$GlobalStateEvent;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "component1", "userAuthLevel", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "b", "()Lcom/app/pornhub/domain/model/user/UserAuthLevel;", BuildConfig.FLAVOR, "initialUpdate", "Z", "a", "()Z", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class UserAuthLevelUpdate extends GlobalStateEvent {
            private final boolean initialUpdate;
            private final UserAuthLevel userAuthLevel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserAuthLevelUpdate(UserAuthLevel userAuthLevel, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(userAuthLevel, "userAuthLevel");
                this.userAuthLevel = userAuthLevel;
                this.initialUpdate = z10;
            }

            public final boolean a() {
                return this.initialUpdate;
            }

            public final UserAuthLevel b() {
                return this.userAuthLevel;
            }

            public final UserAuthLevel component1() {
                return this.userAuthLevel;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof UserAuthLevelUpdate) {
                    UserAuthLevelUpdate userAuthLevelUpdate = (UserAuthLevelUpdate) obj;
                    return Intrinsics.areEqual(this.userAuthLevel, userAuthLevelUpdate.userAuthLevel) && this.initialUpdate == userAuthLevelUpdate.initialUpdate;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.userAuthLevel.hashCode() * 31;
                boolean z10 = this.initialUpdate;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                return hashCode + i10;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("UserAuthLevelUpdate(userAuthLevel=");
                m10.append(this.userAuthLevel);
                m10.append(", initialUpdate=");
                return a0.a.l(m10, this.initialUpdate, ')');
            }
        }

        public GlobalStateEvent() {
        }

        public GlobalStateEvent(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public HomeActivityViewModel(j getOwnUserMetaDataObservableUseCase, m getUserOrientationObservableUseCase, s getAuthLevelChangesUseCase, b setPromoBannerDismissedUseCase, n getUserSettingsObservableUseCase, o3.f getVideoFiltersObservableUseCase, i saveVideoFiltersUseCase, g savePerformerFiltersUseCase, f resetCommunityAlbumFiltersUseCase, a getSearchSuggestionsUseCase, t3.b analyticsHelper) {
        Intrinsics.checkNotNullParameter(getOwnUserMetaDataObservableUseCase, "getOwnUserMetaDataObservableUseCase");
        Intrinsics.checkNotNullParameter(getUserOrientationObservableUseCase, "getUserOrientationObservableUseCase");
        Intrinsics.checkNotNullParameter(getAuthLevelChangesUseCase, "getAuthLevelChangesUseCase");
        Intrinsics.checkNotNullParameter(setPromoBannerDismissedUseCase, "setPromoBannerDismissedUseCase");
        Intrinsics.checkNotNullParameter(getUserSettingsObservableUseCase, "getUserSettingsObservableUseCase");
        Intrinsics.checkNotNullParameter(getVideoFiltersObservableUseCase, "getVideoFiltersObservableUseCase");
        Intrinsics.checkNotNullParameter(saveVideoFiltersUseCase, "saveVideoFiltersUseCase");
        Intrinsics.checkNotNullParameter(savePerformerFiltersUseCase, "savePerformerFiltersUseCase");
        Intrinsics.checkNotNullParameter(resetCommunityAlbumFiltersUseCase, "resetCommunityAlbumFiltersUseCase");
        Intrinsics.checkNotNullParameter(getSearchSuggestionsUseCase, "getSearchSuggestionsUseCase");
        Intrinsics.checkNotNullParameter(analyticsHelper, "analyticsHelper");
        this.d = setPromoBannerDismissedUseCase;
        this.f5007e = saveVideoFiltersUseCase;
        this.f5008f = savePerformerFiltersUseCase;
        this.f5009g = resetCommunityAlbumFiltersUseCase;
        this.f5010h = getSearchSuggestionsUseCase;
        this.f5011i = analyticsHelper;
        this.f5012j = new p<>();
        this.f5013k = new p<>();
        this.f5014l = new p<>();
        PublishSubject<Pair<String, SearchSuggestionsConfig.SearchSource>> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create<Pair<String, Sear…nsConfig.SearchSource>>()");
        this.f5017p = create;
        Observable merge = Observable.merge(getAuthLevelChangesUseCase.a(true).map(new x2.d(this, 4)), getUserOrientationObservableUseCase.a(true).map(new x2.i(this, 8)));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Disposable subscribe = merge.throttleLast(250L, timeUnit).observeOn(AndroidSchedulers.mainThread()).subscribe(new h(this, 7));
        Intrinsics.checkNotNullExpressionValue(subscribe, "merge(\n            authO…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
        Observable merge2 = Observable.merge(Observable.just(new Optional(getOwnUserMetaDataObservableUseCase.f9379a.p())), getOwnUserMetaDataObservableUseCase.f9379a.s());
        Intrinsics.checkNotNullExpressionValue(merge2, "merge(\n                O… observable\n            )");
        Disposable subscribe2 = merge2.subscribe(new c(this, 10));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "getOwnUserMetaDataObserv…Data = it.value\n        }");
        DisposableKt.addTo(subscribe2, this.f16001c);
        Disposable subscribe3 = getVideoFiltersObservableUseCase.a(true).subscribe(new x2.m(this, 10));
        Intrinsics.checkNotNullExpressionValue(subscribe3, "getVideoFiltersObservabl…roperty(it)\n            }");
        DisposableKt.addTo(subscribe3, this.f16001c);
        Disposable subscribe4 = getUserSettingsObservableUseCase.a(true).subscribe(new x2.a(this, 8));
        Intrinsics.checkNotNullExpressionValue(subscribe4, "getUserSettingsObservabl…roperty(it)\n            }");
        DisposableKt.addTo(subscribe4, this.f16001c);
        Disposable subscribe5 = create.debounce(300L, timeUnit).observeOn(AndroidSchedulers.mainThread()).subscribe(new x2.g(this, 8));
        Intrinsics.checkNotNullExpressionValue(subscribe5, "searchSubject.debounce(\n…ns(it.first, it.second) }");
        DisposableKt.addTo(subscribe5, this.f16001c);
    }

    public final void c(String categoryName) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        this.f5007e.a(new VideoFilters(null, null, null, null, categoryName, 15, null));
    }

    public final void d(boolean z10) {
        this.f5012j.l(new ActivityStateEvent.b(z10));
    }

    public final void e(int i10) {
        this.f5012j.l(new ActivityStateEvent.a(i10));
    }

    public final void f(boolean z10) {
        this.f5012j.l(new ActivityStateEvent.d(z10));
    }
}
