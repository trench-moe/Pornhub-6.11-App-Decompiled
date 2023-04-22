package o3;

import b3.o;
import com.app.pornhub.domain.model.video.VideoFilters;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final o f13545a;

    public f(o videosRepository) {
        Intrinsics.checkNotNullParameter(videosRepository, "videosRepository");
        this.f13545a = videosRepository;
    }

    public final Observable<VideoFilters> a(boolean z10) {
        Observable<VideoFilters> i10 = this.f13545a.i();
        VideoFilters m10 = this.f13545a.m();
        if (z10) {
            Observable<VideoFilters> merge = Observable.merge(Observable.just(m10), i10);
            Intrinsics.checkNotNullExpressionValue(merge, "{\n            Observable…e\n            )\n        }");
            return merge;
        }
        return i10;
    }
}
