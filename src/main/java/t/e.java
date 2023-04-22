package t;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.b;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f15042a;
    public androidx.constraintlayout.core.widgets.d d;

    /* renamed from: f  reason: collision with root package name */
    public b.InterfaceC0264b f15046f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f15047g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<i> f15048h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15043b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15044c = true;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<WidgetRun> f15045e = new ArrayList<>();

    public e(androidx.constraintlayout.core.widgets.d dVar) {
        new ArrayList();
        this.f15046f = null;
        this.f15047g = new b.a();
        this.f15048h = new ArrayList<>();
        this.f15042a = dVar;
        this.d = dVar;
    }

    public final void a(DependencyNode dependencyNode, int i10, int i11, DependencyNode dependencyNode2, ArrayList<i> arrayList, i iVar) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun.f1294c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f15042a;
            if (widgetRun != dVar.d) {
                if (widgetRun == dVar.f1229e) {
                    return;
                }
                if (iVar == null) {
                    iVar = new i(widgetRun, i11);
                    arrayList.add(iVar);
                }
                widgetRun.f1294c = iVar;
                iVar.f15054b.add(widgetRun);
                loop0: while (true) {
                    for (d dVar2 : widgetRun.f1298h.f1283k) {
                        if (dVar2 instanceof DependencyNode) {
                            a((DependencyNode) dVar2, i10, 0, dependencyNode2, arrayList, iVar);
                        }
                    }
                }
                loop2: while (true) {
                    for (d dVar3 : widgetRun.f1299i.f1283k) {
                        if (dVar3 instanceof DependencyNode) {
                            a((DependencyNode) dVar3, i10, 1, dependencyNode2, arrayList, iVar);
                        }
                    }
                }
                if (i10 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                    for (d dVar4 : ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f1306k.f1283k) {
                        if (dVar4 instanceof DependencyNode) {
                            a((DependencyNode) dVar4, i10, 2, dependencyNode2, arrayList, iVar);
                        }
                    }
                }
                for (DependencyNode dependencyNode3 : widgetRun.f1298h.f1284l) {
                    a(dependencyNode3, i10, 0, dependencyNode2, arrayList, iVar);
                }
                for (DependencyNode dependencyNode4 : widgetRun.f1299i.f1284l) {
                    a(dependencyNode4, i10, 1, dependencyNode2, arrayList, iVar);
                }
                if (i10 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                    for (DependencyNode dependencyNode5 : ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f1306k.f1284l) {
                        a(dependencyNode5, i10, 2, dependencyNode2, arrayList, iVar);
                    }
                }
            }
        }
    }

    public final boolean b(androidx.constraintlayout.core.widgets.d dVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i10;
        int i11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        Iterator<ConstraintWidget> it = dVar.N0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.W;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (next.f1251p0 == 8) {
                next.f1222a = true;
            } else {
                float f10 = next.f1264w;
                if (f10 < 1.0f && dimensionBehaviour6 == dimensionBehaviour3) {
                    next.f1254r = 2;
                }
                float f11 = next.f1268z;
                if (f11 < 1.0f && dimensionBehaviour7 == dimensionBehaviour3) {
                    next.f1256s = 2;
                }
                if (next.f1223a0 > 0.0f) {
                    if (dimensionBehaviour6 == dimensionBehaviour3 && (dimensionBehaviour7 == dimensionBehaviour4 || dimensionBehaviour7 == dimensionBehaviour5)) {
                        next.f1254r = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour3 && (dimensionBehaviour6 == dimensionBehaviour4 || dimensionBehaviour6 == dimensionBehaviour5)) {
                        next.f1256s = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour3 && dimensionBehaviour7 == dimensionBehaviour3) {
                        if (next.f1254r == 0) {
                            next.f1254r = 3;
                        }
                        if (next.f1256s == 0) {
                            next.f1256s = 3;
                        }
                    }
                }
                if (dimensionBehaviour6 == dimensionBehaviour3 && next.f1254r == 1 && (next.L.f1211f == null || next.N.f1211f == null)) {
                    dimensionBehaviour6 = dimensionBehaviour4;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = (dimensionBehaviour7 == dimensionBehaviour3 && next.f1256s == 1 && (next.M.f1211f == null || next.O.f1211f == null)) ? dimensionBehaviour4 : dimensionBehaviour7;
                androidx.constraintlayout.core.widgets.analyzer.c cVar = next.d;
                cVar.d = dimensionBehaviour6;
                int i12 = next.f1254r;
                cVar.f1292a = i12;
                androidx.constraintlayout.core.widgets.analyzer.d dVar2 = next.f1229e;
                dVar2.d = dimensionBehaviour8;
                int i13 = next.f1256s;
                dVar2.f1292a = i13;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour6 == dimensionBehaviour9 || dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == dimensionBehaviour4) && (dimensionBehaviour8 == dimensionBehaviour9 || dimensionBehaviour8 == dimensionBehaviour5 || dimensionBehaviour8 == dimensionBehaviour4)) {
                    int z10 = next.z();
                    if (dimensionBehaviour6 == dimensionBehaviour9) {
                        i10 = (dVar.z() - next.L.f1212g) - next.N.f1212g;
                        dimensionBehaviour = dimensionBehaviour5;
                    } else {
                        dimensionBehaviour = dimensionBehaviour6;
                        i10 = z10;
                    }
                    int q10 = next.q();
                    if (dimensionBehaviour8 == dimensionBehaviour9) {
                        i11 = (dVar.q() - next.M.f1212g) - next.O.f1212g;
                        dimensionBehaviour2 = dimensionBehaviour5;
                    } else {
                        i11 = q10;
                        dimensionBehaviour2 = dimensionBehaviour8;
                    }
                    f(next, dimensionBehaviour, i10, dimensionBehaviour2, i11);
                    next.d.f1295e.c(next.z());
                    next.f1229e.f1295e.c(next.q());
                    next.f1222a = true;
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour3 && (dimensionBehaviour8 == dimensionBehaviour4 || dimensionBehaviour8 == dimensionBehaviour5)) {
                        if (i12 == 3) {
                            if (dimensionBehaviour8 == dimensionBehaviour4) {
                                f(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int q11 = next.q();
                            f(next, dimensionBehaviour5, (int) ((q11 * next.f1223a0) + 0.5f), dimensionBehaviour5, q11);
                            next.d.f1295e.c(next.z());
                            next.f1229e.f1295e.c(next.q());
                            next.f1222a = true;
                        } else if (i12 == 1) {
                            f(next, dimensionBehaviour4, 0, dimensionBehaviour8, 0);
                            next.d.f1295e.f1304m = next.z();
                        } else if (i12 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.W;
                            if (dimensionBehaviourArr2[0] == dimensionBehaviour5 || dimensionBehaviourArr2[0] == dimensionBehaviour9) {
                                f(next, dimensionBehaviour5, (int) ((f10 * dVar.z()) + 0.5f), dimensionBehaviour8, next.q());
                                next.d.f1295e.c(next.z());
                                next.f1229e.f1295e.c(next.q());
                                next.f1222a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = next.T;
                            if (constraintAnchorArr[0].f1211f == null || constraintAnchorArr[1].f1211f == null) {
                                f(next, dimensionBehaviour4, 0, dimensionBehaviour8, 0);
                                next.d.f1295e.c(next.z());
                                next.f1229e.f1295e.c(next.q());
                                next.f1222a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour8 == dimensionBehaviour3 && (dimensionBehaviour6 == dimensionBehaviour4 || dimensionBehaviour6 == dimensionBehaviour5)) {
                        if (i13 == 3) {
                            if (dimensionBehaviour6 == dimensionBehaviour4) {
                                f(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int z11 = next.z();
                            float f12 = next.f1223a0;
                            if (next.f1225b0 == -1) {
                                f12 = 1.0f / f12;
                            }
                            f(next, dimensionBehaviour5, z11, dimensionBehaviour5, (int) ((z11 * f12) + 0.5f));
                            next.d.f1295e.c(next.z());
                            next.f1229e.f1295e.c(next.q());
                            next.f1222a = true;
                        } else if (i13 == 1) {
                            f(next, dimensionBehaviour6, 0, dimensionBehaviour4, 0);
                            next.f1229e.f1295e.f1304m = next.q();
                        } else if (i13 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = dVar.W;
                            if (dimensionBehaviourArr3[1] == dimensionBehaviour5 || dimensionBehaviourArr3[1] == dimensionBehaviour9) {
                                f(next, dimensionBehaviour6, next.z(), dimensionBehaviour5, (int) ((f11 * dVar.q()) + 0.5f));
                                next.d.f1295e.c(next.z());
                                next.f1229e.f1295e.c(next.q());
                                next.f1222a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = next.T;
                            if (constraintAnchorArr2[2].f1211f == null || constraintAnchorArr2[3].f1211f == null) {
                                f(next, dimensionBehaviour4, 0, dimensionBehaviour8, 0);
                                next.d.f1295e.c(next.z());
                                next.f1229e.f1295e.c(next.q());
                                next.f1222a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour6 == dimensionBehaviour3 && dimensionBehaviour8 == dimensionBehaviour3) {
                        if (i12 == 1 || i13 == 1) {
                            f(next, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            next.d.f1295e.f1304m = next.z();
                            next.f1229e.f1295e.f1304m = next.q();
                        } else if (i13 == 2 && i12 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = dVar.W;
                            if (dimensionBehaviourArr4[0] == dimensionBehaviour5 && dimensionBehaviourArr4[1] == dimensionBehaviour5) {
                                f(next, dimensionBehaviour5, (int) ((f10 * dVar.z()) + 0.5f), dimensionBehaviour5, (int) ((f11 * dVar.q()) + 0.5f));
                                next.d.f1295e.c(next.z());
                                next.f1229e.f1295e.c(next.q());
                                next.f1222a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList<WidgetRun> arrayList = this.f15045e;
        arrayList.clear();
        this.d.d.f();
        this.d.f1229e.f();
        arrayList.add(this.d.d);
        arrayList.add(this.d.f1229e);
        Iterator<ConstraintWidget> it = this.d.N0.iterator();
        HashSet hashSet = null;
        loop0: while (true) {
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof androidx.constraintlayout.core.widgets.f) {
                    arrayList.add(new h(next));
                } else {
                    if (next.F()) {
                        if (next.f1224b == null) {
                            next.f1224b = new c(next, 0);
                        }
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(next.f1224b);
                    } else {
                        arrayList.add(next.d);
                    }
                    if (next.G()) {
                        if (next.f1226c == null) {
                            next.f1226c = new c(next, 1);
                        }
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(next.f1226c);
                    } else {
                        arrayList.add(next.f1229e);
                    }
                    if (next instanceof s.b) {
                        arrayList.add(new androidx.constraintlayout.core.widgets.analyzer.b(next));
                    }
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f1293b != this.d) {
                next2.d();
            }
        }
        this.f15048h.clear();
        i.f15052c = 0;
        e(this.f15042a.d, 0, this.f15048h);
        e(this.f15042a.f1229e, 1, this.f15048h);
        this.f15043b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(androidx.constraintlayout.core.widgets.d r18, int r19) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.d(androidx.constraintlayout.core.widgets.d, int):int");
    }

    public final void e(WidgetRun widgetRun, int i10, ArrayList<i> arrayList) {
        for (d dVar : widgetRun.f1298h.f1283k) {
            if (dVar instanceof DependencyNode) {
                a((DependencyNode) dVar, i10, 0, widgetRun.f1299i, arrayList, null);
            } else if (dVar instanceof WidgetRun) {
                a(((WidgetRun) dVar).f1298h, i10, 0, widgetRun.f1299i, arrayList, null);
            }
        }
        for (d dVar2 : widgetRun.f1299i.f1283k) {
            if (dVar2 instanceof DependencyNode) {
                a((DependencyNode) dVar2, i10, 1, widgetRun.f1298h, arrayList, null);
            } else if (dVar2 instanceof WidgetRun) {
                a(((WidgetRun) dVar2).f1299i, i10, 1, widgetRun.f1298h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f1306k.f1283k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        b.a aVar = this.f15047g;
        aVar.f15031a = dimensionBehaviour;
        aVar.f15032b = dimensionBehaviour2;
        aVar.f15033c = i10;
        aVar.d = i11;
        ((ConstraintLayout.a) this.f15046f).b(constraintWidget, aVar);
        constraintWidget.Y(this.f15047g.f15034e);
        constraintWidget.T(this.f15047g.f15035f);
        b.a aVar2 = this.f15047g;
        constraintWidget.G = aVar2.f15037h;
        constraintWidget.Q(aVar2.f15036g);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.g():void");
    }
}
