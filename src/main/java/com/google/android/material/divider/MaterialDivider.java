package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import cb.g;
import com.app.pornhub.R;
import hb.a;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import ua.j;
import za.c;

/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: c  reason: collision with root package name */
    public final g f7423c;

    /* renamed from: f  reason: collision with root package name */
    public int f7424f;

    /* renamed from: j  reason: collision with root package name */
    public int f7425j;

    /* renamed from: m  reason: collision with root package name */
    public int f7426m;
    public int n;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int i10) {
        super(a.a(context, attributeSet, i10, 2132018251), attributeSet, i10);
        Context context2 = getContext();
        this.f7423c = new g();
        TypedArray d = j.d(context2, attributeSet, m9.a.f12999a0, i10, 2132018251, new int[0]);
        this.f7424f = d.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f7426m = d.getDimensionPixelOffset(2, 0);
        this.n = d.getDimensionPixelOffset(1, 0);
        setDividerColor(c.a(context2, d, 0).getDefaultColor());
        d.recycle();
    }

    public int getDividerColor() {
        return this.f7425j;
    }

    public int getDividerInsetEnd() {
        return this.n;
    }

    public int getDividerInsetStart() {
        return this.f7426m;
    }

    public int getDividerThickness() {
        return this.f7424f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        boolean z10 = true;
        if (x.e.d(this) != 1) {
            z10 = false;
        }
        int i11 = z10 ? this.n : this.f7426m;
        if (z10) {
            width = getWidth();
            i10 = this.f7426m;
        } else {
            width = getWidth();
            i10 = this.n;
        }
        this.f7423c.setBounds(i11, 0, width - i10, getBottom() - getTop());
        this.f7423c.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
            }
        }
        int i12 = this.f7424f;
        if (i12 > 0 && measuredHeight != i12) {
            measuredHeight = i12;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(int i10) {
        if (this.f7425j != i10) {
            this.f7425j = i10;
            this.f7423c.r(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(c0.a.b(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.n = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f7426m = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f7424f != i10) {
            this.f7424f = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }
}
