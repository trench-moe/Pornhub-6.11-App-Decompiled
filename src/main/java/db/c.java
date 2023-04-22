package db;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f8889a;

    public c(BaseTransientBottomBar baseTransientBottomBar) {
        this.f8889a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f8889a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f8889a.d;
        snackbarContentLayout.f7663c.setAlpha(0.0f);
        long j10 = 180;
        long j11 = 70;
        snackbarContentLayout.f7663c.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        if (snackbarContentLayout.f7664f.getVisibility() == 0) {
            snackbarContentLayout.f7664f.setAlpha(0.0f);
            snackbarContentLayout.f7664f.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }
}
