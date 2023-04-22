package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.d;
import com.app.pornhub.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: j0  reason: collision with root package name */
    public static final Property<SwitchCompat, Float> f901j0 = new a(Float.class, "thumbPos");

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f902k0 = {16842912};
    public int A;
    public int B;
    public int C;
    public boolean D;
    public CharSequence E;
    public CharSequence F;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public int J;
    public int K;
    public float L;
    public float M;
    public VelocityTracker N;
    public int O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public final TextPaint f903a0;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f904b0;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f905c;

    /* renamed from: c0  reason: collision with root package name */
    public Layout f906c0;

    /* renamed from: d0  reason: collision with root package name */
    public Layout f907d0;

    /* renamed from: e0  reason: collision with root package name */
    public TransformationMethod f908e0;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f909f;

    /* renamed from: f0  reason: collision with root package name */
    public ObjectAnimator f910f0;

    /* renamed from: g0  reason: collision with root package name */
    public j f911g0;

    /* renamed from: h0  reason: collision with root package name */
    public b f912h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Rect f913i0;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f914j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f915m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f916t;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f917u;

    /* renamed from: w  reason: collision with root package name */
    public PorterDuff.Mode f918w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f919z;

    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.P);
        }

        @Override // android.util.Property
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<SwitchCompat> f920a;

        public b(SwitchCompat switchCompat) {
            this.f920a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.d.e
        public void a(Throwable th) {
            SwitchCompat switchCompat = this.f920a.get();
            if (switchCompat != null) {
                switchCompat.e();
            }
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            SwitchCompat switchCompat = this.f920a.get();
            if (switchCompat != null) {
                switchCompat.e();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int resourceId;
        this.f909f = null;
        this.f914j = null;
        this.f915m = false;
        this.n = false;
        this.f917u = null;
        this.f918w = null;
        this.y = false;
        this.f919z = false;
        this.N = VelocityTracker.obtain();
        this.f913i0 = new Rect();
        k0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f903a0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = b7.k.S;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        p0 p0Var = new p0(context, obtainStyledAttributes);
        n0.x.u(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        Drawable g10 = p0Var.g(2);
        this.f905c = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = p0Var.g(11);
        this.f916t = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(p0Var.o(0));
        setTextOffInternal(p0Var.o(1));
        this.I = p0Var.a(3, true);
        this.A = p0Var.f(8, 0);
        this.B = p0Var.f(5, 0);
        this.C = p0Var.f(6, 0);
        this.D = p0Var.a(4, false);
        ColorStateList c10 = p0Var.c(9);
        if (c10 != null) {
            this.f909f = c10;
            this.f915m = true;
        }
        PorterDuff.Mode e10 = v.e(p0Var.j(10, -1), null);
        if (this.f914j != e10) {
            this.f914j = e10;
            this.n = true;
        }
        if (this.f915m || this.n) {
            a();
        }
        ColorStateList c11 = p0Var.c(12);
        if (c11 != null) {
            this.f917u = c11;
            this.y = true;
        }
        PorterDuff.Mode e11 = v.e(p0Var.j(13, -1), null);
        if (this.f918w != e11) {
            this.f918w = e11;
            this.f919z = true;
        }
        if (this.y || this.f919z) {
            b();
        }
        int m10 = p0Var.m(7, 0);
        if (m10 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(m10, b7.k.T);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = c0.a.c(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f904b0 = colorStateList;
            } else {
                this.f904b0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i11 = obtainStyledAttributes2.getInt(1, -1);
            int i12 = obtainStyledAttributes2.getInt(2, -1);
            Typeface typeface = i11 != 1 ? i11 != 2 ? i11 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i12 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i12) : Typeface.create(typeface, i12);
                setSwitchTypeface(defaultFromStyle);
                int i13 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i12;
                textPaint.setFakeBoldText((i13 & 1) != 0);
                textPaint.setTextSkewX((2 & i13) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                this.f908e0 = new i.a(getContext());
            } else {
                this.f908e0 = null;
            }
            setTextOnInternal(this.E);
            setTextOffInternal(this.G);
            obtainStyledAttributes2.recycle();
        }
        new q(this).e(attributeSet, i10);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.K = viewConfiguration.getScaledTouchSlop();
        this.O = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private j getEmojiTextViewHelper() {
        if (this.f911g0 == null) {
            this.f911g0 = new j(this);
        }
        return this.f911g0;
    }

    private boolean getTargetCheckedState() {
        return this.P > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((x0.b(this) ? 1.0f - this.P : this.P) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f916t;
        if (drawable != null) {
            Rect rect = this.f913i0;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f905c;
            Rect d = drawable2 != null ? v.d(drawable2) : v.f1117c;
            return ((((this.Q - this.S) - rect.left) - rect.right) - d.left) - d.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.G = charSequence;
        this.H = c(charSequence);
        this.f907d0 = null;
        if (this.I) {
            h();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.E = charSequence;
        this.F = c(charSequence);
        this.f906c0 = null;
        if (this.I) {
            h();
        }
    }

    public final void a() {
        Drawable drawable = this.f905c;
        if (drawable != null) {
            if (!this.f915m) {
                if (this.n) {
                }
            }
            Drawable mutate = f0.a.h(drawable).mutate();
            this.f905c = mutate;
            if (this.f915m) {
                mutate.setTintList(this.f909f);
            }
            if (this.n) {
                this.f905c.setTintMode(this.f914j);
            }
            if (this.f905c.isStateful()) {
                this.f905c.setState(getDrawableState());
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f916t;
        if (drawable != null) {
            if (!this.y) {
                if (this.f919z) {
                }
            }
            Drawable mutate = f0.a.h(drawable).mutate();
            this.f916t = mutate;
            if (this.y) {
                mutate.setTintList(this.f917u);
            }
            if (this.f919z) {
                this.f916t.setTintMode(this.f918w);
            }
            if (this.f916t.isStateful()) {
                this.f916t.setState(getDrawableState());
            }
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        TransformationMethod e10 = getEmojiTextViewHelper().f1024b.f18680a.e(this.f908e0);
        return e10 != null ? e10.getTransformation(charSequence, this) : charSequence;
    }

    public final Layout d(CharSequence charSequence) {
        TextPaint textPaint = this.f903a0;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f913i0;
        int i12 = this.T;
        int i13 = this.U;
        int i14 = this.V;
        int i15 = this.W;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f905c;
        Rect d = drawable != null ? v.d(drawable) : v.f1117c;
        Drawable drawable2 = this.f916t;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (d != null) {
                int i17 = d.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = d.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = d.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = d.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f916t.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f916t.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f905c;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.S + rect.right;
            this.f905c.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f905c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.f916t;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f905c;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f916t;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public void e() {
        setTextOnInternal(this.E);
        setTextOffInternal(this.G);
        requestLayout();
    }

    public final void f() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.G;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            new n0.v(R.id.tag_state_description, CharSequence.class, 64, 30).e(this, obj);
        }
    }

    public final void g() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.E;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            new n0.v(R.id.tag_state_description, CharSequence.class, 64, 30).e(this, charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (x0.b(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.Q;
            if (!TextUtils.isEmpty(getText())) {
                compoundPaddingLeft += this.C;
            }
            return compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (x0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.Q;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.C : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return q0.h.g(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.I;
    }

    public boolean getSplitTrack() {
        return this.D;
    }

    public int getSwitchMinWidth() {
        return this.B;
    }

    public int getSwitchPadding() {
        return this.C;
    }

    public CharSequence getTextOff() {
        return this.G;
    }

    public CharSequence getTextOn() {
        return this.E;
    }

    public Drawable getThumbDrawable() {
        return this.f905c;
    }

    public int getThumbTextPadding() {
        return this.A;
    }

    public ColorStateList getThumbTintList() {
        return this.f909f;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f914j;
    }

    public Drawable getTrackDrawable() {
        return this.f916t;
    }

    public ColorStateList getTrackTintList() {
        return this.f917u;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f918w;
    }

    public final void h() {
        if (this.f912h0 == null && this.f911g0.f1024b.f18680a.b() && androidx.emoji2.text.d.c()) {
            androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
            int b10 = a10.b();
            if (b10 != 3 && b10 != 0) {
                return;
            }
            b bVar = new b(this);
            this.f912h0 = bVar;
            a10.j(bVar);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f905c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f916t;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f910f0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f910f0.end();
        this.f910f0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f902k0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f913i0;
        Drawable drawable = this.f916t;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.U;
        int i11 = this.W;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f905c;
        if (drawable != null) {
            if (!this.D || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = v.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f906c0 : this.f907d0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f904b0;
            if (colorStateList != null) {
                this.f903a0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f903a0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.E : this.G;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        super.onLayout(z10, i10, i11, i12, i13);
        int i18 = 0;
        if (this.f905c != null) {
            Rect rect = this.f913i0;
            Drawable drawable = this.f916t;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = v.d(this.f905c);
            i14 = Math.max(0, d.left - rect.left);
            i18 = Math.max(0, d.right - rect.right);
        } else {
            i14 = 0;
        }
        if (x0.b(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.Q + i15) - i14) - i18;
        } else {
            width = (getWidth() - getPaddingRight()) - i18;
            i15 = (width - this.Q) + i14 + i18;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i19 = this.R;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i19 / 2);
            i16 = i19 + height;
            i17 = height;
        } else if (gravity != 80) {
            i17 = getPaddingTop();
            i16 = this.R + i17;
        } else {
            i16 = getHeight() - getPaddingBottom();
            i17 = i16 - this.R;
        }
        this.T = i15;
        this.U = i17;
        this.W = i16;
        this.V = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.I) {
            if (this.f906c0 == null) {
                this.f906c0 = d(this.F);
            }
            if (this.f907d0 == null) {
                this.f907d0 = d(this.H);
            }
        }
        Rect rect = this.f913i0;
        Drawable drawable = this.f905c;
        int i15 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f905c.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f905c.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (this.I) {
            i14 = (this.A * 2) + Math.max(this.f906c0.getWidth(), this.f907d0.getWidth());
        } else {
            i14 = 0;
        }
        this.S = Math.max(i14, i12);
        Drawable drawable2 = this.f916t;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i15 = this.f916t.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i16 = rect.left;
        int i17 = rect.right;
        Drawable drawable3 = this.f905c;
        if (drawable3 != null) {
            Rect d = v.d(drawable3);
            i16 = Math.max(i16, d.left);
            i17 = Math.max(i17, d.right);
        }
        int max = Math.max(this.B, (this.S * 2) + i16 + i17);
        int max2 = Math.max(i15, i13);
        this.Q = max;
        this.R = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.E : this.G;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        this.N.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked != 0) {
            float f10 = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.J;
                    if (i10 == 1) {
                        float x10 = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x10 - this.L) > this.K || Math.abs(y - this.M) > this.K) {
                            this.J = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.L = x10;
                            this.M = y;
                            return true;
                        }
                    } else if (i10 == 2) {
                        float x11 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f11 = x11 - this.L;
                        float f12 = thumbScrollRange != 0 ? f11 / thumbScrollRange : f11 > 0.0f ? 1.0f : -1.0f;
                        if (x0.b(this)) {
                            f12 = -f12;
                        }
                        float f13 = this.P;
                        float f14 = f12 + f13;
                        if (f14 >= 0.0f) {
                            f10 = f14 > 1.0f ? 1.0f : f14;
                        }
                        if (f10 != f13) {
                            this.L = x11;
                            setThumbPosition(f10);
                        }
                        return true;
                    }
                } else if (actionMasked != 3) {
                }
                return super.onTouchEvent(motionEvent);
            }
            if (this.J != 2) {
                this.J = 0;
                this.N.clear();
                return super.onTouchEvent(motionEvent);
            }
            this.J = 0;
            boolean z12 = motionEvent.getAction() == 1 && isEnabled();
            boolean isChecked = isChecked();
            if (z12) {
                this.N.computeCurrentVelocity(1000);
                float xVelocity = this.N.getXVelocity();
                if (Math.abs(xVelocity) <= this.O) {
                    z10 = getTargetCheckedState();
                } else if (x0.b(this)) {
                    if (xVelocity < 0.0f) {
                        z10 = true;
                    }
                    z10 = false;
                } else {
                    if (xVelocity > 0.0f) {
                        z10 = true;
                    }
                    z10 = false;
                }
            } else {
                z10 = isChecked;
            }
            if (z10 != isChecked) {
                playSoundEffect(0);
            }
            setChecked(z10);
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
            super.onTouchEvent(motionEvent);
            return true;
        }
        float x12 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (isEnabled()) {
            if (this.f905c != null) {
                int thumbOffset = getThumbOffset();
                this.f905c.getPadding(this.f913i0);
                int i11 = this.U;
                int i12 = this.K;
                int i13 = i11 - i12;
                int i14 = (this.T + thumbOffset) - i12;
                Rect rect = this.f913i0;
                int i15 = this.S + i14 + rect.left + rect.right + i12;
                int i16 = this.W + i12;
                if (x12 > i14 && x12 < i15 && y10 > i13 && y10 < i16) {
                    z11 = true;
                }
            }
            if (z11) {
                this.J = 1;
                this.L = x12;
                this.M = y10;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1024b.f18680a.c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            g();
        } else {
            f();
        }
        float f10 = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            if (x.g.c(this)) {
                if (!isChecked) {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f901j0, f10);
                this.f910f0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f910f0.setAutoCancel(true);
                this.f910f0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f910f0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f10 = 0.0f;
        }
        setThumbPosition(f10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q0.h.h(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().f1024b.f18680a.d(z10);
        setTextOnInternal(this.E);
        setTextOffInternal(this.G);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1024b.f18680a.a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            requestLayout();
            if (z10) {
                h();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.D = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.B = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f903a0.getTypeface() != null && !this.f903a0.getTypeface().equals(typeface)) || (this.f903a0.getTypeface() == null && typeface != null)) {
            this.f903a0.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        f();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            g();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f905c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f905c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.P = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(f.a.a(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.A = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f909f = colorStateList;
        this.f915m = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f914j = mode;
        this.n = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f916t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f916t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(f.a.a(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f917u = colorStateList;
        this.y = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f918w = mode;
        this.f919z = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f905c) {
            if (drawable != this.f916t) {
                return false;
            }
        }
        return true;
    }
}
