package com.app.pornhub.view.home.videolistings;

import a4.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import com.app.pornhub.domain.config.FiltersConfig;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.home.videolistings.VideoListingsViewModel;
import com.appsflyer.oaid.BuildConfig;
import f3.h;
import f3.m;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import n1.e;
import n1.i;
import o3.f;
import o3.i;
import u4.n;
import v3.d;
import x2.c;

/* loaded from: classes.dex */
public final class VideoListingsViewModel extends d {
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final f f5341e;

    /* renamed from: f  reason: collision with root package name */
    public final i f5342f;

    /* renamed from: g  reason: collision with root package name */
    public final h f5343g;

    /* renamed from: h  reason: collision with root package name */
    public final o3.h f5344h;

    /* renamed from: i  reason: collision with root package name */
    public UserOrientation f5345i;

    /* renamed from: j  reason: collision with root package name */
    public VideoFilters f5346j;

    /* renamed from: k  reason: collision with root package name */
    public VideosConfig.VideoOrder f5347k;

    /* renamed from: l  reason: collision with root package name */
    public FiltersConfig.Time f5348l;

    /* renamed from: m  reason: collision with root package name */
    public VideosConfig.VideoOrder f5349m;
    public FiltersConfig.Time n;

    /* renamed from: o  reason: collision with root package name */
    public String f5350o;

    /* renamed from: p  reason: collision with root package name */
    public final p<z3.a<State>> f5351p;

    /* renamed from: q  reason: collision with root package name */
    public final i.b f5352q;

    /* renamed from: r  reason: collision with root package name */
    public final Lazy<LiveData<n1.i<VideoMetaData>>> f5353r;

    /* renamed from: s  reason: collision with root package name */
    public final Lazy f5354s;

    /* renamed from: t  reason: collision with root package name */
    public final Lazy<LiveData<n1.i<VideoMetaData>>> f5355t;

    /* renamed from: u  reason: collision with root package name */
    public final Lazy f5356u;

    /* renamed from: v  reason: collision with root package name */
    public final Lazy f5357v;

