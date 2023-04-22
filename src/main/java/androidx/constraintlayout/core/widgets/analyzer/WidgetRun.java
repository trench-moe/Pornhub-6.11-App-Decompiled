package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import t.i;

/* loaded from: classes.dex */
public abstract class WidgetRun implements t.d {

    /* renamed from: a  reason: collision with root package name */
    public int f1292a;

    /* renamed from: b  reason: collision with root package name */
    public ConstraintWidget f1293b;

    /* renamed from: c  reason: collision with root package name */
    public i f1294c;
    public ConstraintWidget.DimensionBehaviour d;

    /* renamed from: e  reason: collision with root package name */
    public a f1295e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    public int f1296f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1297g = false;

    /* renamed from: h  reason: collision with root package name */
    public DependencyNode f1298h = new DependencyNode(this);

    /* renamed from: i  reason: collision with root package name */
    public DependencyNode f1299i = new DependencyNode(this);

    /* renamed from: j  reason: collision with root package name */
    public RunType f1300j = RunType.NONE;

    /* loaded from: classes.dex */
    public enum RunType {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        START,
        /* JADX INFO: Fake field, exist only in values array */
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f1293b = constraintWidget;
    }

    @Override // t.d
    public void a(t.d dVar) {
    }

    public final void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.f1284l.add(dependencyNode2);
        dependencyNode.f1278f = i10;
        dependencyNode2.f1283k.add(dependencyNode);
    }

    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, a aVar) {
        dependencyNode.f1284l.add(dependencyNode2);
        dependencyNode.f1284l.add(this.f1295e);
        dependencyNode.f1280h = i10;
        dependencyNode.f1281i = aVar;
        dependencyNode2.f1283k.add(dependencyNode);
        aVar.f1283k.add(dependencyNode);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.f1293b;
            int i12 = constraintWidget.f1262v;
            max = Math.max(constraintWidget.f1260u, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max != i10) {
                i10 = max;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f1293b;
            int i13 = constraintWidget2.y;
            max = Math.max(constraintWidget2.f1265x, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max != i10) {
                i10 = max;
            }
        }
        return i10;
    }

    public final DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1211f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        int ordinal = constraintAnchor2.f1210e.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return constraintWidget.f1229e.f1306k;
                    }
                    return constraintWidget.f1229e.f1299i;
                }
                return constraintWidget.d.f1299i;
            }
            return constraintWidget.f1229e.f1298h;
        }
        return constraintWidget.d.f1298h;
    }

    public final DependencyNode i(ConstraintAnchor constraintAnchor, int i10) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1211f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        WidgetRun widgetRun = i10 == 0 ? constraintWidget.d : constraintWidget.f1229e;
        int ordinal = constraintAnchor2.f1210e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.f1298h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.f1299i;
        }
        return null;
    }

    public long j() {
        a aVar = this.f1295e;
        if (aVar.f1282j) {
            return aVar.f1279g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (r10.f1292a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(androidx.constraintlayout.core.widgets.ConstraintAnchor r13, androidx.constraintlayout.core.widgets.ConstraintAnchor r14, int r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.l(androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int):void");
    }
}
