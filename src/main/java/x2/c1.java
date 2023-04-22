package x2;

import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.playlist.PlaylistsOverview;
import com.app.pornhub.domain.model.video.VideoMetaData;
import io.reactivex.Single;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c1 implements b3.k {

    /* renamed from: a  reason: collision with root package name */
    public final w2.k f17689a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.a f17690b;

    /* renamed from: c  reason: collision with root package name */
    public final y2.a f17691c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public PlaylistsOverview f17692e;

    /* renamed from: f  reason: collision with root package name */
    public long f17693f;

    /* renamed from: g  reason: collision with root package name */
    public List<Playlist> f17694g;

    /* renamed from: h  reason: collision with root package name */
    public long f17695h;

    /* renamed from: i  reason: collision with root package name */
    public List<Playlist> f17696i;

    /* renamed from: j  reason: collision with root package name */
    public long f17697j;

    /* renamed from: k  reason: collision with root package name */
    public List<Playlist> f17698k;

    /* renamed from: l  reason: collision with root package name */
    public long f17699l;

    /* renamed from: m  reason: collision with root package name */
    public Playlist f17700m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f17701o;

    /* renamed from: p  reason: collision with root package name */
    public Playlist f17702p;

    /* renamed from: q  reason: collision with root package name */
    public List<VideoMetaData> f17703q;

    /* renamed from: r  reason: collision with root package name */
    public String f17704r;

    public c1(w2.k playlistsService, s2.a modelMapper, y2.a exceptionMapper) {
        Intrinsics.checkNotNullParameter(playlistsService, "playlistsService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        this.f17689a = playlistsService;
        this.f17690b = modelMapper;
        this.f17691c = exceptionMapper;
        this.d = TimeUnit.MINUTES.toMillis(10L);
    }

    @Override // b3.k
    public Single<Playlist> a(long j10, Integer num, Integer num2) {
        Single<Playlist> map = m9.a.i(this.f17689a.a(j10, num, num2)).doOnError(new y0(this, 0)).map(new a1(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "playlistsService.getPlay…          }\n            }");
        return map;
    }

    @Override // b3.k
    public Triple<Playlist, Boolean, Boolean> b() {
        return new Triple<>(this.f17700m, Boolean.valueOf(this.n), Boolean.valueOf(this.f17701o));
    }

    @Override // b3.k
    public Single<PlaylistsOverview> c(boolean z10) {
        if (!j(this.f17693f) || z10) {
            Single<PlaylistsOverview> map = m9.a.i(this.f17689a.e()).doOnError(new m(this, 2)).map(new k(this, 6));
            Intrinsics.checkNotNullExpressionValue(map, "playlistsService.getPlay…          }\n            }");
            return map;
        }
        Single<PlaylistsOverview> just = Single.just(this.f17692e);
        Intrinsics.checkNotNullExpressionValue(just, "just(cachedPlaylistOverview)");
        return just;
    }

    @Override // b3.k
    public Triple<Playlist, List<VideoMetaData>, String> d() {
        Playlist playlist = this.f17702p;
        Intrinsics.checkNotNull(playlist);
        return new Triple<>(playlist, this.f17703q, this.f17704r);
    }

    @Override // b3.k
    public Single<List<Playlist>> e(boolean z10) {
        if (!j(this.f17699l) || z10) {
            Single<List<Playlist>> map = m9.a.i(this.f17689a.c(PlaylistsConfig.TYPE_FAVORITE)).doOnError(new z0(this, 1)).map(new b1(this, 1));
            Intrinsics.checkNotNullExpressionValue(map, "playlistsService.getFavo…          }\n            }");
            return map;
        }
        Single<List<Playlist>> just = Single.just(this.f17698k);
        Intrinsics.checkNotNullExpressionValue(just, "just(cachedFavoritePlaylists)");
        return just;
    }

    @Override // b3.k
    public Single<List<Playlist>> f(boolean z10) {
        if (!j(this.f17697j) || z10) {
            Single<List<Playlist>> map = m9.a.i(this.f17689a.d(PlaylistsConfig.TYPE_PRIVATE)).doOnError(new y0(this, 1)).map(new a1(this, 1));
            Intrinsics.checkNotNullExpressionValue(map, "playlistsService.getPriv…          }\n            }");
            return map;
        }
        Single<List<Playlist>> just = Single.just(this.f17696i);
        Intrinsics.checkNotNullExpressionValue(just, "just(cachedPrivatePlaylists)");
        return just;
    }

    @Override // b3.k
    public Single<List<Playlist>> g(boolean z10) {
        if (!j(this.f17695h) || z10) {
            Single<List<Playlist>> map = m9.a.i(this.f17689a.b(PlaylistsConfig.TYPE_PUBLIC)).doOnError(new z0(this, 0)).map(new b1(this, 0));
            Intrinsics.checkNotNullExpressionValue(map, "playlistsService.getPubl…          }\n            }");
            return map;
        }
        Single<List<Playlist>> just = Single.just(this.f17694g);
        Intrinsics.checkNotNullExpressionValue(just, "just(cachedPublicPlaylists)");
        return just;
    }

    @Override // b3.k
    public void h(Playlist playlist, List<VideoMetaData> list, String str) {
        Intrinsics.checkNotNullParameter(playlist, "playlist");
        this.f17702p = playlist;
        this.f17703q = list;
        this.f17704r = str;
    }

    @Override // b3.k
    public void i(Playlist playlist, boolean z10, boolean z11) {
        this.f17700m = playlist;
        this.n = z10;
        this.f17701o = z11;
    }

    public final boolean j(long j10) {
        return j10 != 0 && System.currentTimeMillis() - this.d < j10;
    }
}
