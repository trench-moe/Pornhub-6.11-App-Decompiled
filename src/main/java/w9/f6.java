package w9;

/* loaded from: classes2.dex */
public final class f6 extends g6 {
    @Override // w9.g6
    public final void a(Object obj, long j10) {
        ((a6) v7.j(obj, j10)).zzb();
    }

    @Override // w9.g6
    public final void b(Object obj, Object obj2, long j10) {
        a6 a6Var = (a6) v7.j(obj, j10);
        a6 a6Var2 = (a6) v7.j(obj2, j10);
        int size = a6Var.size();
        int size2 = a6Var2.size();
        if (size > 0 && size2 > 0) {
            if (!a6Var.a()) {
                a6Var = a6Var.i(size2 + size);
            }
            a6Var.addAll(a6Var2);
        }
        if (size > 0) {
            a6Var2 = a6Var;
        }
        v7.f17349c.r(obj, j10, a6Var2);
    }
}
