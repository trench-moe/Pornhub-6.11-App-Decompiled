package ya;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f18595a;

    public i(k kVar) {
        this.f18595a = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        k kVar = this.f18595a;
        List<v1.b> list = kVar.f18601t;
        if (list != null && !kVar.f18602u) {
            for (v1.b bVar : list) {
                Objects.requireNonNull(bVar);
            }
        }
    }
}
