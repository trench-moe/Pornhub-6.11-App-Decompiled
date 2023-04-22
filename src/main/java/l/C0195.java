package l;

import java.io.EOFException;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: l.ۧۖۢ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public final class C0195 implements InterfaceC0189 {

    /* renamed from: ۗۦۚ  reason: not valid java name and contains not printable characters */
    private static final long f92 = -65536;

    /* renamed from: ۟ۗ۠  reason: not valid java name and contains not printable characters */
    private static final int f93 = 65536;

    /* renamed from: ۟ۜۛ  reason: not valid java name and contains not printable characters */
    private static final int f94 = 16;

    /* renamed from: ۗۡۢ  reason: not valid java name and contains not printable characters */
    private InterfaceC0181 f95;

    /* renamed from: ۘ۠ۗ  reason: not valid java name and contains not printable characters */
    private boolean f96;

    /* renamed from: ۙ۬۫  reason: not valid java name and contains not printable characters */
    private boolean f97;

    /* renamed from: ۚۘۤ  reason: not valid java name and contains not printable characters */
    private byte[] f98;

    /* renamed from: ۛۢۚ  reason: not valid java name and contains not printable characters */
    private long f99;

    /* renamed from: ۠ۧۛ  reason: not valid java name and contains not printable characters */
    private long f100;

    /* renamed from: ۢ۬ۛ  reason: not valid java name and contains not printable characters */
    private long f101;

    /* renamed from: ۤ۟۠  reason: not valid java name and contains not printable characters */
    private long f102;

    /* renamed from: ۥۖۨ  reason: contains not printable characters */
    private long f103;

    /* renamed from: ۬ۛۡ  reason: not valid java name and contains not printable characters */
    private boolean f104;

    public C0195(InterfaceC0181 interfaceC0181) {
        this.f95 = interfaceC0181;
        m1612();
    }

    /* renamed from: ۖ۠ۙ  reason: not valid java name and contains not printable characters */
    private int m1609(byte[] bArr, int i10, int i11) {
        long j10 = this.f99;
        long j11 = this.f103;
        if (j10 >= j11) {
            if (this.f96) {
                long j12 = this.f102;
                if (j11 < j12) {
                    this.f103 = j12;
                }
            }
            mo1574(this.f99);
            if (this.f99 == this.f103) {
                this.f103 = this.f102;
            }
        }
        int min = Math.min(i11, (int) (this.f103 - this.f99));
        System.arraycopy(bArr, i10, this.f98, (int) (this.f99 - this.f101), min);
        this.f99 += min;
        return min;
    }

    /* renamed from: ۛۜۤ  reason: not valid java name and contains not printable characters */
    private int m1610() {
        int length = this.f98.length;
        int i10 = 0;
        while (length > 0) {
            int mo1462 = this.f95.mo1462(this.f98, i10, length);
            if (mo1462 < 0) {
                break;
            }
            i10 += mo1462;
            length -= mo1462;
        }
        boolean z10 = i10 < this.f98.length;
        this.f96 = z10;
        if (z10) {
            byte[] bArr = this.f98;
            Arrays.fill(bArr, i10, bArr.length, (byte) -1);
        }
        this.f100 += i10;
        return i10;
    }

    /* renamed from: ۛۡۚ  reason: not valid java name and contains not printable characters */
    private void m1611() {
        if (this.f97) {
            long j10 = this.f100;
            long j11 = this.f101;
            if (j10 != j11) {
                this.f95.mo1465(j11);
            }
            this.f95.mo1463(this.f98, 0, (int) (this.f99 - this.f101));
            this.f100 = this.f99;
            this.f97 = false;
        }
    }

    /* renamed from: ۜۡۘ  reason: not valid java name and contains not printable characters */
    private void m1612() {
        this.f104 = false;
        this.f97 = false;
        this.f103 = 0L;
        this.f99 = 0L;
        this.f101 = 0L;
        this.f98 = new byte[f93];
        this.f102 = 65536L;
        this.f96 = false;
        this.f100 = 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m1613();
        this.f104 = true;
        this.f95.close();
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۖۧۘ */
    public int mo1565() {
        long j10 = this.f99;
        if (j10 >= this.f103) {
            if (this.f96) {
                return -1;
            }
            mo1574(j10);
            if (this.f99 == this.f103) {
                return -1;
            }
        }
        byte[] bArr = this.f98;
        long j11 = this.f99;
        byte b10 = bArr[(int) (j11 - this.f101)];
        this.f99 = j11 + 1;
        return b10 & UByte.MAX_VALUE;
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۖۨۦ */
    public void mo1566(byte[] bArr) {
        m1614(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۖ۫۟ */
    public void mo1567(byte[] bArr) {
        mo1571(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۖ۫ۨ */
    public void mo1568(int i10) {
        long j10 = this.f99;
        long j11 = this.f103;
        if (j10 >= j11) {
            if (!this.f96 || j11 >= this.f102) {
                mo1574(this.f99);
                long j12 = this.f99;
                long j13 = this.f103;
                if (j12 == j13) {
                    this.f103 = j13 + 1;
                }
            } else {
                this.f103 = j11 + 1;
            }
        }
        byte[] bArr = this.f98;
        long j14 = this.f99;
        bArr[(int) (j14 - this.f101)] = (byte) i10;
        this.f99 = j14 + 1;
        this.f97 = true;
    }

    /* renamed from: ۗ۫ۧ  reason: not valid java name and contains not printable characters */
    public void m1613() {
        m1611();
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۙ۬ۢ */
    public boolean mo1569() {
        return this.f104;
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۠ۖۧ */
    public long mo1570() {
        return this.f99;
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۠ۚۗ */
    public void mo1571(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int m1609 = m1609(bArr, i10, i11);
            i10 += m1609;
            i11 -= m1609;
            this.f97 = true;
        }
    }

    /* renamed from: ۥۡۧ  reason: contains not printable characters */
    public void m1614(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int mo1572 = mo1572(bArr, i10 + i12, i11 - i12);
            if (mo1572 < 0) {
                throw new EOFException();
            }
            i12 += mo1572;
        } while (i12 < i11);
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۦ۬ۖ */
    public int mo1572(byte[] bArr, int i10, int i11) {
        long j10 = this.f99;
        if (j10 >= this.f103) {
            if (this.f96) {
                return -1;
            }
            mo1574(j10);
            if (this.f99 == this.f103) {
                return -1;
            }
        }
        int min = Math.min(i11, (int) (this.f103 - this.f99));
        System.arraycopy(this.f98, (int) (this.f99 - this.f101), bArr, i10, min);
        this.f99 += min;
        return min;
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۧۙ۬ */
    public long mo1573() {
        return Math.max(this.f99, this.f95.mo1464());
    }

    @Override // l.InterfaceC0189
    /* renamed from: ۫ۡۙ */
    public void mo1574(long j10) {
        if (j10 >= this.f103 || j10 < this.f101) {
            m1611();
            this.f101 = f92 & j10;
            long j11 = this.f101;
            this.f102 = this.f98.length + j11;
            if (this.f100 != j11) {
                this.f95.mo1465(j11);
                this.f100 = this.f101;
            }
            this.f103 = this.f101 + m1610();
        } else if (j10 < this.f99) {
            m1611();
        }
        this.f99 = j10;
    }
}
