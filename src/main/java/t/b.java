package t;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f15028a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f15029b = new a();

    /* renamed from: c  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f15030c;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f15031a;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f15032b;

        /* renamed from: c  reason: collision with root package name */
        public int f15033c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f15034e;

        /* renamed from: f  reason: collision with root package name */
        public int f15035f;

        /* renamed from: g  reason: collision with root package name */
        public int f15036g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f15037h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f15038i;

        /* renamed from: j  reason: collision with root package name */
        public int f15039j;
    }

    /* renamed from: t.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0264b {
    }

    public b(androidx.constraintlayout.core.widgets.d dVar) {
        this.f15030c = dVar;
    }

    public final boolean a(InterfaceC0264b interfaceC0264b, ConstraintWidget constraintWidget, int i10) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        this.f15029b.f15031a = constraintWidget.r();
        this.f15029b.f15032b = constraintWidget.y();
        this.f15029b.f15033c = constraintWidget.z();
        this.f15029b.d = constraintWidget.q();
        a aVar = this.f15029b;
        aVar.f15038i = false;
        aVar.f15039j = i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f15031a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z10 = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z11 = aVar.f15032b == dimensionBehaviour3;
        boolean z12 = z10 && constraintWidget.f1223a0 > 0.0f;
        boolean z13 = z11 && constraintWidget.f1223a0 > 0.0f;
        if (z12 && constraintWidget.f1258t[0] == 4) {
            aVar.f15031a = dimensionBehaviour;
        }
        if (z13 && constraintWidget.f1258t[1] == 4) {
            aVar.f15032b = dimensionBehaviour;
        }
        ((ConstraintLayout.a) interfaceC0264b).b(constraintWidget, aVar);
        constraintWidget.Y(this.f15029b.f15034e);
        constraintWidget.T(this.f15029b.f15035f);
        a aVar2 = this.f15029b;
        constraintWidget.G = aVar2.f15037h;
        constraintWidget.Q(aVar2.f15036g);
        a aVar3 = this.f15029b;
        aVar3.f15039j = 0;
        return aVar3.f15038i;
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar, int i10, int i11, int i12) {
        int i13 = dVar.f1240j0;
        int i14 = dVar.f1242k0;
        dVar.W(0);
        dVar.V(0);
        dVar.Y = i11;
        int i15 = dVar.f1240j0;
        if (i11 < i15) {
            dVar.Y = i15;
        }
        dVar.Z = i12;
        int i16 = dVar.f1242k0;
        if (i12 < i16) {
            dVar.Z = i16;
        }
        dVar.W(i13);
        dVar.V(i14);
        androidx.constraintlayout.core.widgets.d dVar2 = this.f15030c;
        dVar2.Q0 = i10;
        dVar2.b0();
    }

    public void c(androidx.constraintlayout.core.widgets.d dVar) {
        int i10;
        this.f15028a.clear();
        int size = dVar.N0.size();
        for (i10 = 0; i10 < size; i10 = i10 + 1) {
            ConstraintWidget constraintWidget = dVar.N0.get(i10);
            ConstraintWidget.DimensionBehaviour r10 = constraintWidget.r();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            i10 = (r10 == dimensionBehaviour || constraintWidget.y() == dimensionBehaviour) ? 0 : i10 + 1;
            this.f15028a.add(constraintWidget);
        }
        dVar.j0();
    }
}
