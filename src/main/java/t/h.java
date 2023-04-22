package t;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* loaded from: classes2.dex */
public class h extends WidgetRun {
    public h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.d.f();
        constraintWidget.f1229e.f();
        this.f1296f = ((androidx.constraintlayout.core.widgets.f) constraintWidget).S0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, t.d
    public void a(d dVar) {
        DependencyNode dependencyNode = this.f1298h;
        if (dependencyNode.f1276c && !dependencyNode.f1282j) {
            this.f1298h.c((int) ((dependencyNode.f1284l.get(0).f1279g * ((androidx.constraintlayout.core.widgets.f) this.f1293b).N0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidget = this.f1293b;
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        int i10 = fVar.O0;
        int i11 = fVar.P0;
        if (fVar.S0 == 1) {
            if (i10 != -1) {
                this.f1298h.f1284l.add(constraintWidget.X.d.f1298h);
                this.f1293b.X.d.f1298h.f1283k.add(this.f1298h);
                this.f1298h.f1278f = i10;
            } else if (i11 != -1) {
                this.f1298h.f1284l.add(constraintWidget.X.d.f1299i);
                this.f1293b.X.d.f1299i.f1283k.add(this.f1298h);
                this.f1298h.f1278f = -i11;
            } else {
                DependencyNode dependencyNode = this.f1298h;
                dependencyNode.f1275b = true;
                dependencyNode.f1284l.add(constraintWidget.X.d.f1299i);
                this.f1293b.X.d.f1299i.f1283k.add(this.f1298h);
            }
            m(this.f1293b.d.f1298h);
            m(this.f1293b.d.f1299i);
            return;
        }
        if (i10 != -1) {
            this.f1298h.f1284l.add(constraintWidget.X.f1229e.f1298h);
            this.f1293b.X.f1229e.f1298h.f1283k.add(this.f1298h);
            this.f1298h.f1278f = i10;
        } else if (i11 != -1) {
            this.f1298h.f1284l.add(constraintWidget.X.f1229e.f1299i);
            this.f1293b.X.f1229e.f1299i.f1283k.add(this.f1298h);
            this.f1298h.f1278f = -i11;
        } else {
            DependencyNode dependencyNode2 = this.f1298h;
            dependencyNode2.f1275b = true;
            dependencyNode2.f1284l.add(constraintWidget.X.f1229e.f1299i);
            this.f1293b.X.f1229e.f1299i.f1283k.add(this.f1298h);
        }
        m(this.f1293b.f1229e.f1298h);
        m(this.f1293b.f1229e.f1299i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        ConstraintWidget constraintWidget = this.f1293b;
        if (((androidx.constraintlayout.core.widgets.f) constraintWidget).S0 == 1) {
            constraintWidget.f1227c0 = this.f1298h.f1279g;
        } else {
            constraintWidget.f1228d0 = this.f1298h.f1279g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1298h.b();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean k() {
        return false;
    }

    public final void m(DependencyNode dependencyNode) {
        this.f1298h.f1283k.add(dependencyNode);
        dependencyNode.f1284l.add(this.f1298h);
    }
}
