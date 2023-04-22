package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a  reason: collision with root package name */
    public final float f6659a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6660b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6661c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6662e;

    /* renamed from: f  reason: collision with root package name */
    public final TextPaint f6663f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f6664g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f6665h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f6666i;

    /* renamed from: j  reason: collision with root package name */
    public Layout.Alignment f6667j;

    /* renamed from: k  reason: collision with root package name */
    public Bitmap f6668k;

    /* renamed from: l  reason: collision with root package name */
    public float f6669l;

    /* renamed from: m  reason: collision with root package name */
    public int f6670m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public float f6671o;

    /* renamed from: p  reason: collision with root package name */
    public int f6672p;

    /* renamed from: q  reason: collision with root package name */
    public float f6673q;

    /* renamed from: r  reason: collision with root package name */
    public float f6674r;

    /* renamed from: s  reason: collision with root package name */
    public int f6675s;

    /* renamed from: t  reason: collision with root package name */
    public int f6676t;

    /* renamed from: u  reason: collision with root package name */
    public int f6677u;

    /* renamed from: v  reason: collision with root package name */
    public int f6678v;

    /* renamed from: w  reason: collision with root package name */
    public int f6679w;

    /* renamed from: x  reason: collision with root package name */
    public float f6680x;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public float f6681z;

    public m(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f6662e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f6659a = round;
        this.f6660b = round;
        this.f6661c = round;
        TextPaint textPaint = new TextPaint();
        this.f6663f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f6664g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f6665h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        if (!z10) {
            Objects.requireNonNull(this.J);
            Objects.requireNonNull(this.f6668k);
            canvas.drawBitmap(this.f6668k, (Rect) null, this.J, this.f6665h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate(this.G, this.H);
            if (Color.alpha(this.f6677u) > 0) {
                this.f6664g.setColor(this.f6677u);
                canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f6664g);
            }
            int i10 = this.f6679w;
            boolean z11 = true;
            if (i10 == 1) {
                this.f6663f.setStrokeJoin(Paint.Join.ROUND);
                this.f6663f.setStrokeWidth(this.f6659a);
                this.f6663f.setColor(this.f6678v);
                this.f6663f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i10 == 2) {
                TextPaint textPaint = this.f6663f;
                float f10 = this.f6660b;
                float f11 = this.f6661c;
                textPaint.setShadowLayer(f10, f11, f11, this.f6678v);
            } else if (i10 == 3 || i10 == 4) {
                if (i10 != 3) {
                    z11 = false;
                }
                int i11 = z11 ? -1 : this.f6678v;
                int i12 = z11 ? this.f6678v : -1;
                float f12 = this.f6660b / 2.0f;
                this.f6663f.setColor(this.f6675s);
                this.f6663f.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                this.f6663f.setShadowLayer(this.f6660b, f13, f13, i11);
                staticLayout2.draw(canvas);
                this.f6663f.setShadowLayer(this.f6660b, f12, f12, i12);
            }
            this.f6663f.setColor(this.f6675s);
            this.f6663f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f6663f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }
}
