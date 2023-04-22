package e5;

import android.view.View;
import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9098c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9099f;

    public /* synthetic */ l(VideoDetailsActivity videoDetailsActivity, int i10) {
        this.f9098c = i10;
        this.f9099f = videoDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9098c) {
            case 0:
                VideoDetailsActivity videoDetailsActivity = this.f9099f;
                if (videoDetailsActivity.O.a(null) instanceof VideoQuality.Q480p) {
                    return;
                }
                videoDetailsActivity.M(VideoQuality.Q480p.INSTANCE);
                return;
            case 1:
                VideoDetailsActivity videoDetailsActivity2 = this.f9099f;
                int i10 = VideoDetailsActivity.f5539t0;
                if (videoDetailsActivity2.getResources().getConfiguration().orientation == 2) {
                    videoDetailsActivity2.setRequestedOrientation(7);
                } else {
                    videoDetailsActivity2.setRequestedOrientation(6);
                    videoDetailsActivity2.f5553n0 = true;
                }
                VideoQuality quality = videoDetailsActivity2.O.a(videoDetailsActivity2.S);
                String vkey = videoDetailsActivity2.T.getVkey();
                String uploader = videoDetailsActivity2.S.getUserMetaData().getUsername();
                String videoContentType = videoDetailsActivity2.T.getVideoContentType().toString();
                String categories = videoDetailsActivity2.S.getCategories();
                Intrinsics.checkNotNullParameter(vkey, "vkey");
                Intrinsics.checkNotNullParameter(uploader, "uploader");
                Intrinsics.checkNotNullParameter(videoContentType, "videoContentType");
                Intrinsics.checkNotNullParameter(categories, "categories");
                Intrinsics.checkNotNullParameter(quality, "quality");
                t3.g.p(videoDetailsActivity2, "phapp_video_full_screen_click", vkey, false, uploader, videoContentType, categories, (r27 & 128) != 0 ? null : t3.g.a(quality), (r27 & 256) != 0 ? null : null, (r27 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : null, null, null);
                return;
            default:
                VideoDetailsActivity videoDetailsActivity3 = this.f9099f;
                if (videoDetailsActivity3.T.isVr()) {
                    videoDetailsActivity3.L();
                    return;
                } else if (videoDetailsActivity3.f5558s0.isPlaying()) {
                    videoDetailsActivity3.f5558s0.C(false);
                    return;
                } else {
                    videoDetailsActivity3.f5558s0.C(true);
                    return;
                }
        }
    }
}
