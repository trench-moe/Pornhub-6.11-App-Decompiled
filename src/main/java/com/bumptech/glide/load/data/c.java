package com.bumptech.glide.load.data;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: c  reason: collision with root package name */
    public final OutputStream f5687c;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f5688f;

    /* renamed from: j  reason: collision with root package name */
    public k5.b f5689j;

    /* renamed from: m  reason: collision with root package name */
    public int f5690m;

    public c(OutputStream outputStream, k5.b bVar) {
        this.f5687c = outputStream;
        this.f5689j = bVar;
        this.f5688f = (byte[]) bVar.e(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f5687c.close();
            byte[] bArr = this.f5688f;
            if (bArr != null) {
                this.f5689j.d(bArr);
                this.f5688f = null;
            }
        } catch (Throwable th) {
            this.f5687c.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        int i10 = this.f5690m;
        if (i10 > 0) {
            this.f5687c.write(this.f5688f, 0, i10);
            this.f5690m = 0;
        }
        this.f5687c.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f5688f;
        int i11 = this.f5690m;
        int i12 = i11 + 1;
        this.f5690m = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f5687c.write(bArr, 0, i12);
        this.f5690m = 0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f5690m;
            if (i15 == 0 && i13 >= this.f5688f.length) {
                this.f5687c.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f5688f.length - i15);
            System.arraycopy(bArr, i14, this.f5688f, this.f5690m, min);
            int i16 = this.f5690m + min;
            this.f5690m = i16;
            i12 += min;
            byte[] bArr2 = this.f5688f;
            if (i16 == bArr2.length && i16 > 0) {
                this.f5687c.write(bArr2, 0, i16);
                this.f5690m = 0;
            }
        } while (i12 < i11);
    }
}
