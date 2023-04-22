package j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import b2.l;
import com.airbnb.lottie.model.layer.Layer;

/* loaded from: classes2.dex */
public class c extends com.airbnb.lottie.model.layer.a {
    public c(l lVar, Layer layer) {
        super(lVar, layer);
    }

    @Override // com.airbnb.lottie.model.layer.a, d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void k(Canvas canvas, Matrix matrix, int i10) {
    }
}
