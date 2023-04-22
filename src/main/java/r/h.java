package r;

/* loaded from: classes2.dex */
public class h extends c {
    public double d;

    /* renamed from: e  reason: collision with root package name */
    public double f14571e;

    public h(String str) {
        this.f14540a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i10 = indexOf2 + 1;
        this.f14571e = Double.parseDouble(str.substring(i10, str.indexOf(44, i10)).trim());
    }

    @Override // r.c
    public double a(double d) {
        double d10 = this.f14571e;
        if (d < d10) {
            return (d10 * d) / (((d10 - d) * this.d) + d);
        }
        return ((d - 1.0d) * (1.0d - d10)) / ((1.0d - d) - ((d10 - d) * this.d));
    }

    @Override // r.c
    public double b(double d) {
        double d10 = this.f14571e;
        if (d < d10) {
            double d11 = this.d;
            double d12 = d11 * d10 * d10;
            double d13 = ((d10 - d) * d11) + d;
            return d12 / (d13 * d13);
        }
        double d14 = this.d;
        double d15 = d10 - 1.0d;
        double d16 = (((d10 - d) * (-d14)) - d) + 1.0d;
        return ((d15 * d14) * d15) / (d16 * d16);
    }
}
