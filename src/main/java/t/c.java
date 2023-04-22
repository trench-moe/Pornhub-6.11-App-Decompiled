package t;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class c extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<WidgetRun> f15040k;

    /* renamed from: l  reason: collision with root package name */
    public int f15041l;

    public c(ConstraintWidget constraintWidget, int i10) {
        super(constraintWidget);
        ConstraintWidget constraintWidget2;
        this.f15040k = new ArrayList<>();
        this.f1296f = i10;
        ConstraintWidget constraintWidget3 = this.f1293b;
        ConstraintWidget t2 = constraintWidget3.t(i10);
        while (true) {
            ConstraintWidget constraintWidget4 = t2;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            }
            t2 = constraintWidget3.t(this.f1296f);
        }
        this.f1293b = constraintWidget2;
        ArrayList<WidgetRun> arrayList = this.f15040k;
        int i11 = this.f1296f;
        arrayList.add(i11 == 0 ? constraintWidget2.d : i11 == 1 ? constraintWidget2.f1229e : null);
        ConstraintWidget s10 = constraintWidget2.s(this.f1296f);
        while (s10 != null) {
            ArrayList<WidgetRun> arrayList2 = this.f15040k;
            int i12 = this.f1296f;
            arrayList2.add(i12 == 0 ? s10.d : i12 == 1 ? s10.f1229e : null);
            s10 = s10.s(this.f1296f);
        }
        Iterator<WidgetRun> it = this.f15040k.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i13 = this.f1296f;
            if (i13 == 0) {
                next.f1293b.f1224b = this;
            } else if (i13 == 1) {
                next.f1293b.f1226c = this;
            }
        }
        if ((this.f1296f == 0 && ((androidx.constraintlayout.core.widgets.d) this.f1293b.X).S0) && this.f15040k.size() > 1) {
            ArrayList<WidgetRun> arrayList3 = this.f15040k;
            this.f1293b = arrayList3.get(arrayList3.size() - 1).f1293b;
        }
        this.f15041l = this.f1296f == 0 ? this.f1293b.C0 : this.f1293b.D0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x03f9, code lost:
        r10 = r10 - r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(t.d r27) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.a(t.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void d() {
        Iterator<WidgetRun> it = this.f15040k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f15040k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f15040k.get(0).f1293b;
        ConstraintWidget constraintWidget2 = this.f15040k.get(size - 1).f1293b;
        if (this.f1296f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.L;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.N;
            DependencyNode i10 = i(constraintAnchor, 0);
            int e10 = constraintAnchor.e();
            ConstraintWidget m10 = m();
            if (m10 != null) {
                e10 = m10.L.e();
            }
            if (i10 != null) {
                DependencyNode dependencyNode = this.f1298h;
                dependencyNode.f1284l.add(i10);
                dependencyNode.f1278f = e10;
                i10.f1283k.add(dependencyNode);
            }
            DependencyNode i11 = i(constraintAnchor2, 0);
            int e11 = constraintAnchor2.e();
            ConstraintWidget n = n();
            if (n != null) {
                e11 = n.N.e();
            }
            if (i11 != null) {
                DependencyNode dependencyNode2 = this.f1299i;
                dependencyNode2.f1284l.add(i11);
                dependencyNode2.f1278f = -e11;
                i11.f1283k.add(dependencyNode2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.M;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.O;
            DependencyNode i12 = i(constraintAnchor3, 1);
            int e12 = constraintAnchor3.e();
            ConstraintWidget m11 = m();
            if (m11 != null) {
                e12 = m11.M.e();
            }
            if (i12 != null) {
                DependencyNode dependencyNode3 = this.f1298h;
                dependencyNode3.f1284l.add(i12);
                dependencyNode3.f1278f = e12;
                i12.f1283k.add(dependencyNode3);
            }
            DependencyNode i13 = i(constraintAnchor4, 1);
            int e13 = constraintAnchor4.e();
            ConstraintWidget n10 = n();
            if (n10 != null) {
                e13 = n10.O.e();
            }
            if (i13 != null) {
                DependencyNode dependencyNode4 = this.f1299i;
                dependencyNode4.f1284l.add(i13);
                dependencyNode4.f1278f = -e13;
                i13.f1283k.add(dependencyNode4);
            }
        }
        this.f1298h.f1274a = this;
        this.f1299i.f1274a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        for (int i10 = 0; i10 < this.f15040k.size(); i10++) {
            this.f15040k.get(i10).e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1294c = null;
        Iterator<WidgetRun> it = this.f15040k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long j() {
        WidgetRun widgetRun;
        int size = this.f15040k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = widgetRun.f1299i.f1278f + this.f15040k.get(i10).j() + j10 + widgetRun.f1298h.f1278f;
        }
        return j10;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean k() {
        int size = this.f15040k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f15040k.get(i10).k()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget m() {
        for (int i10 = 0; i10 < this.f15040k.size(); i10++) {
            ConstraintWidget constraintWidget = this.f15040k.get(i10).f1293b;
            if (constraintWidget.f1251p0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final ConstraintWidget n() {
        for (int size = this.f15040k.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = this.f15040k.get(size).f1293b;
            if (constraintWidget.f1251p0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f1296f == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it = this.f15040k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
