package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f1173b;

    /* renamed from: c  reason: collision with root package name */
    public final q.a f1174c;

    /* renamed from: a  reason: collision with root package name */
    public int f1172a = 0;
    public int d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f1175e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f1176f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f1177g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f1178h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f1179i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1180j = false;

    public a(b bVar, q.a aVar) {
        this.f1173b = bVar;
        this.f1174c = aVar;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int a() {
        return this.f1172a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean b(SolverVariable solverVariable) {
        int i10 = this.f1178h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f1172a; i11++) {
            if (this.f1175e[i10] == solverVariable.f1161f) {
                return true;
            }
            i10 = this.f1176f[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float c(b bVar, boolean z10) {
        float j10 = j(bVar.f1181a);
        i(bVar.f1181a, z10);
        b.a aVar = bVar.d;
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            SolverVariable e10 = aVar.e(i10);
            f(e10, aVar.j(e10) * j10, z10);
        }
        return j10;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i10 = this.f1178h;
        for (int i11 = 0; i10 != -1 && i11 < this.f1172a; i11++) {
            SolverVariable solverVariable = this.f1174c.f14136c[this.f1175e[i10]];
            if (solverVariable != null) {
                solverVariable.c(this.f1173b);
            }
            i10 = this.f1176f[i10];
        }
        this.f1178h = -1;
        this.f1179i = -1;
        this.f1180j = false;
        this.f1172a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void d(SolverVariable solverVariable, float f10) {
        if (f10 == 0.0f) {
            i(solverVariable, true);
            return;
        }
        int i10 = this.f1178h;
        if (i10 == -1) {
            this.f1178h = 0;
            this.f1177g[0] = f10;
            this.f1175e[0] = solverVariable.f1161f;
            this.f1176f[0] = -1;
            solverVariable.B++;
            solverVariable.b(this.f1173b);
            this.f1172a++;
            if (!this.f1180j) {
                int i11 = this.f1179i + 1;
                this.f1179i = i11;
                int[] iArr = this.f1175e;
                if (i11 >= iArr.length) {
                    this.f1180j = true;
                    this.f1179i = iArr.length - 1;
                }
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f1172a; i13++) {
            int[] iArr2 = this.f1175e;
            int i14 = iArr2[i10];
            int i15 = solverVariable.f1161f;
            if (i14 == i15) {
                this.f1177g[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i12 = i10;
            }
            i10 = this.f1176f[i10];
        }
        int i16 = this.f1179i;
        int i17 = i16 + 1;
        if (this.f1180j) {
            int[] iArr3 = this.f1175e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f1175e;
        if (i16 >= iArr4.length && this.f1172a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f1175e;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f1175e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.d * 2;
            this.d = i19;
            this.f1180j = false;
            this.f1179i = i16 - 1;
            this.f1177g = Arrays.copyOf(this.f1177g, i19);
            this.f1175e = Arrays.copyOf(this.f1175e, this.d);
            this.f1176f = Arrays.copyOf(this.f1176f, this.d);
        }
        this.f1175e[i16] = solverVariable.f1161f;
        this.f1177g[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f1176f;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f1176f[i16] = this.f1178h;
            this.f1178h = i16;
        }
        solverVariable.B++;
        solverVariable.b(this.f1173b);
        int i20 = this.f1172a + 1;
        this.f1172a = i20;
        if (!this.f1180j) {
            this.f1179i++;
        }
        int[] iArr8 = this.f1175e;
        if (i20 >= iArr8.length) {
            this.f1180j = true;
        }
        if (this.f1179i >= iArr8.length) {
            this.f1180j = true;
            this.f1179i = iArr8.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable e(int i10) {
        int i11 = this.f1178h;
        for (int i12 = 0; i11 != -1 && i12 < this.f1172a; i12++) {
            if (i12 == i10) {
                return this.f1174c.f14136c[this.f1175e[i11]];
            }
            i11 = this.f1176f[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void f(SolverVariable solverVariable, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f1178h;
            if (i10 == -1) {
                this.f1178h = 0;
                this.f1177g[0] = f10;
                this.f1175e[0] = solverVariable.f1161f;
                this.f1176f[0] = -1;
                solverVariable.B++;
                solverVariable.b(this.f1173b);
                this.f1172a++;
                if (this.f1180j) {
                    return;
                }
                int i11 = this.f1179i + 1;
                this.f1179i = i11;
                int[] iArr = this.f1175e;
                if (i11 >= iArr.length) {
                    this.f1180j = true;
                    this.f1179i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f1172a; i13++) {
                int[] iArr2 = this.f1175e;
                int i14 = iArr2[i10];
                int i15 = solverVariable.f1161f;
                if (i14 == i15) {
                    float[] fArr = this.f1177g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f1178h) {
                            this.f1178h = this.f1176f[i10];
                        } else {
                            int[] iArr3 = this.f1176f;
                            iArr3[i12] = iArr3[i10];
                        }
                        if (z10) {
                            solverVariable.c(this.f1173b);
                        }
                        if (this.f1180j) {
                            this.f1179i = i10;
                        }
                        solverVariable.B--;
                        this.f1172a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i12 = i10;
                }
                i10 = this.f1176f[i10];
            }
            int i16 = this.f1179i;
            int i17 = i16 + 1;
            if (this.f1180j) {
                int[] iArr4 = this.f1175e;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f1175e;
            if (i16 >= iArr5.length && this.f1172a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f1175e;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f1175e;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.d * 2;
                this.d = i19;
                this.f1180j = false;
                this.f1179i = i16 - 1;
                this.f1177g = Arrays.copyOf(this.f1177g, i19);
                this.f1175e = Arrays.copyOf(this.f1175e, this.d);
                this.f1176f = Arrays.copyOf(this.f1176f, this.d);
            }
            this.f1175e[i16] = solverVariable.f1161f;
            this.f1177g[i16] = f10;
            if (i12 != -1) {
                int[] iArr8 = this.f1176f;
                iArr8[i16] = iArr8[i12];
                iArr8[i12] = i16;
            } else {
                this.f1176f[i16] = this.f1178h;
                this.f1178h = i16;
            }
            solverVariable.B++;
            solverVariable.b(this.f1173b);
            this.f1172a++;
            if (!this.f1180j) {
                this.f1179i++;
            }
            int i20 = this.f1179i;
            int[] iArr9 = this.f1175e;
            if (i20 >= iArr9.length) {
                this.f1180j = true;
                this.f1179i = iArr9.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void g() {
        int i10 = this.f1178h;
        for (int i11 = 0; i10 != -1 && i11 < this.f1172a; i11++) {
            float[] fArr = this.f1177g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f1176f[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float h(int i10) {
        int i11 = this.f1178h;
        for (int i12 = 0; i11 != -1 && i12 < this.f1172a; i12++) {
            if (i12 == i10) {
                return this.f1177g[i11];
            }
            i11 = this.f1176f[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float i(SolverVariable solverVariable, boolean z10) {
        int i10 = this.f1178h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f1172a) {
            if (this.f1175e[i10] == solverVariable.f1161f) {
                if (i10 == this.f1178h) {
                    this.f1178h = this.f1176f[i10];
                } else {
                    int[] iArr = this.f1176f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    solverVariable.c(this.f1173b);
                }
                solverVariable.B--;
                this.f1172a--;
                this.f1175e[i10] = -1;
                if (this.f1180j) {
                    this.f1179i = i10;
                }
                return this.f1177g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f1176f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float j(SolverVariable solverVariable) {
        int i10 = this.f1178h;
        for (int i11 = 0; i10 != -1 && i11 < this.f1172a; i11++) {
            if (this.f1175e[i10] == solverVariable.f1161f) {
                return this.f1177g[i10];
            }
            i10 = this.f1176f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(float f10) {
        int i10 = this.f1178h;
        for (int i11 = 0; i10 != -1 && i11 < this.f1172a; i11++) {
            float[] fArr = this.f1177g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f1176f[i10];
        }
    }

    public String toString() {
        int i10 = this.f1178h;
        String str = BuildConfig.FLAVOR;
        for (int i11 = 0; i10 != -1 && i11 < this.f1172a; i11++) {
            StringBuilder m10 = a1.a.m(a1.a.l(str, " -> "));
            m10.append(this.f1177g[i10]);
            m10.append(" : ");
            StringBuilder m11 = a1.a.m(m10.toString());
            m11.append(this.f1174c.f14136c[this.f1175e[i10]]);
            str = m11.toString();
            i10 = this.f1176f[i10];
        }
        return str;
    }
}
