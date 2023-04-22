package g4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.core.splashscreen.SplashScreenViewProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreenViewProvider f9760a;

    public u(SplashScreenViewProvider splashScreenViewProvider) {
        this.f9760a = splashScreenViewProvider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f9760a.f1877a.c();
    }
}
