package g4;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.view.home.HomeActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeActivity f9741a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f9742b;

    public /* synthetic */ j(HomeActivity homeActivity, ValueAnimator valueAnimator) {
        this.f9741a = homeActivity;
        this.f9742b = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        HomeActivity this$0 = this.f9741a;
        ValueAnimator this_apply = this.f9742b;
        int i10 = HomeActivity.f4998a0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        ActivityHomeBinding activityHomeBinding = this$0.K;
        if (activityHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding = null;
        }
        FrameLayout frameLayout = activityHomeBinding.f4396i;
        Object animatedValue = this_apply.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        frameLayout.setAlpha(((Float) animatedValue).floatValue());
    }
}
