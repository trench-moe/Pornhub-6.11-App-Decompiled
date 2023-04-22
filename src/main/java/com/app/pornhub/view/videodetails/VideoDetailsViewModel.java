package com.app.pornhub.view.videodetails;

import androidx.lifecycle.p;
import b5.d;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.common.LikeStatus;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import e5.e0;
import f3.k;
import f3.o;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import j3.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o3.g;
import o3.i;
import o3.j;
import v3.d;

/* loaded from: classes.dex */
public final class VideoDetailsViewModel extends d implements d.a {
    public final p<z3.a<VideoState>> A;
    public final p<a> B;
    public LikeStatus C;
    public final List<Video> D;
    public final j3.c d;

    /* renamed from: e  reason: collision with root package name */
    public final e f5567e;

    /* renamed from: f  reason: collision with root package name */
    public final o f5568f;

    /* renamed from: g  reason: collision with root package name */
    public final k f5569g;

    /* renamed from: h  reason: collision with root package name */
    public final j3.a f5570h;

    /* renamed from: i  reason: collision with root package name */
    public final j3.d f5571i;

    /* renamed from: j  reason: collision with root package name */
    public final o3.e f5572j;

    /* renamed from: k  reason: collision with root package name */
    public final o3.a f5573k;

    /* renamed from: l  reason: collision with root package name */
    public final o3.b f5574l;

    /* renamed from: m  reason: collision with root package name */
    public final d3.c f5575m;
    public final g n;

    /* renamed from: o  reason: collision with root package name */
    public final j f5576o;

    /* renamed from: p  reason: collision with root package name */
    public final t3.b f5577p;

    /* renamed from: q  reason: collision with root package name */
    public final p<Playlist> f5578q;

    /* renamed from: r  reason: collision with root package name */
    public final p<List<VideoMetaData>> f5579r;

    /* renamed from: s  reason: collision with root package name */
    public final p<String> f5580s;

    /* renamed from: t  reason: collision with root package name */
    public final p<PlaylistState> f5581t;

    /* renamed from: u  reason: collision with root package name */
    public final List<VideoMetaData> f5582u;

    /* renamed from: v  reason: collision with root package name */
    public final List<VideoMetaData> f5583v;

    /* renamed from: w  reason: collision with root package name */
    public final p<Boolean> f5584w;

    /* renamed from: x  reason: collision with root package name */
    public final p<Boolean> f5585x;
    public final p<Video> y;

    /* renamed from: z  reason: collision with root package name */
    public final p<List<Category>> f5586z;

