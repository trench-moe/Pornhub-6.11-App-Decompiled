package org.bson.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class Decimal128 extends Number implements Comparable<Decimal128> {
    private static final long serialVersionUID = 4570973266503637887L;
    private final long high;
    private final long low;

    static {
        new BigInteger("10");
        new BigInteger("1");
        new BigInteger("0");
        new HashSet(Collections.singletonList("nan"));
        new HashSet(Collections.singletonList("-nan"));
        new HashSet(Arrays.asList("inf", "+inf", "infinity", "+infinity"));
        new HashSet(Arrays.asList("-inf", "-infinity"));
        fromIEEE754BIDEncoding(8646911284551352320L, 0L);
        fromIEEE754BIDEncoding(-576460752303423488L, 0L);
        fromIEEE754BIDEncoding(-288230376151711744L, 0L);
        fromIEEE754BIDEncoding(8935141660703064064L, 0L);
        fromIEEE754BIDEncoding(3476778912330022912L, 0L);
        fromIEEE754BIDEncoding(-5746593124524752896L, 0L);
    }

    public Decimal128(long j10, long j11) {
        this.high = j10;
        this.low = j11;
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j10, long j11) {
        return new Decimal128(j10, j11);
    }

    public final BigDecimal b() {
        long j10;
        char c10;
        long j11 = this.high;
        int i10 = ((j11 & 6917529027641081856L) > 6917529027641081856L ? 1 : ((j11 & 6917529027641081856L) == 6917529027641081856L ? 0 : -1));
        if (i10 == 0) {
            j10 = j11 & 2305807824841605120L;
            c10 = '/';
        } else {
            j10 = j11 & 9223231299366420480L;
            c10 = '1';
        }
        int i11 = -(((int) (j10 >>> c10)) - 6176);
        if (i10 == 0) {
            return BigDecimal.valueOf(0L, i11);
        }
        int i12 = f() ? -1 : 1;
        byte[] bArr = new byte[15];
        long j12 = 255;
        for (int i13 = 14; i13 >= 7; i13--) {
            bArr[i13] = (byte) ((this.low & j12) >>> ((14 - i13) << 3));
            j12 <<= 8;
        }
        long j13 = 255;
        for (int i14 = 6; i14 >= 1; i14--) {
            bArr[i14] = (byte) ((this.high & j13) >>> ((6 - i14) << 3));
            j13 <<= 8;
        }
        bArr[0] = (byte) ((281474976710656L & this.high) >>> 48);
        return new BigDecimal(new BigInteger(i12, bArr), i11);
    }

    public final boolean c(BigDecimal bigDecimal) {
        return f() && bigDecimal.signum() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[RETURN, SYNTHETIC] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(org.bson.types.Decimal128 r7) {
        /*
            r6 = this;
            org.bson.types.Decimal128 r7 = (org.bson.types.Decimal128) r7
            boolean r0 = r6.e()
            r1 = 1
            if (r0 == 0) goto L10
            boolean r7 = r7.e()
            r1 = r1 ^ r7
            goto L81
        L10:
            boolean r0 = r6.d()
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L40
            boolean r0 = r6.f()
            if (r0 == 0) goto L2c
            boolean r0 = r7.d()
            if (r0 == 0) goto L6e
            boolean r7 = r7.f()
            if (r7 == 0) goto L6e
        L2a:
            r1 = 0
            goto L81
        L2c:
            boolean r0 = r7.e()
            if (r0 == 0) goto L33
            goto L6e
        L33:
            boolean r0 = r7.d()
            if (r0 == 0) goto L81
            boolean r7 = r7.f()
            if (r7 != 0) goto L81
            goto L2a
        L40:
            java.math.BigDecimal r0 = r6.b()
            java.math.BigDecimal r4 = r7.b()
            boolean r5 = r6.g(r0)
            if (r5 == 0) goto L68
            boolean r5 = r7.g(r4)
            if (r5 == 0) goto L68
            boolean r5 = r6.c(r0)
            if (r5 == 0) goto L61
            boolean r7 = r7.c(r4)
            if (r7 == 0) goto L6e
            goto L2a
        L61:
            boolean r2 = r7.c(r4)
            if (r2 == 0) goto L68
            goto L81
        L68:
            boolean r2 = r7.e()
            if (r2 == 0) goto L70
        L6e:
            r1 = -1
            goto L81
        L70:
            boolean r2 = r7.d()
            if (r2 == 0) goto L7d
            boolean r7 = r7.f()
            if (r7 == 0) goto L6e
            goto L81
        L7d:
            int r1 = r0.compareTo(r4)
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.types.Decimal128.compareTo(java.lang.Object):int");
    }

    public boolean d() {
        return (this.high & 8646911284551352320L) == 8646911284551352320L;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        if (e()) {
            return Double.NaN;
        }
        if (d()) {
            return f() ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        BigDecimal b10 = b();
        if (c(b10)) {
            return -0.0d;
        }
        return b10.doubleValue();
    }

    public boolean e() {
        return (this.high & 8935141660703064064L) == 8935141660703064064L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Decimal128.class != obj.getClass()) {
            return false;
        }
        Decimal128 decimal128 = (Decimal128) obj;
        return this.high == decimal128.high && this.low == decimal128.low;
    }

    public boolean f() {
        return (this.high & Long.MIN_VALUE) == Long.MIN_VALUE;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public final boolean g(BigDecimal bigDecimal) {
        return (e() || d() || bigDecimal.compareTo(BigDecimal.ZERO) != 0) ? false : true;
    }

    public int hashCode() {
        long j10 = this.low;
        long j11 = this.high;
        return (((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) doubleValue();
    }

    public String toString() {
        if (e()) {
            return "NaN";
        }
        if (d()) {
            return f() ? "-Infinity" : "Infinity";
        }
        StringBuilder sb2 = new StringBuilder();
        BigDecimal b10 = b();
        String bigInteger = b10.unscaledValue().abs().toString();
        if (f()) {
            sb2.append('-');
        }
        int i10 = -b10.scale();
        int length = (bigInteger.length() - 1) + i10;
        if (i10 > 0 || length < -6) {
            sb2.append(bigInteger.charAt(0));
            if (bigInteger.length() > 1) {
                sb2.append('.');
                sb2.append((CharSequence) bigInteger, 1, bigInteger.length());
            }
            sb2.append('E');
            if (length > 0) {
                sb2.append('+');
            }
            sb2.append(length);
        } else if (i10 == 0) {
            sb2.append(bigInteger);
        } else {
            int length2 = (-i10) - bigInteger.length();
            if (length2 >= 0) {
                sb2.append('0');
                sb2.append('.');
                for (int i11 = 0; i11 < length2; i11++) {
                    sb2.append('0');
                }
                sb2.append((CharSequence) bigInteger, 0, bigInteger.length());
            } else {
                int i12 = -length2;
                sb2.append((CharSequence) bigInteger, 0, i12);
                sb2.append('.');
                sb2.append((CharSequence) bigInteger, i12, i12 - i10);
            }
        }
        return sb2.toString();
    }
}
