package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends ConstraintWidget {
    public float N0 = -1.0f;
    public int O0 = -1;
    public int P0 = -1;
    public boolean Q0 = true;
    public ConstraintAnchor R0 = this.M;
    public int S0 = 0;
    public boolean T0;

    public f() {
        this.U.clear();
        this.U.add(this.R0);
        int length = this.T.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.T[i10] = this.R0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean I() {
        return this.T0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean J() {
        return this.T0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void a0(androidx.constraintlayout.core.c cVar, boolean z10) {
        if (this.X == null) {
            return;
        }
        int o10 = cVar.o(this.R0);
        if (this.S0 == 1) {
            this.f1227c0 = o10;
            this.f1228d0 = 0;
            T(this.X.q());
            Y(0);
            return;
        }
        this.f1227c0 = 0;
        this.f1228d0 = o10;
        Y(this.X.z());
        T(0);
    }

    public void b0(int i10) {
        ConstraintAnchor constraintAnchor = this.R0;
        constraintAnchor.f1208b = i10;
        constraintAnchor.f1209c = true;
        this.T0 = true;
    }

    public void c0(int i10) {
        if (this.S0 == i10) {
            return;
        }
        this.S0 = i10;
        this.U.clear();
        if (this.S0 == 1) {
            this.R0 = this.L;
        } else {
            this.R0 = this.M;
        }
        this.U.add(this.R0);
        int length = this.T.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.T[i11] = this.R0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void f(androidx.constraintlayout.core.c cVar, boolean z10) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        d dVar = (d) this.X;
        if (dVar == null) {
            return;
        }
        Object n = dVar.n(ConstraintAnchor.Type.LEFT);
        Object n10 = dVar.n(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.X;
        boolean z11 = true;
        boolean z12 = constraintWidget != null && constraintWidget.W[0] == dimensionBehaviour;
        if (this.S0 == 0) {
            n = dVar.n(ConstraintAnchor.Type.TOP);
            n10 = dVar.n(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.X;
            z12 = (constraintWidget2 == null || constraintWidget2.W[1] != dimensionBehaviour) ? false : false;
        }
        if (this.T0) {
            ConstraintAnchor constraintAnchor = this.R0;
            if (constraintAnchor.f1209c) {
                SolverVariable l10 = cVar.l(constraintAnchor);
                cVar.e(l10, this.R0.d());
                if (this.O0 != -1) {
                    if (z12) {
                        cVar.f(cVar.l(n10), l10, 0, 5);
                    }
                } else if (this.P0 != -1 && z12) {
                    SolverVariable l11 = cVar.l(n10);
                    cVar.f(l10, cVar.l(n), 0, 5);
                    cVar.f(l11, l10, 0, 5);
                }
                this.T0 = false;
                return;
            }
        }
        if (this.O0 != -1) {
            SolverVariable l12 = cVar.l(this.R0);
            cVar.d(l12, cVar.l(n), this.O0, 8);
            if (z12) {
                cVar.f(cVar.l(n10), l12, 0, 5);
            }
        } else if (this.P0 != -1) {
            SolverVariable l13 = cVar.l(this.R0);
            SolverVariable l14 = cVar.l(n10);
            cVar.d(l13, l14, -this.P0, 8);
            if (z12) {
                cVar.f(l13, cVar.l(n), 0, 5);
                cVar.f(l14, l13, 0, 5);
            }
        } else if (this.N0 != -1.0f) {
            SolverVariable l15 = cVar.l(this.R0);
            SolverVariable l16 = cVar.l(n10);
            float f10 = this.N0;
            androidx.constraintlayout.core.b m10 = cVar.m();
            m10.d.d(l15, -1.0f);
            m10.d.d(l16, f10);
            cVar.c(m10);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean g() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        f fVar = (f) constraintWidget;
        this.N0 = fVar.N0;
        this.O0 = fVar.O0;
        this.P0 = fVar.P0;
        this.Q0 = fVar.Q0;
        c0(fVar.S0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r2 != 4) goto L9;
     */
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.constraintlayout.core.widgets.ConstraintAnchor n(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r6) {
        /*
            r5 = this;
            int r2 = r6.ordinal()
            r6 = r2
            r2 = 1
            r0 = r2
            if (r6 == r0) goto L20
            r1 = 2
            if (r6 == r1) goto L17
            r3 = 4
            r1 = 3
            r4 = 2
            if (r6 == r1) goto L20
            r4 = 6
            r2 = 4
            r0 = r2
            if (r6 == r0) goto L17
            goto L2a
        L17:
            int r6 = r5.S0
            r4 = 3
            if (r6 != 0) goto L29
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.R0
            r4 = 6
            return r6
        L20:
            r4 = 4
            int r6 = r5.S0
            if (r6 != r0) goto L29
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.R0
            r3 = 1
            return r6
        L29:
            r4 = 4
        L2a:
            r2 = 0
            r6 = r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.f.n(androidx.constraintlayout.core.widgets.ConstraintAnchor$Type):androidx.constraintlayout.core.widgets.ConstraintAnchor");
    }
}
