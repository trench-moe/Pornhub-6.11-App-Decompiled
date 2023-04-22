package l7;

import kotlin.jvm.internal.ByteCompanionObject;
import l7.d0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes2.dex */
public final class n implements j {

    /* renamed from: a  reason: collision with root package name */
    public final z f12537a;

    /* renamed from: b  reason: collision with root package name */
    public String f12538b;

    /* renamed from: c  reason: collision with root package name */
    public c7.w f12539c;
    public a d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12540e;

    /* renamed from: l  reason: collision with root package name */
    public long f12547l;

    /* renamed from: m  reason: collision with root package name */
    public long f12548m;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f12541f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final r f12542g = new r(32, 128);

    /* renamed from: h  reason: collision with root package name */
    public final r f12543h = new r(33, 128);

    /* renamed from: i  reason: collision with root package name */
    public final r f12544i = new r(34, 128);

    /* renamed from: j  reason: collision with root package name */
    public final r f12545j = new r(39, 128);

    /* renamed from: k  reason: collision with root package name */
    public final r f12546k = new r(40, 128);
    public final k8.t n = new k8.t();

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final c7.w f12549a;

        /* renamed from: b  reason: collision with root package name */
        public long f12550b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12551c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public long f12552e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f12553f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f12554g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f12555h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f12556i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f12557j;

        /* renamed from: k  reason: collision with root package name */
        public long f12558k;

        /* renamed from: l  reason: collision with root package name */
        public long f12559l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f12560m;

        public a(c7.w wVar) {
            this.f12549a = wVar;
        }

        public final void a(int i10) {
            boolean z10 = this.f12560m;
            this.f12549a.b(this.f12559l, z10 ? 1 : 0, (int) (this.f12550b - this.f12558k), i10, null);
        }
    }

    public n(z zVar) {
        this.f12537a = zVar;
    }

    @RequiresNonNull({"sampleReader"})
    public final void a(byte[] bArr, int i10, int i11) {
        a aVar = this.d;
        if (aVar.f12553f) {
            int i12 = aVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                aVar.f12554g = (bArr[i13] & ByteCompanionObject.MIN_VALUE) != 0;
                aVar.f12553f = false;
            } else {
                aVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f12540e) {
            this.f12542g.a(bArr, i10, i11);
            this.f12543h.a(bArr, i10, i11);
            this.f12544i.a(bArr, i10, i11);
        }
        this.f12545j.a(bArr, i10, i11);
        this.f12546k.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x042a A[SYNTHETIC] */
    @Override // l7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(k8.t r28) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.n.b(k8.t):void");
    }

    @Override // l7.j
    public void c() {
        this.f12547l = 0L;
        k8.q.a(this.f12541f);
        this.f12542g.c();
        this.f12543h.c();
        this.f12544i.c();
        this.f12545j.c();
        this.f12546k.c();
        a aVar = this.d;
        if (aVar != null) {
            aVar.f12553f = false;
            aVar.f12554g = false;
            aVar.f12555h = false;
            aVar.f12556i = false;
            aVar.f12557j = false;
        }
    }

    @Override // l7.j
    public void d(c7.j jVar, d0.d dVar) {
        dVar.a();
        this.f12538b = dVar.b();
        c7.w r10 = jVar.r(dVar.c(), 2);
        this.f12539c = r10;
        this.d = new a(r10);
        this.f12537a.a(jVar, dVar);
    }

    @Override // l7.j
    public void e() {
    }

    @Override // l7.j
    public void f(long j10, int i10) {
        this.f12548m = j10;
    }
}
