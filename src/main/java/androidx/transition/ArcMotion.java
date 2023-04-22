package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import d0.h;
import org.xmlpull.v1.XmlPullParser;
import u1.n;

/* loaded from: classes.dex */
public class ArcMotion extends PathMotion {
    public static final float d = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a  reason: collision with root package name */
    public float f3174a;

    /* renamed from: b  reason: collision with root package name */
    public float f3175b;

    /* renamed from: c  reason: collision with root package name */
    public float f3176c;

    public ArcMotion() {
        this.f3174a = 0.0f;
        this.f3175b = 0.0f;
        this.f3176c = d;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3174a = 0.0f;
        this.f3175b = 0.0f;
        this.f3176c = d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f15495h);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f3175b = b(h.c(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        this.f3174a = b(h.f(xmlPullParser, "minimumHorizontalAngle") ? obtainStyledAttributes.getFloat(0, 0.0f) : 0.0f);
        this.f3176c = b(h.f(xmlPullParser, "maximumAngle") ? obtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        obtainStyledAttributes.recycle();
    }

    public static float b(float f10) {
        if (f10 < 0.0f || f10 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f10 / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public Path a(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        Path path = new Path();
        path.moveTo(f10, f11);
        float f17 = f12 - f10;
        float f18 = f13 - f11;
        float f19 = (f18 * f18) + (f17 * f17);
        float f20 = (f10 + f12) / 2.0f;
        float f21 = (f11 + f13) / 2.0f;
        float f22 = 0.25f * f19;
        boolean z10 = f11 > f13;
        if (Math.abs(f17) < Math.abs(f18)) {
            float abs = Math.abs(f19 / (f18 * 2.0f));
            if (z10) {
                f15 = abs + f13;
                f14 = f12;
            } else {
                f15 = abs + f11;
                f14 = f10;
            }
            f16 = this.f3175b;
        } else {
            float f23 = f19 / (f17 * 2.0f);
            if (z10) {
                f15 = f11;
                f14 = f23 + f10;
            } else {
                f14 = f12 - f23;
                f15 = f13;
            }
            f16 = this.f3174a;
        }
        float f24 = f22 * f16 * f16;
        float f25 = f20 - f14;
        float f26 = f21 - f15;
        float f27 = (f26 * f26) + (f25 * f25);
        float f28 = this.f3176c;
        float f29 = f22 * f28 * f28;
        if (f27 >= f24) {
            f24 = f27 > f29 ? f29 : 0.0f;
        }
        if (f24 != 0.0f) {
            float sqrt = (float) Math.sqrt(f24 / f27);
            f14 = a0.a.b(f14, f20, sqrt, f20);
            f15 = a0.a.b(f15, f21, sqrt, f21);
        }
        path.cubicTo((f10 + f14) / 2.0f, (f11 + f15) / 2.0f, (f14 + f12) / 2.0f, (f15 + f13) / 2.0f, f12, f13);
        return path;
    }
}
