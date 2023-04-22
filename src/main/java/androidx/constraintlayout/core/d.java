package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class d extends androidx.constraintlayout.core.b {

    /* renamed from: f  reason: collision with root package name */
    public SolverVariable[] f1201f;

    /* renamed from: g  reason: collision with root package name */
    public SolverVariable[] f1202g;

    /* renamed from: h  reason: collision with root package name */
    public int f1203h;

    /* renamed from: i  reason: collision with root package name */
    public b f1204i;

    /* loaded from: classes.dex */
    public class a implements Comparator<SolverVariable> {
        public a(d dVar) {
        }

        @Override // java.util.Comparator
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f1161f - solverVariable2.f1161f;
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public SolverVariable f1205a;

        public b(d dVar) {
        }

        public String toString() {
            String str = "[ ";
            if (this.f1205a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder m10 = a1.a.m(str);
                    m10.append(this.f1205a.f1166w[i10]);
                    m10.append(" ");
                    str = m10.toString();
                }
            }
            StringBuilder l10 = android.support.v4.media.a.l(str, "] ");
            l10.append(this.f1205a);
            return l10.toString();
        }
    }

    public d(q.a aVar) {
        super(aVar);
        this.f1201f = new SolverVariable[128];
        this.f1202g = new SolverVariable[128];
        this.f1203h = 0;
        this.f1204i = new b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r8 < r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r6 != false) goto L18;
     */
    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.constraintlayout.core.SolverVariable a(androidx.constraintlayout.core.c r14, boolean[] r15) {
        /*
            r13 = this;
            r10 = r13
            r12 = 0
            r14 = r12
            r12 = -1
            r0 = r12
            r1 = 0
            java.lang.String r12 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r12 = -1
            r2 = r12
        La:
            int r3 = r10.f1203h
            if (r1 >= r3) goto L71
            androidx.constraintlayout.core.SolverVariable[] r3 = r10.f1201f
            r4 = r3[r1]
            int r5 = r4.f1161f
            boolean r5 = r15[r5]
            if (r5 == 0) goto L19
            goto L6e
        L19:
            r12 = 3
            androidx.constraintlayout.core.d$b r5 = r10.f1204i
            r12 = 3
            r5.f1205a = r4
            r12 = 8
            r4 = r12
            r12 = 1
            r6 = r12
            if (r2 != r0) goto L46
        L26:
            if (r4 < 0) goto L41
            androidx.constraintlayout.core.SolverVariable r3 = r5.f1205a
            float[] r3 = r3.f1166w
            r12 = 1
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r12 = 7
            if (r8 <= 0) goto L36
            goto L41
        L36:
            r12 = 5
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L3d
            r12 = 2
            goto L42
        L3d:
            int r4 = r4 + (-1)
            r12 = 2
            goto L26
        L41:
            r6 = 0
        L42:
            if (r6 == 0) goto L6d
            r12 = 7
            goto L6c
        L46:
            r12 = 3
            r3 = r3[r2]
            r12 = 7
        L4a:
            if (r4 < 0) goto L67
            float[] r7 = r3.f1166w
            r7 = r7[r4]
            r12 = 1
            androidx.constraintlayout.core.SolverVariable r8 = r5.f1205a
            r12 = 3
            float[] r8 = r8.f1166w
            r12 = 7
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            r12 = 4
            if (r9 != 0) goto L61
            int r4 = r4 + (-1)
            goto L4a
        L61:
            r12 = 5
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L67
            goto L6a
        L67:
            r12 = 1
            r6 = 0
            r12 = 6
        L6a:
            if (r6 == 0) goto L6d
        L6c:
            r2 = r1
        L6d:
            r12 = 5
        L6e:
            int r1 = r1 + 1
            goto La
        L71:
            if (r2 != r0) goto L77
            r12 = 1
            r12 = 0
            r14 = r12
            return r14
        L77:
            r12 = 3
            androidx.constraintlayout.core.SolverVariable[] r14 = r10.f1201f
            r12 = 3
            r14 = r14[r2]
            r12 = 2
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.d.a(androidx.constraintlayout.core.c, boolean[]):androidx.constraintlayout.core.SolverVariable");
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public void b(SolverVariable solverVariable) {
        this.f1204i.f1205a = solverVariable;
        Arrays.fill(solverVariable.f1166w, 0.0f);
        solverVariable.f1166w[solverVariable.f1163m] = 1.0f;
        m(solverVariable);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public void clear() {
        this.f1203h = 0;
        this.f1182b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public boolean isEmpty() {
        return this.f1203h == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public void l(c cVar, androidx.constraintlayout.core.b bVar, boolean z10) {
        SolverVariable solverVariable = bVar.f1181a;
        if (solverVariable == null) {
            return;
        }
        b.a aVar = bVar.d;
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            SolverVariable e10 = aVar.e(i10);
            float h10 = aVar.h(i10);
            b bVar2 = this.f1204i;
            bVar2.f1205a = e10;
            boolean z11 = true;
            if (e10.f1160c) {
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr = bVar2.f1205a.f1166w;
                    fArr[i11] = (solverVariable.f1166w[i11] * h10) + fArr[i11];
                    if (Math.abs(fArr[i11]) < 1.0E-4f) {
                        bVar2.f1205a.f1166w[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    d.this.n(bVar2.f1205a);
                }
                z11 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f10 = solverVariable.f1166w[i12];
                    if (f10 != 0.0f) {
                        float f11 = f10 * h10;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        bVar2.f1205a.f1166w[i12] = f11;
                    } else {
                        bVar2.f1205a.f1166w[i12] = 0.0f;
                    }
                }
            }
            if (z11) {
                m(e10);
            }
            this.f1182b = (bVar.f1182b * h10) + this.f1182b;
        }
        n(solverVariable);
    }

    public final void m(SolverVariable solverVariable) {
        int i10;
        int i11 = this.f1203h + 1;
        SolverVariable[] solverVariableArr = this.f1201f;
        if (i11 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f1201f = solverVariableArr2;
            this.f1202g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f1201f;
        int i12 = this.f1203h;
        solverVariableArr3[i12] = solverVariable;
        int i13 = i12 + 1;
        this.f1203h = i13;
        if (i13 > 1 && solverVariableArr3[i13 - 1].f1161f > solverVariable.f1161f) {
            int i14 = 0;
            while (true) {
                i10 = this.f1203h;
                if (i14 >= i10) {
                    break;
                }
                this.f1202g[i14] = this.f1201f[i14];
                i14++;
            }
            Arrays.sort(this.f1202g, 0, i10, new a(this));
            for (int i15 = 0; i15 < this.f1203h; i15++) {
                this.f1201f[i15] = this.f1202g[i15];
            }
        }
        solverVariable.f1160c = true;
        solverVariable.b(this);
    }

    public final void n(SolverVariable solverVariable) {
        int i10 = 0;
        while (i10 < this.f1203h) {
            if (this.f1201f[i10] == solverVariable) {
                while (true) {
                    int i11 = this.f1203h;
                    if (i10 >= i11 - 1) {
                        this.f1203h = i11 - 1;
                        solverVariable.f1160c = false;
                        return;
                    }
                    SolverVariable[] solverVariableArr = this.f1201f;
                    int i12 = i10 + 1;
                    solverVariableArr[i10] = solverVariableArr[i12];
                    i10 = i12;
                }
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b
    public String toString() {
        StringBuilder l10 = android.support.v4.media.a.l(BuildConfig.FLAVOR, " goal -> (");
        l10.append(this.f1182b);
        l10.append(") : ");
        String sb2 = l10.toString();
        for (int i10 = 0; i10 < this.f1203h; i10++) {
            this.f1204i.f1205a = this.f1201f[i10];
            StringBuilder m10 = a1.a.m(sb2);
            m10.append(this.f1204i);
            m10.append(" ");
            sb2 = m10.toString();
        }
        return sb2;
    }
}
