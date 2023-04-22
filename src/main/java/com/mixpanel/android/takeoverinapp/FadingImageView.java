package com.mixpanel.android.takeoverinapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class FadingImageView extends ImageView {

    /* renamed from: c  reason: collision with root package name */
    public Matrix f8317c;

    /* renamed from: f  reason: collision with root package name */
    public Paint f8318f;

    /* renamed from: j  reason: collision with root package name */
    public Shader f8319j;

    /* renamed from: m  reason: collision with root package name */
    public Paint f8320m;
    public Shader n;

    /* renamed from: t  reason: collision with root package name */
    public int f8321t;

    /* renamed from: u  reason: collision with root package name */
    public int f8322u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8323w;

    public FadingImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public FadingImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    public final void a() {
        this.f8317c = new Matrix();
        this.f8318f = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-16777216, -16777216, -452984832, 0}, new float[]{0.0f, 0.2f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        this.f8319j = linearGradient;
        this.f8318f.setShader(linearGradient);
        this.f8318f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f8320m = new Paint();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 0, -16777216, -16777216}, new float[]{0.0f, 0.85f, 0.98f, 1.0f}, Shader.TileMode.CLAMP);
        this.n = linearGradient2;
        this.f8320m.setShader(linearGradient2);
        this.f8318f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f8323w) {
            super.draw(canvas);
            return;
        }
        Rect clipBounds = canvas.getClipBounds();
        int saveLayer = Build.VERSION.SDK_INT >= 26 ? canvas.saveLayer(0.0f, 0.0f, clipBounds.width(), clipBounds.height(), null) : canvas.saveLayer(0.0f, 0.0f, clipBounds.width(), clipBounds.height(), null, 31);
        super.draw(canvas);
        canvas.drawRect(0.0f, 0.0f, this.f8322u, this.f8321t, this.f8318f);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f8323w) {
            this.f8321t = getMeasuredHeight();
            this.f8322u = getMeasuredWidth();
            this.f8317c.setScale(1.0f, View.MeasureSpec.getSize(i11));
            this.f8319j.setLocalMatrix(this.f8317c);
            this.n.setLocalMatrix(this.f8317c);
        }
    }
}
