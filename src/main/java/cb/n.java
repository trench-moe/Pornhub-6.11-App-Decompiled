package cb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class n {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f3996a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f3997b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f3998c;
    @Deprecated
    public float d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f3999e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f4000f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f4001g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f4002h = new ArrayList();

    /* loaded from: classes.dex */
    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public final c f4003b;

        public a(c cVar) {
            this.f4003b = cVar;
        }

        @Override // cb.n.f
        public void a(Matrix matrix, bb.a aVar, int i10, Canvas canvas) {
            c cVar = this.f4003b;
            float f10 = cVar.f4010f;
            float f11 = cVar.f4011g;
            c cVar2 = this.f4003b;
            RectF rectF = new RectF(cVar2.f4007b, cVar2.f4008c, cVar2.d, cVar2.f4009e);
            boolean z10 = f11 < 0.0f;
            Path path = aVar.f3635g;
            if (z10) {
                int[] iArr = bb.a.f3628k;
                iArr[0] = 0;
                iArr[1] = aVar.f3634f;
                iArr[2] = aVar.f3633e;
                iArr[3] = aVar.d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = -i10;
                rectF.inset(f12, f12);
                int[] iArr2 = bb.a.f3628k;
                iArr2[0] = 0;
                iArr2[1] = aVar.d;
                iArr2[2] = aVar.f3633e;
                iArr2[3] = aVar.f3634f;
            }
            float width = rectF.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f13 = 1.0f - (i10 / width);
            float a10 = a1.a.a(1.0f, f13, 2.0f, f13);
            float[] fArr = bb.a.f3629l;
            fArr[1] = f13;
            fArr[2] = a10;
            aVar.f3631b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, bb.a.f3628k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f3636h);
            }
            canvas.drawArc(rectF, f10, f11, true, aVar.f3631b);
            canvas.restore();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public final d f4004b;

        /* renamed from: c  reason: collision with root package name */
        public final float f4005c;
        public final float d;

        public b(d dVar, float f10, float f11) {
            this.f4004b = dVar;
            this.f4005c = f10;
            this.d = f11;
        }

        @Override // cb.n.f
        public void a(Matrix matrix, bb.a aVar, int i10, Canvas canvas) {
            d dVar = this.f4004b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(dVar.f4013c - this.d, dVar.f4012b - this.f4005c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4005c, this.d);
            matrix2.preRotate(b());
            Objects.requireNonNull(aVar);
            rectF.bottom += i10;
            rectF.offset(0.0f, -i10);
            int[] iArr = bb.a.f3626i;
            iArr[0] = aVar.f3634f;
            iArr[1] = aVar.f3633e;
            iArr[2] = aVar.d;
            Paint paint = aVar.f3632c;
            float f10 = rectF.left;
            paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, bb.a.f3627j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f3632c);
            canvas.restore();
        }

        public float b() {
            d dVar = this.f4004b;
            return (float) Math.toDegrees(Math.atan((dVar.f4013c - this.d) / (dVar.f4012b - this.f4005c)));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f4006h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f4007b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f4008c;
        @Deprecated
        public float d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f4009e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f4010f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f4011g;

        public c(float f10, float f11, float f12, float f13) {
            this.f4007b = f10;
            this.f4008c = f11;
            this.d = f12;
            this.f4009e = f13;
        }

        @Override // cb.n.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4014a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f4006h;
            rectF.set(this.f4007b, this.f4008c, this.d, this.f4009e);
            path.arcTo(rectF, this.f4010f, this.f4011g, false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f4012b;

        /* renamed from: c  reason: collision with root package name */
        public float f4013c;

        @Override // cb.n.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4014a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4012b, this.f4013c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f4014a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f4015a = new Matrix();

        public abstract void a(Matrix matrix, bb.a aVar, int i10, Canvas canvas);
    }

    public n() {
        e(0.0f, 0.0f);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        c cVar = new c(f10, f11, f12, f13);
        cVar.f4010f = f14;
        cVar.f4011g = f15;
        this.f4001g.add(cVar);
        a aVar = new a(cVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        float f17 = z10 ? (180.0f + f16) % 360.0f : f16;
        b(f14);
        this.f4002h.add(aVar);
        this.f3999e = f17;
        double d10 = f16;
        this.f3998c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f3999e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f3998c;
        float f14 = this.d;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f4010f = this.f3999e;
        cVar.f4011g = f12;
        this.f4002h.add(new a(cVar));
        this.f3999e = f10;
    }

    public void c(Matrix matrix, Path path) {
        int size = this.f4001g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4001g.get(i10).a(matrix, path);
        }
    }

    public void d(float f10, float f11) {
        d dVar = new d();
        dVar.f4012b = f10;
        dVar.f4013c = f11;
        this.f4001g.add(dVar);
        b bVar = new b(dVar, this.f3998c, this.d);
        b(bVar.b() + 270.0f);
        this.f4002h.add(bVar);
        this.f3999e = bVar.b() + 270.0f;
        this.f3998c = f10;
        this.d = f11;
    }

    public void e(float f10, float f11) {
        f(f10, f11, 270.0f, 0.0f);
    }

    public void f(float f10, float f11, float f12, float f13) {
        this.f3996a = f10;
        this.f3997b = f11;
        this.f3998c = f10;
        this.d = f11;
        this.f3999e = f12;
        this.f4000f = (f12 + f13) % 360.0f;
        this.f4001g.clear();
        this.f4002h.clear();
    }
}
