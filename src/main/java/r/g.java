package r;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public float[] f14567a = new float[0];

    /* renamed from: b  reason: collision with root package name */
    public double[] f14568b = new double[0];

    /* renamed from: c  reason: collision with root package name */
    public double[] f14569c;
    public f d;

    /* renamed from: e  reason: collision with root package name */
    public int f14570e;

    public void a(double d, float f10) {
        int length = this.f14567a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f14568b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f14568b = Arrays.copyOf(this.f14568b, length);
        this.f14567a = Arrays.copyOf(this.f14567a, length);
        this.f14569c = new double[length];
        double[] dArr = this.f14568b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f14568b[binarySearch] = d;
        this.f14567a[binarySearch] = f10;
    }

    public double b(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f14568b, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch != 0) {
            int i10 = (-binarySearch) - 1;
            float[] fArr = this.f14567a;
            int i11 = i10 - 1;
            double d10 = fArr[i10] - fArr[i11];
            double[] dArr = this.f14568b;
            double d11 = d10 / (dArr[i10] - dArr[i11]);
            return ((((d * d) - (dArr[i11] * dArr[i11])) * d11) / 2.0d) + ((d - dArr[i11]) * (fArr[i11] - (dArr[i11] * d11))) + this.f14569c[i11];
        }
        return 0.0d;
    }

    public double c(double d, double d10) {
        double abs;
        double b10 = b(d) + d10;
        switch (this.f14570e) {
            case 1:
                return Math.signum(0.5d - (b10 % 1.0d));
            case 2:
                abs = Math.abs((((b10 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b10 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((b10 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d10 + b10) * 6.283185307179586d);
            case 6:
                double abs2 = 1.0d - Math.abs(((b10 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.d.b(b10 % 1.0d, 0);
            default:
                return Math.sin(6.283185307179586d * b10);
        }
        return 1.0d - abs;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("pos =");
        m10.append(Arrays.toString(this.f14568b));
        m10.append(" period=");
        m10.append(Arrays.toString(this.f14567a));
        return m10.toString();
    }
}
