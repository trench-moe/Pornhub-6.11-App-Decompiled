package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.v;
import androidx.transition.Fade;
import cb.k;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.internal.CheckableImageButton;
import gb.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import l.InterfaceC0186;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public int A;
    public ColorStateList A0;
    public boolean B;
    public boolean B0;
    public TextView C;
    public PorterDuff.Mode C0;
    public int D;
    public boolean D0;
    public int E;
    public Drawable E0;
    public CharSequence F;
    public int F0;
    public boolean G;
    public Drawable G0;
    public TextView H;
    public View.OnLongClickListener H0;
    public ColorStateList I;
    public View.OnLongClickListener I0;
    public int J;
    public final CheckableImageButton J0;
    public Fade K;
    public ColorStateList K0;
    public Fade L;
    public ColorStateList L0;
    public ColorStateList M;
    public ColorStateList M0;
    public ColorStateList N;
    public int N0;
    public CharSequence O;
    public int O0;
    public final TextView P;
    public int P0;
    public CharSequence Q;
    public ColorStateList Q0;
    public final TextView R;
    public int R0;
    public boolean S;
    public int S0;
    public CharSequence T;
    public int T0;
    public boolean U;
    public int U0;
    public cb.g V;
    public int V0;
    public cb.g W;
    public boolean W0;
    public final com.google.android.material.internal.a X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a0  reason: collision with root package name */
    public k f7749a0;

    /* renamed from: a1  reason: collision with root package name */
    public ValueAnimator f7750a1;

    /* renamed from: b0  reason: collision with root package name */
    public final int f7751b0;
    public boolean b1;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f7752c;

    /* renamed from: c0  reason: collision with root package name */
    public int f7753c0;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f7754c1;

    /* renamed from: d0  reason: collision with root package name */
    public int f7755d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f7756e0;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f7757f;

    /* renamed from: f0  reason: collision with root package name */
    public int f7758f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f7759g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f7760h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7761i0;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f7762j;

    /* renamed from: j0  reason: collision with root package name */
    public final Rect f7763j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Rect f7764k0;

    /* renamed from: l0  reason: collision with root package name */
    public final RectF f7765l0;

    /* renamed from: m  reason: collision with root package name */
    public final FrameLayout f7766m;

    /* renamed from: m0  reason: collision with root package name */
    public Typeface f7767m0;
    public EditText n;

    /* renamed from: n0  reason: collision with root package name */
    public final CheckableImageButton f7768n0;

    /* renamed from: o0  reason: collision with root package name */
    public ColorStateList f7769o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f7770p0;

    /* renamed from: q0  reason: collision with root package name */
    public PorterDuff.Mode f7771q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f7772r0;

    /* renamed from: s0  reason: collision with root package name */
    public Drawable f7773s0;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f7774t;

    /* renamed from: t0  reason: collision with root package name */
    public int f7775t0;

    /* renamed from: u  reason: collision with root package name */
    public int f7776u;

    /* renamed from: u0  reason: collision with root package name */
    public View.OnLongClickListener f7777u0;

    /* renamed from: v0  reason: collision with root package name */
    public final LinkedHashSet<f> f7778v0;

    /* renamed from: w  reason: collision with root package name */
    public int f7779w;
    public int w0;

    /* renamed from: x0  reason: collision with root package name */
    public final SparseArray<gb.k> f7780x0;
    public final l y;

    /* renamed from: y0  reason: collision with root package name */
    public final CheckableImageButton f7781y0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7782z;

    /* renamed from: z0  reason: collision with root package name */
    public final LinkedHashSet<g> f7783z0;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.A(!textInputLayout.f7754c1, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f7782z) {
                textInputLayout2.v(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.G) {
                textInputLayout3.B(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f7781y0.performClick();
            TextInputLayout.this.f7781y0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.n.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.X0.v(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends n0.a {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            EditText editText = this.d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence placeholderText = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !this.d.W0;
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z11 ? hint.toString() : BuildConfig.FLAVOR;
            if (z10) {
                bVar.f13479a.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                bVar.f13479a.setText(charSequence);
                if (z12 && placeholderText != null) {
                    bVar.f13479a.setText(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                bVar.f13479a.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    bVar.s(charSequence);
                } else {
                    if (z10) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    bVar.f13479a.setText(charSequence);
                }
                boolean z15 = !z10;
                if (i10 >= 26) {
                    bVar.f13479a.setShowingHintText(z15);
                } else {
                    bVar.p(4, z15);
                }
            }
            bVar.f13479a.setMaxTextLength((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                bVar.f13479a.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    /* loaded from: classes.dex */
    public static class h extends s0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f7788j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f7789m;
        public CharSequence n;

        /* renamed from: t  reason: collision with root package name */
        public CharSequence f7790t;

        /* renamed from: u  reason: collision with root package name */
        public CharSequence f7791u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7788j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7789m = parcel.readInt() == 1;
            this.n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7790t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7791u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("TextInputLayout.SavedState{");
            m10.append(Integer.toHexString(System.identityHashCode(this)));
            m10.append(" error=");
            m10.append((Object) this.f7788j);
            m10.append(" hint=");
            m10.append((Object) this.n);
            m10.append(" helperText=");
            m10.append((Object) this.f7790t);
            m10.append(" placeholderText=");
            m10.append((Object) this.f7791u);
            m10.append("}");
            return m10.toString();
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            TextUtils.writeToParcel(this.f7788j, parcel, i10);
            parcel.writeInt(this.f7789m ? 1 : 0);
            TextUtils.writeToParcel(this.n, parcel, i10);
            TextUtils.writeToParcel(this.f7790t, parcel, i10);
            TextUtils.writeToParcel(this.f7791u, parcel, i10);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x056b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r30, android.util.AttributeSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private gb.k getEndIconDelegate() {
        gb.k kVar = this.f7780x0.get(this.w0);
        return kVar != null ? kVar : this.f7780x0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.J0.getVisibility() == 0) {
            return this.J0;
        }
        if (k() && m()) {
            return this.f7781y0;
        }
        return null;
    }

    public static void p(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                p((ViewGroup) childAt, z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(com.google.android.material.internal.CheckableImageButton r7, android.view.View.OnLongClickListener r8) {
        /*
            java.util.WeakHashMap<android.view.View, n0.a0> r0 = n0.x.f13156a
            boolean r0 = n0.x.c.a(r7)
            r1 = 0
            r2 = 1
            if (r8 == 0) goto Ld
            r3 = 1
            r8 = r3
            goto L10
        Ld:
            r4 = 2
            r3 = 0
            r8 = r3
        L10:
            if (r0 != 0) goto L15
            if (r8 == 0) goto L17
            r6 = 1
        L15:
            r3 = 1
            r1 = r3
        L17:
            r5 = 1
            r7.setFocusable(r1)
            r5 = 7
            r7.setClickable(r0)
            r6 = 1
            r7.setPressable(r0)
            r6 = 6
            r7.setLongClickable(r8)
            r6 = 3
            if (r1 == 0) goto L2c
            r6 = 1
            goto L2e
        L2c:
            r3 = 2
            r2 = r3
        L2e:
            n0.x.d.s(r7, r2)
            r4 = 6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s(com.google.android.material.internal.CheckableImageButton, android.view.View$OnLongClickListener):void");
    }

    private void setEditText(EditText editText) {
        if (this.n != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.w0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.n = editText;
        setMinWidth(this.f7776u);
        setMaxWidth(this.f7779w);
        n();
        setTextInputAccessibilityDelegate(new e(this));
        this.X0.A(this.n.getTypeface());
        com.google.android.material.internal.a aVar = this.X0;
        float textSize = this.n.getTextSize();
        if (aVar.f7561m != textSize) {
            aVar.f7561m = textSize;
            aVar.l(false);
        }
        int gravity = this.n.getGravity();
        this.X0.p((gravity & (-113)) | 48);
        this.X0.t(gravity);
        this.n.addTextChangedListener(new a());
        if (this.L0 == null) {
            this.L0 = this.n.getHintTextColors();
        }
        if (this.S) {
            if (TextUtils.isEmpty(this.T)) {
                CharSequence hint = this.n.getHint();
                this.f7774t = hint;
                setHint(hint);
                this.n.setHint((CharSequence) null);
            }
            this.U = true;
        }
        if (this.C != null) {
            v(this.n.getText().length());
        }
        y();
        this.y.b();
        this.f7757f.bringToFront();
        this.f7762j.bringToFront();
        this.f7766m.bringToFront();
        this.J0.bringToFront();
        Iterator<f> it = this.f7778v0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        C();
        F();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        A(false, true);
    }

    private void setErrorIconVisible(boolean z10) {
        this.J0.setVisibility(z10 ? 0 : 8);
        this.f7766m.setVisibility(z10 ? 8 : 0);
        F();
        if (!k()) {
            x();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.T)) {
            this.T = charSequence;
            this.X0.z(charSequence);
            if (!this.W0) {
                o();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.G == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.H = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            Fade fade = new Fade();
            fade.f3214j = 87L;
            TimeInterpolator timeInterpolator = ga.a.f9886a;
            fade.f3215m = timeInterpolator;
            this.K = fade;
            fade.f3213f = 67L;
            Fade fade2 = new Fade();
            fade2.f3214j = 87L;
            fade2.f3215m = timeInterpolator;
            this.L = fade2;
            TextView textView = this.H;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.g.f(textView, 1);
            setPlaceholderTextAppearance(this.J);
            setPlaceholderTextColor(this.I);
            TextView textView2 = this.H;
            if (textView2 != null) {
                this.f7752c.addView(textView2);
                this.H.setVisibility(0);
                this.G = z10;
            }
        } else {
            TextView textView3 = this.H;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            this.H = null;
        }
        this.G = z10;
    }

    public final void A(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.n;
        int i10 = 0;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.n;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean e10 = this.y.e();
        ColorStateList colorStateList2 = this.L0;
        if (colorStateList2 != null) {
            this.X0.o(colorStateList2);
            this.X0.s(this.L0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.L0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.V0) : this.V0;
            this.X0.o(ColorStateList.valueOf(colorForState));
            this.X0.s(ColorStateList.valueOf(colorForState));
        } else if (e10) {
            com.google.android.material.internal.a aVar = this.X0;
            TextView textView2 = this.y.f9925l;
            aVar.o(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.B && (textView = this.C) != null) {
            this.X0.o(textView.getTextColors());
        } else if (z13 && (colorStateList = this.M0) != null) {
            this.X0.o(colorStateList);
        }
        if (z12 || !this.Y0 || (isEnabled() && z13)) {
            if (z11 || this.W0) {
                ValueAnimator valueAnimator = this.f7750a1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f7750a1.cancel();
                }
                if (z10 && this.Z0) {
                    b(1.0f);
                } else {
                    this.X0.v(1.0f);
                }
                this.W0 = false;
                if (h()) {
                    o();
                }
                EditText editText3 = this.n;
                if (editText3 != null) {
                    i10 = editText3.getText().length();
                }
                B(i10);
                D();
                G();
            }
        } else if (z11 || !this.W0) {
            ValueAnimator valueAnimator2 = this.f7750a1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f7750a1.cancel();
            }
            if (z10 && this.Z0) {
                b(0.0f);
            } else {
                this.X0.v(0.0f);
            }
            if (h() && (!((gb.f) this.V).Q.isEmpty()) && h()) {
                ((gb.f) this.V).D(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.W0 = true;
            l();
            D();
            G();
        }
    }

    public final void B(int i10) {
        if (i10 != 0 || this.W0) {
            l();
        } else {
            TextView textView = this.H;
            if (textView != null && this.G) {
                textView.setText(this.F);
                androidx.transition.d.a(this.f7752c, this.K);
                this.H.setVisibility(0);
                this.H.bringToFront();
            }
        }
    }

    public final void C() {
        if (this.n == null) {
            return;
        }
        int i10 = 0;
        if (!(this.f7768n0.getVisibility() == 0)) {
            EditText editText = this.n;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            i10 = x.e.f(editText);
        }
        TextView textView = this.P;
        int compoundPaddingTop = this.n.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.n.getCompoundPaddingBottom();
        WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
        x.e.k(textView, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void D() {
        this.P.setVisibility((this.O == null || this.W0) ? 8 : 0);
        x();
    }

    public final void E(boolean z10, boolean z11) {
        int defaultColor = this.Q0.getDefaultColor();
        int colorForState = this.Q0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.Q0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f7760h0 = colorForState2;
        } else if (z11) {
            this.f7760h0 = colorForState;
        } else {
            this.f7760h0 = defaultColor;
        }
    }

    public final void F() {
        if (this.n == null) {
            return;
        }
        int i10 = 0;
        if (!m()) {
            if (!(this.J0.getVisibility() == 0)) {
                EditText editText = this.n;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                i10 = x.e.e(editText);
            }
        }
        TextView textView = this.R;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.n.getPaddingTop();
        int paddingBottom = this.n.getPaddingBottom();
        WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
        x.e.k(textView, dimensionPixelSize, paddingTop, i10, paddingBottom);
    }

    public final void G() {
        int visibility = this.R.getVisibility();
        boolean z10 = (this.Q == null || this.W0) ? false : true;
        this.R.setVisibility(z10 ? 0 : 8);
        if (visibility != this.R.getVisibility()) {
            getEndIconDelegate().c(z10);
        }
        x();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void H() {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.H():void");
    }

    public void a(f fVar) {
        this.f7778v0.add(fVar);
        if (this.n != null) {
            fVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f7752c.addView(view, layoutParams2);
        this.f7752c.setLayoutParams(layoutParams);
        z();
        setEditText((EditText) view);
    }

    public void b(float f10) {
        if (this.X0.f7545c == f10) {
            return;
        }
        if (this.f7750a1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f7750a1 = valueAnimator;
            valueAnimator.setInterpolator(ga.a.f9887b);
            this.f7750a1.setDuration(167L);
            this.f7750a1.addUpdateListener(new d());
        }
        this.f7750a1.setFloatValues(this.X0.f7545c, f10);
        this.f7750a1.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r7 = this;
            cb.g r0 = r7.V
            r6 = 7
            if (r0 != 0) goto L6
            return
        L6:
            r6 = 5
            cb.k r1 = r7.f7749a0
            r0.setShapeAppearanceModel(r1)
            r6 = 7
            int r0 = r7.f7753c0
            r6 = 7
            r6 = 2
            r1 = r6
            r2 = -1
            r6 = 0
            r3 = r6
            r6 = 1
            r4 = r6
            if (r0 != r1) goto L2f
            r6 = 5
            int r0 = r7.f7756e0
            if (r0 <= r2) goto L26
            r6 = 4
            int r0 = r7.f7760h0
            if (r0 == 0) goto L26
            r6 = 5
            r0 = 1
            goto L29
        L26:
            r6 = 6
            r6 = 0
            r0 = r6
        L29:
            if (r0 == 0) goto L2f
            r6 = 6
            r0 = 1
            r6 = 2
            goto L31
        L2f:
            r6 = 0
            r0 = r6
        L31:
            if (r0 == 0) goto L3f
            r6 = 4
            cb.g r0 = r7.V
            int r1 = r7.f7756e0
            r6 = 5
            float r1 = (float) r1
            int r5 = r7.f7760h0
            r0.w(r1, r5)
        L3f:
            r6 = 2
            int r0 = r7.f7761i0
            r6 = 3
            int r1 = r7.f7753c0
            r6 = 4
            if (r1 != r4) goto L5c
            r0 = 2130968885(0x7f040135, float:1.7546436E38)
            android.content.Context r6 = r7.getContext()
            r1 = r6
            int r6 = l9.e.d(r1, r0, r3)
            r0 = r6
            int r1 = r7.f7761i0
            int r6 = e0.a.f(r1, r0)
            r0 = r6
        L5c:
            r6 = 3
            r7.f7761i0 = r0
            cb.g r1 = r7.V
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.r(r0)
            int r0 = r7.w0
            r6 = 4
            r1 = 3
            if (r0 != r1) goto L79
            r6 = 6
            android.widget.EditText r0 = r7.n
            r6 = 7
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L79:
            cb.g r0 = r7.W
            if (r0 != 0) goto L7f
            r6 = 7
            goto L9b
        L7f:
            int r1 = r7.f7756e0
            if (r1 <= r2) goto L89
            int r1 = r7.f7760h0
            if (r1 == 0) goto L89
            r3 = 1
            r6 = 5
        L89:
            if (r3 == 0) goto L96
            r6 = 5
            int r1 = r7.f7760h0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.r(r1)
            r6 = 7
        L96:
            r6 = 2
            r7.invalidate()
            r6 = 4
        L9b:
            r7.invalidate()
            r6 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.c():void");
    }

    public final void d() {
        e(this.f7781y0, this.B0, this.A0, this.D0, this.C0);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.n;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f7774t != null) {
            boolean z10 = this.U;
            this.U = false;
            CharSequence hint = editText.getHint();
            this.n.setHint(this.f7774t);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                this.n.setHint(hint);
                this.U = z10;
                return;
            } catch (Throwable th) {
                this.n.setHint(hint);
                this.U = z10;
                throw th;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f7752c.getChildCount());
        for (int i11 = 0; i11 < this.f7752c.getChildCount(); i11++) {
            View childAt = this.f7752c.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.n) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f7754c1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f7754c1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.S) {
            this.X0.f(canvas);
        }
        cb.g gVar = this.W;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f7756e0;
            this.W.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.b1) {
            return;
        }
        boolean z10 = true;
        this.b1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.X0;
        boolean y = aVar != null ? aVar.y(drawableState) | false : false;
        if (this.n != null) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            A((x.g.c(this) && isEnabled()) ? false : false, false);
        }
        y();
        H();
        if (y) {
            invalidate();
        }
        this.b1 = false;
    }

    public final void e(CheckableImageButton checkableImageButton, boolean z10, ColorStateList colorStateList, boolean z11, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z10 || z11)) {
            drawable = f0.a.h(drawable).mutate();
            if (z10) {
                drawable.setTintList(colorStateList);
            }
            if (z11) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public final void f() {
        e(this.f7768n0, this.f7770p0, this.f7769o0, this.f7772r0, this.f7771q0);
    }

    public final int g() {
        float g10;
        if (this.S) {
            int i10 = this.f7753c0;
            if (i10 == 0 || i10 == 1) {
                g10 = this.X0.g();
            } else if (i10 != 2) {
                return 0;
            } else {
                g10 = this.X0.g() / 2.0f;
            }
            return (int) g10;
        }
        return 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.n;
        if (editText != null) {
            return g() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public cb.g getBoxBackground() {
        int i10 = this.f7753c0;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.V;
    }

    public int getBoxBackgroundColor() {
        return this.f7761i0;
    }

    public int getBoxBackgroundMode() {
        return this.f7753c0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f7755d0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        cb.g gVar = this.V;
        return gVar.f3929c.f3938a.f3966h.a(gVar.i());
    }

    public float getBoxCornerRadiusBottomStart() {
        cb.g gVar = this.V;
        return gVar.f3929c.f3938a.f3965g.a(gVar.i());
    }

    public float getBoxCornerRadiusTopEnd() {
        cb.g gVar = this.V;
        return gVar.f3929c.f3938a.f3964f.a(gVar.i());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.V.m();
    }

    public int getBoxStrokeColor() {
        return this.P0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.Q0;
    }

    public int getBoxStrokeWidth() {
        return this.f7758f0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f7759g0;
    }

    public int getCounterMaxLength() {
        return this.A;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f7782z && this.B && (textView = this.C) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.M;
    }

    public ColorStateList getCounterTextColor() {
        return this.M;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.L0;
    }

    public EditText getEditText() {
        return this.n;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f7781y0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f7781y0.getDrawable();
    }

    public int getEndIconMode() {
        return this.w0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f7781y0;
    }

    public CharSequence getError() {
        l lVar = this.y;
        if (lVar.f9924k) {
            return lVar.f9923j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.y.f9926m;
    }

    public int getErrorCurrentTextColors() {
        return this.y.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.J0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.y.g();
    }

    public CharSequence getHelperText() {
        l lVar = this.y;
        if (lVar.f9929q) {
            return lVar.f9928p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.y.f9930r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.S) {
            return this.T;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.X0.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.X0.h();
    }

    public ColorStateList getHintTextColor() {
        return this.M0;
    }

    public int getMaxWidth() {
        return this.f7779w;
    }

    public int getMinWidth() {
        return this.f7776u;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f7781y0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f7781y0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.G) {
            return this.F;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.J;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.I;
    }

    public CharSequence getPrefixText() {
        return this.O;
    }

    public ColorStateList getPrefixTextColor() {
        return this.P.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.P;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f7768n0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f7768n0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.Q;
    }

    public ColorStateList getSuffixTextColor() {
        return this.R.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.R;
    }

    public Typeface getTypeface() {
        return this.f7767m0;
    }

    public final boolean h() {
        return this.S && !TextUtils.isEmpty(this.T) && (this.V instanceof gb.f);
    }

    public final int i(int i10, boolean z10) {
        int compoundPaddingLeft = this.n.getCompoundPaddingLeft() + i10;
        return (this.O == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - this.P.getMeasuredWidth()) + this.P.getPaddingLeft();
    }

    public final int j(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.n.getCompoundPaddingRight();
        return (this.O == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (this.P.getMeasuredWidth() - this.P.getPaddingRight());
    }

    public final boolean k() {
        return this.w0 != 0;
    }

    public final void l() {
        TextView textView = this.H;
        if (textView != null && this.G) {
            textView.setText((CharSequence) null);
            androidx.transition.d.a(this.f7752c, this.L);
            this.H.setVisibility(4);
        }
    }

    public boolean m() {
        return this.f7766m.getVisibility() == 0 && this.f7781y0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.n():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
        r2 = r1.f7542a0 + r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o():void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.n;
        if (editText != null) {
            Rect rect = this.f7763j0;
            ua.a.a(this, editText, rect);
            cb.g gVar = this.W;
            if (gVar != null) {
                int i14 = rect.bottom;
                gVar.setBounds(rect.left, i14 - this.f7759g0, rect.right, i14);
            }
            if (this.S) {
                com.google.android.material.internal.a aVar = this.X0;
                float textSize = this.n.getTextSize();
                if (aVar.f7561m != textSize) {
                    aVar.f7561m = textSize;
                    aVar.l(false);
                }
                int gravity = this.n.getGravity();
                this.X0.p((gravity & (-113)) | 48);
                this.X0.t(gravity);
                com.google.android.material.internal.a aVar2 = this.X0;
                if (this.n == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.f7764k0;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                boolean z11 = x.e.d(this) == 1;
                rect2.bottom = rect.bottom;
                int i15 = this.f7753c0;
                if (i15 == 1) {
                    rect2.left = i(rect.left, z11);
                    rect2.top = rect.top + this.f7755d0;
                    rect2.right = j(rect.right, z11);
                } else if (i15 != 2) {
                    rect2.left = i(rect.left, z11);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z11);
                } else {
                    rect2.left = this.n.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - g();
                    rect2.right = rect.right - this.n.getPaddingRight();
                }
                Objects.requireNonNull(aVar2);
                int i16 = rect2.left;
                int i17 = rect2.top;
                int i18 = rect2.right;
                int i19 = rect2.bottom;
                if (!com.google.android.material.internal.a.m(aVar2.f7556i, i16, i17, i18, i19)) {
                    aVar2.f7556i.set(i16, i17, i18, i19);
                    aVar2.K = true;
                    aVar2.k();
                }
                com.google.android.material.internal.a aVar3 = this.X0;
                if (this.n == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.f7764k0;
                TextPaint textPaint = aVar3.M;
                textPaint.setTextSize(aVar3.f7561m);
                textPaint.setTypeface(aVar3.y);
                textPaint.setLetterSpacing(aVar3.Y);
                float f10 = -aVar3.M.ascent();
                rect3.left = this.n.getCompoundPaddingLeft() + rect.left;
                rect3.top = this.f7753c0 == 1 && this.n.getMinLines() <= 1 ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.n.getCompoundPaddingTop();
                rect3.right = rect.right - this.n.getCompoundPaddingRight();
                int compoundPaddingBottom = this.f7753c0 == 1 && this.n.getMinLines() <= 1 ? (int) (rect3.top + f10) : rect.bottom - this.n.getCompoundPaddingBottom();
                rect3.bottom = compoundPaddingBottom;
                int i20 = rect3.left;
                int i21 = rect3.top;
                int i22 = rect3.right;
                if (!com.google.android.material.internal.a.m(aVar3.f7554h, i20, i21, i22, compoundPaddingBottom)) {
                    aVar3.f7554h.set(i20, i21, i22, compoundPaddingBottom);
                    aVar3.K = true;
                    aVar3.k();
                }
                this.X0.l(false);
                if (h() && !this.W0) {
                    o();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int max;
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = false;
        if (this.n != null && this.n.getMeasuredHeight() < (max = Math.max(this.f7762j.getMeasuredHeight(), this.f7757f.getMeasuredHeight()))) {
            this.n.setMinimumHeight(max);
            z10 = true;
        }
        boolean x10 = x();
        if (!z10) {
            if (x10) {
            }
            if (this.H != null && (editText = this.n) != null) {
                this.H.setGravity(editText.getGravity());
                this.H.setPadding(this.n.getCompoundPaddingLeft(), this.n.getCompoundPaddingTop(), this.n.getCompoundPaddingRight(), this.n.getCompoundPaddingBottom());
            }
            C();
            F();
        }
        this.n.post(new c());
        if (this.H != null) {
            this.H.setGravity(editText.getGravity());
            this.H.setPadding(this.n.getCompoundPaddingLeft(), this.n.getCompoundPaddingTop(), this.n.getCompoundPaddingRight(), this.n.getCompoundPaddingBottom());
        }
        C();
        F();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f14775c);
        setError(hVar.f7788j);
        if (hVar.f7789m) {
            this.f7781y0.post(new b());
        }
        setHint(hVar.n);
        setHelperText(hVar.f7790t);
        setPlaceholderText(hVar.f7791u);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.y.e()) {
            hVar.f7788j = getError();
        }
        hVar.f7789m = k() && this.f7781y0.isChecked();
        hVar.n = getHint();
        hVar.f7790t = getHelperText();
        hVar.f7791u = getPlaceholderText();
        return hVar;
    }

    public void q() {
        r(this.f7781y0, this.A0);
    }

    public final void r(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = f0.a.h(drawable).mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f7761i0 != i10) {
            this.f7761i0 = i10;
            this.R0 = i10;
            this.T0 = i10;
            this.U0 = i10;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(c0.a.b(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.R0 = defaultColor;
        this.f7761i0 = defaultColor;
        this.S0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.T0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.U0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f7753c0) {
            return;
        }
        this.f7753c0 = i10;
        if (this.n != null) {
            n();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f7755d0 = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.P0 != i10) {
            this.P0 = i10;
            H();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.N0 = colorStateList.getDefaultColor();
            this.V0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.O0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.P0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.P0 != colorStateList.getDefaultColor()) {
            this.P0 = colorStateList.getDefaultColor();
        }
        H();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.Q0 != colorStateList) {
            this.Q0 = colorStateList;
            H();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f7758f0 = i10;
        H();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f7759g0 = i10;
        H();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f7782z != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.C = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f7767m0;
                if (typeface != null) {
                    this.C.setTypeface(typeface);
                }
                this.C.setMaxLines(1);
                this.y.a(this.C, 2);
                ((ViewGroup.MarginLayoutParams) this.C.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                w();
                u();
            } else {
                this.y.j(this.C, 2);
                this.C = null;
            }
            this.f7782z = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.A != i10) {
            if (i10 > 0) {
                this.A = i10;
            } else {
                this.A = -1;
            }
            if (this.f7782z) {
                u();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.D != i10) {
            this.D = i10;
            w();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            w();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.E != i10) {
            this.E = i10;
            w();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            w();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.L0 = colorStateList;
        this.M0 = colorStateList;
        if (this.n != null) {
            A(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        p(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f7781y0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f7781y0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f7781y0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? f.a.a(getContext(), i10) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f7781y0.setImageDrawable(drawable);
        if (drawable != null) {
            d();
            q();
        }
    }

    public void setEndIconMode(int i10) {
        int i11 = this.w0;
        this.w0 = i10;
        Iterator<g> it = this.f7783z0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i11);
        }
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.f7753c0)) {
            getEndIconDelegate().a();
            d();
            return;
        }
        StringBuilder m10 = a1.a.m("The current box background mode ");
        m10.append(this.f7753c0);
        m10.append(" is not supported by the end icon mode ");
        m10.append(i10);
        throw new IllegalStateException(m10.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f7781y0;
        View.OnLongClickListener onLongClickListener = this.H0;
        checkableImageButton.setOnClickListener(onClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.H0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f7781y0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            this.B0 = true;
            d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.C0 != mode) {
            this.C0 = mode;
            this.D0 = true;
            d();
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (m() != z10) {
            this.f7781y0.setVisibility(z10 ? 0 : 8);
            F();
            x();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.y.f9924k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.y.i();
            return;
        }
        l lVar = this.y;
        lVar.c();
        lVar.f9923j = charSequence;
        lVar.f9925l.setText(charSequence);
        int i10 = lVar.f9921h;
        if (i10 != 1) {
            lVar.f9922i = 1;
        }
        lVar.l(i10, lVar.f9922i, lVar.k(lVar.f9925l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        l lVar = this.y;
        lVar.f9926m = charSequence;
        TextView textView = lVar.f9925l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        l lVar = this.y;
        if (lVar.f9924k == z10) {
            return;
        }
        lVar.c();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(lVar.f9915a, null);
            lVar.f9925l = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            lVar.f9925l.setTextAlignment(5);
            Typeface typeface = lVar.f9933u;
            if (typeface != null) {
                lVar.f9925l.setTypeface(typeface);
            }
            int i10 = lVar.n;
            lVar.n = i10;
            TextView textView = lVar.f9925l;
            if (textView != null) {
                lVar.f9916b.t(textView, i10);
            }
            ColorStateList colorStateList = lVar.f9927o;
            lVar.f9927o = colorStateList;
            TextView textView2 = lVar.f9925l;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = lVar.f9926m;
            lVar.f9926m = charSequence;
            TextView textView3 = lVar.f9925l;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            lVar.f9925l.setVisibility(4);
            TextView textView4 = lVar.f9925l;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.g.f(textView4, 1);
            lVar.a(lVar.f9925l, 0);
        } else {
            lVar.i();
            lVar.j(lVar.f9925l, 0);
            lVar.f9925l = null;
            lVar.f9916b.y();
            lVar.f9916b.H();
        }
        lVar.f9924k = z10;
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? f.a.a(getContext(), i10) : null);
        r(this.J0, this.K0);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.J0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.y.f9924k);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.J0;
        View.OnLongClickListener onLongClickListener = this.I0;
        checkableImageButton.setOnClickListener(onClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.I0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.J0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.K0 = colorStateList;
        Drawable drawable = this.J0.getDrawable();
        if (drawable != null) {
            drawable = f0.a.h(drawable).mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.J0.getDrawable() != drawable) {
            this.J0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.J0.getDrawable();
        if (drawable != null) {
            drawable = f0.a.h(drawable).mutate();
            drawable.setTintMode(mode);
        }
        if (this.J0.getDrawable() != drawable) {
            this.J0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i10) {
        l lVar = this.y;
        lVar.n = i10;
        TextView textView = lVar.f9925l;
        if (textView != null) {
            lVar.f9916b.t(textView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        l lVar = this.y;
        lVar.f9927o = colorStateList;
        TextView textView = lVar.f9925l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.Y0 != z10) {
            this.Y0 = z10;
            A(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.y.f9929q) {
                setHelperTextEnabled(true);
            }
            l lVar = this.y;
            lVar.c();
            lVar.f9928p = charSequence;
            lVar.f9930r.setText(charSequence);
            int i10 = lVar.f9921h;
            if (i10 != 2) {
                lVar.f9922i = 2;
            }
            lVar.l(i10, lVar.f9922i, lVar.k(lVar.f9930r, charSequence));
        } else if (this.y.f9929q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        l lVar = this.y;
        lVar.f9932t = colorStateList;
        TextView textView = lVar.f9930r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        l lVar = this.y;
        if (lVar.f9929q == z10) {
            return;
        }
        lVar.c();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(lVar.f9915a, null);
            lVar.f9930r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            lVar.f9930r.setTextAlignment(5);
            Typeface typeface = lVar.f9933u;
            if (typeface != null) {
                lVar.f9930r.setTypeface(typeface);
            }
            lVar.f9930r.setVisibility(4);
            TextView textView = lVar.f9930r;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.g.f(textView, 1);
            int i10 = lVar.f9931s;
            lVar.f9931s = i10;
            TextView textView2 = lVar.f9930r;
            if (textView2 != null) {
                q0.h.f(textView2, i10);
            }
            ColorStateList colorStateList = lVar.f9932t;
            lVar.f9932t = colorStateList;
            TextView textView3 = lVar.f9930r;
            if (textView3 != null && colorStateList != null) {
                textView3.setTextColor(colorStateList);
            }
            lVar.a(lVar.f9930r, 1);
        } else {
            lVar.c();
            int i11 = lVar.f9921h;
            if (i11 == 2) {
                lVar.f9922i = 0;
            }
            lVar.l(i11, lVar.f9922i, lVar.k(lVar.f9930r, null));
            lVar.j(lVar.f9930r, 1);
            lVar.f9930r = null;
            lVar.f9916b.y();
            lVar.f9916b.H();
        }
        lVar.f9929q = z10;
    }

    public void setHelperTextTextAppearance(int i10) {
        l lVar = this.y;
        lVar.f9931s = i10;
        TextView textView = lVar.f9930r;
        if (textView != null) {
            q0.h.f(textView, i10);
        }
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.S) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(InterfaceC0186.f43);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.Z0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.S) {
            this.S = z10;
            if (z10) {
                CharSequence hint = this.n.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.T)) {
                        setHint(hint);
                    }
                    this.n.setHint((CharSequence) null);
                }
                this.U = true;
            } else {
                this.U = false;
                if (!TextUtils.isEmpty(this.T) && TextUtils.isEmpty(this.n.getHint())) {
                    this.n.setHint(this.T);
                }
                setHintInternal(null);
            }
            if (this.n != null) {
                z();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.X0.n(i10);
        this.M0 = this.X0.f7563p;
        if (this.n != null) {
            A(false, false);
            z();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            if (this.L0 == null) {
                com.google.android.material.internal.a aVar = this.X0;
                if (aVar.f7563p != colorStateList) {
                    aVar.f7563p = colorStateList;
                    aVar.l(false);
                }
            }
            this.M0 = colorStateList;
            if (this.n != null) {
                A(false, false);
            }
        }
    }

    public void setMaxWidth(int i10) {
        this.f7779w = i10;
        EditText editText = this.n;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinWidth(int i10) {
        this.f7776u = i10;
        EditText editText = this.n;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f7781y0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? f.a.a(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f7781y0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.w0 != 1) {
            setEndIconMode(1);
            return;
        }
        if (!z10) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.A0 = colorStateList;
        this.B0 = true;
        d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.C0 = mode;
        this.D0 = true;
        d();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i10 = 0;
        if (this.G && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.G) {
                setPlaceholderTextEnabled(true);
            }
            this.F = charSequence;
        }
        EditText editText = this.n;
        if (editText != null) {
            i10 = editText.getText().length();
        }
        B(i10);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.J = i10;
        TextView textView = this.H;
        if (textView != null) {
            q0.h.f(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            TextView textView = this.H;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.O = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.P.setText(charSequence);
        D();
    }

    public void setPrefixTextAppearance(int i10) {
        q0.h.f(this.P, i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.P.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f7768n0.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f7768n0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? f.a.a(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f7768n0.setImageDrawable(drawable);
        if (drawable != null) {
            f();
            setStartIconVisible(true);
            r(this.f7768n0, this.f7769o0);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f7768n0;
        View.OnLongClickListener onLongClickListener = this.f7777u0;
        checkableImageButton.setOnClickListener(onClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7777u0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f7768n0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f7769o0 != colorStateList) {
            this.f7769o0 = colorStateList;
            this.f7770p0 = true;
            f();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f7771q0 != mode) {
            this.f7771q0 = mode;
            this.f7772r0 = true;
            f();
        }
    }

    public void setStartIconVisible(boolean z10) {
        int i10 = 0;
        if ((this.f7768n0.getVisibility() == 0) != z10) {
            CheckableImageButton checkableImageButton = this.f7768n0;
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            C();
            x();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.Q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.R.setText(charSequence);
        G();
    }

    public void setSuffixTextAppearance(int i10) {
        q0.h.f(this.R, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.R.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.n;
        if (editText != null) {
            x.v(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f7767m0) {
            this.f7767m0 = typeface;
            this.X0.A(typeface);
            l lVar = this.y;
            if (typeface != lVar.f9933u) {
                lVar.f9933u = typeface;
                TextView textView = lVar.f9925l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = lVar.f9930r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.C;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r7.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(android.widget.TextView r7, int r8) {
        /*
            r6 = this;
            r2 = r6
            r0 = 1
            r4 = 7
            q0.h.f(r7, r8)     // Catch: java.lang.Exception -> L22
            r4 = 3
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L22
            r4 = 2
            r5 = 23
            r1 = r5
            if (r8 < r1) goto L1d
            android.content.res.ColorStateList r8 = r7.getTextColors()     // Catch: java.lang.Exception -> L22
            int r8 = r8.getDefaultColor()     // Catch: java.lang.Exception -> L22
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r8 != r1) goto L1d
            goto L24
        L1d:
            r4 = 2
            r8 = 0
            r0 = 0
            r5 = 3
            goto L24
        L22:
            r4 = 7
        L24:
            if (r0 == 0) goto L3e
            r4 = 2
            r8 = 2132017617(0x7f1401d1, float:1.9673517E38)
            q0.h.f(r7, r8)
            android.content.Context r4 = r2.getContext()
            r8 = r4
            r0 = 2131099767(0x7f060077, float:1.7811897E38)
            int r5 = c0.a.b(r8, r0)
            r8 = r5
            r7.setTextColor(r8)
            r4 = 6
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.t(android.widget.TextView, int):void");
    }

    public final void u() {
        if (this.C != null) {
            EditText editText = this.n;
            v(editText == null ? 0 : editText.getText().length());
        }
    }

    public void v(int i10) {
        boolean z10 = this.B;
        int i11 = this.A;
        String str = null;
        if (i11 == -1) {
            this.C.setText(String.valueOf(i10));
            this.C.setContentDescription(null);
            this.B = false;
        } else {
            this.B = i10 > i11;
            Context context = getContext();
            this.C.setContentDescription(context.getString(this.B ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i10), Integer.valueOf(this.A)));
            if (z10 != this.B) {
                w();
            }
            l0.a c10 = l0.a.c();
            TextView textView = this.C;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.A));
            l0.c cVar = c10.f12161c;
            if (string != null) {
                str = c10.d(string, cVar, true).toString();
            }
            textView.setText(str);
        }
        if (this.n == null || z10 == this.B) {
            return;
        }
        A(false, false);
        H();
        y();
    }

    public final void w() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.C;
        if (textView != null) {
            t(textView, this.B ? this.D : this.E);
            if (!this.B && (colorStateList2 = this.M) != null) {
                this.C.setTextColor(colorStateList2);
            }
            if (!this.B || (colorStateList = this.N) == null) {
                return;
            }
            this.C.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():boolean");
    }

    public void y() {
        Drawable background;
        TextView textView;
        EditText editText = this.n;
        if (editText != null) {
            if (this.f7753c0 != 0 || (background = editText.getBackground()) == null) {
                return;
            }
            if (v.a(background)) {
                background = background.mutate();
            }
            if (this.y.e()) {
                background.setColorFilter(androidx.appcompat.widget.h.c(this.y.g(), PorterDuff.Mode.SRC_IN));
            } else if (this.B && (textView = this.C) != null) {
                background.setColorFilter(androidx.appcompat.widget.h.c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                f0.a.a(background);
                this.n.refreshDrawableState();
            }
        }
    }

    public final void z() {
        if (this.f7753c0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7752c.getLayoutParams();
            int g10 = g();
            if (g10 != layoutParams.topMargin) {
                layoutParams.topMargin = g10;
                this.f7752c.requestLayout();
            }
        }
    }
}
