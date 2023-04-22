package e5;

import android.text.TextUtils;
import android.view.View;
import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9094c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9095f;

    public /* synthetic */ j(VideoDetailsActivity videoDetailsActivity, int i10) {
        this.f9094c = i10;
        this.f9095f = videoDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9094c) {
            case 0:
                VideoDetailsActivity videoDetailsActivity = this.f9095f;
                if (!(videoDetailsActivity.O.a(null) instanceof VideoQuality.Q1080p)) {
                    if (TextUtils.isEmpty(videoDetailsActivity.S.getEncodings().getUrl1080p()) && !videoDetailsActivity.T.isVr()) {
                        videoDetailsActivity.Z();
                        return;
                    }
                    videoDetailsActivity.M(VideoQuality.Q1080p.INSTANCE);
                }
                return;
            default:
                VideoDetailsActivity videoDetailsActivity2 = this.f9095f;
                VideoDetailsViewModel videoDetailsViewModel = videoDetailsActivity2.L;
                String vkey = videoDetailsActivity2.T.getVkey();
                Objects.requireNonNull(videoDetailsViewModel);
                Intrinsics.checkNotNullParameter(vkey, "vkey");
                List<VideoMetaData> d = videoDetailsViewModel.f5579r.d();
                if (d == null) {
                    return;
                }
                Iterator<VideoMetaData> it = d.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                    } else if (!Intrinsics.areEqual(it.next().getVkey(), vkey)) {
                        i10++;
                    }
                }
                if (i10 == CollectionsKt.getLastIndex(d)) {
                    videoDetailsViewModel.f5580s.l(d.get(0).getVkey());
                    return;
                } else {
                    videoDetailsViewModel.f5580s.l(d.get(i10 + 1).getVkey());
                    return;
                }
        }
    }
}
