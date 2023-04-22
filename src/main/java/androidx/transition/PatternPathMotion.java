package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import d0.h;
import org.xmlpull.v1.XmlPullParser;
import u1.n;

/* loaded from: classes.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a  reason: collision with root package name */
    public final Path f3210a;

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f3211b;

    public PatternPathMotion() {
        Path path = new Path();
        this.f3210a = path;
        this.f3211b = new Matrix();
        path.lineTo(1.0f, 0.0f);
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f3210a = new Path();
        this.f3211b = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f15496i);
        try {
            String e10 = h.e(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (e10 == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            b(e0.d.d(e10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.transition.PathMotion
    public Path a(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
        double atan2 = Math.atan2(f15, f14);
        this.f3211b.setScale(sqrt, sqrt);
        this.f3211b.postRotate((float) Math.toDegrees(atan2));
        this.f3211b.postTranslate(f10, f11);
        Path path = new Path();
        this.f3210a.transform(this.f3211b, path);
        return path;
    }

    public void b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f3211b.setTranslate(-f12, -f13);
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float sqrt = 1.0f / ((float) Math.sqrt((f15 * f15) + (f14 * f14)));
        this.f3211b.postScale(sqrt, sqrt);
        this.f3211b.postRotate((float) Math.toDegrees(-Math.atan2(f15, f14)));
        path.transform(this.f3211b, this.f3210a);
    }
}
