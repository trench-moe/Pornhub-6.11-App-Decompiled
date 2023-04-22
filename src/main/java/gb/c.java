package gb;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.a f9905a;

    public c(com.google.android.material.textfield.a aVar) {
        this.f9905a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9905a.f9914c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
