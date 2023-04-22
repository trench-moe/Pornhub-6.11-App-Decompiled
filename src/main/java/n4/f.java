package n4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.app.pornhub.view.home.explore.ExploreFragment;

/* loaded from: classes2.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExploreFragment f13296a;

    public f(ExploreFragment exploreFragment) {
        this.f13296a = exploreFragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ValueAnimator valueAnimator = this.f13296a.f5163x0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        this.f13296a.f5163x0 = null;
    }
}
