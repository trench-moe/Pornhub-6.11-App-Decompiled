package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import java.util.Objects;
import t9.j0;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public a f1664c;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float A0;
        public float B0;
        public float C0;
        public float D0;

        /* renamed from: r0  reason: collision with root package name */
        public float f1665r0;

        /* renamed from: s0  reason: collision with root package name */
        public boolean f1666s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f1667t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f1668u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f1669v0;
        public float w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f1670x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f1671y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f1672z0;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f1665r0 = 1.0f;
            this.f1666s0 = false;
            this.f1667t0 = 0.0f;
            this.f1668u0 = 0.0f;
            this.f1669v0 = 0.0f;
            this.w0 = 0.0f;
            this.f1670x0 = 1.0f;
            this.f1671y0 = 1.0f;
            this.f1672z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1665r0 = 1.0f;
            this.f1666s0 = false;
            this.f1667t0 = 0.0f;
            this.f1668u0 = 0.0f;
            this.f1669v0 = 0.0f;
            this.w0 = 0.0f;
            this.f1670x0 = 1.0f;
            this.f1671y0 = 1.0f;
            this.f1672z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.E);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f1665r0 = obtainStyledAttributes.getFloat(index, this.f1665r0);
                } else if (index == 28) {
                    this.f1667t0 = obtainStyledAttributes.getFloat(index, this.f1667t0);
                    this.f1666s0 = true;
                } else if (index == 23) {
                    this.f1669v0 = obtainStyledAttributes.getFloat(index, this.f1669v0);
                } else if (index == 24) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == 22) {
                    this.f1668u0 = obtainStyledAttributes.getFloat(index, this.f1668u0);
                } else if (index == 20) {
                    this.f1670x0 = obtainStyledAttributes.getFloat(index, this.f1670x0);
                } else if (index == 21) {
                    this.f1671y0 = obtainStyledAttributes.getFloat(index, this.f1671y0);
                } else if (index == 16) {
                    this.f1672z0 = obtainStyledAttributes.getFloat(index, this.f1672z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
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
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public a getConstraintSet() {
        if (this.f1664c == null) {
            this.f1664c = new a();
        }
        a aVar = this.f1664c;
        Objects.requireNonNull(aVar);
        int childCount = getChildCount();
        aVar.f1688f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (aVar.f1687e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!aVar.f1688f.containsKey(Integer.valueOf(id2))) {
                aVar.f1688f.put(Integer.valueOf(id2), new a.C0022a());
            }
            a.C0022a c0022a = aVar.f1688f.get(Integer.valueOf(id2));
            if (c0022a != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    c0022a.d(id2, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        a.b bVar = c0022a.f1692e;
                        bVar.f1724i0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        bVar.f1720g0 = barrier.getType();
                        c0022a.f1692e.f1726j0 = barrier.getReferencedIds();
                        c0022a.f1692e.f1722h0 = barrier.getMargin();
                    }
                }
                c0022a.d(id2, layoutParams);
            }
        }
        return this.f1664c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
