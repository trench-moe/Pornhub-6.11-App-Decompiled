package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.pornhub.R;
import com.google.android.material.transformation.FabTransformationBehavior;
import ga.g;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public Map<View, Integer> f7876i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.b A(Context context, boolean z10) {
        int i10 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f7871a = g.b(context, i10);
        bVar.f7872b = new r3.c(17, 0.0f, 0.0f);
        return bVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean t(View view, View view2, boolean z10, boolean z11) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f7876i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z12 = (childAt.getLayoutParams() instanceof CoordinatorLayout.e) && (((CoordinatorLayout.e) childAt.getLayoutParams()).f1788a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z12) {
                    if (z10) {
                        this.f7876i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, a0> weakHashMap = x.f13156a;
                        x.d.s(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f7876i;
                        if (map != null && map.containsKey(childAt)) {
                            int intValue = this.f7876i.get(childAt).intValue();
                            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                            x.d.s(childAt, intValue);
                        }
                    }
                }
            }
            if (!z10) {
                this.f7876i = null;
            }
        }
        super.t(view, view2, z10, z11);
        return true;
    }
}
