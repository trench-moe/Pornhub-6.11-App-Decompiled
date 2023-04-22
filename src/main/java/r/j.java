package r;

/* loaded from: classes2.dex */
public class j implements l {

    /* renamed from: b  reason: collision with root package name */
    public double f14577b;

    /* renamed from: c  reason: collision with root package name */
    public double f14578c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f14579e;

    /* renamed from: f  reason: collision with root package name */
    public float f14580f;

    /* renamed from: g  reason: collision with root package name */
    public float f14581g;

    /* renamed from: h  reason: collision with root package name */
    public float f14582h;

    /* renamed from: a  reason: collision with root package name */
    public double f14576a = 0.5d;

    /* renamed from: i  reason: collision with root package name */
    public int f14583i = 0;

    @Override // r.l
    public boolean a() {
        double d = this.f14579e - this.f14578c;
        double d10 = this.f14577b;
        double d11 = this.f14580f;
        return Math.sqrt((((d10 * d) * d) + ((d11 * d11) * ((double) this.f14581g))) / d10) <= ((double) this.f14582h);
    }

    @Override // r.l
    public float b() {
        return 0.0f;
    }

    @Override // r.l
    public float getInterpolation(float f10) {
        j jVar = this;
        double d = f10 - jVar.d;
        double d10 = jVar.f14577b;
        double d11 = jVar.f14576a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d10 / jVar.f14581g) * d) * 4.0d)) + 1.0d);
        double d12 = d / sqrt;
        int i10 = 0;
        while (i10 < sqrt) {
            double d13 = jVar.f14579e;
            double d14 = jVar.f14578c;
            int i11 = sqrt;
            int i12 = i10;
            double d15 = jVar.f14580f;
            double d16 = jVar.f14581g;
            double d17 = ((((((-d10) * (d13 - d14)) - (d15 * d11)) / d16) * d12) / 2.0d) + d15;
            double d18 = ((((-((((d12 * d17) / 2.0d) + d13) - d14)) * d10) - (d17 * d11)) / d16) * d12;
            float f11 = (float) (d15 + d18);
            this.f14580f = f11;
            float f12 = (float) ((((d18 / 2.0d) + d15) * d12) + d13);
            this.f14579e = f12;
            int i13 = this.f14583i;
            if (i13 > 0) {
                if (f12 < 0.0f && (i13 & 1) == 1) {
                    this.f14579e = -f12;
                    this.f14580f = -f11;
                }
                float f13 = this.f14579e;
                if (f13 > 1.0f && (i13 & 2) == 2) {
                    this.f14579e = 2.0f - f13;
                    this.f14580f = -this.f14580f;
                }
            }
            sqrt = i11;
            i10 = i12 + 1;
            jVar = this;
        }
        j jVar2 = jVar;
        jVar2.d = f10;
        return jVar2.f14579e;
    }
}
