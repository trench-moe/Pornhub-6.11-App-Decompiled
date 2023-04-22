package ya;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public class r extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f18619a;

    public r(t tVar) {
        this.f18619a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        t tVar = this.f18619a;
        tVar.f18626h = (tVar.f18626h + 1) % tVar.f18625g.f18576c.length;
        tVar.f18627i = true;
    }
}
