package le;

/* loaded from: classes3.dex */
public abstract class j0 extends kotlinx.coroutines.b {
    public abstract j0 s();

    public final String t() {
        j0 j0Var;
        t tVar = t.f12836a;
        j0 j0Var2 = ne.j.f13458a;
        if (this == j0Var2) {
            return "Dispatchers.Main";
        }
        try {
            j0Var = j0Var2.s();
        } catch (UnsupportedOperationException unused) {
            j0Var = null;
        }
        if (this == j0Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.b
    public String toString() {
        String t2 = t();
        if (t2 == null) {
            return getClass().getSimpleName() + '@' + a0.b.B(this);
        }
        return t2;
    }
}
