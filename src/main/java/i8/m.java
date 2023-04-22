package i8;

import k8.c0;
import w6.s0;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f10669a;

    /* renamed from: b  reason: collision with root package name */
    public final s0[] f10670b;

    /* renamed from: c  reason: collision with root package name */
    public final f[] f10671c;
    public final Object d;

    public m(s0[] s0VarArr, f[] fVarArr, Object obj) {
        this.f10670b = s0VarArr;
        this.f10671c = (f[]) fVarArr.clone();
        this.d = obj;
        this.f10669a = s0VarArr.length;
    }

    public boolean a(m mVar, int i10) {
        boolean z10 = false;
        if (mVar == null) {
            return false;
        }
        if (c0.a(this.f10670b[i10], mVar.f10670b[i10]) && c0.a(this.f10671c[i10], mVar.f10671c[i10])) {
            z10 = true;
        }
        return z10;
    }

    public boolean b(int i10) {
        return this.f10670b[i10] != null;
    }
}
