package r;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final double[] f14517a;

    /* renamed from: b  reason: collision with root package name */
    public C0251a[] f14518b;

    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0251a {

        /* renamed from: s  reason: collision with root package name */
        public static double[] f14519s = new double[91];

        /* renamed from: a  reason: collision with root package name */
        public double[] f14520a;

        /* renamed from: b  reason: collision with root package name */
        public double f14521b;

        /* renamed from: c  reason: collision with root package name */
        public double f14522c;
        public double d;

        /* renamed from: e  reason: collision with root package name */
        public double f14523e;

        /* renamed from: f  reason: collision with root package name */
        public double f14524f;

        /* renamed from: g  reason: collision with root package name */
        public double f14525g;

        /* renamed from: h  reason: collision with root package name */
        public double f14526h;

        /* renamed from: i  reason: collision with root package name */
        public double f14527i;

        /* renamed from: j  reason: collision with root package name */
        public double f14528j;

        /* renamed from: k  reason: collision with root package name */
        public double f14529k;

        /* renamed from: l  reason: collision with root package name */
        public double f14530l;

        /* renamed from: m  reason: collision with root package name */
        public double f14531m;
        public double n;

        /* renamed from: o  reason: collision with root package name */
        public double f14532o;

        /* renamed from: p  reason: collision with root package name */
        public double f14533p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f14534q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f14535r;

        public C0251a(int i10, double d, double d10, double d11, double d12, double d13, double d14) {
            double[] dArr;
            double d15 = d11;
            this.f14535r = false;
            this.f14534q = i10 == 1;
            this.f14522c = d;
            this.d = d10;
            this.f14527i = 1.0d / (d10 - d);
            if (3 == i10) {
                this.f14535r = true;
            }
            double d16 = d13 - d15;
            double d17 = d14 - d12;
            if (this.f14535r || Math.abs(d16) < 0.001d || Math.abs(d17) < 0.001d) {
                this.f14535r = true;
                this.f14523e = d15;
                this.f14524f = d13;
                this.f14525g = d12;
                this.f14526h = d14;
                double hypot = Math.hypot(d17, d16);
                this.f14521b = hypot;
                this.n = hypot * this.f14527i;
                double d18 = this.d;
                double d19 = this.f14522c;
                this.f14530l = d16 / (d18 - d19);
                this.f14531m = d17 / (d18 - d19);
                return;
            }
            this.f14520a = new double[101];
            boolean z10 = this.f14534q;
            this.f14528j = (z10 ? -1 : 1) * d16;
            this.f14529k = d17 * (z10 ? 1 : -1);
            this.f14530l = z10 ? d13 : d15;
            this.f14531m = z10 ? d12 : d14;
            double d20 = d12 - d14;
            int i11 = 0;
            double d21 = 0.0d;
            double d22 = 0.0d;
            double d23 = 0.0d;
            while (true) {
                double[] dArr2 = f14519s;
                if (i11 >= dArr2.length) {
                    break;
                }
                double radians = Math.toRadians((i11 * 90.0d) / (dArr2.length - 1));
                double sin = Math.sin(radians) * d16;
                double cos = Math.cos(radians) * d20;
                if (i11 > 0) {
                    d21 += Math.hypot(sin - d22, cos - d23);
                    dArr2[i11] = d21;
                }
                i11++;
                d23 = cos;
                d22 = sin;
            }
            this.f14521b = d21;
            int i12 = 0;
            while (true) {
                double[] dArr3 = f14519s;
                if (i12 >= dArr3.length) {
                    break;
                }
                dArr3[i12] = dArr3[i12] / d21;
                i12++;
            }
            int i13 = 0;
            while (true) {
                if (i13 >= this.f14520a.length) {
                    this.n = this.f14521b * this.f14527i;
                    return;
                }
                double length = i13 / (dArr.length - 1);
                double[] dArr4 = f14519s;
                int binarySearch = Arrays.binarySearch(dArr4, length);
                if (binarySearch >= 0) {
                    this.f14520a[i13] = binarySearch / (dArr4.length - 1);
                } else if (binarySearch == -1) {
                    this.f14520a[i13] = 0.0d;
                } else {
                    int i14 = -binarySearch;
                    int i15 = i14 - 2;
                    this.f14520a[i13] = (((length - dArr4[i15]) / (dArr4[i14 - 1] - dArr4[i15])) + i15) / (dArr4.length - 1);
                }
                i13++;
            }
        }

        public double a() {
            double d = this.f14528j * this.f14533p;
            double hypot = this.n / Math.hypot(d, (-this.f14529k) * this.f14532o);
            if (this.f14534q) {
                d = -d;
            }
            return d * hypot;
        }

        public double b() {
            double d = this.f14528j * this.f14533p;
            double d10 = (-this.f14529k) * this.f14532o;
            double hypot = this.n / Math.hypot(d, d10);
            return this.f14534q ? (-d10) * hypot : d10 * hypot;
        }

        public double c(double d) {
            double d10 = (d - this.f14522c) * this.f14527i;
            double d11 = this.f14523e;
            return ((this.f14524f - d11) * d10) + d11;
        }

        public double d(double d) {
            double d10 = (d - this.f14522c) * this.f14527i;
            double d11 = this.f14525g;
            return ((this.f14526h - d11) * d10) + d11;
        }

        public double e() {
            return (this.f14528j * this.f14532o) + this.f14530l;
        }

        public double f() {
            return (this.f14529k * this.f14533p) + this.f14531m;
        }

        public void g(double d) {
            double d10 = (this.f14534q ? this.d - d : d - this.f14522c) * this.f14527i;
            double d11 = 0.0d;
            if (d10 > 0.0d) {
                d11 = 1.0d;
                if (d10 < 1.0d) {
                    double[] dArr = this.f14520a;
                    double length = d10 * (dArr.length - 1);
                    int i10 = (int) length;
                    d11 = ((dArr[i10 + 1] - dArr[i10]) * (length - i10)) + dArr[i10];
                }
            }
            double d12 = d11 * 1.5707963267948966d;
            this.f14532o = Math.sin(d12);
            this.f14533p = Math.cos(d12);
        }
    }

    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f14517a = dArr;
        this.f14518b = new C0251a[dArr.length - 1];
        int i10 = 0;
        int i11 = 1;
        int i12 = 1;
        while (true) {
            C0251a[] c0251aArr = this.f14518b;
            if (i10 >= c0251aArr.length) {
                return;
            }
            int i13 = iArr[i10];
            if (i13 == 0) {
                i12 = 3;
            } else if (i13 == 1) {
                i11 = 1;
                i12 = 1;
            } else if (i13 == 2) {
                i11 = 2;
                i12 = 2;
            } else if (i13 == 3) {
                i11 = i11 == 1 ? 2 : 1;
                i12 = i11;
            }
            int i14 = i10 + 1;
            c0251aArr[i10] = new C0251a(i12, dArr[i10], dArr[i14], dArr2[i10][0], dArr2[i10][1], dArr2[i14][0], dArr2[i14][1]);
            i10 = i14;
        }
    }

    @Override // r.b
    public double b(double d, int i10) {
        double f10;
        double b10;
        C0251a[] c0251aArr = this.f14518b;
        int i11 = 0;
        if (d < c0251aArr[0].f14522c) {
            double d10 = c0251aArr[0].f14522c;
            double d11 = d - c0251aArr[0].f14522c;
            if (c0251aArr[0].f14535r) {
                if (i10 == 0) {
                    return (d11 * this.f14518b[0].f14530l) + c0251aArr[0].c(d10);
                }
                return (d11 * this.f14518b[0].f14531m) + c0251aArr[0].d(d10);
            }
            c0251aArr[0].g(d10);
            if (i10 == 0) {
                f10 = this.f14518b[0].e();
                b10 = this.f14518b[0].a();
            } else {
                f10 = this.f14518b[0].f();
                b10 = this.f14518b[0].b();
            }
            return (b10 * d11) + f10;
        } else if (d > c0251aArr[c0251aArr.length - 1].d) {
            double d12 = c0251aArr[c0251aArr.length - 1].d;
            double d13 = d - d12;
            int length = c0251aArr.length - 1;
            if (i10 == 0) {
                return (d13 * this.f14518b[length].f14530l) + c0251aArr[length].c(d12);
            }
            return (d13 * this.f14518b[length].f14531m) + c0251aArr[length].d(d12);
        } else {
            while (true) {
                C0251a[] c0251aArr2 = this.f14518b;
                if (i11 >= c0251aArr2.length) {
                    return Double.NaN;
                }
                if (d <= c0251aArr2[i11].d) {
                    if (c0251aArr2[i11].f14535r) {
                        return i10 == 0 ? c0251aArr2[i11].c(d) : c0251aArr2[i11].d(d);
                    }
                    c0251aArr2[i11].g(d);
                    return i10 == 0 ? this.f14518b[i11].e() : this.f14518b[i11].f();
                }
                i11++;
            }
        }
    }

    @Override // r.b
    public void c(double d, double[] dArr) {
        C0251a[] c0251aArr = this.f14518b;
        if (d < c0251aArr[0].f14522c) {
            double d10 = c0251aArr[0].f14522c;
            double d11 = d - c0251aArr[0].f14522c;
            if (c0251aArr[0].f14535r) {
                double c10 = c0251aArr[0].c(d10);
                C0251a[] c0251aArr2 = this.f14518b;
                dArr[0] = (c0251aArr2[0].f14530l * d11) + c10;
                dArr[1] = (d11 * this.f14518b[0].f14531m) + c0251aArr2[0].d(d10);
                return;
            }
            c0251aArr[0].g(d10);
            dArr[0] = (this.f14518b[0].a() * d11) + this.f14518b[0].e();
            dArr[1] = (this.f14518b[0].b() * d11) + this.f14518b[0].f();
        } else if (d > c0251aArr[c0251aArr.length - 1].d) {
            double d12 = c0251aArr[c0251aArr.length - 1].d;
            double d13 = d - d12;
            int length = c0251aArr.length - 1;
            if (c0251aArr[length].f14535r) {
                double c11 = c0251aArr[length].c(d12);
                C0251a[] c0251aArr3 = this.f14518b;
                dArr[0] = (c0251aArr3[length].f14530l * d13) + c11;
                dArr[1] = (d13 * this.f14518b[length].f14531m) + c0251aArr3[length].d(d12);
                return;
            }
            c0251aArr[length].g(d);
            dArr[0] = (this.f14518b[length].a() * d13) + this.f14518b[length].e();
            dArr[1] = (this.f14518b[length].b() * d13) + this.f14518b[length].f();
        } else {
            int i10 = 0;
            while (true) {
                C0251a[] c0251aArr4 = this.f14518b;
                if (i10 >= c0251aArr4.length) {
                    return;
                }
                if (d <= c0251aArr4[i10].d) {
                    if (c0251aArr4[i10].f14535r) {
                        dArr[0] = c0251aArr4[i10].c(d);
                        dArr[1] = this.f14518b[i10].d(d);
                        return;
                    }
                    c0251aArr4[i10].g(d);
                    dArr[0] = this.f14518b[i10].e();
                    dArr[1] = this.f14518b[i10].f();
                    return;
                }
                i10++;
            }
        }
    }

    @Override // r.b
    public void d(double d, float[] fArr) {
        C0251a[] c0251aArr = this.f14518b;
        if (d < c0251aArr[0].f14522c) {
            double d10 = c0251aArr[0].f14522c;
            double d11 = d - c0251aArr[0].f14522c;
            if (c0251aArr[0].f14535r) {
                double c10 = c0251aArr[0].c(d10);
                C0251a[] c0251aArr2 = this.f14518b;
                fArr[0] = (float) ((c0251aArr2[0].f14530l * d11) + c10);
                fArr[1] = (float) ((d11 * this.f14518b[0].f14531m) + c0251aArr2[0].d(d10));
                return;
            }
            c0251aArr[0].g(d10);
            fArr[0] = (float) ((this.f14518b[0].a() * d11) + this.f14518b[0].e());
            fArr[1] = (float) ((this.f14518b[0].b() * d11) + this.f14518b[0].f());
        } else if (d > c0251aArr[c0251aArr.length - 1].d) {
            double d12 = c0251aArr[c0251aArr.length - 1].d;
            double d13 = d - d12;
            int length = c0251aArr.length - 1;
            if (!c0251aArr[length].f14535r) {
                c0251aArr[length].g(d);
                fArr[0] = (float) this.f14518b[length].e();
                fArr[1] = (float) this.f14518b[length].f();
                return;
            }
            double c11 = c0251aArr[length].c(d12);
            C0251a[] c0251aArr3 = this.f14518b;
            fArr[0] = (float) ((c0251aArr3[length].f14530l * d13) + c11);
            fArr[1] = (float) ((d13 * this.f14518b[length].f14531m) + c0251aArr3[length].d(d12));
        } else {
            int i10 = 0;
            while (true) {
                C0251a[] c0251aArr4 = this.f14518b;
                if (i10 >= c0251aArr4.length) {
                    return;
                }
                if (d <= c0251aArr4[i10].d) {
                    if (c0251aArr4[i10].f14535r) {
                        fArr[0] = (float) c0251aArr4[i10].c(d);
                        fArr[1] = (float) this.f14518b[i10].d(d);
                        return;
                    }
                    c0251aArr4[i10].g(d);
                    fArr[0] = (float) this.f14518b[i10].e();
                    fArr[1] = (float) this.f14518b[i10].f();
                    return;
                }
                i10++;
            }
        }
    }

    @Override // r.b
    public double e(double d, int i10) {
        C0251a[] c0251aArr = this.f14518b;
        int i11 = 0;
        if (d < c0251aArr[0].f14522c) {
            d = c0251aArr[0].f14522c;
        }
        if (d > c0251aArr[c0251aArr.length - 1].d) {
            d = c0251aArr[c0251aArr.length - 1].d;
        }
        while (true) {
            C0251a[] c0251aArr2 = this.f14518b;
            if (i11 >= c0251aArr2.length) {
                return Double.NaN;
            }
            if (d <= c0251aArr2[i11].d) {
                if (c0251aArr2[i11].f14535r) {
                    return i10 == 0 ? c0251aArr2[i11].f14530l : c0251aArr2[i11].f14531m;
                }
                c0251aArr2[i11].g(d);
                return i10 == 0 ? this.f14518b[i11].a() : this.f14518b[i11].b();
            }
            i11++;
        }
    }

    @Override // r.b
    public void f(double d, double[] dArr) {
        C0251a[] c0251aArr = this.f14518b;
        if (d < c0251aArr[0].f14522c) {
            d = c0251aArr[0].f14522c;
        } else if (d > c0251aArr[c0251aArr.length - 1].d) {
            d = c0251aArr[c0251aArr.length - 1].d;
        }
        int i10 = 0;
        while (true) {
            C0251a[] c0251aArr2 = this.f14518b;
            if (i10 >= c0251aArr2.length) {
                return;
            }
            if (d <= c0251aArr2[i10].d) {
                if (c0251aArr2[i10].f14535r) {
                    dArr[0] = c0251aArr2[i10].f14530l;
                    dArr[1] = c0251aArr2[i10].f14531m;
                    return;
                }
                c0251aArr2[i10].g(d);
                dArr[0] = this.f14518b[i10].a();
                dArr[1] = this.f14518b[i10].b();
                return;
            }
            i10++;
        }
    }

    @Override // r.b
    public double[] g() {
        return this.f14517a;
    }
}
