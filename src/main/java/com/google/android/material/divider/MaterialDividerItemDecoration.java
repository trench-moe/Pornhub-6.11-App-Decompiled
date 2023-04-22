package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import java.util.Objects;
import java.util.WeakHashMap;
import m9.a;
import n0.a0;
import n0.x;
import ua.j;
import za.c;

/* loaded from: classes.dex */
public class MaterialDividerItemDecoration extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f7427a;

    /* renamed from: b  reason: collision with root package name */
    public int f7428b;

    /* renamed from: c  reason: collision with root package name */
    public int f7429c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f7430e;

    /* renamed from: f  reason: collision with root package name */
    public int f7431f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f7432g = new Rect();

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i10) {
        int[] iArr = a.f12999a0;
        j.a(context, attributeSet, R.attr.materialDividerStyle, 2132018251);
        j.b(context, attributeSet, iArr, R.attr.materialDividerStyle, 2132018251, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.materialDividerStyle, 2132018251);
        this.f7429c = c.a(context, obtainStyledAttributes, 0).getDefaultColor();
        this.f7428b = obtainStyledAttributes.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f7430e = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f7431f = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.f7427a = shapeDrawable;
        int i11 = this.f7429c;
        this.f7429c = i11;
        Drawable h10 = f0.a.h(shapeDrawable);
        this.f7427a = h10;
        h10.setTint(i11);
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(a0.a.k("Invalid orientation: ", i10, ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.d = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.w wVar) {
        rect.set(0, 0, 0, 0);
        if (this.d == 1) {
            rect.bottom = this.f7427a.getIntrinsicHeight() + this.f7428b;
        } else {
            rect.right = this.f7427a.getIntrinsicWidth() + this.f7428b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.w wVar) {
        int height;
        int i10;
        int width;
        int i11;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        boolean z10 = true;
        int i12 = 0;
        if (this.d == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i11 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i11, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i11 = 0;
            }
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.e.d(recyclerView) != 1) {
                z10 = false;
            }
            int i13 = i11 + (z10 ? this.f7431f : this.f7430e);
            int i14 = width - (z10 ? this.f7430e : this.f7431f);
            int childCount = recyclerView.getChildCount();
            while (i12 < childCount) {
                View childAt = recyclerView.getChildAt(i12);
                RecyclerView.L(childAt, this.f7432g);
                int round = Math.round(childAt.getTranslationY()) + this.f7432g.bottom;
                this.f7427a.setBounds(i13, (round - this.f7427a.getIntrinsicHeight()) - this.f7428b, i14, round);
                this.f7427a.draw(canvas);
                i12++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i10 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i10, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i10 = 0;
        }
        int i15 = i10 + this.f7430e;
        int i16 = height - this.f7431f;
        int childCount2 = recyclerView.getChildCount();
        while (i12 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i12);
            RecyclerView.l layoutManager = recyclerView.getLayoutManager();
            Rect rect = this.f7432g;
            Objects.requireNonNull(layoutManager);
            RecyclerView.L(childAt2, rect);
            int round2 = Math.round(childAt2.getTranslationX()) + this.f7432g.right;
            this.f7427a.setBounds((round2 - this.f7427a.getIntrinsicWidth()) - this.f7428b, i15, round2, i16);
            this.f7427a.draw(canvas);
            i12++;
        }
        canvas.restore();
    }
}
