package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import cb.k;
import com.app.pornhub.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import ua.j;
import ua.n;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int A = 0;

    /* renamed from: c  reason: collision with root package name */
    public final List<d> f7261c;

    /* renamed from: f  reason: collision with root package name */
    public final c f7262f;

    /* renamed from: j  reason: collision with root package name */
    public final f f7263j;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashSet<e> f7264m;
    public final Comparator<MaterialButton> n;

    /* renamed from: t  reason: collision with root package name */
    public Integer[] f7265t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7266u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7267w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public int f7268z;

    /* loaded from: classes.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* loaded from: classes.dex */
    public class b extends n0.a {
        public b() {
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i10 = MaterialButtonToggleGroup.A;
            Objects.requireNonNull(materialButtonToggleGroup);
            int i11 = -1;
            if (view instanceof MaterialButton) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        i11 = i13;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                            i13++;
                        }
                        i12++;
                    }
                }
            }
            bVar.r(b.c.a(0, 1, i11, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes.dex */
    public class c implements MaterialButton.a {
        public c(a aVar) {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (materialButtonToggleGroup.f7266u) {
                return;
            }
            if (materialButtonToggleGroup.f7267w) {
                materialButtonToggleGroup.f7268z = z10 ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.f(materialButton.getId(), z10)) {
                MaterialButtonToggleGroup.this.b(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: e  reason: collision with root package name */
        public static final cb.c f7271e = new cb.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public cb.c f7272a;

        /* renamed from: b  reason: collision with root package name */
        public cb.c f7273b;

        /* renamed from: c  reason: collision with root package name */
        public cb.c f7274c;
        public cb.c d;

        public d(cb.c cVar, cb.c cVar2, cb.c cVar3, cb.c cVar4) {
            this.f7272a = cVar;
            this.f7273b = cVar3;
            this.f7274c = cVar4;
            this.d = cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    /* loaded from: classes.dex */
    public class f implements MaterialButton.b {
        public f(a aVar) {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018227), attributeSet, i10);
        this.f7261c = new ArrayList();
        this.f7262f = new c(null);
        this.f7263j = new f(null);
        this.f7264m = new LinkedHashSet<>();
        this.n = new a();
        this.f7266u = false;
        TypedArray d10 = j.d(getContext(), attributeSet, m9.a.V, i10, 2132018227, new int[0]);
        setSingleSelection(d10.getBoolean(2, false));
        this.f7268z = d10.getResourceId(0, -1);
        this.y = d10.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d10.recycle();
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setCheckedId(int i10) {
        this.f7268z = i10;
        b(i10, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            materialButton.setId(x.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.n.add(this.f7262f);
        materialButton.setOnPressedChangeListenerInternal(this.f7263j);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton c10 = c(i10);
            int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = c10.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            c10.setLayoutParams(layoutParams2);
        }
        if (getChildCount() != 0) {
            if (firstVisibleChildIndex == -1) {
                return;
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            f(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f7261c.add(new d(shapeAppearanceModel.f3963e, shapeAppearanceModel.f3966h, shapeAppearanceModel.f3964f, shapeAppearanceModel.f3965g));
        x.v(materialButton, new b());
    }

    public final void b(int i10, boolean z10) {
        Iterator<e> it = this.f7264m.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10, z10);
        }
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.n);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f7265t = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof MaterialButton) {
            this.f7266u = true;
            ((MaterialButton) findViewById).setChecked(z10);
            this.f7266u = false;
        }
    }

    public final boolean f(int i10, boolean z10) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.y && checkedButtonIds.isEmpty()) {
            e(i10, true);
            this.f7268z = i10;
            return false;
        }
        if (z10 && this.f7267w) {
            checkedButtonIds.remove(Integer.valueOf(i10));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                e(intValue, false);
                b(intValue, false);
            }
        }
        return true;
    }

    public void g() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                k shapeAppearanceModel = c10.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                k.b bVar = new k.b(shapeAppearanceModel);
                d dVar2 = this.f7261c.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    if (i10 == firstVisibleChildIndex) {
                        if (!z10) {
                            cb.c cVar = dVar2.f7272a;
                            cb.c cVar2 = d.f7271e;
                            dVar = new d(cVar, cVar2, dVar2.f7273b, cVar2);
                        } else if (n.f(this)) {
                            cb.c cVar3 = d.f7271e;
                            dVar = new d(cVar3, cVar3, dVar2.f7273b, dVar2.f7274c);
                        } else {
                            cb.c cVar4 = dVar2.f7272a;
                            cb.c cVar5 = dVar2.d;
                            cb.c cVar6 = d.f7271e;
                            dVar = new d(cVar4, cVar5, cVar6, cVar6);
                        }
                    } else if (i10 != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (!z10) {
                        cb.c cVar7 = d.f7271e;
                        dVar = new d(cVar7, dVar2.d, cVar7, dVar2.f7274c);
                    } else if (n.f(this)) {
                        cb.c cVar8 = dVar2.f7272a;
                        cb.c cVar9 = dVar2.d;
                        cb.c cVar10 = d.f7271e;
                        dVar = new d(cVar8, cVar9, cVar10, cVar10);
                    } else {
                        cb.c cVar11 = d.f7271e;
                        dVar = new d(cVar11, cVar11, dVar2.f7273b, dVar2.f7274c);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    bVar.c(0.0f);
                } else {
                    bVar.f3974e = dVar2.f7272a;
                    bVar.f3977h = dVar2.d;
                    bVar.f3975f = dVar2.f7273b;
                    bVar.f3976g = dVar2.f7274c;
                }
                c10.setShapeAppearanceModel(bVar.a());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f7267w) {
            return this.f7268z;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton c10 = c(i10);
            if (c10.isChecked()) {
                arrayList.add(Integer.valueOf(c10.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f7265t;
        if (numArr == null || i11 >= numArr.length) {
            Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
            return i11;
        }
        return numArr[i11].intValue();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i10 = this.f7268z;
        if (i10 != -1 && (materialButton = (MaterialButton) findViewById(i10)) != null) {
            materialButton.setChecked(true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0228b.a(1, getVisibleButtonCount(), false, this.f7267w ? 1 : 2).f13495a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        g();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.n.remove(this.f7262f);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f7261c.remove(indexOfChild);
        }
        g();
        a();
    }

    public void setSelectionRequired(boolean z10) {
        this.y = z10;
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.f7267w != z10) {
            this.f7267w = z10;
            this.f7266u = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                MaterialButton c10 = c(i10);
                c10.setChecked(false);
                b(c10.getId(), false);
            }
            this.f7266u = false;
            setCheckedId(-1);
        }
    }
}
