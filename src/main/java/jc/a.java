package jc;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class a extends OutputStream {

    /* renamed from: c  reason: collision with root package name */
    public long f11671c = 0;

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f11671c++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f11671c += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f11671c += i11;
    }
}
