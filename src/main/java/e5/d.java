package e5;

import android.view.animation.Animation;
import com.app.pornhub.databinding.ActivityLockedPayVideoBinding;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LockedPayVideoActivity f9068a;

    public d(LockedPayVideoActivity lockedPayVideoActivity) {
        this.f9068a = lockedPayVideoActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this.f9068a.N;
        if (activityLockedPayVideoBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding = null;
        }
        activityLockedPayVideoBinding.n.setEnabled(true);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this.f9068a.N;
        if (activityLockedPayVideoBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding = null;
        }
        activityLockedPayVideoBinding.f4415u.setVisibility(0);
    }
}
