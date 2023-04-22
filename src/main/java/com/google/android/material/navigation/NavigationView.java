package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.p0;
import androidx.drawerlayout.widget.DrawerLayout;
import c0.a;
import cb.g;
import cb.k;
import cb.l;
import com.app.pornhub.R;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import j.f;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.x;
import ua.c;
import ua.j;

/* loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    public static final int[] I = {16842912};
    public static final int[] J = {-16842910};
    public MenuInflater A;
    public ViewTreeObserver.OnGlobalLayoutListener B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public Path G;
    public final RectF H;

    /* renamed from: t  reason: collision with root package name */
    public final ua.b f7575t;

    /* renamed from: u  reason: collision with root package name */
    public final ua.c f7576u;

    /* renamed from: w  reason: collision with root package name */
    public b f7577w;
    public final int y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f7578z;

    /* loaded from: classes.dex */
    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, MenuItem menuItem) {
            b bVar = NavigationView.this.f7577w;
            return bVar != null && bVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class c extends s0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public Bundle f7580j;

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
            this.f7580j = parcel.readBundle(classLoader);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeBundle(this.f7580j);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018033), attributeSet, i10);
        ua.c cVar = new ua.c();
        this.f7576u = cVar;
        this.f7578z = new int[2];
        this.C = true;
        this.D = true;
        this.E = 0;
        this.F = 0;
        this.H = new RectF();
        Context context2 = getContext();
        ua.b bVar = new ua.b(context2);
        this.f7575t = bVar;
        p0 e10 = j.e(context2, attributeSet, m9.a.f13011j0, i10, 2132018033, new int[0]);
        if (e10.p(1)) {
            Drawable g10 = e10.g(1);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.q(this, g10);
        }
        this.F = e10.f(7, 0);
        this.E = e10.j(0, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            k a10 = k.c(context2, attributeSet, i10, 2132018033).a();
            Drawable background = getBackground();
            g gVar = new g(a10);
            if (background instanceof ColorDrawable) {
                gVar.r(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            gVar.f3929c.f3939b = new ra.a(context2);
            gVar.C();
            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
            x.d.q(this, gVar);
        }
        if (e10.p(8)) {
            setElevation(e10.f(8, 0));
        }
        setFitsSystemWindows(e10.a(2, false));
        this.y = e10.f(3, 0);
        ColorStateList c10 = e10.p(29) ? e10.c(29) : null;
        int m10 = e10.p(32) ? e10.m(32, 0) : 0;
        if (m10 == 0 && c10 == null) {
            c10 = b(16842808);
        }
        ColorStateList c11 = e10.p(14) ? e10.c(14) : b(16842808);
        int m11 = e10.p(23) ? e10.m(23, 0) : 0;
        if (e10.p(13)) {
            setItemIconSize(e10.f(13, 0));
        }
        ColorStateList c12 = e10.p(24) ? e10.c(24) : null;
        if (m11 == 0 && c12 == null) {
            c12 = b(16842806);
        }
        Drawable g11 = e10.g(10);
        if (g11 == null) {
            if (e10.p(16) || e10.p(17)) {
                g gVar2 = new g(k.a(getContext(), e10.m(16, 0), e10.m(17, 0)).a());
                gVar2.r(za.c.b(getContext(), e10, 18));
                g11 = new InsetDrawable((Drawable) gVar2, e10.f(21, 0), e10.f(22, 0), e10.f(20, 0), e10.f(19, 0));
            }
        }
        if (e10.p(11)) {
            setItemHorizontalPadding(e10.f(11, 0));
        }
        if (e10.p(25)) {
            setItemVerticalPadding(e10.f(25, 0));
        }
        setDividerInsetStart(e10.f(6, 0));
        setDividerInsetEnd(e10.f(5, 0));
        setSubheaderInsetStart(e10.f(31, 0));
        setSubheaderInsetEnd(e10.f(30, 0));
        setTopInsetScrimEnabled(e10.a(33, this.C));
        setBottomInsetScrimEnabled(e10.a(4, this.D));
        int f10 = e10.f(12, 0);
        setItemMaxLines(e10.j(15, 1));
        bVar.f645e = new a();
        cVar.f15789m = 1;
        cVar.j(context2, bVar);
        if (m10 != 0) {
            cVar.f15791u = m10;
            cVar.e(false);
        }
        cVar.f15792w = c10;
        cVar.e(false);
        cVar.A = c11;
        cVar.e(false);
        int overScrollMode = getOverScrollMode();
        cVar.O = overScrollMode;
        NavigationMenuView navigationMenuView = cVar.f15786c;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (m11 != 0) {
            cVar.y = m11;
            cVar.e(false);
        }
        cVar.f15793z = c12;
        cVar.e(false);
        cVar.B = g11;
        cVar.e(false);
        cVar.b(f10);
        bVar.b(cVar, bVar.f642a);
        if (cVar.f15786c == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) cVar.f15790t.inflate(R.layout.design_navigation_menu, (ViewGroup) this, false);
            cVar.f15786c = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new c.h(cVar.f15786c));
            if (cVar.n == null) {
                cVar.n = new c.C0274c();
            }
            int i11 = cVar.O;
            if (i11 != -1) {
                cVar.f15786c.setOverScrollMode(i11);
            }
            cVar.f15787f = (LinearLayout) cVar.f15790t.inflate(R.layout.design_navigation_item_header, (ViewGroup) cVar.f15786c, false);
            cVar.f15786c.setAdapter(cVar.n);
        }
        addView(cVar.f15786c);
        if (e10.p(26)) {
            int m12 = e10.m(26, 0);
            cVar.c(true);
            getMenuInflater().inflate(m12, bVar);
            cVar.c(false);
            cVar.e(false);
        }
        if (e10.p(9)) {
            cVar.f15787f.addView(cVar.f15790t.inflate(e10.m(9, 0), (ViewGroup) cVar.f15787f, false));
            NavigationMenuView navigationMenuView3 = cVar.f15786c;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        e10.f1055b.recycle();
        this.B = new wa.g(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.B);
    }

    private MenuInflater getMenuInflater() {
        if (this.A == null) {
            this.A = new f(getContext());
        }
        return this.A;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void a(d0 d0Var) {
        ua.c cVar = this.f7576u;
        Objects.requireNonNull(cVar);
        int e10 = d0Var.e();
        if (cVar.M != e10) {
            cVar.M = e10;
            cVar.l();
        }
        NavigationMenuView navigationMenuView = cVar.f15786c;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, d0Var.b());
        x.e(cVar.f15787f, d0Var);
    }

    public final ColorStateList b(int i10) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            ColorStateList c10 = c0.a.c(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                int i11 = typedValue.data;
                int defaultColor = c10.getDefaultColor();
                int[] iArr = J;
                return new ColorStateList(new int[][]{iArr, I, FrameLayout.EMPTY_STATE_SET}, new int[]{c10.getColorForState(iArr, defaultColor), i11, defaultColor});
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.G);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.f7576u.n.f15795e;
    }

    public int getDividerInsetEnd() {
        return this.f7576u.H;
    }

    public int getDividerInsetStart() {
        return this.f7576u.G;
    }

    public int getHeaderCount() {
        return this.f7576u.f15787f.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f7576u.B;
    }

    public int getItemHorizontalPadding() {
        return this.f7576u.C;
    }

    public int getItemIconPadding() {
        return this.f7576u.E;
    }

    public ColorStateList getItemIconTintList() {
        return this.f7576u.A;
    }

    public int getItemMaxLines() {
        return this.f7576u.L;
    }

    public ColorStateList getItemTextColor() {
        return this.f7576u.f15793z;
    }

    public int getItemVerticalPadding() {
        return this.f7576u.D;
    }

    public Menu getMenu() {
        return this.f7575t;
    }

    public int getSubheaderInsetEnd() {
        Objects.requireNonNull(this.f7576u);
        return 0;
    }

    public int getSubheaderInsetStart() {
        return this.f7576u.I;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            m9.a.D(this, (g) background);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.B);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.y), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.y, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f14775c);
        this.f7575t.v(cVar.f7580j);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        cVar.f7580j = bundle;
        this.f7575t.x(bundle);
        return cVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!(getParent() instanceof DrawerLayout) || this.F <= 0 || !(getBackground() instanceof g)) {
            this.G = null;
            this.H.setEmpty();
            return;
        }
        g gVar = (g) getBackground();
        k kVar = gVar.f3929c.f3938a;
        Objects.requireNonNull(kVar);
        k.b bVar = new k.b(kVar);
        int i14 = this.E;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (Gravity.getAbsoluteGravity(i14, x.e.d(this)) == 3) {
            bVar.g(this.F);
            bVar.e(this.F);
        } else {
            bVar.f(this.F);
            bVar.d(this.F);
        }
        gVar.f3929c.f3938a = bVar.a();
        gVar.invalidateSelf();
        if (this.G == null) {
            this.G = new Path();
        }
        this.G.reset();
        this.H.set(0.0f, 0.0f, i10, i11);
        l lVar = l.a.f3993a;
        g.b bVar2 = gVar.f3929c;
        lVar.a(bVar2.f3938a, bVar2.f3947k, this.H, this.G);
        invalidate();
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.D = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem findItem = this.f7575t.findItem(i10);
        if (findItem != null) {
            this.f7576u.n.n((androidx.appcompat.view.menu.g) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f7575t.findItem(menuItem.getItemId());
        if (findItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.f7576u.n.n((androidx.appcompat.view.menu.g) findItem);
    }

    public void setDividerInsetEnd(int i10) {
        ua.c cVar = this.f7576u;
        cVar.H = i10;
        cVar.e(false);
    }

    public void setDividerInsetStart(int i10) {
        ua.c cVar = this.f7576u;
        cVar.G = i10;
        cVar.e(false);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.a.C(this, f10);
    }

    public void setItemBackground(Drawable drawable) {
        ua.c cVar = this.f7576u;
        cVar.B = drawable;
        cVar.e(false);
    }

    public void setItemBackgroundResource(int i10) {
        Context context = getContext();
        Object obj = c0.a.f3717a;
        setItemBackground(a.c.b(context, i10));
    }

    public void setItemHorizontalPadding(int i10) {
        ua.c cVar = this.f7576u;
        cVar.C = i10;
        cVar.e(false);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        ua.c cVar = this.f7576u;
        cVar.C = getResources().getDimensionPixelSize(i10);
        cVar.e(false);
    }

    public void setItemIconPadding(int i10) {
        ua.c cVar = this.f7576u;
        cVar.E = i10;
        cVar.e(false);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f7576u.b(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(int i10) {
        ua.c cVar = this.f7576u;
        if (cVar.F != i10) {
            cVar.F = i10;
            cVar.J = true;
            cVar.e(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        ua.c cVar = this.f7576u;
        cVar.A = colorStateList;
        cVar.e(false);
    }

    public void setItemMaxLines(int i10) {
        ua.c cVar = this.f7576u;
        cVar.L = i10;
        cVar.e(false);
    }

    public void setItemTextAppearance(int i10) {
        ua.c cVar = this.f7576u;
        cVar.y = i10;
        cVar.e(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        ua.c cVar = this.f7576u;
        cVar.f15793z = colorStateList;
        cVar.e(false);
    }

    public void setItemVerticalPadding(int i10) {
        ua.c cVar = this.f7576u;
        cVar.D = i10;
        cVar.e(false);
    }

    public void setItemVerticalPaddingResource(int i10) {
        ua.c cVar = this.f7576u;
        cVar.D = getResources().getDimensionPixelSize(i10);
        cVar.e(false);
    }

    public void setNavigationItemSelectedListener(b bVar) {
        this.f7577w = bVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        ua.c cVar = this.f7576u;
        if (cVar != null) {
            cVar.O = i10;
            NavigationMenuView navigationMenuView = cVar.f15786c;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        ua.c cVar = this.f7576u;
        cVar.I = i10;
        cVar.e(false);
    }

    public void setSubheaderInsetStart(int i10) {
        ua.c cVar = this.f7576u;
        cVar.I = i10;
        cVar.e(false);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.C = z10;
    }
}
