package hd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.app.pornhub.R;
import com.google.vrtoolkit.cardboard.Eye;

/* loaded from: classes2.dex */
public class e extends d {
    public final Bitmap W;
    public final int X;
    public float Y;
    public boolean Z;

    public e(Context context) {
        super(context);
        this.W = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_4444);
        this.Y = 32.0f;
        this.Z = false;
        this.Q = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.O = false;
        this.X = context.getResources().getColor(R.color.ph_orange) & 16777215;
    }

    @Override // hd.d, hd.b
    public void g(Eye eye) {
        synchronized (this) {
            if (this.Z) {
                r(this.W);
                this.Z = false;
            }
        }
        super.g(eye);
    }

    public void s(String str) {
        this.W.eraseColor(this.X);
        Canvas canvas = new Canvas(this.W);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(8.0f);
        paint.setColor(-1442840576);
        paint.setTextSize(this.Y);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, 128.0f, 128.0f, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.X | (-16777216));
        canvas.drawText(str, 128.0f, 128.0f, paint);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        float width = (rect.width() + 16.0f) * 0.00390625f;
        float height = (rect.height() + 16.0f) * 0.00390625f;
        this.D = width;
        p();
        this.E = height;
        p();
        float f10 = (1.0f - width) * 0.5f;
        q(f10, 0.53125f, width + f10, 0.53125f - height);
        synchronized (this) {
            this.Z = true;
        }
    }
}
