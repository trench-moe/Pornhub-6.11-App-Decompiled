package j2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import b2.l;
import b2.q;
import com.airbnb.lottie.model.layer.Layer;
import e2.o;
import m2.g;

/* loaded from: classes2.dex */
public class b extends com.airbnb.lottie.model.layer.a {
    public final Rect A;
    public final Rect B;
    public e2.a<ColorFilter, ColorFilter> C;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f11365z;

    public b(l lVar, Layer layer) {
        super(lVar, layer);
        this.f11365z = new c2.a(3);
        this.A = new Rect();
        this.B = new Rect();
    }

    @Override // com.airbnb.lottie.model.layer.a, d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        Bitmap s10 = s();
        if (s10 != null) {
            rectF.set(0.0f, 0.0f, g.c() * s10.getWidth(), g.c() * s10.getHeight());
            this.f4227m.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, g2.e
    public <T> void h(T t2, n2.c cVar) {
        this.f4235v.c(t2, cVar);
        if (t2 == q.E) {
            if (cVar == null) {
                this.C = null;
            } else {
                this.C = new o(cVar, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void k(Canvas canvas, Matrix matrix, int i10) {
        Bitmap s10 = s();
        if (s10 != null) {
            if (s10.isRecycled()) {
                return;
            }
            float c10 = g.c();
            this.f11365z.setAlpha(i10);
            e2.a<ColorFilter, ColorFilter> aVar = this.C;
            if (aVar != null) {
                this.f11365z.setColorFilter(aVar.e());
            }
            canvas.save();
            canvas.concat(matrix);
            this.A.set(0, 0, s10.getWidth(), s10.getHeight());
            this.B.set(0, 0, (int) (s10.getWidth() * c10), (int) (s10.getHeight() * c10));
            canvas.drawBitmap(s10, this.A, this.B, this.f11365z);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap s() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.b.s():android.graphics.Bitmap");
    }
}
