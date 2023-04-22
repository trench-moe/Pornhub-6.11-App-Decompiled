package gb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.b f9911a;

    public j(com.google.android.material.textfield.b bVar) {
        this.f9911a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        com.google.android.material.textfield.b bVar = this.f9911a;
        bVar.f9914c.setChecked(bVar.f7811k);
        this.f9911a.f7816q.start();
    }
}
