package com.google.android.gms.internal.measurement;

import t9.k0;
import w9.a5;
import w9.v7;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public static final k0 f6998a;

    static {
        if (v7.f17350e && v7.d) {
            int i10 = a5.f17066a;
        }
        f6998a = new k0(0);
    }

    public static /* synthetic */ int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12) {
                    if (b11 <= -65) {
                        return b10 ^ (b11 << 8);
                    }
                }
            } else if (i12 != 2) {
                throw new AssertionError();
            } else {
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65) {
                    if (b13 <= -65) {
                        return ((b12 << 8) ^ b10) ^ (b13 << 16);
                    }
                }
            }
            return -1;
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r10, byte[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h.b(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new zzmp(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean d(byte[] bArr, int i10, int i11) {
        return f6998a.A(bArr, i10, i11);
    }
}
