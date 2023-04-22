package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* loaded from: classes.dex */
public class b extends WidgetRun {
    public b(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, t.d
    public void a(t.d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f1293b;
        int i10 = aVar.P0;
        int i11 = 0;
        int i12 = -1;
        loop0: while (true) {
            for (DependencyNode dependencyNode : this.f1298h.f1284l) {
                int i13 = dependencyNode.f1279g;
                if (i12 == -1 || i13 < i12) {
                    i12 = i13;
                }
                if (i11 < i13) {
                    i11 = i13;
                }
            }
        }
        if (i10 != 0 && i10 != 2) {
            this.f1298h.c(i11 + aVar.R0);
            return;
        }
        this.f1298h.c(i12 + aVar.R0);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        ConstraintWidget constraintWidget = this.f1293b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            DependencyNode dependencyNode = this.f1298h;
            dependencyNode.f1275b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int i10 = aVar.P0;
            boolean z10 = aVar.Q0;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    dependencyNode.f1277e = DependencyNode.Type.RIGHT;
                    while (i11 < aVar.O0) {
                        ConstraintWidget constraintWidget2 = aVar.N0[i11];
                        if (z10 || constraintWidget2.f1251p0 != 8) {
                            DependencyNode dependencyNode2 = constraintWidget2.d.f1299i;
                            dependencyNode2.f1283k.add(this.f1298h);
                            this.f1298h.f1284l.add(dependencyNode2);
                        }
                        i11++;
                    }
                    m(this.f1293b.d.f1298h);
                    m(this.f1293b.d.f1299i);
                    return;
                } else if (i10 == 2) {
                    dependencyNode.f1277e = DependencyNode.Type.TOP;
                    while (i11 < aVar.O0) {
                        ConstraintWidget constraintWidget3 = aVar.N0[i11];
                        if (z10 || constraintWidget3.f1251p0 != 8) {
                            DependencyNode dependencyNode3 = constraintWidget3.f1229e.f1298h;
                            dependencyNode3.f1283k.add(this.f1298h);
                            this.f1298h.f1284l.add(dependencyNode3);
                        }
                        i11++;
                    }
                    m(this.f1293b.f1229e.f1298h);
                    m(this.f1293b.f1229e.f1299i);
                    return;
                } else if (i10 != 3) {
                    return;
                } else {
                    dependencyNode.f1277e = DependencyNode.Type.BOTTOM;
                    while (i11 < aVar.O0) {
                        ConstraintWidget constraintWidget4 = aVar.N0[i11];
                        if (z10 || constraintWidget4.f1251p0 != 8) {
                            DependencyNode dependencyNode4 = constraintWidget4.f1229e.f1299i;
                            dependencyNode4.f1283k.add(this.f1298h);
                            this.f1298h.f1284l.add(dependencyNode4);
                        }
                        i11++;
                    }
                    m(this.f1293b.f1229e.f1298h);
                    m(this.f1293b.f1229e.f1299i);
                    return;
                }
            }
            dependencyNode.f1277e = DependencyNode.Type.LEFT;
            while (i11 < aVar.O0) {
                ConstraintWidget constraintWidget5 = aVar.N0[i11];
                if (z10 || constraintWidget5.f1251p0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.d.f1298h;
                    dependencyNode5.f1283k.add(this.f1298h);
                    this.f1298h.f1284l.add(dependencyNode5);
                }
                i11++;
            }
            m(this.f1293b.d.f1298h);
            m(this.f1293b.d.f1299i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        ConstraintWidget constraintWidget = this.f1293b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int i10 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).P0;
            if (i10 == 0 || i10 == 1) {
                constraintWidget.f1227c0 = this.f1298h.f1279g;
            } else {
                constraintWidget.f1228d0 = this.f1298h.f1279g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1294c = null;
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
