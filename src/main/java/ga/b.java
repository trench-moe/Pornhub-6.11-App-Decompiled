package ga;

import android.animation.TypeEvaluator;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class b implements TypeEvaluator<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9890a = new b();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public Integer evaluate(float f10, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f11 = ((intValue >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float b10 = a0.a.b(((intValue2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, f11, f10, f11);
        float b11 = a0.a.b(pow4, pow, f10, pow);
        float b12 = a0.a.b((float) Math.pow(((intValue2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d), pow2, f10, pow2);
        float b13 = a0.a.b((float) Math.pow((intValue2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d), pow3, f10, pow3);
        int round = Math.round(((float) Math.pow(b11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(b13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(b10 * 255.0f) << 24) | (Math.round(((float) Math.pow(b12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
