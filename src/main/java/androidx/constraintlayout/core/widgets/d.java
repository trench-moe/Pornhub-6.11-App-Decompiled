package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.io.ConstantsKt;
import t.b;

/* loaded from: classes.dex */
public class d extends s.c {
    public int Q0;
    public int U0;
    public int V0;
    public t.b O0 = new t.b(this);
    public t.e P0 = new t.e(this);
    public b.InterfaceC0264b R0 = null;
    public boolean S0 = false;
    public androidx.constraintlayout.core.c T0 = new androidx.constraintlayout.core.c();
    public int W0 = 0;
    public int X0 = 0;
    public c[] Y0 = new c[4];
    public c[] Z0 = new c[4];

    /* renamed from: a1  reason: collision with root package name */
    public int f1326a1 = 257;
    public boolean b1 = false;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f1327c1 = false;

    /* renamed from: d1  reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f1328d1 = null;

    /* renamed from: e1  reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f1329e1 = null;

    /* renamed from: f1  reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f1330f1 = null;

    /* renamed from: g1  reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f1331g1 = null;

    /* renamed from: h1  reason: collision with root package name */
    public HashSet<ConstraintWidget> f1332h1 = new HashSet<>();
    public b.a i1 = new b.a();

    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k0(androidx.constraintlayout.core.widgets.ConstraintWidget r11, t.b.InterfaceC0264b r12, t.b.a r13, int r14) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.k0(androidx.constraintlayout.core.widgets.ConstraintWidget, t.b$b, t.b$a, int):boolean");
    }

    @Override // s.c, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void K() {
        this.T0.u();
        this.U0 = 0;
        this.V0 = 0;
        super.K();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Z(boolean z10, boolean z11) {
        super.Z(z10, z11);
        int size = this.N0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.N0.get(i10).Z(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:337:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x063c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0890 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0993  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v18 */
    @Override // s.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b0() {
        /*
            Method dump skipped, instructions count: 2467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.b0():void");
    }

    public void c0(ConstraintWidget constraintWidget, int i10) {
        if (i10 == 0) {
            int i11 = this.W0 + 1;
            c[] cVarArr = this.Z0;
            if (i11 >= cVarArr.length) {
                this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.Z0;
            int i12 = this.W0;
            cVarArr2[i12] = new c(constraintWidget, 0, this.S0);
            this.W0 = i12 + 1;
        } else if (i10 == 1) {
            int i13 = this.X0 + 1;
            c[] cVarArr3 = this.Y0;
            if (i13 >= cVarArr3.length) {
                this.Y0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.Y0;
            int i14 = this.X0;
            cVarArr4[i14] = new c(constraintWidget, 1, this.S0);
            this.X0 = i14 + 1;
        }
    }

    public boolean d0(androidx.constraintlayout.core.c cVar) {
        boolean z10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean l02 = l0(64);
        f(cVar, l02);
        int size = this.N0.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.N0.get(i10);
            boolean[] zArr = constraintWidget.V;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget2 = this.N0.get(i11);
                if (constraintWidget2 instanceof a) {
                    a aVar = (a) constraintWidget2;
                    for (int i12 = 0; i12 < aVar.O0; i12++) {
                        ConstraintWidget constraintWidget3 = aVar.N0[i12];
                        if (aVar.Q0 || constraintWidget3.g()) {
                            int i13 = aVar.P0;
                            if (i13 == 0 || i13 == 1) {
                                constraintWidget3.V[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                constraintWidget3.V[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.f1332h1.clear();
        for (int i14 = 0; i14 < size; i14++) {
            ConstraintWidget constraintWidget4 = this.N0.get(i14);
            if (constraintWidget4.e()) {
                if (constraintWidget4 instanceof i) {
                    this.f1332h1.add(constraintWidget4);
                } else {
                    constraintWidget4.f(cVar, l02);
                }
            }
        }
        while (this.f1332h1.size() > 0) {
            int size2 = this.f1332h1.size();
            Iterator<ConstraintWidget> it = this.f1332h1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i iVar = (i) it.next();
                HashSet<ConstraintWidget> hashSet = this.f1332h1;
                int i15 = 0;
                while (true) {
                    if (i15 >= iVar.O0) {
                        z10 = false;
                        continue;
                        break;
                    } else if (hashSet.contains(iVar.N0[i15])) {
                        z10 = true;
                        continue;
                        break;
                    } else {
                        i15++;
                    }
                }
                if (z10) {
                    iVar.f(cVar, l02);
                    this.f1332h1.remove(iVar);
                    break;
                }
            }
            if (size2 == this.f1332h1.size()) {
                Iterator<ConstraintWidget> it2 = this.f1332h1.iterator();
                while (it2.hasNext()) {
                    it2.next().f(cVar, l02);
                }
                this.f1332h1.clear();
            }
        }
        if (androidx.constraintlayout.core.c.f1185p) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget5 = this.N0.get(i16);
                if (!constraintWidget5.e()) {
                    hashSet2.add(constraintWidget5);
                }
            }
            d(this, cVar, hashSet2, r() == dimensionBehaviour2 ? 0 : 1, false);
            Iterator<ConstraintWidget> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next = it3.next();
                g.a(this, cVar, next);
                next.f(cVar, l02);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                ConstraintWidget constraintWidget6 = this.N0.get(i17);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.W;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                        dimensionBehaviourArr[0] = dimensionBehaviour;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour2) {
                        dimensionBehaviourArr[1] = dimensionBehaviour;
                    }
                    constraintWidget6.f(cVar, l02);
                    if (dimensionBehaviour3 == dimensionBehaviour2) {
                        constraintWidget6.U(dimensionBehaviour3);
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour2) {
                        constraintWidget6.X(dimensionBehaviour4);
                    }
                } else {
                    g.a(this, cVar, constraintWidget6);
                    if (!constraintWidget6.e()) {
                        constraintWidget6.f(cVar, l02);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            b.a(this, cVar, null, 0);
        }
        if (this.X0 > 0) {
            b.a(this, cVar, null, 1);
        }
        return true;
    }

    public void e0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f1331g1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.d() > this.f1331g1.get().d()) {
            this.f1331g1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void f0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f1329e1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.d() > this.f1329e1.get().d()) {
            this.f1329e1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void g0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f1330f1;
        if (weakReference != null) {
            if (weakReference.get() != null) {
                if (constraintAnchor.d() > this.f1330f1.get().d()) {
                }
            }
        }
        this.f1330f1 = new WeakReference<>(constraintAnchor);
    }

    public void h0(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f1328d1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.d() > this.f1328d1.get().d()) {
            this.f1328d1 = new WeakReference<>(constraintAnchor);
        }
    }

    public boolean i0(boolean z10, int i10) {
        boolean z11;
        t.e eVar = this.P0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z12 = true;
        boolean z13 = z10 & true;
        ConstraintWidget.DimensionBehaviour p10 = eVar.f15042a.p(0);
        ConstraintWidget.DimensionBehaviour p11 = eVar.f15042a.p(1);
        int A = eVar.f15042a.A();
        int B = eVar.f15042a.B();
        if (z13 && (p10 == dimensionBehaviour2 || p11 == dimensionBehaviour2)) {
            Iterator<WidgetRun> it = eVar.f15045e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun next = it.next();
                if (next.f1296f == i10 && !next.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && p10 == dimensionBehaviour2) {
                    d dVar = eVar.f15042a;
                    dVar.W[0] = dimensionBehaviour3;
                    dVar.Y(eVar.d(dVar, 0));
                    d dVar2 = eVar.f15042a;
                    dVar2.d.f1295e.c(dVar2.z());
                }
            } else if (z13 && p11 == dimensionBehaviour2) {
                d dVar3 = eVar.f15042a;
                dVar3.W[1] = dimensionBehaviour3;
                dVar3.T(eVar.d(dVar3, 1));
                d dVar4 = eVar.f15042a;
                dVar4.f1229e.f1295e.c(dVar4.q());
            }
        }
        if (i10 == 0) {
            d dVar5 = eVar.f15042a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = dVar5.W;
            if (dimensionBehaviourArr[0] == dimensionBehaviour3 || dimensionBehaviourArr[0] == dimensionBehaviour) {
                int z14 = dVar5.z() + A;
                eVar.f15042a.d.f1299i.c(z14);
                eVar.f15042a.d.f1295e.c(z14 - A);
                z11 = true;
            }
            z11 = false;
        } else {
            d dVar6 = eVar.f15042a;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar6.W;
            if (dimensionBehaviourArr2[1] == dimensionBehaviour3 || dimensionBehaviourArr2[1] == dimensionBehaviour) {
                int q10 = dVar6.q() + B;
                eVar.f15042a.f1229e.f1299i.c(q10);
                eVar.f15042a.f1229e.f1295e.c(q10 - B);
                z11 = true;
            }
            z11 = false;
        }
        eVar.g();
        Iterator<WidgetRun> it2 = eVar.f15045e.iterator();
        while (it2.hasNext()) {
            WidgetRun next2 = it2.next();
            if (next2.f1296f == i10 && (next2.f1293b != eVar.f15042a || next2.f1297g)) {
                next2.e();
            }
        }
        Iterator<WidgetRun> it3 = eVar.f15045e.iterator();
        while (it3.hasNext()) {
            WidgetRun next3 = it3.next();
            if (next3.f1296f == i10 && (z11 || next3.f1293b != eVar.f15042a)) {
                if (!next3.f1298h.f1282j || !next3.f1299i.f1282j || (!(next3 instanceof t.c) && !next3.f1295e.f1282j)) {
                    z12 = false;
                    break;
                }
            }
        }
        eVar.f15042a.U(p10);
        eVar.f15042a.X(p11);
        return z12;
    }

    public void j0() {
        this.P0.f15043b = true;
    }

    public boolean l0(int i10) {
        return (this.f1326a1 & i10) == i10;
    }

    public void m0(b.InterfaceC0264b interfaceC0264b) {
        this.R0 = interfaceC0264b;
        this.P0.f15046f = interfaceC0264b;
    }

    public void n0(int i10) {
        this.f1326a1 = i10;
        androidx.constraintlayout.core.c.f1185p = l0(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void v(StringBuilder sb2) {
        sb2.append(this.f1239j + ":{\n");
        sb2.append("  actualWidth:" + this.Y);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Z);
        sb2.append("\n");
        Iterator<ConstraintWidget> it = this.N0.iterator();
        while (it.hasNext()) {
            it.next().v(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
