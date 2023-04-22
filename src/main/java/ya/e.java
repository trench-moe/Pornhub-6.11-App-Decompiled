package ya;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f18582a;

    public e(g gVar) {
        this.f18582a = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        g gVar = this.f18582a;
        gVar.f18591h = (gVar.f18591h + 4) % gVar.f18590g.f18576c.length;
    }
}
