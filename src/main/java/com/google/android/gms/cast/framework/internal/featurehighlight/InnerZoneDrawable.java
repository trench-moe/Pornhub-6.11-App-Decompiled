package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
class InnerZoneDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f6813a;

    /* renamed from: b  reason: collision with root package name */
    public float f6814b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f6814b > 0.0f) {
            throw null;
        }
        canvas.drawCircle(0.0f, 0.0f, this.f6813a * 0.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Keep
    public void setPulseAlpha(float f10) {
        this.f6814b = f10;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f10) {
        invalidateSelf();
    }

    @Keep
    public void setScale(float f10) {
        this.f6813a = f10;
        invalidateSelf();
    }
}
