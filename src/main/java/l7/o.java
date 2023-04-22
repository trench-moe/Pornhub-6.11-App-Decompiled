package l7;

import android.util.Log;
import l7.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    public final k8.t f12561a = new k8.t(10);

    /* renamed from: b  reason: collision with root package name */
    public c7.w f12562b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12563c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public int f12564e;

    /* renamed from: f  reason: collision with root package name */
    public int f12565f;

    @Override // l7.j
    public void b(k8.t tVar) {
        k8.a.g(this.f12562b);
        if (this.f12563c) {
            int a10 = tVar.a();
            int i10 = this.f12565f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(tVar.f12009a, tVar.f12010b, this.f12561a.f12009a, this.f12565f, min);
                if (this.f12565f + min == 10) {
                    this.f12561a.D(0);
                    if (73 == this.f12561a.s() && 68 == this.f12561a.s() && 51 == this.f12561a.s()) {
                        this.f12561a.E(3);
                        this.f12564e = this.f12561a.r() + 10;
                        int min2 = Math.min(a10, this.f12564e - this.f12565f);
                        this.f12562b.a(tVar, min2);
                        this.f12565f += min2;
                    }
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.f12563c = false;
                    return;
                }
            }
            int min22 = Math.min(a10, this.f12564e - this.f12565f);
            this.f12562b.a(tVar, min22);
            this.f12565f += min22;
        }
    }

    @Override // l7.j
    public void c() {
        this.f12563c = false;
    }

    @Override // l7.j
    public void d(c7.j jVar, d0.d dVar) {
        dVar.a();
        c7.w r10 = jVar.r(dVar.c(), 5);
        this.f12562b = r10;
        y.b bVar = new y.b();
        bVar.f16870a = dVar.b();
        bVar.f16879k = "application/id3";
        r10.d(bVar.a());
    }

    @Override // l7.j
    public void e() {
        int i10;
        k8.a.g(this.f12562b);
        if (this.f12563c && (i10 = this.f12564e) != 0 && this.f12565f == i10) {
            this.f12562b.b(this.d, 1, i10, 0, null);
            this.f12563c = false;
        }
    }

    @Override // l7.j
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f12563c = true;
        this.d = j10;
        this.f12564e = 0;
        this.f12565f = 0;
    }
}
