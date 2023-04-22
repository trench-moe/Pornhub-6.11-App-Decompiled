package com.app.pornhub.view.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import cb.e;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public int f4976c;

    /* renamed from: f  reason: collision with root package name */
    public int f4977f;

    /* renamed from: j  reason: collision with root package name */
    public int f4978j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4979m;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f4980a;

        /* renamed from: b  reason: collision with root package name */
        public int f4981b;

        /* renamed from: c  reason: collision with root package name */
        public int f4982c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4983e;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f4982c = -1;
            this.d = -1;
            this.f4983e = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4982c = -1;
            this.d = -1;
            this.f4983e = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f3922f);
            try {
                this.f4982c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                this.d = obtainStyledAttributes.getDimensionPixelSize(2, -1);
                this.f4983e = obtainStyledAttributes.getBoolean(1, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4982c = -1;
            this.d = -1;
            this.f4983e = false;
        }
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4976c = 0;
        this.f4977f = 0;
        this.f4978j = 0;
        this.f4979m = false;
        b(context, attributeSet);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4976c = 0;
        this.f4977f = 0;
        this.f4978j = 0;
        this.f4979m = false;
        b(context, attributeSet);
    }

    public final Paint a(int i10) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(2.0f);
        return paint;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f3921c);
        try {
            this.f4976c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f4977f = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f4978j = obtainStyledAttributes.getInteger(4, 0);
            this.f4979m = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f4979m) {
            Paint a10 = a(-256);
            Paint a11 = a(-16711936);
            Paint a12 = a(-65536);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.f4982c > 0) {
                float right = view.getRight();
                float height = (view.getHeight() / 2.0f) + view.getTop();
                canvas.drawLine(right, height, right + layoutParams.f4982c, height, a10);
                float f10 = layoutParams.f4982c + right;
                canvas.drawLine(f10 - 4.0f, height - 4.0f, f10, height, a10);
                float f11 = layoutParams.f4982c + right;
                canvas.drawLine(f11 - 4.0f, height + 4.0f, f11, height, a10);
            } else if (this.f4976c > 0) {
                float right2 = view.getRight();
                float height2 = (view.getHeight() / 2.0f) + view.getTop();
                canvas.drawLine(right2, height2, right2 + this.f4976c, height2, a11);
                float f12 = this.f4976c + right2;
                canvas.drawLine(f12 - 4.0f, height2 - 4.0f, f12, height2, a11);
                float f13 = this.f4976c + right2;
                canvas.drawLine(f13 - 4.0f, height2 + 4.0f, f13, height2, a11);
            }
            if (layoutParams.d > 0) {
                float width = (view.getWidth() / 2.0f) + view.getLeft();
                float bottom = view.getBottom();
                canvas.drawLine(width, bottom, width, bottom + layoutParams.d, a10);
                float f14 = layoutParams.d + bottom;
                canvas.drawLine(width - 4.0f, f14 - 4.0f, width, f14, a10);
                float f15 = layoutParams.d + bottom;
                canvas.drawLine(width + 4.0f, f15 - 4.0f, width, f15, a10);
            } else if (this.f4977f > 0) {
                float left = view.getLeft() + (view.getWidth() / 2.0f);
                float bottom2 = view.getBottom();
                canvas.drawLine(left, bottom2, left, bottom2 + this.f4977f, a11);
                float f16 = this.f4977f + bottom2;
                canvas.drawLine(left - 4.0f, f16 - 4.0f, left, f16, a11);
                float f17 = this.f4977f + bottom2;
                canvas.drawLine(left + 4.0f, f17 - 4.0f, left, f17, a11);
            }
            if (layoutParams.f4983e) {
                if (this.f4978j == 0) {
                    float left2 = view.getLeft();
                    float height3 = (view.getHeight() / 2.0f) + view.getTop();
                    canvas.drawLine(left2, height3 - 6.0f, left2, height3 + 6.0f, a12);
                } else {
                    float width2 = (view.getWidth() / 2.0f) + view.getLeft();
                    float top = view.getTop();
                    canvas.drawLine(width2 - 6.0f, top, width2 + 6.0f, top, a12);
                }
            }
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i15 = layoutParams.f4980a;
            childAt.layout(i15, layoutParams.f4981b, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + layoutParams.f4981b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int max;
        int paddingLeft;
        int paddingTop;
        int size = (View.MeasureSpec.getSize(i10) - getPaddingRight()) - getPaddingLeft();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingRight()) - getPaddingLeft();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.f4978j == 0) {
            i12 = size;
            i13 = mode;
        } else {
            i12 = size2;
            i13 = mode2;
        }
        int childCount = getChildCount();
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i27 = childCount;
            int i28 = i24;
            if (childAt.getVisibility() == 8) {
                i14 = size;
                i16 = size2;
                i24 = i28;
                int i29 = i26;
                i19 = mode;
                max = i29;
            } else {
                int i30 = IntCompanionObject.MIN_VALUE;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode == 1073741824 ? IntCompanionObject.MIN_VALUE : mode);
                if (mode2 != 1073741824) {
                    i30 = mode2;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, i30));
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i31 = layoutParams.f4982c;
                boolean z10 = true;
                if (!(i31 != -1)) {
                    i31 = this.f4976c;
                }
                i14 = size;
                int i32 = layoutParams.d;
                if (!(i32 != -1)) {
                    i32 = this.f4977f;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i33 = i32;
                if (this.f4978j == 0) {
                    i15 = measuredHeight;
                } else {
                    i15 = measuredWidth;
                    measuredWidth = measuredHeight;
                    i33 = i31;
                    i31 = i33;
                }
                int i34 = i23 + measuredWidth;
                int i35 = i34 + i31;
                i16 = size2;
                if (!layoutParams.f4983e && (i13 == 0 || i34 <= i12)) {
                    z10 = false;
                }
                if (z10) {
                    i25 += i26;
                    i18 = i15;
                    i35 = i31 + measuredWidth;
                    i34 = measuredWidth;
                    i17 = i15 + i33;
                } else {
                    i17 = i26;
                    i18 = i28;
                }
                i19 = mode;
                max = Math.max(i17, i15 + i33);
                int max2 = Math.max(i18, i15);
                if (this.f4978j == 0) {
                    paddingLeft = (getPaddingLeft() + i34) - measuredWidth;
                    paddingTop = getPaddingTop() + i25;
                } else {
                    paddingLeft = getPaddingLeft() + i25;
                    paddingTop = (getPaddingTop() + i34) - measuredHeight;
                }
                layoutParams.f4980a = paddingLeft;
                layoutParams.f4981b = paddingTop;
                i22 = Math.max(i22, i34);
                i21 = i25 + max2;
                i24 = max2;
                i23 = i35;
            }
            i20++;
            childCount = i27;
            size = i14;
            size2 = i16;
            int i36 = i19;
            i26 = max;
            mode = i36;
        }
        if (this.f4978j == 0) {
            setMeasuredDimension(ViewGroup.resolveSize(i22, i10), ViewGroup.resolveSize(i21, i11));
        } else {
            setMeasuredDimension(ViewGroup.resolveSize(i21, i10), ViewGroup.resolveSize(i22, i11));
        }
    }
}
