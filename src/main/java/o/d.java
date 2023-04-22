package o;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static final double f13475a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z10) {
        if (z10) {
            return (float) (((1.0d - f13475a) * f11) + f10);
        }
        return f10;
    }

    public static float b(float f10, float f11, boolean z10) {
        if (z10) {
            return (float) (((1.0d - f13475a) * f11) + (f10 * 1.5f));
        }
        return f10 * 1.5f;
    }
}
