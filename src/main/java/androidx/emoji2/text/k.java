package androidx.emoji2.text;

import androidx.emoji2.text.j;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import j1.e;
import kotlin.jvm.internal.Intrinsics;
import w6.w0;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1988c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f1989f;

    public /* synthetic */ k(Object obj, int i10) {
        this.f1988c = i10;
        this.f1989f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1988c) {
            case 0:
                ((j.b) this.f1989f).c();
                return;
            case 1:
                ((e.c) this.f1989f).n = -1;
                return;
            case 2:
                int i10 = d4.a.f8757y0;
                ((d4.a) this.f1989f).L0().p(true);
                return;
            case 3:
                HomeActivity this$0 = (HomeActivity) this.f1989f;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i11 = HomeActivity.f4998a0;
                this$0.R();
                return;
            case 4:
                VideoDetailsActivity.e eVar = (VideoDetailsActivity.e) this.f1989f;
                VideoDetailsActivity videoDetailsActivity = VideoDetailsActivity.this;
                videoDetailsActivity.g0((int) videoDetailsActivity.f5558s0.getCurrentPosition(), VideoDetailsActivity.this.Z);
                return;
            case 5:
                int i12 = w0.c.f16834b;
                ((w0) this.f1989f).d();
                return;
            case 6:
                DefaultDrmSessionManager.d dVar = (DefaultDrmSessionManager.d) this.f1989f;
                if (dVar.f6165j) {
                    return;
                }
                DrmSession drmSession = dVar.f6164f;
                if (drmSession != null) {
                    drmSession.b(dVar.f6163c);
                }
                dVar.f6166m.n.remove(dVar);
                dVar.f6165j = true;
                return;
            default:
                int i13 = DefaultTimeBar.f6449i0;
                ((DefaultTimeBar) this.f1989f).h(false);
                return;
        }
    }
}
