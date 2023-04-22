package l;

import cc.binmt.signature.Hook;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;

/* renamed from: l.۠ۙ۠  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0184 implements Closeable {

    /* renamed from: ۘ۠ۥ  reason: not valid java name and contains not printable characters */
    public static final int f22 = 0;

    /* renamed from: ۛۖۨ  reason: not valid java name and contains not printable characters */
    public static final int f23 = 8;

    /* renamed from: ۧۘۧ  reason: not valid java name and contains not printable characters */
    public static final int f24 = -1;

    /* renamed from: ۙۖۛ  reason: not valid java name and contains not printable characters */
    private boolean f26;

    /* renamed from: ۥ۫ۢ  reason: contains not printable characters */
    private C0197 f30;

    /* renamed from: ۦۢۗ  reason: contains not printable characters */
    private final InterfaceC0189 f31;

    /* renamed from: ۧۜۚ  reason: not valid java name and contains not printable characters */
    private C0190 f32;

    /* renamed from: ۧ۟ۡ  reason: not valid java name and contains not printable characters */
    private String f34;

    /* renamed from: ۧ۟ۤ  reason: not valid java name and contains not printable characters */
    private C0196 f35;

    /* renamed from: ۠ۖۚ  reason: not valid java name and contains not printable characters */
    private final ArrayList<C0190> f27 = new ArrayList<>();

    /* renamed from: ۤۚۥ  reason: not valid java name and contains not printable characters */
    private int f29 = 8;

    /* renamed from: ۧ۟۠  reason: not valid java name and contains not printable characters */
    private int f33 = -1;

    /* renamed from: ۗۡۢ  reason: not valid java name and contains not printable characters */
    private Charset f25 = C0178.f12151;

    /* renamed from: ۢۖ۫  reason: not valid java name and contains not printable characters */
    private final byte[] f28 = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];

    public C0184(File file) {
        if (file.exists()) {
            file.delete();
        }
        short[] m1458 = C0180.m1458(2);
        // fill-array-data instruction
        m1458[0] = 76;
        m1458[1] = -121;
        this.f31 = C0185.m1504(file, C0180.m1461(m1458));
        this.f26 = true;
    }

    /* renamed from: ۖۡ۫  reason: not valid java name and contains not printable characters */
    private void m1467(long j10, long j11) {
        String str = this.f34;
        byte[] bytes = str == null ? new byte[0] : str.getBytes(this.f25);
        m1479(InterfaceC0186.f41);
        m1478(0);
        m1478(0);
        m1478(this.f27.size());
        m1478(this.f27.size());
        m1479((int) j10);
        m1479((int) j11);
        m1478(bytes.length);
        m1474(bytes);
    }

    /* renamed from: ۗۨۘ  reason: not valid java name and contains not printable characters */
    private static boolean m1468(long j10, int i10) {
        return j10 % ((long) i10) == 0;
    }

    /* renamed from: ۙ۟ۚ  reason: not valid java name and contains not printable characters */
    private long m1469() {
        return this.f31.mo1570();
    }

    /* renamed from: ۛ۬ۘ  reason: not valid java name and contains not printable characters */
    private void m1470(C0190 c0190) {
        OutputStream outputStream;
        if (this.f32 != null) {
            m1487();
        }
        c0190.f74 = m1469();
        this.f27.add(c0190);
        boolean z10 = c0190.f87;
        int i10 = InterfaceC0186.f43;
        if (z10) {
            c0190.f86 = 0;
            if (c0190.f83) {
                c0190.f80 = InterfaceC0186.f43;
            }
        } else {
            this.f32 = c0190;
            int i11 = this.f29;
            this.f30 = new C0197(this.f31);
            C0197 c0197 = this.f30;
            if (!c0190.f83) {
                i10 = 0;
            }
            int i12 = this.f29;
            if (i12 == 0) {
                outputStream = c0197;
            } else if (i12 != 8) {
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
                sb2.append(i11);
                throw new IOException(sb2.toString());
            } else {
                outputStream = new C0192(c0197, this.f33);
            }
            this.f35 = new C0196(outputStream);
            c0190.f80 = i10;
            c0190.f86 = i11;
        }
        m1477(c0190);
        c0190.f76 = m1469();
    }

    /* renamed from: ۠۬ۘ  reason: not valid java name and contains not printable characters */
    private static boolean m1471(byte[] bArr) {
        for (byte b10 : bArr) {
            if (b10 != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ۢ۟ۥ  reason: not valid java name and contains not printable characters */
    private void m1472(C0190 c0190) {
        m1479(InterfaceC0186.f47);
        m1478(c0190.f75);
        m1478(c0190.f84);
        m1478(c0190.f80);
        m1478(c0190.f86);
        m1479(c0190.f78);
        m1479(c0190.f71);
        m1479(c0190.f73);
        m1479(c0190.f85);
        m1478(c0190.f72.length);
        m1478(c0190.f79.length);
        m1478(c0190.f82.length);
        m1478(c0190.f77);
        m1478(c0190.f88);
        m1479(c0190.f81);
        m1479((int) c0190.f74);
        m1474(c0190.f72);
        m1474(c0190.f79);
        m1474(c0190.f82);
    }

    /* renamed from: ۤۗ۬  reason: not valid java name and contains not printable characters */
    private static int m1473(long j10, int i10) {
        long j11 = i10;
        return ((int) (j11 - (j10 % j11))) % i10;
    }

    /* renamed from: ۤۨۘ  reason: not valid java name and contains not printable characters */
    private void m1474(byte[] bArr) {
        if (bArr.length > 0) {
            this.f31.mo1567(bArr);
        }
    }

    /* renamed from: ۥۨۛ  reason: contains not printable characters */
    private void m1475(long j10) {
        this.f31.mo1574(j10);
    }

    /* renamed from: ۧۗۜ  reason: not valid java name and contains not printable characters */
    private void m1476(C0190 c0190, long j10) {
        String str = new String(c0190.f72, C0178.f12151);
        short[] m1458 = C0180.m1458(3);
        // fill-array-data instruction
        m1458[0] = 106;
        m1458[1] = 71;
        m1458[2] = 83;
        int i10 = str.endsWith(Hook.m1(m1458)) ? ConstantsKt.DEFAULT_BLOCK_SIZE : 4;
        if (m1468(c0190.f79.length + j10, i10)) {
            return;
        }
        if (m1471(c0190.f79)) {
            c0190.f79 = new byte[m1473(j10, i10)];
        } else {
            c0190.f79 = Arrays.copyOf(c0190.f79, c0190.f79.length + m1473(j10 + c0190.f79.length, i10));
        }
    }

    /* renamed from: ۨۨۢ  reason: not valid java name and contains not printable characters */
    private void m1477(C0190 c0190) {
        m1479(InterfaceC0186.f51);
        m1478(c0190.f84);
        m1478(c0190.f80);
        m1478(c0190.f86);
        m1479(c0190.f78);
        m1479(c0190.f71);
        m1479(c0190.f73);
        m1479(c0190.f85);
        m1478(c0190.f72.length);
        if (this.f26 && c0190.f86 == 0) {
            m1476(c0190, m1469() + 2 + c0190.f72.length);
        }
        m1478(c0190.f79.length);
        m1474(c0190.f72);
        m1474(c0190.f79);
    }

    /* renamed from: ۬۠۬  reason: not valid java name and contains not printable characters */
    private void m1478(int i10) {
        this.f31.mo1568(i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f31.mo1568((i10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: ۬ۧۘ  reason: not valid java name and contains not printable characters */
    private void m1479(int i10) {
        this.f31.mo1568(i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f31.mo1568((i10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f31.mo1568((i10 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f31.mo1568((i10 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f31.mo1569()) {
            return;
        }
        if (this.f32 != null) {
            m1487();
        }
        long m1469 = m1469();
        Iterator<C0190> it = this.f27.iterator();
        while (it.hasNext()) {
            m1472(it.next());
        }
        m1467(m1469() - m1469, m1469);
        this.f31.close();
    }

    /* renamed from: ۖۢۤ  reason: not valid java name and contains not printable characters */
    public void m1480(byte[] bArr) {
        this.f35.write(bArr);
    }

    /* renamed from: ۗ۬ۡ  reason: not valid java name and contains not printable characters */
    public void m1481(byte[] bArr, int i10, int i11) {
        this.f35.write(bArr, i10, i11);
    }

    /* renamed from: ۙۗۥ  reason: not valid java name and contains not printable characters */
    public int m1482() {
        return this.f29;
    }

    /* renamed from: ۙ۠ۧ  reason: not valid java name and contains not printable characters */
    public String m1483() {
        return this.f34;
    }

    /* renamed from: ۚۗۢ  reason: not valid java name and contains not printable characters */
    public void m1484(int i10) {
        this.f29 = i10;
    }

    /* renamed from: ۜۡۧ  reason: not valid java name and contains not printable characters */
    public int m1485() {
        return this.f33;
    }

    /* renamed from: ۠ۖۛ  reason: not valid java name and contains not printable characters */
    public void m1486(InputStream inputStream) {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            m1481(bArr, 0, read);
        }
    }

    /* renamed from: ۠ۡۘ  reason: not valid java name and contains not printable characters */
    public void m1487() {
        if (this.f32 == null) {
            return;
        }
        this.f35.close();
        this.f32.f71 = this.f35.m1615();
        this.f32.f73 = this.f30.m1617();
        this.f32.f85 = this.f35.m1616();
        long m1469 = m1469();
        m1475(this.f32.f74 + 4 + 2 + 2 + 2 + 4);
        m1479(this.f32.f71);
        m1479(this.f32.f73);
        m1479(this.f32.f85);
        this.f31.mo1574(m1469);
        this.f35 = null;
        this.f30 = null;
        this.f32 = null;
    }

    /* renamed from: ۡۘۧ  reason: not valid java name and contains not printable characters */
    public void m1488(C0187 c0187) {
        if (this.f32 != null) {
            m1487();
        }
        C0190 c0190 = new C0190(c0187, this.f25);
        if (c0187.m1540()) {
            c0190.f80 |= 1;
        }
        if (c0190.f83) {
            c0190.f80 |= InterfaceC0186.f43;
        }
        c0190.f86 = c0187.m1536();
        c0190.f71 = c0187.m1545();
        c0190.f73 = (int) c0187.m1546();
        c0190.f85 = (int) c0187.m1523();
        c0190.f74 = m1469();
        this.f27.add(c0190);
        m1477(c0190);
    }

    /* renamed from: ۡۥ۫  reason: not valid java name and contains not printable characters */
    public void m1489(int i10) {
        this.f33 = i10;
    }

    /* renamed from: ۤۗ۬  reason: not valid java name and contains not printable characters */
    public void m1490(byte[] bArr, int i10, int i11) {
        this.f31.mo1571(bArr, i10, i11);
    }

    /* renamed from: ۤۢۙ  reason: not valid java name and contains not printable characters */
    public void m1491(String str) {
        this.f34 = str;
    }

    /* renamed from: ۥۗۙ  reason: contains not printable characters */
    public void m1492(Charset charset) {
        this.f25 = charset;
    }

    /* renamed from: ۦۡ۫  reason: contains not printable characters */
    public void m1493(C0187 c0187, C0198 c0198) {
        m1488(c0187);
        InputStream m1630 = c0198.m1630(c0187);
        byte[] bArr = this.f28;
        while (true) {
            int read = m1630.read(bArr);
            if (read == -1) {
                return;
            }
            m1490(bArr, 0, read);
        }
    }

    /* renamed from: ۦۢۗ  reason: contains not printable characters */
    public void m1494(String str) {
        this.f25 = Charset.forName(str);
    }

    /* renamed from: ۦۥۚ  reason: contains not printable characters */
    public void m1495(String str) {
        m1470(new C0190(str, this.f25));
    }

    /* renamed from: ۧۜ۫  reason: not valid java name and contains not printable characters */
    public void m1496(int i10) {
        this.f35.write(i10);
    }
}
