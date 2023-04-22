package cb;

/* loaded from: classes.dex */
public class d extends b7.k {
    @Override // b7.k
    public void c(n nVar, float f10, float f11, float f12) {
        nVar.f(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d = f12;
        double d10 = f11;
        nVar.d((float) (Math.sin(Math.toRadians(f10)) * d * d10), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d * d10));
    }
}
