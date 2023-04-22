package u1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* loaded from: classes2.dex */
public class o extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p.a f15497a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transition f15498b;

    public o(Transition transition, p.a aVar) {
        this.f15498b = transition;
        this.f15497a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f15497a.remove(animator);
        this.f15498b.D.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f15498b.D.add(animator);
    }
}
