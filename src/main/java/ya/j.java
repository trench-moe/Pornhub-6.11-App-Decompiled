package ya;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;

/* loaded from: classes2.dex */
public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f18596a;

    public j(k kVar) {
        this.f18596a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        k kVar = this.f18596a;
        List<v1.b> list = kVar.f18601t;
        if (list == null || kVar.f18602u) {
            return;
        }
        for (v1.b bVar : list) {
            bVar.a(kVar);
        }
    }
}
