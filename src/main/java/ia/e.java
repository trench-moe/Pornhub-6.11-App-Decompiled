package ia;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes2.dex */
public class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f10684a;

    public e(BottomAppBar bottomAppBar) {
        this.f10684a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        float fabTranslationX;
        this.f10684a.D0.onAnimationStart(animator);
        FloatingActionButton D = this.f10684a.D();
        if (D != null) {
            fabTranslationX = this.f10684a.getFabTranslationX();
            D.setTranslationX(fabTranslationX);
        }
    }
}
