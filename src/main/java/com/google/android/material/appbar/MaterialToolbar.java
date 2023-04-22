package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import ua.j;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: k0  reason: collision with root package name */
    public Integer f7142k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7143l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f7144m0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018294), attributeSet, i10);
        Context context2 = getContext();
        TypedArray d = j.d(context2, attributeSet, m9.a.f13006f0, i10, 2132018294, new int[0]);
        if (d.hasValue(0)) {
            setNavigationIconTint(d.getColor(0, -1));
        }
        this.f7143l0 = d.getBoolean(2, false);
        this.f7144m0 = d.getBoolean(1, false);
        d.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            cb.g gVar = new cb.g();
            gVar.r(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.f3929c.f3939b = new ra.a(context2);
            gVar.C();
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            gVar.q(x.i.i(this));
            x.d.q(this, gVar);
        }
    }

    public Integer getNavigationIconTint() {
        return this.f7142k0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof cb.g) {
            m9.a.D(this, (cb.g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f7143l0 || this.f7144m0) {
            TextView F = a0.b.F(this, getTitle());
            TextView F2 = a0.b.F(this, getSubtitle());
            if (F == null && F2 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i14 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = measuredWidth - getPaddingRight();
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() != 8 && childAt != F && childAt != F2) {
                    if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                        paddingRight = childAt.getLeft();
                    }
                }
            }
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
            if (this.f7143l0 && F != null) {
                x(F, pair);
            }
            if (this.f7144m0 && F2 != null) {
                x(F2, pair);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.a.C(this, f10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f7142k0 != null) {
            drawable = f0.a.h(drawable.mutate());
            drawable.setTint(this.f7142k0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f7142k0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f7144m0 != z10) {
            this.f7144m0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f7143l0 != z10) {
            this.f7143l0 = z10;
            requestLayout();
        }
    }

    public final void x(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }
}
