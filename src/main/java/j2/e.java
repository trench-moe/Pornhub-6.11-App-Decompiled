package j2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b2.l;
import b2.q;
import com.airbnb.lottie.model.layer.Layer;
import e2.o;

/* loaded from: classes2.dex */
public class e extends com.airbnb.lottie.model.layer.a {
    public final Paint A;
    public final float[] B;
    public final Path C;
    public final Layer D;
    public e2.a<ColorFilter, ColorFilter> E;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f11367z;

    public e(l lVar, Layer layer) {
        super(lVar, layer);
        this.f11367z = new RectF();
        c2.a aVar = new c2.a();
        this.A = aVar;
        this.B = new float[8];
        this.C = new Path();
        this.D = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.f4199l);
    }

    @Override // com.airbnb.lottie.model.layer.a, d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        RectF rectF2 = this.f11367z;
        Layer layer = this.D;
        rectF2.set(0.0f, 0.0f, layer.f4197j, layer.f4198k);
        this.f4227m.mapRect(this.f11367z);
        rectF.set(this.f11367z);
    }

    @Override // com.airbnb.lottie.model.layer.a, g2.e
    public <T> void h(T t2, n2.c cVar) {
        this.f4235v.c(t2, cVar);
        if (t2 == q.E) {
            if (cVar == null) {
                this.E = null;
                return;
            }
            this.E = new o(cVar, null);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void k(Canvas canvas, Matrix matrix, int i10) {
        int alpha = Color.alpha(this.D.f4199l);
        if (alpha == 0) {
            return;
        }
        e2.a<Integer, Integer> aVar = this.f4235v.f9030j;
        int intValue = (int) ((((alpha / 255.0f) * (aVar == null ? 100 : aVar.e().intValue())) / 100.0f) * (i10 / 255.0f) * 255.0f);
        this.A.setAlpha(intValue);
        e2.a<ColorFilter, ColorFilter> aVar2 = this.E;
        if (aVar2 != null) {
            this.A.setColorFilter(aVar2.e());
        }
        if (intValue > 0) {
            float[] fArr = this.B;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Layer layer = this.D;
            int i11 = layer.f4197j;
            fArr[2] = i11;
            fArr[3] = 0.0f;
            fArr[4] = i11;
            int i12 = layer.f4198k;
            fArr[5] = i12;
            fArr[6] = 0.0f;
            fArr[7] = i12;
            matrix.mapPoints(fArr);
            this.C.reset();
            Path path = this.C;
            float[] fArr2 = this.B;
            path.moveTo(fArr2[0], fArr2[1]);
            Path path2 = this.C;
            float[] fArr3 = this.B;
            path2.lineTo(fArr3[2], fArr3[3]);
            Path path3 = this.C;
            float[] fArr4 = this.B;
            path3.lineTo(fArr4[4], fArr4[5]);
            Path path4 = this.C;
            float[] fArr5 = this.B;
            path4.lineTo(fArr5[6], fArr5[7]);
            Path path5 = this.C;
            float[] fArr6 = this.B;
            path5.lineTo(fArr6[0], fArr6[1]);
            this.C.close();
            canvas.drawPath(this.C, this.A);
        }
    }
}
