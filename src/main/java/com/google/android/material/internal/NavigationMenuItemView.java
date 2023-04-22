package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.t0;
import com.app.pornhub.R;
import d0.f;
import java.util.WeakHashMap;
import l.InterfaceC0186;
import n0.a0;
import n0.x;
import o0.b;
import q0.h;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements j.a {
    public static final int[] V = {16842912};
    public int L;
    public boolean M;
    public boolean N;
    public final CheckedTextView O;
    public FrameLayout P;
    public g Q;
    public ColorStateList R;
    public boolean S;
    public Drawable T;
    public final n0.a U;

    /* loaded from: classes.dex */
    public class a extends n0.a {
        public a() {
        }

        @Override // n0.a
        public void d(View view, b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            bVar.f13479a.setCheckable(NavigationMenuItemView.this.N);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.U = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.O = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        x.v(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.P == null) {
                this.P = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.P.removeAllViews();
            this.P.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(g gVar, int i10) {
        StateListDrawable stateListDrawable;
        this.Q = gVar;
        int i11 = gVar.f667a;
        if (i11 > 0) {
            setId(i11);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(V, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.q(this, stateListDrawable);
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.f670e);
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.f681q);
        t0.a(this, gVar.f682r);
        g gVar2 = this.Q;
        if (gVar2.f670e != null || gVar2.getIcon() != null || this.Q.getActionView() == null) {
            z10 = false;
        }
        if (z10) {
            this.O.setVisibility(8);
            FrameLayout frameLayout = this.P;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.P.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.O.setVisibility(0);
        FrameLayout frameLayout2 = this.P;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.P.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.Q;
        if (gVar != null && gVar.isCheckable() && this.Q.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, V);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.N != z10) {
            this.N = z10;
            this.U.h(this.O, InterfaceC0186.f43);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.O.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.S) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = f0.a.h(drawable).mutate();
                drawable.setTintList(this.R);
            }
            int i10 = this.L;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.M) {
            if (this.T == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.f8607a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.T = drawable2;
                if (drawable2 != null) {
                    int i11 = this.L;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.T;
        }
        this.O.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.O.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.L = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.R = colorStateList;
        this.S = colorStateList != null;
        g gVar = this.Q;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.O.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.M = z10;
    }

    public void setTextAppearance(int i10) {
        h.f(this.O, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.O.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.O.setText(charSequence);
    }
}
