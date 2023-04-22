package ka;

import android.animation.ValueAnimator;
import cb.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f12039a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f12039a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.f12039a.f7215i;
        if (gVar != null) {
            gVar.s(floatValue);
        }
    }
}
