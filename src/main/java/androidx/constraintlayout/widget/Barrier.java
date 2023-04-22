package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import t9.j0;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public androidx.constraintlayout.core.widgets.a A;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f1586z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.A.Q0;
    }

    public int getMargin() {
        return this.A.R0;
    }

    public int getType() {
        return this.y;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.A = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.A.Q0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.A.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1604m = this.A;
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void o(a.C0022a c0022a, s.b bVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.o(c0022a, bVar, layoutParams, sparseArray);
        if (bVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) bVar;
            u(aVar, c0022a.f1692e.f1720g0, ((d) bVar.X).S0);
            a.b bVar2 = c0022a.f1692e;
            aVar.Q0 = bVar2.f1735o0;
            aVar.R0 = bVar2.f1722h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void p(ConstraintWidget constraintWidget, boolean z10) {
        u(constraintWidget, this.y, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.A.Q0 = z10;
    }

    public void setDpMargin(int i10) {
        this.A.R0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.A.R0 = i10;
    }

    public void setType(int i10) {
        this.y = i10;
    }

    public final void u(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f1586z = i10;
        if (z10) {
            int i11 = this.y;
            if (i11 == 5) {
                this.f1586z = 1;
            } else if (i11 == 6) {
                this.f1586z = 0;
            }
        } else {
            int i12 = this.y;
            if (i12 == 5) {
                this.f1586z = 0;
            } else if (i12 == 6) {
                this.f1586z = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).P0 = this.f1586z;
        }
    }
}
