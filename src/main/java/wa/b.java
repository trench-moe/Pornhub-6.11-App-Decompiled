package wa;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f17406a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f17407b;

    public b(a aVar, float f10) {
        this.f17407b = aVar;
        this.f17406a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f17407b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f17406a);
    }
}
