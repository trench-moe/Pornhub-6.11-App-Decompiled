package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
class OuterHighlightDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f6815a;

    /* renamed from: b  reason: collision with root package name */
    public float f6816b;

    /* renamed from: c  reason: collision with root package name */
    public float f6817c;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.f6816b + 0.0f, this.f6817c + 0.0f, 0.0f * this.f6815a, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        throw null;
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
    public void setScale(float f10) {
        this.f6815a = f10;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f10) {
        this.f6816b = f10;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f10) {
        this.f6817c = f10;
        invalidateSelf();
    }
}
