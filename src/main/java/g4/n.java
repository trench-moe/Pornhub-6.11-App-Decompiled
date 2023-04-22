package g4;

import android.util.Log;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import b4.d;
import com.app.pornhub.R;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.login.LoginActivity;
import com.app.pornhub.view.videodetails.LockedVideoActivity;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import k8.m;
import kotlin.jvm.internal.Intrinsics;
import l8.k;
import vb.b0;
import w6.l0;
import w6.n0;
import z6.f;
import z7.d;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Toolbar.e, o2.d, d.a, m.a, k8.e, MediaCodecUtil.f, f.a, k.a.InterfaceC0202a, ea.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9749c;

    public /* synthetic */ n(Object obj) {
        this.f9749c = obj;
    }

    @Override // o2.d
    public View a(int i10) {
        LockedVideoActivity lockedVideoActivity = (LockedVideoActivity) this.f9749c;
        int i11 = LockedVideoActivity.Q;
        View inflate = lockedVideoActivity.getLayoutInflater().inflate(R.layout.layout_combine_images_horizontal, (ViewGroup) lockedVideoActivity.M.f4421b, false);
        com.bumptech.glide.g f10 = com.bumptech.glide.b.f(lockedVideoActivity);
        t3.o oVar = t3.o.f15126a;
        int[] iArr = t3.o.f15127b;
        int i12 = i10 * 2;
        f10.n(Integer.valueOf(iArr[i12])).A((ImageView) inflate.findViewById(R.id.image1));
        com.bumptech.glide.b.f(lockedVideoActivity).n(Integer.valueOf(iArr[i12 + 1])).A((ImageView) inflate.findViewById(R.id.image2));
        return inflate;
    }

    @Override // k8.e
    public void accept(Object obj) {
        ((c.a) obj).e((Exception) this.f9749c);
    }

    @Override // z6.f.a
    public void b(z6.f fVar) {
        z7.d dVar = (z7.d) this.f9749c;
        d.c cVar = (d.c) fVar;
        Objects.requireNonNull(dVar);
        cVar.f21800c = 0;
        cVar.f18543j = null;
        dVar.f21909b.add(cVar);
    }

    @Override // b4.d.a
    public void c() {
        com.app.pornhub.view.videodetails.c cVar = (com.app.pornhub.view.videodetails.c) this.f9749c;
        int i10 = com.app.pornhub.view.videodetails.c.C0;
        cVar.I0(LoginActivity.C(cVar.q()));
        cVar.f5599u0.add(cVar.f5595q0.a(false).subscribe(new x2.m(cVar, 18)));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
    public int d(Object obj) {
        w6.y yVar = (w6.y) this.f9749c;
        com.google.android.exoplayer2.mediacodec.c cVar = (com.google.android.exoplayer2.mediacodec.c) obj;
        Pattern pattern = MediaCodecUtil.f6233a;
        try {
            return cVar.e(yVar) ? 1 : 0;
        } catch (MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }

    public void e(Display display) {
        l8.k kVar = (l8.k) this.f9749c;
        Objects.requireNonNull(kVar);
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            kVar.f12711j = refreshRate;
            kVar.f12712k = (refreshRate * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        kVar.f12711j = -9223372036854775807L;
        kVar.f12712k = -9223372036854775807L;
    }

    @Override // ea.a
    public Object f(ea.g gVar) {
        ExecutorService executorService = b0.f16121a;
        ((CountDownLatch) this.f9749c).countDown();
        return null;
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        l0 l0Var = (l0) this.f9749c;
        n0.c cVar = (n0.c) obj;
        cVar.f(l0Var.f16664g);
        cVar.m(l0Var.f16664g);
    }

    @Override // androidx.appcompat.widget.Toolbar.e
    public boolean onMenuItemClick(MenuItem menuItem) {
        HomeActivity this$0 = (HomeActivity) this.f9749c;
        int i10 = HomeActivity.f4998a0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() == R.id.home_menu_item_user) {
            t3.g.l(this$0, "my_profile");
            NavigationViewModel navigationViewModel = this$0.N;
            if (navigationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                navigationViewModel = null;
            }
            navigationViewModel.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(new androidx.navigation.a(R.id.action_global_accountFragment)));
            navigationViewModel.c();
        }
        return false;
    }
}
