package s1;

import android.animation.ValueAnimator;
import s1.d;

/* loaded from: classes2.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.a f14778a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f14779b;

    public b(d dVar, d.a aVar) {
        this.f14779b = dVar;
        this.f14778a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f14779b.d(floatValue, this.f14778a);
        this.f14779b.a(floatValue, this.f14778a, false);
        this.f14779b.invalidateSelf();
    }
}
