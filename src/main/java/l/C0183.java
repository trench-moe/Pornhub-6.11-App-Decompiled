package l;

import java.io.InputStream;

/* renamed from: l.۟ۨ۬  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0183 extends InputStream {

    /* renamed from: ۘ۠ۤ  reason: not valid java name and contains not printable characters */
    private long f19;

    /* renamed from: ۡۤ۠  reason: not valid java name and contains not printable characters */
    private long f20;

    /* renamed from: ۬۠ۚ  reason: not valid java name and contains not printable characters */
    private final InterfaceC0189 f21;

    public C0183(InterfaceC0189 interfaceC0189, long j10, long j11) {
        this.f21 = interfaceC0189;
        this.f19 = j11;
        this.f20 = j10;
    }

    @Override // java.io.InputStream
    public int available() {
        return (int) (this.f19 & 2147483647L);
    }

    @Override // java.io.InputStream
    public int read() {
        int mo1565;
        long j10 = this.f19;
        this.f19 = j10 - 1;
        if (j10 <= 0) {
            return -1;
        }
        synchronized (this.f21) {
            InterfaceC0189 interfaceC0189 = this.f21;
            long j11 = this.f20;
            this.f20 = 1 + j11;
            interfaceC0189.mo1574(j11);
            mo1565 = this.f21.mo1565();
        }
        return mo1565;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int mo1572;
        long j10 = this.f19;
        if (j10 <= 0) {
            return -1;
        }
        if (i11 <= 0) {
            return 0;
        }
        if (i11 > j10) {
            i11 = (int) j10;
        }
        synchronized (this.f21) {
            this.f21.mo1574(this.f20);
            mo1572 = this.f21.mo1572(bArr, i10, i11);
        }
        if (mo1572 > 0) {
            long j11 = mo1572;
            this.f20 += j11;
            this.f19 -= j11;
        }
        return mo1572;
    }
}
