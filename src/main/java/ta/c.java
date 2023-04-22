package ta;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public class c implements TypeEvaluator<Float> {

    /* renamed from: a  reason: collision with root package name */
    public FloatEvaluator f15403a = new FloatEvaluator();

    public c(com.google.android.material.floatingactionbutton.e eVar) {
    }

    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f10, Float f11, Float f12) {
        float floatValue = this.f15403a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
