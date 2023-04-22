package r;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class k extends c {
    public f d;

    public k(String str) {
        this.f14540a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i10 = 0;
        while (indexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        double[] copyOf = Arrays.copyOf(dArr, i10 + 1);
        int length = (copyOf.length * 3) - 2;
        int length2 = copyOf.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, length, 1);
        double[] dArr3 = new double[length];
        for (int i11 = 0; i11 < copyOf.length; i11++) {
            double d10 = copyOf[i11];
            int i12 = i11 + length2;
            dArr2[i12][0] = d10;
            double d11 = i11 * d;
            dArr3[i12] = d11;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr2[i13][0] = d10 + 1.0d;
                dArr3[i13] = d11 + 1.0d;
                int i14 = i11 - 1;
                dArr2[i14][0] = (d10 - 1.0d) - d;
                dArr3[i14] = (d11 - 1.0d) - d;
            }
        }
        f fVar = new f(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder m10 = a1.a.m(" 0 ");
        m10.append(fVar.b(0.0d, 0));
        printStream.println(m10.toString());
        PrintStream printStream2 = System.out;
        StringBuilder m11 = a1.a.m(" 1 ");
        m11.append(fVar.b(1.0d, 0));
        printStream2.println(m11.toString());
        this.d = fVar;
    }

    @Override // r.c
    public double a(double d) {
        return this.d.b(d, 0);
    }

    @Override // r.c
    public double b(double d) {
        return this.d.e(d, 0);
    }
}
