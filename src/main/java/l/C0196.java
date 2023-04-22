package l;

import java.io.OutputStream;
import java.util.zip.CRC32;

/* renamed from: l.ۨۨۤ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0196 extends OutputStream {

    /* renamed from: ۢۨۧ  reason: not valid java name and contains not printable characters */
    private OutputStream f107;

    /* renamed from: ۡۢۤ  reason: not valid java name and contains not printable characters */
    private CRC32 f106 = new CRC32();

    /* renamed from: ۗۘۢ  reason: not valid java name and contains not printable characters */
    private int f105 = 0;

    public C0196(OutputStream outputStream) {
        this.f107 = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f107.close();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f107.write(i10);
        this.f106.update(i10);
        this.f105++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f107.write(bArr, i10, i11);
        this.f106.update(bArr, i10, i11);
        this.f105 += i11;
    }

    /* renamed from: ۗۤۛ  reason: not valid java name and contains not printable characters */
    public int m1615() {
        return (int) this.f106.getValue();
    }

    /* renamed from: ۜۛۘ  reason: not valid java name and contains not printable characters */
    public int m1616() {
        return this.f105;
    }
}
