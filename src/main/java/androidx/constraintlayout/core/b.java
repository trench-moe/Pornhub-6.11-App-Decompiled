package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements c.a {
    public a d;

    /* renamed from: a  reason: collision with root package name */
    public SolverVariable f1181a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f1182b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<SolverVariable> f1183c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f1184e = false;

    /* loaded from: classes.dex */
    public interface a {
        int a();

        boolean b(SolverVariable solverVariable);

        float c(b bVar, boolean z10);

        void clear();

        void d(SolverVariable solverVariable, float f10);

        SolverVariable e(int i10);

        void f(SolverVariable solverVariable, float f10, boolean z10);

        void g();

        float h(int i10);

        float i(SolverVariable solverVariable, boolean z10);

        float j(SolverVariable solverVariable);

        void k(float f10);
    }

    public b() {
    }

    public b(q.a aVar) {
        this.d = new androidx.constraintlayout.core.a(this, aVar);
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable a(c cVar, boolean[] zArr) {
        return i(zArr, null);
    }

    @Override // androidx.constraintlayout.core.c.a
    public void b(SolverVariable solverVariable) {
        float f10;
        int i10 = solverVariable.f1163m;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
            this.d.d(solverVariable, f10);
        }
        f10 = 1.0f;
        this.d.d(solverVariable, f10);
    }

    public b c(c cVar, int i10) {
        this.d.d(cVar.k(i10, "ep"), 1.0f);
        this.d.d(cVar.k(i10, "em"), -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.core.c.a
    public void clear() {
        this.d.clear();
        this.f1181a = null;
        this.f1182b = 0.0f;
    }

    public b d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.d.d(solverVariable, -1.0f);
        this.d.d(solverVariable2, 1.0f);
        this.d.d(solverVariable3, f10);
        this.d.d(solverVariable4, -f10);
        return this;
    }

    public b e(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f1182b = i10;
        }
        if (z10) {
            this.d.d(solverVariable, 1.0f);
            this.d.d(solverVariable2, -1.0f);
            this.d.d(solverVariable3, -1.0f);
        } else {
            this.d.d(solverVariable, -1.0f);
            this.d.d(solverVariable2, 1.0f);
            this.d.d(solverVariable3, 1.0f);
        }
        return this;
    }

    public b f(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f1182b = i10;
        }
        if (z10) {
            this.d.d(solverVariable, 1.0f);
            this.d.d(solverVariable2, -1.0f);
            this.d.d(solverVariable3, 1.0f);
        } else {
            this.d.d(solverVariable, -1.0f);
            this.d.d(solverVariable2, 1.0f);
            this.d.d(solverVariable3, -1.0f);
        }
        return this;
    }

    public b g(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10) {
        this.d.d(solverVariable3, 0.5f);
        this.d.d(solverVariable4, 0.5f);
        this.d.d(solverVariable, -0.5f);
        this.d.d(solverVariable2, -0.5f);
        this.f1182b = -f10;
        return this;
    }

    public final boolean h(SolverVariable solverVariable) {
        return solverVariable.B <= 1;
    }

    public final SolverVariable i(boolean[] zArr, SolverVariable solverVariable) {
        int a10 = this.d.a();
        SolverVariable solverVariable2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < a10; i10++) {
            float h10 = this.d.h(i10);
            if (h10 < 0.0f) {
                SolverVariable e10 = this.d.e(i10);
                if (zArr != null) {
                    if (zArr[e10.f1161f]) {
                    }
                }
                if (e10 != solverVariable) {
                    SolverVariable.Type type = e10.y;
                    if (type != SolverVariable.Type.SLACK && type != SolverVariable.Type.ERROR) {
                    }
                    if (h10 < f10) {
                        f10 = h10;
                        solverVariable2 = e10;
                    }
                }
            }
        }
        return solverVariable2;
    }

    @Override // androidx.constraintlayout.core.c.a
    public boolean isEmpty() {
        return this.f1181a == null && this.f1182b == 0.0f && this.d.a() == 0;
    }

    public void j(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f1181a;
        if (solverVariable2 != null) {
            this.d.d(solverVariable2, -1.0f);
            this.f1181a.f1162j = -1;
            this.f1181a = null;
        }
        float i10 = this.d.i(solverVariable, true) * (-1.0f);
        this.f1181a = solverVariable;
        if (i10 == 1.0f) {
            return;
        }
        this.f1182b /= i10;
        this.d.k(i10);
    }

    public void k(c cVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable.f1164t) {
            float j10 = this.d.j(solverVariable);
            this.f1182b = (solverVariable.n * j10) + this.f1182b;
            this.d.i(solverVariable, z10);
            if (z10) {
                solverVariable.c(this);
            }
            if (this.d.a() == 0) {
                this.f1184e = true;
                cVar.f1188a = true;
            }
        }
    }

    public void l(c cVar, b bVar, boolean z10) {
        float c10 = this.d.c(bVar, z10);
        this.f1182b = (bVar.f1182b * c10) + this.f1182b;
        if (z10) {
            bVar.f1181a.c(this);
        }
        if (this.f1181a == null || this.d.a() != 0) {
            return;
        }
        this.f1184e = true;
        cVar.f1188a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.toString():java.lang.String");
    }
}
