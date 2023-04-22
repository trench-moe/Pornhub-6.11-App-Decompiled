package j1;

import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.quickseek.QuickSeekFrameLayout;
import com.google.android.exoplayer2.source.h;
import e4.b;
import j1.l;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11356c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f11357f;

    public /* synthetic */ p(Object obj, int i10) {
        this.f11356c = i10;
        this.f11357f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11356c) {
            case 0:
                ((l.g) this.f11357f).b();
                return;
            case 1:
                ((b.e) this.f11357f).a(true);
                return;
            case 2:
                HomeActivity this$0 = (HomeActivity) this.f11357f;
                int i10 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.R();
                return;
            case 3:
                QuickSeekFrameLayout.a this$02 = (QuickSeekFrameLayout.a) this.f11357f;
                int i11 = QuickSeekFrameLayout.a.f5455u;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.n = false;
                c5.a aVar = this$02.f5459m;
                if (aVar == null) {
                    return;
                }
                aVar.a();
                return;
            case 4:
                com.google.android.exoplayer2.source.m mVar = (com.google.android.exoplayer2.source.m) this.f11357f;
                if (mVar.f6354b0) {
                    return;
                }
                h.a aVar2 = mVar.G;
                Objects.requireNonNull(aVar2);
                aVar2.f(mVar);
                return;
            default:
                ((com.google.android.exoplayer2.ui.l) this.f11357f).f6635m.start();
                return;
        }
    }
}
