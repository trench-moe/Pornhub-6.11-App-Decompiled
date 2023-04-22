package f3;

import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.domain.model.video.Video;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f9375a;

    public f(b3.e currentUserRepository, int i10) {
        if (i10 == 1) {
            Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
            this.f9375a = currentUserRepository;
        } else if (i10 != 2) {
            Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
            this.f9375a = currentUserRepository;
        } else {
            Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
            this.f9375a = currentUserRepository;
        }
    }

    public VideoQuality a(Video video) {
        VideoQuality videoQuality = this.f9375a.f().getVideoQuality();
        if (video != null) {
            if (video.getVideoMetaData().isVr()) {
                if (!(videoQuality instanceof VideoQuality.Q480p)) {
                    if (videoQuality instanceof VideoQuality.Q720p) {
                    }
                }
                videoQuality = VideoQuality.Q1080p.INSTANCE;
            }
        }
        return videoQuality;
    }
}
