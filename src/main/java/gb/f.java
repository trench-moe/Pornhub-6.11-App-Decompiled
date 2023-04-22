package gb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
public class f extends cb.g {
    public final Paint P;
    public final RectF Q;
    public int R;

    public f() {
        this(null);
    }

    public f(cb.k kVar) {
        super(kVar == null ? new cb.k() : kVar);
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.Q = new RectF();
    }

    public void D(float f10, float f11, float f12, float f13) {
        RectF rectF = this.Q;
        if (f10 == rectF.left) {
            if (f11 == rectF.top) {
                if (f12 == rectF.right) {
                    if (f13 != rectF.bottom) {
                    }
                }
            }
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.R = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.R);
    }

    @Override // cb.g
    public void h(Canvas canvas) {
        if (this.Q.isEmpty()) {
            super.h(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.h(canvas2);
        canvas2.drawRect(this.Q, this.P);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }
}
