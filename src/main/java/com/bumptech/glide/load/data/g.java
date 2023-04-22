package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f5694j = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: m  reason: collision with root package name */
    public static final int f5695m = 31;

    /* renamed from: c  reason: collision with root package name */
    public final byte f5696c;

    /* renamed from: f  reason: collision with root package name */
    public int f5697f;

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(a1.a.j("Cannot add invalid orientation: ", i10));
        }
        this.f5696c = (byte) i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10;
        int i11 = this.f5697f;
        int read = (i11 < 2 || i11 > (i10 = f5695m)) ? super.read() : i11 == i10 ? this.f5696c : f5694j[i11 - 2] & UByte.MAX_VALUE;
        if (read != -1) {
            this.f5697f++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f5697f;
        int i14 = f5695m;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f5696c;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f5694j, this.f5697f - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f5697f += i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f5697f = (int) (this.f5697f + skip);
        }
        return skip;
    }
}