    /* loaded from: classes.dex */
    public static abstract class State {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/videolistings/VideoListingsViewModel$State$LoadingError;", "Lcom/app/pornhub/view/home/videolistings/VideoListingsViewModel$State;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
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
            public static final a f5358a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5359a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends State {

            /* renamed from: a  reason: collision with root package name */
            public final int f5360a;

            public c(int i10) {
                super(null);
                this.f5360a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f5360a == ((c) obj).f5360a;
            }

            public int hashCode() {
                return this.f5360a;
            }

            public String toString() {
                return android.support.v4.media.a.i(a1.a.m("LoadingStop(count="), this.f5360a, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final d f5361a = new d();

            public d() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final e f5362a = new e();

            public e() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends State {

            /* renamed from: a  reason: collision with root package name */
            public final int f5363a;

            public f(int i10) {
                super(null);
                this.f5363a = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f5363a == ((f) obj).f5363a;
            }

            public int hashCode() {
                return this.f5363a;
            }

            public String toString() {
                return android.support.v4.media.a.i(a1.a.m("VideoFiltersChanged(count="), this.f5363a, ')');
            }
        }

        public State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public final class a extends e.a<Integer, VideoMetaData> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f5364a;

        /* renamed from: com.app.pornhub.view.home.videolistings.VideoListingsViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0056a implements a.InterfaceC0004a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ VideoListingsViewModel f5366a;

            public C0056a(VideoListingsViewModel videoListingsViewModel) {
                this.f5366a = videoListingsViewModel;
            }

            @Override // a4.a.InterfaceC0004a
            public void a(boolean z10, int i10) {
                if (z10) {
                    this.f5366a.f5351p.j(new z3.a<>(new State.c(i10)));
                }
            }

            @Override // a4.a.InterfaceC0004a
            public void b(boolean z10, Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                kf.a.f12078a.d(throwable, "Error loading videos", new Object[0]);
                if (z10) {
                    this.f5366a.f5351p.j(new z3.a<>(new State.LoadingError(throwable)));
                }
            }

            @Override // a4.a.InterfaceC0004a
            public void c(boolean z10) {
                if (z10) {
                    this.f5366a.f5351p.j(new z3.a<>(State.b.f5359a));
                }
            }
        }

        public a(VideoListingsViewModel this$0, boolean z10) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            VideoListingsViewModel.this = this$0;
            this.f5364a = z10;
        }

        public a(boolean z10, int i10) {
            z10 = (i10 & 1) != 0 ? false : z10;
            Intrinsics.checkNotNullParameter(VideoListingsViewModel.this, "this$0");
            VideoListingsViewModel.this = VideoListingsViewModel.this;
            this.f5364a = z10;
        }

        @Override // n1.e.a
        public e<Integer, VideoMetaData> a() {
            VideoListingsViewModel videoListingsViewModel = VideoListingsViewModel.this;
            return new n(videoListingsViewModel.f5344h, videoListingsViewModel.f5347k, videoListingsViewModel.f5348l, this.f5364a ? videoListingsViewModel.f5350o : BuildConfig.FLAVOR, new C0056a(videoListingsViewModel));
        }
    }

    public VideoListingsViewModel(m getUserOrientationObservableUseCase, f getVideoFiltersObservableUseCase, o3.i saveVideoFiltersUseCase, h getCurrentAuthLevelUseCase, o3.h getVideosUseCase) {
        Intrinsics.checkNotNullParameter(getUserOrientationObservableUseCase, "getUserOrientationObservableUseCase");
        Intrinsics.checkNotNullParameter(getVideoFiltersObservableUseCase, "getVideoFiltersObservableUseCase");
        Intrinsics.checkNotNullParameter(saveVideoFiltersUseCase, "saveVideoFiltersUseCase");
        Intrinsics.checkNotNullParameter(getCurrentAuthLevelUseCase, "getCurrentAuthLevelUseCase");
        Intrinsics.checkNotNullParameter(getVideosUseCase, "getVideosUseCase");
        this.d = getUserOrientationObservableUseCase;
        this.f5341e = getVideoFiltersObservableUseCase;
        this.f5342f = saveVideoFiltersUseCase;
        this.f5343g = getCurrentAuthLevelUseCase;
        this.f5344h = getVideosUseCase;
        VideosConfig.Companion companion = VideosConfig.Companion;
        this.f5347k = VideosConfig.Companion.getDefaultOrder$default(companion, false, 1, null);
        this.f5349m = VideosConfig.Companion.getDefaultOrder$default(companion, false, 1, null);
        this.f5350o = BuildConfig.FLAVOR;
        this.f5351p = new p<>();
        i.b bVar = new i.b(16, 8, false, 16, IntCompanionObject.MAX_VALUE);
        Intrinsics.checkNotNullExpressionValue(bVar, "Builder()\n        .setPa…s(false)\n        .build()");
        this.f5352q = bVar;
        Lazy<LiveData<n1.i<VideoMetaData>>> lazy = LazyKt.lazy(new Function0<LiveData<n1.i<VideoMetaData>>>() { // from class: com.app.pornhub.view.home.videolistings.VideoListingsViewModel$dataDelegate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public LiveData<n1.i<VideoMetaData>> invoke() {
                VideoListingsViewModel.a aVar = new VideoListingsViewModel.a(false, 1);
                i.b bVar2 = VideoListingsViewModel.this.f5352q;
                if (bVar2 != null) {
                    Executor executor = l.a.f12145c;
                    Executor executor2 = l.a.d;
                    return new n1.f(executor2, null, aVar, bVar2, executor, executor2).f2366b;
                }
                throw new IllegalArgumentException("PagedList.Config must be provided");
            }
        });
        this.f5353r = lazy;
        this.f5354s = lazy;
        Lazy<LiveData<n1.i<VideoMetaData>>> lazy2 = LazyKt.lazy(new Function0<LiveData<n1.i<VideoMetaData>>>() { // from class: com.app.pornhub.view.home.videolistings.VideoListingsViewModel$searchDataDelegate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public LiveData<n1.i<VideoMetaData>> invoke() {
                VideoListingsViewModel.a aVar = new VideoListingsViewModel.a(VideoListingsViewModel.this, true);
                i.b bVar2 = VideoListingsViewModel.this.f5352q;
                if (bVar2 != null) {
                    Executor executor = l.a.f12145c;
                    Executor executor2 = l.a.d;
                    return new n1.f(executor2, null, aVar, bVar2, executor, executor2).f2366b;
                }
                throw new IllegalArgumentException("PagedList.Config must be provided");
            }
        });
        this.f5355t = lazy2;
        this.f5356u = lazy2;
        this.f5357v = LazyKt.lazy(new Function0<o<n1.i<VideoMetaData>>>() { // from class: com.app.pornhub.view.home.videolistings.VideoListingsViewModel$data$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public o<n1.i<VideoMetaData>> invoke() {
                final o<n1.i<VideoMetaData>> oVar = new o<>();
                oVar.m(VideoListingsViewModel.this.d(), new q() { // from class: u4.g
                    @Override // androidx.lifecycle.q
                    public final void a(Object obj) {
                        o mediator = o.this;
                        n1.i iVar = (n1.i) obj;
                        Intrinsics.checkNotNullParameter(mediator, "$mediator");
                        if (iVar == null) {
                            return;
                        }
                        mediator.l(iVar);
                    }
                });
                return oVar;
            }
        });
        Disposable subscribe = getUserOrientationObservableUseCase.a(true).subscribe(new x2.h(this, 10));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getUserOrientationObserv…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
        Disposable subscribe2 = getVideoFiltersObservableUseCase.a(true).subscribe(new c(this, 17));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "getVideoFiltersObservabl…          }\n            }");
        DisposableKt.addTo(subscribe2, this.f16001c);
    }

    @Override // v3.d, androidx.lifecycle.x
    public void a() {
        this.f16001c.dispose();
        f();
    }

    public final o<n1.i<VideoMetaData>> c() {
        return (o) this.f5357v.getValue();
    }

    public final LiveData<n1.i<VideoMetaData>> d() {
        Object value = this.f5354s.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-videosLiveData>(...)");
        return (LiveData) value;
    }

    public final LiveData<n1.i<VideoMetaData>> e() {
        Object value = this.f5356u.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-videosSearchLiveData>(...)");
        return (LiveData) value;
    }

    public final void f() {
        e<?, VideoMetaData> j10;
        n1.i<VideoMetaData> d = c().d();
        if (d == null || (j10 = d.j()) == null) {
            return;
        }
        j10.b();
    }

    public final boolean g() {
        return this.f5353r.isInitialized();
    }

    public final void h(String query) {
        e<?, VideoMetaData> j10;
        Intrinsics.checkNotNullParameter(query, "query");
        String str = this.f5350o;
        this.f5350o = query;
        if (!(str.length() == 0)) {
            n1.i<VideoMetaData> d = e().d();
            if (d != null && (j10 = d.j()) != null) {
                j10.b();
                return;
            }
            return;
        }
        this.f5349m = this.f5347k;
        this.n = this.f5348l;
        VideosConfig.Companion companion = VideosConfig.Companion;
        VideosConfig.VideoOrder defaultOrder = companion.getDefaultOrder(true);
        this.f5347k = defaultOrder;
        this.f5348l = companion.getDefaultFilter(defaultOrder);
        this.f5351p.l(new z3.a<>(State.e.f5362a));
        if (!g()) {
            c().n(d());
        }
        c().m(e(), new g4.o(this, 2));
    }
}
