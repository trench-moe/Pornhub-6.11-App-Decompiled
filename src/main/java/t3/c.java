package t3;

import android.content.Context;
import android.os.Bundle;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.user.UserAuthLevel;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.user.UserSettings;
import com.app.pornhub.domain.model.video.VideoFilters;
import io.reactivex.annotations.SchedulerSupport;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15106a;

    /* renamed from: b  reason: collision with root package name */
    public long f15107b;

    /* renamed from: c  reason: collision with root package name */
    public long f15108c;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15106a = context;
    }

    @Override // t3.b
    public void a(UserAuthLevel authLevel) {
        Intrinsics.checkNotNullParameter(authLevel, "authLevel");
        Context context = this.f15106a;
        Intrinsics.checkNotNullParameter(authLevel, "authLevel");
        g.c(context, "UserType", authLevel instanceof UserAuthLevel.Free ? "free" : authLevel instanceof UserAuthLevel.Trial ? "trial" : authLevel instanceof UserAuthLevel.Expired ? "expired" : authLevel instanceof UserAuthLevel.Premium ? "premium" : SchedulerSupport.NONE);
    }

    @Override // t3.b
    public void b(UserSettings userSettings) {
        Intrinsics.checkNotNullParameter(userSettings, "userSettings");
        g.c(this.f15106a, UsersConfig.AUTO_PLAY_PREF_KEY, String.valueOf(userSettings.isAutoPlayEnabled()));
        g.c(this.f15106a, UsersConfig.AUTO_ROTATE_PREF_KEY, String.valueOf(userSettings.isAutoRotateEnabled()));
    }

    @Override // t3.b
    public void c(VideoFilters videoFilters) {
        Intrinsics.checkNotNullParameter(videoFilters, "videoFilters");
        Context context = this.f15106a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoFilters, "videoFilters");
        g gVar = g.f15112a;
        gVar.d(context, "VideoFilterVideos", videoFilters.getVideos());
        gVar.d(context, "VideoFilterQuality", videoFilters.getQuality());
        gVar.d(context, "VideoFilterProduction", videoFilters.getProduction());
        gVar.d(context, "VideoFilterDuration", videoFilters.getDuration());
        gVar.d(context, "VideoFilterCategory", videoFilters.getCategory());
    }

    @Override // t3.b
    public void d(long j10) {
        if (this.f15108c == 0) {
            this.f15108c = j10;
            Context context = this.f15106a;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j10 - this.f15107b);
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = new Bundle();
            bundle.putLong("ttv_first_video", seconds);
            Unit unit = Unit.INSTANCE;
            g.i(context, "time_to_value", bundle);
        }
    }

    @Override // t3.b
    public void e(UserOrientation userOrientation) {
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        g.c(this.f15106a, "UserOrientation", UsersConfig.Companion.isGay(userOrientation) ? "gay" : "straight");
    }

    @Override // t3.b
    public void f(long j10) {
        this.f15107b = j10;
    }

    @Override // t3.b
    public void g(UserMetaData userMetaData) {
        g.b(this.f15106a, userMetaData == null ? null : userMetaData.getId());
    }
}
