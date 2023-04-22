package q0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.core.widget.ContentLoadingProgressBar;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.google.android.exoplayer2.ui.l;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14161c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14162f;

    public /* synthetic */ d(Object obj, int i10) {
        this.f14161c = i10;
        this.f14162f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14161c) {
            case 0:
                int i10 = ContentLoadingProgressBar.f1881j;
                ((ContentLoadingProgressBar) this.f14162f).setVisibility(8);
                return;
            case 1:
                ChannelActivity channelActivity = (ChannelActivity) this.f14162f;
                channelActivity.M.f4364f.setVisibility(0);
                channelActivity.M.f4364f.animate().alpha(1.0f).setDuration(300L);
                return;
            case 2:
                ((CommentsFragment) this.f14162f).J0.p(true);
                return;
            case 3:
                HomeActivity this$0 = (HomeActivity) this.f14162f;
                int i11 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.R();
                return;
            case 4:
                int i12 = VideoDetailsActivity.f5539t0;
                ((VideoDetailsActivity) this.f14162f).Q(false);
                return;
            case 5:
                l lVar = (l) this.f14162f;
                lVar.f6634l.start();
                lVar.g(lVar.f6642u, 2000L);
                return;
            default:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f14162f;
                Surface surface = sphericalGLSurfaceView.f6749w;
                if (surface != null) {
                    Iterator<SphericalGLSurfaceView.b> it = sphericalGLSurfaceView.f6743c.iterator();
                    while (it.hasNext()) {
                        it.next().t(surface);
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.f6748u;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.f6748u = null;
                sphericalGLSurfaceView.f6749w = null;
                return;
        }
    }
}
