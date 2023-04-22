package ia;

import cb.n;

/* loaded from: classes2.dex */
public class f extends cb.e implements Cloneable {
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U = -1.0f;

    public f(float f10, float f11, float f12) {
        this.Q = f10;
        this.P = f11;
        l0(f12);
        this.T = 0.0f;
    }

    @Override // cb.e
    public void H(float f10, float f11, float f12, n nVar) {
        float f13;
        float f14;
        float f15 = this.R;
        if (f15 == 0.0f) {
            nVar.d(f10, 0.0f);
            return;
        }
        float f16 = ((this.Q * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.P;
        float f18 = f11 + this.T;
        float b10 = a0.a.b(1.0f, f12, f16, this.S * f12);
        if (b10 / f16 >= 1.0f) {
            nVar.d(f10, 0.0f);
            return;
        }
        float f19 = this.U;
        float f20 = f19 * f12;
        boolean z10 = f19 == -1.0f || Math.abs((f19 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = 0.0f;
            f14 = b10;
        } else {
            f13 = 1.75f;
            f14 = 0.0f;
        }
        float f21 = f16 + f17;
        float f22 = f14 + f17;
        float sqrt = (float) Math.sqrt((f21 * f21) - (f22 * f22));
        float f23 = f18 - sqrt;
        float f24 = f18 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f22));
        float f25 = (90.0f - degrees) + f13;
        nVar.d(f23, 0.0f);
        float f26 = f17 * 2.0f;
        nVar.a(f23 - f17, 0.0f, f23 + f17, f26, 270.0f, degrees);
        if (z10) {
            nVar.a(f18 - f16, (-f16) - f14, f18 + f16, f16 - f14, 180.0f - f25, (f25 * 2.0f) - 180.0f);
        } else {
            float f27 = this.Q;
            float f28 = f20 * 2.0f;
            float f29 = f18 - f16;
            nVar.a(f29, -(f20 + f27), f29 + f27 + f28, f27 + f20, 180.0f - f25, ((f25 * 2.0f) - 180.0f) / 2.0f);
            float f30 = f18 + f16;
            float f31 = this.Q;
            nVar.d(f30 - ((f31 / 2.0f) + f20), f31 + f20);
            float f32 = this.Q;
            nVar.a(f30 - (f28 + f32), -(f20 + f32), f30, f32 + f20, 90.0f, f25 - 90.0f);
        }
        nVar.a(f24 - f17, 0.0f, f24 + f17, f26, 270.0f - degrees, degrees);
        nVar.d(f10, 0.0f);
    }

    public void l0(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.S = f10;
    }
}
