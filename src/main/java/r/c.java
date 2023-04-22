package r;

import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static c f14538b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static String[] f14539c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a  reason: collision with root package name */
    public String f14540a = "identity";

    /* loaded from: classes2.dex */
    public static class a extends c {
        public double d;

        /* renamed from: e  reason: collision with root package name */
        public double f14541e;

        /* renamed from: f  reason: collision with root package name */
        public double f14542f;

        /* renamed from: g  reason: collision with root package name */
        public double f14543g;

        public a(String str) {
            this.f14540a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i10 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i10);
            this.f14541e = Double.parseDouble(str.substring(i10, indexOf3).trim());
            int i11 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i11);
            this.f14542f = Double.parseDouble(str.substring(i11, indexOf4).trim());
            int i12 = indexOf4 + 1;
            this.f14543g = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
        }

        @Override // r.c
        public double a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d10 = 0.5d;
            double d11 = 0.5d;
            while (d10 > 0.01d) {
                d10 *= 0.5d;
                d11 = d(d11) < d ? d11 + d10 : d11 - d10;
            }
            double d12 = d11 - d10;
            double d13 = d(d12);
            double d14 = d11 + d10;
            double d15 = d(d14);
            double e10 = e(d12);
            return (((d - d13) * (e(d14) - e10)) / (d15 - d13)) + e10;
        }

        @Override // r.c
        public double b(double d) {
            double d10 = 0.5d;
            double d11 = 0.5d;
            while (d10 > 1.0E-4d) {
                d10 *= 0.5d;
                d11 = d(d11) < d ? d11 + d10 : d11 - d10;
            }
            double d12 = d11 - d10;
            double d13 = d11 + d10;
            return (e(d13) - e(d12)) / (d(d13) - d(d12));
        }

        public final double d(double d) {
            double d10 = 1.0d - d;
            double d11 = 3.0d * d10;
            double d12 = d10 * d11 * d;
            double d13 = d11 * d * d;
            return (this.f14542f * d13) + (this.d * d12) + (d * d * d);
        }

        public final double e(double d) {
            double d10 = 1.0d - d;
            double d11 = 3.0d * d10;
            double d12 = d10 * d11 * d;
            double d13 = d11 * d * d;
            return (this.f14543g * d13) + (this.f14541e * d12) + (d * d * d);
        }
    }

    public static c c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new k(str);
        }
        if (str.startsWith("Schlick")) {
            return new h(str);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (!str.equals("decelerate")) {
                    break;
                } else {
                    c10 = 1;
                    break;
                }
            case -1197605014:
                if (str.equals("anticipate")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c10 = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new a("cubic(1, 1, 0, 0)");
            case 4:
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                StringBuilder m10 = a1.a.m("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                m10.append(Arrays.toString(f14539c));
                printStream.println(m10.toString());
                return f14538b;
        }
    }

    public double a(double d) {
        return d;
    }

    public double b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f14540a;
    }
}
