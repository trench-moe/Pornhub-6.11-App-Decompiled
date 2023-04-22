package l7;

import kotlin.UByte;
import kotlin.io.ConstantsKt;
import l7.d0;
import w6.y;
import y6.p;

/* loaded from: classes2.dex */
public final class q implements j {

    /* renamed from: a  reason: collision with root package name */
    public final k8.t f12585a;

    /* renamed from: b  reason: collision with root package name */
    public final p.a f12586b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12587c;
    public c7.w d;

    /* renamed from: e  reason: collision with root package name */
    public String f12588e;

    /* renamed from: f  reason: collision with root package name */
    public int f12589f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f12590g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12591h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12592i;

    /* renamed from: j  reason: collision with root package name */
    public long f12593j;

    /* renamed from: k  reason: collision with root package name */
    public int f12594k;

    /* renamed from: l  reason: collision with root package name */
    public long f12595l;

    public q(String str) {
        k8.t tVar = new k8.t(4);
        this.f12585a = tVar;
        tVar.f12009a[0] = -1;
        this.f12586b = new p.a();
        this.f12587c = str;
    }

    @Override // l7.j
    public void b(k8.t tVar) {
        k8.a.g(this.d);
        while (tVar.a() > 0) {
            int i10 = this.f12589f;
            if (i10 == 0) {
                byte[] bArr = tVar.f12009a;
                int i11 = tVar.f12010b;
                int i12 = tVar.f12011c;
                while (true) {
                    if (i11 >= i12) {
                        tVar.D(i12);
                        break;
                    }
                    boolean z10 = (bArr[i11] & UByte.MAX_VALUE) == 255;
                    boolean z11 = this.f12592i && (bArr[i11] & 224) == 224;
                    this.f12592i = z10;
                    if (z11) {
                        tVar.D(i11 + 1);
                        this.f12592i = false;
                        this.f12585a.f12009a[1] = bArr[i11];
                        this.f12590g = 2;
                        this.f12589f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int min = Math.min(tVar.a(), 4 - this.f12590g);
                tVar.e(this.f12585a.f12009a, this.f12590g, min);
                int i13 = this.f12590g + min;
                this.f12590g = i13;
                if (i13 >= 4) {
                    this.f12585a.D(0);
                    if (this.f12586b.a(this.f12585a.f())) {
                        p.a aVar = this.f12586b;
                        this.f12594k = aVar.f18487c;
                        if (!this.f12591h) {
                            int i14 = aVar.d;
                            this.f12593j = (aVar.f18490g * 1000000) / i14;
                            y.b bVar = new y.b();
                            bVar.f16870a = this.f12588e;
                            bVar.f16879k = aVar.f18486b;
                            bVar.f16880l = ConstantsKt.DEFAULT_BLOCK_SIZE;
                            bVar.f16891x = aVar.f18488e;
                            bVar.y = i14;
                            bVar.f16872c = this.f12587c;
                            this.d.d(bVar.a());
                            this.f12591h = true;
                        }
                        this.f12585a.D(0);
                        this.d.a(this.f12585a, 4);
                        this.f12589f = 2;
                    } else {
                        this.f12590g = 0;
                        this.f12589f = 1;
                    }
                }
            } else if (i10 != 2) {
                throw new IllegalStateException();
            } else {
                int min2 = Math.min(tVar.a(), this.f12594k - this.f12590g);
                this.d.a(tVar, min2);
                int i15 = this.f12590g + min2;
                this.f12590g = i15;
                int i16 = this.f12594k;
                if (i15 >= i16) {
                    this.d.b(this.f12595l, 1, i16, 0, null);
                    this.f12595l += this.f12593j;
                    this.f12590g = 0;
                    this.f12589f = 0;
                }
            }
        }
    }

    @Override // l7.j
    public void c() {
        this.f12589f = 0;
        this.f12590g = 0;
        this.f12592i = false;
    }

    @Override // l7.j
    public void d(c7.j jVar, d0.d dVar) {
        dVar.a();
        this.f12588e = dVar.b();
        this.d = jVar.r(dVar.c(), 1);
    }

    @Override // l7.j
    public void e() {
    }

    @Override // l7.j
    public void f(long j10, int i10) {
        this.f12595l = j10;
    }
}
