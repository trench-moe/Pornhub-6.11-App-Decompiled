package b3;

import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.playlist.PlaylistsOverview;
import com.app.pornhub.domain.model.video.VideoMetaData;
import io.reactivex.Single;
import java.util.List;
import kotlin.Triple;

/* loaded from: classes.dex */
public interface k {
    Single<Playlist> a(long j10, Integer num, Integer num2);

    Triple<Playlist, Boolean, Boolean> b();

    Single<PlaylistsOverview> c(boolean z10);

    Triple<Playlist, List<VideoMetaData>, String> d();

    Single<List<Playlist>> e(boolean z10);

    Single<List<Playlist>> f(boolean z10);

    Single<List<Playlist>> g(boolean z10);

    void h(Playlist playlist, List<VideoMetaData> list, String str);

    void i(Playlist playlist, boolean z10, boolean z11);
}
