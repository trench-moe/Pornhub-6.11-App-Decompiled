package g4;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.view.home.HomeActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeActivity f9739a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f9740b;

    public /* synthetic */ i(HomeActivity homeActivity, ValueAnimator valueAnimator) {
        this.f9739a = homeActivity;
        this.f9740b = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        HomeActivity this$0 = this.f9739a;
        ValueAnimator this_apply = this.f9740b;
        int i10 = HomeActivity.f4998a0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        ActivityHomeBinding activityHomeBinding = this$0.K;
        if (activityHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding = null;
        }
        FrameLayout frameLayout = activityHomeBinding.d;
        Object animatedValue = this_apply.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        frameLayout.setAlpha(((Float) animatedValue).floatValue());
    }
}
