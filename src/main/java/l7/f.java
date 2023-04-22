package l7;

import java.util.Arrays;
import l7.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class f implements j {

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f12415v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12416a;

    /* renamed from: b  reason: collision with root package name */
    public final k8.s f12417b = new k8.s(new byte[7]);

    /* renamed from: c  reason: collision with root package name */
    public final k8.t f12418c = new k8.t(Arrays.copyOf(f12415v, 10));
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public String f12419e;

    /* renamed from: f  reason: collision with root package name */
    public c7.w f12420f;

    /* renamed from: g  reason: collision with root package name */
    public c7.w f12421g;

    /* renamed from: h  reason: collision with root package name */
    public int f12422h;

    /* renamed from: i  reason: collision with root package name */
    public int f12423i;

    /* renamed from: j  reason: collision with root package name */
    public int f12424j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12425k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12426l;

    /* renamed from: m  reason: collision with root package name */
    public int f12427m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f12428o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12429p;

    /* renamed from: q  reason: collision with root package name */
    public long f12430q;

    /* renamed from: r  reason: collision with root package name */
    public int f12431r;

    /* renamed from: s  reason: collision with root package name */
    public long f12432s;

    /* renamed from: t  reason: collision with root package name */
    public c7.w f12433t;

    /* renamed from: u  reason: collision with root package name */
    public long f12434u;

    public f(boolean z10, String str) {
        h();
        this.f12427m = -1;
        this.n = -1;
        this.f12430q = -9223372036854775807L;
        this.f12416a = z10;
        this.d = str;
    }

    public static boolean g(int i10) {
        return (i10 & 65526) == 65520;
    }

    public final boolean a(k8.t tVar, byte[] bArr, int i10) {
        int min = Math.min(tVar.a(), i10 - this.f12423i);
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, this.f12423i, min);
        tVar.f12010b += min;
        int i11 = this.f12423i + min;
        this.f12423i = i11;
        return i11 == i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x027c A[EDGE_INSN: B:157:0x027c->B:108:0x027c ?: BREAK  , SYNTHETIC] */
    @Override // l7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(k8.t r18) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.f.b(k8.t):void");
    }

    @Override // l7.j
    public void c() {
        this.f12426l = false;
        h();
    }

    @Override // l7.j
    public void d(c7.j jVar, d0.d dVar) {
        dVar.a();
        this.f12419e = dVar.b();
        c7.w r10 = jVar.r(dVar.c(), 1);
        this.f12420f = r10;
        this.f12433t = r10;
        if (!this.f12416a) {
            this.f12421g = new c7.g();
            return;
        }
        dVar.a();
        c7.w r11 = jVar.r(dVar.c(), 5);
        this.f12421g = r11;
        y.b bVar = new y.b();
        bVar.f16870a = dVar.b();
        bVar.f16879k = "application/id3";
        r11.d(bVar.a());
    }

    @Override // l7.j
    public void e() {
    }

    @Override // l7.j
    public void f(long j10, int i10) {
        this.f12432s = j10;
    }

    public final void h() {
        this.f12422h = 0;
        this.f12423i = 0;
        this.f12424j = 256;
    }

    public final boolean i(k8.t tVar, byte[] bArr, int i10) {
        if (tVar.a() < i10) {
            return false;
        }
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i10);
        tVar.f12010b += i10;
        return true;
    }
}
