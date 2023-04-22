package t;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashSet;
import java.util.Iterator;
import t.b;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static b.a f15049a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    public static int f15050b;

    /* renamed from: c  reason: collision with root package name */
    public static int f15051c;

    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(androidx.constraintlayout.core.widgets.ConstraintWidget r12) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.f.a(androidx.constraintlayout.core.widgets.ConstraintWidget):boolean");
    }

    public static void b(int i10, ConstraintWidget constraintWidget, b.InterfaceC0264b interfaceC0264b, boolean z10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (constraintWidget.f1245m) {
            return;
        }
        f15050b++;
        int i11 = 0;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.H() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.k0(constraintWidget, interfaceC0264b, new b.a(), 0);
        }
        ConstraintAnchor n = constraintWidget.n(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor n10 = constraintWidget.n(ConstraintAnchor.Type.RIGHT);
        int d = n.d();
        int d10 = n10.d();
        HashSet<ConstraintAnchor> hashSet = n.f1207a;
        if (hashSet != null && n.f1209c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                int i12 = i10 + 1;
                boolean a10 = a(constraintWidget2);
                if (constraintWidget2.H() && a10) {
                    androidx.constraintlayout.core.widgets.d.k0(constraintWidget2, interfaceC0264b, new b.a(), i11);
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.L;
                boolean z11 = (next == constraintAnchor5 && (constraintAnchor4 = constraintWidget2.N.f1211f) != null && constraintAnchor4.f1209c) || (next == constraintWidget2.N && (constraintAnchor3 = constraintAnchor5.f1211f) != null && constraintAnchor3.f1209c);
                if (constraintWidget2.r() != dimensionBehaviour || a10) {
                    if (!constraintWidget2.H()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.L;
                        if (next == constraintAnchor6 && constraintWidget2.N.f1211f == null) {
                            int e10 = constraintAnchor6.e() + d;
                            constraintWidget2.R(e10, constraintWidget2.z() + e10);
                            b(i12, constraintWidget2, interfaceC0264b, z10);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.N;
                            if (next == constraintAnchor7 && constraintAnchor6.f1211f == null) {
                                int e11 = d - constraintAnchor7.e();
                                constraintWidget2.R(e11 - constraintWidget2.z(), e11);
                                b(i12, constraintWidget2, interfaceC0264b, z10);
                            } else if (z11 && !constraintWidget2.F()) {
                                c(i12, interfaceC0264b, constraintWidget2, z10);
                            }
                        }
                    }
                } else if (constraintWidget2.r() == dimensionBehaviour && constraintWidget2.f1262v >= 0 && constraintWidget2.f1260u >= 0 && ((constraintWidget2.f1251p0 == 8 || (constraintWidget2.f1254r == 0 && constraintWidget2.f1223a0 == 0.0f)) && !constraintWidget2.F() && !constraintWidget2.I && z11 && !constraintWidget2.F())) {
                    d(i12, constraintWidget, interfaceC0264b, constraintWidget2, z10);
                }
                i11 = 0;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = n10.f1207a;
        if (hashSet2 != null && n10.f1209c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.d;
                int i13 = i10 + 1;
                boolean a11 = a(constraintWidget3);
                if (constraintWidget3.H() && a11) {
                    androidx.constraintlayout.core.widgets.d.k0(constraintWidget3, interfaceC0264b, new b.a(), 0);
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.L;
                boolean z12 = (next2 == constraintAnchor8 && (constraintAnchor2 = constraintWidget3.N.f1211f) != null && constraintAnchor2.f1209c) || (next2 == constraintWidget3.N && (constraintAnchor = constraintAnchor8.f1211f) != null && constraintAnchor.f1209c);
                if (constraintWidget3.r() != dimensionBehaviour || a11) {
                    if (!constraintWidget3.H()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.L;
                        if (next2 == constraintAnchor9 && constraintWidget3.N.f1211f == null) {
                            int e12 = constraintAnchor9.e() + d10;
                            constraintWidget3.R(e12, constraintWidget3.z() + e12);
                            b(i13, constraintWidget3, interfaceC0264b, z10);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.N;
                            if (next2 == constraintAnchor10 && constraintAnchor9.f1211f == null) {
                                int e13 = d10 - constraintAnchor10.e();
                                constraintWidget3.R(e13 - constraintWidget3.z(), e13);
                                b(i13, constraintWidget3, interfaceC0264b, z10);
                            } else if (z12 && !constraintWidget3.F()) {
                                c(i13, interfaceC0264b, constraintWidget3, z10);
                            }
                        }
                    }
                } else if (constraintWidget3.r() == dimensionBehaviour && constraintWidget3.f1262v >= 0 && constraintWidget3.f1260u >= 0 && (constraintWidget3.f1251p0 == 8 || (constraintWidget3.f1254r == 0 && constraintWidget3.f1223a0 == 0.0f))) {
                    if (!constraintWidget3.F() && !constraintWidget3.I && z12 && !constraintWidget3.F()) {
                        d(i13, constraintWidget, interfaceC0264b, constraintWidget3, z10);
                    }
                }
            }
        }
        constraintWidget.f1245m = true;
    }

    public static void c(int i10, b.InterfaceC0264b interfaceC0264b, ConstraintWidget constraintWidget, boolean z10) {
        float f10 = constraintWidget.f1244l0;
        int d = constraintWidget.L.f1211f.d();
        int d10 = constraintWidget.N.f1211f.d();
        int e10 = constraintWidget.L.e() + d;
        int e11 = d10 - constraintWidget.N.e();
        if (d == d10) {
            f10 = 0.5f;
        } else {
            d = e10;
            d10 = e11;
        }
        int z11 = constraintWidget.z();
        int i11 = (d10 - d) - z11;
        if (d > d10) {
            i11 = (d - d10) - z11;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + d;
        int i13 = i12 + z11;
        if (d > d10) {
            i13 = i12 - z11;
        }
        constraintWidget.R(i12, i13);
        b(i10 + 1, constraintWidget, interfaceC0264b, z10);
    }

    public static void d(int i10, ConstraintWidget constraintWidget, b.InterfaceC0264b interfaceC0264b, ConstraintWidget constraintWidget2, boolean z10) {
        float f10 = constraintWidget2.f1244l0;
        int e10 = constraintWidget2.L.e() + constraintWidget2.L.f1211f.d();
        int d = constraintWidget2.N.f1211f.d() - constraintWidget2.N.e();
        if (d >= e10) {
            int z11 = constraintWidget2.z();
            if (constraintWidget2.f1251p0 != 8) {
                int i11 = constraintWidget2.f1254r;
                if (i11 == 2) {
                    z11 = (int) (constraintWidget2.f1244l0 * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.z() : constraintWidget.X.z()));
                } else if (i11 == 0) {
                    z11 = d - e10;
                }
                z11 = Math.max(constraintWidget2.f1260u, z11);
                int i12 = constraintWidget2.f1262v;
                if (i12 > 0) {
                    z11 = Math.min(i12, z11);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d - e10) - z11)) + 0.5f));
            constraintWidget2.R(i13, z11 + i13);
            b(i10 + 1, constraintWidget2, interfaceC0264b, z10);
        }
    }

    public static void e(int i10, b.InterfaceC0264b interfaceC0264b, ConstraintWidget constraintWidget) {
        float f10 = constraintWidget.f1246m0;
        int d = constraintWidget.M.f1211f.d();
        int d10 = constraintWidget.O.f1211f.d();
        int e10 = constraintWidget.M.e() + d;
        int e11 = d10 - constraintWidget.O.e();
        if (d == d10) {
            f10 = 0.5f;
        } else {
            d = e10;
            d10 = e11;
        }
        int q10 = constraintWidget.q();
        int i11 = (d10 - d) - q10;
        if (d > d10) {
            i11 = (d - d10) - q10;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = d + i12;
        int i14 = i13 + q10;
        if (d > d10) {
            i13 = d - i12;
            i14 = i13 - q10;
        }
        constraintWidget.S(i13, i14);
        g(i10 + 1, constraintWidget, interfaceC0264b);
    }

    public static void f(int i10, ConstraintWidget constraintWidget, b.InterfaceC0264b interfaceC0264b, ConstraintWidget constraintWidget2) {
        float f10 = constraintWidget2.f1246m0;
        int e10 = constraintWidget2.M.e() + constraintWidget2.M.f1211f.d();
        int d = constraintWidget2.O.f1211f.d() - constraintWidget2.O.e();
        if (d >= e10) {
            int q10 = constraintWidget2.q();
            if (constraintWidget2.f1251p0 != 8) {
                int i11 = constraintWidget2.f1256s;
                if (i11 == 2) {
                    q10 = (int) (f10 * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.q() : constraintWidget.X.q()));
                } else if (i11 == 0) {
                    q10 = d - e10;
                }
                q10 = Math.max(constraintWidget2.f1265x, q10);
                int i12 = constraintWidget2.y;
                if (i12 > 0) {
                    q10 = Math.min(i12, q10);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d - e10) - q10)) + 0.5f));
            constraintWidget2.S(i13, q10 + i13);
            g(i10 + 1, constraintWidget2, interfaceC0264b);
        }
    }

    public static void g(int i10, ConstraintWidget constraintWidget, b.InterfaceC0264b interfaceC0264b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (constraintWidget.n) {
            return;
        }
        f15051c++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.H() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.k0(constraintWidget, interfaceC0264b, new b.a(), 0);
        }
        ConstraintAnchor n = constraintWidget.n(ConstraintAnchor.Type.TOP);
        ConstraintAnchor n10 = constraintWidget.n(ConstraintAnchor.Type.BOTTOM);
        int d = n.d();
        int d10 = n10.d();
        HashSet<ConstraintAnchor> hashSet = n.f1207a;
        if (hashSet != null && n.f1209c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                int i11 = i10 + 1;
                boolean a10 = a(constraintWidget2);
                if (constraintWidget2.H() && a10) {
                    androidx.constraintlayout.core.widgets.d.k0(constraintWidget2, interfaceC0264b, new b.a(), 0);
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.M;
                boolean z10 = (next == constraintAnchor5 && (constraintAnchor4 = constraintWidget2.O.f1211f) != null && constraintAnchor4.f1209c) || (next == constraintWidget2.O && (constraintAnchor3 = constraintAnchor5.f1211f) != null && constraintAnchor3.f1209c);
                if (constraintWidget2.y() != dimensionBehaviour || a10) {
                    if (!constraintWidget2.H()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.M;
                        if (next == constraintAnchor6 && constraintWidget2.O.f1211f == null) {
                            int e10 = constraintAnchor6.e() + d;
                            constraintWidget2.S(e10, constraintWidget2.q() + e10);
                            g(i11, constraintWidget2, interfaceC0264b);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.O;
                            if (next == constraintAnchor7 && constraintAnchor6.f1211f == null) {
                                int e11 = d - constraintAnchor7.e();
                                constraintWidget2.S(e11 - constraintWidget2.q(), e11);
                                g(i11, constraintWidget2, interfaceC0264b);
                            } else if (z10 && !constraintWidget2.G()) {
                                e(i11, interfaceC0264b, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.y() == dimensionBehaviour && constraintWidget2.y >= 0 && constraintWidget2.f1265x >= 0 && ((constraintWidget2.f1251p0 == 8 || (constraintWidget2.f1256s == 0 && constraintWidget2.f1223a0 == 0.0f)) && !constraintWidget2.G() && !constraintWidget2.I && z10 && !constraintWidget2.G())) {
                    f(i11, constraintWidget, interfaceC0264b, constraintWidget2);
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = n10.f1207a;
        if (hashSet2 != null && n10.f1209c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.d;
                int i12 = i10 + 1;
                boolean a11 = a(constraintWidget3);
                if (constraintWidget3.H() && a11) {
                    androidx.constraintlayout.core.widgets.d.k0(constraintWidget3, interfaceC0264b, new b.a(), 0);
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.M;
                boolean z11 = (next2 == constraintAnchor8 && (constraintAnchor2 = constraintWidget3.O.f1211f) != null && constraintAnchor2.f1209c) || (next2 == constraintWidget3.O && (constraintAnchor = constraintAnchor8.f1211f) != null && constraintAnchor.f1209c);
                if (constraintWidget3.y() != dimensionBehaviour || a11) {
                    if (!constraintWidget3.H()) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget3.M;
                        if (next2 == constraintAnchor9 && constraintWidget3.O.f1211f == null) {
                            int e12 = constraintAnchor9.e() + d10;
                            constraintWidget3.S(e12, constraintWidget3.q() + e12);
                            g(i12, constraintWidget3, interfaceC0264b);
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget3.O;
                            if (next2 == constraintAnchor10 && constraintAnchor9.f1211f == null) {
                                int e13 = d10 - constraintAnchor10.e();
                                constraintWidget3.S(e13 - constraintWidget3.q(), e13);
                                g(i12, constraintWidget3, interfaceC0264b);
                            } else if (z11 && !constraintWidget3.G()) {
                                e(i12, interfaceC0264b, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.y() == dimensionBehaviour && constraintWidget3.y >= 0 && constraintWidget3.f1265x >= 0 && (constraintWidget3.f1251p0 == 8 || (constraintWidget3.f1256s == 0 && constraintWidget3.f1223a0 == 0.0f))) {
                    if (!constraintWidget3.G() && !constraintWidget3.I && z11 && !constraintWidget3.G()) {
                        f(i12, constraintWidget, interfaceC0264b, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor n11 = constraintWidget.n(ConstraintAnchor.Type.BASELINE);
        if (n11.f1207a != null && n11.f1209c) {
            int d11 = n11.d();
            Iterator<ConstraintAnchor> it3 = n11.f1207a.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next3 = it3.next();
                ConstraintWidget constraintWidget4 = next3.d;
                int i13 = i10 + 1;
                boolean a12 = a(constraintWidget4);
                if (constraintWidget4.H() && a12) {
                    androidx.constraintlayout.core.widgets.d.k0(constraintWidget4, interfaceC0264b, new b.a(), 0);
                }
                if (constraintWidget4.y() != dimensionBehaviour || a12) {
                    if (!constraintWidget4.H() && next3 == constraintWidget4.P) {
                        int e14 = next3.e() + d11;
                        if (constraintWidget4.G) {
                            int i14 = e14 - constraintWidget4.f1238i0;
                            int i15 = constraintWidget4.Z + i14;
                            constraintWidget4.f1228d0 = i14;
                            constraintWidget4.M.m(i14);
                            constraintWidget4.O.m(i15);
                            ConstraintAnchor constraintAnchor11 = constraintWidget4.P;
                            constraintAnchor11.f1208b = e14;
                            constraintAnchor11.f1209c = true;
                            constraintWidget4.f1243l = true;
                        }
                        g(i13, constraintWidget4, interfaceC0264b);
                    }
                }
            }
        }
        constraintWidget.n = true;
    }
}
