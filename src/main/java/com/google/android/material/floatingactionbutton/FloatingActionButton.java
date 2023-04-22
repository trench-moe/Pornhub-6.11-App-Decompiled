package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cb.g;
import cb.o;
import com.app.pornhub.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.e;
import com.google.android.material.internal.VisibilityAwareImageButton;
import ga.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import ua.j;
import ua.n;

/* loaded from: classes.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements sa.a, o, CoordinatorLayout.b {
    public int A;
    public boolean B;
    public final Rect C;
    public final Rect D;
    public final k E;
    public final sa.b F;
    public e G;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f7446f;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f7447j;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f7448m;
    public PorterDuff.Mode n;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f7449t;

    /* renamed from: u  reason: collision with root package name */
    public int f7450u;

    /* renamed from: w  reason: collision with root package name */
    public int f7451w;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f7452z;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f7453a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7454b;

        public BaseBehavior() {
            this.f7454b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.O);
            this.f7454b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.C;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void c(CoordinatorLayout.e eVar) {
            if (eVar.f1794h == 0) {
                eVar.f1794h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.e ? ((CoordinatorLayout.e) layoutParams).f1788a instanceof BottomSheetBehavior : false) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> i11 = coordinatorLayout.i(floatingActionButton);
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = i11.get(i12);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.e ? ((CoordinatorLayout.e) layoutParams).f1788a instanceof BottomSheetBehavior : false) && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.w(floatingActionButton, i10);
            Rect rect = floatingActionButton.C;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
                int i13 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                int i14 = floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin ? rect.bottom : floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin ? -rect.top : 0;
                if (i14 != 0) {
                    x.o(floatingActionButton, i14);
                }
                if (i13 != 0) {
                    x.n(floatingActionButton, i13);
                }
            }
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
            if (this.f7454b && eVar.f1792f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (s(appBarLayout, floatingActionButton)) {
                if (this.f7453a == null) {
                    this.f7453a = new Rect();
                }
                Rect rect = this.f7453a;
                ua.a.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.i(null, false);
                    return true;
                }
                floatingActionButton.o(null, false);
                return true;
            }
            return false;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (s(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.i(null, false);
                } else {
                    floatingActionButton.o(null, false);
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements bb.b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c<T extends FloatingActionButton> implements e.f {

        /* renamed from: a  reason: collision with root package name */
        public final i<T> f7456a;

        public c(i<T> iVar) {
            this.f7456a = iVar;
        }

        @Override // com.google.android.material.floatingactionbutton.e.f
        public void a() {
            i<T> iVar = this.f7456a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.b bVar = (BottomAppBar.b) iVar;
            Objects.requireNonNull(bVar);
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.C(BottomAppBar.this).T != translationX) {
                BottomAppBar.C(BottomAppBar.this).T = translationX;
                BottomAppBar.this.f7184m0.invalidateSelf();
            }
            float f10 = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.C(BottomAppBar.this).S != max) {
                BottomAppBar.C(BottomAppBar.this).l0(max);
                BottomAppBar.this.f7184m0.invalidateSelf();
            }
            g gVar = BottomAppBar.this.f7184m0;
            if (floatingActionButton.getVisibility() == 0) {
                f10 = floatingActionButton.getScaleY();
            }
            gVar.s(f10);
        }

        @Override // com.google.android.material.floatingactionbutton.e.f
        public void b() {
            i<T> iVar = this.f7456a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomAppBar.b bVar = (BottomAppBar.b) iVar;
            Objects.requireNonNull(bVar);
            BottomAppBar.this.f7184m0.s(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).f7456a.equals(this.f7456a);
        }

        public int hashCode() {
            return this.f7456a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018032), attributeSet, i10);
        this.C = new Rect();
        this.D = new Rect();
        Context context2 = getContext();
        TypedArray d = j.d(context2, attributeSet, m9.a.N, i10, 2132018032, new int[0]);
        this.f7446f = za.c.a(context2, d, 1);
        this.f7447j = n.g(d.getInt(2, -1), null);
        this.f7449t = za.c.a(context2, d, 12);
        this.f7451w = d.getInt(7, -1);
        this.y = d.getDimensionPixelSize(6, 0);
        this.f7450u = d.getDimensionPixelSize(3, 0);
        float dimension = d.getDimension(4, 0.0f);
        float dimension2 = d.getDimension(9, 0.0f);
        float dimension3 = d.getDimension(11, 0.0f);
        this.B = d.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(d.getDimensionPixelSize(10, 0));
        ga.g a10 = ga.g.a(context2, d, 15);
        ga.g a11 = ga.g.a(context2, d, 8);
        cb.k a12 = cb.k.d(context2, attributeSet, i10, 2132018032, cb.k.f3959m).a();
        boolean z10 = d.getBoolean(5, false);
        setEnabled(d.getBoolean(0, true));
        d.recycle();
        k kVar = new k(this);
        this.E = kVar;
        kVar.b(attributeSet, i10);
        this.F = new sa.b(this);
        getImpl().r(a12);
        getImpl().g(this.f7446f, this.f7447j, this.f7449t, this.f7450u);
        getImpl().f7477k = dimensionPixelSize;
        e impl = getImpl();
        if (impl.f7474h != dimension) {
            impl.f7474h = dimension;
            impl.m(dimension, impl.f7475i, impl.f7476j);
        }
        e impl2 = getImpl();
        if (impl2.f7475i != dimension2) {
            impl2.f7475i = dimension2;
            impl2.m(impl2.f7474h, dimension2, impl2.f7476j);
        }
        e impl3 = getImpl();
        if (impl3.f7476j != dimension3) {
            impl3.f7476j = dimension3;
            impl3.m(impl3.f7474h, impl3.f7475i, dimension3);
        }
        getImpl().n = a10;
        getImpl().f7480o = a11;
        getImpl().f7472f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private e getImpl() {
        if (this.G == null) {
            this.G = new ta.e(this, new b());
        }
        return this.G;
    }

    public static int n(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i10;
        }
        return Math.min(i10, size);
    }

    @Override // sa.a
    public boolean a() {
        return this.F.f14935b;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.f7486u == null) {
            impl.f7486u = new ArrayList<>();
        }
        impl.f7486u.add(animatorListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().l(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.f7485t == null) {
            impl.f7485t = new ArrayList<>();
        }
        impl.f7485t.add(animatorListener);
    }

    public void f(i<? extends FloatingActionButton> iVar) {
        e impl = getImpl();
        c cVar = new c(iVar);
        if (impl.f7487v == null) {
            impl.f7487v = new ArrayList<>();
        }
        impl.f7487v.add(cVar);
    }

    @Deprecated
    public boolean g(Rect rect) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (x.g.c(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            l(rect);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f7446f;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f7447j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f7475i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f7476j;
    }

    public Drawable getContentBackground() {
        return getImpl().f7471e;
    }

    public int getCustomSize() {
        return this.y;
    }

    public int getExpandedComponentIdHint() {
        return this.F.f14936c;
    }

    public ga.g getHideMotionSpec() {
        return getImpl().f7480o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f7449t;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f7449t;
    }

    public cb.k getShapeAppearanceModel() {
        cb.k kVar = getImpl().f7468a;
        Objects.requireNonNull(kVar);
        return kVar;
    }

    public ga.g getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.f7451w;
    }

    public int getSizeDimension() {
        return h(this.f7451w);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f7448m;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.n;
    }

    public boolean getUseCompatPadding() {
        return this.B;
    }

    public final int h(int i10) {
        int i11 = this.y;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    public void i(a aVar, boolean z10) {
        e impl = getImpl();
        com.google.android.material.floatingactionbutton.b bVar = aVar == null ? null : new com.google.android.material.floatingactionbutton.b(this, aVar);
        if (impl.h()) {
            return;
        }
        Animator animator = impl.f7479m;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.t()) {
            impl.f7488w.b(z10 ? 8 : 4, z10);
            if (bVar != null) {
                bVar.f7460a.a(bVar.f7461b);
            }
            return;
        }
        ga.g gVar = impl.f7480o;
        AnimatorSet b10 = gVar != null ? impl.b(gVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f);
        b10.addListener(new com.google.android.material.floatingactionbutton.c(impl, z10, bVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f7486u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b10.addListener(it.next());
            }
        }
        b10.start();
    }

    public boolean j() {
        return getImpl().h();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().j();
    }

    public boolean k() {
        return getImpl().i();
    }

    public final void l(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.C;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void m() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f7448m;
        if (colorStateList == null) {
            f0.a.a(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.n;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(h.c(colorForState, mode));
    }

    public void o(a aVar, boolean z10) {
        e impl = getImpl();
        com.google.android.material.floatingactionbutton.b bVar = aVar == null ? null : new com.google.android.material.floatingactionbutton.b(this, aVar);
        if (impl.i()) {
            return;
        }
        Animator animator = impl.f7479m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = impl.n == null;
        if (!impl.t()) {
            impl.f7488w.b(0, z10);
            impl.f7488w.setAlpha(1.0f);
            impl.f7488w.setScaleY(1.0f);
            impl.f7488w.setScaleX(1.0f);
            impl.p(1.0f);
            if (bVar != null) {
                bVar.f7460a.b(bVar.f7461b);
            }
            return;
        }
        if (impl.f7488w.getVisibility() != 0) {
            impl.f7488w.setAlpha(0.0f);
            impl.f7488w.setScaleY(z11 ? 0.4f : 0.0f);
            impl.f7488w.setScaleX(z11 ? 0.4f : 0.0f);
            impl.p(z11 ? 0.4f : 0.0f);
        }
        ga.g gVar = impl.n;
        AnimatorSet b10 = gVar != null ? impl.b(gVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f);
        b10.addListener(new d(impl, z10, bVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f7485t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b10.addListener(it.next());
            }
        }
        b10.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e impl = getImpl();
        g gVar = impl.f7469b;
        if (gVar != null) {
            m9.a.D(impl.f7488w, gVar);
        }
        if (!(impl instanceof ta.e)) {
            ViewTreeObserver viewTreeObserver = impl.f7488w.getViewTreeObserver();
            if (impl.C == null) {
                impl.C = new ta.d(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.C);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f7488w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.C = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f7452z = (sizeDimension - this.A) / 2;
        getImpl().w();
        int min = Math.min(n(sizeDimension, i10), n(sizeDimension, i11));
        Rect rect = this.C;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof eb.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eb.a aVar = (eb.a) parcelable;
        super.onRestoreInstanceState(aVar.f14775c);
        sa.b bVar = this.F;
        Bundle orDefault = aVar.f9307j.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = orDefault;
        Objects.requireNonNull(bVar);
        bVar.f14935b = bundle.getBoolean("expanded", false);
        bVar.f14936c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f14935b) {
            ViewParent parent = bVar.f14934a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).g(bVar.f14934a);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        eb.a aVar = new eb.a(onSaveInstanceState);
        p.g<String, Bundle> gVar = aVar.f9307j;
        sa.b bVar = this.F;
        Objects.requireNonNull(bVar);
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f14935b);
        bundle.putInt("expandedComponentIdHint", bVar.f14936c);
        gVar.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && g(this.D) && !this.D.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f7446f != colorStateList) {
            this.f7446f = colorStateList;
            e impl = getImpl();
            g gVar = impl.f7469b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            ta.b bVar = impl.d;
            if (bVar != null) {
                bVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f7447j != mode) {
            this.f7447j = mode;
            g gVar = getImpl().f7469b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        e impl = getImpl();
        if (impl.f7474h != f10) {
            impl.f7474h = f10;
            impl.m(f10, impl.f7475i, impl.f7476j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        e impl = getImpl();
        if (impl.f7475i != f10) {
            impl.f7475i = f10;
            impl.m(impl.f7474h, f10, impl.f7476j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        e impl = getImpl();
        if (impl.f7476j != f10) {
            impl.f7476j = f10;
            impl.m(impl.f7474h, impl.f7475i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.y) {
            this.y = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().x(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f7472f) {
            getImpl().f7472f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.F.f14936c = i10;
    }

    public void setHideMotionSpec(ga.g gVar) {
        getImpl().f7480o = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(ga.g.b(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            e impl = getImpl();
            impl.p(impl.f7482q);
            if (this.f7448m != null) {
                m();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.E.c(i10);
        m();
    }

    public void setMaxImageSize(int i10) {
        this.A = i10;
        e impl = getImpl();
        if (impl.f7483r != i10) {
            impl.f7483r = i10;
            impl.p(impl.f7482q);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f7449t != colorStateList) {
            this.f7449t = colorStateList;
            getImpl().q(this.f7449t);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().n();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().n();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        e impl = getImpl();
        impl.f7473g = z10;
        impl.w();
    }

    @Override // cb.o
    public void setShapeAppearanceModel(cb.k kVar) {
        getImpl().r(kVar);
    }

    public void setShowMotionSpec(ga.g gVar) {
        getImpl().n = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(ga.g.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.y = 0;
        if (i10 != this.f7451w) {
            this.f7451w = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f7448m != colorStateList) {
            this.f7448m = colorStateList;
            m();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.n != mode) {
            this.n = mode;
            m();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().o();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().o();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().o();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            getImpl().k();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
