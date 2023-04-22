package cb;

/* loaded from: classes.dex */
public final class f extends e {
    public final float P;

    public f(float f10) {
        this.P = f10 - 0.001f;
    }

    @Override // cb.e
    public void H(float f10, float f11, float f12, n nVar) {
        float sqrt = (float) ((Math.sqrt(2.0d) * this.P) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.P, 2.0d) - Math.pow(sqrt, 2.0d));
        nVar.e(f11 - sqrt, ((float) (-((Math.sqrt(2.0d) * this.P) - this.P))) + sqrt2);
        nVar.d(f11, (float) (-((Math.sqrt(2.0d) * this.P) - this.P)));
        nVar.d(f11 + sqrt, ((float) (-((Math.sqrt(2.0d) * this.P) - this.P))) + sqrt2);
    }
}
