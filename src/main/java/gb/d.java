package gb;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.a f9906a;

    public d(com.google.android.material.textfield.a aVar) {
        this.f9906a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f9906a.f9914c.setScaleX(floatValue);
        this.f9906a.f9914c.setScaleY(floatValue);
    }
}
