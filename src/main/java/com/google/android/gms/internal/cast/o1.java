package com.google.android.gms.internal.cast;

import t9.o3;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public static final o9.b f6907a;

    static {
        if (o3.f15314e && o3.d) {
            int i10 = t9.y0.f15369a;
        }
        f6907a = new o9.b();
    }

    public static /* synthetic */ int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else if (i12 != 2) {
                throw new AssertionError();
            } else {
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static int b(java.lang.CharSequence r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.o1.b(java.lang.CharSequence, byte[], int, int):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static int c(java.lang.CharSequence r10) {
        /*
            int r0 = r10.length()
            r8 = 0
            r1 = r8
            r8 = 0
            r2 = r8
        L8:
            if (r2 >= r0) goto L18
            char r3 = r10.charAt(r2)
            r8 = 128(0x80, float:1.8E-43)
            r4 = r8
            if (r3 >= r4) goto L18
            r9 = 3
            int r2 = r2 + 1
            r9 = 7
            goto L8
        L18:
            r3 = r0
        L19:
            if (r2 >= r0) goto L6f
            char r4 = r10.charAt(r2)
            r5 = 2048(0x800, float:2.87E-42)
            r9 = 2
            if (r4 >= r5) goto L2e
            int r4 = 127 - r4
            r9 = 2
            int r4 = r4 >>> 31
            r9 = 3
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L19
        L2e:
            int r8 = r10.length()
            r4 = r8
        L33:
            if (r2 >= r4) goto L6e
            char r6 = r10.charAt(r2)
            if (r6 >= r5) goto L44
            r9 = 6
            int r6 = 127 - r6
            r9 = 1
            int r6 = r6 >>> 31
            r9 = 7
            int r1 = r1 + r6
            goto L6a
        L44:
            int r1 = r1 + 2
            r9 = 2
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r7) goto L6a
            r7 = 57343(0xdfff, float:8.0355E-41)
            r9 = 3
            if (r6 > r7) goto L6a
            r9 = 1
            int r6 = java.lang.Character.codePointAt(r10, r2)
            r8 = 65536(0x10000, float:9.1835E-41)
            r7 = r8
            if (r6 < r7) goto L61
            r9 = 3
            int r2 = r2 + 1
            r9 = 7
            goto L6a
        L61:
            r9 = 5
            com.google.android.gms.internal.cast.zzrq r10 = new com.google.android.gms.internal.cast.zzrq
            r10.<init>(r2, r4)
            r9 = 1
            throw r10
            r9 = 6
        L6a:
            int r2 = r2 + 1
            r9 = 5
            goto L33
        L6e:
            int r3 = r3 + r1
        L6f:
            r9 = 1
            if (r3 < r0) goto L74
            r9 = 2
            return r3
        L74:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r9 = 7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 54
            r0.<init>(r1)
            java.lang.String r8 = "UTF-8 length does not fit in int: "
            r1 = r8
            r0.append(r1)
            long r1 = (long) r3
            r9 = 4
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            r9 = 1
            r0.append(r1)
            java.lang.String r8 = r0.toString()
            r0 = r8
            r10.<init>(r0)
            throw r10
            r9 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.o1.c(java.lang.CharSequence):int");
    }
}
