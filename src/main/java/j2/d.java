package j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import b2.l;
import com.airbnb.lottie.model.layer.Layer;
import i2.i;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends com.airbnb.lottie.model.layer.a {

    /* renamed from: z  reason: collision with root package name */
    public final d2.d f11366z;

    public d(l lVar, Layer layer) {
        super(lVar, layer);
        d2.d dVar = new d2.d(lVar, this, new i("__container", layer.f4189a, false));
        this.f11366z = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.a, d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        this.f11366z.d(rectF, this.f4227m, z10);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void k(Canvas canvas, Matrix matrix, int i10) {
        this.f11366z.f(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void o(g2.d dVar, int i10, List<g2.d> list, g2.d dVar2) {
        this.f11366z.c(dVar, i10, list, dVar2);
    }
}
