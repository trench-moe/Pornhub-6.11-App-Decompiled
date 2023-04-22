package com.app.pornhub.view.home.albums;

import androidx.lifecycle.p;
import com.app.pornhub.domain.config.FiltersConfig;
import com.app.pornhub.domain.config.PhotosConfig;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.domain.model.photo.AlbumFilters;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.appsflyer.oaid.BuildConfig;
import f3.k;
import f3.m;
import i3.b;
import i3.c;
import i3.e;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v3.d;
import x2.a0;
import x2.g;
import x2.k0;
import x2.z;
import z3.a;

/* loaded from: classes.dex */
public final class AlbumsViewModel extends d {
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final c f5067e;

    /* renamed from: f  reason: collision with root package name */
    public final e f5068f;

    /* renamed from: g  reason: collision with root package name */
    public final b f5069g;

    /* renamed from: h  reason: collision with root package name */
    public final k f5070h;

    /* renamed from: i  reason: collision with root package name */
    public UserOrientation f5071i;

    /* renamed from: j  reason: collision with root package name */
    public AlbumFilters f5072j;

    /* renamed from: k  reason: collision with root package name */
    public Type f5073k;

    /* renamed from: l  reason: collision with root package name */
    public String f5074l;

    /* renamed from: m  reason: collision with root package name */
    public PhotosConfig.PhotoOrder f5075m;
    public FiltersConfig.Time n;

    /* renamed from: o  reason: collision with root package name */
    public PhotosConfig.PhotoOrder f5076o;

    /* renamed from: p  reason: collision with root package name */
    public FiltersConfig.Time f5077p;

    /* renamed from: q  reason: collision with root package name */
    public String f5078q;

    /* renamed from: r  reason: collision with root package name */
    public final List<Album> f5079r;

    /* renamed from: s  reason: collision with root package name */
    public final p<a<State>> f5080s;

    /* loaded from: classes.dex */
    public static abstract class State {

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/pornhub/view/home/albums/AlbumsViewModel$State$LoadingDone;", "Lcom/app/pornhub/view/home/albums/AlbumsViewModel$State;", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/photo/Album;", "component1", "items", "Ljava/util/List;", "a", "()Ljava/util/List;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class LoadingDone extends State {
            private final List<Album> items;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadingDone(List<Album> items) {
                super(null);
                Intrinsics.checkNotNullParameter(items, "items");
                this.items = items;
            }

            public final List<Album> a() {
                return this.items;
            }

            public final List<Album> component1() {
                return this.items;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingDone) && Intrinsics.areEqual(this.items, ((LoadingDone) obj).items);
            }

            public int hashCode() {
                return this.items.hashCode();
            }

