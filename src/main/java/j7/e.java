package j7;

import android.util.Log;
import android.util.SparseArray;
import c7.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.b;
import j7.a;
import j7.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import k8.c0;
import k8.q;
import k8.t;
import w6.y;
import w6.z;

/* loaded from: classes2.dex */
public class e implements c7.h {
    public static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final y G;
    public boolean A;
    public c7.j B;
    public w[] C;
    public w[] D;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    public final int f11449a;

    /* renamed from: b  reason: collision with root package name */
    public final List<y> f11450b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray<b> f11451c;
    public final t d;

    /* renamed from: e  reason: collision with root package name */
    public final t f11452e;

    /* renamed from: f  reason: collision with root package name */
    public final t f11453f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f11454g;

    /* renamed from: h  reason: collision with root package name */
    public final t f11455h;

    /* renamed from: i  reason: collision with root package name */
    public final z f11456i;

    /* renamed from: j  reason: collision with root package name */
    public final t f11457j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayDeque<a.C0166a> f11458k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayDeque<a> f11459l;

    /* renamed from: m  reason: collision with root package name */
    public int f11460m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public long f11461o;

    /* renamed from: p  reason: collision with root package name */
    public int f11462p;

    /* renamed from: q  reason: collision with root package name */
    public t f11463q;

    /* renamed from: r  reason: collision with root package name */
    public long f11464r;

    /* renamed from: s  reason: collision with root package name */
    public int f11465s;

    /* renamed from: t  reason: collision with root package name */
    public long f11466t;

    /* renamed from: u  reason: collision with root package name */
    public long f11467u;

    /* renamed from: v  reason: collision with root package name */
    public long f11468v;

    /* renamed from: w  reason: collision with root package name */
    public b f11469w;

    /* renamed from: x  reason: collision with root package name */
    public int f11470x;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f11471z;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f11472a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11473b;

