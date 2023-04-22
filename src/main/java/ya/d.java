package ya;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* loaded from: classes2.dex */
public final class d extends l<CircularProgressIndicatorSpec> {

    /* renamed from: c  reason: collision with root package name */
    public int f18579c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f18580e;

    /* renamed from: f  reason: collision with root package name */
    public float f18581f;

    public d(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f18579c = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
        if (((com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r7.f18605a).f18577e == 1) goto L20;
     */
    @Override // ya.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.graphics.Canvas r8, float r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.d.a(android.graphics.Canvas, float):void");
    }

    @Override // ya.l
    public void b(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.d);
        float f12 = this.f18579c;
        float f13 = f10 * 360.0f * f12;
        float f14 = (f11 >= f10 ? f11 - f10 : (1.0f + f11) - f10) * 360.0f * f12;
        float f15 = this.f18581f;
        float f16 = -f15;
        canvas.drawArc(new RectF(f16, f16, f15, f15), f13, f14, false, paint);
        if (this.f18580e <= 0.0f || Math.abs(f14) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        f(canvas, paint, this.d, this.f18580e, f13);
        f(canvas, paint, this.d, this.f18580e, f13 + f14);
    }

    @Override // ya.l
    public void c(Canvas canvas, Paint paint) {
        int b10 = l9.e.b(((CircularProgressIndicatorSpec) this.f18605a).d, this.f18606b.f18604z);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(b10);
        paint.setStrokeWidth(this.d);
        float f10 = this.f18581f;
        float f11 = -f10;
        canvas.drawArc(new RectF(f11, f11, f10, f10), 0.0f, 360.0f, false, paint);
    }

    @Override // ya.l
    public int d() {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f18605a;
        return (circularProgressIndicatorSpec.f7583h * 2) + circularProgressIndicatorSpec.f7582g;
    }

    @Override // ya.l
    public int e() {
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f18605a;
        return (circularProgressIndicatorSpec.f7583h * 2) + circularProgressIndicatorSpec.f7582g;
    }

    public final void f(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        canvas.save();
        canvas.rotate(f12);
        float f13 = this.f18581f;
        float f14 = f10 / 2.0f;
        canvas.drawRoundRect(new RectF(f13 - f14, f11, f13 + f14, -f11), f11, f11, paint);
        canvas.restore();
    }
}
