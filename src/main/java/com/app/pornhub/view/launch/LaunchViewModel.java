package com.app.pornhub.view.launch;

import android.content.SharedPreferences;
import androidx.lifecycle.p;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.launch.LaunchViewModel;
import com.appsflyer.oaid.BuildConfig;
import f3.h;
import f3.l;
import f3.o;
import f3.q;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v3.d;
import x2.g;
import x2.l0;
import x2.y;

/* loaded from: classes.dex */
public final class LaunchViewModel extends d {
    public final m3.a d;

    /* renamed from: e  reason: collision with root package name */
    public final l f5367e;

    /* renamed from: f  reason: collision with root package name */
    public final SharedPreferences f5368f;

    /* renamed from: g  reason: collision with root package name */
    public final h f5369g;

    /* renamed from: h  reason: collision with root package name */
    public final o f5370h;

    /* renamed from: i  reason: collision with root package name */
    public final f3.d f5371i;

    /* renamed from: j  reason: collision with root package name */
    public final q3.a f5372j;

    /* renamed from: k  reason: collision with root package name */
    public final q3.d f5373k;

    /* renamed from: l  reason: collision with root package name */
    public final PublishSubject<UpdateState> f5374l;

    /* renamed from: m  reason: collision with root package name */
    public final PublishSubject<Boolean> f5375m;
    public final p<UpdateState> n;

    /* loaded from: classes.dex */
    public static abstract class UpdateState {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/launch/LaunchViewModel$UpdateState$ErrorCheckUpdate;", "Lcom/app/pornhub/view/launch/LaunchViewModel$UpdateState;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ErrorCheckUpdate extends UpdateState {
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorCheckUpdate(Throwable throwable) {
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
                if ((obj instanceof ErrorCheckUpdate) && Intrinsics.areEqual(this.throwable, ((ErrorCheckUpdate) obj).throwable)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ErrorCheckUpdate(throwable=");
                m10.append(this.throwable);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends UpdateState {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5376a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends UpdateState {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5377a = new b();

            public b() {
                super(null);
            }
        }

        public UpdateState() {
        }

        public UpdateState(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public LaunchViewModel(m3.a checkUpdateAvailableUseCase, l getRefreshTokenUseCase, SharedPreferences persistentPrefs, h getCurrentAuthLevelUseCase, o getUserSettingsUseCase, f3.d changeUserSettingsUseCase, q3.a connectivityHelper, q logOutUseCase, q3.d iWebLinksManager) {
        Intrinsics.checkNotNullParameter(checkUpdateAvailableUseCase, "checkUpdateAvailableUseCase");
        Intrinsics.checkNotNullParameter(getRefreshTokenUseCase, "getRefreshTokenUseCase");
        Intrinsics.checkNotNullParameter(persistentPrefs, "persistentPrefs");
        Intrinsics.checkNotNullParameter(getCurrentAuthLevelUseCase, "getCurrentAuthLevelUseCase");
        Intrinsics.checkNotNullParameter(getUserSettingsUseCase, "getUserSettingsUseCase");
        Intrinsics.checkNotNullParameter(changeUserSettingsUseCase, "changeUserSettingsUseCase");
        Intrinsics.checkNotNullParameter(connectivityHelper, "connectivityHelper");
        Intrinsics.checkNotNullParameter(logOutUseCase, "logOutUseCase");
        Intrinsics.checkNotNullParameter(iWebLinksManager, "iWebLinksManager");
        this.d = checkUpdateAvailableUseCase;
        this.f5367e = getRefreshTokenUseCase;
        this.f5368f = persistentPrefs;
        this.f5369g = getCurrentAuthLevelUseCase;
        this.f5370h = getUserSettingsUseCase;
        this.f5371i = changeUserSettingsUseCase;
        this.f5372j = connectivityHelper;
        this.f5373k = iWebLinksManager;
        PublishSubject<UpdateState> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.f5374l = create;
        PublishSubject<Boolean> create2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create2, "create()");
        this.f5375m = create2;
        this.n = new p<>();
        Disposable subscribe = Observable.combineLatest(create, create2, new BiFunction() { // from class: v4.a
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                LaunchViewModel.UpdateState t12 = (LaunchViewModel.UpdateState) obj;
                Boolean t2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(t12, "t1");
                Intrinsics.checkNotNullParameter(t2, "t2");
                return t12;
            }
        }).subscribe(new x2.a(this, 15));
        Intrinsics.checkNotNullExpressionValue(subscribe, "combineLatest(\n         …Data.value = it\n        }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }

    public final void c() {
        Observable startWith = this.d.f12882a.a().toObservable().map(l0.F).onErrorReturn(y.G).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "updateRepository.checkFo…th(UseCaseResult.Loading)");
        Disposable subscribe = startWith.subscribe(new g(this, 14));
        Intrinsics.checkNotNullExpressionValue(subscribe, "checkUpdateAvailableUseC…}\n            }\n        }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }

    public final UserAuthLevel d() {
        return this.f5369g.a();
    }
}
