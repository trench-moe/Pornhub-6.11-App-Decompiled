package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* loaded from: classes.dex */
public class d extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public DependencyNode f1306k;

    /* renamed from: l  reason: collision with root package name */
    public a f1307l;

    public d(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f1306k = dependencyNode;
        this.f1307l = null;
        this.f1298h.f1277e = DependencyNode.Type.TOP;
        this.f1299i.f1277e = DependencyNode.Type.BOTTOM;
        dependencyNode.f1277e = DependencyNode.Type.BASELINE;
        this.f1296f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, t.d
    public void a(t.d dVar) {
        a aVar;
        float f10;
        float f11;
        float f12;
        int i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (this.f1300j.ordinal() == 3) {
            ConstraintWidget constraintWidget = this.f1293b;
            l(constraintWidget.M, constraintWidget.O, 1);
            return;
        }
        a aVar2 = this.f1295e;
        if (aVar2.f1276c && !aVar2.f1282j && this.d == dimensionBehaviour) {
            ConstraintWidget constraintWidget2 = this.f1293b;
            int i11 = constraintWidget2.f1256s;
            if (i11 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.X;
                if (constraintWidget3 != null) {
                    if (constraintWidget3.f1229e.f1295e.f1282j) {
                        aVar2.c((int) ((aVar.f1279g * constraintWidget2.f1268z) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                a aVar3 = constraintWidget2.d.f1295e;
                if (aVar3.f1282j) {
                    int i12 = constraintWidget2.f1225b0;
                    if (i12 == -1) {
                        f10 = aVar3.f1279g;
                        f11 = constraintWidget2.f1223a0;
                    } else if (i12 == 0) {
                        f12 = aVar3.f1279g * constraintWidget2.f1223a0;
                        i10 = (int) (f12 + 0.5f);
                        aVar2.c(i10);
                    } else if (i12 != 1) {
                        i10 = 0;
                        aVar2.c(i10);
                    } else {
                        f10 = aVar3.f1279g;
                        f11 = constraintWidget2.f1223a0;
                    }
                    f12 = f10 / f11;
                    i10 = (int) (f12 + 0.5f);
                    aVar2.c(i10);
                }
            }
        }
        DependencyNode dependencyNode = this.f1298h;
        if (dependencyNode.f1276c) {
            DependencyNode dependencyNode2 = this.f1299i;
            if (dependencyNode2.f1276c) {
                if (dependencyNode.f1282j && dependencyNode2.f1282j && this.f1295e.f1282j) {
                    return;
                }
                if (!this.f1295e.f1282j && this.d == dimensionBehaviour) {
                    ConstraintWidget constraintWidget4 = this.f1293b;
                    if (constraintWidget4.f1254r == 0 && !constraintWidget4.G()) {
                        int i13 = this.f1298h.f1284l.get(0).f1279g;
                        DependencyNode dependencyNode3 = this.f1298h;
                        int i14 = i13 + dependencyNode3.f1278f;
                        int i15 = this.f1299i.f1284l.get(0).f1279g + this.f1299i.f1278f;
                        dependencyNode3.c(i14);
                        this.f1299i.c(i15);
                        this.f1295e.c(i15 - i14);
                        return;
                    }
                }
                if (!this.f1295e.f1282j && this.d == dimensionBehaviour && this.f1292a == 1 && this.f1298h.f1284l.size() > 0 && this.f1299i.f1284l.size() > 0) {
                    int i16 = (this.f1299i.f1284l.get(0).f1279g + this.f1299i.f1278f) - (this.f1298h.f1284l.get(0).f1279g + this.f1298h.f1278f);
                    a aVar4 = this.f1295e;
                    int i17 = aVar4.f1304m;
                    if (i16 < i17) {
                        aVar4.c(i16);
                    } else {
                        aVar4.c(i17);
                    }
                }
                if (this.f1295e.f1282j && this.f1298h.f1284l.size() > 0 && this.f1299i.f1284l.size() > 0) {
                    DependencyNode dependencyNode4 = this.f1298h.f1284l.get(0);
                    DependencyNode dependencyNode5 = this.f1299i.f1284l.get(0);
                    int i18 = dependencyNode4.f1279g;
                    DependencyNode dependencyNode6 = this.f1298h;
                    int i19 = dependencyNode6.f1278f + i18;
                    int i20 = dependencyNode5.f1279g;
                    int i21 = this.f1299i.f1278f + i20;
                    float f13 = this.f1293b.f1246m0;
                    if (dependencyNode4 == dependencyNode5) {
                        f13 = 0.5f;
                    } else {
                        i18 = i19;
                        i20 = i21;
                    }
                    dependencyNode6.c((int) ((((i20 - i18) - this.f1295e.f1279g) * f13) + i18 + 0.5f));
                    this.f1299i.c(this.f1298h.f1279g + this.f1295e.f1279g);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.d.d():void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.f1298h;
        if (dependencyNode.f1282j) {
            this.f1293b.f1228d0 = dependencyNode.f1279g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1294c = null;
        this.f1298h.b();
        this.f1299i.b();
        this.f1306k.b();
        this.f1295e.b();
        this.f1297g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f1293b.f1256s == 0;
    }

    public void m() {
        this.f1297g = false;
        this.f1298h.b();
        this.f1298h.f1282j = false;
        this.f1299i.b();
        this.f1299i.f1282j = false;
        this.f1306k.b();
        this.f1306k.f1282j = false;
        this.f1295e.f1282j = false;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("VerticalRun ");
        m10.append(this.f1293b.f1253q0);
        return m10.toString();
    }
}
