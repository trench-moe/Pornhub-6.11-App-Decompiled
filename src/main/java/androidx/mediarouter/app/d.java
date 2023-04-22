package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import j1.l;
import java.util.Set;

/* loaded from: classes.dex */
public class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f2486c;

    public d(f fVar) {
        this.f2486c = fVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f2486c.Q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        f fVar = this.f2486c;
        Set<l.i> set = fVar.T;
        if (set == null || set.size() == 0) {
            fVar.j(true);
        } else {
            e eVar = new e(fVar);
            int firstVisiblePosition = fVar.Q.getFirstVisiblePosition();
            boolean z10 = false;
            for (int i10 = 0; i10 < fVar.Q.getChildCount(); i10++) {
                View childAt = fVar.Q.getChildAt(i10);
                if (fVar.T.contains(fVar.R.getItem(firstVisiblePosition + i10))) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(fVar.f2511u0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    if (!z10) {
                        alphaAnimation.setAnimationListener(eVar);
                        z10 = true;
                    }
                    childAt.clearAnimation();
                    childAt.startAnimation(alphaAnimation);
                }
            }
        }
    }
}
