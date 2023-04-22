package androidx.mediarouter.app;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;

/* loaded from: classes.dex */
public class h implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f2541a;

    public h(f fVar) {
        this.f2541a = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        OverlayListView overlayListView = this.f2541a.Q;
        for (OverlayListView.a aVar : overlayListView.f2458c) {
            if (!aVar.f2468k) {
                aVar.f2467j = overlayListView.getDrawingTime();
                aVar.f2468k = true;
            }
        }
        f fVar = this.f2541a;
        fVar.Q.postDelayed(fVar.A0, fVar.f2509t0);
    }
}
