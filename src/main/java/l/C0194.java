package l;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: l.ۦ۬ۧ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0194 implements InterfaceC0181 {

    /* renamed from: ۦۤۚ  reason: contains not printable characters */
    private final RandomAccessFile f91;

    public C0194(File file, String str) {
        this.f91 = new RandomAccessFile(file, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f91.close();
    }

    @Override // l.InterfaceC0181
    /* renamed from: ۗۡۨ */
    public int mo1462(byte[] bArr, int i10, int i11) {
        return this.f91.read(bArr, i10, i11);
    }

    @Override // l.InterfaceC0181
    /* renamed from: ۜۖ۠ */
    public void mo1463(byte[] bArr, int i10, int i11) {
        this.f91.write(bArr, i10, i11);
    }

    @Override // l.InterfaceC0181
    /* renamed from: ۟۫ۗ */
    public long mo1464() {
        return this.f91.length();
    }

    @Override // l.InterfaceC0181
    /* renamed from: ۢۚ۟ */
    public void mo1465(long j10) {
        this.f91.seek(j10);
    }
}
