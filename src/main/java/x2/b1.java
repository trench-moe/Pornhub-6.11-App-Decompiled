package x2;

import com.app.pornhub.data.model.playlist.FavoritePlaylistsResponse;
import com.app.pornhub.data.model.playlist.PublicPlaylistsResponse;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.playlist.Playlist;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17684c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c1 f17685f;

    public /* synthetic */ b1(c1 c1Var, int i10) {
        this.f17684c = i10;
        this.f17685f = c1Var;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17684c) {
            case 0:
                c1 this$0 = this.f17685f;
                PublicPlaylistsResponse it = (PublicPlaylistsResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getError() == null) {
                    List<Playlist> o10 = this$0.f17690b.o(it.getPublicPlayLists());
                    this$0.f17694g = o10;
                    this$0.f17695h = System.currentTimeMillis();
                    return o10;
                }
                throw new PornhubException(it.getError().getCode(), it.getError().getMessage());
            default:
                c1 this$02 = this.f17685f;
                FavoritePlaylistsResponse it2 = (FavoritePlaylistsResponse) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.getError() == null) {
                    List<Playlist> o11 = this$02.f17690b.o(it2.getFavoritePlayLists());
                    this$02.f17698k = o11;
                    this$02.f17699l = System.currentTimeMillis();
                    return o11;
                }
                throw new PornhubException(it2.getError().getCode(), it2.getError().getMessage());
        }
    }
}
