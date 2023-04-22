package m2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<PathMeasure> f12877a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<Path> f12878b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<Path> f12879c = new c();
    public static final ThreadLocal<float[]> d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final float f12880e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: f  reason: collision with root package name */
    public static float f12881f = -1.0f;

    /* loaded from: classes2.dex */
    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public Path initialValue() {
            return new Path();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public Path initialValue() {
            return new Path();
        }
    }

    /* loaded from: classes2.dex */
    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f10, float f11, float f12) {
        PathMeasure pathMeasure = f12877a.get();
        Path path2 = f12878b.get();
        Path path3 = f12879c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            f1.a.b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || Math.abs((f11 - f10) - 1.0f) < 0.01d) {
            f1.a.b("applyTrimPathIfNeeded");
        } else {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = f.d(min, length);
                max = f.d(max, length);
            }
            if (min < 0.0f) {
                min = f.d(min, length);
            }
            if (max < 0.0f) {
                max = f.d(max, length);
            }
            int i10 = (min > max ? 1 : (min == max ? 0 : -1));
            if (i10 == 0) {
                path.reset();
                f1.a.b("applyTrimPathIfNeeded");
                return;
            }
            if (i10 >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            f1.a.b("applyTrimPathIfNeeded");
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        if (f12881f == -1.0f) {
            f12881f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f12881f;
    }

    public static float d(Matrix matrix) {
        float[] fArr = d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f12880e;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static Bitmap e(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void f(Canvas canvas, RectF rectF, Paint paint, int i10) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i10);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        f1.a.b("Utils#saveLayer");
    }
}
