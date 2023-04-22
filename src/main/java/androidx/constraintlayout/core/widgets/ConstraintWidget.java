package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public boolean A;
    public boolean A0;
    public boolean B;
    public boolean B0;
    public int C;
    public int C0;
    public float D;
    public int D0;
    public int[] E;
    public boolean E0;
    public float F;
    public boolean F0;
    public boolean G;
    public float[] G0;
    public boolean H;
    public ConstraintWidget[] H0;
    public boolean I;
    public ConstraintWidget[] I0;
    public int J;
    public ConstraintWidget J0;
    public int K;
    public ConstraintWidget K0;
    public ConstraintAnchor L;
    public int L0;
    public ConstraintAnchor M;
    public int M0;
    public ConstraintAnchor N;
    public ConstraintAnchor O;
    public ConstraintAnchor P;
    public ConstraintAnchor Q;
    public ConstraintAnchor R;
    public ConstraintAnchor S;
    public ConstraintAnchor[] T;
    public ArrayList<ConstraintAnchor> U;
    public boolean[] V;
    public DimensionBehaviour[] W;
    public ConstraintWidget X;
    public int Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f1223a0;

    /* renamed from: b  reason: collision with root package name */
    public t.c f1224b;

    /* renamed from: b0  reason: collision with root package name */
    public int f1225b0;

    /* renamed from: c  reason: collision with root package name */
    public t.c f1226c;

    /* renamed from: c0  reason: collision with root package name */
    public int f1227c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1228d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f1230e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1232f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f1234g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f1236h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1238i0;

    /* renamed from: j  reason: collision with root package name */
    public String f1239j;

    /* renamed from: j0  reason: collision with root package name */
    public int f1240j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1241k;

    /* renamed from: k0  reason: collision with root package name */
    public int f1242k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1243l;

    /* renamed from: l0  reason: collision with root package name */
    public float f1244l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1245m;

    /* renamed from: m0  reason: collision with root package name */
    public float f1246m0;
    public boolean n;

    /* renamed from: n0  reason: collision with root package name */
    public Object f1247n0;

    /* renamed from: o  reason: collision with root package name */
    public int f1248o;

    /* renamed from: o0  reason: collision with root package name */
    public int f1249o0;

    /* renamed from: p  reason: collision with root package name */
    public int f1250p;

    /* renamed from: p0  reason: collision with root package name */
    public int f1251p0;

    /* renamed from: q  reason: collision with root package name */
    public int f1252q;

    /* renamed from: q0  reason: collision with root package name */
    public String f1253q0;

    /* renamed from: r  reason: collision with root package name */
    public int f1254r;

    /* renamed from: r0  reason: collision with root package name */
    public String f1255r0;

    /* renamed from: s  reason: collision with root package name */
    public int f1256s;

    /* renamed from: s0  reason: collision with root package name */
    public int f1257s0;

    /* renamed from: t  reason: collision with root package name */
    public int[] f1258t;

    /* renamed from: t0  reason: collision with root package name */
    public int f1259t0;

    /* renamed from: u  reason: collision with root package name */
    public int f1260u;

    /* renamed from: u0  reason: collision with root package name */
    public int f1261u0;

    /* renamed from: v  reason: collision with root package name */
    public int f1262v;

    /* renamed from: v0  reason: collision with root package name */
    public int f1263v0;

    /* renamed from: w  reason: collision with root package name */
    public float f1264w;
    public boolean w0;

    /* renamed from: x  reason: collision with root package name */
    public int f1265x;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f1266x0;
    public int y;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f1267y0;

    /* renamed from: z  reason: collision with root package name */
    public float f1268z;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f1269z0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1222a = false;
    public androidx.constraintlayout.core.widgets.analyzer.c d = null;

    /* renamed from: e  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.d f1229e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f1231f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f1233g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f1235h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f1237i = -1;

    /* loaded from: classes.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        new HashMap();
        this.f1241k = false;
        this.f1243l = false;
        this.f1245m = false;
        this.n = false;
        this.f1248o = -1;
        this.f1250p = -1;
        this.f1252q = 0;
        this.f1254r = 0;
        this.f1256s = 0;
        this.f1258t = new int[2];
        this.f1260u = 0;
        this.f1262v = 0;
        this.f1264w = 1.0f;
        this.f1265x = 0;
        this.y = 0;
        this.f1268z = 1.0f;
        this.C = -1;
        this.D = 1.0f;
        this.E = new int[]{IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE};
        this.F = 0.0f;
        this.G = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.L = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.M = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.N = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.O = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.P = constraintAnchor5;
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.S = constraintAnchor6;
        this.T = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.U = arrayList;
        this.V = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.W = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.X = null;
        this.Y = 0;
        this.Z = 0;
        this.f1223a0 = 0.0f;
        this.f1225b0 = -1;
        this.f1227c0 = 0;
        this.f1228d0 = 0;
        this.f1230e0 = 0;
        this.f1232f0 = 0;
        this.f1234g0 = 0;
        this.f1236h0 = 0;
        this.f1238i0 = 0;
        this.f1244l0 = 0.5f;
        this.f1246m0 = 0.5f;
        this.f1249o0 = 0;
        this.f1251p0 = 0;
        this.f1253q0 = null;
        this.f1255r0 = null;
        this.C0 = 0;
        this.D0 = 0;
        this.G0 = new float[]{-1.0f, -1.0f};
        this.H0 = new ConstraintWidget[]{null, null};
        this.I0 = new ConstraintWidget[]{null, null};
        this.J0 = null;
        this.K0 = null;
        this.L0 = -1;
        this.M0 = -1;
        arrayList.add(this.L);
        this.U.add(this.M);
        this.U.add(this.N);
        this.U.add(this.O);
        this.U.add(this.Q);
        this.U.add(this.R);
        this.U.add(this.S);
        this.U.add(this.P);
    }

    public int A() {
        ConstraintWidget constraintWidget = this.X;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f1227c0 : ((d) constraintWidget).U0 + this.f1227c0;
    }

    public int B() {
        ConstraintWidget constraintWidget = this.X;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f1228d0 : ((d) constraintWidget).V0 + this.f1228d0;
    }

    public boolean C(int i10) {
        if (i10 == 0) {
            return (this.L.f1211f != null ? 1 : 0) + (this.N.f1211f != null ? 1 : 0) < 2;
        }
        return ((this.M.f1211f != null ? 1 : 0) + (this.O.f1211f != null ? 1 : 0)) + (this.P.f1211f != null ? 1 : 0) < 2;
    }

    public boolean D(int i10, int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.L.f1211f;
            if (constraintAnchor3 != null && constraintAnchor3.f1209c && (constraintAnchor2 = this.N.f1211f) != null && constraintAnchor2.f1209c) {
                return (constraintAnchor2.d() - this.N.e()) - (this.L.e() + this.L.f1211f.d()) >= i11;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.M.f1211f;
            if (constraintAnchor4 != null && constraintAnchor4.f1209c && (constraintAnchor = this.O.f1211f) != null && constraintAnchor.f1209c) {
                return (constraintAnchor.d() - this.O.e()) - (this.M.e() + this.M.f1211f.d()) >= i11;
            }
        }
        return false;
    }

    public final boolean E(int i10) {
        int i11 = i10 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.T;
        if (constraintAnchorArr[i11].f1211f != null && constraintAnchorArr[i11].f1211f.f1211f != constraintAnchorArr[i11]) {
            int i12 = i11 + 1;
            if (constraintAnchorArr[i12].f1211f != null && constraintAnchorArr[i12].f1211f.f1211f == constraintAnchorArr[i12]) {
                return true;
            }
        }
        return false;
    }

    public boolean F() {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.L;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1211f;
        if ((constraintAnchor4 == null || constraintAnchor4.f1211f != constraintAnchor3) && ((constraintAnchor2 = (constraintAnchor = this.N).f1211f) == null || constraintAnchor2.f1211f != constraintAnchor)) {
            return false;
        }
        return true;
    }

    public boolean G() {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1211f;
        if ((constraintAnchor4 == null || constraintAnchor4.f1211f != constraintAnchor3) && ((constraintAnchor2 = (constraintAnchor = this.O).f1211f) == null || constraintAnchor2.f1211f != constraintAnchor)) {
            return false;
        }
        return true;
    }

    public boolean H() {
        return this.f1233g && this.f1251p0 != 8;
    }

    public boolean I() {
        if (!this.f1241k && (!this.L.f1209c || !this.N.f1209c)) {
            return false;
        }
        return true;
    }

    public boolean J() {
        return this.f1243l || (this.M.f1209c && this.O.f1209c);
    }

    public void K() {
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.P.k();
        this.Q.k();
        this.R.k();
        this.S.k();
        this.X = null;
        this.F = 0.0f;
        this.Y = 0;
        this.Z = 0;
        this.f1223a0 = 0.0f;
        this.f1225b0 = -1;
        this.f1227c0 = 0;
        this.f1228d0 = 0;
        this.f1234g0 = 0;
        this.f1236h0 = 0;
        this.f1238i0 = 0;
        this.f1240j0 = 0;
        this.f1242k0 = 0;
        this.f1244l0 = 0.5f;
        this.f1246m0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.W;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f1247n0 = null;
        this.f1249o0 = 0;
        this.f1251p0 = 0;
        this.f1255r0 = null;
        this.A0 = false;
        this.B0 = false;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = false;
        this.F0 = false;
        float[] fArr = this.G0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1248o = -1;
        this.f1250p = -1;
        int[] iArr = this.E;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1254r = 0;
        this.f1256s = 0;
        this.f1264w = 1.0f;
        this.f1268z = 1.0f;
        this.f1262v = IntCompanionObject.MAX_VALUE;
        this.y = IntCompanionObject.MAX_VALUE;
        this.f1260u = 0;
        this.f1265x = 0;
        this.C = -1;
        this.D = 1.0f;
        boolean[] zArr = this.f1231f;
        zArr[0] = true;
        zArr[1] = true;
        this.I = false;
        boolean[] zArr2 = this.V;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f1233g = true;
        int[] iArr2 = this.f1258t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f1235h = -1;
        this.f1237i = -1;
    }

    public void L() {
        ConstraintWidget constraintWidget = this.X;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            Objects.requireNonNull((d) constraintWidget);
        }
        int size = this.U.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.U.get(i10).k();
        }
    }

    public void M() {
        this.f1241k = false;
        this.f1243l = false;
        this.f1245m = false;
        this.n = false;
        int size = this.U.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintAnchor constraintAnchor = this.U.get(i10);
            constraintAnchor.f1209c = false;
            constraintAnchor.f1208b = 0;
        }
    }

    public void N(q.a aVar) {
        this.L.l();
        this.M.l();
        this.N.l();
        this.O.l();
        this.P.l();
        this.S.l();
        this.Q.l();
        this.R.l();
    }

    public final void O(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public final void P(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public void Q(int i10) {
        this.f1238i0 = i10;
        this.G = i10 > 0;
    }

    public void R(int i10, int i11) {
        if (this.f1241k) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.L;
        constraintAnchor.f1208b = i10;
        constraintAnchor.f1209c = true;
        ConstraintAnchor constraintAnchor2 = this.N;
        constraintAnchor2.f1208b = i11;
        constraintAnchor2.f1209c = true;
        this.f1227c0 = i10;
        this.Y = i11 - i10;
        this.f1241k = true;
    }

    public void S(int i10, int i11) {
        if (this.f1243l) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.M;
        constraintAnchor.f1208b = i10;
        constraintAnchor.f1209c = true;
        ConstraintAnchor constraintAnchor2 = this.O;
        constraintAnchor2.f1208b = i11;
        constraintAnchor2.f1209c = true;
        this.f1228d0 = i10;
        this.Z = i11 - i10;
        if (this.G) {
            this.P.m(i10 + this.f1238i0);
        }
        this.f1243l = true;
    }

    public void T(int i10) {
        this.Z = i10;
        int i11 = this.f1242k0;
        if (i10 < i11) {
            this.Z = i11;
        }
    }

    public void U(DimensionBehaviour dimensionBehaviour) {
        this.W[0] = dimensionBehaviour;
    }

    public void V(int i10) {
        if (i10 < 0) {
            this.f1242k0 = 0;
        } else {
            this.f1242k0 = i10;
        }
    }

    public void W(int i10) {
        if (i10 < 0) {
            this.f1240j0 = 0;
        } else {
            this.f1240j0 = i10;
        }
    }

    public void X(DimensionBehaviour dimensionBehaviour) {
        this.W[1] = dimensionBehaviour;
    }

    public void Y(int i10) {
        this.Y = i10;
        int i11 = this.f1240j0;
        if (i10 < i11) {
            this.Y = i11;
        }
    }

    public void Z(boolean z10, boolean z11) {
        int i10;
        int i11;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        androidx.constraintlayout.core.widgets.analyzer.c cVar = this.d;
        boolean z12 = z10 & cVar.f1297g;
        androidx.constraintlayout.core.widgets.analyzer.d dVar = this.f1229e;
        boolean z13 = z11 & dVar.f1297g;
        int i12 = cVar.f1298h.f1279g;
        int i13 = dVar.f1298h.f1279g;
        int i14 = cVar.f1299i.f1279g;
        int i15 = dVar.f1299i.f1279g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f1227c0 = i12;
        }
        if (z13) {
            this.f1228d0 = i13;
        }
        if (this.f1251p0 == 8) {
            this.Y = 0;
            this.Z = 0;
            return;
        }
        if (z12) {
            if (this.W[0] == dimensionBehaviour && i17 < (i11 = this.Y)) {
                i17 = i11;
            }
            this.Y = i17;
            int i19 = this.f1240j0;
            if (i17 < i19) {
                this.Y = i19;
            }
        }
        if (z13) {
            if (this.W[1] == dimensionBehaviour && i18 < (i10 = this.Z)) {
                i18 = i10;
            }
            this.Z = i18;
            int i20 = this.f1242k0;
            if (i18 < i20) {
                this.Z = i20;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a0(androidx.constraintlayout.core.c r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.a0(androidx.constraintlayout.core.c, boolean):void");
    }

    public void d(d dVar, androidx.constraintlayout.core.c cVar, HashSet<ConstraintWidget> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, cVar, this);
            hashSet.remove(this);
            f(cVar, dVar.l0(64));
        }
        if (i10 == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.L.f1207a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.d(dVar, cVar, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.N.f1207a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.d(dVar, cVar, hashSet, i10, true);
                }
            }
        } else {
            HashSet<ConstraintAnchor> hashSet4 = this.M.f1207a;
            if (hashSet4 != null) {
                Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
                while (it3.hasNext()) {
                    it3.next().d.d(dVar, cVar, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet5 = this.O.f1207a;
            if (hashSet5 != null) {
                Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
                while (it4.hasNext()) {
                    it4.next().d.d(dVar, cVar, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet6 = this.P.f1207a;
            if (hashSet6 != null) {
                Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
                while (it5.hasNext()) {
                    it5.next().d.d(dVar, cVar, hashSet, i10, true);
                }
            }
        }
    }

    public boolean e() {
        return (this instanceof i) || (this instanceof f);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(androidx.constraintlayout.core.c r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.f(androidx.constraintlayout.core.c, boolean):void");
    }

    public boolean g() {
        return this.f1251p0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0520 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0547 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(androidx.constraintlayout.core.c r31, boolean r32, boolean r33, boolean r34, boolean r35, androidx.constraintlayout.core.SolverVariable r36, androidx.constraintlayout.core.SolverVariable r37, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r38, boolean r39, androidx.constraintlayout.core.widgets.ConstraintAnchor r40, androidx.constraintlayout.core.widgets.ConstraintAnchor r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.h(androidx.constraintlayout.core.c, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r12, androidx.constraintlayout.core.widgets.ConstraintWidget r13, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r14, int r15) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.i(androidx.constraintlayout.core.widgets.ConstraintAnchor$Type, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor$Type, int):void");
    }

    public void j(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        if (constraintAnchor.d == this) {
            i(constraintAnchor.f1210e, constraintAnchor2.d, constraintAnchor2.f1210e, i10);
        }
    }

    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.f1248o = constraintWidget.f1248o;
        this.f1250p = constraintWidget.f1250p;
        this.f1254r = constraintWidget.f1254r;
        this.f1256s = constraintWidget.f1256s;
        int[] iArr = this.f1258t;
        int[] iArr2 = constraintWidget.f1258t;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f1260u = constraintWidget.f1260u;
        this.f1262v = constraintWidget.f1262v;
        this.f1265x = constraintWidget.f1265x;
        this.y = constraintWidget.y;
        this.f1268z = constraintWidget.f1268z;
        this.A = constraintWidget.A;
        this.B = constraintWidget.B;
        this.C = constraintWidget.C;
        this.D = constraintWidget.D;
        int[] iArr3 = constraintWidget.E;
        this.E = Arrays.copyOf(iArr3, iArr3.length);
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.H = constraintWidget.H;
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.P.k();
        this.Q.k();
        this.R.k();
        this.S.k();
        this.W = (DimensionBehaviour[]) Arrays.copyOf(this.W, 2);
        ConstraintWidget constraintWidget2 = null;
        this.X = this.X == null ? null : hashMap.get(constraintWidget.X);
        this.Y = constraintWidget.Y;
        this.Z = constraintWidget.Z;
        this.f1223a0 = constraintWidget.f1223a0;
        this.f1225b0 = constraintWidget.f1225b0;
        this.f1227c0 = constraintWidget.f1227c0;
        this.f1228d0 = constraintWidget.f1228d0;
        this.f1230e0 = constraintWidget.f1230e0;
        this.f1232f0 = constraintWidget.f1232f0;
        this.f1234g0 = constraintWidget.f1234g0;
        this.f1236h0 = constraintWidget.f1236h0;
        this.f1238i0 = constraintWidget.f1238i0;
        this.f1240j0 = constraintWidget.f1240j0;
        this.f1242k0 = constraintWidget.f1242k0;
        this.f1244l0 = constraintWidget.f1244l0;
        this.f1246m0 = constraintWidget.f1246m0;
        this.f1247n0 = constraintWidget.f1247n0;
        this.f1249o0 = constraintWidget.f1249o0;
        this.f1251p0 = constraintWidget.f1251p0;
        this.f1253q0 = constraintWidget.f1253q0;
        this.f1255r0 = constraintWidget.f1255r0;
        this.f1257s0 = constraintWidget.f1257s0;
        this.f1259t0 = constraintWidget.f1259t0;
        this.f1261u0 = constraintWidget.f1261u0;
        this.f1263v0 = constraintWidget.f1263v0;
        this.w0 = constraintWidget.w0;
        this.f1266x0 = constraintWidget.f1266x0;
        this.f1267y0 = constraintWidget.f1267y0;
        this.f1269z0 = constraintWidget.f1269z0;
        this.A0 = constraintWidget.A0;
        this.B0 = constraintWidget.B0;
        this.C0 = constraintWidget.C0;
        this.D0 = constraintWidget.D0;
        this.E0 = constraintWidget.E0;
        this.F0 = constraintWidget.F0;
        float[] fArr = this.G0;
        float[] fArr2 = constraintWidget.G0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.H0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.H0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.I0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.I0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.J0;
        this.J0 = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.K0;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.K0 = constraintWidget2;
    }

    public void l(androidx.constraintlayout.core.c cVar) {
        cVar.l(this.L);
        cVar.l(this.M);
        cVar.l(this.N);
        cVar.l(this.O);
        if (this.f1238i0 > 0) {
            cVar.l(this.P);
        }
    }

    public void m() {
        if (this.d == null) {
            this.d = new androidx.constraintlayout.core.widgets.analyzer.c(this);
        }
        if (this.f1229e == null) {
            this.f1229e = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        }
    }

    public ConstraintAnchor n(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.L;
            case 2:
                return this.M;
            case 3:
                return this.N;
            case 4:
                return this.O;
            case 5:
                return this.P;
            case 6:
                return this.S;
            case 7:
                return this.Q;
            case 8:
                return this.R;
            default:
                throw new AssertionError(type.name());
        }
    }

    public int o() {
        return B() + this.Z;
    }

    public DimensionBehaviour p(int i10) {
        if (i10 == 0) {
            return r();
        }
        if (i10 == 1) {
            return y();
        }
        return null;
    }

    public int q() {
        if (this.f1251p0 == 8) {
            return 0;
        }
        return this.Z;
    }

    public DimensionBehaviour r() {
        return this.W[0];
    }

    public ConstraintWidget s(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.N;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1211f;
            if (constraintAnchor4 != null && constraintAnchor4.f1211f == constraintAnchor3) {
                return constraintAnchor4.d;
            }
        } else if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.O).f1211f) != null && constraintAnchor2.f1211f == constraintAnchor) {
            return constraintAnchor2.d;
        }
        return null;
    }

    public ConstraintWidget t(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.L;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1211f;
            if (constraintAnchor4 != null && constraintAnchor4.f1211f == constraintAnchor3) {
                return constraintAnchor4.d;
            }
        } else if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.M).f1211f) != null && constraintAnchor2.f1211f == constraintAnchor) {
            return constraintAnchor2.d;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f1255r0;
        String str2 = BuildConfig.FLAVOR;
        sb2.append(str != null ? android.support.v4.media.b.m(a1.a.m("type: "), this.f1255r0, " ") : BuildConfig.FLAVOR);
        if (this.f1253q0 != null) {
            str2 = android.support.v4.media.b.m(a1.a.m("id: "), this.f1253q0, " ");
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f1227c0);
        sb2.append(", ");
        sb2.append(this.f1228d0);
        sb2.append(") - (");
        sb2.append(this.Y);
        sb2.append(" x ");
        return android.support.v4.media.a.j(sb2, this.Z, ")");
    }

    public int u() {
        return A() + this.Y;
    }

    public void v(StringBuilder sb2) {
        StringBuilder m10 = a1.a.m("  ");
        m10.append(this.f1239j);
        m10.append(":{\n");
        sb2.append(m10.toString());
        sb2.append("    actualWidth:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.Z);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f1227c0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f1228d0);
        sb2.append("\n");
        x(sb2, "left", this.L);
        x(sb2, "top", this.M);
        x(sb2, "right", this.N);
        x(sb2, "bottom", this.O);
        x(sb2, "baseline", this.P);
        x(sb2, "centerX", this.Q);
        x(sb2, "centerY", this.R);
        int i10 = this.Y;
        int i11 = this.f1240j0;
        int i12 = this.E[0];
        int i13 = this.f1260u;
        int i14 = this.f1254r;
        float f10 = this.f1264w;
        float f11 = this.G0[0];
        w(sb2, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.Z;
        int i16 = this.f1242k0;
        int i17 = this.E[1];
        int i18 = this.f1265x;
        int i19 = this.f1256s;
        float f12 = this.f1268z;
        float f13 = this.G0[1];
        w(sb2, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.f1223a0;
        int i20 = this.f1225b0;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i20);
            sb2.append(BuildConfig.FLAVOR);
            sb2.append("],\n");
        }
        O(sb2, "    horizontalBias", this.f1244l0, 0.5f);
        O(sb2, "    verticalBias", this.f1246m0, 0.5f);
        P(sb2, "    horizontalChainStyle", this.C0, 0);
        P(sb2, "    verticalChainStyle", this.D0, 0);
        sb2.append("  }");
    }

    public final void w(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb2.append(str);
        sb2.append(" :  {\n");
        P(sb2, "      size", i10, 0);
        P(sb2, "      min", i11, 0);
        P(sb2, "      max", i12, IntCompanionObject.MAX_VALUE);
        P(sb2, "      matchMin", i13, 0);
        P(sb2, "      matchDef", i14, 0);
        O(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public final void x(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f1211f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.f1211f);
        sb2.append("'");
        if (constraintAnchor.f1213h == Integer.MIN_VALUE) {
            if (constraintAnchor.f1212g != 0) {
            }
            sb2.append(" ] ,\n");
        }
        sb2.append(",");
        sb2.append(constraintAnchor.f1212g);
        if (constraintAnchor.f1213h != Integer.MIN_VALUE) {
            sb2.append(",");
            sb2.append(constraintAnchor.f1213h);
            sb2.append(",");
        }
        sb2.append(" ] ,\n");
    }

    public DimensionBehaviour y() {
        return this.W[1];
    }

    public int z() {
        if (this.f1251p0 == 8) {
            return 0;
        }
        return this.Y;
    }
}
