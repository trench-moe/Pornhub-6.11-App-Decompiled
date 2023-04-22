package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* loaded from: classes.dex */
public class h extends i {
    @Override // androidx.constraintlayout.core.widgets.i
    public void d0(int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        int i14 = this.T0 + this.U0 + 0;
        int i15 = this.P0 + this.Q0 + 0;
        if (this.O0 > 0) {
            i14 += this.N0[0].z();
            i15 += this.N0[0].q();
        }
        int max = Math.max(this.f1240j0, i14);
        int max2 = Math.max(this.f1242k0, i15);
        if (i10 != 1073741824) {
            i11 = i10 == Integer.MIN_VALUE ? Math.min(max, i11) : i10 == 0 ? max : 0;
        }
        if (i12 != 1073741824) {
            i13 = i12 == Integer.MIN_VALUE ? Math.min(max2, i13) : i12 == 0 ? max2 : 0;
        }
        this.W0 = i11;
        this.X0 = i13;
        Y(i11);
        T(i13);
        if (this.O0 > 0) {
            z10 = true;
        }
        this.V0 = z10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void f(androidx.constraintlayout.core.c cVar, boolean z10) {
        super.f(cVar, z10);
        if (this.O0 > 0) {
            ConstraintWidget constraintWidget = this.N0[0];
            constraintWidget.L();
            constraintWidget.f1246m0 = 0.5f;
            constraintWidget.f1244l0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.i(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.i(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.i(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.i(type4, this, type4, 0);
        }
    }
}
