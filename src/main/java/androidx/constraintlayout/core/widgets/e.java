package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e extends i {

    /* renamed from: x1  reason: collision with root package name */
    public ConstraintWidget[] f1351x1;

    /* renamed from: a1  reason: collision with root package name */
    public int f1333a1 = -1;
    public int b1 = -1;

    /* renamed from: c1  reason: collision with root package name */
    public int f1334c1 = -1;

    /* renamed from: d1  reason: collision with root package name */
    public int f1335d1 = -1;

    /* renamed from: e1  reason: collision with root package name */
    public int f1336e1 = -1;

    /* renamed from: f1  reason: collision with root package name */
    public int f1337f1 = -1;

    /* renamed from: g1  reason: collision with root package name */
    public float f1338g1 = 0.5f;

    /* renamed from: h1  reason: collision with root package name */
    public float f1339h1 = 0.5f;
    public float i1 = 0.5f;

    /* renamed from: j1  reason: collision with root package name */
    public float f1340j1 = 0.5f;

    /* renamed from: k1  reason: collision with root package name */
    public float f1341k1 = 0.5f;
    public float l1 = 0.5f;

    /* renamed from: m1  reason: collision with root package name */
    public int f1342m1 = 0;

    /* renamed from: n1  reason: collision with root package name */
    public int f1343n1 = 0;

    /* renamed from: o1  reason: collision with root package name */
    public int f1344o1 = 2;
    public int p1 = 2;

    /* renamed from: q1  reason: collision with root package name */
    public int f1345q1 = 0;
    public int r1 = -1;

    /* renamed from: s1  reason: collision with root package name */
    public int f1346s1 = 0;

    /* renamed from: t1  reason: collision with root package name */
    public ArrayList<a> f1347t1 = new ArrayList<>();

    /* renamed from: u1  reason: collision with root package name */
    public ConstraintWidget[] f1348u1 = null;

    /* renamed from: v1  reason: collision with root package name */
    public ConstraintWidget[] f1349v1 = null;

    /* renamed from: w1  reason: collision with root package name */
    public int[] f1350w1 = null;

    /* renamed from: y1  reason: collision with root package name */
    public int f1352y1 = 0;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1353a;
        public ConstraintAnchor d;

        /* renamed from: e  reason: collision with root package name */
        public ConstraintAnchor f1356e;

        /* renamed from: f  reason: collision with root package name */
        public ConstraintAnchor f1357f;

        /* renamed from: g  reason: collision with root package name */
        public ConstraintAnchor f1358g;

        /* renamed from: h  reason: collision with root package name */
        public int f1359h;

        /* renamed from: i  reason: collision with root package name */
        public int f1360i;

        /* renamed from: j  reason: collision with root package name */
        public int f1361j;

        /* renamed from: k  reason: collision with root package name */
        public int f1362k;

        /* renamed from: q  reason: collision with root package name */
        public int f1367q;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintWidget f1354b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f1355c = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f1363l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f1364m = 0;
        public int n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f1365o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f1366p = 0;

        public a(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11) {
            this.f1353a = 0;
            this.f1359h = 0;
            this.f1360i = 0;
            this.f1361j = 0;
            this.f1362k = 0;
            this.f1367q = 0;
            this.f1353a = i10;
            this.d = constraintAnchor;
            this.f1356e = constraintAnchor2;
            this.f1357f = constraintAnchor3;
            this.f1358g = constraintAnchor4;
            this.f1359h = e.this.T0;
            this.f1360i = e.this.P0;
            this.f1361j = e.this.U0;
            this.f1362k = e.this.Q0;
            this.f1367q = i11;
        }

        public void a(ConstraintWidget constraintWidget) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (this.f1353a == 0) {
                int g02 = e.this.g0(constraintWidget, this.f1367q);
                if (constraintWidget.r() == dimensionBehaviour) {
                    this.f1366p++;
                    g02 = 0;
                }
                e eVar = e.this;
                this.f1363l = g02 + (constraintWidget.f1251p0 != 8 ? eVar.f1342m1 : 0) + this.f1363l;
                int f02 = eVar.f0(constraintWidget, this.f1367q);
                if (this.f1354b == null || this.f1355c < f02) {
                    this.f1354b = constraintWidget;
                    this.f1355c = f02;
                    this.f1364m = f02;
                    this.f1365o++;
                }
            } else {
                int g03 = e.this.g0(constraintWidget, this.f1367q);
                int f03 = e.this.f0(constraintWidget, this.f1367q);
                if (constraintWidget.y() == dimensionBehaviour) {
                    this.f1366p++;
                    f03 = 0;
                }
                int i10 = e.this.f1343n1;
                if (constraintWidget.f1251p0 != 8) {
                    r3 = i10;
                }
                this.f1364m = f03 + r3 + this.f1364m;
                if (this.f1354b != null) {
                    if (this.f1355c < g03) {
                    }
                }
                this.f1354b = constraintWidget;
                this.f1355c = g03;
                this.f1363l = g03;
            }
            this.f1365o++;
        }

        public void b(boolean z10, int i10, boolean z11) {
            int i11;
            float f10;
            ConstraintWidget constraintWidget;
            int i12;
            float f11;
            float f12;
            int i13 = this.f1365o;
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = this.n + i14;
                e eVar = e.this;
                if (i15 >= eVar.f1352y1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = eVar.f1351x1[i15];
                if (constraintWidget2 != null) {
                    constraintWidget2.L();
                }
            }
            if (i13 == 0 || this.f1354b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < i13; i18++) {
                int i19 = this.n + (z10 ? (i13 - 1) - i18 : i18);
                e eVar2 = e.this;
                if (i19 >= eVar2.f1352y1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = eVar2.f1351x1[i19];
                if (constraintWidget3 != null && constraintWidget3.f1251p0 == 0) {
                    if (i16 == -1) {
                        i16 = i18;
                    }
                    i17 = i18;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.f1353a != 0) {
                ConstraintWidget constraintWidget5 = this.f1354b;
                e eVar3 = e.this;
                constraintWidget5.C0 = eVar3.f1333a1;
                int i20 = this.f1359h;
                if (i10 > 0) {
                    i20 += eVar3.f1342m1;
                }
                if (z10) {
                    constraintWidget5.N.a(this.f1357f, i20);
                    if (z11) {
                        constraintWidget5.L.a(this.d, this.f1361j);
                    }
                    if (i10 > 0) {
                        this.f1357f.d.L.a(constraintWidget5.N, 0);
                    }
                } else {
                    constraintWidget5.L.a(this.d, i20);
                    if (z11) {
                        constraintWidget5.N.a(this.f1357f, this.f1361j);
                    }
                    if (i10 > 0) {
                        this.d.d.N.a(constraintWidget5.L, 0);
                    }
                }
                for (int i21 = 0; i21 < i13; i21++) {
                    int i22 = this.n + i21;
                    e eVar4 = e.this;
                    if (i22 >= eVar4.f1352y1) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = eVar4.f1351x1[i22];
                    if (constraintWidget6 != null) {
                        if (i21 == 0) {
                            constraintWidget6.j(constraintWidget6.M, this.f1356e, this.f1360i);
                            e eVar5 = e.this;
                            int i23 = eVar5.b1;
                            float f13 = eVar5.f1339h1;
                            if (this.n != 0 || (i11 = eVar5.f1335d1) == -1) {
                                if (z11 && (i11 = eVar5.f1337f1) != -1) {
                                    f10 = eVar5.l1;
                                }
                                constraintWidget6.D0 = i23;
                                constraintWidget6.f1246m0 = f13;
                            } else {
                                f10 = eVar5.f1340j1;
                            }
                            f13 = f10;
                            i23 = i11;
                            constraintWidget6.D0 = i23;
                            constraintWidget6.f1246m0 = f13;
                        }
                        if (i21 == i13 - 1) {
                            constraintWidget6.j(constraintWidget6.O, this.f1358g, this.f1362k);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.M.a(constraintWidget4.O, e.this.f1343n1);
                            if (i21 == i16) {
                                constraintWidget6.M.n(this.f1360i);
                            }
                            constraintWidget4.O.a(constraintWidget6.M, 0);
                            if (i21 == i17 + 1) {
                                constraintWidget4.O.n(this.f1362k);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (z10) {
                                int i24 = e.this.f1344o1;
                                if (i24 == 0) {
                                    constraintWidget6.N.a(constraintWidget5.N, 0);
                                } else if (i24 == 1) {
                                    constraintWidget6.L.a(constraintWidget5.L, 0);
                                } else if (i24 == 2) {
                                    constraintWidget6.L.a(constraintWidget5.L, 0);
                                    constraintWidget6.N.a(constraintWidget5.N, 0);
                                }
                            } else {
                                int i25 = e.this.f1344o1;
                                if (i25 == 0) {
                                    constraintWidget6.L.a(constraintWidget5.L, 0);
                                } else if (i25 == 1) {
                                    constraintWidget6.N.a(constraintWidget5.N, 0);
                                } else if (i25 == 2) {
                                    if (z12) {
                                        constraintWidget6.L.a(this.d, this.f1359h);
                                        constraintWidget6.N.a(this.f1357f, this.f1361j);
                                    } else {
                                        constraintWidget6.L.a(constraintWidget5.L, 0);
                                        constraintWidget6.N.a(constraintWidget5.N, 0);
                                    }
                                }
                                constraintWidget4 = constraintWidget6;
                            }
                        }
                        constraintWidget4 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f1354b;
            e eVar6 = e.this;
            constraintWidget7.D0 = eVar6.b1;
            int i26 = this.f1360i;
            if (i10 > 0) {
                i26 += eVar6.f1343n1;
            }
            constraintWidget7.M.a(this.f1356e, i26);
            if (z11) {
                constraintWidget7.O.a(this.f1358g, this.f1362k);
            }
            if (i10 > 0) {
                this.f1356e.d.O.a(constraintWidget7.M, 0);
            }
            if (e.this.p1 == 3 && !constraintWidget7.G) {
                for (int i27 = 0; i27 < i13; i27++) {
                    int i28 = this.n + (z10 ? (i13 - 1) - i27 : i27);
                    e eVar7 = e.this;
                    if (i28 >= eVar7.f1352y1) {
                        break;
                    }
                    constraintWidget = eVar7.f1351x1[i28];
                    if (constraintWidget.G) {
                        break;
                    }
                }
            }
            constraintWidget = constraintWidget7;
            for (int i29 = 0; i29 < i13; i29++) {
                int i30 = z10 ? (i13 - 1) - i29 : i29;
                int i31 = this.n + i30;
                e eVar8 = e.this;
                if (i31 >= eVar8.f1352y1) {
                    return;
                }
                ConstraintWidget constraintWidget8 = eVar8.f1351x1[i31];
                if (constraintWidget8 != null) {
                    if (i29 == 0) {
                        constraintWidget8.j(constraintWidget8.L, this.d, this.f1359h);
                    }
                    if (i30 == 0) {
                        e eVar9 = e.this;
                        int i32 = eVar9.f1333a1;
                        float f14 = z10 ? 1.0f - eVar9.f1338g1 : eVar9.f1338g1;
                        if (this.n != 0 || (i12 = eVar9.f1334c1) == -1) {
                            if (z11 && (i12 = eVar9.f1336e1) != -1) {
                                if (z10) {
                                    f12 = eVar9.f1341k1;
                                    i32 = i12;
                                    f14 = 1.0f - f12;
                                } else {
                                    f11 = eVar9.f1341k1;
                                    i32 = i12;
                                    f14 = f11;
                                }
                            }
                        } else if (z10) {
                            f12 = eVar9.i1;
                            i32 = i12;
                            f14 = 1.0f - f12;
                        } else {
                            f11 = eVar9.i1;
                            i32 = i12;
                            f14 = f11;
                        }
                        constraintWidget8.C0 = i32;
                        constraintWidget8.f1244l0 = f14;
                    }
                    if (i29 == i13 - 1) {
                        constraintWidget8.j(constraintWidget8.N, this.f1357f, this.f1361j);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.L.a(constraintWidget4.N, e.this.f1342m1);
                        if (i29 == i16) {
                            constraintWidget8.L.n(this.f1359h);
                        }
                        constraintWidget4.N.a(constraintWidget8.L, 0);
                        if (i29 == i17 + 1) {
                            constraintWidget4.N.n(this.f1361j);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        int i33 = e.this.p1;
                        if (i33 == 3 && constraintWidget.G && constraintWidget8 != constraintWidget && constraintWidget8.G) {
                            constraintWidget8.P.a(constraintWidget.P, 0);
                        } else if (i33 == 0) {
                            constraintWidget8.M.a(constraintWidget7.M, 0);
                        } else if (i33 == 1) {
                            constraintWidget8.O.a(constraintWidget7.O, 0);
                        } else if (z12) {
                            constraintWidget8.M.a(this.f1356e, this.f1360i);
                            constraintWidget8.O.a(this.f1358g, this.f1362k);
                        } else {
                            constraintWidget8.M.a(constraintWidget7.M, 0);
                            constraintWidget8.O.a(constraintWidget7.O, 0);
                        }
                    }
                    constraintWidget4 = constraintWidget8;
                }
            }
        }

        public int c() {
            return this.f1353a == 1 ? this.f1364m - e.this.f1343n1 : this.f1364m;
        }

        public int d() {
            return this.f1353a == 0 ? this.f1363l - e.this.f1342m1 : this.f1363l;
        }

        public void e(int i10) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            int i11 = this.f1366p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f1365o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = this.n;
                int i16 = i15 + i14;
                e eVar = e.this;
                if (i16 >= eVar.f1352y1) {
                    break;
                }
                ConstraintWidget constraintWidget = eVar.f1351x1[i15 + i14];
                if (this.f1353a == 0) {
                    if (constraintWidget != null && constraintWidget.r() == dimensionBehaviour2 && constraintWidget.f1254r == 0) {
                        e.this.e0(constraintWidget, dimensionBehaviour, i13, constraintWidget.y(), constraintWidget.q());
                    }
                } else if (constraintWidget != null && constraintWidget.y() == dimensionBehaviour2 && constraintWidget.f1256s == 0) {
                    e.this.e0(constraintWidget, constraintWidget.r(), constraintWidget.z(), dimensionBehaviour, i13);
                }
            }
            this.f1363l = 0;
            this.f1364m = 0;
            this.f1354b = null;
            this.f1355c = 0;
            int i17 = this.f1365o;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = this.n + i18;
                e eVar2 = e.this;
                if (i19 >= eVar2.f1352y1) {
                    return;
                }
                ConstraintWidget constraintWidget2 = eVar2.f1351x1[i19];
                if (this.f1353a == 0) {
                    int z10 = constraintWidget2.z();
                    e eVar3 = e.this;
                    int i20 = eVar3.f1342m1;
                    if (constraintWidget2.f1251p0 == 8) {
                        i20 = 0;
                    }
                    this.f1363l = z10 + i20 + this.f1363l;
                    int f02 = eVar3.f0(constraintWidget2, this.f1367q);
                    if (this.f1354b != null && this.f1355c >= f02) {
                    }
                    this.f1354b = constraintWidget2;
                    this.f1355c = f02;
                    this.f1364m = f02;
                } else {
                    int g02 = eVar2.g0(constraintWidget2, this.f1367q);
                    int f03 = e.this.f0(constraintWidget2, this.f1367q);
                    int i21 = e.this.f1343n1;
                    if (constraintWidget2.f1251p0 == 8) {
                        i21 = 0;
                    }
                    this.f1364m = f03 + i21 + this.f1364m;
                    if (this.f1354b != null && this.f1355c >= g02) {
                    }
                    this.f1354b = constraintWidget2;
                    this.f1355c = g02;
                    this.f1363l = g02;
                }
            }
        }

        public void f(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11, int i12, int i13, int i14, int i15) {
            this.f1353a = i10;
            this.d = constraintAnchor;
            this.f1356e = constraintAnchor2;
            this.f1357f = constraintAnchor3;
            this.f1358g = constraintAnchor4;
            this.f1359h = i11;
            this.f1360i = i12;
            this.f1361j = i13;
            this.f1362k = i14;
            this.f1367q = i15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x07f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:286:0x04c7 -> B:292:0x04d7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:287:0x04c9 -> B:292:0x04d7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:289:0x04cf -> B:292:0x04d7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:290:0x04d1 -> B:292:0x04d7). Please submit an issue!!! */
    @Override // androidx.constraintlayout.core.widgets.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d0(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 2045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.d0(int, int, int, int):void");
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void f(androidx.constraintlayout.core.c cVar, boolean z10) {
        float f10;
        int i10;
        super.f(cVar, z10);
        ConstraintWidget constraintWidget = this.X;
        boolean z11 = constraintWidget != null && ((d) constraintWidget).S0;
        int i11 = this.f1345q1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int size = this.f1347t1.size();
                        int i12 = 0;
                        while (i12 < size) {
                            this.f1347t1.get(i12).b(z11, i12, i12 == size + (-1));
                            i12++;
                        }
                    }
                } else if (this.f1350w1 != null && this.f1349v1 != null) {
                    if (this.f1348u1 != null) {
                        for (int i13 = 0; i13 < this.f1352y1; i13++) {
                            this.f1351x1[i13].L();
                        }
                        int[] iArr = this.f1350w1;
                        int i14 = iArr[0];
                        int i15 = iArr[1];
                        ConstraintWidget constraintWidget2 = null;
                        float f11 = this.f1338g1;
                        int i16 = 0;
                        while (i16 < i14) {
                            if (z11) {
                                i10 = (i14 - i16) - 1;
                                f10 = 1.0f - this.f1338g1;
                            } else {
                                f10 = f11;
                                i10 = i16;
                            }
                            ConstraintWidget constraintWidget3 = this.f1349v1[i10];
                            if (constraintWidget3 != null) {
                                if (constraintWidget3.f1251p0 != 8) {
                                    if (i16 == 0) {
                                        constraintWidget3.j(constraintWidget3.L, this.L, this.T0);
                                        constraintWidget3.C0 = this.f1333a1;
                                        constraintWidget3.f1244l0 = f10;
                                    }
                                    if (i16 == i14 - 1) {
                                        constraintWidget3.j(constraintWidget3.N, this.N, this.U0);
                                    }
                                    if (i16 > 0 && constraintWidget2 != null) {
                                        constraintWidget3.j(constraintWidget3.L, constraintWidget2.N, this.f1342m1);
                                        constraintWidget2.j(constraintWidget2.N, constraintWidget3.L, 0);
                                    }
                                    constraintWidget2 = constraintWidget3;
                                } else {
                                    i16++;
                                    f11 = f10;
                                }
                            }
                            i16++;
                            f11 = f10;
                        }
                        for (int i17 = 0; i17 < i15; i17++) {
                            ConstraintWidget constraintWidget4 = this.f1348u1[i17];
                            if (constraintWidget4 != null) {
                                if (constraintWidget4.f1251p0 != 8) {
                                    if (i17 == 0) {
                                        constraintWidget4.j(constraintWidget4.M, this.M, this.P0);
                                        constraintWidget4.D0 = this.b1;
                                        constraintWidget4.f1246m0 = this.f1339h1;
                                    }
                                    if (i17 == i15 - 1) {
                                        constraintWidget4.j(constraintWidget4.O, this.O, this.Q0);
                                    }
                                    if (i17 > 0 && constraintWidget2 != null) {
                                        constraintWidget4.j(constraintWidget4.M, constraintWidget2.O, this.f1343n1);
                                        constraintWidget2.j(constraintWidget2.O, constraintWidget4.M, 0);
                                    }
                                    constraintWidget2 = constraintWidget4;
                                }
                            }
                        }
                        for (int i18 = 0; i18 < i14; i18++) {
                            for (int i19 = 0; i19 < i15; i19++) {
                                int i20 = (i19 * i14) + i18;
                                if (this.f1346s1 == 1) {
                                    i20 = (i18 * i15) + i19;
                                }
                                ConstraintWidget[] constraintWidgetArr = this.f1351x1;
                                if (i20 < constraintWidgetArr.length) {
                                    ConstraintWidget constraintWidget5 = constraintWidgetArr[i20];
                                    if (constraintWidget5 != null) {
                                        if (constraintWidget5.f1251p0 != 8) {
                                            ConstraintWidget constraintWidget6 = this.f1349v1[i18];
                                            ConstraintWidget constraintWidget7 = this.f1348u1[i19];
                                            if (constraintWidget5 != constraintWidget6) {
                                                constraintWidget5.j(constraintWidget5.L, constraintWidget6.L, 0);
                                                constraintWidget5.j(constraintWidget5.N, constraintWidget6.N, 0);
                                            }
                                            if (constraintWidget5 != constraintWidget7) {
                                                constraintWidget5.j(constraintWidget5.M, constraintWidget7.M, 0);
                                                constraintWidget5.j(constraintWidget5.O, constraintWidget7.O, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.V0 = false;
            }
            int size2 = this.f1347t1.size();
            int i21 = 0;
            while (i21 < size2) {
                this.f1347t1.get(i21).b(z11, i21, i21 == size2 + (-1));
                i21++;
            }
        } else if (this.f1347t1.size() > 0) {
            this.f1347t1.get(0).b(z11, 0, true);
        }
        this.V0 = false;
    }

    public final int f0(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.y() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f1256s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.f1268z * i10);
                if (i12 != constraintWidget.q()) {
                    constraintWidget.f1233g = true;
                    e0(constraintWidget, constraintWidget.r(), constraintWidget.z(), ConstraintWidget.DimensionBehaviour.FIXED, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return constraintWidget.q();
            } else {
                if (i11 == 3) {
                    return (int) ((constraintWidget.z() * constraintWidget.f1223a0) + 0.5f);
                }
            }
        }
        return constraintWidget.q();
    }

    public final int g0(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.r() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f1254r;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.f1264w * i10);
                if (i12 != constraintWidget.z()) {
                    constraintWidget.f1233g = true;
                    e0(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i12, constraintWidget.y(), constraintWidget.q());
                }
                return i12;
            } else if (i11 == 1) {
                return constraintWidget.z();
            } else {
                if (i11 == 3) {
                    return (int) ((constraintWidget.q() * constraintWidget.f1223a0) + 0.5f);
                }
            }
        }
        return constraintWidget.z();
    }

    @Override // s.b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        e eVar = (e) constraintWidget;
        this.f1333a1 = eVar.f1333a1;
        this.b1 = eVar.b1;
        this.f1334c1 = eVar.f1334c1;
        this.f1335d1 = eVar.f1335d1;
        this.f1336e1 = eVar.f1336e1;
        this.f1337f1 = eVar.f1337f1;
        this.f1338g1 = eVar.f1338g1;
        this.f1339h1 = eVar.f1339h1;
        this.i1 = eVar.i1;
        this.f1340j1 = eVar.f1340j1;
        this.f1341k1 = eVar.f1341k1;
        this.l1 = eVar.l1;
        this.f1342m1 = eVar.f1342m1;
        this.f1343n1 = eVar.f1343n1;
        this.f1344o1 = eVar.f1344o1;
        this.p1 = eVar.p1;
        this.f1345q1 = eVar.f1345q1;
        this.r1 = eVar.r1;
        this.f1346s1 = eVar.f1346s1;
    }
}
