package l;

/* renamed from: l.ۦ۟ۖ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0193 implements Cloneable {

    /* renamed from: ۨۥۤ  reason: not valid java name and contains not printable characters */
    private byte[] f90;

    /* renamed from: ۠ۘۙ  reason: not valid java name and contains not printable characters */
    public static C0193 m1603(int i10, byte[] bArr) {
        int i11 = 0;
        while (bArr.length - i11 >= 4) {
            int m1599 = C0191.m1599(bArr, i11);
            int m15992 = C0191.m1599(bArr, i11 + 2);
            int i12 = i11 + 4;
            if (m15992 < 0 || m15992 > bArr.length - i12) {
                break;
            } else if (m1599 == i10) {
                byte[] bArr2 = new byte[m15992];
                System.arraycopy(bArr, i12, bArr2, 0, m15992);
                C0193 c0193 = new C0193();
                c0193.m1605(bArr2);
                return c0193;
            } else {
                i11 = i12 + m15992;
            }
        }
        return null;
    }

    /* renamed from: ۖۘۢ  reason: not valid java name and contains not printable characters */
    public int m1604(int i10) {
        return C0191.m1595(this.f90, i10);
    }

    /* renamed from: ۙۚۧ  reason: not valid java name and contains not printable characters */
    public void m1605(byte[] bArr) {
        this.f90 = bArr;
    }

    /* renamed from: ۜ۟۟  reason: not valid java name and contains not printable characters */
    public byte[] m1606() {
        return this.f90;
    }

    /* renamed from: ۠ۘۦ  reason: not valid java name and contains not printable characters */
    public int m1607(int i10) {
        return C0191.m1600(this.f90, i10);
    }

    /* renamed from: ۬ۜۤ  reason: not valid java name and contains not printable characters */
    public C0193 clone() {
        return (C0193) super.clone();
    }
}
