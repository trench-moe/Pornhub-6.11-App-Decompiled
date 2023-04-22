package com.app.pornhub.view.home.discover;

import androidx.lifecycle.p;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.explore.ExploreData;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.appsflyer.oaid.BuildConfig;
import f3.h;
import f3.m;
import f3.s;
import g3.a;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v3.d;
import x2.c;
import x2.l0;
import x2.y;

/* loaded from: classes.dex */
public final class DiscoverViewModel extends d {
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final s f5143e;

    /* renamed from: f  reason: collision with root package name */
    public final h f5144f;

    /* renamed from: g  reason: collision with root package name */
    public final a f5145g;

    /* renamed from: h  reason: collision with root package name */
    public final c3.a f5146h;

    /* renamed from: i  reason: collision with root package name */
    public final p<List<ExploreData>> f5147i;

    /* renamed from: j  reason: collision with root package name */
    public final p<z3.a<State>> f5148j;

    /* renamed from: k  reason: collision with root package name */
    public final p<z3.a<PromoBanner>> f5149k;

    /* renamed from: l  reason: collision with root package name */
    public UserOrientation f5150l;

    /* renamed from: m  reason: collision with root package name */
    public UserAuthLevel f5151m;

    /* loaded from: classes.dex */
    public static abstract class State {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/discover/DiscoverViewModel$State$ErrorLoading;", "Lcom/app/pornhub/view/home/discover/DiscoverViewModel$State;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ErrorLoading extends State {
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorLoading(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable a() {
                return this.throwable;
            }

            public final Throwable component1() {
                return this.throwable;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof ErrorLoading) && Intrinsics.areEqual(this.throwable, ((ErrorLoading) obj).throwable)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ErrorLoading(throwable=");
                m10.append(this.throwable);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5152a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends State {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5153a;

            public b(boolean z10) {
                super(null);
                this.f5153a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f5153a == ((b) obj).f5153a;
            }

            public int hashCode() {
                boolean z10 = this.f5153a;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public String toString() {
                return a0.a.l(a1.a.m("Loading(showLoading="), this.f5153a, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final c f5154a = new c();

            public c() {
                super(null);
            }
        }

        public State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DiscoverViewModel(m getUserOrientationObservableUseCase, s observeAuthLevelChangesUseCase, h getCurrentAuthLevelUseCase, a getDiscoverUseCase, c3.a getPromoBannerUseCase) {
        Intrinsics.checkNotNullParameter(getUserOrientationObservableUseCase, "getUserOrientationObservableUseCase");
        Intrinsics.checkNotNullParameter(observeAuthLevelChangesUseCase, "observeAuthLevelChangesUseCase");
        Intrinsics.checkNotNullParameter(getCurrentAuthLevelUseCase, "getCurrentAuthLevelUseCase");
        Intrinsics.checkNotNullParameter(getDiscoverUseCase, "getDiscoverUseCase");
        Intrinsics.checkNotNullParameter(getPromoBannerUseCase, "getPromoBannerUseCase");
        this.d = getUserOrientationObservableUseCase;
        this.f5143e = observeAuthLevelChangesUseCase;
        this.f5144f = getCurrentAuthLevelUseCase;
        this.f5145g = getDiscoverUseCase;
        this.f5146h = getPromoBannerUseCase;
        this.f5147i = new p<>();
        this.f5148j = new p<>();
        this.f5149k = new p<>();
        Disposable subscribe = getUserOrientationObservableUseCase.a(true).subscribe(new x2.m(this, 11));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getUserOrientationObserv…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
        Disposable subscribe2 = observeAuthLevelChangesUseCase.a(true).subscribe(new x2.a(this, 12));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "observeAuthLevelChangesU…hLevel = it\n            }");
        DisposableKt.addTo(subscribe2, this.f16001c);
        c();
    }

    public final void c() {
        z3.a<State> d = this.f5148j.d();
        if ((d == null ? null : d.f21761a) instanceof State.b) {
            return;
        }
        Observable startWith = this.f5145g.f9722a.b().toObservable().map(l0.A).onErrorReturn(y.f17896z).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "exploreRepository.getDis…th(UseCaseResult.Loading)");
        Disposable subscribe = startWith.subscribe(new c(this, 14));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getDiscoverUseCase.execu…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }
}
