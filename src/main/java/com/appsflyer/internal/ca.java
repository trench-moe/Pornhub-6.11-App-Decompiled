package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class ca extends FilterInputStream {
    private static final short valueOf = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private byte[] AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private byte[] AFKeystoreWrapper;
    private int AFLogger$LogLevel;
    private int AFVersionDeclaration;
    private int AppsFlyer2dXConversionCallback;
    private int getLevel;
    private int init;
    private int onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private int onInstallConversionFailureNative;
    private int values;

    public ca(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) {
        super(inputStream);
        this.getLevel = IntCompanionObject.MAX_VALUE;
        this.AFInAppEventParameterName = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.AFInAppEventType = new byte[8];
        this.values = 8;
        this.AFVersionDeclaration = 8;
        this.AppsFlyer2dXConversionCallback = Math.min(Math.max(i11, 5), 16);
        this.init = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, 8);
        }
        long j10 = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i10 != 0) {
            int i13 = (int) j10;
            this.AFLogger$LogLevel = i13;
            this.onAppOpenAttributionNative = i13 * i10;
            this.onInstallConversionFailureNative = i13 ^ i10;
            this.onAttributionFailureNative = (int) (j10 >> 32);
            return;
        }
        this.AFLogger$LogLevel = (int) j10;
        long j11 = j10 >> 3;
        short s10 = valueOf;
        this.onAppOpenAttributionNative = (int) ((s10 * j11) >> 32);
        this.onInstallConversionFailureNative = (int) (j10 >> 32);
        this.onAttributionFailureNative = (int) (j11 + s10);
    }

    private void valueOf() {
        if (this.init == 3) {
            byte[] bArr = this.AFInAppEventParameterName;
            System.arraycopy(bArr, 0, this.AFInAppEventType, 0, bArr.length);
        }
        byte[] bArr2 = this.AFInAppEventParameterName;
        int i10 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & UByte.MAX_VALUE);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UByte.MAX_VALUE);
        int i12 = 0;
        while (true) {
            int i13 = this.AppsFlyer2dXConversionCallback;
            if (i12 >= i13) {
                break;
            }
            short s10 = valueOf;
            i11 -= ((((i13 - i12) * s10) + i10) ^ ((i10 << 4) + this.onInstallConversionFailureNative)) ^ ((i10 >>> 5) + this.onAttributionFailureNative);
            i10 -= (((i11 << 4) + this.AFLogger$LogLevel) ^ (((i13 - i12) * s10) + i11)) ^ ((i11 >>> 5) + this.onAppOpenAttributionNative);
            i12++;
        }
        byte[] bArr3 = this.AFInAppEventParameterName;
        bArr3[0] = (byte) (i10 >> 24);
        bArr3[1] = (byte) (i10 >> 16);
        bArr3[2] = (byte) (i10 >> 8);
        bArr3[3] = (byte) i10;
        bArr3[4] = (byte) (i11 >> 24);
        bArr3[5] = (byte) (i11 >> 16);
        bArr3[6] = (byte) (i11 >> 8);
        bArr3[7] = (byte) i11;
        if (this.init == 3) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.AFInAppEventParameterName;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.AFKeystoreWrapper[i14]);
            }
            byte[] bArr5 = this.AFInAppEventType;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private int values() {
        /*
            r10 = this;
            r7 = r10
            int r0 = r7.getLevel
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L15
            r9 = 3
            java.io.InputStream r0 = r7.in
            int r9 = r0.read()
            r0 = r9
            r7.getLevel = r0
            r9 = 1
        L15:
            int r0 = r7.values
            r1 = 8
            if (r0 != r1) goto L75
            r9 = 4
            byte[] r0 = r7.AFInAppEventParameterName
            r9 = 3
            int r2 = r7.getLevel
            byte r3 = (byte) r2
            r9 = 0
            r4 = r9
            r0[r4] = r3
            java.lang.String r9 = "unexpected block size"
            r0 = r9
            if (r2 < 0) goto L6c
            r9 = 3
            r2 = 1
            r9 = 2
        L2e:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.AFInAppEventParameterName
            r9 = 1
            int r6 = 8 - r2
            r9 = 6
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L40
            r9 = 6
            int r2 = r2 + r3
            if (r2 < r1) goto L2e
        L40:
            r9 = 3
            if (r2 < r1) goto L64
            r9 = 4
            r7.valueOf()
            r9 = 3
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.getLevel = r0
            r7.values = r4
            if (r0 >= 0) goto L5f
            r9 = 1
            byte[] r0 = r7.AFInAppEventParameterName
            r2 = 7
            r0 = r0[r2]
            r9 = 5
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
            r9 = 6
        L5f:
            r9 = 2
            r7.AFVersionDeclaration = r1
            r9 = 4
            goto L75
        L64:
            r9 = 3
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
            r9 = 2
        L6c:
            r9 = 1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r9 = 7
            throw r1
            r9 = 7
        L75:
            int r0 = r7.AFVersionDeclaration
            r9 = 7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ca.values():int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        values();
        return this.AFVersionDeclaration - this.values;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        values();
        int i10 = this.values;
        if (i10 >= this.AFVersionDeclaration) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventParameterName;
        this.values = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            values();
            int i14 = this.values;
            if (i14 >= this.AFVersionDeclaration) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.AFInAppEventParameterName;
            this.values = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }
}
