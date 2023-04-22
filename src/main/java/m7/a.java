package m7;

import c7.h;
import c7.i;
import c7.j;
import c7.w;
import com.google.android.exoplayer2.ParserException;
import k8.c0;
import k8.t;
import kotlin.KotlinVersion;
import s6.p;
import w6.y;

/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public j f12929a;

    /* renamed from: b  reason: collision with root package name */
    public w f12930b;

    /* renamed from: c  reason: collision with root package name */
    public b f12931c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f12932e = -1;

    /* renamed from: m7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0212a implements b {

        /* renamed from: m  reason: collision with root package name */
        public static final int[] f12933m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        public final j f12934a;

        /* renamed from: b  reason: collision with root package name */
        public final w f12935b;

        /* renamed from: c  reason: collision with root package name */
        public final m7.b f12936c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f12937e;

        /* renamed from: f  reason: collision with root package name */
        public final t f12938f;

        /* renamed from: g  reason: collision with root package name */
        public final int f12939g;

        /* renamed from: h  reason: collision with root package name */
        public final y f12940h;

        /* renamed from: i  reason: collision with root package name */
        public int f12941i;

        /* renamed from: j  reason: collision with root package name */
        public long f12942j;

        /* renamed from: k  reason: collision with root package name */
        public int f12943k;

        /* renamed from: l  reason: collision with root package name */
        public long f12944l;

        public C0212a(j jVar, w wVar, m7.b bVar) {
            this.f12934a = jVar;
            this.f12935b = wVar;
            this.f12936c = bVar;
            int max = Math.max(1, bVar.f12954c / 10);
            this.f12939g = max;
            byte[] bArr = bVar.f12956f;
            int length = bArr.length;
            byte b10 = bArr[0];
            byte b11 = bArr[1];
            int i10 = ((bArr[3] & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (bArr[2] & KotlinVersion.MAX_COMPONENT_VALUE);
            this.d = i10;
            int i11 = bVar.f12953b;
            int i12 = (((bVar.d - (i11 * 4)) * 8) / (bVar.f12955e * i11)) + 1;
            if (i10 != i12) {
                throw ParserException.a(a1.a.h(56, "Expected frames per block: ", i12, "; got: ", i10), null);
            }
            int f10 = c0.f(max, i10);
            this.f12937e = new byte[bVar.d * f10];
            this.f12938f = new t(i10 * 2 * i11 * f10);
            int i13 = bVar.f12954c;
            int i14 = ((bVar.d * i13) * 8) / i10;
            y.b bVar2 = new y.b();
            bVar2.f16879k = "audio/raw";
            bVar2.f16874f = i14;
            bVar2.f16875g = i14;
            bVar2.f16880l = max * 2 * i11;
            bVar2.f16891x = bVar.f12953b;
            bVar2.y = i13;
            bVar2.f16892z = 2;
            this.f12940h = bVar2.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[LOOP:0: B:6:0x0028->B:13:0x0044, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0041 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003f -> B:12:0x0041). Please submit an issue!!! */
        @Override // m7.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(c7.i r19, long r20) {
            /*
                Method dump skipped, instructions count: 374
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m7.a.C0212a.a(c7.i, long):boolean");
        }

        @Override // m7.a.b
        public void b(long j10) {
            this.f12941i = 0;
            this.f12942j = j10;
            this.f12943k = 0;
            this.f12944l = 0L;
        }

        @Override // m7.a.b
        public void c(int i10, long j10) {
            this.f12934a.g(new d(this.f12936c, this.d, i10, j10));
            this.f12935b.d(this.f12940h);
        }

        public final int d(int i10) {
            return i10 / (this.f12936c.f12953b * 2);
        }

        public final void e(int i10) {
            long D = this.f12942j + c0.D(this.f12944l, 1000000L, this.f12936c.f12954c);
            int i11 = i10 * 2 * this.f12936c.f12953b;
            this.f12935b.b(D, 1, i11, this.f12943k - i11, null);
            this.f12944l += i10;
            this.f12943k -= i11;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        boolean a(i iVar, long j10);

        void b(long j10);

        void c(int i10, long j10);
    }

    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final j f12945a;

        /* renamed from: b  reason: collision with root package name */
        public final w f12946b;

        /* renamed from: c  reason: collision with root package name */
        public final m7.b f12947c;
        public final y d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12948e;

        /* renamed from: f  reason: collision with root package name */
        public long f12949f;

        /* renamed from: g  reason: collision with root package name */
        public int f12950g;

        /* renamed from: h  reason: collision with root package name */
        public long f12951h;

        public c(j jVar, w wVar, m7.b bVar, String str, int i10) {
            this.f12945a = jVar;
            this.f12946b = wVar;
            this.f12947c = bVar;
            int i11 = (bVar.f12953b * bVar.f12955e) / 8;
            int i12 = bVar.d;
            if (i12 != i11) {
                throw ParserException.a(a1.a.h(50, "Expected block size: ", i11, "; got: ", i12), null);
            }
            int i13 = bVar.f12954c * i11;
            int i14 = i13 * 8;
            int max = Math.max(i11, i13 / 10);
            this.f12948e = max;
            y.b bVar2 = new y.b();
            bVar2.f16879k = str;
            bVar2.f16874f = i14;
            bVar2.f16875g = i14;
            bVar2.f16880l = max;
            bVar2.f16891x = bVar.f12953b;
            bVar2.y = bVar.f12954c;
            bVar2.f16892z = i10;
            this.d = bVar2.a();
        }

        @Override // m7.a.b
        public boolean a(i iVar, long j10) {
            int i10;
            m7.b bVar;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f12950g) >= (i12 = this.f12948e)) {
                    break;
                }
                int e10 = this.f12946b.e(iVar, (int) Math.min(i12 - i11, j11), true);
                if (e10 == -1) {
                    j11 = 0;
                } else {
                    this.f12950g += e10;
                    j11 -= e10;
                }
            }
            int i13 = this.f12947c.d;
            int i14 = this.f12950g / i13;
            if (i14 > 0) {
                int i15 = i14 * i13;
                int i16 = this.f12950g - i15;
                this.f12946b.b(this.f12949f + c0.D(this.f12951h, 1000000L, bVar.f12954c), 1, i15, i16, null);
                this.f12951h += i14;
                this.f12950g = i16;
            }
            return i10 <= 0;
        }

        @Override // m7.a.b
        public void b(long j10) {
            this.f12949f = j10;
            this.f12950g = 0;
            this.f12951h = 0L;
        }

        @Override // m7.a.b
        public void c(int i10, long j10) {
            this.f12945a.g(new d(this.f12947c, 1, i10, j10));
            this.f12946b.d(this.d);
        }
    }

    static {
        p pVar = p.f14879u;
    }

    @Override // c7.h
    public void a() {
    }

    @Override // c7.h
    public void c(j jVar) {
        this.f12929a = jVar;
        this.f12930b = jVar.r(0, 1);
        jVar.l();
    }

    @Override // c7.h
    public boolean f(i iVar) {
        return m7.c.a(iVar) != null;
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        b bVar = this.f12931c;
        if (bVar != null) {
            bVar.b(j11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // c7.h
    public int h(c7.i r14, c7.t r15) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.a.h(c7.i, c7.t):int");
    }
}
