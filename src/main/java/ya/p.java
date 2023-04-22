package ya;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public class p extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f18612a;

    public p(q qVar) {
        this.f18612a = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        q qVar = this.f18612a;
        qVar.f18616g = (qVar.f18616g + 1) % qVar.f18615f.f18576c.length;
        qVar.f18617h = true;
    }
}
