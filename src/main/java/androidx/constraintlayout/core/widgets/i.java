package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import t.b;

/* loaded from: classes.dex */
public class i extends s.b {
    public int P0 = 0;
    public int Q0 = 0;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 0;
    public int U0 = 0;
    public boolean V0 = false;
    public int W0 = 0;
    public int X0 = 0;
    public b.a Y0 = new b.a();
    public b.InterfaceC0264b Z0 = null;

    @Override // s.b, s.a
    public void c(d dVar) {
        c0();
    }

    public void c0() {
        for (int i10 = 0; i10 < this.O0; i10++) {
            ConstraintWidget constraintWidget = this.N0[i10];
            if (constraintWidget != null) {
                constraintWidget.I = true;
            }
        }
    }

    public void d0(int i10, int i11, int i12, int i13) {
    }

    public void e0(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        b.InterfaceC0264b interfaceC0264b;
        ConstraintWidget constraintWidget2;
        while (true) {
            interfaceC0264b = this.Z0;
            if (interfaceC0264b != null || (constraintWidget2 = this.X) == null) {
                break;
            }
            this.Z0 = ((d) constraintWidget2).R0;
        }
        b.a aVar = this.Y0;
        aVar.f15031a = dimensionBehaviour;
        aVar.f15032b = dimensionBehaviour2;
        aVar.f15033c = i10;
        aVar.d = i11;
        ((ConstraintLayout.a) interfaceC0264b).b(constraintWidget, aVar);
        constraintWidget.Y(this.Y0.f15034e);
        constraintWidget.T(this.Y0.f15035f);
        b.a aVar2 = this.Y0;
        constraintWidget.G = aVar2.f15037h;
        constraintWidget.Q(aVar2.f15036g);
    }
}
