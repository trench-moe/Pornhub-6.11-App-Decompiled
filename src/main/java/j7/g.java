package j7;

import c7.u;
import c7.v;
import c7.w;
import j7.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k8.q;
import k8.t;
import o7.a;
import s6.o;

/* loaded from: classes2.dex */
public final class g implements c7.h, u {
    public static final /* synthetic */ int y = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f11486a;

    /* renamed from: b  reason: collision with root package name */
    public final t f11487b;

    /* renamed from: c  reason: collision with root package name */
    public final t f11488c;
    public final t d;

    /* renamed from: e  reason: collision with root package name */
    public final t f11489e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<a.C0166a> f11490f;

    /* renamed from: g  reason: collision with root package name */
    public final i f11491g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a.b> f11492h;

    /* renamed from: i  reason: collision with root package name */
    public int f11493i;

    /* renamed from: j  reason: collision with root package name */
    public int f11494j;

    /* renamed from: k  reason: collision with root package name */
    public long f11495k;

    /* renamed from: l  reason: collision with root package name */
    public int f11496l;

    /* renamed from: m  reason: collision with root package name */
    public t f11497m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f11498o;

    /* renamed from: p  reason: collision with root package name */
    public int f11499p;

    /* renamed from: q  reason: collision with root package name */
    public int f11500q;

    /* renamed from: r  reason: collision with root package name */
    public c7.j f11501r;

    /* renamed from: s  reason: collision with root package name */
    public a[] f11502s;

    /* renamed from: t  reason: collision with root package name */
    public long[][] f11503t;

    /* renamed from: u  reason: collision with root package name */
    public int f11504u;

    /* renamed from: v  reason: collision with root package name */
    public long f11505v;

    /* renamed from: w  reason: collision with root package name */
    public int f11506w;

    /* renamed from: x  reason: collision with root package name */
    public u7.b f11507x;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f11508a;

        /* renamed from: b  reason: collision with root package name */
        public final m f11509b;

        /* renamed from: c  reason: collision with root package name */
        public final w f11510c;
        public int d;

