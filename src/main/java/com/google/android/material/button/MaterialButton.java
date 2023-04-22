package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import cb.g;
import cb.k;
import cb.o;
import com.app.pornhub.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import ua.j;
import ua.n;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, o {
    public static final int[] G = {16842911};
    public static final int[] H = {16842912};
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;

    /* renamed from: m  reason: collision with root package name */
    public final la.a f7255m;
    public final LinkedHashSet<a> n;

    /* renamed from: t  reason: collision with root package name */
    public b f7256t;

    /* renamed from: u  reason: collision with root package name */
    public PorterDuff.Mode f7257u;

    /* renamed from: w  reason: collision with root package name */
    public ColorStateList f7258w;
    public Drawable y;

    /* renamed from: z  reason: collision with root package name */
    public int f7259z;

    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends s0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public boolean f7260j;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f7260j = parcel.readInt() == 1;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeInt(this.f7260j ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018195), attributeSet, i10);
        this.n = new LinkedHashSet<>();
        this.D = false;
        this.E = false;
        Context context2 = getContext();
        TypedArray d = j.d(context2, attributeSet, m9.a.U, i10, 2132018195, new int[0]);
        this.C = d.getDimensionPixelSize(12, 0);
        this.f7257u = n.g(d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f7258w = za.c.a(getContext(), d, 14);
        this.y = za.c.d(getContext(), d, 10);
        this.F = d.getInteger(11, 1);
        this.f7259z = d.getDimensionPixelSize(13, 0);
        la.a aVar = new la.a(this, k.c(context2, attributeSet, i10, 2132018195).a());
        this.f7255m = aVar;
        Objects.requireNonNull(aVar);
        aVar.f12757c = d.getDimensionPixelOffset(1, 0);
        aVar.d = d.getDimensionPixelOffset(2, 0);
        aVar.f12758e = d.getDimensionPixelOffset(3, 0);
        aVar.f12759f = d.getDimensionPixelOffset(4, 0);
        if (d.hasValue(8)) {
            int dimensionPixelSize = d.getDimensionPixelSize(8, -1);
            aVar.f12760g = dimensionPixelSize;
            aVar.e(aVar.f12756b.g(dimensionPixelSize));
            aVar.f12768p = true;
        }
        aVar.f12761h = d.getDimensionPixelSize(20, 0);
        aVar.f12762i = n.g(d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f12763j = za.c.a(getContext(), d, 6);
        aVar.f12764k = za.c.a(getContext(), d, 19);
        aVar.f12765l = za.c.a(getContext(), d, 16);
        aVar.f12769q = d.getBoolean(5, false);
        aVar.f12771s = d.getDimensionPixelSize(9, 0);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int f10 = x.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = x.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(0)) {
            aVar.f12767o = true;
            setSupportBackgroundTintList(aVar.f12763j);
            setSupportBackgroundTintMode(aVar.f12762i);
        } else {
            aVar.g();
        }
        x.e.k(this, f10 + aVar.f12757c, paddingTop + aVar.f12758e, e10 + aVar.d, paddingBottom + aVar.f12759f);
        d.recycle();
        setCompoundDrawablePadding(this.C);
        g(this.y != null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        la.a aVar = this.f7255m;
        return aVar != null && aVar.f12769q;
    }

    public final boolean b() {
        int i10 = this.F;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i10 = this.F;
        return i10 == 1 || i10 == 2;
    }

    public final boolean d() {
        int i10 = this.F;
        if (i10 != 16 && i10 != 32) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        la.a aVar = this.f7255m;
        return (aVar == null || aVar.f12767o) ? false : true;
    }

    public final void f() {
        if (c()) {
            setCompoundDrawablesRelative(this.y, null, null, null);
        } else if (b()) {
            setCompoundDrawablesRelative(null, null, this.y, null);
        } else if (d()) {
            setCompoundDrawablesRelative(null, this.y, null, null);
        }
    }

    public final void g(boolean z10) {
        Drawable drawable = this.y;
        boolean z11 = true;
        if (drawable != null) {
            Drawable mutate = f0.a.h(drawable).mutate();
            this.y = mutate;
            mutate.setTintList(this.f7258w);
            PorterDuff.Mode mode = this.f7257u;
            if (mode != null) {
                this.y.setTintMode(mode);
            }
            int i10 = this.f7259z;
            if (i10 == 0) {
                i10 = this.y.getIntrinsicWidth();
            }
            int i11 = this.f7259z;
            if (i11 == 0) {
                i11 = this.y.getIntrinsicHeight();
            }
            Drawable drawable2 = this.y;
            int i12 = this.A;
            int i13 = this.B;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.y.setVisible(true, z10);
        }
        if (z10) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!c() || drawable3 == this.y) && ((!b() || drawable5 == this.y) && (!d() || drawable4 == this.y))) {
            z11 = false;
        }
        if (z11) {
            f();
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f7255m.f12760g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.y;
    }

    public int getIconGravity() {
        return this.F;
    }

    public int getIconPadding() {
        return this.C;
    }

    public int getIconSize() {
        return this.f7259z;
    }

    public ColorStateList getIconTint() {
        return this.f7258w;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f7257u;
    }

    public int getInsetBottom() {
        return this.f7255m.f12759f;
    }

    public int getInsetTop() {
        return this.f7255m.f12758e;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f7255m.f12765l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (e()) {
            return this.f7255m.f12756b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f7255m.f12764k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f7255m.f12761h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f7255m.f12763j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f7255m.f12762i : super.getSupportBackgroundTintMode();
    }

    public final void h(int i10, int i11) {
        if (this.y != null && getLayout() != null) {
            if (c() || b()) {
                this.B = 0;
                int i12 = this.F;
                boolean z10 = true;
                if (i12 != 1 && i12 != 3) {
                    int i13 = this.f7259z;
                    if (i13 == 0) {
                        i13 = this.y.getIntrinsicWidth();
                    }
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    int textWidth = (((((i10 - getTextWidth()) - x.e.e(this)) - i13) - this.C) - x.e.f(this)) / 2;
                    boolean z11 = x.e.d(this) == 1;
                    if (this.F != 4) {
                        z10 = false;
                    }
                    if (z11 != z10) {
                        textWidth = -textWidth;
                    }
                    if (this.A != textWidth) {
                        this.A = textWidth;
                        g(false);
                    }
                }
                this.A = 0;
                g(false);
            } else if (d()) {
                this.A = 0;
                if (this.F == 16) {
                    this.B = 0;
                    g(false);
                    return;
                }
                int i14 = this.f7259z;
                if (i14 == 0) {
                    i14 = this.y.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i14) - this.C) - getPaddingBottom()) / 2;
                if (this.B != textHeight) {
                    this.B = textHeight;
                    g(false);
                }
            }
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.D;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            m9.a.D(this, this.f7255m.b());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, G);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, H);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        la.a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f7255m) != null) {
            int i14 = i13 - i11;
            int i15 = i12 - i10;
            Drawable drawable = aVar.f12766m;
            if (drawable != null) {
                drawable.setBounds(aVar.f12757c, aVar.f12758e, i15 - aVar.d, i14 - aVar.f12759f);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f14775c);
        setChecked(cVar.f7260j);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f7260j = this.D;
        return cVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        h(i10, i11);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.y != null) {
            if (this.y.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (e()) {
            la.a aVar = this.f7255m;
            if (aVar.b() != null) {
                aVar.b().setTint(i10);
            }
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            la.a aVar = this.f7255m;
            aVar.f12767o = true;
            aVar.f12755a.setSupportBackgroundTintList(aVar.f12763j);
            aVar.f12755a.setSupportBackgroundTintMode(aVar.f12762i);
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? f.a.a(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (e()) {
            this.f7255m.f12769q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.D != z10) {
            this.D = z10;
            refreshDrawableState();
            if (this.E) {
                return;
            }
            this.E = true;
            Iterator<a> it = this.n.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.D);
            }
            this.E = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (e()) {
            la.a aVar = this.f7255m;
            if (!aVar.f12768p || aVar.f12760g != i10) {
                aVar.f12760g = i10;
                aVar.f12768p = true;
                aVar.e(aVar.f12756b.g(i10));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (e()) {
            g b10 = this.f7255m.b();
            g.b bVar = b10.f3929c;
            if (bVar.f3950o != f10) {
                bVar.f3950o = f10;
                b10.C();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.y != drawable) {
            this.y = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.F != i10) {
            this.F = i10;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.C != i10) {
            this.C = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? f.a.a(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f7259z != i10) {
            this.f7259z = i10;
            g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7258w != colorStateList) {
            this.f7258w = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f7257u != mode) {
            this.f7257u = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(c0.a.c(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        la.a aVar = this.f7255m;
        aVar.f(aVar.f12758e, i10);
    }

    public void setInsetTop(int i10) {
        la.a aVar = this.f7255m;
        aVar.f(i10, aVar.f12759f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f7256t = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f7256t;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            la.a aVar = this.f7255m;
            if (aVar.f12765l != colorStateList) {
                aVar.f12765l = colorStateList;
                boolean z10 = la.a.f12753t;
                if (z10 && (aVar.f12755a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) aVar.f12755a.getBackground()).setColor(ab.b.c(colorStateList));
                } else if (z10 || !(aVar.f12755a.getBackground() instanceof ab.a)) {
                } else {
                    ((ab.a) aVar.f12755a.getBackground()).setTintList(ab.b.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (e()) {
            setRippleColor(c0.a.c(getContext(), i10));
        }
    }

    @Override // cb.o
    public void setShapeAppearanceModel(k kVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f7255m.e(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (e()) {
            la.a aVar = this.f7255m;
            aVar.n = z10;
            aVar.h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            la.a aVar = this.f7255m;
            if (aVar.f12764k != colorStateList) {
                aVar.f12764k = colorStateList;
                aVar.h();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (e()) {
            setStrokeColor(c0.a.c(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (e()) {
            la.a aVar = this.f7255m;
            if (aVar.f12761h != i10) {
                aVar.f12761h = i10;
                aVar.h();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        la.a aVar = this.f7255m;
        if (aVar.f12763j != colorStateList) {
            aVar.f12763j = colorStateList;
            if (aVar.b() != null) {
                aVar.b().setTintList(aVar.f12763j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        la.a aVar = this.f7255m;
        if (aVar.f12762i != mode) {
            aVar.f12762i = mode;
            if (aVar.b() == null || aVar.f12762i == null) {
                return;
            }
            aVar.b().setTintMode(aVar.f12762i);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.D);
    }
}
