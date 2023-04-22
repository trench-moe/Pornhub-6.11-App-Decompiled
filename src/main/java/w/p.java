package w;

import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.a;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class p implements Comparable<p> {
    public static String[] H = {"position", "x", "y", "width", "height", "pathRotate"};
    public int A;
    public float B;
    public n C;
    public LinkedHashMap<String, ConstraintAttribute> D;
    public int E;
    public double[] F;
    public double[] G;

    /* renamed from: c  reason: collision with root package name */
    public r.c f16349c;

    /* renamed from: f  reason: collision with root package name */
    public int f16350f;

    /* renamed from: j  reason: collision with root package name */
    public float f16351j;

    /* renamed from: m  reason: collision with root package name */
    public float f16352m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public float f16353t;

    /* renamed from: u  reason: collision with root package name */
    public float f16354u;

    /* renamed from: w  reason: collision with root package name */
    public float f16355w;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public int f16356z;

    public p() {
        this.f16350f = 0;
        this.y = Float.NaN;
        this.f16356z = -1;
        this.A = -1;
        this.B = Float.NaN;
        this.C = null;
        this.D = new LinkedHashMap<>();
        this.E = 0;
        this.F = new double[18];
        this.G = new double[18];
    }

    public p(int i10, int i11, h hVar, p pVar, p pVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i12;
        float min;
        float f17;
        this.f16350f = 0;
        this.y = Float.NaN;
        this.f16356z = -1;
        this.A = -1;
        this.B = Float.NaN;
        this.C = null;
        this.D = new LinkedHashMap<>();
        this.E = 0;
        this.F = new double[18];
        this.G = new double[18];
        if (pVar.A != -1) {
            float f18 = hVar.f16226a / 100.0f;
            this.f16351j = f18;
            this.f16350f = hVar.f16269i;
            this.E = hVar.f16275p;
            float f19 = Float.isNaN(hVar.f16270j) ? f18 : hVar.f16270j;
            float f20 = Float.isNaN(hVar.f16271k) ? f18 : hVar.f16271k;
            float f21 = pVar2.f16354u;
            float f22 = pVar.f16354u;
            float f23 = pVar2.f16355w;
            float f24 = pVar.f16355w;
            this.f16352m = this.f16351j;
            this.f16354u = (int) (((f21 - f22) * f19) + f22);
            this.f16355w = (int) (((f23 - f24) * f20) + f24);
            int i13 = hVar.f16275p;
            if (i13 == 1) {
                float f25 = Float.isNaN(hVar.f16272l) ? f18 : hVar.f16272l;
                float f26 = pVar2.n;
                float f27 = pVar.n;
                this.n = a0.a.b(f26, f27, f25, f27);
                f18 = Float.isNaN(hVar.f16273m) ? f18 : hVar.f16273m;
                float f28 = pVar2.f16353t;
                float f29 = pVar.f16353t;
                this.f16353t = a0.a.b(f28, f29, f18, f29);
            } else if (i13 != 2) {
                float f30 = Float.isNaN(hVar.f16272l) ? f18 : hVar.f16272l;
                float f31 = pVar2.n;
                float f32 = pVar.n;
                this.n = a0.a.b(f31, f32, f30, f32);
                f18 = Float.isNaN(hVar.f16273m) ? f18 : hVar.f16273m;
                float f33 = pVar2.f16353t;
                float f34 = pVar.f16353t;
                this.f16353t = a0.a.b(f33, f34, f18, f34);
            } else {
                if (Float.isNaN(hVar.f16272l)) {
                    float f35 = pVar2.n;
                    float f36 = pVar.n;
                    min = a0.a.b(f35, f36, f18, f36);
                } else {
                    min = hVar.f16272l * Math.min(f20, f19);
                }
                this.n = min;
                if (Float.isNaN(hVar.f16273m)) {
                    float f37 = pVar2.f16353t;
                    float f38 = pVar.f16353t;
                    f17 = a0.a.b(f37, f38, f18, f38);
                } else {
                    f17 = hVar.f16273m;
                }
                this.f16353t = f17;
            }
            this.A = pVar.A;
            this.f16349c = r.c.c(hVar.f16267g);
            this.f16356z = hVar.f16268h;
            return;
        }
        int i14 = hVar.f16275p;
        if (i14 == 1) {
            float f39 = hVar.f16226a / 100.0f;
            this.f16351j = f39;
            this.f16350f = hVar.f16269i;
            float f40 = Float.isNaN(hVar.f16270j) ? f39 : hVar.f16270j;
            float f41 = Float.isNaN(hVar.f16271k) ? f39 : hVar.f16271k;
            float f42 = pVar2.f16354u - pVar.f16354u;
            float f43 = pVar2.f16355w - pVar.f16355w;
            this.f16352m = this.f16351j;
            f39 = Float.isNaN(hVar.f16272l) ? f39 : hVar.f16272l;
            float f44 = pVar.n;
            float f45 = pVar.f16354u;
            float f46 = pVar.f16353t;
            float f47 = pVar.f16355w;
            float f48 = ((pVar2.f16354u / 2.0f) + pVar2.n) - ((f45 / 2.0f) + f44);
            float f49 = ((pVar2.f16355w / 2.0f) + pVar2.f16353t) - ((f47 / 2.0f) + f46);
            float f50 = f48 * f39;
            float f51 = (f42 * f40) / 2.0f;
            this.n = (int) ((f44 + f50) - f51);
            float f52 = f39 * f49;
            float f53 = (f43 * f41) / 2.0f;
            this.f16353t = (int) ((f46 + f52) - f53);
            this.f16354u = (int) (f45 + f10);
            this.f16355w = (int) (f47 + f11);
            float f54 = Float.isNaN(hVar.f16273m) ? 0.0f : hVar.f16273m;
            this.E = 1;
            float f55 = (int) ((pVar.n + f50) - f51);
            this.n = f55;
            float f56 = (int) ((pVar.f16353t + f52) - f53);
            this.f16353t = f56;
            this.n = f55 + ((-f49) * f54);
            this.f16353t = f56 + (f48 * f54);
            this.A = this.A;
            this.f16349c = r.c.c(hVar.f16267g);
            this.f16356z = hVar.f16268h;
        } else if (i14 == 2) {
            float f57 = hVar.f16226a / 100.0f;
            this.f16351j = f57;
            this.f16350f = hVar.f16269i;
            float f58 = Float.isNaN(hVar.f16270j) ? f57 : hVar.f16270j;
            float f59 = Float.isNaN(hVar.f16271k) ? f57 : hVar.f16271k;
            float f60 = pVar2.f16354u;
            float f61 = f60 - pVar.f16354u;
            float f62 = pVar2.f16355w;
            float f63 = f62 - pVar.f16355w;
            this.f16352m = this.f16351j;
            float f64 = pVar.n;
            float f65 = pVar.f16353t;
            float f66 = (f60 / 2.0f) + pVar2.n;
            float f67 = (f62 / 2.0f) + pVar2.f16353t;
            float f68 = f61 * f58;
            this.n = (int) ((((f66 - ((f12 / 2.0f) + f64)) * f57) + f64) - (f68 / 2.0f));
            float f69 = f63 * f59;
            this.f16353t = (int) ((((f67 - ((f13 / 2.0f) + f65)) * f57) + f65) - (f69 / 2.0f));
            this.f16354u = (int) (f12 + f68);
            this.f16355w = (int) (f13 + f69);
            this.E = 2;
            if (!Float.isNaN(hVar.f16272l)) {
                this.n = (int) (hVar.f16272l * ((int) (i10 - this.f16354u)));
            }
            if (!Float.isNaN(hVar.f16273m)) {
                this.f16353t = (int) (hVar.f16273m * ((int) (i11 - this.f16355w)));
            }
            this.A = this.A;
            this.f16349c = r.c.c(hVar.f16267g);
            this.f16356z = hVar.f16268h;
        } else {
            float f70 = hVar.f16226a / 100.0f;
            this.f16351j = f70;
            this.f16350f = hVar.f16269i;
            float f71 = Float.isNaN(hVar.f16270j) ? f70 : hVar.f16270j;
            float f72 = Float.isNaN(hVar.f16271k) ? f70 : hVar.f16271k;
            float f73 = pVar2.f16354u;
            float f74 = pVar.f16354u;
            float f75 = f73 - f74;
            float f76 = pVar2.f16355w;
            float f77 = pVar.f16355w;
            float f78 = f76 - f77;
            this.f16352m = this.f16351j;
            float f79 = pVar.n;
            float f80 = pVar.f16353t;
            float f81 = ((f73 / 2.0f) + pVar2.n) - ((f74 / 2.0f) + f79);
            float f82 = ((f76 / 2.0f) + pVar2.f16353t) - ((f77 / 2.0f) + f80);
            float f83 = (f75 * f71) / 2.0f;
            this.n = (int) (((f81 * f70) + f79) - f83);
            float f84 = (f82 * f70) + f80;
            float f85 = (f78 * f72) / 2.0f;
            this.f16353t = (int) (f84 - f85);
            this.f16354u = (int) (f74 + f14);
            this.f16355w = (int) (f77 + f15);
            float f86 = Float.isNaN(hVar.f16272l) ? f70 : hVar.f16272l;
            float f87 = Float.isNaN(hVar.f16274o) ? 0.0f : hVar.f16274o;
            f70 = Float.isNaN(hVar.f16273m) ? f70 : hVar.f16273m;
            if (Float.isNaN(hVar.n)) {
                i12 = 0;
                f16 = 0.0f;
            } else {
                f16 = hVar.n;
                i12 = 0;
            }
            this.E = i12;
            this.n = (int) (((f16 * f82) + ((f86 * f81) + pVar.n)) - f83);
            this.f16353t = (int) (((f82 * f70) + ((f81 * f87) + pVar.f16353t)) - f85);
            this.f16349c = r.c.c(hVar.f16267g);
            this.f16356z = hVar.f16268h;
        }
    }

    public void b(a.C0022a c0022a) {
        this.f16349c = r.c.c(c0022a.d.d);
        a.c cVar = c0022a.d;
        this.f16356z = cVar.f1751e;
        this.A = cVar.f1749b;
        this.y = cVar.f1755i;
        this.f16350f = cVar.f1752f;
        int i10 = cVar.f1750c;
        float f10 = c0022a.f1691c.f1763e;
        this.B = c0022a.f1692e.C;
        for (String str : c0022a.f1694g.keySet()) {
            ConstraintAttribute constraintAttribute = c0022a.f1694g.get(str);
            if (constraintAttribute != null && constraintAttribute.c()) {
                this.D.put(str, constraintAttribute);
            }
        }
    }

    public final boolean c(float f10, float f11) {
        if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
            return Math.abs(f10 - f11) > 1.0E-6f;
        }
        return Float.isNaN(f10) != Float.isNaN(f11);
    }

    @Override // java.lang.Comparable
    public int compareTo(p pVar) {
        return Float.compare(this.f16352m, pVar.f16352m);
    }

    public void d(double d, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.n;
        float f11 = this.f16353t;
        float f12 = this.f16354u;
        float f13 = this.f16355w;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f14 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f14;
            } else if (i12 == 2) {
                f11 = f14;
            } else if (i12 == 3) {
                f12 = f14;
            } else if (i12 == 4) {
                f13 = f14;
            }
        }
        n nVar = this.C;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.b(d, fArr2, new float[2]);
            float f15 = fArr2[0];
            float f16 = fArr2[1];
            double d10 = f15;
            double d11 = f10;
            double d12 = f11;
            f10 = (float) (((Math.sin(d12) * d11) + d10) - (f12 / 2.0f));
            f11 = (float) ((f16 - (Math.cos(d12) * d11)) - (f13 / 2.0f));
        }
        fArr[i10] = (f12 / 2.0f) + f10 + 0.0f;
        fArr[i10 + 1] = (f13 / 2.0f) + f11 + 0.0f;
    }

    public void e(float f10, float f11, float f12, float f13) {
        this.n = f10;
        this.f16353t = f11;
        this.f16354u = f12;
        this.f16355w = f13;
    }

    public void f(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (((f13 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
        fArr[1] = (((f15 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + 0.0f;
    }

    public void g(n nVar, p pVar) {
        double d = (((this.f16354u / 2.0f) + this.n) - pVar.n) - (pVar.f16354u / 2.0f);
        double d10 = (((this.f16355w / 2.0f) + this.f16353t) - pVar.f16353t) - (pVar.f16355w / 2.0f);
        this.C = nVar;
        this.n = (float) Math.hypot(d10, d);
        if (Float.isNaN(this.B)) {
            this.f16353t = (float) (Math.atan2(d10, d) + 1.5707963267948966d);
        } else {
            this.f16353t = (float) Math.toRadians(this.B);
        }
    }
}
