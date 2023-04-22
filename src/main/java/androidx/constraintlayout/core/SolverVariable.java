package androidx.constraintlayout.core;

import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;

/* loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    public static int C = 1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1160c;
    public float n;
    public Type y;

    /* renamed from: f  reason: collision with root package name */
    public int f1161f = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f1162j = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f1163m = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1164t = false;

    /* renamed from: u  reason: collision with root package name */
    public float[] f1165u = new float[9];

    /* renamed from: w  reason: collision with root package name */
    public float[] f1166w = new float[9];

    /* renamed from: z  reason: collision with root package name */
    public b[] f1167z = new b[16];
    public int A = 0;
    public int B = 0;

    /* loaded from: classes.dex */
    public enum Type {
        UNRESTRICTED,
        /* JADX INFO: Fake field, exist only in values array */
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.y = type;
    }

    public final void b(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.A;
            if (i10 >= i11) {
                b[] bVarArr = this.f1167z;
                if (i11 >= bVarArr.length) {
                    this.f1167z = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f1167z;
                int i12 = this.A;
                bVarArr2[i12] = bVar;
                this.A = i12 + 1;
                return;
            } else if (this.f1167z[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(b bVar) {
        int i10 = this.A;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f1167z[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f1167z;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.A--;
                return;
            }
            i11++;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.f1161f - solverVariable.f1161f;
    }

    public void d() {
        this.y = Type.UNKNOWN;
        this.f1163m = 0;
        this.f1161f = -1;
        this.f1162j = -1;
        this.n = 0.0f;
        this.f1164t = false;
        int i10 = this.A;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f1167z[i11] = null;
        }
        this.A = 0;
        this.B = 0;
        this.f1160c = false;
        Arrays.fill(this.f1166w, 0.0f);
    }

    public void e(c cVar, float f10) {
        this.n = f10;
        this.f1164t = true;
        int i10 = this.A;
        this.f1162j = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f1167z[i11].k(cVar, this, false);
        }
        this.A = 0;
    }

    public final void f(c cVar, b bVar) {
        int i10 = this.A;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f1167z[i11].l(cVar, bVar, false);
        }
        this.A = 0;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m(BuildConfig.FLAVOR);
        m10.append(this.f1161f);
        return m10.toString();
    }
}
