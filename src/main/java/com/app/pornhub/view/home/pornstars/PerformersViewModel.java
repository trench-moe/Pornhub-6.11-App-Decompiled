package com.app.pornhub.view.home.pornstars;

import android.graphics.Bitmap;
import androidx.lifecycle.p;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.performer.PerformerOrder;
import com.app.pornhub.domain.model.performer.PerformerSortingConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.appsflyer.oaid.BuildConfig;
import f3.m;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k3.a;
import k3.b;
import k3.e;
import k3.f;
import k3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v3.d;
import x2.a0;
import x2.h;
import x2.k0;

/* loaded from: classes.dex */
public final class PerformersViewModel extends d {
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public final m f5297e;

    /* renamed from: f  reason: collision with root package name */
    public final b f5298f;

    /* renamed from: g  reason: collision with root package name */
    public final a f5299g;

    /* renamed from: h  reason: collision with root package name */
    public final f f5300h;

    /* renamed from: i  reason: collision with root package name */
    public final g f5301i;

    /* renamed from: j  reason: collision with root package name */
    public final k3.d f5302j;

    /* renamed from: k  reason: collision with root package name */
    public UserOrientation f5303k;

    /* renamed from: l  reason: collision with root package name */
    public PerformerSortingConfig f5304l;

    /* renamed from: m  reason: collision with root package name */
    public PerformerOrder f5305m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public Bitmap f5306o;

    /* renamed from: p  reason: collision with root package name */
    public PerformersConfig.PerformerType f5307p;

    /* renamed from: q  reason: collision with root package name */
    public String f5308q;

    /* renamed from: r  reason: collision with root package name */
    public String f5309r;

    /* renamed from: s  reason: collision with root package name */
    public String f5310s;

    /* renamed from: t  reason: collision with root package name */
    public String f5311t;

    /* renamed from: u  reason: collision with root package name */
    public Map<String, String> f5312u;

    /* renamed from: v  reason: collision with root package name */
    public String f5313v;

    /* renamed from: w  reason: collision with root package name */
    public final List<PerformerMetaData> f5314w;

    /* renamed from: x  reason: collision with root package name */
    public final p<z3.a<State>> f5315x;

