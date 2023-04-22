package e5;

import android.text.TextUtils;
import android.view.View;
import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9088c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9089f;

    public /* synthetic */ h(VideoDetailsActivity videoDetailsActivity, int i10) {
        this.f9088c = i10;
        this.f9089f = videoDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9088c) {
            case 0:
                VideoDetailsActivity videoDetailsActivity = this.f9089f;
                if (!(videoDetailsActivity.O.a(null) instanceof VideoQuality.Q1440p)) {
                    if (TextUtils.isEmpty(videoDetailsActivity.S.getEncodings().getUrl1440p()) && !videoDetailsActivity.T.isVr()) {
                        videoDetailsActivity.Z();
                        return;
                    }
                    if (videoDetailsActivity.M.a().getShowDataWarning()) {
                        videoDetailsActivity.Q(false);
                        videoDetailsActivity.W(VideoQuality.Q1440p.INSTANCE);
                        return;
                    }
                    videoDetailsActivity.M(VideoQuality.Q1440p.INSTANCE);
                }
                return;
            default:
                VideoDetailsViewModel videoDetailsViewModel = this.f9089f.L;
                androidx.lifecycle.p<Boolean> pVar = videoDetailsViewModel.f5584w;
                Boolean d = pVar.d();
                Intrinsics.checkNotNull(d);
                pVar.l(Boolean.valueOf(!d.booleanValue()));
                Boolean d10 = videoDetailsViewModel.f5584w.d();
                Intrinsics.checkNotNull(d10);
                Intrinsics.checkNotNullExpressionValue(d10, "shuffleLiveData.value!!");
                if (!d10.booleanValue()) {
                    videoDetailsViewModel.f5579r.l(videoDetailsViewModel.f5582u);
                    return;
                }
                Collections.shuffle(videoDetailsViewModel.f5583v);
                videoDetailsViewModel.f5579r.l(videoDetailsViewModel.f5583v);
                return;
        }
    }
}
