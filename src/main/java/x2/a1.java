package x2;

import com.app.pornhub.data.model.playlist.PlaylistResponse;
import com.app.pornhub.data.model.playlist.PrivatePlaylistsResponse;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.playlist.Playlist;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17679c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c1 f17680f;

    public /* synthetic */ a1(c1 c1Var, int i10) {
        this.f17679c = i10;
        this.f17680f = c1Var;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17679c) {
            case 0:
                c1 this$0 = this.f17680f;
                PlaylistResponse playlistResponse = (PlaylistResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(playlistResponse, "it");
                if (playlistResponse.getError() == null) {
                    s2.a aVar = this$0.f17690b;
                    Objects.requireNonNull(aVar);
                    Intrinsics.checkNotNullParameter(playlistResponse, "playlistResponse");
                    Playlist n = aVar.n(playlistResponse.getPlaylist());
                    n.setVideos(aVar.v(playlistResponse.getVideos()));
                    return n;
                }
                throw new PornhubException(playlistResponse.getError().getCode(), playlistResponse.getError().getMessage());
            default:
                c1 this$02 = this.f17680f;
                PrivatePlaylistsResponse it = (PrivatePlaylistsResponse) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getError() == null) {
                    List<Playlist> o10 = this$02.f17690b.o(it.getPrivatePlayLists());
                    this$02.f17696i = o10;
                    this$02.f17697j = System.currentTimeMillis();
                    return o10;
                }
                throw new PornhubException(it.getError().getCode(), it.getError().getMessage());
        }
    }
}
