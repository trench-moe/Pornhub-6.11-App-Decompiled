package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import z8.a;
import z8.b;
import z8.c;

/* loaded from: classes.dex */
public class CastSeekBar extends View {
    public static final /* synthetic */ int A = 0;

    /* renamed from: c  reason: collision with root package name */
    public b f6827c;

    /* renamed from: f  reason: collision with root package name */
    public List<a> f6828f;

    /* renamed from: j  reason: collision with root package name */
    public final float f6829j;

    /* renamed from: m  reason: collision with root package name */
    public final float f6830m;
    public final float n;

    /* renamed from: t  reason: collision with root package name */
    public final float f6831t;

    /* renamed from: u  reason: collision with root package name */
    public final Paint f6832u;

    /* renamed from: w  reason: collision with root package name */
    public final int f6833w;
    public final int y;

    /* renamed from: z  reason: collision with root package name */
    public final int f6834z;

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6828f = new ArrayList();
        setAccessibilityDelegate(new c(this));
        Paint paint = new Paint(1);
        this.f6832u = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6829j = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.f6830m = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.n = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        this.f6831t = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        b bVar = new b();
        this.f6827c = bVar;
        bVar.f21915a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f1.a.B, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.f6833w = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.y = context.getResources().getColor(resourceId3);
        this.f6834z = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i10, int i11, int i12, int i13, int i14) {
        this.f6832u.setColor(i14);
        float f10 = i12;
        float f11 = i13;
        float f12 = this.n;
        canvas.drawRect((i10 / f10) * f11, -f12, (i11 / f10) * f11, f12, this.f6832u);
    }

    public int getMaxProgress() {
        return this.f6827c.f21915a;
    }

    public int getProgress() {
        Objects.requireNonNull(this.f6827c);
        return 0;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int progress = getProgress();
        int save2 = canvas.save();
        canvas.translate(0.0f, ((measuredHeight - paddingTop) - paddingBottom) / 2);
        Objects.requireNonNull(this.f6827c);
        int max = Math.max(0, 0);
        if (max > 0) {
            a(canvas, 0, max, this.f6827c.f21915a, measuredWidth, this.y);
        }
        if (progress > max) {
            a(canvas, max, progress, this.f6827c.f21915a, measuredWidth, this.f6833w);
        }
        int i10 = this.f6827c.f21915a;
        if (i10 > progress) {
            a(canvas, progress, i10, i10, measuredWidth, this.y);
        }
        canvas.restoreToCount(save2);
        List<a> list = this.f6828f;
        if (list != null && !list.isEmpty()) {
            this.f6832u.setColor(this.f6834z);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight2 = getMeasuredHeight();
            int paddingTop2 = getPaddingTop();
            int paddingBottom2 = getPaddingBottom();
            int save3 = canvas.save();
            canvas.translate(0.0f, ((measuredHeight2 - paddingTop2) - paddingBottom2) / 2);
            for (a aVar : list) {
                if (aVar != null) {
                    int min = Math.min(0, this.f6827c.f21915a);
                    float f10 = measuredWidth2;
                    float f11 = this.f6827c.f21915a;
                    float f12 = (min * f10) / f11;
                    float f13 = ((min + 1) * f10) / f11;
                    float f14 = this.f6831t;
                    if (f13 - f12 < f14) {
                        f13 = f12 + f14;
                    }
                    float f15 = f13 > f10 ? f10 : f13;
                    float f16 = f15 - f12 < f14 ? f15 - f14 : f12;
                    float f17 = this.n;
                    canvas.drawRect(f16, -f17, f15, f17, this.f6832u);
                }
            }
            canvas.restoreToCount(save3);
        }
        if (isEnabled()) {
            Objects.requireNonNull(this.f6827c);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f6829j + getPaddingLeft() + getPaddingRight()), i10, 0), View.resolveSizeAndState((int) (this.f6830m + getPaddingTop() + getPaddingBottom()), i11, 0));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            Objects.requireNonNull(this.f6827c);
        }
        return false;
    }
}
