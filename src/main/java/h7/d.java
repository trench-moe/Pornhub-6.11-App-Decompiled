package h7;

import android.util.SparseArray;
import c7.h;
import c7.i;
import c7.j;
import c7.w;
import com.google.android.exoplayer2.ParserException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k8.c0;
import k8.n;
import k8.q;
import k8.t;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes2.dex */
public class d implements h {

    /* renamed from: b0  reason: collision with root package name */
    public static final byte[] f10162b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c0  reason: collision with root package name */
    public static final byte[] f10163c0 = c0.v("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f10164d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: e0  reason: collision with root package name */
    public static final UUID f10165e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: f0  reason: collision with root package name */
    public static final Map<String, Integer> f10166f0;
    public long A;
    public long B;
    public n C;
    public n D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final h7.c f10167a;

    /* renamed from: a0  reason: collision with root package name */
    public j f10168a0;

    /* renamed from: b  reason: collision with root package name */
    public final f f10169b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray<c> f10170c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final t f10171e;

    /* renamed from: f  reason: collision with root package name */
    public final t f10172f;

    /* renamed from: g  reason: collision with root package name */
    public final t f10173g;

    /* renamed from: h  reason: collision with root package name */
    public final t f10174h;

    /* renamed from: i  reason: collision with root package name */
    public final t f10175i;

    /* renamed from: j  reason: collision with root package name */
    public final t f10176j;

    /* renamed from: k  reason: collision with root package name */
    public final t f10177k;

    /* renamed from: l  reason: collision with root package name */
    public final t f10178l;

    /* renamed from: m  reason: collision with root package name */
    public final t f10179m;
    public final t n;

    /* renamed from: o  reason: collision with root package name */
    public ByteBuffer f10180o;

    /* renamed from: p  reason: collision with root package name */
    public long f10181p;

    /* renamed from: q  reason: collision with root package name */
    public long f10182q;

    /* renamed from: r  reason: collision with root package name */
    public long f10183r;

    /* renamed from: s  reason: collision with root package name */
    public long f10184s;

    /* renamed from: t  reason: collision with root package name */
    public long f10185t;

    /* renamed from: u  reason: collision with root package name */
    public c f10186u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f10187v;

    /* renamed from: w  reason: collision with root package name */
    public int f10188w;

    /* renamed from: x  reason: collision with root package name */
    public long f10189x;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public long f10190z;

    /* loaded from: classes2.dex */
    public final class b implements h7.b {
        public b(a aVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public byte[] N;
        public C0145d T;
        public boolean U;
        public w X;
        public int Y;

        /* renamed from: a  reason: collision with root package name */
        public String f10192a;

        /* renamed from: b  reason: collision with root package name */
        public String f10193b;

        /* renamed from: c  reason: collision with root package name */
        public int f10194c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f10195e;

        /* renamed from: f  reason: collision with root package name */
        public int f10196f;

        /* renamed from: g  reason: collision with root package name */
        public int f10197g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10198h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f10199i;

        /* renamed from: j  reason: collision with root package name */
        public w.a f10200j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f10201k;

        /* renamed from: l  reason: collision with root package name */
        public com.google.android.exoplayer2.drm.b f10202l;

        /* renamed from: m  reason: collision with root package name */
        public int f10203m = -1;
        public int n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f10204o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f10205p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f10206q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f10207r = -1;

        /* renamed from: s  reason: collision with root package name */
        public float f10208s = 0.0f;

        /* renamed from: t  reason: collision with root package name */
        public float f10209t = 0.0f;

        /* renamed from: u  reason: collision with root package name */
        public float f10210u = 0.0f;

        /* renamed from: v  reason: collision with root package name */
        public byte[] f10211v = null;

        /* renamed from: w  reason: collision with root package name */
        public int f10212w = -1;

        /* renamed from: x  reason: collision with root package name */
        public boolean f10213x = false;
        public int y = -1;

        /* renamed from: z  reason: collision with root package name */
        public int f10214z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        public String W = "eng";

        public c() {
        }

        public c(a aVar) {
        }

        @EnsuresNonNull({"codecPrivate"})
        public final byte[] a(String str) {
            byte[] bArr = this.f10201k;
            if (bArr == null) {
                String valueOf = String.valueOf(str);
                throw ParserException.a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
            }
            return bArr;
        }
    }

    /* renamed from: h7.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0145d {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f10215a = new byte[10];

        /* renamed from: b  reason: collision with root package name */
        public boolean f10216b;

        /* renamed from: c  reason: collision with root package name */
        public int f10217c;
        public long d;

        /* renamed from: e  reason: collision with root package name */
        public int f10218e;

        /* renamed from: f  reason: collision with root package name */
        public int f10219f;

        /* renamed from: g  reason: collision with root package name */
        public int f10220g;

        @RequiresNonNull({"#1.output"})
        public void a(c cVar) {
            if (this.f10217c > 0) {
                cVar.X.b(this.d, this.f10218e, this.f10219f, this.f10220g, cVar.f10200j);
                this.f10217c = 0;
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f10166f0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i10) {
        h7.a aVar = new h7.a();
        this.f10182q = -1L;
        this.f10183r = -9223372036854775807L;
        this.f10184s = -9223372036854775807L;
        this.f10185t = -9223372036854775807L;
        this.f10190z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f10167a = aVar;
        aVar.d = new b(null);
        this.d = (i10 & 1) == 0;
        this.f10169b = new f();
        this.f10170c = new SparseArray<>();
        this.f10173g = new t(4);
        this.f10174h = new t(ByteBuffer.allocate(4).putInt(-1).array());
        this.f10175i = new t(4);
        this.f10171e = new t(q.f11982a);
        this.f10172f = new t(4);
        this.f10176j = new t();
        this.f10177k = new t();
        this.f10178l = new t(8);
        this.f10179m = new t();
        this.n = new t();
        this.L = new int[1];
    }

    public static int[] j(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    public static byte[] k(long j10, String str, long j11) {
        k8.a.c(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return c0.v(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    @Override // c7.h
    public final void a() {
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void b(int i10) {
        if (this.C == null || this.D == null) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Element ");
            sb2.append(i10);
            sb2.append(" must be in a Cues");
            throw ParserException.a(sb2.toString(), null);
        }
    }

    @Override // c7.h
    public final void c(j jVar) {
        this.f10168a0 = jVar;
    }

    @EnsuresNonNull({"currentTrack"})
    public final void d(int i10) {
        if (this.f10186u != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw ParserException.a(sb2.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(h7.d.c r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.d.e(h7.d$c, long, int, int, int):void");
    }

    @Override // c7.h
    public final boolean f(i iVar) {
        long a10;
        int i10;
        e eVar = new e();
        long b10 = iVar.b();
        long j10 = 1024;
        int i11 = (b10 > (-1L) ? 1 : (b10 == (-1L) ? 0 : -1));
        if (i11 != 0 && b10 <= 1024) {
            j10 = b10;
        }
        int i12 = (int) j10;
        iVar.o(eVar.f10221a.f12009a, 0, 4);
        eVar.f10222b = 4;
        for (long t2 = eVar.f10221a.t(); t2 != 440786851; t2 = ((t2 << 8) & (-256)) | (eVar.f10221a.f12009a[0] & UByte.MAX_VALUE)) {
            int i13 = eVar.f10222b + 1;
            eVar.f10222b = i13;
            if (i13 == i12) {
                return false;
            }
            iVar.o(eVar.f10221a.f12009a, 0, 1);
        }
        long a11 = eVar.a(iVar);
        long j11 = eVar.f10222b;
        if (a11 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a11 >= b10) {
            return false;
        }
        while (true) {
            int i14 = (eVar.f10222b > (j11 + a11) ? 1 : (eVar.f10222b == (j11 + a11) ? 0 : -1));
            if (i14 >= 0) {
                return i14 == 0;
            } else if (eVar.a(iVar) == Long.MIN_VALUE || (a10 = eVar.a(iVar)) < 0 || a10 > 2147483647L) {
                return false;
            } else {
                if (i10 != 0) {
                    int i15 = (int) a10;
                    iVar.g(i15);
                    eVar.f10222b += i15;
                }
            }
        }
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        h7.a aVar = (h7.a) this.f10167a;
        aVar.f10157e = 0;
        aVar.f10155b.clear();
        f fVar = aVar.f10156c;
        fVar.f10224b = 0;
        fVar.f10225c = 0;
        f fVar2 = this.f10169b;
        fVar2.f10224b = 0;
        fVar2.f10225c = 0;
        m();
        for (int i10 = 0; i10 < this.f10170c.size(); i10++) {
            C0145d c0145d = this.f10170c.valueAt(i10).T;
            if (c0145d != null) {
                c0145d.f10216b = false;
                c0145d.f10217c = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0457, code lost:
        throw com.google.android.exoplayer2.ParserException.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0938 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x093a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v158 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v89 */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(c7.i r29, c7.t r30) {
        /*
            Method dump skipped, instructions count: 2960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.d.h(c7.i, c7.t):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x088d, code lost:
        if (r3.m() == r5.getLeastSignificantBits()) goto L339;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0b00  */
    /* JADX WARN: Type inference failed for: r0v10, types: [h7.d$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(int r23) {
        /*
            Method dump skipped, instructions count: 3366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.d.i(int):void");
    }

    public final void l(i iVar, int i10) {
        t tVar = this.f10173g;
        if (tVar.f12011c >= i10) {
            return;
        }
        byte[] bArr = tVar.f12009a;
        if (bArr.length < i10) {
            tVar.b(Math.max(bArr.length * 2, i10));
        }
        t tVar2 = this.f10173g;
        byte[] bArr2 = tVar2.f12009a;
        int i11 = tVar2.f12011c;
        iVar.readFully(bArr2, i11, i10 - i11);
        this.f10173g.C(i10);
    }

    public final void m() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f10176j.z(0);
    }

    public final long n(long j10) {
        long j11 = this.f10183r;
        if (j11 != -9223372036854775807L) {
            return c0.D(j10, j11, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0194 A[EDGE_INSN: B:121:0x0194->B:56:0x0194 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(c7.i r13, h7.d.c r14, int r15) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.d.o(c7.i, h7.d$c, int):int");
    }

    public final void p(i iVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        t tVar = this.f10177k;
        byte[] bArr2 = tVar.f12009a;
        if (bArr2.length < length) {
            tVar.A(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        iVar.readFully(this.f10177k.f12009a, bArr.length, i10);
        this.f10177k.D(0);
        this.f10177k.C(length);
    }

    public final int q(i iVar, w wVar, int i10) {
        int a10 = this.f10176j.a();
        if (a10 > 0) {
            int min = Math.min(i10, a10);
            wVar.a(this.f10176j, min);
            return min;
        }
        return wVar.e(iVar, i10, false);
    }
}
