package com.app.pornhub.view.home.explore;

import androidx.lifecycle.p;
import c3.a;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.explore.ExploreData;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.home.explore.ExploreFragmentViewModel;
import com.appsflyer.oaid.BuildConfig;
import f3.h;
import f3.m;
import f3.s;
import g3.b;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Collection;
import java.util.List;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v3.d;
import x2.a0;
import x2.z;

/* loaded from: classes.dex */
public final class ExploreFragmentViewModel extends d {
    public final m d;

    /* renamed from: e */
    public final s f5167e;

    /* renamed from: f */
    public final h f5168f;

    /* renamed from: g */
    public final b f5169g;

    /* renamed from: h */
    public final a f5170h;

    /* renamed from: i */
    public final p<List<ExploreData>> f5171i;

    /* renamed from: j */
    public final p<z3.a<State>> f5172j;

    /* renamed from: k */
    public final p<z3.a<PromoBanner>> f5173k;

    /* renamed from: l */
    public UserOrientation f5174l;

    /* renamed from: m */
    public UserAuthLevel f5175m;

    /* loaded from: classes.dex */
    public static abstract class State {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/explore/ExploreFragmentViewModel$State$ErrorLoading;", "Lcom/app/pornhub/view/home/explore/ExploreFragmentViewModel$State;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
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

            /* renamed from: a */
            public static final a f5176a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends State {

            /* renamed from: a */
            public final boolean f5177a;

            /* renamed from: b */
            public final boolean f5178b;

            public b(boolean z10, boolean z11) {
                super(null);
                this.f5177a = z10;
                this.f5178b = z11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return this.f5177a == bVar.f5177a && this.f5178b == bVar.f5178b;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            public int hashCode() {
                boolean z10 = this.f5177a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                int i10 = r02 * 31;
                boolean z11 = this.f5178b;
                return i10 + (z11 ? 1 : z11 ? 1 : 0);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("Loading(showLoading=");
                m10.append(this.f5177a);
                m10.append(", hideExistingData=");
                return a0.a.l(m10, this.f5178b, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends State {

            /* renamed from: a */
            public static final c f5179a = new c();

            public c() {
                super(null);
            }
        }

        public State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ExploreFragmentViewModel(m getUserOrientationObservableUseCase, s observeAuthLevelChangesUseCase, h getCurrentAuthLevelUseCase, b getExploreUseCase, a getPromoBannerUseCase) {
        Intrinsics.checkNotNullParameter(getUserOrientationObservableUseCase, "getUserOrientationObservableUseCase");
        Intrinsics.checkNotNullParameter(observeAuthLevelChangesUseCase, "observeAuthLevelChangesUseCase");
        Intrinsics.checkNotNullParameter(getCurrentAuthLevelUseCase, "getCurrentAuthLevelUseCase");
        Intrinsics.checkNotNullParameter(getExploreUseCase, "getExploreUseCase");
        Intrinsics.checkNotNullParameter(getPromoBannerUseCase, "getPromoBannerUseCase");
        this.d = getUserOrientationObservableUseCase;
        this.f5167e = observeAuthLevelChangesUseCase;
        this.f5168f = getCurrentAuthLevelUseCase;
        this.f5169g = getExploreUseCase;
        this.f5170h = getPromoBannerUseCase;
        this.f5171i = new p<>();
        this.f5172j = new p<>();
        this.f5173k = new p<>();
        Disposable subscribe = getUserOrientationObservableUseCase.a(true).subscribe(new x2.m(this, 12));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getUserOrientationObserv…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
        Disposable subscribe2 = observeAuthLevelChangesUseCase.a(true).subscribe(new x2.a(this, 13));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "observeAuthLevelChangesU…hLevel = it\n            }");
        DisposableKt.addTo(subscribe2, this.f16001c);
        c(false);
    }

    public static /* synthetic */ void d(ExploreFragmentViewModel exploreFragmentViewModel, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        exploreFragmentViewModel.c(z10);
    }

    public final void c(final boolean z10) {
        z3.a<State> d = this.f5172j.d();
        State state = d == null ? null : d.f21761a;
        if ((state instanceof State.b) && ((State.b) state).f5177a) {
            return;
        }
        Observable startWith = this.f5169g.f9723a.a().toObservable().map(z.C).onErrorReturn(a0.C).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "exploreRepository.getExp…th(UseCaseResult.Loading)");
        Disposable subscribe = startWith.subscribe(new Consumer() { // from class: n4.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ExploreFragmentViewModel this$0 = ExploreFragmentViewModel.this;
                boolean z11 = z10;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f5172j.l(new z3.a<>(new ExploreFragmentViewModel.State.b(useCaseResult instanceof UseCaseResult.a, z11)));
                if (useCaseResult instanceof UseCaseResult.Result) {
                    a.C0174a c0174a = kf.a.f12078a;
                    StringBuilder m10 = a1.a.m("Got ");
                    UseCaseResult.Result result = (UseCaseResult.Result) useCaseResult;
                    m10.append(((List) result.a()).size());
                    m10.append(" explore data items");
                    c0174a.a(m10.toString(), new Object[0]);
                    this$0.f5171i.l(result.a());
                    if (!((Collection) result.a()).isEmpty()) {
                        Disposable subscribe2 = this$0.f5170h.a().subscribe(new x2.b(this$0, 9));
                        Intrinsics.checkNotNullExpressionValue(subscribe2, "getPromoBannerUseCase.ex…          }\n            }");
                        DisposableKt.addTo(subscribe2, this$0.f16001c);
                    }
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    UseCaseResult.Failure failure = (UseCaseResult.Failure) useCaseResult;
                    kf.a.f12078a.d(failure.a(), "Loading Explore data failed", new Object[0]);
                    this$0.f5172j.l(new z3.a<>(new ExploreFragmentViewModel.State.ErrorLoading(failure.a())));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "getExploreUseCase.execut…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }
}
