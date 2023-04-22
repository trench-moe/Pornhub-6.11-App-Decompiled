package w9;

/* loaded from: classes2.dex */
public final class v6 implements c7 {

    /* renamed from: a  reason: collision with root package name */
    public final s6 f17344a;

    /* renamed from: b  reason: collision with root package name */
    public final o7 f17345b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17346c;
    public final j5 d;

    public v6(o7 o7Var, j5 j5Var, s6 s6Var) {
        this.f17345b = o7Var;
        this.f17346c = j5Var.c(s6Var);
        this.d = j5Var;
        this.f17344a = s6Var;
    }

    @Override // w9.c7
    public final void a(Object obj) {
        this.f17345b.g(obj);
        this.d.b(obj);
    }

    @Override // w9.c7
    public final int b(Object obj) {
        int hashCode = this.f17345b.c(obj).hashCode();
        if (this.f17346c) {
            this.d.a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // w9.c7
    public final int c(Object obj) {
        o7 o7Var = this.f17345b;
        int b10 = o7Var.b(o7Var.c(obj));
        if (this.f17346c) {
            this.d.a(obj);
            throw null;
        }
        return b10;
    }

    @Override // w9.c7
    public final Object d() {
        return ((r5) this.f17344a.a()).n();
    }

    @Override // w9.c7
    public final void e(Object obj, f5 f5Var) {
        this.d.a(obj);
        throw null;
    }

    @Override // w9.c7
    public final boolean f(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // w9.c7
    public final void g(Object obj, Object obj2) {
        o7 o7Var = this.f17345b;
        Class cls = e7.f17123a;
        o7Var.h(obj, o7Var.d(o7Var.c(obj), o7Var.c(obj2)));
        if (this.f17346c) {
            this.d.a(obj2);
            throw null;
        }
    }

    @Override // w9.c7
    public final boolean h(Object obj, Object obj2) {
        if (this.f17345b.c(obj).equals(this.f17345b.c(obj2))) {
            if (this.f17346c) {
                this.d.a(obj);
                this.d.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // w9.c7
    public final void i(Object obj, byte[] bArr, int i10, int i11, b5 b5Var) {
        u5 u5Var = (u5) obj;
        if (u5Var.zzc == p7.f17276f) {
            u5Var.zzc = p7.b();
        }
        s5 s5Var = (s5) obj;
        throw null;
    }
}
