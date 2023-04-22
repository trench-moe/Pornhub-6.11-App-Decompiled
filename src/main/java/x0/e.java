package x0;

import x0.b;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public double f17660a;

    /* renamed from: b  reason: collision with root package name */
    public double f17661b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17662c;
    public double d;

    /* renamed from: e  reason: collision with root package name */
    public double f17663e;

    /* renamed from: f  reason: collision with root package name */
    public double f17664f;

    /* renamed from: g  reason: collision with root package name */
    public double f17665g;

    /* renamed from: h  reason: collision with root package name */
    public double f17666h;

    /* renamed from: i  reason: collision with root package name */
    public double f17667i;

    /* renamed from: j  reason: collision with root package name */
    public final b.h f17668j;

    public e() {
        this.f17660a = Math.sqrt(1500.0d);
        this.f17661b = 0.5d;
        this.f17662c = false;
        this.f17667i = Double.MAX_VALUE;
        this.f17668j = new b.h();
    }

    public e(float f10) {
        this.f17660a = Math.sqrt(1500.0d);
        this.f17661b = 0.5d;
        this.f17662c = false;
        this.f17667i = Double.MAX_VALUE;
        this.f17668j = new b.h();
        this.f17667i = f10;
    }

    public e a(float f10) {
        if (f10 > 0.0f) {
            this.f17660a = Math.sqrt(f10);
            this.f17662c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public b.h b(double d, double d10, long j10) {
        double cos;
        double d11;
        if (!this.f17662c) {
            if (this.f17667i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f17661b;
            if (d12 > 1.0d) {
                double d13 = this.f17660a;
                this.f17664f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f17661b;
                double d15 = this.f17660a;
                this.f17665g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f17666h = Math.sqrt(1.0d - (d12 * d12)) * this.f17660a;
            }
            this.f17662c = true;
        }
        double d16 = j10 / 1000.0d;
        double d17 = d - this.f17667i;
        double d18 = this.f17661b;
        if (d18 > 1.0d) {
            double d19 = this.f17665g;
            double d20 = this.f17664f;
            double d21 = d17 - (((d19 * d17) - d10) / (d19 - d20));
            double d22 = ((d17 * d19) - d10) / (d19 - d20);
            d11 = (Math.pow(2.718281828459045d, this.f17664f * d16) * d22) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d23 = this.f17665g;
            double pow = Math.pow(2.718281828459045d, d23 * d16) * d21 * d23;
            double d24 = this.f17664f;
            cos = (Math.pow(2.718281828459045d, d24 * d16) * d22 * d24) + pow;
        } else if (d18 == 1.0d) {
            double d25 = this.f17660a;
            double d26 = (d25 * d17) + d10;
            double d27 = (d26 * d16) + d17;
            double pow2 = Math.pow(2.718281828459045d, (-d25) * d16) * d27;
            double pow3 = Math.pow(2.718281828459045d, (-this.f17660a) * d16) * d27;
            double d28 = this.f17660a;
            cos = (Math.pow(2.718281828459045d, (-d28) * d16) * d26) + (pow3 * (-d28));
            d11 = pow2;
        } else {
            double d29 = 1.0d / this.f17666h;
            double d30 = this.f17660a;
            double d31 = ((d18 * d30 * d17) + d10) * d29;
            double sin = ((Math.sin(this.f17666h * d16) * d31) + (Math.cos(this.f17666h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d30 * d16);
            double d32 = this.f17660a;
            double d33 = this.f17661b;
            double d34 = (-d32) * sin * d33;
            double pow4 = Math.pow(2.718281828459045d, (-d33) * d32 * d16);
            double d35 = this.f17666h;
            double d36 = (-d35) * d17;
            double d37 = this.f17666h;
            cos = (((Math.cos(d37 * d16) * d31 * d37) + (Math.sin(d35 * d16) * d36)) * pow4) + d34;
            d11 = sin;
        }
        b.h hVar = this.f17668j;
        hVar.f17654a = (float) (d11 + this.f17667i);
        hVar.f17655b = (float) cos;
        return hVar;
    }
}
