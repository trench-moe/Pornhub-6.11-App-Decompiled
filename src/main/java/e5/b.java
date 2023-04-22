package e5;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.app.pornhub.databinding.ActivityLockedPayVideoBinding;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LockedPayVideoActivity f9061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlphaAnimation f9062b;

    public b(LockedPayVideoActivity lockedPayVideoActivity, AlphaAnimation alphaAnimation) {
        this.f9061a = lockedPayVideoActivity;
        this.f9062b = alphaAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this.f9061a.N;
        if (activityLockedPayVideoBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding = null;
        }
        activityLockedPayVideoBinding.f4415u.startAnimation(this.f9062b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
