package r;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public b f14544a;

    /* renamed from: b  reason: collision with root package name */
    public String f14545b;

    /* renamed from: c  reason: collision with root package name */
    public int f14546c = 0;
    public String d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f14547e = 0;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<c> f14548f = new ArrayList<>();

    /* loaded from: classes2.dex */
    public class a implements Comparator<c> {
        public a(d dVar) {
        }

        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.f14557a, cVar2.f14557a);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f14549a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f14550b;

        /* renamed from: c  reason: collision with root package name */
        public double[] f14551c;
        public float[] d;

        /* renamed from: e  reason: collision with root package name */
        public float[] f14552e;

        /* renamed from: f  reason: collision with root package name */
        public float[] f14553f;

        /* renamed from: g  reason: collision with root package name */
        public r.b f14554g;

        /* renamed from: h  reason: collision with root package name */
        public double[] f14555h;

        /* renamed from: i  reason: collision with root package name */
        public double[] f14556i;

        public b(int i10, String str, int i11, int i12) {
            long j10;
            g gVar = new g();
            this.f14549a = gVar;
            gVar.f14570e = i10;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int indexOf = str.indexOf(40) + 1;
                int indexOf2 = str.indexOf(44, indexOf);
                char c10 = 0;
                int i13 = 0;
                while (indexOf2 != -1) {
                    dArr[i13] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                    indexOf = indexOf2 + 1;
                    indexOf2 = str.indexOf(44, indexOf);
                    i13++;
                }
                dArr[i13] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
                double[] copyOf = Arrays.copyOf(dArr, i13 + 1);
                int length = (copyOf.length * 3) - 2;
                int length2 = copyOf.length - 1;
                double d = 1.0d / length2;
                double[][] dArr2 = (double[][]) Array.newInstance(double.class, length, 1);
                double[] dArr3 = new double[length];
                int i14 = 0;
                while (i14 < copyOf.length) {
                    double d10 = copyOf[i14];
                    int i15 = i14 + length2;
                    dArr2[i15][c10] = d10;
                    double d11 = i14 * d;
                    dArr3[i15] = d11;
                    if (i14 > 0) {
                        int i16 = (length2 * 2) + i14;
                        j10 = 4607182418800017408L;
                        dArr2[i16][0] = d10 + 1.0d;
                        dArr3[i16] = d11 + 1.0d;
                        int i17 = i14 - 1;
                        dArr2[i17][0] = (d10 - 1.0d) - d;
                        dArr3[i17] = (d11 - 1.0d) - d;
                    } else {
                        j10 = 4607182418800017408L;
                    }
                    i14++;
                    c10 = 0;
                }
                gVar.d = new f(dArr3, dArr2);
            }
            this.f14550b = new float[i12];
            this.f14551c = new double[i12];
            this.d = new float[i12];
            this.f14552e = new float[i12];
            this.f14553f = new float[i12];
            float[] fArr = new float[i12];
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f14557a;

        /* renamed from: b  reason: collision with root package name */
        public float f14558b;

        /* renamed from: c  reason: collision with root package name */
        public float f14559c;
        public float d;

        /* renamed from: e  reason: collision with root package name */
        public float f14560e;

        public c(int i10, float f10, float f11, float f12, float f13) {
            this.f14557a = i10;
            this.f14558b = f13;
            this.f14559c = f11;
            this.d = f10;
            this.f14560e = f12;
        }
    }

    public float a(float f10) {
        b bVar = this.f14544a;
        r.b bVar2 = bVar.f14554g;
        if (bVar2 != null) {
            bVar2.c(f10, bVar.f14555h);
        } else {
            double[] dArr = bVar.f14555h;
            dArr[0] = bVar.f14552e[0];
            dArr[1] = bVar.f14553f[0];
            dArr[2] = bVar.f14550b[0];
        }
        double[] dArr2 = bVar.f14555h;
        return (float) ((bVar.f14549a.c(f10, dArr2[1]) * bVar.f14555h[2]) + dArr2[0]);
    }

    public float b(float f10) {
        double d;
        double d10;
        double d11;
        double signum;
        b bVar = this.f14544a;
        r.b bVar2 = bVar.f14554g;
        if (bVar2 != null) {
            double d12 = f10;
            bVar2.f(d12, bVar.f14556i);
            bVar.f14554g.c(d12, bVar.f14555h);
        } else {
            double[] dArr = bVar.f14556i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d13 = f10;
        double c10 = bVar.f14549a.c(d13, bVar.f14555h[1]);
        g gVar = bVar.f14549a;
        double d14 = bVar.f14555h[1];
        double d15 = bVar.f14556i[1];
        double b10 = gVar.b(d13) + d14;
        if (d13 <= 0.0d) {
            d13 = 1.0E-5d;
        } else if (d13 >= 1.0d) {
            d13 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(gVar.f14568b, d13);
        if (binarySearch <= 0 && binarySearch != 0) {
            int i10 = (-binarySearch) - 1;
            float[] fArr = gVar.f14567a;
            int i11 = i10 - 1;
            double d16 = fArr[i10] - fArr[i11];
            double[] dArr2 = gVar.f14568b;
            double d17 = d16 / (dArr2[i10] - dArr2[i11]);
            d = (fArr[i11] - (d17 * dArr2[i11])) + (d13 * d17);
        } else {
            d = 0.0d;
        }
        double d18 = d + d15;
        switch (gVar.f14570e) {
            case 1:
                d10 = 0.0d;
                break;
            case 2:
                d11 = d18 * 4.0d;
                signum = Math.signum((((b10 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                d10 = d11 * signum;
                break;
            case 3:
                d10 = d18 * 2.0d;
                break;
            case 4:
                d10 = (-d18) * 2.0d;
                break;
            case 5:
                d11 = d18 * (-6.283185307179586d);
                signum = Math.sin(b10 * 6.283185307179586d);
                d10 = d11 * signum;
                break;
            case 6:
                d11 = d18 * 4.0d;
                signum = (((b10 * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                d10 = d11 * signum;
                break;
            case 7:
                d10 = gVar.d.e(b10 % 1.0d, 0);
                break;
            default:
                d11 = d18 * 6.283185307179586d;
                signum = Math.cos(b10 * 6.283185307179586d);
                d10 = d11 * signum;
                break;
        }
        double[] dArr3 = bVar.f14556i;
        return (float) ((d10 * bVar.f14555h[2]) + (c10 * dArr3[2]) + dArr3[0]);
    }

    public void c(Object obj) {
    }

    public void d(float f10) {
        float[] fArr;
        float[] fArr2;
        int i10;
        int size = this.f14548f.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f14548f, new a(this));
        double[] dArr = new double[size];
        char c10 = 2;
        char c11 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, 3);
        this.f14544a = new b(this.f14546c, this.d, this.f14547e, size);
        Iterator<c> it = this.f14548f.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            c next = it.next();
            float f11 = next.d;
            dArr[i11] = f11 * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f12 = next.f14558b;
            dArr3[c11] = f12;
            double[] dArr4 = dArr2[i11];
            float f13 = next.f14559c;
            dArr4[1] = f13;
            double[] dArr5 = dArr2[i11];
            float f14 = next.f14560e;
            Iterator<c> it2 = it;
            dArr5[c10] = f14;
            b bVar = this.f14544a;
            bVar.f14551c[i11] = next.f14557a / 100.0d;
            bVar.d[i11] = f11;
            bVar.f14552e[i11] = f13;
            bVar.f14553f[i11] = f14;
            bVar.f14550b[i11] = f12;
            i11++;
            dArr = dArr;
            it = it2;
            dArr2 = dArr2;
            c10 = 2;
            c11 = 0;
        }
        double[] dArr6 = dArr;
        double[][] dArr7 = dArr2;
        b bVar2 = this.f14544a;
        double[][] dArr8 = (double[][]) Array.newInstance(double.class, bVar2.f14551c.length, 3);
        float[] fArr3 = bVar2.f14550b;
        bVar2.f14555h = new double[fArr3.length + 2];
        bVar2.f14556i = new double[fArr3.length + 2];
        if (bVar2.f14551c[0] > 0.0d) {
            bVar2.f14549a.a(0.0d, bVar2.d[0]);
        }
        double[] dArr9 = bVar2.f14551c;
        int length = dArr9.length - 1;
        if (dArr9[length] < 1.0d) {
            bVar2.f14549a.a(1.0d, bVar2.d[length]);
        }
        for (int i12 = 0; i12 < dArr8.length; i12++) {
            dArr8[i12][0] = bVar2.f14552e[i12];
            dArr8[i12][1] = bVar2.f14553f[i12];
            dArr8[i12][2] = bVar2.f14550b[i12];
            bVar2.f14549a.a(bVar2.f14551c[i12], bVar2.d[i12]);
        }
        g gVar = bVar2.f14549a;
        double d = 0.0d;
        int i13 = 0;
        while (true) {
            if (i13 >= gVar.f14567a.length) {
                break;
            }
            d += fArr[i13];
            i13++;
        }
        double d10 = 0.0d;
        int i14 = 1;
        while (true) {
            float[] fArr4 = gVar.f14567a;
            if (i14 >= fArr4.length) {
                break;
            }
            int i15 = i14 - 1;
            float f15 = (fArr4[i15] + fArr4[i14]) / 2.0f;
            double[] dArr10 = gVar.f14568b;
            d10 = ((dArr10[i14] - dArr10[i15]) * f15) + d10;
            i14++;
        }
        int i16 = 0;
        while (true) {
            float[] fArr5 = gVar.f14567a;
            if (i16 >= fArr5.length) {
                break;
            }
            fArr5[i16] = (float) (fArr5[i16] * (d / d10));
            i16++;
        }
        gVar.f14569c[0] = 0.0d;
        int i17 = 1;
        while (true) {
            if (i17 >= gVar.f14567a.length) {
                break;
            }
            int i18 = i17 - 1;
            double[] dArr11 = gVar.f14568b;
            double d11 = dArr11[i17] - dArr11[i18];
            double[] dArr12 = gVar.f14569c;
            dArr12[i17] = (d11 * ((fArr2[i18] + fArr2[i17]) / 2.0f)) + dArr12[i18];
            i17++;
        }
        double[] dArr13 = bVar2.f14551c;
        if (dArr13.length > 1) {
            i10 = 0;
            bVar2.f14554g = r.b.a(0, dArr13, dArr8);
        } else {
            i10 = 0;
            bVar2.f14554g = null;
        }
        r.b.a(i10, dArr6, dArr7);
    }

    public String toString() {
        String str = this.f14545b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<c> it = this.f14548f.iterator();
        while (it.hasNext()) {
            c next = it.next();
            StringBuilder l10 = android.support.v4.media.a.l(str, "[");
            l10.append(next.f14557a);
            l10.append(" , ");
            l10.append(decimalFormat.format(next.f14558b));
            l10.append("] ");
            str = l10.toString();
        }
        return str;
    }
}
