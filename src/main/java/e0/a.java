package e0;

import android.graphics.Color;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<double[]> f8965a = new ThreadLocal<>();

    public static void a(int i10, int i11, int i12, float[] fArr) {
        float a10;
        float abs;
        float f10 = i10 / 255.0f;
        float f11 = i11 / 255.0f;
        float f12 = i12 / 255.0f;
        float max = Math.max(f10, Math.max(f11, f12));
        float min = Math.min(f10, Math.min(f11, f12));
        float f13 = max - min;
        float f14 = (max + min) / 2.0f;
        if (max == min) {
            a10 = 0.0f;
            abs = 0.0f;
        } else {
            a10 = max == f10 ? ((f11 - f12) / f13) % 6.0f : max == f11 ? a1.a.a(f12, f10, f13, 2.0f) : a1.a.a(f10, f11, f13, 4.0f);
            abs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (a10 * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = h(f15, 0.0f, 360.0f);
        fArr[1] = h(abs, 0.0f, 1.0f);
        fArr[2] = h(f14, 0.0f, 1.0f);
    }

    public static int b(double d, double d10, double d11) {
        double d12 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d))) / 100.0d;
        double d13 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d))) / 100.0d;
        double d14 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d))) / 100.0d;
        return Color.rgb(i((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), i((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), i((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static double c(int i10, int i11) {
        if (Color.alpha(i11) != 255) {
            StringBuilder m10 = a1.a.m("background can not be translucent: #");
            m10.append(Integer.toHexString(i11));
            throw new IllegalArgumentException(m10.toString());
        }
        if (Color.alpha(i10) < 255) {
            i10 = f(i10, i11);
        }
        double d = d(i10) + 0.05d;
        double d10 = d(i11) + 0.05d;
        return Math.max(d, d10) / Math.min(d, d10);
    }

    public static double d(int i10) {
        ThreadLocal<double[]> threadLocal = f8965a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        if (dArr.length == 3) {
            double d = red / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d10 = green / 255.0d;
            double pow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            double d11 = blue / 255.0d;
            double pow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int e(int i10, int i11, float f10) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            StringBuilder m10 = a1.a.m("background can not be translucent: #");
            m10.append(Integer.toHexString(i11));
            throw new IllegalArgumentException(m10.toString());
        }
        double d = f10;
        if (c(j(i10, KotlinVersion.MAX_COMPONENT_VALUE), i11) < d) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (c(j(i10, i15), i11) < d) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    public static int f(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - alpha2) * (255 - alpha)) / KotlinVersion.MAX_COMPONENT_VALUE);
        return Color.argb(i12, g(Color.red(i10), alpha2, Color.red(i11), alpha, i12), g(Color.green(i10), alpha2, Color.green(i11), alpha, i12), g(Color.blue(i10), alpha2, Color.blue(i11), alpha, i12));
    }

    public static int g(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((255 - i11) * (i12 * i13)) + ((i10 * KotlinVersion.MAX_COMPONENT_VALUE) * i11)) / (i14 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static float h(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    public static int i(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static int j(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
