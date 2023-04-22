package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import cb.g;
import cb.k;
import cb.o;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import l9.e;
import n0.a0;
import n0.x;
import ua.j;
import za.c;

/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, o {
    public static final int[] E = {16842911};
    public static final int[] F = {16842912};
    public static final int[] G = {R.attr.state_dragged};
    public boolean A;
    public boolean B;
    public boolean C;
    public a D;

    /* renamed from: z  reason: collision with root package name */
    public final ma.a f7276z;

    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018207), attributeSet, i10);
        this.B = false;
        this.C = false;
        this.A = true;
        TypedArray d = j.d(getContext(), attributeSet, m9.a.Y, i10, 2132018207, new int[0]);
        ma.a aVar = new ma.a(this, attributeSet, i10, 2132018207);
        this.f7276z = aVar;
        aVar.f13038c.r(super.getCardBackgroundColor());
        aVar.f13037b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        aVar.k();
        ColorStateList a10 = c.a(aVar.f13036a.getContext(), d, 10);
        aVar.f13047m = a10;
        if (a10 == null) {
            aVar.f13047m = ColorStateList.valueOf(-1);
        }
        aVar.f13041g = d.getDimensionPixelSize(11, 0);
        boolean z10 = d.getBoolean(0, false);
        aVar.f13052s = z10;
        aVar.f13036a.setLongClickable(z10);
        aVar.f13045k = c.a(aVar.f13036a.getContext(), d, 5);
        aVar.g(c.d(aVar.f13036a.getContext(), d, 2));
        aVar.f13040f = d.getDimensionPixelSize(4, 0);
        aVar.f13039e = d.getDimensionPixelSize(3, 0);
        ColorStateList a11 = c.a(aVar.f13036a.getContext(), d, 6);
        aVar.f13044j = a11;
        if (a11 == null) {
            aVar.f13044j = ColorStateList.valueOf(e.e(aVar.f13036a, R.attr.colorControlHighlight));
        }
        ColorStateList a12 = c.a(aVar.f13036a.getContext(), d, 1);
        aVar.d.r(a12 == null ? ColorStateList.valueOf(0) : a12);
        aVar.m();
        aVar.f13038c.q(aVar.f13036a.getCardElevation());
        aVar.n();
        aVar.f13036a.setBackgroundInternal(aVar.f(aVar.f13038c));
        Drawable e10 = aVar.f13036a.isClickable() ? aVar.e() : aVar.d;
        aVar.f13042h = e10;
        aVar.f13036a.setForeground(aVar.f(e10));
        d.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f7276z.f13038c.getBounds());
        return rectF;
    }

    public final void f() {
        ma.a aVar;
        Drawable drawable;
        if (Build.VERSION.SDK_INT > 26 && (drawable = (aVar = this.f7276z).n) != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            aVar.n.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            aVar.n.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    public boolean g() {
        ma.a aVar = this.f7276z;
        return aVar != null && aVar.f13052s;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f7276z.f13038c.f3929c.d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f7276z.d.f3929c.d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f7276z.f13043i;
    }

    public int getCheckedIconMargin() {
        return this.f7276z.f13039e;
    }

    public int getCheckedIconSize() {
        return this.f7276z.f13040f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f7276z.f13045k;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f7276z.f13037b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f7276z.f13037b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f7276z.f13037b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f7276z.f13037b.top;
    }

    public float getProgress() {
        return this.f7276z.f13038c.f3929c.f3947k;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f7276z.f13038c.m();
    }

    public ColorStateList getRippleColor() {
        return this.f7276z.f13044j;
    }

    public k getShapeAppearanceModel() {
        return this.f7276z.f13046l;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f7276z.f13047m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f7276z.f13047m;
    }

    public int getStrokeWidth() {
        return this.f7276z.f13041g;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.a.D(this, this.f7276z.f13038c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (g()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, E);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, F);
        }
        if (this.C) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        super.onMeasure(i10, i11);
        ma.a aVar = this.f7276z;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (aVar.f13048o != null) {
            int i14 = aVar.f13039e;
            int i15 = aVar.f13040f;
            int i16 = (measuredWidth - i14) - i15;
            int i17 = (measuredHeight - i14) - i15;
            if (aVar.f13036a.getUseCompatPadding()) {
                i17 -= (int) Math.ceil(aVar.d() * 2.0f);
                i16 -= (int) Math.ceil(aVar.c() * 2.0f);
            }
            int i18 = i17;
            int i19 = aVar.f13039e;
            MaterialCardView materialCardView = aVar.f13036a;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.e.d(materialCardView) == 1) {
                i13 = i16;
                i12 = i19;
            } else {
                i12 = i16;
                i13 = i19;
            }
            aVar.f13048o.setLayerInset(2, i12, aVar.f13039e, i13, i18);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.A) {
            if (!this.f7276z.f13051r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f7276z.f13051r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        ma.a aVar = this.f7276z;
        aVar.f13038c.r(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f7276z.f13038c.r(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        ma.a aVar = this.f7276z;
        aVar.f13038c.q(aVar.f13036a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g gVar = this.f7276z.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.r(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f7276z.f13052s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.B != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f7276z.g(drawable);
    }

    public void setCheckedIconMargin(int i10) {
        this.f7276z.f13039e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f7276z.f13039e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f7276z.g(f.a.a(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f7276z.f13040f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f7276z.f13040f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ma.a aVar = this.f7276z;
        aVar.f13045k = colorStateList;
        Drawable drawable = aVar.f13043i;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        ma.a aVar = this.f7276z;
        if (aVar != null) {
            Drawable drawable = aVar.f13042h;
            Drawable e10 = aVar.f13036a.isClickable() ? aVar.e() : aVar.d;
            aVar.f13042h = e10;
            if (drawable != e10) {
                if (Build.VERSION.SDK_INT < 23 || !(aVar.f13036a.getForeground() instanceof InsetDrawable)) {
                    aVar.f13036a.setForeground(aVar.f(e10));
                } else {
                    ((InsetDrawable) aVar.f13036a.getForeground()).setDrawable(e10);
                }
            }
        }
    }

    public void setDragged(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f7276z.l();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.D = aVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f7276z.l();
        this.f7276z.k();
    }

    public void setProgress(float f10) {
        ma.a aVar = this.f7276z;
        aVar.f13038c.s(f10);
        g gVar = aVar.d;
        if (gVar != null) {
            gVar.s(f10);
        }
        g gVar2 = aVar.f13050q;
        if (gVar2 != null) {
            gVar2.s(f10);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        ma.a aVar = this.f7276z;
        aVar.h(aVar.f13046l.g(f10));
        aVar.f13042h.invalidateSelf();
        if (aVar.j() || aVar.i()) {
            aVar.k();
        }
        if (aVar.j()) {
            aVar.l();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ma.a aVar = this.f7276z;
        aVar.f13044j = colorStateList;
        aVar.m();
    }

    public void setRippleColorResource(int i10) {
        ma.a aVar = this.f7276z;
        aVar.f13044j = c0.a.c(getContext(), i10);
        aVar.m();
    }

    @Override // cb.o
    public void setShapeAppearanceModel(k kVar) {
        setClipToOutline(kVar.f(getBoundsAsRectF()));
        this.f7276z.h(kVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        ma.a aVar = this.f7276z;
        if (aVar.f13047m != colorStateList) {
            aVar.f13047m = colorStateList;
            aVar.n();
        }
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        ma.a aVar = this.f7276z;
        if (i10 != aVar.f13041g) {
            aVar.f13041g = i10;
            aVar.n();
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f7276z.l();
        this.f7276z.k();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (g() && isEnabled()) {
            this.B = !this.B;
            refreshDrawableState();
            f();
            ma.a aVar = this.f7276z;
            boolean z10 = this.B;
            Drawable drawable = aVar.f13043i;
            if (drawable != null) {
                drawable.setAlpha(z10 ? 255 : 0);
            }
            a aVar2 = this.D;
            if (aVar2 != null) {
                aVar2.a(this, this.B);
            }
        }
    }
}
