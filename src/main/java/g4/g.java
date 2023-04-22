package g4;

import android.util.Log;
import androidx.core.widget.NestedScrollView;
import com.app.pornhub.view.home.HomeActivity;
import com.google.android.exoplayer2.source.l;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import k8.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mc.a;
import s6.s;
import vb.b0;
import w6.n0;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements k0.g, NestedScrollView.b, s.d, m.a, l.a, a.InterfaceC0215a, ea.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9736c;

    public /* synthetic */ g(Object obj) {
        this.f9736c = obj;
    }

    @Override // androidx.core.widget.NestedScrollView.b
    public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        com.app.pornhub.view.videodetails.c cVar = (com.app.pornhub.view.videodetails.c) this.f9736c;
        int i14 = com.app.pornhub.view.videodetails.c.C0;
        Objects.requireNonNull(cVar);
        if (i11 == nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) {
            if (cVar.f5598t0.d() != null && !cVar.w0) {
                kf.a.f12078a.a("Scrolled to bottom", new Object[0]);
                t3.g.o(cVar.q(), "phapp_video_scroll_to_bottom", cVar.f5598t0.d().getVkey(), "info", null);
            }
            cVar.w0 = true;
        }
    }

    @Override // mc.a.InterfaceC0215a
    public void b(mc.b bVar) {
        sb.c cVar = (sb.c) this.f9736c;
        Objects.requireNonNull(cVar);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        cVar.f14943b.set((sb.a) bVar.get());
    }

    @Override // ea.a
    public Object f(ea.g gVar) {
        ea.h hVar = (ea.h) this.f9736c;
        ExecutorService executorService = b0.f16121a;
        if (gVar.m()) {
            hVar.b(gVar.j());
        } else {
            Exception i10 = gVar.i();
            Objects.requireNonNull(i10);
            hVar.a(i10);
        }
        return null;
    }

    @Override // k0.g
    public boolean g() {
        Ref.ObjectRef updateState = (Ref.ObjectRef) this.f9736c;
        int i10 = HomeActivity.f4998a0;
        Intrinsics.checkNotNullParameter(updateState, "$updateState");
        return updateState.element == 0;
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        ((n0.c) obj).P(((w6.u) this.f9736c).B);
    }
}