    /* loaded from: classes.dex */
    public static abstract class PlaylistState {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/videodetails/VideoDetailsViewModel$PlaylistState$ErrorLoadingPlaylist;", "Lcom/app/pornhub/view/videodetails/VideoDetailsViewModel$PlaylistState;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ErrorLoadingPlaylist extends PlaylistState {
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorLoadingPlaylist(Throwable throwable) {
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
                return (obj instanceof ErrorLoadingPlaylist) && Intrinsics.areEqual(this.throwable, ((ErrorLoadingPlaylist) obj).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ErrorLoadingPlaylist(throwable=");
                m10.append(this.throwable);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/videodetails/VideoDetailsViewModel$PlaylistState$ErrorLoadingPlaylistVideos;", "Lcom/app/pornhub/view/videodetails/VideoDetailsViewModel$PlaylistState;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ErrorLoadingPlaylistVideos extends PlaylistState {
            private final Throwable throwable;

            public ErrorLoadingPlaylistVideos(Throwable th) {
                super(null);
                this.throwable = th;
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
                return (obj instanceof ErrorLoadingPlaylistVideos) && Intrinsics.areEqual(this.throwable, ((ErrorLoadingPlaylistVideos) obj).throwable);
            }

            public int hashCode() {
                Throwable th = this.throwable;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ErrorLoadingPlaylistVideos(throwable=");
                m10.append(this.throwable);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends PlaylistState {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5587a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends PlaylistState {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5588a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends PlaylistState {

            /* renamed from: a  reason: collision with root package name */
            public static final c f5589a = new c();

            public c() {
                super(null);
            }
        }

        public PlaylistState() {
        }

        public PlaylistState(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class VideoState {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/videodetails/VideoDetailsViewModel$VideoState$ErrorLoading;", "Lcom/app/pornhub/view/videodetails/VideoDetailsViewModel$VideoState;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ErrorLoading extends VideoState {
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
                return (obj instanceof ErrorLoading) && Intrinsics.areEqual(this.throwable, ((ErrorLoading) obj).throwable);
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
        public static final class a extends VideoState {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5590a;

            public a(boolean z10) {
                super(null);
                this.f5590a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f5590a == ((a) obj).f5590a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v2 */
            /* JADX WARN: Type inference failed for: r0v3 */
            public int hashCode() {
                boolean z10 = this.f5590a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                return r02;
            }

            public String toString() {
                return a0.a.l(a1.a.m("Loading(showLoading="), this.f5590a, ')');
            }
        }

        public VideoState() {
        }

        public VideoState(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: com.app.pornhub.view.videodetails.VideoDetailsViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0064a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0064a f5591a = new C0064a();

            public C0064a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5592a;

            public b(boolean z10) {
                super(null);
                this.f5592a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f5592a == ((b) obj).f5592a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                boolean z10 = this.f5592a;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public String toString() {
                return a0.a.l(a1.a.m("FavStatusLoadingDone(isFavorite="), this.f5592a, ')');
            }
        }

        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public VideoDetailsViewModel(j3.c getCachedPlaylistForPlaybackUseCase, e getPlaylistUseCase, o getUserSettingsUseCase, k getOwnUserMetaDataUseCase, j3.a cacheCurrentPlaylistUseCase, j3.d getCachedPlaylistUseCase, o3.e getVideoFavoriteStatusUseCase, o3.a changeVideoFavoriteStatusUseCase, o3.b changeVideoLikeStatusUseCase, d3.c getCategoriesByIdUseCase, g getVideoUseCase, i saveVideoFiltersUseCase, j trackVideoViewUseCase, t3.b analyticsHelper) {
        Intrinsics.checkNotNullParameter(getCachedPlaylistForPlaybackUseCase, "getCachedPlaylistForPlaybackUseCase");
        Intrinsics.checkNotNullParameter(getPlaylistUseCase, "getPlaylistUseCase");
        Intrinsics.checkNotNullParameter(getUserSettingsUseCase, "getUserSettingsUseCase");
        Intrinsics.checkNotNullParameter(getOwnUserMetaDataUseCase, "getOwnUserMetaDataUseCase");
        Intrinsics.checkNotNullParameter(cacheCurrentPlaylistUseCase, "cacheCurrentPlaylistUseCase");
        Intrinsics.checkNotNullParameter(getCachedPlaylistUseCase, "getCachedPlaylistUseCase");
        Intrinsics.checkNotNullParameter(getVideoFavoriteStatusUseCase, "getVideoFavoriteStatusUseCase");
        Intrinsics.checkNotNullParameter(changeVideoFavoriteStatusUseCase, "changeVideoFavoriteStatusUseCase");
        Intrinsics.checkNotNullParameter(changeVideoLikeStatusUseCase, "changeVideoLikeStatusUseCase");
        Intrinsics.checkNotNullParameter(getCategoriesByIdUseCase, "getCategoriesByIdUseCase");
        Intrinsics.checkNotNullParameter(getVideoUseCase, "getVideoUseCase");
        Intrinsics.checkNotNullParameter(saveVideoFiltersUseCase, "saveVideoFiltersUseCase");
        Intrinsics.checkNotNullParameter(trackVideoViewUseCase, "trackVideoViewUseCase");
        Intrinsics.checkNotNullParameter(analyticsHelper, "analyticsHelper");
        this.d = getCachedPlaylistForPlaybackUseCase;
        this.f5567e = getPlaylistUseCase;
        this.f5568f = getUserSettingsUseCase;
        this.f5569g = getOwnUserMetaDataUseCase;
        this.f5570h = cacheCurrentPlaylistUseCase;
        this.f5571i = getCachedPlaylistUseCase;
        this.f5572j = getVideoFavoriteStatusUseCase;
        this.f5573k = changeVideoFavoriteStatusUseCase;
        this.f5574l = changeVideoLikeStatusUseCase;
        this.f5575m = getCategoriesByIdUseCase;
        this.n = getVideoUseCase;
        this.f5576o = trackVideoViewUseCase;
        this.f5577p = analyticsHelper;
        this.f5578q = new p<>();
        this.f5579r = new p<>();
        this.f5580s = new p<>();
        this.f5581t = new p<>();
        this.f5582u = new ArrayList();
        this.f5583v = new ArrayList();
        this.f5584w = new p<>();
        this.f5585x = new p<>();
        this.y = new p<>();
        this.f5586z = new p<>();
        this.A = new p<>();
        this.B = new p<>();
        this.C = LikeStatus.None.INSTANCE;
        this.D = new ArrayList();
    }

    @Override // v3.d, androidx.lifecycle.x
    public void a() {
        this.f16001c.dispose();
        Playlist d = this.f5578q.d();
        if (this.f5579r.d() != null) {
            if (d == null) {
                if (this.f5584w.d() != null && this.f5585x.d() != null) {
                    j3.a aVar = this.f5570h;
                    Boolean d10 = this.f5584w.d();
                    Intrinsics.checkNotNull(d10);
                    Intrinsics.checkNotNullExpressionValue(d10, "shuffleLiveData.value!!");
                    boolean booleanValue = d10.booleanValue();
                    Boolean d11 = this.f5585x.d();
                    Intrinsics.checkNotNull(d11);
                    Intrinsics.checkNotNullExpressionValue(d11, "repeatLiveData.value!!");
                    aVar.f11369a.i(d, booleanValue, d11.booleanValue());
                }
            }
            List<VideoMetaData> d12 = this.f5579r.d();
            Intrinsics.checkNotNull(d12);
            Intrinsics.checkNotNullExpressionValue(d12, "playlistVideosLiveData.value!!");
            d.setVideos(d12);
        }
        if (this.f5584w.d() != null) {
            j3.a aVar2 = this.f5570h;
            Boolean d102 = this.f5584w.d();
            Intrinsics.checkNotNull(d102);
            Intrinsics.checkNotNullExpressionValue(d102, "shuffleLiveData.value!!");
            boolean booleanValue2 = d102.booleanValue();
            Boolean d112 = this.f5585x.d();
            Intrinsics.checkNotNull(d112);
            Intrinsics.checkNotNullExpressionValue(d112, "repeatLiveData.value!!");
            aVar2.f11369a.i(d, booleanValue2, d112.booleanValue());
        }
    }

    public final void c(List<VideoMetaData> list) {
        this.f5582u.addAll(list);
        this.f5583v.addAll(CollectionsKt.shuffled(list));
        Boolean d = this.f5584w.d();
        Intrinsics.checkNotNull(d);
        Intrinsics.checkNotNullExpressionValue(d, "shuffleLiveData.value!!");
        if (d.booleanValue()) {
            this.f5579r.l(this.f5583v);
        } else {
            this.f5579r.l(this.f5582u);
        }
    }

    public final VideoMetaData d() {
        Video d = this.y.d();
        if (d == null) {
            return null;
        }
        return d.getVideoMetaData();
    }

    public final LikeStatus e(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        return ((HashSet) androidx.appcompat.widget.p.b().f1052a).contains(vkey) ? LikeStatus.Like.INSTANCE : ((HashSet) androidx.appcompat.widget.p.b().f1053b).contains(vkey) ? LikeStatus.Dislike.INSTANCE : LikeStatus.None.INSTANCE;
    }

    public final void f(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Disposable subscribe = this.n.a(vkey).subscribe(new e0(this, 0));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getVideoUseCase.execute(…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.videodetails.VideoDetailsViewModel.g(java.lang.String):void");
    }
}
