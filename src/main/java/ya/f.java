package ya;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f18583a;

    public f(g gVar) {
        this.f18583a = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f18583a.a();
        g gVar = this.f18583a;
        v1.b bVar = gVar.f18594k;
        if (bVar != null) {
            bVar.a(gVar.f18607a);
        }
    }
}
