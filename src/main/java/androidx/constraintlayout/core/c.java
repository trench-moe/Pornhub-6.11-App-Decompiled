package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class c {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f1185p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f1186q = 1000;

    /* renamed from: r  reason: collision with root package name */
    public static long f1187r;

    /* renamed from: c  reason: collision with root package name */
    public a f1190c;

    /* renamed from: f  reason: collision with root package name */
    public b[] f1192f;

    /* renamed from: l  reason: collision with root package name */
    public final q.a f1198l;

    /* renamed from: o  reason: collision with root package name */
    public a f1200o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1188a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f1189b = 0;
    public int d = 32;

    /* renamed from: e  reason: collision with root package name */
    public int f1191e = 32;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1193g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f1194h = new boolean[32];

    /* renamed from: i  reason: collision with root package name */
    public int f1195i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f1196j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1197k = 32;

    /* renamed from: m  reason: collision with root package name */
    public SolverVariable[] f1199m = new SolverVariable[f1186q];
    public int n = 0;

    /* loaded from: classes.dex */
    public interface a {
        SolverVariable a(c cVar, boolean[] zArr);

        void b(SolverVariable solverVariable);

        void clear();

        boolean isEmpty();
    }

    public c() {
        this.f1192f = null;
        this.f1192f = new b[32];
        t();
        q.a aVar = new q.a();
        this.f1198l = aVar;
        this.f1190c = new d(aVar);
        this.f1200o = new b(aVar);
    }

    public final SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.f1198l.f14135b.a();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.y = type;
        } else {
            solverVariable.d();
            solverVariable.y = type;
        }
        int i10 = this.n;
        int i11 = f1186q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f1186q = i12;
            this.f1199m = (SolverVariable[]) Arrays.copyOf(this.f1199m, i12);
        }
        SolverVariable[] solverVariableArr = this.f1199m;
        int i13 = this.n;
        this.n = i13 + 1;
        solverVariableArr[i13] = solverVariable;
        return solverVariable;
    }

    public void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11, int i12) {
        b m10 = m();
        if (solverVariable2 == solverVariable3) {
            m10.d.d(solverVariable, 1.0f);
            m10.d.d(solverVariable4, 1.0f);
            m10.d.d(solverVariable2, -2.0f);
        } else if (f10 == 0.5f) {
            m10.d.d(solverVariable, 1.0f);
            m10.d.d(solverVariable2, -1.0f);
            m10.d.d(solverVariable3, -1.0f);
            m10.d.d(solverVariable4, 1.0f);
            if (i10 <= 0) {
                if (i11 > 0) {
                }
            }
            m10.f1182b = (-i10) + i11;
        } else if (f10 <= 0.0f) {
            m10.d.d(solverVariable, -1.0f);
            m10.d.d(solverVariable2, 1.0f);
            m10.f1182b = i10;
        } else if (f10 >= 1.0f) {
            m10.d.d(solverVariable4, -1.0f);
            m10.d.d(solverVariable3, 1.0f);
            m10.f1182b = -i11;
        } else {
            float f11 = 1.0f - f10;
            m10.d.d(solverVariable, f11 * 1.0f);
            m10.d.d(solverVariable2, f11 * (-1.0f));
            m10.d.d(solverVariable3, (-1.0f) * f10);
            m10.d.d(solverVariable4, 1.0f * f10);
            if (i10 <= 0) {
                if (i11 > 0) {
                }
            }
            m10.f1182b = (i11 * f10) + ((-i10) * f11);
        }
        if (i12 != 8) {
            m10.c(this, i12);
        }
        c(m10);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(androidx.constraintlayout.core.b r17) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.c.c(androidx.constraintlayout.core.b):void");
    }

    public b d(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        if (i11 == 8 && solverVariable2.f1164t && solverVariable.f1162j == -1) {
            solverVariable.e(this, solverVariable2.n + i10);
            return null;
        }
        b m10 = m();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            m10.f1182b = i10;
        }
        if (z10) {
            m10.d.d(solverVariable, 1.0f);
            m10.d.d(solverVariable2, -1.0f);
        } else {
            m10.d.d(solverVariable, -1.0f);
            m10.d.d(solverVariable2, 1.0f);
        }
        if (i11 != 8) {
            m10.c(this, i11);
        }
        c(m10);
        return m10;
    }

    public void e(SolverVariable solverVariable, int i10) {
        int i11 = solverVariable.f1162j;
        if (i11 == -1) {
            solverVariable.e(this, i10);
            for (int i12 = 0; i12 < this.f1189b + 1; i12++) {
                SolverVariable solverVariable2 = this.f1198l.f14136c[i12];
            }
        } else if (i11 == -1) {
            b m10 = m();
            m10.f1181a = solverVariable;
            float f10 = i10;
            solverVariable.n = f10;
            m10.f1182b = f10;
            m10.f1184e = true;
            c(m10);
        } else {
            b bVar = this.f1192f[i11];
            if (bVar.f1184e) {
                bVar.f1182b = i10;
            } else if (bVar.d.a() == 0) {
                bVar.f1184e = true;
                bVar.f1182b = i10;
            } else {
                b m11 = m();
                if (i10 < 0) {
                    m11.f1182b = i10 * (-1);
                    m11.d.d(solverVariable, 1.0f);
                } else {
                    m11.f1182b = i10;
                    m11.d.d(solverVariable, -1.0f);
                }
                c(m11);
            }
        }
    }

    public void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        b m10 = m();
        SolverVariable n = n();
        n.f1163m = 0;
        m10.e(solverVariable, solverVariable2, n, i10);
        if (i11 != 8) {
            m10.d.d(k(i11, null), (int) (m10.d.j(n) * (-1.0f)));
        }
        c(m10);
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        b m10 = m();
        SolverVariable n = n();
        n.f1163m = 0;
        m10.f(solverVariable, solverVariable2, n, i10);
        if (i11 != 8) {
            m10.d.d(k(i11, null), (int) (m10.d.j(n) * (-1.0f)));
        }
        c(m10);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10, int i10) {
        b m10 = m();
        m10.d(solverVariable, solverVariable2, solverVariable3, solverVariable4, f10);
        if (i10 != 8) {
            m10.c(this, i10);
        }
        c(m10);
    }

    public final void i(b bVar) {
        int i10;
        if (bVar.f1184e) {
            bVar.f1181a.e(this, bVar.f1182b);
        } else {
            b[] bVarArr = this.f1192f;
            int i11 = this.f1196j;
            bVarArr[i11] = bVar;
            SolverVariable solverVariable = bVar.f1181a;
            solverVariable.f1162j = i11;
            this.f1196j = i11 + 1;
            solverVariable.f(this, bVar);
        }
        if (this.f1188a) {
            int i12 = 0;
            while (i12 < this.f1196j) {
                if (this.f1192f[i12] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f1192f;
                if (bVarArr2[i12] != null && bVarArr2[i12].f1184e) {
                    b bVar2 = bVarArr2[i12];
                    bVar2.f1181a.e(this, bVar2.f1182b);
                    this.f1198l.f14134a.b(bVar2);
                    this.f1192f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f1196j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr3 = this.f1192f;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f1181a.f1162j == i13) {
                            bVarArr3[i15].f1181a.f1162j = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f1192f[i14] = null;
                    }
                    this.f1196j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f1188a = false;
        }
    }

    public final void j() {
        for (int i10 = 0; i10 < this.f1196j; i10++) {
            b bVar = this.f1192f[i10];
            bVar.f1181a.n = bVar.f1182b;
        }
    }

    public SolverVariable k(int i10, String str) {
        if (this.f1195i + 1 >= this.f1191e) {
            p();
        }
        SolverVariable a10 = a(SolverVariable.Type.ERROR, str);
        int i11 = this.f1189b + 1;
        this.f1189b = i11;
        this.f1195i++;
        a10.f1161f = i11;
        a10.f1163m = i10;
        this.f1198l.f14136c[i11] = a10;
        this.f1190c.b(a10);
        return a10;
    }

    public SolverVariable l(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f1195i + 1 >= this.f1191e) {
            p();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f1214i;
            if (solverVariable == null) {
                constraintAnchor.l();
                solverVariable = constraintAnchor.f1214i;
            }
            int i10 = solverVariable.f1161f;
            if (i10 == -1 || i10 > this.f1189b || this.f1198l.f14136c[i10] == null) {
                if (i10 != -1) {
                    solverVariable.d();
                }
                int i11 = this.f1189b + 1;
                this.f1189b = i11;
                this.f1195i++;
                solverVariable.f1161f = i11;
                solverVariable.y = SolverVariable.Type.UNRESTRICTED;
                this.f1198l.f14136c[i11] = solverVariable;
            }
        }
        return solverVariable;
    }

    public b m() {
        b bVar = (b) this.f1198l.f14134a.a();
        if (bVar == null) {
            bVar = new b(this.f1198l);
            f1187r++;
        } else {
            bVar.f1181a = null;
            bVar.d.clear();
            bVar.f1182b = 0.0f;
            bVar.f1184e = false;
        }
        SolverVariable.C++;
        return bVar;
    }

    public SolverVariable n() {
        if (this.f1195i + 1 >= this.f1191e) {
            p();
        }
        SolverVariable a10 = a(SolverVariable.Type.SLACK, null);
        int i10 = this.f1189b + 1;
        this.f1189b = i10;
        this.f1195i++;
        a10.f1161f = i10;
        this.f1198l.f14136c[i10] = a10;
        return a10;
    }

    public int o(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).f1214i;
        if (solverVariable != null) {
            return (int) (solverVariable.n + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i10 = this.d * 2;
        this.d = i10;
        this.f1192f = (b[]) Arrays.copyOf(this.f1192f, i10);
        q.a aVar = this.f1198l;
        aVar.f14136c = (SolverVariable[]) Arrays.copyOf(aVar.f14136c, this.d);
        int i11 = this.d;
        this.f1194h = new boolean[i11];
        this.f1191e = i11;
        this.f1197k = i11;
    }

    public void q() {
        if (this.f1190c.isEmpty()) {
            j();
        } else if (!this.f1193g) {
            r(this.f1190c);
        } else {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f1196j) {
                    z10 = true;
                    break;
                } else if (!this.f1192f[i10].f1184e) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                j();
            } else {
                r(this.f1190c);
            }
        }
    }

    public void r(a aVar) {
        float f10;
        int i10;
        boolean z10;
        SolverVariable.Type type = SolverVariable.Type.UNRESTRICTED;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 >= this.f1196j) {
                z10 = false;
                break;
            }
            b[] bVarArr = this.f1192f;
            if (bVarArr[i11].f1181a.y != type && bVarArr[i11].f1182b < 0.0f) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            boolean z11 = false;
            int i12 = 0;
            while (!z11) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                while (i13 < this.f1196j) {
                    b bVar = this.f1192f[i13];
                    if (bVar.f1181a.y != type && !bVar.f1184e && bVar.f1182b < f10) {
                        int a10 = bVar.d.a();
                        int i17 = 0;
                        while (i17 < a10) {
                            SolverVariable e10 = bVar.d.e(i17);
                            float j10 = bVar.d.j(e10);
                            if (j10 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f12 = e10.f1165u[i18] / j10;
                                    if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                        i15 = e10.f1161f;
                                        i16 = i18;
                                        f11 = f12;
                                        i14 = i13;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i13++;
                    f10 = 0.0f;
                }
                if (i14 != -1) {
                    b bVar2 = this.f1192f[i14];
                    bVar2.f1181a.f1162j = -1;
                    bVar2.j(this.f1198l.f14136c[i15]);
                    SolverVariable solverVariable = bVar2.f1181a;
                    solverVariable.f1162j = i14;
                    solverVariable.f(this, bVar2);
                } else {
                    z11 = true;
                }
                if (i12 > this.f1195i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        for (int i10 = 0; i10 < this.f1195i; i10++) {
            this.f1194h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f1195i * 2) {
                return i11;
            }
            SolverVariable solverVariable = ((b) aVar).f1181a;
            if (solverVariable != null) {
                this.f1194h[solverVariable.f1161f] = true;
            }
            SolverVariable a10 = aVar.a(this, this.f1194h);
            if (a10 != null) {
                boolean[] zArr = this.f1194h;
                int i12 = a10.f1161f;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (a10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f1196j; i14++) {
                    b bVar = this.f1192f[i14];
                    if (bVar.f1181a.y != SolverVariable.Type.UNRESTRICTED && !bVar.f1184e && bVar.d.b(a10)) {
                        float j10 = bVar.d.j(a10);
                        if (j10 < 0.0f) {
                            float f11 = (-bVar.f1182b) / j10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar2 = this.f1192f[i13];
                    bVar2.f1181a.f1162j = -1;
                    bVar2.j(a10);
                    SolverVariable solverVariable2 = bVar2.f1181a;
                    solverVariable2.f1162j = i13;
                    solverVariable2.f(this, bVar2);
                }
            } else {
                z10 = true;
            }
        }
        return i11;
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f1196j; i10++) {
            b bVar = this.f1192f[i10];
            if (bVar != null) {
                this.f1198l.f14134a.b(bVar);
            }
            this.f1192f[i10] = null;
        }
    }

    public void u() {
        q.a aVar;
        int i10 = 0;
        while (true) {
            aVar = this.f1198l;
            SolverVariable[] solverVariableArr = aVar.f14136c;
            if (i10 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i10];
            if (solverVariable != null) {
                solverVariable.d();
            }
            i10++;
        }
        q.b bVar = aVar.f14135b;
        SolverVariable[] solverVariableArr2 = this.f1199m;
        int i11 = this.n;
        Objects.requireNonNull(bVar);
        if (i11 > solverVariableArr2.length) {
            i11 = solverVariableArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable solverVariable2 = solverVariableArr2[i12];
            int i13 = bVar.f14138b;
            Object[] objArr = bVar.f14137a;
            if (i13 < objArr.length) {
                objArr[i13] = solverVariable2;
                bVar.f14138b = i13 + 1;
            }
        }
        this.n = 0;
        Arrays.fill(this.f1198l.f14136c, (Object) null);
        this.f1189b = 0;
        this.f1190c.clear();
        this.f1195i = 1;
        for (int i14 = 0; i14 < this.f1196j; i14++) {
            b[] bVarArr = this.f1192f;
            if (bVarArr[i14] != null) {
                Objects.requireNonNull(bVarArr[i14]);
            }
        }
        t();
        this.f1196j = 0;
        this.f1200o = new b(this.f1198l);
    }
}
