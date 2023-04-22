package l;

import cc.binmt.signature.Hook;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: l.۬ۧۡ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0198 implements Closeable {

    /* renamed from: ۗۘۚ  reason: not valid java name and contains not printable characters */
    private Map<String, C0187> f110;

    /* renamed from: ۘ۠ۤ  reason: not valid java name and contains not printable characters */
    private final InterfaceC0189 f111;

    /* renamed from: ۙۚ۠  reason: not valid java name and contains not printable characters */
    private boolean f112;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0198(java.io.File r2) {
        /*
            r1 = this;
            r0 = 1
            short[] r0 = l.C0180.m1458(r0)
            r0 = {x0016: FILL_ARRAY_DATA  , data: [-20} // fill-array
            java.lang.String r0 = l.C0185.m1502(r0)
            l.ۤۨۥ r2 = l.C0185.m1504(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0198.<init>(java.io.File):void");
    }

    public C0198(InterfaceC0189 interfaceC0189) {
        this.f110 = new LinkedHashMap();
        this.f112 = false;
        this.f111 = interfaceC0189;
        m1623();
    }

    /* renamed from: ۚۚۙ  reason: not valid java name and contains not printable characters */
    private long m1618() {
        return this.f111.mo1573();
    }

    /* renamed from: ۜ۫ۖ  reason: not valid java name and contains not printable characters */
    private long m1619() {
        return m1620() & 4294967295L;
    }

    /* renamed from: ۤ۟ۙ  reason: not valid java name and contains not printable characters */
    private int m1620() {
        int mo1565 = this.f111.mo1565();
        int mo15652 = this.f111.mo1565();
        int mo15653 = this.f111.mo1565();
        int mo15654 = this.f111.mo1565();
        if ((mo1565 | mo15652 | mo15653 | mo15654) >= 0) {
            return mo1565 | (mo15652 << 8) | (mo15653 << 16) | (mo15654 << 24);
        }
        throw new EOFException();
    }

    /* renamed from: ۤۡۤ  reason: not valid java name and contains not printable characters */
    private void m1621(int i10) {
        if (i10 >= 0) {
            long mo1570 = this.f111.mo1570() + i10;
            if (mo1570 > this.f111.mo1573()) {
                throw new EOFException();
            }
            this.f111.mo1574(mo1570);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        short[] m1458 = C0180.m1458(5);
        // fill-array-data instruction
        m1458[0] = 18;
        m1458[1] = 42;
        m1458[2] = 40;
        m1458[3] = 49;
        m1458[4] = 97;
        sb2.append(C0188.m1556(m1458));
        sb2.append(i10);
        throw new IOException(sb2.toString());
    }

    /* renamed from: ۤۥۘ  reason: not valid java name and contains not printable characters */
    private void m1622() {
        boolean z10;
        long m1618 = m1618();
        long j10 = m1618 - 22;
        long max = Math.max(0L, m1618 - 65557);
        while (true) {
            if (j10 < max) {
                z10 = false;
                break;
            }
            m1625(j10);
            if (m1620() == 101010256) {
                z10 = true;
                break;
            }
            j10--;
        }
        if (z10) {
            m1625(j10 + 16);
            m1625(m1619());
            return;
        }
        short[] m1458 = C0180.m1458(28);
        // fill-array-data instruction
        m1458[0] = -41;
        m1458[1] = -101;
        m1458[2] = 93;
        m1458[3] = -104;
        m1458[4] = -1;
        m1458[5] = -97;
        m1458[6] = 91;
        m1458[7] = -48;
        m1458[8] = -1;
        m1458[9] = -102;
        m1458[10] = 30;
        m1458[11] = -98;
        m1458[12] = -7;
        m1458[13] = -99;
        m1458[14] = 30;
        m1458[15] = -111;
        m1458[16] = -74;
        m1458[17] = -77;
        m1458[18] = 119;
        m1458[19] = -96;
        m1458[20] = -74;
        m1458[21] = -120;
        m1458[22] = 76;
        m1458[23] = -109;
        m1458[24] = -2;
        m1458[25] = -128;
        m1458[26] = 72;
        m1458[27] = -107;
        throw new IOException(C0180.m1461(m1458));
    }

    /* renamed from: ۥۨۦ  reason: contains not printable characters */
    private void m1623() {
        ArrayList<C0187> arrayList = new ArrayList();
        m1622();
        while (m1620() == 33639248) {
            C0187 c0187 = new C0187();
            c0187.m1537((m1626() >> 8) & 15);
            m1626();
            c0187.m1524(m1626());
            c0187.m1521(m1626());
            c0187.m1549(C0191.m1602(m1619()));
            c0187.m1534(m1620());
            c0187.m1547(m1619());
            c0187.m1525(m1619());
            int m1626 = m1626();
            int m16262 = m1626();
            int m16263 = m1626();
            m1626();
            c0187.m1522(m1626());
            c0187.m1538(m1620());
            c0187.m1517(m1619());
            c0187.m1529(m1624(m1626));
            if (m16262 > 0) {
                m1621(m16262);
            }
            if (m16263 > 0) {
                c0187.m1539(m1624(m16263));
            }
            arrayList.add(c0187);
        }
        Charset charset = C0178.f12151;
        Charset charset2 = C0178.f12151;
        this.f110.clear();
        for (C0187 c01872 : arrayList) {
            long m1532 = c01872.m1532() + 26;
            m1625(m1532);
            int m16264 = m1626();
            int m16265 = m1626();
            m1621(m16264);
            c01872.m1518(m1624(m16265));
            c01872.m1543(m1532 + 2 + 2 + m16264 + m16265);
            if (c01872.m1544()) {
                c01872.m1515(charset2, false);
            } else {
                c01872.m1515(charset, true);
            }
            if (c01872.m1540()) {
                c01872.m1524(c01872.m1530() & (-2));
                int m1536 = c01872.m1536();
                if (m1536 != 8 && m1536 != 0) {
                    c01872.m1521(c01872.m1523() != c01872.m1546() ? 8 : 0);
                }
            }
            this.f110.put(c01872.m1548(), c01872);
        }
    }

    /* renamed from: ۦۦ۬  reason: contains not printable characters */
    private byte[] m1624(int i10) {
        byte[] bArr = new byte[i10];
        this.f111.mo1566(bArr);
        return bArr;
    }

    /* renamed from: ۧ۠ۥ  reason: not valid java name and contains not printable characters */
    private void m1625(long j10) {
        this.f111.mo1574(j10);
    }

    /* renamed from: ۫ۖۢ  reason: not valid java name and contains not printable characters */
    private int m1626() {
        int mo1565 = this.f111.mo1565();
        int mo15652 = this.f111.mo1565();
        if ((mo1565 | mo15652) >= 0) {
            return mo1565 | (mo15652 << 8);
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f112) {
            return;
        }
        this.f111.close();
        this.f110.clear();
        this.f112 = true;
    }

    /* renamed from: ۘۙۗ  reason: not valid java name and contains not printable characters */
    public ArrayList<C0187> m1627() {
        return new ArrayList<>(this.f110.values());
    }

    /* renamed from: ۨ۠ۥ  reason: not valid java name and contains not printable characters */
    public InputStream m1628(C0187 c0187) {
        long m1541 = c0187.m1541();
        int m1536 = c0187.m1536();
        C0183 c0183 = new C0183(this.f111, m1541, c0187.m1546());
        if (m1536 != 0) {
            if (m1536 == 8) {
                return new C0179(c0183);
            }
            StringBuilder sb2 = new StringBuilder();
            short[] m1458 = C0180.m1458(31);
            // fill-array-data instruction
            m1458[0] = 105;
            m1458[1] = 119;
            m1458[2] = -86;
            m1458[3] = 49;
            m1458[4] = 68;
            m1458[5] = 76;
            m1458[6] = 118;
            m1458[7] = -85;
            m1458[8] = 48;
            m1458[9] = 81;
            m1458[10] = 88;
            m1458[11] = 57;
            m1458[12] = -70;
            m1458[13] = 43;
            m1458[14] = 89;
            m1458[15] = 76;
            m1458[16] = 107;
            m1458[17] = -68;
            m1458[18] = 55;
            m1458[19] = 71;
            m1458[20] = 85;
            m1458[21] = 118;
            m1458[22] = -73;
            m1458[23] = 100;
            m1458[24] = 89;
            m1458[25] = 89;
            m1458[26] = 109;
            m1458[27] = -79;
            m1458[28] = 43;
            m1458[29] = 80;
            m1458[30] = 28;
            sb2.append(Hook.m1(m1458));
            sb2.append(c0187.m1536());
            throw new IOException(sb2.toString());
        }
        return c0183;
    }

    /* renamed from: ۫ۖ۠  reason: not valid java name and contains not printable characters */
    public byte[] m1629(C0187 c0187) {
        int read;
        byte[] bArr = new byte[(int) c0187.m1523()];
        InputStream m1628 = m1628(c0187);
        int i10 = 0;
        while (i10 < bArr.length && (read = m1628.read(bArr, i10, bArr.length - i10)) != -1) {
            i10 += read;
        }
        if (i10 == bArr.length) {
            return bArr;
        }
        short[] m1458 = C0180.m1458(46);
        // fill-array-data instruction
        m1458[0] = -80;
        m1458[1] = 14;
        m1458[2] = -119;
        m1458[3] = -60;
        m1458[4] = 10;
        m1458[5] = -119;
        m1458[6] = -118;
        m1458[7] = 1;
        m1458[8] = -104;
        m1458[9] = -116;
        m1458[10] = 70;
        m1458[11] = -125;
        m1458[12] = -126;
        m1458[13] = 70;
        m1458[14] = -120;
        m1458[15] = -123;
        m1458[16] = 18;
        m1458[17] = -115;
        m1458[18] = -60;
        m1458[19] = 14;
        m1458[20] = -115;
        m1458[21] = -105;
        m1458[22] = 70;
        m1458[23] = -114;
        m1458[24] = -127;
        m1458[25] = 3;
        m1458[26] = -126;
        m1458[27] = -60;
        m1458[28] = 20;
        m1458[29] = -119;
        m1458[30] = -123;
        m1458[31] = 2;
        m1458[32] = -52;
        m1458[33] = -115;
        m1458[34] = 21;
        m1458[35] = -52;
        m1458[36] = -115;
        m1458[37] = 8;
        m1458[38] = -113;
        m1458[39] = -117;
        m1458[40] = 20;
        m1458[41] = -98;
        m1458[42] = -127;
        m1458[43] = 5;
        m1458[44] = -104;
        m1458[45] = -54;
        throw new IOException(C0191.m1596(m1458));
    }

    /* renamed from: ۫ۨ۠  reason: not valid java name and contains not printable characters */
    public InputStream m1630(C0187 c0187) {
        return new C0183(this.f111, c0187.m1541(), c0187.m1546());
    }
}