        public a(j jVar, m mVar, w wVar) {
            this.f11508a = jVar;
            this.f11509b = mVar;
            this.f11510c = wVar;
        }
    }

    static {
        o oVar = o.f14872m;
    }

    public g(int i10) {
        this.f11486a = i10;
        this.f11493i = (i10 & 4) != 0 ? 3 : 0;
        this.f11491g = new i();
        this.f11492h = new ArrayList();
        this.f11489e = new t(16);
        this.f11490f = new ArrayDeque<>();
        this.f11487b = new t(q.f11982a);
        this.f11488c = new t(4);
        this.d = new t();
        this.n = -1;
    }

    public static long l(m mVar, long j10, long j11) {
        int a10 = mVar.a(j10);
        if (a10 == -1) {
            a10 = mVar.b(j10);
        }
        return a10 == -1 ? j11 : Math.min(mVar.f11552c[a10], j11);
    }

    @Override // c7.h
    public void a() {
    }

    @Override // c7.h
    public void c(c7.j jVar) {
        this.f11501r = jVar;
    }

    @Override // c7.u
    public boolean d() {
        return true;
    }

    @Override // c7.h
    public boolean f(c7.i iVar) {
        return b7.k.d(iVar, false, (this.f11486a & 2) != 0);
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        this.f11490f.clear();
        this.f11496l = 0;
        this.n = -1;
        this.f11498o = 0;
        this.f11499p = 0;
        this.f11500q = 0;
        if (j10 == 0) {
            if (this.f11493i != 3) {
                k();
                return;
            }
            i iVar = this.f11491g;
            iVar.f11515a.clear();
            iVar.f11516b = 0;
            this.f11492h.clear();
            return;
        }
        a[] aVarArr = this.f11502s;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                m mVar = aVar.f11509b;
                int a10 = mVar.a(j11);
                if (a10 == -1) {
                    a10 = mVar.b(j11);
                }
                aVar.d = a10;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0006 A[SYNTHETIC] */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(c7.i r35, c7.t r36) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.g.h(c7.i, c7.t):int");
    }

    @Override // c7.u
    public u.a i(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        long j15 = j10;
        a[] aVarArr = this.f11502s;
        Objects.requireNonNull(aVarArr);
        if (aVarArr.length == 0) {
            return new u.a(v.f3833c);
        }
        long j16 = -1;
        int i10 = this.f11504u;
        if (i10 != -1) {
            m mVar = this.f11502s[i10].f11509b;
            int a10 = mVar.a(j15);
            if (a10 == -1) {
                a10 = mVar.b(j15);
            }
            if (a10 == -1) {
                return new u.a(v.f3833c);
            }
            long j17 = mVar.f11554f[a10];
            j11 = mVar.f11552c[a10];
            if (j17 >= j15 || a10 >= mVar.f11551b - 1 || (b10 = mVar.b(j15)) == -1 || b10 == a10) {
                j14 = -9223372036854775807L;
            } else {
                long j18 = mVar.f11554f[b10];
                long j19 = mVar.f11552c[b10];
                j14 = j18;
                j16 = j19;
            }
            j12 = j16;
            j13 = j14;
            j15 = j17;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr2 = this.f11502s;
            if (i11 >= aVarArr2.length) {
                break;
            }
            if (i11 != this.f11504u) {
                m mVar2 = aVarArr2[i11].f11509b;
                long l10 = l(mVar2, j15, j11);
                if (j13 != -9223372036854775807L) {
                    j12 = l(mVar2, j13, j12);
                }
                j11 = l10;
            }
            i11++;
        }
        v vVar = new v(j15, j11);
        return j13 == -9223372036854775807L ? new u.a(vVar) : new u.a(vVar, new v(j13, j12));
    }

    @Override // c7.u
    public long j() {
        return this.f11505v;
    }

    public final void k() {
        this.f11493i = 0;
        this.f11496l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
        r13 = r3.o(r11 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ea, code lost:
        if (r9 != 1851878757) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ec, code lost:
        r6 = r3.o(r11 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f6, code lost:
        if (r9 != 1684108385) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f8, code lost:
        r5 = r11;
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fb, code lost:
        r3.E(r11 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0200, code lost:
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0203, code lost:
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0205, code lost:
        if (r13 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0207, code lost:
        if (r6 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020b, code lost:
        if (r0 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020f, code lost:
        r3.D(r0);
        r3.E(16);
        r0 = new t7.i(r13, r6, r3.o(r5 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0227, code lost:
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022b, code lost:
        r19 = r8;
        r8 = 16777215 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0234, code lost:
        if (r8 != 6516084) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0236, code lost:
        r0 = j7.f.a(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x023c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0242, code lost:
        if (r8 == 7233901) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0247, code lost:
        if (r8 != 7631467) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x024e, code lost:
        if (r8 == 6516589) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0253, code lost:
        if (r8 != 7828084) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x025a, code lost:
        if (r8 != 6578553) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x025c, code lost:
        r0 = j7.f.d(r5, "TDRC", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0267, code lost:
        if (r8 != 4280916) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0269, code lost:
        r0 = j7.f.d(r5, "TPE1", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0273, code lost:
        if (r8 != 7630703) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0275, code lost:
        r0 = j7.f.d(r5, "TSSE", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027f, code lost:
        if (r8 != 6384738) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0281, code lost:
        r0 = j7.f.d(r5, "TALB", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x028b, code lost:
        if (r8 != 7108978) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x028d, code lost:
        r0 = j7.f.d(r5, "USLT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0297, code lost:
        if (r8 != 6776174) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0299, code lost:
        r0 = j7.f.d(r5, "TCON", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a1, code lost:
        if (r8 != 6779504) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02a3, code lost:
        r0 = j7.f.d(r5, "TIT1", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02aa, code lost:
        r5 = java.lang.String.valueOf(j7.a.a(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02b8, code lost:
        if (r5.length() == 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ba, code lost:
        r5 = "Skipped unknown metadata entry: ".concat(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02bf, code lost:
        r5 = new java.lang.String("Skipped unknown metadata entry: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02c4, code lost:
        android.util.Log.d("MetadataUtil", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c7, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ca, code lost:
        r0 = j7.f.d(r5, "TCOM", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d1, code lost:
        r0 = j7.f.d(r5, "TIT2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02da, code lost:
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02dc, code lost:
        r4.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02df, code lost:
        r13 = null;
        r6 = r16;
        r0 = r17;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02e9, code lost:
        r3.D(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ec, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02ed, code lost:
        r17 = r0;
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f5, code lost:
        if (r4.isEmpty() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02f8, code lost:
        r0 = new o7.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
        r3.D(r6);
        r6 = r6 + r7;
        r3.E(r9);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
        r5 = r3.f12010b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (r5 >= r6) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
        r7 = r3.f() + r5;
        r5 = r3.f();
        r9 = (r5 >> 24) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
        r16 = r6;
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
        if (r9 == 169) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
        if (r9 != 253) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
        if (r5 != 1735291493) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
        r5 = j7.f.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
        if (r5 <= 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
        r9 = j7.f.f11485a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
        if (r5 > r9.length) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
        r5 = r9[r5 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
        if (r5 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
        r0 = new t7.l("TCON", r13, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
        if (r5 != 1684632427) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fb, code lost:
        r0 = j7.f.c(r5, "TPOS", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
        if (r5 != 1953655662) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0108, code lost:
        r0 = j7.f.c(r5, "TRCK", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
        if (r5 != 1953329263) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
        r0 = j7.f.e(r5, "TBPM", r3, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
        if (r5 != 1668311404) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0125, code lost:
        r0 = j7.f.e(r5, "TCMP", r3, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
        if (r5 != 1668249202) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
        r0 = j7.f.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013d, code lost:
        if (r5 != 1631670868) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013f, code lost:
        r0 = j7.f.d(r5, "TPE2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
        if (r5 != 1936682605) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
        r0 = j7.f.d(r5, "TSOT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0156, code lost:
        if (r5 != 1936679276) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
        r0 = j7.f.d(r5, "TSO2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0162, code lost:
        if (r5 != 1936679282) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
        r0 = j7.f.d(r5, "TSOA", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016e, code lost:
        if (r5 != 1936679265) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
        r0 = j7.f.d(r5, "TSOP", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
        if (r5 != 1936679791) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017c, code lost:
        r0 = j7.f.d(r5, "TSOC", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0186, code lost:
        if (r5 != 1920233063) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0188, code lost:
        r0 = j7.f.e(r5, "ITUNESADVISORY", r3, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0194, code lost:
        if (r5 != 1885823344) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0196, code lost:
        r0 = j7.f.e(r5, "ITUNESGAPLESS", r3, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a4, code lost:
        if (r5 != 1936683886) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
        r0 = j7.f.d(r5, "TVSHOWSORT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b0, code lost:
        if (r5 != 1953919848) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
        r0 = j7.f.d(r5, "TVSHOW", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b8, code lost:
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bf, code lost:
        if (r5 != 757935405) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c1, code lost:
        r0 = -1;
        r5 = -1;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c6, code lost:
        r9 = r3.f12010b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c8, code lost:
        if (r9 >= r7) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ca, code lost:
        r11 = r3.f();
        r9 = r3.f();
        r19 = r8;
        r3.E(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01dd, code lost:
        if (r9 != 1835360622) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x063a A[LOOP:12: B:309:0x0637->B:311:0x063a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0656  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(long r23) {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.g.m(long):void");
    }
}
