package l;

import cc.binmt.signature.Hook;
import java.nio.charset.Charset;
import java.util.zip.CRC32;

/* renamed from: l.ۤۛۜ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0187 implements Cloneable {

    /* renamed from: ۖۤۢ  reason: not valid java name and contains not printable characters */
    private String f52;

    /* renamed from: ۘ۠۠  reason: not valid java name and contains not printable characters */
    private long f54;

    /* renamed from: ۙۛۤ  reason: not valid java name and contains not printable characters */
    private long f55;

    /* renamed from: ۙۡۖ  reason: not valid java name and contains not printable characters */
    private long f56;

    /* renamed from: ۛۨۖ  reason: not valid java name and contains not printable characters */
    private long f57;

    /* renamed from: ۛ۬۫  reason: not valid java name and contains not printable characters */
    private int f58;

    /* renamed from: ۡۨۧ  reason: not valid java name and contains not printable characters */
    private int f59;

    /* renamed from: ۤۦۘ  reason: not valid java name and contains not printable characters */
    private int f60;

    /* renamed from: ۥ۠ۡ  reason: contains not printable characters */
    private String f61;

    /* renamed from: ۨ۬ۜ  reason: not valid java name and contains not printable characters */
    private byte[] f63;

    /* renamed from: ۫ۙۗ  reason: not valid java name and contains not printable characters */
    private C0193 f64;

    /* renamed from: ۫۠ۘ  reason: not valid java name and contains not printable characters */
    private byte[] f65;

    /* renamed from: ۫ۧۦ  reason: not valid java name and contains not printable characters */
    private byte[] f66;

    /* renamed from: ۬ۦۧ  reason: not valid java name and contains not printable characters */
    private long f68;

    /* renamed from: ۘۙۢ  reason: not valid java name and contains not printable characters */
    private int f53 = 0;

    /* renamed from: ۦۗۘ  reason: contains not printable characters */
    private int f62 = 0;

    /* renamed from: ۬ۤۙ  reason: not valid java name and contains not printable characters */
    private int f67 = 0;

    /* renamed from: ۟ۜۜ  reason: not valid java name and contains not printable characters */
    private String m1514(C0193 c0193, byte[] bArr) {
        byte[] m1606;
        int length;
        if (c0193 == null || bArr == null || (length = (m1606 = c0193.m1606()).length) < 5 || c0193.m1604(0) != 1) {
            return null;
        }
        int m1607 = c0193.m1607(1);
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        if (m1607 != ((int) crc32.getValue())) {
            return null;
        }
        return new String(m1606, 5, length - 5, C0178.f12151);
    }

    /* renamed from: ۖۖ۟  reason: not valid java name and contains not printable characters */
    public void m1515(Charset charset, boolean z10) {
        byte[] bArr = this.f66;
        z10 = (bArr == null || bArr.length == 0) ? false : false;
        String m1514 = z10 ? m1514(C0193.m1603(InterfaceC0186.f37, this.f66), this.f65) : null;
        if (m1514 == null) {
            m1514 = new String(this.f65, charset);
        }
        m1528(m1514);
        this.f65 = null;
        if (this.f63 == null) {
            return;
        }
        String m15142 = z10 ? m1514(C0193.m1603(InterfaceC0186.f46, this.f66), this.f63) : null;
        if (m15142 == null) {
            m15142 = new String(this.f63, charset);
        }
        m1519(m15142);
        this.f63 = null;
    }

    /* renamed from: ۖۛۢ  reason: not valid java name and contains not printable characters */
    public int m1516() {
        return this.f62;
    }

    /* renamed from: ۖ۟ۘ  reason: not valid java name and contains not printable characters */
    public void m1517(long j10) {
        this.f57 = j10;
    }

    /* renamed from: ۖۤ۠  reason: not valid java name and contains not printable characters */
    public void m1518(byte[] bArr) {
        this.f66 = bArr;
    }

    /* renamed from: ۗۘۖ  reason: not valid java name and contains not printable characters */
    public void m1519(String str) {
        this.f52 = str;
    }

    /* renamed from: ۗۚۤ  reason: not valid java name and contains not printable characters */
    public byte[] m1520() {
        return this.f66;
    }

    /* renamed from: ۘۡۥ  reason: not valid java name and contains not printable characters */
    public void m1521(int i10) {
        this.f59 = i10;
    }

    /* renamed from: ۘۦۙ  reason: not valid java name and contains not printable characters */
    public void m1522(int i10) {
        this.f62 = i10;
    }

    /* renamed from: ۙۖۥ  reason: not valid java name and contains not printable characters */
    public long m1523() {
        return this.f55;
    }

    /* renamed from: ۙۘۚ  reason: not valid java name and contains not printable characters */
    public void m1524(int i10) {
        this.f60 = i10;
    }

    /* renamed from: ۙۛۜ  reason: not valid java name and contains not printable characters */
    public void m1525(long j10) {
        this.f55 = j10;
    }

    /* renamed from: ۙۡۡ  reason: not valid java name and contains not printable characters */
    public int m1526() {
        return this.f67;
    }

    /* renamed from: ۚۖ۠  reason: not valid java name and contains not printable characters */
    public boolean m1527() {
        String m1548 = m1548();
        short[] m1458 = C0180.m1458(1);
        // fill-array-data instruction
        m1458[0] = 19;
        return m1548.endsWith(Hook.m1(m1458));
    }

    /* renamed from: ۚۛۖ  reason: not valid java name and contains not printable characters */
    public void m1528(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        if (str.isEmpty()) {
            short[] m1458 = C0180.m1458(21);
            // fill-array-data instruction
            m1458[0] = 15;
            m1458[1] = 32;
            m1458[2] = 44;
            m1458[3] = 36;
            m1458[4] = 97;
            m1458[5] = 34;
            m1458[6] = 32;
            m1458[7] = 47;
            m1458[8] = 97;
            m1458[9] = 47;
            m1458[10] = 46;
            m1458[11] = 53;
            m1458[12] = 97;
            m1458[13] = 35;
            m1458[14] = 36;
            m1458[15] = 97;
            m1458[16] = 36;
            m1458[17] = 44;
            m1458[18] = 49;
            m1458[19] = 53;
            m1458[20] = 56;
            throw new IllegalArgumentException(C0188.m1556(m1458));
        }
        if (m1535() == 0) {
            short[] m14582 = C0180.m1458(1);
            // fill-array-data instruction
            m14582[0] = -33;
            if (!str.contains(C0180.m1461(m14582))) {
                str = str.replace('\\', '/');
            }
        }
        this.f61 = str;
    }

    /* renamed from: ۚۨۗ  reason: not valid java name and contains not printable characters */
    public void m1529(byte[] bArr) {
        this.f65 = bArr;
    }

    /* renamed from: ۚ۫ۘ  reason: not valid java name and contains not printable characters */
    public int m1530() {
        return this.f60;
    }

    /* renamed from: ۜۥۤ  reason: not valid java name and contains not printable characters */
    public C0187 clone() {
        C0187 c0187;
        CloneNotSupportedException e10;
        try {
            c0187 = (C0187) super.clone();
        } catch (CloneNotSupportedException e11) {
            c0187 = null;
            e10 = e11;
        }
        try {
            if (this.f64 != null) {
                c0187.f64 = this.f64.clone();
            }
        } catch (CloneNotSupportedException e12) {
            e10 = e12;
            e10.printStackTrace();
            return c0187;
        }
        return c0187;
    }

    /* renamed from: ۜ۫۫  reason: not valid java name and contains not printable characters */
    public long m1532() {
        return this.f57;
    }

    /* renamed from: ۟ۛۘ  reason: not valid java name and contains not printable characters */
    public long m1533() {
        return this.f68;
    }

    /* renamed from: ۠۫ۡ  reason: not valid java name and contains not printable characters */
    public void m1534(int i10) {
        this.f58 = i10;
    }

    /* renamed from: ۢۜۙ  reason: not valid java name and contains not printable characters */
    public int m1535() {
        return this.f53;
    }

    /* renamed from: ۢ۟ۗ  reason: not valid java name and contains not printable characters */
    public int m1536() {
        return this.f59;
    }

    /* renamed from: ۤۙۥ  reason: not valid java name and contains not printable characters */
    public void m1537(int i10) {
        this.f53 = i10;
    }

    /* renamed from: ۤۛۘ  reason: not valid java name and contains not printable characters */
    public void m1538(int i10) {
        this.f67 = i10;
    }

    /* renamed from: ۤۜۙ  reason: not valid java name and contains not printable characters */
    public void m1539(byte[] bArr) {
        this.f63 = bArr;
    }

    /* renamed from: ۤ۫ۛ  reason: not valid java name and contains not printable characters */
    public boolean m1540() {
        return (this.f60 & 1) != 0;
    }

    /* renamed from: ۥۘۜ  reason: contains not printable characters */
    public long m1541() {
        return this.f56;
    }

    /* renamed from: ۥ۠ۡ  reason: contains not printable characters */
    public String m1542() {
        return this.f52;
    }

    /* renamed from: ۥۢۜ  reason: contains not printable characters */
    public void m1543(long j10) {
        this.f56 = j10;
    }

    /* renamed from: ۥۨ۬  reason: contains not printable characters */
    public boolean m1544() {
        return (m1530() & InterfaceC0186.f43) != 0;
    }

    /* renamed from: ۧۛۚ  reason: not valid java name and contains not printable characters */
    public int m1545() {
        return this.f58;
    }

    /* renamed from: ۧۛۧ  reason: not valid java name and contains not printable characters */
    public long m1546() {
        return this.f54;
    }

    /* renamed from: ۨ۫ۗ  reason: not valid java name and contains not printable characters */
    public void m1547(long j10) {
        this.f54 = j10;
    }

    /* renamed from: ۫ۖۨ  reason: not valid java name and contains not printable characters */
    public String m1548() {
        return this.f61;
    }

    /* renamed from: ۬ۙۗ  reason: not valid java name and contains not printable characters */
    public void m1549(long j10) {
        this.f68 = j10;
    }
}