    /* loaded from: classes.dex */
    public static abstract class State {

        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/view/home/pornstars/PerformersViewModel$State$Initiated;", "Lcom/app/pornhub/view/home/pornstars/PerformersViewModel$State;", "Lcom/app/pornhub/domain/model/performer/PerformerOrder;", "component1", "selectedOrder", "Lcom/app/pornhub/domain/model/performer/PerformerOrder;", DvdsConfig.TYPE_CATEGORY, "()Lcom/app/pornhub/domain/model/performer/PerformerOrder;", BuildConfig.FLAVOR, "selectedFilter", "Ljava/lang/String;", "b", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hasAdditionalFilters", "Z", "a", "()Z", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class Initiated extends State {
            private final boolean hasAdditionalFilters;
            private final String selectedFilter;
            private final PerformerOrder selectedOrder;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Initiated(PerformerOrder selectedOrder, String selectedFilter, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(selectedOrder, "selectedOrder");
                Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
                this.selectedOrder = selectedOrder;
                this.selectedFilter = selectedFilter;
                this.hasAdditionalFilters = z10;
            }

            public final boolean a() {
                return this.hasAdditionalFilters;
            }

            public final String b() {
                return this.selectedFilter;
            }

            public final PerformerOrder c() {
                return this.selectedOrder;
            }

            public final PerformerOrder component1() {
                return this.selectedOrder;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Initiated) {
                    Initiated initiated = (Initiated) obj;
                    return Intrinsics.areEqual(this.selectedOrder, initiated.selectedOrder) && Intrinsics.areEqual(this.selectedFilter, initiated.selectedFilter) && this.hasAdditionalFilters == initiated.hasAdditionalFilters;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int b10 = a1.a.b(this.selectedFilter, this.selectedOrder.hashCode() * 31, 31);
                boolean z10 = this.hasAdditionalFilters;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                return b10 + i10;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("Initiated(selectedOrder=");
                m10.append(this.selectedOrder);
                m10.append(", selectedFilter=");
                m10.append(this.selectedFilter);
                m10.append(", hasAdditionalFilters=");
                return a0.a.l(m10, this.hasAdditionalFilters, ')');
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/pornhub/view/home/pornstars/PerformersViewModel$State$LoadingDone;", "Lcom/app/pornhub/view/home/pornstars/PerformersViewModel$State;", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/performer/PerformerMetaData;", "component1", "items", "Ljava/util/List;", "a", "()Ljava/util/List;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class LoadingDone extends State {
            private final List<PerformerMetaData> items;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadingDone(List<PerformerMetaData> items) {
                super(null);
                Intrinsics.checkNotNullParameter(items, "items");
                this.items = items;
            }

            public final List<PerformerMetaData> a() {
                return this.items;
            }

            public final List<PerformerMetaData> component1() {
                return this.items;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof LoadingDone) && Intrinsics.areEqual(this.items, ((LoadingDone) obj).items)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.items.hashCode();
            }

            public String toString() {
                return android.support.v4.media.a.k(a1.a.m("LoadingDone(items="), this.items, ')');
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/pornstars/PerformersViewModel$State$LoadingError;", "Lcom/app/pornhub/view/home/pornstars/PerformersViewModel$State;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class LoadingError extends State {
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadingError(Throwable throwable) {
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
                return (obj instanceof LoadingError) && Intrinsics.areEqual(this.throwable, ((LoadingError) obj).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("LoadingError(throwable=");
                m10.append(this.throwable);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5316a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5317a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends State {

            /* renamed from: a  reason: collision with root package name */
            public final int f5318a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f5319b;

            public c(int i10, boolean z10) {
                super(null);
                this.f5318a = i10;
                this.f5319b = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return this.f5318a == cVar.f5318a && this.f5319b == cVar.f5319b;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int i10 = this.f5318a * 31;
                boolean z10 = this.f5319b;
                int i11 = z10;
                if (z10 != 0) {
                    i11 = 1;
                }
                return i10 + i11;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("PerformerFiltersChanged(count=");
                m10.append(this.f5318a);
                m10.append(", clearData=");
                return a0.a.l(m10, this.f5319b, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final d f5320a = new d();

            public d() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final e f5321a = new e();

            public e() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final f f5322a = new f();

            public f() {
                super(null);
            }
        }

        public State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PerformersViewModel(e getPerformersUseCase, m getUserOrientationObservableUseCase, b getPerformerFiltersObservableUseCase, a getAllAdditionalPerformersFiltersUseCase, f getSelectedAdditionalPerformerFiltersUseCase, g savePerformerFiltersUseCase, k3.d getPerformersConfigUseCase) {
        Intrinsics.checkNotNullParameter(getPerformersUseCase, "getPerformersUseCase");
        Intrinsics.checkNotNullParameter(getUserOrientationObservableUseCase, "getUserOrientationObservableUseCase");
        Intrinsics.checkNotNullParameter(getPerformerFiltersObservableUseCase, "getPerformerFiltersObservableUseCase");
        Intrinsics.checkNotNullParameter(getAllAdditionalPerformersFiltersUseCase, "getAllAdditionalPerformersFiltersUseCase");
        Intrinsics.checkNotNullParameter(getSelectedAdditionalPerformerFiltersUseCase, "getSelectedAdditionalPerformerFiltersUseCase");
        Intrinsics.checkNotNullParameter(savePerformerFiltersUseCase, "savePerformerFiltersUseCase");
        Intrinsics.checkNotNullParameter(getPerformersConfigUseCase, "getPerformersConfigUseCase");
        this.d = getPerformersUseCase;
        this.f5297e = getUserOrientationObservableUseCase;
        this.f5298f = getPerformerFiltersObservableUseCase;
        this.f5299g = getAllAdditionalPerformersFiltersUseCase;
        this.f5300h = getSelectedAdditionalPerformerFiltersUseCase;
        this.f5301i = savePerformerFiltersUseCase;
        this.f5302j = getPerformersConfigUseCase;
        this.f5307p = PerformersConfig.PerformerType.All.INSTANCE;
        this.f5313v = BuildConfig.FLAVOR;
        this.f5314w = new ArrayList();
        this.f5315x = new p<>();
        Disposable subscribe = getUserOrientationObservableUseCase.a(true).subscribe(new x2.g(this, 13));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getUserOrientationObserv…tchConfig()\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
        Observable<Map<String, String>> e10 = getPerformerFiltersObservableUseCase.f11779a.e();
        getPerformerFiltersObservableUseCase.f11779a.f();
        Disposable subscribe2 = e10.subscribe(new x2.b(this, 11));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "getPerformerFiltersObser…          )\n            }");
        DisposableKt.addTo(subscribe2, this.f16001c);
    }

    public final void c(PerformersConfig.PerformerType performerType) {
        this.f5307p = performerType;
        this.f5315x.l(new z3.a<>(State.a.f5316a));
    }

    public final void d(int i10) {
        z3.a<State> d = this.f5315x.d();
        if (Intrinsics.areEqual(d == null ? null : d.f21761a, State.b.f5317a)) {
            return;
        }
        String order = this.f5308q;
        if (order == null) {
            this.f5315x.l(new z3.a<>(new State.LoadingError(new IllegalStateException("Order can not be null"))));
            return;
        }
        e eVar = this.d;
        String str = this.f5309r;
        PerformersConfig.PerformerType performerType = this.f5307p;
        String str2 = this.f5313v;
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(performerType, "performerType");
        Observable startWith = eVar.f11782a.b(order, str, 16, i10, performerType, str2).toObservable().map(a0.K).onErrorReturn(k0.D).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "performersRepository.get…th(UseCaseResult.Loading)");
        Disposable subscribe = startWith.subscribe(new h(this, 9));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getPerformersUseCase.exe…}\n            }\n        }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }

    public final Map<String, String> e() {
        return this.f5300h.f11783a.f();
    }

    public final PerformerOrder f() {
        PerformerOrder performerOrder = this.f5305m;
        if (performerOrder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedOrder");
            performerOrder = null;
        }
        return performerOrder;
    }

    public final boolean g() {
        PerformerSortingConfig performerSortingConfig = this.f5304l;
        if (performerSortingConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("performerSortingConfig");
            performerSortingConfig = null;
        }
        return !performerSortingConfig.getAdditionalFilters().isEmpty();
    }

    public final void h() {
        if (this.f5313v.length() == 0) {
            this.f5314w.clear();
        }
        d(0);
    }
}
