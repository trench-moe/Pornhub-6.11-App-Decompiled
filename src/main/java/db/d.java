package db;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f8891b;

    public d(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f8891b = baseTransientBottomBar;
        this.f8890a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f8891b.d(this.f8890a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f8891b.d;
        snackbarContentLayout.f7663c.setAlpha(1.0f);
        long j10 = 180;
        long j11 = 0;
        snackbarContentLayout.f7663c.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        if (snackbarContentLayout.f7664f.getVisibility() == 0) {
            snackbarContentLayout.f7664f.setAlpha(1.0f);
            snackbarContentLayout.f7664f.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }
}
