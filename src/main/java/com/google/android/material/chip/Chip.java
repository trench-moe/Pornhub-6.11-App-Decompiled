package com.google.android.material.chip;

import af.c;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import cb.g;
import cb.k;
import cb.o;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.chip.a;
import ga.g;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.x;
import o0.b;
import ua.j;
import ua.n;
import za.d;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0090a, o {
    public static final Rect L = new Rect();
    public static final int[] M = {16842913};
    public static final int[] N = {16842911};
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public final b G;
    public boolean H;
    public final Rect I;
    public final RectF J;
    public final c K;
    public com.google.android.material.chip.a n;

    /* renamed from: t  reason: collision with root package name */
    public InsetDrawable f7279t;

    /* renamed from: u  reason: collision with root package name */
    public RippleDrawable f7280u;

    /* renamed from: w  reason: collision with root package name */
    public View.OnClickListener f7281w;
    public CompoundButton.OnCheckedChangeListener y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7282z;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
        }

        @Override // af.c
        public void n(int i10) {
        }

        @Override // af.c
        public void o(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.n;
            chip.setText(aVar.V0 ? aVar.W : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class b extends t0.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // t0.a
        public int o(float f10, float f11) {
            Chip chip = Chip.this;
            Rect rect = Chip.L;
            return (chip.e() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // t0.a
        public void p(List<Integer> list) {
            boolean z10 = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.L;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                com.google.android.material.chip.a aVar = chip2.n;
                if (aVar != null && aVar.f7294c0) {
                    z10 = true;
                }
                if (z10 && chip2.f7281w != null) {
                    list.add(1);
                }
            }
        }

        @Override // t0.a
        public boolean t(int i10, int i11, Bundle bundle) {
            if (i11 == 16) {
                if (i10 == 0) {
                    return Chip.this.performClick();
                }
                if (i10 == 1) {
                    return Chip.this.g();
                }
            }
            return false;
        }

        @Override // t0.a
        public void u(o0.b bVar) {
            bVar.f13479a.setCheckable(Chip.this.f());
            bVar.f13479a.setClickable(Chip.this.isClickable());
            bVar.f13479a.setClassName(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.f13479a.setText(text);
            } else {
                bVar.f13479a.setContentDescription(text);
            }
        }

        @Override // t0.a
        public void v(int i10, o0.b bVar) {
            String str = BuildConfig.FLAVOR;
            if (i10 != 1) {
                bVar.f13479a.setContentDescription(BuildConfig.FLAVOR);
                bVar.f13479a.setBoundsInParent(Chip.L);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                bVar.f13479a.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    str = text;
                }
                objArr[0] = str;
                bVar.f13479a.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            bVar.f13479a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            bVar.a(b.a.f13484g);
            bVar.f13479a.setEnabled(Chip.this.isEnabled());
        }

        @Override // t0.a
        public void w(int i10, boolean z10) {
            if (i10 == 1) {
                Chip chip = Chip.this;
                chip.C = z10;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018209), attributeSet, i10);
        this.I = new Rect();
        this.J = new RectF();
        this.K = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet, i10, 2132018209);
        Context context3 = aVar.w0;
        int[] iArr = m9.a.E;
        TypedArray d = j.d(context3, attributeSet, iArr, i10, 2132018209, new int[0]);
        aVar.X0 = d.hasValue(37);
        ColorStateList a10 = za.c.a(aVar.w0, d, 24);
        if (aVar.P != a10) {
            aVar.P = a10;
            aVar.onStateChange(aVar.getState());
        }
        aVar.U(za.c.a(aVar.w0, d, 11));
        aVar.b0(d.getDimension(19, 0.0f));
        if (d.hasValue(12)) {
            aVar.V(d.getDimension(12, 0.0f));
        }
        aVar.d0(za.c.a(aVar.w0, d, 22));
        aVar.e0(d.getDimension(23, 0.0f));
        aVar.o0(za.c.a(aVar.w0, d, 36));
        aVar.p0(d.getText(5));
        d e10 = za.c.e(aVar.w0, d, 0);
        e10.f21929k = d.getDimension(1, e10.f21929k);
        aVar.C0.b(e10, aVar.w0);
        int i11 = d.getInt(3, 0);
        if (i11 == 1) {
            aVar.U0 = TextUtils.TruncateAt.START;
        } else if (i11 == 2) {
            aVar.U0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i11 == 3) {
            aVar.U0 = TextUtils.TruncateAt.END;
        }
        aVar.a0(d.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.a0(d.getBoolean(15, false));
        }
        aVar.X(za.c.d(aVar.w0, d, 14));
        if (d.hasValue(17)) {
            aVar.Z(za.c.a(aVar.w0, d, 17));
        }
        aVar.Y(d.getDimension(16, -1.0f));
        aVar.l0(d.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.l0(d.getBoolean(26, false));
        }
        aVar.f0(za.c.d(aVar.w0, d, 25));
        aVar.k0(za.c.a(aVar.w0, d, 30));
        aVar.h0(d.getDimension(28, 0.0f));
        aVar.Q(d.getBoolean(6, false));
        aVar.T(d.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.T(d.getBoolean(8, false));
        }
        aVar.R(za.c.d(aVar.w0, d, 7));
        if (d.hasValue(9)) {
            aVar.S(za.c.a(aVar.w0, d, 9));
        }
        aVar.f7304m0 = g.a(aVar.w0, d, 39);
        aVar.f7305n0 = g.a(aVar.w0, d, 33);
        aVar.c0(d.getDimension(21, 0.0f));
        aVar.n0(d.getDimension(35, 0.0f));
        aVar.m0(d.getDimension(34, 0.0f));
        aVar.r0(d.getDimension(41, 0.0f));
        aVar.q0(d.getDimension(40, 0.0f));
        aVar.i0(d.getDimension(29, 0.0f));
        aVar.g0(d.getDimension(27, 0.0f));
        aVar.W(d.getDimension(13, 0.0f));
        aVar.W0 = d.getDimensionPixelSize(4, IntCompanionObject.MAX_VALUE);
        d.recycle();
        j.a(context2, attributeSet, i10, 2132018209);
        j.b(context2, attributeSet, iArr, i10, 2132018209, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, 2132018209);
        this.D = obtainStyledAttributes.getBoolean(32, false);
        this.F = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(n.b(getContext(), 48))));
        obtainStyledAttributes.recycle();
        setChipDrawable(aVar);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        aVar.q(x.i.i(this));
        j.a(context2, attributeSet, i10, 2132018209);
        j.b(context2, attributeSet, iArr, i10, 2132018209, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i10, 2132018209);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(za.c.a(context2, obtainStyledAttributes2, 2));
        }
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.G = new b(this);
        i();
        if (!hasValue) {
            setOutlineProvider(new na.a(this));
        }
        setChecked(this.f7282z);
        setText(aVar.W);
        setEllipsize(aVar.U0);
        l();
        if (!this.n.V0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        k();
        if (this.D) {
            setMinHeight(this.F);
        }
        this.E = x.e.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.J.setEmpty();
        if (e() && this.f7281w != null) {
            com.google.android.material.chip.a aVar = this.n;
            aVar.H(aVar.getBounds(), this.J);
        }
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.I.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.I;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.C0.f15813f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0090a
    public void a() {
        d(this.F);
        requestLayout();
        invalidateOutline();
    }

    public boolean d(int i10) {
        this.F = i10;
        if (!this.D) {
            if (this.f7279t != null) {
                h();
            } else {
                int[] iArr = ab.b.f340a;
                j();
            }
            return false;
        }
        int max = Math.max(0, i10 - ((int) this.n.R));
        int max2 = Math.max(0, i10 - this.n.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f7279t != null) {
                h();
            } else {
                int[] iArr2 = ab.b.f340a;
                j();
            }
            return false;
        }
        int i11 = max2 > 0 ? max2 / 2 : 0;
        int i12 = max > 0 ? max / 2 : 0;
        if (this.f7279t != null) {
            Rect rect = new Rect();
            this.f7279t.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                int[] iArr3 = ab.b.f340a;
                j();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f7279t = new InsetDrawable((Drawable) this.n, i11, i12, i11, i12);
        int[] iArr4 = ab.b.f340a;
        j();
        return true;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.H) {
            if (!this.G.n(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.H) {
            b bVar = this.G;
            Objects.requireNonNull(bVar);
            boolean z10 = false;
            z10 = false;
            int i10 = 0;
            z10 = false;
            z10 = false;
            z10 = false;
            z10 = false;
            if (keyEvent.getAction() != 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 61) {
                    int i11 = 66;
                    if (keyCode != 66) {
                        switch (keyCode) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                if (keyEvent.hasNoModifiers()) {
                                    if (keyCode == 19) {
                                        i11 = 33;
                                    } else if (keyCode == 21) {
                                        i11 = 17;
                                    } else if (keyCode != 22) {
                                        i11 = 130;
                                    }
                                    int repeatCount = keyEvent.getRepeatCount() + 1;
                                    boolean z11 = false;
                                    while (i10 < repeatCount && bVar.r(i11, null)) {
                                        i10++;
                                        z11 = true;
                                    }
                                    z10 = z11;
                                    break;
                                }
                                break;
                        }
                    }
                    if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                        int i12 = bVar.f15069l;
                        if (i12 != Integer.MIN_VALUE) {
                            bVar.t(i12, 16, null);
                        }
                        z10 = true;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    z10 = bVar.r(2, null);
                } else if (keyEvent.hasModifiers(1)) {
                    z10 = bVar.r(1, null);
                }
            }
            if (!z10 || this.G.f15069l == Integer.MIN_VALUE) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.n;
        int i10 = 0;
        if (aVar != null && com.google.android.material.chip.a.N(aVar.f7295d0)) {
            com.google.android.material.chip.a aVar2 = this.n;
            ?? isEnabled = isEnabled();
            int i11 = isEnabled;
            if (this.C) {
                i11 = isEnabled + 1;
            }
            int i12 = i11;
            if (this.B) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.A) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            }
            if (this.C) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.B) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.A) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            i10 = aVar2.j0(iArr);
        }
        if (i10 != 0) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.n;
        return (aVar == null || aVar.K() == null) ? false : true;
    }

    public boolean f() {
        com.google.android.material.chip.a aVar = this.n;
        return aVar != null && aVar.f7300i0;
    }

    public boolean g() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f7281w;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.H) {
            this.G.y(1, 1);
        }
        return z10;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f7286u) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        Drawable drawable = this.f7279t;
        if (drawable == null) {
            drawable = this.n;
        }
        return drawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7302k0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7303l0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.Q;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return Math.max(0.0f, aVar.J());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.n;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7313v0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.n;
        if (aVar == null || (drawable = aVar.Y) == null) {
            return null;
        }
        return f0.a.g(drawable);
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7292a0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.Z;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.R;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7306o0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.T;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.U;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.K();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7299h0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7312u0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7298g0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7311t0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7297f0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.U0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.H) {
            b bVar = this.G;
            if (bVar.f15069l != 1) {
                if (bVar.f15068k == 1) {
                }
            }
            rect.set(getCloseIconTouchBoundsInt());
            return;
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7305n0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7308q0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7307p0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.n.f3929c.f3938a;
    }

    public g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7304m0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7310s0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            return aVar.f7309r0;
        }
        return 0.0f;
    }

    public final void h() {
        if (this.f7279t != null) {
            this.f7279t = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = ab.b.f340a;
            j();
        }
    }

    public final void i() {
        if (e()) {
            com.google.android.material.chip.a aVar = this.n;
            if ((aVar != null && aVar.f7294c0) && this.f7281w != null) {
                x.v(this, this.G);
                this.H = true;
                return;
            }
        }
        x.v(this, null);
        this.H = false;
    }

    public final void j() {
        this.f7280u = new RippleDrawable(ab.b.c(this.n.V), getBackgroundDrawable(), null);
        this.n.s0(false);
        RippleDrawable rippleDrawable = this.f7280u;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.q(this, rippleDrawable);
        k();
    }

    public final void k() {
        if (!TextUtils.isEmpty(getText())) {
            com.google.android.material.chip.a aVar = this.n;
            if (aVar == null) {
                return;
            }
            int I = (int) (aVar.I() + aVar.f7313v0 + aVar.f7310s0);
            com.google.android.material.chip.a aVar2 = this.n;
            int F = (int) (aVar2.F() + aVar2.f7306o0 + aVar2.f7309r0);
            if (this.f7279t != null) {
                Rect rect = new Rect();
                this.f7279t.getPadding(rect);
                F += rect.left;
                I += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.e.k(this, F, paddingTop, I, paddingBottom);
        }
    }

    public final void l() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.K);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.a.D(this, this.n);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, M);
        }
        if (f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.H) {
            b bVar = this.G;
            int i11 = bVar.f15069l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.k(i11);
            }
            if (z10) {
                bVar.r(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f7519j) {
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= chipGroup.getChildCount()) {
                        i12 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i11) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i11)) == this) {
                            break;
                        }
                        i12++;
                    }
                    i11++;
                }
                i10 = i12;
            } else {
                i10 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i10, 1, false, isChecked()).f13496a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.E != i10) {
            this.E = i10;
            k();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.A) {
                    if (!contains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else if (this.A) {
                g();
                z10 = true;
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z10 = true;
            }
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7280u) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7280u) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.Q(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.Q(aVar.w0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.n;
        if (aVar == null) {
            this.f7282z = z10;
        } else if (aVar.f7300i0) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked == z10 || (onCheckedChangeListener = this.y) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.R(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.R(f.a.a(aVar.w0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.S(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.S(c0.a.c(aVar.w0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.T(aVar.w0.getResources().getBoolean(i10));
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.T(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar == null || aVar.Q == colorStateList) {
            return;
        }
        aVar.Q = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.U(c0.a.c(aVar.w0, i10));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.V(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.V(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.n;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.T0 = new WeakReference<>(null);
            }
            this.n = aVar;
            aVar.V0 = false;
            Objects.requireNonNull(aVar);
            aVar.T0 = new WeakReference<>(this);
            d(this.F);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar == null || aVar.f7313v0 == f10) {
            return;
        }
        aVar.f7313v0 = f10;
        aVar.invalidateSelf();
        aVar.O();
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.W(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.X(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.X(f.a.a(aVar.w0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.Y(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.Y(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.Z(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.Z(c0.a.c(aVar.w0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.a0(aVar.w0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.a0(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null && aVar.R != f10) {
            aVar.R = f10;
            aVar.invalidateSelf();
            aVar.O();
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.b0(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar == null || aVar.f7306o0 == f10) {
            return;
        }
        aVar.f7306o0 = f10;
        aVar.invalidateSelf();
        aVar.O();
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.c0(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.d0(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.d0(c0.a.c(aVar.w0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.e0(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.e0(aVar.w0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.f0(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null && aVar.f7299h0 != charSequence) {
            l0.a c10 = l0.a.c();
            aVar.f7299h0 = c10.d(charSequence, c10.f12161c, true);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.g0(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.g0(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.f0(f.a.a(aVar.w0, i10));
        }
        i();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.h0(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.h0(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.i0(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.i0(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.k0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.k0(c0.a.c(aVar.w0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.l0(z10);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r5, android.graphics.drawable.Drawable r6, android.graphics.drawable.Drawable r7, android.graphics.drawable.Drawable r8) {
        /*
            r4 = this;
            r0 = r4
            if (r5 != 0) goto L16
            r3 = 5
            if (r7 != 0) goto Lb
            super.setCompoundDrawablesRelative(r5, r6, r7, r8)
            r3 = 6
            return
        Lb:
            r2 = 1
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Please set end drawable using R.attr#closeIcon."
            r5.<init>(r6)
            r3 = 7
            throw r5
            r2 = 7
        L16:
            r2 = 1
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r3 = 6
            java.lang.String r3 = "Please set start drawable using R.attr#chipIcon."
            r6 = r3
            r5.<init>(r6)
            throw r5
            r3 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.setCompoundDrawablesRelative(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):void");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L14
            if (r7 != 0) goto L9
            super.setCompoundDrawablesWithIntrinsicBounds(r5, r6, r7, r8)
            r2 = 7
            return
        L9:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Please set end drawable using R.attr#closeIcon."
            r6 = r0
            r5.<init>(r6)
            r3 = 1
            throw r5
            r3 = 2
        L14:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Please set start drawable using R.attr#chipIcon."
            r6 = r0
            r5.<init>(r6)
            r1 = 7
            throw r5
            r1 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r4, android.graphics.drawable.Drawable r5, android.graphics.drawable.Drawable r6, android.graphics.drawable.Drawable r7) {
        /*
            r3 = this;
            r0 = r3
            if (r4 != 0) goto L16
            r2 = 6
            if (r6 != 0) goto Lb
            r2 = 6
            super.setCompoundDrawablesWithIntrinsicBounds(r4, r5, r6, r7)
            return
        Lb:
            r2 = 3
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Please set right drawable using R.attr#closeIcon."
            r4.<init>(r5)
            r2 = 7
            throw r4
            r2 = 5
        L16:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r2 = 4
            java.lang.String r5 = "Please set left drawable using R.attr#chipIcon."
            r4.<init>(r5)
            r2 = 3
            throw r4
            r2 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):void");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            g.b bVar = aVar.f3929c;
            if (bVar.f3950o != f10) {
                bVar.f3950o = f10;
                aVar.C();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.n == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.U0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.D = z10;
        d(this.F);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(ga.g gVar) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.f7305n0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.f7305n0 = ga.g.b(aVar.w0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.m0(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.m0(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.n0(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.n0(aVar.w0.getResources().getDimension(i10));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.n == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.W0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.y = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f7281w = onClickListener;
        i();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.o0(colorStateList);
        }
        if (!this.n.R0) {
            j();
        }
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.o0(c0.a.c(aVar.w0, i10));
            if (this.n.R0) {
                return;
            }
            j();
        }
    }

    @Override // cb.o
    public void setShapeAppearanceModel(k kVar) {
        com.google.android.material.chip.a aVar = this.n;
        aVar.f3929c.f3938a = kVar;
        aVar.invalidateSelf();
    }

    public void setShowMotionSpec(ga.g gVar) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.f7304m0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.f7304m0 = ga.g.b(aVar.w0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(aVar.V0 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.n;
        if (aVar2 != null) {
            aVar2.p0(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.C0.b(new d(aVar.w0, i10), aVar.w0);
        }
        l();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.C0.b(new d(aVar.w0, i10), aVar.w0);
        }
        l();
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.C0.b(dVar, aVar.w0);
        }
        l();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar == null || aVar.f7310s0 == f10) {
            return;
        }
        aVar.f7310s0 = f10;
        aVar.invalidateSelf();
        aVar.O();
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.q0(aVar.w0.getResources().getDimension(i10));
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar == null || aVar.f7309r0 == f10) {
            return;
        }
        aVar.f7309r0 = f10;
        aVar.invalidateSelf();
        aVar.O();
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.n;
        if (aVar != null) {
            aVar.r0(aVar.w0.getResources().getDimension(i10));
        }
    }
}
