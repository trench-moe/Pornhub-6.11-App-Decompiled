package o3;

import b3.o;
import com.app.pornhub.domain.model.video.VideoFilters;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final o f13548a;

    public i(o videosRepository) {
        Intrinsics.checkNotNullParameter(videosRepository, "videosRepository");
        this.f13548a = videosRepository;
    }

    public final void a(VideoFilters videoFilters) {
        Intrinsics.checkNotNullParameter(videoFilters, "videoFilters");
        this.f13548a.h(videoFilters);
    }
}