        public a(long j10, int i10) {
            this.f11472a = j10;
            this.f11473b = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final w f11474a;
        public m d;

        /* renamed from: e  reason: collision with root package name */
        public c f11477e;

        /* renamed from: f  reason: collision with root package name */
        public int f11478f;

        /* renamed from: g  reason: collision with root package name */
        public int f11479g;

        /* renamed from: h  reason: collision with root package name */
        public int f11480h;

        /* renamed from: i  reason: collision with root package name */
        public int f11481i;

        /* renamed from: l  reason: collision with root package name */
        public boolean f11484l;

        /* renamed from: b  reason: collision with root package name */
        public final l f11475b = new l();

        /* renamed from: c  reason: collision with root package name */
        public final t f11476c = new t();

        /* renamed from: j  reason: collision with root package name */
        public final t f11482j = new t(1);

        /* renamed from: k  reason: collision with root package name */
        public final t f11483k = new t();

        public b(w wVar, m mVar, c cVar) {
            this.f11474a = wVar;
            this.d = mVar;
            this.f11477e = cVar;
            this.d = mVar;
            this.f11477e = cVar;
            wVar.d(mVar.f11550a.f11524f);
            e();
        }

        public long a() {
            return !this.f11484l ? this.d.f11552c[this.f11478f] : this.f11475b.f11538f[this.f11480h];
        }

        public k b() {
            k kVar = null;
            if (this.f11484l) {
                l lVar = this.f11475b;
                c cVar = lVar.f11534a;
                int i10 = c0.f11939a;
                int i11 = cVar.f11445a;
                k kVar2 = lVar.n;
                if (kVar2 == null) {
                    kVar2 = this.d.f11550a.a(i11);
                }
                if (kVar2 != null && kVar2.f11530a) {
                    kVar = kVar2;
                }
                return kVar;
            }
            return null;
        }

        public boolean c() {
            this.f11478f++;
            if (this.f11484l) {
                int i10 = this.f11479g + 1;
                this.f11479g = i10;
                int[] iArr = this.f11475b.f11539g;
                int i11 = this.f11480h;
                if (i10 == iArr[i11]) {
                    this.f11480h = i11 + 1;
                    this.f11479g = 0;
                    return false;
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r14, int r15) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j7.e.b.d(int, int):int");
        }

        public void e() {
            l lVar = this.f11475b;
            lVar.d = 0;
            lVar.f11548q = 0L;
            lVar.f11549r = false;
            lVar.f11544l = false;
            lVar.f11547p = false;
            lVar.n = null;
            this.f11478f = 0;
            this.f11480h = 0;
            this.f11479g = 0;
            this.f11481i = 0;
            this.f11484l = false;
        }
    }

    static {
        y.b bVar = new y.b();
        bVar.f16879k = "application/x-emsg";
        G = bVar.a();
    }

    public e(int i10) {
        List emptyList = Collections.emptyList();
        this.f11449a = i10;
        this.f11450b = Collections.unmodifiableList(emptyList);
        this.f11456i = new z(1);
        this.f11457j = new t(16);
        this.d = new t(q.f11982a);
        this.f11452e = new t(5);
        this.f11453f = new t();
        byte[] bArr = new byte[16];
        this.f11454g = bArr;
        this.f11455h = new t(bArr);
        this.f11458k = new ArrayDeque<>();
        this.f11459l = new ArrayDeque<>();
        this.f11451c = new SparseArray<>();
        this.f11467u = -9223372036854775807L;
        this.f11466t = -9223372036854775807L;
        this.f11468v = -9223372036854775807L;
        this.B = c7.j.f3804a;
        this.C = new w[0];
        this.D = new w[0];
    }

    public static int b(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw a1.a.d(38, "Unexpected negative value: ", i10, null);
    }

    public static com.google.android.exoplayer2.drm.b i(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f11433a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f11436b.f12009a;
                h.a a10 = h.a(bArr);
                UUID uuid = a10 == null ? null : a10.f11511a;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new b.C0080b(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.google.android.exoplayer2.drm.b(null, false, (b.C0080b[]) arrayList.toArray(new b.C0080b[0]));
    }

    public static void j(t tVar, int i10, l lVar) {
        tVar.D(i10 + 8);
        int f10 = tVar.f() & 16777215;
        if ((f10 & 1) != 0) {
            throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (f10 & 2) != 0;
        int v2 = tVar.v();
        if (v2 == 0) {
            Arrays.fill(lVar.f11545m, 0, lVar.f11537e, false);
            return;
        }
        int i11 = lVar.f11537e;
        if (v2 != i11) {
            throw ParserException.a(a1.a.h(80, "Senc sample count ", v2, " is different from fragment sample count", i11), null);
        }
        Arrays.fill(lVar.f11545m, 0, v2, z10);
        int a10 = tVar.a();
        t tVar2 = lVar.f11546o;
        byte[] bArr = tVar2.f12009a;
        if (bArr.length < a10) {
            bArr = new byte[a10];
        }
        tVar2.f12009a = bArr;
        tVar2.f12011c = a10;
        tVar2.f12010b = 0;
        lVar.f11544l = true;
        lVar.f11547p = true;
        tVar.e(bArr, 0, a10);
        lVar.f11546o.D(0);
        lVar.f11547p = false;
    }

    @Override // c7.h
    public void a() {
    }

    @Override // c7.h
    public void c(c7.j jVar) {
        int i10;
        this.B = jVar;
        d();
        w[] wVarArr = new w[2];
        this.C = wVarArr;
        int i11 = 100;
        int i12 = 0;
        if ((this.f11449a & 4) != 0) {
            wVarArr[0] = this.B.r(100, 5);
            i11 = 101;
            i10 = 1;
        } else {
            i10 = 0;
        }
        w[] wVarArr2 = (w[]) c0.B(this.C, i10);
        this.C = wVarArr2;
        for (w wVar : wVarArr2) {
            wVar.d(G);
        }
        this.D = new w[this.f11450b.size()];
        while (i12 < this.D.length) {
            w r10 = this.B.r(i11, 3);
            r10.d(this.f11450b.get(i12));
            this.D[i12] = r10;
            i12++;
            i11++;
        }
    }

    public final void d() {
        this.f11460m = 0;
        this.f11462p = 0;
    }

    public final c e(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        c cVar = sparseArray.get(i10);
        Objects.requireNonNull(cVar);
        return cVar;
    }

    @Override // c7.h
    public boolean f(c7.i iVar) {
        return b7.k.d(iVar, true, false);
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        int size = this.f11451c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f11451c.valueAt(i10).e();
        }
        this.f11459l.clear();
        this.f11465s = 0;
        this.f11466t = j11;
        this.f11458k.clear();
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:345:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0004 A[SYNTHETIC] */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(c7.i r25, c7.t r26) {
        /*
            Method dump skipped, instructions count: 1968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.e.h(c7.i, c7.t):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(long r48) {
        /*
            Method dump skipped, instructions count: 1979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.e.k(long):void");
    }
}
