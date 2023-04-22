package com.app.pornhub.view.home.playlists;

import androidx.lifecycle.p;
import com.app.pornhub.domain.config.PlaylistsType;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.playlist.PlaylistsOverview;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.appsflyer.oaid.BuildConfig;
import f3.k;
import f3.o;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import j3.b;
import j3.f;
import j3.g;
import java.util.List;
import java.util.Objects;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v3.d;
import x2.a0;
import x2.m;
import x2.z;
import z3.a;

/* loaded from: classes.dex */
public final class PlaylistsViewModel extends d {
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public final k f5265e;

    /* renamed from: f  reason: collision with root package name */
    public final f f5266f;

    /* renamed from: g  reason: collision with root package name */
    public final g f5267g;

    /* renamed from: h  reason: collision with root package name */
    public final b f5268h;

    /* renamed from: i  reason: collision with root package name */
    public final p<PlaylistsOverview> f5269i;

    /* renamed from: j  reason: collision with root package name */
    public final p<List<Playlist>> f5270j;

    /* renamed from: k  reason: collision with root package name */
    public final p<a<State>> f5271k;

    /* renamed from: l  reason: collision with root package name */
    public PlaylistsType f5272l;

    /* loaded from: classes.dex */
    public static abstract class State {

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/app/pornhub/view/home/playlists/PlaylistsViewModel$State$ErrorLoadingPlaylistOverview;", "Lcom/app/pornhub/view/home/playlists/PlaylistsViewModel$State;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", BuildConfig.FLAVOR, "isGay", "Z", "()Z", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ErrorLoadingPlaylistOverview extends State {
            private final boolean isGay;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorLoadingPlaylistOverview(Throwable throwable, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
                this.isGay = z10;
            }

            public final Throwable component1() {
                return this.throwable;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ErrorLoadingPlaylistOverview) {
                    ErrorLoadingPlaylistOverview errorLoadingPlaylistOverview = (ErrorLoadingPlaylistOverview) obj;
                    return Intrinsics.areEqual(this.throwable, errorLoadingPlaylistOverview.throwable) && this.isGay == errorLoadingPlaylistOverview.isGay;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.throwable.hashCode() * 31;
                boolean z10 = this.isGay;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                return hashCode + i10;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ErrorLoadingPlaylistOverview(throwable=");
                m10.append(this.throwable);
                m10.append(", isGay=");
                return a0.a.l(m10, this.isGay, ')');
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/app/pornhub/view/home/playlists/PlaylistsViewModel$State$ErrorLoadingPlaylists;", "Lcom/app/pornhub/view/home/playlists/PlaylistsViewModel$State;", BuildConfig.FLAVOR, "component1", "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", BuildConfig.FLAVOR, "isGay", "Z", "()Z", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ErrorLoadingPlaylists extends State {
            private final boolean isGay;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorLoadingPlaylists(Throwable throwable, boolean z10) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
                this.isGay = z10;
            }

            public final Throwable component1() {
                return this.throwable;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ErrorLoadingPlaylists) {
                    ErrorLoadingPlaylists errorLoadingPlaylists = (ErrorLoadingPlaylists) obj;
                    return Intrinsics.areEqual(this.throwable, errorLoadingPlaylists.throwable) && this.isGay == errorLoadingPlaylists.isGay;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.throwable.hashCode() * 31;
                boolean z10 = this.isGay;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                return hashCode + i10;
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ErrorLoadingPlaylists(throwable=");
                m10.append(this.throwable);
                m10.append(", isGay=");
                return a0.a.l(m10, this.isGay, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends State {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    Objects.requireNonNull((a) obj);
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 0;
            }

            public String toString() {
                return "AppBarHeightChanged(totalHeight=0, visibleHeight=0)";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5273a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends State {

            /* renamed from: a  reason: collision with root package name */
            public static final c f5274a = new c();

            public c() {
                super(null);
            }
        }

        public State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PlaylistsViewModel(o getUserSettingsUseCase, k getOwnUserMetaDataUseCase, f getPlaylistsOverviewUseCase, g getPlaylistsUseCase, b cachePlaylistForPlaybackUseCase) {
        Intrinsics.checkNotNullParameter(getUserSettingsUseCase, "getUserSettingsUseCase");
        Intrinsics.checkNotNullParameter(getOwnUserMetaDataUseCase, "getOwnUserMetaDataUseCase");
        Intrinsics.checkNotNullParameter(getPlaylistsOverviewUseCase, "getPlaylistsOverviewUseCase");
        Intrinsics.checkNotNullParameter(getPlaylistsUseCase, "getPlaylistsUseCase");
        Intrinsics.checkNotNullParameter(cachePlaylistForPlaybackUseCase, "cachePlaylistForPlaybackUseCase");
        this.d = getUserSettingsUseCase;
        this.f5265e = getOwnUserMetaDataUseCase;
        this.f5266f = getPlaylistsOverviewUseCase;
        this.f5267g = getPlaylistsUseCase;
        this.f5268h = cachePlaylistForPlaybackUseCase;
        this.f5269i = new p<>();
        this.f5270j = new p<>();
        this.f5271k = new p<>();
    }

    public final void c(boolean z10) {
        Single<List<Playlist>> e10;
        this.f5271k.l(new a<>(State.c.f5274a));
        a.C0174a c0174a = kf.a.f12078a;
        StringBuilder m10 = a1.a.m("Loading ");
        PlaylistsType playlistsType = this.f5272l;
        PlaylistsType playlistsType2 = null;
        if (playlistsType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentType");
            playlistsType = null;
        }
        m10.append(playlistsType);
        m10.append(" playlists");
        c0174a.a(m10.toString(), new Object[0]);
        g gVar = this.f5267g;
        PlaylistsType playlistsType3 = this.f5272l;
        if (playlistsType3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentType");
        } else {
            playlistsType2 = playlistsType3;
        }
        Objects.requireNonNull(gVar);
        Intrinsics.checkNotNullParameter(playlistsType2, "playlistsType");
        if (Intrinsics.areEqual(playlistsType2, PlaylistsType.Public.INSTANCE)) {
            e10 = gVar.f11375a.g(z10);
        } else if (Intrinsics.areEqual(playlistsType2, PlaylistsType.Private.INSTANCE)) {
            e10 = gVar.f11375a.f(z10);
        } else if (!Intrinsics.areEqual(playlistsType2, PlaylistsType.Favorite.INSTANCE)) {
            throw new IllegalStateException("Playlist type " + playlistsType2 + " not supported!");
        } else {
            e10 = gVar.f11375a.e(z10);
        }
        Observable startWith = e10.toObservable().map(z.F).onErrorReturn(a0.I).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "source\n            .toOb…th(UseCaseResult.Loading)");
        Disposable subscribe = startWith.subscribe(new m(this, 14));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getPlaylistsUseCase.exec…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }

    public final String d() {
        String id2;
        UserMetaData a10 = this.f5265e.a();
        if (a10 != null && (id2 = a10.getId()) != null) {
            return id2;
        }
        return BuildConfig.FLAVOR;
    }
}
