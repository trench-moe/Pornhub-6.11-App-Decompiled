package d0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: k  reason: collision with root package name */
    public static final i f8621k;

    /* renamed from: a  reason: collision with root package name */
    public final float f8622a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8623b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8624c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f8625e;

    /* renamed from: f  reason: collision with root package name */
    public final float f8626f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f8627g;

    /* renamed from: h  reason: collision with root package name */
    public final float f8628h;

    /* renamed from: i  reason: collision with root package name */
    public final float f8629i;

    /* renamed from: j  reason: collision with root package name */
    public final float f8630j;

    static {
        float[] fArr = a0.b.f123u;
        float h02 = (float) ((a0.b.h0(50.0f) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = a0.b.n;
        float f10 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f11 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f12 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f13 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-h02) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp};
        float f14 = 1.0f / ((5.0f * h02) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float cbrt = (0.1f * f16 * f16 * ((float) Math.cbrt(h02 * 5.0d))) + (f15 * h02);
        float h03 = a0.b.h0(50.0f) / fArr[1];
        double d10 = h03;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f11) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f12) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        f8621k = new i(h03, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f13, 1.0f, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), ((float) Math.sqrt(d10)) + 1.48f);
    }

    public i(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f8626f = f10;
        this.f8622a = f11;
        this.f8623b = f12;
        this.f8624c = f13;
        this.d = f14;
        this.f8625e = f15;
        this.f8627g = fArr;
        this.f8628h = f16;
        this.f8629i = f17;
        this.f8630j = f18;
    }
}
