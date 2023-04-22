package ya;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* loaded from: classes2.dex */
public final class o extends l<LinearProgressIndicatorSpec> {

    /* renamed from: c  reason: collision with root package name */
    public float f18610c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f18611e;

    public o(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f18610c = 300.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
        if (((com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r9.f18605a).f18578f == 2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    @Override // ya.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.graphics.Canvas r10, float r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.o.a(android.graphics.Canvas, float):void");
    }

    @Override // ya.l
    public void b(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (f10 == f11) {
            return;
        }
        float f12 = this.f18610c;
        float f13 = (-f12) / 2.0f;
        float f14 = this.f18611e * 2.0f;
        float f15 = f12 - f14;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        float f16 = this.d;
        RectF rectF = new RectF((f10 * f15) + f13, (-f16) / 2.0f, f14 + (f15 * f11) + f13, f16 / 2.0f);
        float f17 = this.f18611e;
        canvas.drawRoundRect(rectF, f17, f17, paint);
    }

    @Override // ya.l
    public void c(Canvas canvas, Paint paint) {
        int b10 = l9.e.b(((LinearProgressIndicatorSpec) this.f18605a).d, this.f18606b.f18604z);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(b10);
        float f10 = this.f18610c;
        float f11 = this.d;
        RectF rectF = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
        float f12 = this.f18611e;
        canvas.drawRoundRect(rectF, f12, f12, paint);
    }

    @Override // ya.l
    public int d() {
        return ((LinearProgressIndicatorSpec) this.f18605a).f18574a;
    }

    @Override // ya.l
    public int e() {
        return -1;
    }
}