            public String toString() {
                return android.support.v4.media.a.k(a1.a.m("LoadingDone(items="), this.items, ')');
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/albums/AlbumsViewModel$State$LoadingError;", "Lcom/app/pornhub/view/home/albums/AlbumsViewModel$State;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
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
            public final int f5081a;

            public a(int i10) {
                super(null);
                this.f5081a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f5081a == ((a) obj).f5081a;
            }

            public int hashCode() {
                return this.f5081a;
            }

            public String toString() {
                return android.support.v4.media.a.i(a1.a.m("AlbumFiltersChanged(count="), this.f5081a, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5082a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final c f5083a = new c();

            public c() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final d f5084a = new d();

            public d() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final e f5085a = new e();

            public e() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final f f5086a = new f();

            public f() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final g f5087a = new g();

            public g() {
                super(null);
            }
        }

        public State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AlbumsViewModel(m getUserOrientationObservableUseCase, c getCommunityAlbumsUseCase, e getUserAlbumsUseCase, b getCommunityAlbumFiltersObservableUseCase, k getOwnUserMetaDataUseCase) {
        Intrinsics.checkNotNullParameter(getUserOrientationObservableUseCase, "getUserOrientationObservableUseCase");
        Intrinsics.checkNotNullParameter(getCommunityAlbumsUseCase, "getCommunityAlbumsUseCase");
        Intrinsics.checkNotNullParameter(getUserAlbumsUseCase, "getUserAlbumsUseCase");
        Intrinsics.checkNotNullParameter(getCommunityAlbumFiltersObservableUseCase, "getCommunityAlbumFiltersObservableUseCase");
        Intrinsics.checkNotNullParameter(getOwnUserMetaDataUseCase, "getOwnUserMetaDataUseCase");
        this.d = getUserOrientationObservableUseCase;
        this.f5067e = getCommunityAlbumsUseCase;
        this.f5068f = getUserAlbumsUseCase;
        this.f5069g = getCommunityAlbumFiltersObservableUseCase;
        this.f5070h = getOwnUserMetaDataUseCase;
        PhotosConfig.Companion companion = PhotosConfig.Companion;
        this.f5075m = PhotosConfig.Companion.getDefaultOrder$default(companion, false, 1, null);
        this.f5076o = PhotosConfig.Companion.getDefaultOrder$default(companion, false, 1, null);
        this.f5078q = BuildConfig.FLAVOR;
        this.f5079r = new ArrayList();
        p<a<State>> pVar = new p<>();
        this.f5080s = pVar;
        Disposable subscribe = getUserOrientationObservableUseCase.a(true).subscribe(new x2.a(this, 9));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getUserOrientationObserv…tation = it\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
        Observable merge = Observable.merge(Observable.just(getCommunityAlbumFiltersObservableUseCase.f10493a.i()), getCommunityAlbumFiltersObservableUseCase.f10493a.a());
        Intrinsics.checkNotNullExpressionValue(merge, "{\n            Observable…e\n            )\n        }");
        Disposable subscribe2 = merge.subscribe(new g(this, 9));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "getCommunityAlbumFilters…          }\n            }");
        DisposableKt.addTo(subscribe2, this.f16001c);
        pVar.l(new a<>(State.b.f5082a));
    }

    public final void c(int i10) {
        Observable startWith;
        a<State> d = this.f5080s.d();
        Type type = null;
        if (Intrinsics.areEqual(d == null ? null : d.f21761a, State.d.f5084a)) {
            return;
        }
        Type type2 = this.f5073k;
        if (type2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
            type2 = null;
        }
        Type type3 = Type.PRIVATE;
        if (type2 != type3) {
            Type type4 = this.f5073k;
            if (type4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("type");
                type4 = null;
            }
            if (type4 != Type.USER) {
                c cVar = this.f5067e;
                String order = PhotosConfig.Companion.getOrderAbbr(this.f5075m);
                String filterAbbr = FiltersConfig.Companion.getFilterAbbr(this.n);
                String str = this.f5078q;
                Objects.requireNonNull(cVar);
                Intrinsics.checkNotNullParameter(order, "order");
                startWith = cVar.f10494a.d(order, filterAbbr, 15, i10, str).toObservable().map(a0.F).onErrorReturn(k0.B).startWith((Observable) UseCaseResult.a.f4910a);
                Intrinsics.checkNotNullExpressionValue(startWith, "photosRepository.getComm…th(UseCaseResult.Loading)");
                Disposable subscribe = startWith.subscribe(new x2.b(this, 6));
                Intrinsics.checkNotNullExpressionValue(subscribe, "source.subscribe {\n     …}\n            }\n        }");
                DisposableKt.addTo(subscribe, this.f16001c);
            }
        }
        e eVar = this.f5068f;
        String targetUserId = this.f5074l;
        if (targetUserId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userId");
            targetUserId = null;
        }
        Type type5 = this.f5073k;
        if (type5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        } else {
            type = type5;
        }
        boolean z10 = type == type3;
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        startWith = eVar.f10496a.h(targetUserId, 15, i10, z10).toObservable().map(z.D).onErrorReturn(a0.G).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "photosRepository.getUser…th(UseCaseResult.Loading)");
        Disposable subscribe2 = startWith.subscribe(new x2.b(this, 6));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "source.subscribe {\n     …}\n            }\n        }");
        DisposableKt.addTo(subscribe2, this.f16001c);
    }

    public final boolean d() {
        return this.f5078q.length() > 0;
    }

    public final void e() {
        this.f5079r.clear();
        c(0);
    }

    public final void f(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String str = this.f5078q;
        this.f5078q = query;
        if (str.length() == 0) {
            this.f5076o = this.f5075m;
            this.f5077p = this.n;
            PhotosConfig.Companion companion = PhotosConfig.Companion;
            PhotosConfig.PhotoOrder defaultOrder = companion.getDefaultOrder(true);
            this.f5075m = defaultOrder;
            this.n = companion.getDefaultFilter(defaultOrder);
            this.f5080s.l(new a<>(State.g.f5087a));
        } else {
            this.f5080s.l(new a<>(State.f.f5086a));
        }
        c(0);
    }
}
