package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.app.pornhub.R;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import ua.j;

/* loaded from: classes.dex */
public class ChipGroup extends FlowLayout {
    public d A;
    public int B;
    public boolean C;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f7285t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7286u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7287w;
    public c y;

    /* renamed from: z  reason: collision with root package name */
    public final b f7288z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public b(a aVar) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            ChipGroup chipGroup = ChipGroup.this;
            if (chipGroup.C) {
                return;
            }
            if (chipGroup.getCheckedChipIds().isEmpty()) {
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f7287w) {
                    chipGroup2.d(compoundButton.getId(), true);
                    ChipGroup.this.B = compoundButton.getId();
                    return;
                }
            }
            int id2 = compoundButton.getId();
            if (!z10) {
                ChipGroup chipGroup3 = ChipGroup.this;
                if (chipGroup3.B == id2) {
                    chipGroup3.setCheckedId(-1);
                }
                return;
            }
            ChipGroup chipGroup4 = ChipGroup.this;
            int i10 = chipGroup4.B;
            if (i10 != -1 && i10 != id2 && chipGroup4.f7286u) {
                chipGroup4.d(i10, false);
            }
            ChipGroup.this.setCheckedId(id2);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(ChipGroup chipGroup, int i10);
    }

    /* loaded from: classes.dex */
    public class d implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f7290c;

        public d(a aVar) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    view2.setId(x.e.a());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).c(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f7288z);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7290c;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7290c;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018213), attributeSet, i10);
        this.f7288z = new b(null);
        this.A = new d(null);
        this.B = -1;
        this.C = false;
        TypedArray d10 = j.d(getContext(), attributeSet, m9.a.F, i10, 2132018213, new int[0]);
        int dimensionPixelOffset = d10.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d10.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d10.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d10.getBoolean(5, false));
        setSingleSelection(d10.getBoolean(6, false));
        setSelectionRequired(d10.getBoolean(4, false));
        int resourceId = d10.getResourceId(0, -1);
        if (resourceId != -1) {
            this.B = resourceId;
        }
        d10.recycle();
        super.setOnHierarchyChangeListener(this.A);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.s(this, 1);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i10) {
        this.B = i10;
        c cVar = this.y;
        if (cVar == null || !this.f7286u) {
            return;
        }
        cVar.a(this, i10);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean a() {
        return this.f7519j;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i11 = this.B;
                if (i11 != -1 && this.f7286u) {
                    d(i11, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public void c(int i10) {
        int i11 = this.B;
        if (i10 == i11) {
            return;
        }
        if (i11 != -1 && this.f7286u) {
            d(i11, false);
        }
        if (i10 != -1) {
            d(i10, true);
        }
        setCheckedId(i10);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public final void d(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof Chip) {
            this.C = true;
            ((Chip) findViewById).setChecked(z10);
            this.C = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f7286u) {
            return this.B;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f7286u) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.n;
    }

    public int getChipSpacingVertical() {
        return this.f7285t;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.B;
        if (i10 != -1) {
            d(i10, true);
            setCheckedId(this.B);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0228b.a(getRowCount(), this.f7519j ? getChipCount() : -1, false, this.f7286u ? 1 : 2).f13495a);
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.n != i10) {
            this.n = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f7285t != i10) {
            this.f7285t = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(c cVar) {
        this.y = cVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A.f7290c = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f7287w = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.f7286u != z10) {
            this.f7286u = z10;
            this.C = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.C = false;
            setCheckedId(-1);
        }
    }
}
