package b3;

import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.app.pornhub.domain.model.video.VideoMetaData;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;

/* loaded from: classes.dex */
public interface o {
    Single<Video> a(String str);

    Single<Boolean> b(String str);

    Single<List<VideoMetaData>> c(String str, int i10);

    Completable d(String str, boolean z10);

    Completable e(String str);

    Single<List<VideoMetaData>> f(String str, int i10, int i11);

    Single<List<VideoMetaData>> g(String str, String str2, String str3, int i10, int i11);

    void h(VideoFilters videoFilters);

    Observable<VideoFilters> i();

    Completable j(String str, boolean z10);

    Completable k(Video video);

    Single<List<VideoMetaData>> l(String str, VideosConfig.UserVideosType userVideosType, int i10, int i11);

    VideoFilters m();
}
