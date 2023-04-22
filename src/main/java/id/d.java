package id;

import kotlin.ranges.RangesKt;

/* loaded from: classes2.dex */
public final class d {
    public final float a(float f10, float f11) {
        float coerceAtMost = RangesKt.coerceAtMost(1.0f, Math.abs(f10 / f11));
        double coerceAtLeast = RangesKt.coerceAtLeast(0.0f, RangesKt.coerceAtMost(Math.abs(f10) - f11, f11 * 2.0f) / f11) / 4;
        return (int) ((f11 * coerceAtMost) + (((float) (coerceAtLeast - Math.pow(coerceAtLeast, 2.0d))) * 2.0f * f11 * 2));
    }
}
