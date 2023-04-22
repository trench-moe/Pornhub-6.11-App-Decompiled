package ya;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import ya.c;

/* loaded from: classes2.dex */
public final class n<S extends c> extends k {
    public l<S> B;
    public m<ObjectAnimator> C;

    public n(Context context, c cVar, l<S> lVar, m<ObjectAnimator> mVar) {
        super(context, cVar);
        this.B = lVar;
        lVar.f18606b = this;
        this.C = mVar;
        mVar.f18607a = this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        l<S> lVar = this.B;
        float c10 = c();
        lVar.f18605a.a();
        lVar.a(canvas, c10);
        this.B.c(canvas, this.y);
        int i10 = 0;
        while (true) {
            m<ObjectAnimator> mVar = this.C;
            int[] iArr = mVar.f18609c;
            if (i10 >= iArr.length) {
                canvas.restore();
                return;
            }
            l<S> lVar2 = this.B;
            Paint paint = this.y;
            float[] fArr = mVar.f18608b;
            int i11 = i10 * 2;
            lVar2.b(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.B.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.B.e();
    }

    @Override // ya.k
    public boolean i(boolean z10, boolean z11, boolean z12) {
        boolean i10 = super.i(z10, z11, z12);
        if (!isRunning()) {
            this.C.a();
        }
        float a10 = this.f18599j.a(this.f18597c.getContentResolver());
        if (z10 && (z12 || (Build.VERSION.SDK_INT <= 21 && a10 > 0.0f))) {
            this.C.f();
        }
        return i10;
    }
}
