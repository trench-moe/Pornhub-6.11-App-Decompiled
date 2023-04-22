package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.p0;
import com.app.pornhub.R;
import kotlin.jvm.internal.IntCompanionObject;
import m9.a;
import ua.j;
import ua.n;
import wa.d;
import wa.f;
import xa.b;
import xa.c;

/* loaded from: classes.dex */
public class NavigationRailView extends f {

    /* renamed from: w  reason: collision with root package name */
    public final int f7581w;
    public View y;

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018252);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        this.f7581w = dimensionPixelSize;
        p0 e10 = j.e(getContext(), attributeSet, a.f13009i0, i10, 2132018252, new int[0]);
        int m10 = e10.m(0, 0);
        if (m10 != 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(m10, (ViewGroup) this, false);
            View view = this.y;
            if (view != null) {
                removeView(view);
                this.y = null;
            }
            this.y = inflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(inflate, 0, layoutParams);
        }
        setMenuGravity(e10.j(2, 49));
        if (e10.p(1)) {
            setItemMinimumHeight(e10.f(1, -1));
        }
        e10.f1055b.recycle();
        n.a(this, new c(this));
    }

    private b getNavigationRailMenuView() {
        return (b) getMenuView();
    }

    @Override // wa.f
    public d a(Context context) {
        return new b(context);
    }

    public View getHeaderView() {
        return this.y;
    }

    public int getItemMinimumHeight() {
        return ((b) getMenuView()).getItemMinimumHeight();
    }

    @Override // wa.f
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b navigationRailMenuView = getNavigationRailMenuView();
        View view = this.y;
        boolean z11 = true;
        int i14 = 0;
        if ((view == null || view.getVisibility() == 8) ? false : true) {
            int bottom = this.y.getBottom() + this.f7581w;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i14 = bottom - top;
            }
        } else {
            if ((navigationRailMenuView.V.gravity & 112) != 48) {
                z11 = false;
            }
            if (z11) {
                i14 = this.f7581w;
            }
        }
        if (i14 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i14, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i14);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i10) != 1073741824 && suggestedMinimumWidth > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i10, i11);
        View view = this.y;
        if ((view == null || view.getVisibility() == 8) ? false : true) {
            measureChild(getNavigationRailMenuView(), i10, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.y.getMeasuredHeight()) - this.f7581w, IntCompanionObject.MIN_VALUE));
        }
    }

    public void setItemMinimumHeight(int i10) {
        ((b) getMenuView()).setItemMinimumHeight(i10);
    }

    public void setMenuGravity(int i10) {
        getNavigationRailMenuView().setMenuGravity(i10);
    }
}
