package l7;

import l7.d0;
import y6.a;

/* loaded from: classes2.dex */
public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    public final String f12566a;

    /* renamed from: b  reason: collision with root package name */
    public final k8.t f12567b;

    /* renamed from: c  reason: collision with root package name */
    public final k8.s f12568c;
    public c7.w d;

    /* renamed from: e  reason: collision with root package name */
    public String f12569e;

    /* renamed from: f  reason: collision with root package name */
    public w6.y f12570f;

    /* renamed from: g  reason: collision with root package name */
    public int f12571g;

    /* renamed from: h  reason: collision with root package name */
    public int f12572h;

    /* renamed from: i  reason: collision with root package name */
    public int f12573i;

    /* renamed from: j  reason: collision with root package name */
    public int f12574j;

    /* renamed from: k  reason: collision with root package name */
    public long f12575k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12576l;

    /* renamed from: m  reason: collision with root package name */
    public int f12577m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f12578o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12579p;

    /* renamed from: q  reason: collision with root package name */
    public long f12580q;

    /* renamed from: r  reason: collision with root package name */
    public int f12581r;

    /* renamed from: s  reason: collision with root package name */
    public long f12582s;

    /* renamed from: t  reason: collision with root package name */
    public int f12583t;

    /* renamed from: u  reason: collision with root package name */
    public String f12584u;

    public p(String str) {
        this.f12566a = str;
        k8.t tVar = new k8.t(1024);
        this.f12567b = tVar;
        this.f12568c = new k8.s(tVar.f12009a);
    }

    public static long a(k8.s sVar) {
        return sVar.g((sVar.g(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
        if (r14.f12576l == false) goto L106;
     */
    @Override // l7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(k8.t r15) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.p.b(k8.t):void");
    }

    @Override // l7.j
    public void c() {
        this.f12571g = 0;
        this.f12576l = false;
    }

    @Override // l7.j
    public void d(c7.j jVar, d0.d dVar) {
        dVar.a();
        this.d = jVar.r(dVar.c(), 1);
        this.f12569e = dVar.b();
    }

    @Override // l7.j
    public void e() {
    }

    @Override // l7.j
    public void f(long j10, int i10) {
        this.f12575k = j10;
    }

    public final int g(k8.s sVar) {
        int b10 = sVar.b();
        a.b c10 = y6.a.c(sVar, true);
        this.f12584u = c10.f18428c;
        this.f12581r = c10.f18426a;
        this.f12583t = c10.f18427b;
        return b10 - sVar.b();
    }
}
