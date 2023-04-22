package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import cb.g;
import cb.k;
import com.app.pornhub.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import gb.h;
import gb.j;
import gb.k;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import ua.i;

/* loaded from: classes.dex */
public class b extends k {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f7805e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f7806f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.e f7807g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.f f7808h;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout.g f7809i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7810j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7811k;

    /* renamed from: l  reason: collision with root package name */
    public long f7812l;

    /* renamed from: m  reason: collision with root package name */
    public StateListDrawable f7813m;
    public g n;

    /* renamed from: o  reason: collision with root package name */
    public AccessibilityManager f7814o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f7815p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f7816q;

    /* loaded from: classes.dex */
    public class a extends i {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0097a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f7818c;

            public RunnableC0097a(AutoCompleteTextView autoCompleteTextView) {
                this.f7818c = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f7818c.isPopupShowing();
                b.f(b.this, isPopupShowing);
                b.this.f7810j = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // ua.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView d = b.d(b.this.f9912a.getEditText());
            if (b.this.f7814o.isTouchExplorationEnabled() && b.e(d) && !b.this.f9914c.hasFocus()) {
                d.dismissDropDown();
            }
            d.post(new RunnableC0097a(d));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnFocusChangeListenerC0098b implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC0098b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            b.this.f9912a.setEndIconActivated(z10);
            if (z10) {
                return;
            }
            b.f(b.this, false);
            b.this.f7810j = false;
        }
    }

    /* loaded from: classes.dex */
    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, n0.a
        public void d(View view, o0.b bVar) {
            boolean z10;
            super.d(view, bVar);
            if (!b.e(b.this.f9912a.getEditText())) {
                bVar.f13479a.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z10 = bVar.f13479a.isShowingHintText();
            } else {
                Bundle h10 = bVar.h();
                if (h10 != null && (h10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4) {
                    z10 = true;
                }
                z10 = false;
            }
            if (z10) {
                bVar.s(null);
            }
        }

        @Override // n0.a
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            this.f13090a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView d = b.d(b.this.f9912a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.f7814o.isTouchExplorationEnabled() && !b.e(b.this.f9912a.getEditText())) {
                b.g(b.this, d);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements TextInputLayout.f {
        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView d = b.d(textInputLayout.getEditText());
            b bVar = b.this;
            int boxBackgroundMode = bVar.f9912a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                d.setDropDownBackgroundDrawable(bVar.n);
            } else if (boxBackgroundMode == 1) {
                d.setDropDownBackgroundDrawable(bVar.f7813m);
            }
            b bVar2 = b.this;
            Objects.requireNonNull(bVar2);
            if (!(d.getKeyListener() != null)) {
                int boxBackgroundMode2 = bVar2.f9912a.getBoxBackgroundMode();
                g boxBackground = bVar2.f9912a.getBoxBackground();
                int e10 = l9.e.e(d, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{16842919}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int e11 = l9.e.e(d, R.attr.colorSurface);
                    g gVar = new g(boxBackground.f3929c.f3938a);
                    int i10 = l9.e.i(e10, e11, 0.1f);
                    gVar.r(new ColorStateList(iArr, new int[]{i10, 0}));
                    gVar.setTint(e11);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i10, e11});
                    g gVar2 = new g(boxBackground.f3929c.f3938a);
                    gVar2.setTint(-1);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground});
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    x.d.q(d, layerDrawable);
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = bVar2.f9912a.getBoxBackgroundColor();
                    RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{l9.e.i(e10, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                    WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                    x.d.q(d, rippleDrawable);
                }
            }
            b bVar3 = b.this;
            Objects.requireNonNull(bVar3);
            d.setOnTouchListener(new h(bVar3, d));
            d.setOnFocusChangeListener(bVar3.f7806f);
            d.setOnDismissListener(new gb.i(bVar3));
            d.setThreshold(0);
            d.removeTextChangedListener(b.this.f7805e);
            d.addTextChangedListener(b.this.f7805e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!(d.getKeyListener() != null)) {
                CheckableImageButton checkableImageButton = b.this.f9914c;
                WeakHashMap<View, a0> weakHashMap3 = x.f13156a;
                x.d.s(checkableImageButton, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(b.this.f7807g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* loaded from: classes.dex */
    public class e implements TextInputLayout.g {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f7824c;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f7824c = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f7824c.removeTextChangedListener(b.this.f7805e);
            }
        }

        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i10 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f7806f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            autoCompleteTextView.setOnDismissListener(null);
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.g(b.this, (AutoCompleteTextView) b.this.f9912a.getEditText());
        }
    }

    public b(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f7805e = new a();
        this.f7806f = new View$OnFocusChangeListenerC0098b();
        this.f7807g = new c(this.f9912a);
        this.f7808h = new d();
        this.f7809i = new e();
        this.f7810j = false;
        this.f7811k = false;
        this.f7812l = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void f(b bVar, boolean z10) {
        if (bVar.f7811k != z10) {
            bVar.f7811k = z10;
            bVar.f7816q.cancel();
            bVar.f7815p.start();
        }
    }

    public static void g(b bVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(bVar);
        if (autoCompleteTextView == null) {
            return;
        }
        if (bVar.i()) {
            bVar.f7810j = false;
        }
        if (bVar.f7810j) {
            bVar.f7810j = false;
            return;
        }
        boolean z10 = bVar.f7811k;
        boolean z11 = !z10;
        if (z10 != z11) {
            bVar.f7811k = z11;
            bVar.f7816q.cancel();
            bVar.f7815p.start();
        }
        if (!bVar.f7811k) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    @Override // gb.k
    public void a() {
        float dimensionPixelOffset = this.f9913b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f9913b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f9913b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        g h10 = h(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        g h11 = h(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.n = h10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f7813m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, h10);
        this.f7813m.addState(new int[0], h11);
        int i10 = this.d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_dropdown_arrow;
        }
        this.f9912a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout = this.f9912a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f9912a.setEndIconOnClickListener(new f());
        this.f9912a.a(this.f7808h);
        this.f9912a.f7783z0.add(this.f7809i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = ga.a.f9886a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new gb.g(this));
        this.f7816q = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new gb.g(this));
        this.f7815p = ofFloat2;
        ofFloat2.addListener(new j(this));
        this.f7814o = (AccessibilityManager) this.f9913b.getSystemService("accessibility");
    }

    @Override // gb.k
    public boolean b(int i10) {
        return i10 != 0;
    }

    public final g h(float f10, float f11, float f12, int i10) {
        k.b bVar = new k.b();
        bVar.f(f10);
        bVar.g(f10);
        bVar.d(f11);
        bVar.e(f11);
        cb.k a10 = bVar.a();
        Context context = this.f9913b;
        String str = g.N;
        int c10 = za.b.c(context, R.attr.colorSurface, g.class.getSimpleName());
        g gVar = new g();
        gVar.f3929c.f3939b = new ra.a(context);
        gVar.C();
        gVar.r(ColorStateList.valueOf(c10));
        g.b bVar2 = gVar.f3929c;
        if (bVar2.f3950o != f12) {
            bVar2.f3950o = f12;
            gVar.C();
        }
        gVar.f3929c.f3938a = a10;
        gVar.invalidateSelf();
        g.b bVar3 = gVar.f3929c;
        if (bVar3.f3945i == null) {
            bVar3.f3945i = new Rect();
        }
        gVar.f3929c.f3945i.set(0, i10, 0, i10);
        gVar.invalidateSelf();
        return gVar;
    }

    public final boolean i() {
        long currentTimeMillis = System.currentTimeMillis() - this.f7812l;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }
}
