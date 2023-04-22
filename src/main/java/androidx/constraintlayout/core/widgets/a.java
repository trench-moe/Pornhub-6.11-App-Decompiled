package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends s.b {
    public int P0 = 0;
    public boolean Q0 = true;
    public int R0 = 0;
    public boolean S0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean I() {
        return this.S0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean J() {
        return this.S0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r8.I() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c0() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.a.c0():boolean");
    }

    public int d0() {
        int i10 = this.P0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void f(androidx.constraintlayout.core.c cVar, boolean z10) {
        Object[] objArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintAnchor[] constraintAnchorArr = this.T;
        constraintAnchorArr[0] = this.L;
        constraintAnchorArr[2] = this.M;
        constraintAnchorArr[1] = this.N;
        constraintAnchorArr[3] = this.O;
        int i13 = 0;
        while (true) {
            objArr = this.T;
            if (i13 >= objArr.length) {
                break;
            }
            objArr[i13].f1214i = cVar.l(objArr[i13]);
            i13++;
        }
        int i14 = this.P0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor = objArr[i14];
        if (!this.S0) {
            c0();
        }
        if (this.S0) {
            this.S0 = false;
            int i15 = this.P0;
            if (i15 == 0 || i15 == 1) {
                cVar.e(this.L.f1214i, this.f1227c0);
                cVar.e(this.N.f1214i, this.f1227c0);
                return;
            } else if (i15 == 2 || i15 == 3) {
                cVar.e(this.M.f1214i, this.f1228d0);
                cVar.e(this.O.f1214i, this.f1228d0);
                return;
            } else {
                return;
            }
        }
        for (int i16 = 0; i16 < this.O0; i16++) {
            ConstraintWidget constraintWidget = this.N0[i16];
            if ((this.Q0 || constraintWidget.g()) && ((((i11 = this.P0) == 0 || i11 == 1) && constraintWidget.r() == dimensionBehaviour && constraintWidget.L.f1211f != null && constraintWidget.N.f1211f != null) || (((i12 = this.P0) == 2 || i12 == 3) && constraintWidget.y() == dimensionBehaviour && constraintWidget.M.f1211f != null && constraintWidget.O.f1211f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.L.g() || this.N.g();
        boolean z13 = this.M.g() || this.O.g();
        int i17 = !z11 && (((i10 = this.P0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13)))) ? 5 : 4;
        for (int i18 = 0; i18 < this.O0; i18++) {
            ConstraintWidget constraintWidget2 = this.N0[i18];
            if (this.Q0 || constraintWidget2.g()) {
                SolverVariable l10 = cVar.l(constraintWidget2.T[this.P0]);
                ConstraintAnchor[] constraintAnchorArr2 = constraintWidget2.T;
                int i19 = this.P0;
                constraintAnchorArr2[i19].f1214i = l10;
                int i20 = (constraintAnchorArr2[i19].f1211f == null || constraintAnchorArr2[i19].f1211f.d != this) ? 0 : constraintAnchorArr2[i19].f1212g + 0;
                if (i19 == 0 || i19 == 2) {
                    androidx.constraintlayout.core.b m10 = cVar.m();
                    SolverVariable n = cVar.n();
                    n.f1163m = 0;
                    m10.f(constraintAnchor.f1214i, l10, n, this.R0 - i20);
                    cVar.c(m10);
                } else {
                    androidx.constraintlayout.core.b m11 = cVar.m();
                    SolverVariable n10 = cVar.n();
                    n10.f1163m = 0;
                    m11.e(constraintAnchor.f1214i, l10, n10, this.R0 + i20);
                    cVar.c(m11);
                }
                cVar.d(constraintAnchor.f1214i, l10, this.R0 + i20, i17);
            }
        }
        int i21 = this.P0;
        if (i21 == 0) {
            cVar.d(this.N.f1214i, this.L.f1214i, 0, 8);
            cVar.d(this.L.f1214i, this.X.N.f1214i, 0, 4);
            cVar.d(this.L.f1214i, this.X.L.f1214i, 0, 0);
        } else if (i21 == 1) {
            cVar.d(this.L.f1214i, this.N.f1214i, 0, 8);
            cVar.d(this.L.f1214i, this.X.L.f1214i, 0, 4);
            cVar.d(this.L.f1214i, this.X.N.f1214i, 0, 0);
        } else if (i21 == 2) {
            cVar.d(this.O.f1214i, this.M.f1214i, 0, 8);
            cVar.d(this.M.f1214i, this.X.O.f1214i, 0, 4);
            cVar.d(this.M.f1214i, this.X.M.f1214i, 0, 0);
        } else if (i21 == 3) {
            cVar.d(this.M.f1214i, this.O.f1214i, 0, 8);
            cVar.d(this.M.f1214i, this.X.M.f1214i, 0, 4);
            cVar.d(this.M.f1214i, this.X.O.f1214i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean g() {
        return true;
    }

    @Override // s.b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        a aVar = (a) constraintWidget;
        this.P0 = aVar.P0;
        this.Q0 = aVar.Q0;
        this.R0 = aVar.R0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String m10 = android.support.v4.media.b.m(a1.a.m("[Barrier] "), this.f1253q0, " {");
        for (int i10 = 0; i10 < this.O0; i10++) {
            ConstraintWidget constraintWidget = this.N0[i10];
            if (i10 > 0) {
                m10 = a1.a.l(m10, ", ");
            }
            StringBuilder m11 = a1.a.m(m10);
            m11.append(constraintWidget.f1253q0);
            m10 = m11.toString();
        }
        return a1.a.l(m10, "}");
    }
}
