package ya;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public class s extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f18620a;

    public s(t tVar) {
        this.f18620a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f18620a.a();
        t tVar = this.f18620a;
        v1.b bVar = tVar.f18629k;
        if (bVar != null) {
            bVar.a(tVar.f18607a);
        }
    }
}
