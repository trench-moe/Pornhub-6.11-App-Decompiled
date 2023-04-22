package e5;

import android.text.TextUtils;
import android.view.View;
import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.google.android.gms.cast.MediaInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9100c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9101f;

    public /* synthetic */ m(VideoDetailsActivity videoDetailsActivity, int i10) {
        this.f9100c = i10;
        this.f9101f = videoDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9100c) {
            case 0:
                VideoDetailsActivity videoDetailsActivity = this.f9101f;
                if (videoDetailsActivity.O.a(null) instanceof VideoQuality.Q2160p) {
                    return;
                }
                if (TextUtils.isEmpty(videoDetailsActivity.S.getEncodings().getUrl2160p()) && !videoDetailsActivity.T.isVr()) {
                    videoDetailsActivity.Z();
                    return;
                } else if (!videoDetailsActivity.M.a().getShowDataWarning()) {
                    videoDetailsActivity.M(VideoQuality.Q2160p.INSTANCE);
                    return;
                } else {
                    videoDetailsActivity.Q(false);
                    videoDetailsActivity.W(VideoQuality.Q2160p.INSTANCE);
                    return;
                }
            case 1:
                VideoDetailsActivity videoDetailsActivity2 = this.f9101f;
                if (videoDetailsActivity2.f5547h0.j()) {
                    videoDetailsActivity2.f5547h0.v();
                    return;
                }
                w8.g gVar = videoDetailsActivity2.f5547h0;
                MediaInfo mediaInfo = videoDetailsActivity2.f5543d0;
                Boolean bool = Boolean.TRUE;
                if (Double.compare(1.0d, 2.0d) > 0 || Double.compare(1.0d, 0.5d) < 0) {
                    throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                }
                u8.i iVar = new u8.i(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
                h9.o.d("Must be called from the main thread.");
                if (gVar.C()) {
                    w8.g.D(new w8.q(gVar, iVar));
                    return;
                } else {
                    w8.g.w(17, null);
                    return;
                }
            default:
                androidx.lifecycle.p<Boolean> pVar = this.f9101f.L.f5585x;
                Boolean d = pVar.d();
                Intrinsics.checkNotNull(d);
                pVar.l(Boolean.valueOf(!d.booleanValue()));
                return;
        }
    }
}
