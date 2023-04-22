package t9;

/* loaded from: classes2.dex */
public final class x1 extends y1 {
    @Override // t9.y1
    public final void a(Object obj, long j10) {
        ((s1) o3.j(obj, j10)).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    @Override // t9.y1
    public final <E> void b(Object obj, Object obj2, long j10) {
        s1<E> s1Var = (s1) o3.j(obj, j10);
        s1<E> s1Var2 = (s1) o3.j(obj2, j10);
        int size = s1Var.size();
        int size2 = s1Var2.size();
        s1<E> s1Var3 = s1Var;
        if (size > 0) {
            s1Var3 = s1Var;
            if (size2 > 0) {
                boolean a10 = s1Var.a();
                s1<E> s1Var4 = s1Var;
                if (!a10) {
                    s1Var4 = s1Var.zzg(size2 + size);
                }
                s1Var4.addAll(s1Var2);
                s1Var3 = s1Var4;
            }
        }
        if (size > 0) {
            s1Var2 = s1Var3;
        }
        o3.f15313c.u(obj, j10, s1Var2);
    }
}
