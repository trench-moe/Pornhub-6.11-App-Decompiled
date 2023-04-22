package androidx.appcompat.widget;

import androidx.core.widget.ContentLoadingProgressBar;
import c4.j;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.view.ads.AdActivity;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.offline.OfflineVideoPlayerActivity;
import com.google.android.exoplayer2.ui.PlayerControlView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1072c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f1073f;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f1072c = i10;
        this.f1073f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1072c) {
            case 0:
                ((Toolbar) this.f1073f).o();
                return;
            case 1:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this.f1073f;
                int i10 = ContentLoadingProgressBar.f1881j;
                Objects.requireNonNull(contentLoadingProgressBar);
                System.currentTimeMillis();
                contentLoadingProgressBar.setVisibility(0);
                return;
            case 2:
                ((AdActivity) this.f1073f).M.setVisibility(4);
                return;
            case 3:
                ((BrowserActivity) this.f1073f).J.setVisibility(4);
                return;
            case 4:
                ((j.c) this.f1073f).a(true, false);
                return;
            case 5:
                GifDetailsActivity gifDetailsActivity = ((GifDetailsActivity.b) this.f1073f).f4997c;
                int i11 = GifDetailsActivity.U;
                gifDetailsActivity.J(false);
                return;
            case 6:
                HomeActivity this$0 = (HomeActivity) this.f1073f;
                int i12 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ActivityHomeBinding activityHomeBinding = this$0.K;
                if (activityHomeBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityHomeBinding = null;
                }
                activityHomeBinding.f4398k.l0(0);
                return;
            case 7:
                ((m4.a) this.f1073f).f12890t0.n(true);
                return;
            case 8:
                OfflineVideoPlayerActivity.D(((OfflineVideoPlayerActivity.a) this.f1073f).f5405c, false);
                return;
            case 9:
                r6.k kVar = (r6.k) this.f1073f;
                kVar.d.c(new r6.h(kVar, 2));
                return;
            case 10:
                ((x6.b0) this.f1073f).f17959t.c();
                return;
            default:
                int i13 = PlayerControlView.f6466u0;
                ((PlayerControlView) this.f1073f).l();
                return;
        }
    }
}
