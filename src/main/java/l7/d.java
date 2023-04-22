package l7;

import l7.d0;
import w6.y;
import y6.c;

/* loaded from: classes2.dex */
public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public final k8.s f12383a;

    /* renamed from: b  reason: collision with root package name */
    public final k8.t f12384b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12385c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public c7.w f12386e;

    /* renamed from: f  reason: collision with root package name */
    public int f12387f;

    /* renamed from: g  reason: collision with root package name */
    public int f12388g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12389h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12390i;

    /* renamed from: j  reason: collision with root package name */
    public long f12391j;

    /* renamed from: k  reason: collision with root package name */
    public w6.y f12392k;

    /* renamed from: l  reason: collision with root package name */
    public int f12393l;

    /* renamed from: m  reason: collision with root package name */
    public long f12394m;

    public d(String str) {
        k8.s sVar = new k8.s(new byte[16]);
        this.f12383a = sVar;
        this.f12384b = new k8.t(sVar.f12006a);
        this.f12387f = 0;
        this.f12388g = 0;
        this.f12389h = false;
        this.f12390i = false;
        this.f12385c = str;
    }

    @Override // l7.j
    public void b(k8.t tVar) {
        int i10;
        boolean z10;
        int s10;
        k8.a.g(this.f12386e);
        while (tVar.a() > 0) {
            int i11 = this.f12387f;
            if (i11 == 0) {
                while (true) {
                    i10 = 65;
                    if (tVar.a() <= 0) {
                        z10 = false;
                        break;
                    } else if (this.f12389h) {
                        s10 = tVar.s();
                        this.f12389h = s10 == 172;
                        if (s10 == 64 || s10 == 65) {
                            break;
                        }
                    } else {
                        this.f12389h = tVar.s() == 172;
                    }
                }
                this.f12390i = s10 == 65;
                z10 = true;
                if (z10) {
                    this.f12387f = 1;
                    byte[] bArr = this.f12384b.f12009a;
                    bArr[0] = -84;
                    if (!this.f12390i) {
                        i10 = 64;
                    }
                    bArr[1] = (byte) i10;
                    this.f12388g = 2;
                }
            } else if (i11 == 1) {
                byte[] bArr2 = this.f12384b.f12009a;
                int min = Math.min(tVar.a(), 16 - this.f12388g);
                System.arraycopy(tVar.f12009a, tVar.f12010b, bArr2, this.f12388g, min);
                tVar.f12010b += min;
                int i12 = this.f12388g + min;
                this.f12388g = i12;
                if (i12 == 16) {
                    this.f12383a.k(0);
                    c.b b10 = y6.c.b(this.f12383a);
                    w6.y yVar = this.f12392k;
                    if (yVar == null || 2 != yVar.O || b10.f18435a != yVar.P || !"audio/ac4".equals(yVar.B)) {
                        y.b bVar = new y.b();
                        bVar.f16870a = this.d;
                        bVar.f16879k = "audio/ac4";
                        bVar.f16891x = 2;
                        bVar.y = b10.f18435a;
                        bVar.f16872c = this.f12385c;
                        w6.y a10 = bVar.a();
                        this.f12392k = a10;
                        this.f12386e.d(a10);
                    }
                    this.f12393l = b10.f18436b;
                    this.f12391j = (b10.f18437c * 1000000) / this.f12392k.P;
                    this.f12384b.D(0);
                    this.f12386e.a(this.f12384b, 16);
                    this.f12387f = 2;
                }
            } else if (i11 == 2) {
                int min2 = Math.min(tVar.a(), this.f12393l - this.f12388g);
                this.f12386e.a(tVar, min2);
                int i13 = this.f12388g + min2;
                this.f12388g = i13;
                int i14 = this.f12393l;
                if (i13 == i14) {
                    this.f12386e.b(this.f12394m, 1, i14, 0, null);
                    this.f12394m += this.f12391j;
                    this.f12387f = 0;
                }
            }
        }
    }

    @Override // l7.j
    public void c() {
        this.f12387f = 0;
        this.f12388g = 0;
        this.f12389h = false;
        this.f12390i = false;
    }

    @Override // l7.j
    public void d(c7.j jVar, d0.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.f12386e = jVar.r(dVar.c(), 1);
    }

    @Override // l7.j
    public void e() {
    }

    @Override // l7.j
    public void f(long j10, int i10) {
        this.f12394m = j10;
    }
}
