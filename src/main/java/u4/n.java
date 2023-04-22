package u4;

import a4.a;
import com.app.pornhub.domain.config.FiltersConfig;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.video.VideoMetaData;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n extends a4.a<VideoMetaData> {

    /* renamed from: f  reason: collision with root package name */
    public final o3.h f15557f;

    /* renamed from: g  reason: collision with root package name */
    public final VideosConfig.VideoOrder f15558g;

    /* renamed from: h  reason: collision with root package name */
    public final FiltersConfig.Time f15559h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15560i;

    /* renamed from: j  reason: collision with root package name */
    public final a.InterfaceC0004a f15561j;

    /* renamed from: k  reason: collision with root package name */
    public final CompositeDisposable f15562k;

    public n(o3.h getVideosUseCase, VideosConfig.VideoOrder videoOrder, FiltersConfig.Time time, String str, a.InterfaceC0004a interfaceC0004a) {
        Intrinsics.checkNotNullParameter(getVideosUseCase, "getVideosUseCase");
        Intrinsics.checkNotNullParameter(videoOrder, "videoOrder");
        this.f15557f = getVideosUseCase;
        this.f15558g = videoOrder;
        this.f15559h = time;
        this.f15560i = str;
        this.f15561j = interfaceC0004a;
        this.f15562k = new CompositeDisposable();
    }
}
