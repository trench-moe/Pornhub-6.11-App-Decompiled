package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* loaded from: classes.dex */
public class c extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f1305k = new int[2];

    public c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f1298h.f1277e = DependencyNode.Type.LEFT;
        this.f1299i.f1277e = DependencyNode.Type.RIGHT;
        this.f1296f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0281, code lost:
        if (r15 != 1) goto L128;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(t.d r19) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(t.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0485  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.d():void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.f1298h;
        if (dependencyNode.f1282j) {
            this.f1293b.f1227c0 = dependencyNode.f1279g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void f() {
        this.f1294c = null;
        this.f1298h.b();
        this.f1299i.b();
        this.f1295e.b();
        this.f1297g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean k() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f1293b.f1254r == 0;
    }

    public final void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else if (i14 != 1) {
                return;
            } else {
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    public void n() {
        this.f1297g = false;
        this.f1298h.b();
        this.f1298h.f1282j = false;
        this.f1299i.b();
        this.f1299i.f1282j = false;
        this.f1295e.f1282j = false;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("HorizontalRun ");
        m10.append(this.f1293b.f1253q0);
        return m10.toString();
    }
}
