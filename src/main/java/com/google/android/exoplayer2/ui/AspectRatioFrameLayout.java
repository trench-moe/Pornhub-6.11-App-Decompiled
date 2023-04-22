package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public final c f6436c;

    /* renamed from: f  reason: collision with root package name */
    public b f6437f;

    /* renamed from: j  reason: collision with root package name */
    public float f6438j;

    /* renamed from: m  reason: collision with root package name */
    public int f6439m;

    /* loaded from: classes.dex */
    public interface b {
        void a(float f10, float f11, boolean z10);
    }

    /* loaded from: classes.dex */
    public final class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public float f6440c;

        /* renamed from: f  reason: collision with root package name */
        public float f6441f;

        /* renamed from: j  reason: collision with root package name */
        public boolean f6442j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f6443m;

        public c(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6443m = false;
            b bVar = AspectRatioFrameLayout.this.f6437f;
            if (bVar == null) {
                return;
            }
            bVar.a(this.f6440c, this.f6441f, this.f6442j);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6439m = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o9.b.f13622j, 0, 0);
            try {
                this.f6439m = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f6436c = new c(null);
    }

    public int getResizeMode() {
        return this.f6439m;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f6438j <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f6438j / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            c cVar = this.f6436c;
            cVar.f6440c = this.f6438j;
            cVar.f6441f = f14;
            cVar.f6442j = false;
            if (!cVar.f6443m) {
                cVar.f6443m = true;
                AspectRatioFrameLayout.this.post(cVar);
            }
            return;
        }
        int i12 = this.f6439m;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f6438j;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f6438j;
                    } else {
                        f11 = this.f6438j;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f6438j;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f6438j;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f6438j;
            measuredWidth = (int) (f13 * f10);
        }
        c cVar2 = this.f6436c;
        cVar2.f6440c = this.f6438j;
        cVar2.f6441f = f14;
        cVar2.f6442j = true;
        if (!cVar2.f6443m) {
            cVar2.f6443m = true;
            AspectRatioFrameLayout.this.post(cVar2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f6438j != f10) {
            this.f6438j = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.f6437f = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.f6439m != i10) {
            this.f6439m = i10;
            requestLayout();
        }
    }
}
