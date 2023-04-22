package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class bx extends FilterInputStream {
    private short AFInAppEventParameterName;
    private byte[] AFInAppEventType;
    private final int AFKeystoreWrapper;
    private int AFLogger$LogLevel;
    private int AFVersionDeclaration;
    private int AppsFlyer2dXConversionCallback;
    private long[] valueOf;
    private long[] values;

    public bx(InputStream inputStream, int i10, int i11, short s10, int i12, int i13) {
        super(inputStream);
        this.AppsFlyer2dXConversionCallback = IntCompanionObject.MAX_VALUE;
        int min = Math.min(Math.max((int) s10, 4), 8);
        this.AFKeystoreWrapper = min;
        this.AFInAppEventType = new byte[min];
        this.values = new long[4];
        this.valueOf = new long[4];
        this.AFLogger$LogLevel = min;
        this.AFVersionDeclaration = min;
        this.values = cb.valueOf(i10 ^ i13, min ^ i13);
        this.valueOf = cb.valueOf(i11 ^ i13, i12 ^ i13);
    }

    private void valueOf() {
        byte[] bArr;
        long[] jArr = this.values;
        long[] jArr2 = this.valueOf;
        short s10 = this.AFInAppEventParameterName;
        int i10 = (s10 + 2) % 4;
        int i11 = (s10 + 3) % 4;
        jArr2[i11] = ((jArr[i11] * 2147483085) + jArr2[i10]) / 2147483647L;
        jArr[i11] = ((jArr[s10 % 4] * 2147483085) + jArr2[i10]) % 2147483647L;
        for (int i12 = 0; i12 < this.AFKeystoreWrapper; i12++) {
            this.AFInAppEventType[i12] = (byte) (bArr[i12] ^ ((this.values[this.AFInAppEventParameterName] >> (i12 << 3)) & 255));
        }
        this.AFInAppEventParameterName = (short) ((this.AFInAppEventParameterName + 1) % 4);
    }

    private int values() {
        int i10;
        if (this.AppsFlyer2dXConversionCallback == Integer.MAX_VALUE) {
            this.AppsFlyer2dXConversionCallback = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger$LogLevel == this.AFKeystoreWrapper) {
            byte[] bArr = this.AFInAppEventType;
            int i11 = this.AppsFlyer2dXConversionCallback;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.AFInAppEventType, i12, this.AFKeystoreWrapper - i12);
                if (read <= 0) {
                    break;
                }
                i12 += read;
            } while (i12 < this.AFKeystoreWrapper);
            if (i12 < this.AFKeystoreWrapper) {
                throw new IllegalStateException("unexpected block size");
            }
            valueOf();
            int read2 = ((FilterInputStream) this).in.read();
            this.AppsFlyer2dXConversionCallback = read2;
            this.AFLogger$LogLevel = 0;
            if (read2 < 0) {
                int i13 = this.AFKeystoreWrapper;
                i10 = i13 - (this.AFInAppEventType[i13 - 1] & UByte.MAX_VALUE);
            } else {
                i10 = this.AFKeystoreWrapper;
            }
            this.AFVersionDeclaration = i10;
        }
        return this.AFVersionDeclaration;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        values();
        return this.AFVersionDeclaration - this.AFLogger$LogLevel;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        values();
        int i10 = this.AFLogger$LogLevel;
        if (i10 >= this.AFVersionDeclaration) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventType;
        this.AFLogger$LogLevel = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            values();
            int i14 = this.AFLogger$LogLevel;
            if (i14 >= this.AFVersionDeclaration) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.AFInAppEventType;
            this.AFLogger$LogLevel = i14 + 1;
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
