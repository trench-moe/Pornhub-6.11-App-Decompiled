package u;

import androidx.constraintlayout.helper.widget.Carousel;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import j1.l;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15461c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f15462f;

    public /* synthetic */ a(Object obj, int i10) {
        this.f15461c = i10;
        this.f15462f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15461c) {
            case 0:
                Carousel carousel = (Carousel) this.f15462f;
                carousel.G.setTransitionDuration(carousel.T);
                if (carousel.S < carousel.F) {
                    carousel.G.Q(carousel.L, carousel.T);
                    return;
                } else {
                    carousel.G.Q(carousel.M, carousel.T);
                    return;
                }
            case 1:
                ((l.g) this.f15462f).b();
                return;
            case 2:
                ((DefaultDrmSession) this.f15462f).b(null);
                return;
            case 3:
                Map<String, String> map = m.f6351c0;
                ((m) this.f15462f).x();
                return;
            case 4:
                int i10 = StyledPlayerControlView.Q0;
                ((StyledPlayerControlView) this.f15462f).q();
                return;
            default:
                ((com.google.android.exoplayer2.ui.l) this.f15462f).n.start();
                return;
        }
    }
}
