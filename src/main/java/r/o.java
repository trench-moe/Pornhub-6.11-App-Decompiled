package r;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public float f14605a;

    /* renamed from: b  reason: collision with root package name */
    public float f14606b;

    /* renamed from: c  reason: collision with root package name */
    public float f14607c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public float f14608e;

    /* renamed from: f  reason: collision with root package name */
    public float f14609f;

    public void a(float f10, float f11, int i10, int i11, float[] fArr) {
        float f12;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f13 + this.f14607c;
        float f17 = f14 + this.d;
        float f18 = (this.f14605a * (f10 - 0.5f) * 2.0f) + f16;
        float f19 = (this.f14606b * f15) + f17;
        float radians = (float) Math.toRadians(this.f14609f);
        float radians2 = (float) Math.toRadians(this.f14608e);
        double d = radians;
        double sin = Math.sin(d);
        double d10 = i11 * f15;
        double cos = Math.cos(d);
        fArr[0] = (((float) ((sin * ((-i10) * f12)) - (Math.cos(d) * d10))) * radians2) + f18;
        fArr[1] = (radians2 * ((float) ((cos * (i10 * f12)) - (Math.sin(d) * d10)))) + f19;
    }

    public void b(i iVar, float f10) {
        if (iVar != null) {
            double d = f10;
            this.f14608e = (float) iVar.f14572a.e(d, 0);
            this.f14609f = (float) iVar.f14572a.b(d, 0);
        }
    }

    public void c(i iVar, i iVar2, float f10) {
        if (iVar != null) {
            this.f14605a = (float) iVar.f14572a.e(f10, 0);
        }
        if (iVar2 != null) {
            this.f14606b = (float) iVar2.f14572a.e(f10, 0);
        }
    }

    public void d(i iVar, i iVar2, float f10) {
        if (iVar != null) {
            this.f14607c = (float) iVar.f14572a.e(f10, 0);
        }
        if (iVar2 != null) {
            this.d = (float) iVar2.f14572a.e(f10, 0);
        }
    }
}
