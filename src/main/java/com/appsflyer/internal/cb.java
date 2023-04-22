package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class cb {
    public static long[] valueOf(int i10, int i11) {
        long[] jArr = new long[4];
        jArr[0] = (i11 & 4294967295L) | ((i10 & 4294967295L) << 32);
        for (int i12 = 1; i12 < 4; i12++) {
            long j10 = jArr[i12 - 1];
            jArr[i12] = ((j10 ^ (j10 >> 30)) * 1812433253) + i12;
        }
        return jArr;
    }
}
