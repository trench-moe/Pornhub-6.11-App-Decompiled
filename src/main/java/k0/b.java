package k0;

import android.widget.Toast;
import androidx.core.splashscreen.SplashScreenViewProvider;
import com.app.pornhub.service.VideoDlService;
import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.videolistings.VideoListingsFragment;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.drm.c;
import java.util.Map;
import java.util.Objects;
import k8.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l8.r;
import l8.s;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11738c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f11739f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f11740j;

    public /* synthetic */ b(Object obj, Object obj2, int i10) {
        this.f11738c = i10;
        this.f11739f = obj;
        this.f11740j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11738c) {
            case 0:
                h finalListener = (h) this.f11739f;
                SplashScreenViewProvider splashScreenViewProvider = (SplashScreenViewProvider) this.f11740j;
                Intrinsics.checkNotNullParameter(finalListener, "$finalListener");
                Intrinsics.checkNotNullParameter(splashScreenViewProvider, "$splashScreenViewProvider");
                ((c) finalListener).i(splashScreenViewProvider);
                return;
            case 1:
                VideoDlService videoDlService = (VideoDlService) this.f11739f;
                int i10 = VideoDlService.C;
                Objects.requireNonNull(videoDlService);
                Toast.makeText(videoDlService, (String) this.f11740j, 0).show();
                return;
            case 2:
                NotifyingLinearLayoutManager layoutManager = (NotifyingLinearLayoutManager) this.f11739f;
                VideoListingsFragment this$0 = (VideoListingsFragment) this.f11740j;
                KProperty<Object>[] kPropertyArr = VideoListingsFragment.f5332v0;
                Intrinsics.checkNotNullParameter(layoutManager, "$layoutManager");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                layoutManager.m0(this$0.f5338u0);
                return;
            case 3:
                com.google.android.exoplayer2.audio.a aVar = ((a.C0078a) this.f11739f).f5990b;
                int i11 = c0.f11939a;
                aVar.x((String) this.f11740j);
                return;
            case 4:
                com.google.android.exoplayer2.audio.a aVar2 = ((a.C0078a) this.f11739f).f5990b;
                int i12 = c0.f11939a;
                aVar2.Q((Exception) this.f11740j);
                return;
            case 5:
                c.a aVar3 = (c.a) this.f11739f;
                ((com.google.android.exoplayer2.drm.c) this.f11740j).I(aVar3.f6181a, aVar3.f6182b);
                return;
            case 6:
                r rVar = ((r.a) this.f11739f).f12741b;
                int i13 = c0.f11939a;
                rVar.b((s) this.f11740j);
                return;
            default:
                ((kc.b) ((Map.Entry) this.f11739f).getKey()).a((kc.a) this.f11740j);
                return;
        }
    }
}
