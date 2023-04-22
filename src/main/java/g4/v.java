package g4;

import android.animation.Animator;
import android.graphics.Color;
import android.view.View;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.view.home.HomeActivity;
import je.c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeActivity f9761a;

    public v(HomeActivity homeActivity) {
        this.f9761a = homeActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        HomeActivity homeActivity = this.f9761a;
        int i10 = je.c.f11705a;
        View view = new View(homeActivity);
        int i11 = je.c.f11705a;
        view.setTag(DvdsConfig.TYPE_CATEGORY);
        je.b bVar = new je.b();
        bVar.f11703c = 10;
        bVar.d = 2;
        bVar.f11704e = Color.argb(175, 0, 0, 0);
        ActivityHomeBinding activityHomeBinding = this.f9761a.K;
        ActivityHomeBinding activityHomeBinding2 = null;
        if (activityHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding = null;
        }
        c.a aVar = new c.a(homeActivity, activityHomeBinding.f4394g, bVar, false);
        ActivityHomeBinding activityHomeBinding3 = this.f9761a.K;
        if (activityHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding3 = null;
        }
        aVar.a(activityHomeBinding3.f4395h);
        ActivityHomeBinding activityHomeBinding4 = this.f9761a.K;
        if (activityHomeBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding4 = null;
        }
        activityHomeBinding4.f4396i.setAlpha(0.0f);
        ActivityHomeBinding activityHomeBinding5 = this.f9761a.K;
        if (activityHomeBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHomeBinding2 = activityHomeBinding5;
        }
        activityHomeBinding2.f4396i.setVisibility(0);
    }
}
