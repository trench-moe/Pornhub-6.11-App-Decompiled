package e5;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.app.pornhub.databinding.ActivityLockedPayVideoBinding;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LockedPayVideoActivity f9070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TranslateAnimation f9071b;

    public e(LockedPayVideoActivity lockedPayVideoActivity, TranslateAnimation translateAnimation) {
        this.f9070a = lockedPayVideoActivity;
        this.f9071b = translateAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this.f9070a.N;
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding2 = null;
        if (activityLockedPayVideoBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding = null;
        }
        activityLockedPayVideoBinding.f4415u.setVisibility(4);
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding3 = this.f9070a.N;
        if (activityLockedPayVideoBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityLockedPayVideoBinding2 = activityLockedPayVideoBinding3;
        }
        activityLockedPayVideoBinding2.f4416v.startAnimation(this.f9071b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
