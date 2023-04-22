package l;

import java.io.OutputStream;

/* renamed from: l.۫ۧۗ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0197 extends OutputStream {

    /* renamed from: ۦ۟ۨ  reason: contains not printable characters */
    private int f108 = 0;

    /* renamed from: ۨۙۢ  reason: not valid java name and contains not printable characters */
    private final InterfaceC0189 f109;

    public C0197(InterfaceC0189 interfaceC0189) {
        this.f109 = interfaceC0189;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f109.mo1568(i10);
        this.f108++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        if (i11 > 0) {
            this.f109.mo1571(bArr, i10, i11);
            this.f108 += i11;
        }
    }

    /* renamed from: ۡ۟ۛ  reason: not valid java name and contains not printable characters */
    public int m1617() {
        return this.f108;
    }
}
