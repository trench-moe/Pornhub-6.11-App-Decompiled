package t9;

/* loaded from: classes2.dex */
public final class m2<T> implements t2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final j2 f15301a;

    /* renamed from: b  reason: collision with root package name */
    public final f3<?, ?> f15302b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15303c;
    public final d1<?> d;

    public m2(f3<?, ?> f3Var, d1<?> d1Var, j2 j2Var) {
        this.f15302b = f3Var;
        this.f15303c = d1Var.c(j2Var);
        this.d = d1Var;
        this.f15301a = j2Var;
    }

    @Override // t9.t2
    public final boolean a(T t2) {
        this.d.a(t2);
        throw null;
    }

    @Override // t9.t2
    public final int b(T t2) {
        int hashCode = this.f15302b.c(t2).hashCode();
        if (this.f15303c) {
            this.d.a(t2);
            throw null;
        }
        return hashCode;
    }

    @Override // t9.t2
    public final int c(T t2) {
        f3<?, ?> f3Var = this.f15302b;
        int b10 = f3Var.b(f3Var.c(t2));
        if (this.f15303c) {
            this.d.a(t2);
            throw null;
        }
        return b10;
    }

    @Override // t9.t2
    public final void d(T t2, T t8) {
        f3<?, ?> f3Var = this.f15302b;
        Class<?> cls = v2.f15360a;
        f3Var.f(t2, f3Var.d(f3Var.c(t2), f3Var.c(t8)));
        if (this.f15303c) {
            this.d.a(t8);
            throw null;
        }
    }

    @Override // t9.t2
    public final boolean e(T t2, T t8) {
        if (this.f15302b.c(t2).equals(this.f15302b.c(t8))) {
            if (this.f15303c) {
                this.d.a(t2);
                this.d.a(t8);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // t9.t2
    public final void f(T t2) {
        this.f15302b.e(t2);
        this.d.b(t2);
    }

    @Override // t9.t2
    public final void g(T t2, com.google.android.gms.internal.cast.k1 k1Var) {
        this.d.a(t2);
        throw null;
    }
}
