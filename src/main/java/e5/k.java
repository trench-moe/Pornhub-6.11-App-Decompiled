package e5;

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
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9096c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9097f;

    public /* synthetic */ k(VideoDetailsActivity videoDetailsActivity, int i10) {
        this.f9096c = i10;
        this.f9097f = videoDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9096c) {
            case 0:
                VideoDetailsActivity videoDetailsActivity = this.f9097f;
                if (!(videoDetailsActivity.O.a(null) instanceof VideoQuality.Q720p)) {
                    videoDetailsActivity.M(VideoQuality.Q720p.INSTANCE);
                }
                return;
            case 1:
                VideoDetailsActivity videoDetailsActivity2 = this.f9097f;
                int i10 = VideoDetailsActivity.f5539t0;
                if (videoDetailsActivity2.getIntent().getExtras() != null && videoDetailsActivity2.getIntent().getExtras().containsKey("key_vkey")) {
                    videoDetailsActivity2.R.f4485f.f4698a.setVisibility(8);
                    videoDetailsActivity2.L.f(videoDetailsActivity2.getIntent().getExtras().getString("key_vkey"));
                }
                return;
            default:
                VideoDetailsActivity videoDetailsActivity3 = this.f9097f;
                VideoDetailsViewModel videoDetailsViewModel = videoDetailsActivity3.L;
                String vkey = videoDetailsActivity3.T.getVkey();
                Objects.requireNonNull(videoDetailsViewModel);
                Intrinsics.checkNotNullParameter(vkey, "vkey");
                List<VideoMetaData> d = videoDetailsViewModel.f5579r.d();
                if (d == null) {
                    return;
                }
                int i11 = 0;
                Iterator<VideoMetaData> it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                    } else if (!Intrinsics.areEqual(it.next().getVkey(), vkey)) {
                        i11++;
                    }
                }
                if (i11 == 0) {
                    videoDetailsViewModel.f5580s.l(((VideoMetaData) CollectionsKt.last((List<? extends Object>) d)).getVkey());
                    return;
                } else {
                    videoDetailsViewModel.f5580s.l(d.get(i11 - 1).getVkey());
                    return;
                }
        }
    }
}
