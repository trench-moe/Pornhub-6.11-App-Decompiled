package gb;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.b f9907a;

    public g(com.google.android.material.textfield.b bVar) {
        this.f9907a = bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9907a.f9914c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
