package f4;

import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import com.app.pornhub.view.offline.OfflineVideoPlayerActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9393a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9394b;

    public /* synthetic */ c(v3.b bVar, int i10) {
        this.f9393a = i10;
        this.f9394b = bVar;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i10) {
        switch (this.f9393a) {
            case 0:
                int i11 = GifDetailsActivity.U;
                ((GifDetailsActivity) this.f9394b).C(i10);
                return;
            case 1:
                OfflineVideoPlayerActivity offlineVideoPlayerActivity = (OfflineVideoPlayerActivity) this.f9394b;
                if ((i10 & 4) == 0) {
                    offlineVideoPlayerActivity.L.d.setImageResource(R.drawable.ic_expand_fullscreen);
                    return;
                } else {
                    offlineVideoPlayerActivity.L.d.setImageResource(R.drawable.ic_collapse_fullscreen);
                    return;
                }
            default:
                int i12 = VideoDetailsActivity.f5539t0;
                ((VideoDetailsActivity) this.f9394b).D(i10);
                return;
        }
    }
}
