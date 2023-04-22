package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.pornhub.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.i;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.n;
import n0.x;
import ua.j;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: p  reason: collision with root package name */
    public static final String f7634p = "BaseTransientBottomBar";

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f7635a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f7636b;

    /* renamed from: c  reason: collision with root package name */
    public final i f7637c;
    public final db.f d;

    /* renamed from: e  reason: collision with root package name */
    public int f7638e;

    /* renamed from: g  reason: collision with root package name */
    public Rect f7640g;

    /* renamed from: h  reason: collision with root package name */
    public int f7641h;

    /* renamed from: i  reason: collision with root package name */
    public int f7642i;

    /* renamed from: j  reason: collision with root package name */
    public int f7643j;

    /* renamed from: k  reason: collision with root package name */
    public int f7644k;

    /* renamed from: l  reason: collision with root package name */
    public final AccessibilityManager f7645l;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f7633o = {R.attr.snackbarStyle};
    public static final Handler n = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f7639f = new b();

    /* renamed from: m  reason: collision with root package name */
    public i.b f7646m = new e();

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i  reason: collision with root package name */
        public final f f7647i = new f(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            f fVar = this.f7647i;
            Objects.requireNonNull(fVar);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.i.b().f(fVar.f7651a);
                }
            } else if (coordinatorLayout.u(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.i.b().e(fVar.f7651a);
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean s(View view) {
            Objects.requireNonNull(this.f7647i);
            return view instanceof i;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                int i11 = message.arg1;
                if (!baseTransientBottomBar.f() || baseTransientBottomBar.f7637c.getVisibility() != 0) {
                    baseTransientBottomBar.d(i11);
                } else if (baseTransientBottomBar.f7637c.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.setInterpolator(ga.a.f9886a);
                    ofFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar));
                    ofFloat.setDuration(75L);
                    ofFloat.addListener(new db.b(baseTransientBottomBar, i11));
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, baseTransientBottomBar.c());
                    valueAnimator.setInterpolator(ga.a.f9887b);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new db.d(baseTransientBottomBar, i11));
                    valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar));
                    valueAnimator.start();
                }
                return true;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            baseTransientBottomBar2.f7637c.setOnAttachStateChangeListener(new com.google.android.material.snackbar.e(baseTransientBottomBar2));
            if (baseTransientBottomBar2.f7637c.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.f7637c.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.e) {
                    CoordinatorLayout.e eVar = (CoordinatorLayout.e) layoutParams;
                    Behavior behavior = new Behavior();
                    f fVar = behavior.f7647i;
                    Objects.requireNonNull(fVar);
                    fVar.f7651a = baseTransientBottomBar2.f7646m;
                    behavior.f7169b = new com.google.android.material.snackbar.g(baseTransientBottomBar2);
                    eVar.b(behavior);
                    eVar.f1793g = 80;
                }
                baseTransientBottomBar2.h();
                baseTransientBottomBar2.f7637c.setVisibility(4);
                baseTransientBottomBar2.f7635a.addView(baseTransientBottomBar2.f7637c);
            }
            i iVar = baseTransientBottomBar2.f7637c;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.g.c(iVar)) {
                baseTransientBottomBar2.g();
            } else {
                baseTransientBottomBar2.f7637c.setOnLayoutChangeListener(new com.google.android.material.snackbar.f(baseTransientBottomBar2));
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f7637c != null && (context = baseTransientBottomBar.f7636b) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i10 = displayMetrics.heightPixels;
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                int[] iArr = new int[2];
                baseTransientBottomBar2.f7637c.getLocationOnScreen(iArr);
                int height = (i10 - (baseTransientBottomBar2.f7637c.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.f7637c.getTranslationY());
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                if (height >= baseTransientBottomBar3.f7644k) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f7637c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Handler handler = BaseTransientBottomBar.n;
                    Log.w(BaseTransientBottomBar.f7634p, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i11 = marginLayoutParams.bottomMargin;
                BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
                marginLayoutParams.bottomMargin = (baseTransientBottomBar4.f7644k - height) + i11;
                baseTransientBottomBar4.f7637c.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements n {
        public c() {
        }

        @Override // n0.n
        public d0 a(View view, d0 d0Var) {
            BaseTransientBottomBar.this.f7641h = d0Var.b();
            BaseTransientBottomBar.this.f7642i = d0Var.c();
            BaseTransientBottomBar.this.f7643j = d0Var.d();
            BaseTransientBottomBar.this.h();
            return d0Var;
        }
    }

    /* loaded from: classes.dex */
    public class d extends n0.a {
        public d() {
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            bVar.f13479a.addAction(1048576);
            bVar.f13479a.setDismissable(true);
        }

        @Override // n0.a
        public boolean g(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                BaseTransientBottomBar.this.a();
                return true;
            }
            return super.g(view, i10, bundle);
        }
    }

    /* loaded from: classes.dex */
    public class e implements i.b {
        public e() {
        }

        @Override // com.google.android.material.snackbar.i.b
        public void c() {
            Handler handler = BaseTransientBottomBar.n;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.i.b
        public void d(int i10) {
            Handler handler = BaseTransientBottomBar.n;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public i.b f7651a;

        public f(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f7172f = SwipeDismissBehavior.t(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.f7173g = SwipeDismissBehavior.t(0.0f, 0.6f, 1.0f);
            swipeDismissBehavior.d = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    /* loaded from: classes.dex */
    public static class i extends FrameLayout {

        /* renamed from: z  reason: collision with root package name */
        public static final View.OnTouchListener f7652z = new a();

        /* renamed from: c  reason: collision with root package name */
        public h f7653c;

        /* renamed from: f  reason: collision with root package name */
        public g f7654f;

        /* renamed from: j  reason: collision with root package name */
        public int f7655j;

        /* renamed from: m  reason: collision with root package name */
        public final float f7656m;
        public final float n;

        /* renamed from: t  reason: collision with root package name */
        public final int f7657t;

        /* renamed from: u  reason: collision with root package name */
        public final int f7658u;

        /* renamed from: w  reason: collision with root package name */
        public ColorStateList f7659w;
        public PorterDuff.Mode y;

        /* loaded from: classes.dex */
        public static class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public i(Context context, AttributeSet attributeSet) {
            super(hb.a.a(context, attributeSet, 0, 0), attributeSet);
            Drawable h10;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, m9.a.f13020r0);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.i.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f7655j = obtainStyledAttributes.getInt(2, 0);
            this.f7656m = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(za.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(ua.n.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.n = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f7657t = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f7658u = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f7652z);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(l9.e.i(l9.e.e(this, R.attr.colorSurface), l9.e.e(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                if (this.f7659w != null) {
                    h10 = f0.a.h(gradientDrawable);
                    h10.setTintList(this.f7659w);
                } else {
                    h10 = f0.a.h(gradientDrawable);
                }
                WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                x.d.q(this, h10);
            }
        }

        public float getActionTextColorAlpha() {
            return this.n;
        }

        public int getAnimationMode() {
            return this.f7655j;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f7656m;
        }

        public int getMaxInlineActionWidth() {
            return this.f7658u;
        }

        public int getMaxWidth() {
            return this.f7657t;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            g gVar = this.f7654f;
            if (gVar != null) {
                com.google.android.material.snackbar.e eVar = (com.google.android.material.snackbar.e) gVar;
                Objects.requireNonNull(eVar);
                if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = eVar.f7670a.f7637c.getRootWindowInsets()) != null) {
                    eVar.f7670a.f7644k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    eVar.f7670a.h();
                }
            }
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.h.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            boolean z10;
            super.onDetachedFromWindow();
            g gVar = this.f7654f;
            if (gVar != null) {
                com.google.android.material.snackbar.e eVar = (com.google.android.material.snackbar.e) gVar;
                BaseTransientBottomBar baseTransientBottomBar = eVar.f7670a;
                Objects.requireNonNull(baseTransientBottomBar);
                com.google.android.material.snackbar.i b10 = com.google.android.material.snackbar.i.b();
                i.b bVar = baseTransientBottomBar.f7646m;
                synchronized (b10.f7675a) {
                    z10 = b10.c(bVar) || b10.d(bVar);
                }
                if (z10) {
                    BaseTransientBottomBar.n.post(new db.e(eVar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            h hVar = this.f7653c;
            if (hVar != null) {
                com.google.android.material.snackbar.f fVar = (com.google.android.material.snackbar.f) hVar;
                fVar.f7671a.f7637c.setOnLayoutChangeListener(null);
                fVar.f7671a.g();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f7657t > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f7657t;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        public void setAnimationMode(int i10) {
            this.f7655j = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f7659w != null) {
                drawable = f0.a.h(drawable.mutate());
                drawable.setTintList(this.f7659w);
                drawable.setTintMode(this.y);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f7659w = colorStateList;
            if (getBackground() != null) {
                Drawable h10 = f0.a.h(getBackground().mutate());
                h10.setTintList(colorStateList);
                h10.setTintMode(this.y);
                if (h10 != getBackground()) {
                    super.setBackgroundDrawable(h10);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.y = mode;
            if (getBackground() != null) {
                Drawable h10 = f0.a.h(getBackground().mutate());
                h10.setTintMode(mode);
                if (h10 != getBackground()) {
                    super.setBackgroundDrawable(h10);
                }
            }
        }

        public void setOnAttachStateChangeListener(g gVar) {
            this.f7654f = gVar;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f7652z);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(h hVar) {
            this.f7653c = hVar;
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, db.f fVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (fVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f7635a = viewGroup;
        this.d = fVar;
        this.f7636b = context;
        j.c(context, j.f15816a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f7633o);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        i iVar = (i) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f7637c = iVar;
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = iVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f7664f.setTextColor(l9.e.i(l9.e.e(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f7664f.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout.setMaxInlineActionWidth(iVar.getMaxInlineActionWidth());
        }
        iVar.addView(view);
        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f7640g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.g.f(iVar, 1);
        x.d.s(iVar, 1);
        iVar.setFitsSystemWindows(true);
        x.i.u(iVar, new c());
        x.v(iVar, new d());
        this.f7645l = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public void a() {
        b(3);
    }

    public void b(int i10) {
        com.google.android.material.snackbar.i b10 = com.google.android.material.snackbar.i.b();
        i.b bVar = this.f7646m;
        synchronized (b10.f7675a) {
            if (b10.c(bVar)) {
                b10.a(b10.f7677c, i10);
            } else if (b10.d(bVar)) {
                b10.a(b10.d, i10);
            }
        }
    }

    public final int c() {
        int height = this.f7637c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f7637c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public void d(int i10) {
        com.google.android.material.snackbar.i b10 = com.google.android.material.snackbar.i.b();
        i.b bVar = this.f7646m;
        synchronized (b10.f7675a) {
            try {
                if (b10.c(bVar)) {
                    b10.f7677c = null;
                    if (b10.d != null) {
                        b10.h();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.f7637c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f7637c);
        }
    }

    public void e() {
        com.google.android.material.snackbar.i b10 = com.google.android.material.snackbar.i.b();
        i.b bVar = this.f7646m;
        synchronized (b10.f7675a) {
            if (b10.c(bVar)) {
                b10.g(b10.f7677c);
            }
        }
    }

    public boolean f() {
        AccessibilityManager accessibilityManager = this.f7645l;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void g() {
        if (f()) {
            this.f7637c.post(new com.google.android.material.snackbar.h(this));
            return;
        }
        if (this.f7637c.getParent() != null) {
            this.f7637c.setVisibility(0);
        }
        e();
    }

    public final void h() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f7637c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.f7640g) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + this.f7641h;
            marginLayoutParams.leftMargin = rect.left + this.f7642i;
            marginLayoutParams.rightMargin = rect.right + this.f7643j;
            this.f7637c.requestLayout();
            if (Build.VERSION.SDK_INT >= 29) {
                boolean z10 = false;
                if (this.f7644k > 0) {
                    ViewGroup.LayoutParams layoutParams2 = this.f7637c.getLayoutParams();
                    if ((layoutParams2 instanceof CoordinatorLayout.e) && (((CoordinatorLayout.e) layoutParams2).f1788a instanceof SwipeDismissBehavior)) {
                        z10 = true;
                    }
                }
                if (z10) {
                    this.f7637c.removeCallbacks(this.f7639f);
                    this.f7637c.post(this.f7639f);
                    return;
                }
                return;
            }
            return;
        }
        Log.w(f7634p, "Unable to update margins because layout params are not MarginLayoutParams");
    }
}
