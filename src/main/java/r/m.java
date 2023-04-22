package r;

/* loaded from: classes2.dex */
public class m implements l {

    /* renamed from: a  reason: collision with root package name */
    public float f14584a;

    /* renamed from: b  reason: collision with root package name */
    public float f14585b;

    /* renamed from: c  reason: collision with root package name */
    public float f14586c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f14587e;

    /* renamed from: f  reason: collision with root package name */
    public float f14588f;

    /* renamed from: g  reason: collision with root package name */
    public float f14589g;

    /* renamed from: h  reason: collision with root package name */
    public float f14590h;

    /* renamed from: i  reason: collision with root package name */
    public float f14591i;

    /* renamed from: j  reason: collision with root package name */
    public int f14592j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14593k = false;

    /* renamed from: l  reason: collision with root package name */
    public float f14594l;

    /* renamed from: m  reason: collision with root package name */
    public float f14595m;

    @Override // r.l
    public boolean a() {
        return b() < 1.0E-5f && Math.abs(this.f14591i - this.f14595m) < 1.0E-5f;
    }

    @Override // r.l
    public float b() {
        return this.f14593k ? -c(this.f14595m) : c(this.f14595m);
    }

    public float c(float f10) {
        float f11;
        float f12;
        float f13 = this.d;
        if (f10 <= f13) {
            f11 = this.f14584a;
            f12 = this.f14585b;
        } else {
            int i10 = this.f14592j;
            if (i10 == 1) {
                return 0.0f;
            }
            f10 -= f13;
            f13 = this.f14587e;
            if (f10 >= f13) {
                if (i10 == 2) {
                    return this.f14590h;
                }
                float f14 = f10 - f13;
                float f15 = this.f14588f;
                if (f14 < f15) {
                    float f16 = this.f14586c;
                    return f16 - ((f14 * f16) / f15);
                }
                return this.f14591i;
            }
            f11 = this.f14585b;
            f12 = this.f14586c;
        }
        return (((f12 - f11) * f10) / f13) + f11;
    }

    public final void d(float f10, float f11, float f12, float f13, float f14) {
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        this.f14584a = f10;
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float sqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (sqrt < f13) {
                this.f14592j = 2;
                this.f14584a = f10;
                this.f14585b = sqrt;
                this.f14586c = 0.0f;
                float f17 = (sqrt - f10) / f12;
                this.d = f17;
                this.f14587e = sqrt / f12;
                this.f14589g = ((f10 + sqrt) * f17) / 2.0f;
                this.f14590h = f11;
                this.f14591i = f11;
                return;
            }
            this.f14592j = 3;
            this.f14584a = f10;
            this.f14585b = f13;
            this.f14586c = f13;
            float f18 = (f13 - f10) / f12;
            this.d = f18;
            float f19 = f13 / f12;
            this.f14588f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f14587e = ((f11 - f20) - f21) / f13;
            this.f14589g = f20;
            this.f14590h = f11 - f21;
            this.f14591i = f11;
        } else if (f16 >= f11) {
            this.f14592j = 1;
            this.f14584a = f10;
            this.f14585b = 0.0f;
            this.f14589g = f11;
            this.d = (2.0f * f11) / f10;
        } else {
            float f22 = f11 - f16;
            float f23 = f22 / f10;
            if (f23 + f15 < f14) {
                this.f14592j = 2;
                this.f14584a = f10;
                this.f14585b = f10;
                this.f14586c = 0.0f;
                this.f14589g = f22;
                this.f14590h = f11;
                this.d = f23;
                this.f14587e = f15;
                return;
            }
            float sqrt2 = (float) Math.sqrt(((f10 * f10) / 2.0f) + (f12 * f11));
            float f24 = (sqrt2 - f10) / f12;
            this.d = f24;
            float f25 = sqrt2 / f12;
            this.f14587e = f25;
            if (sqrt2 < f13) {
                this.f14592j = 2;
                this.f14584a = f10;
                this.f14585b = sqrt2;
                this.f14586c = 0.0f;
                this.d = f24;
                this.f14587e = f25;
                this.f14589g = ((f10 + sqrt2) * f24) / 2.0f;
                this.f14590h = f11;
                return;
            }
            this.f14592j = 3;
            this.f14584a = f10;
            this.f14585b = f13;
            this.f14586c = f13;
            float f26 = (f13 - f10) / f12;
            this.d = f26;
            float f27 = f13 / f12;
            this.f14588f = f27;
            float f28 = ((f10 + f13) * f26) / 2.0f;
            float f29 = (f27 * f13) / 2.0f;
            this.f14587e = ((f11 - f28) - f29) / f13;
            this.f14589g = f28;
            this.f14590h = f11 - f29;
            this.f14591i = f11;
        }
    }

    @Override // r.l
    public float getInterpolation(float f10) {
        float f11;
        float f12 = this.d;
        if (f10 <= f12) {
            float f13 = this.f14584a;
            f11 = ((((this.f14585b - f13) * f10) * f10) / (f12 * 2.0f)) + (f13 * f10);
        } else {
            int i10 = this.f14592j;
            if (i10 == 1) {
                f11 = this.f14589g;
            } else {
                float f14 = f10 - f12;
                float f15 = this.f14587e;
                if (f14 < f15) {
                    float f16 = this.f14589g;
                    float f17 = this.f14585b;
                    f11 = ((((this.f14586c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i10 == 2) {
                    f11 = this.f14590h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f14588f;
                    if (f18 <= f19) {
                        float f20 = this.f14590h;
                        float f21 = this.f14586c * f18;
                        f11 = (f20 + f21) - ((f21 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f14591i;
                    }
                }
            }
        }
        this.f14595m = f10;
        return this.f14593k ? this.f14594l - f11 : this.f14594l + f11;
    }
}
