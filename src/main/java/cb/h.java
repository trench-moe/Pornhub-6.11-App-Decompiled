package cb;

/* loaded from: classes.dex */
public final class h extends e {
    public final e P;
    public final float Q;

    public h(e eVar, float f10) {
        this.P = eVar;
        this.Q = f10;
    }

    @Override // cb.e
    public boolean F() {
        return this.P.F();
    }

    @Override // cb.e
    public void H(float f10, float f11, float f12, n nVar) {
        this.P.H(f10, f11 - this.Q, f12, nVar);
    }
}
