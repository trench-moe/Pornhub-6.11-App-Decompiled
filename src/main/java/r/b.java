package r;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public double f14536a;

        /* renamed from: b  reason: collision with root package name */
        public double[] f14537b;

        public a(double d, double[] dArr) {
            this.f14536a = d;
            this.f14537b = dArr;
        }

        @Override // r.b
        public double b(double d, int i10) {
            return this.f14537b[i10];
        }

        @Override // r.b
        public void c(double d, double[] dArr) {
            double[] dArr2 = this.f14537b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // r.b
        public void d(double d, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f14537b;
                if (i10 >= dArr.length) {
                    return;
                }
                fArr[i10] = (float) dArr[i10];
                i10++;
            }
        }

        @Override // r.b
        public double e(double d, int i10) {
            return 0.0d;
        }

        @Override // r.b
        public void f(double d, double[] dArr) {
            for (int i10 = 0; i10 < this.f14537b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // r.b
        public double[] g() {
            return new double[]{this.f14536a};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        return i10 != 0 ? i10 != 2 ? new e(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new f(dArr, dArr2);
    }

    public abstract double b(double d, int i10);

    public abstract void c(double d, double[] dArr);

    public abstract void d(double d, float[] fArr);

    public abstract double e(double d, int i10);

    public abstract void f(double d, double[] dArr);

    public abstract double[] g();
}
