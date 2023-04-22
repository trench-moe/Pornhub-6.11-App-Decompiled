package k0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f11736a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f11737b;

    public a(Drawable drawable, float f10) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f11736a = drawable;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f10 / 2.0f, Path.Direction.CW);
        this.f11737b = path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.f11737b);
        this.f11736a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f11736a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect == null) {
            return;
        }
        this.f11736a.setBounds(rect);
        this.f11737b.offset(rect.exactCenterX(), rect.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f11736a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11736a.setColorFilter(colorFilter);
    }
}
