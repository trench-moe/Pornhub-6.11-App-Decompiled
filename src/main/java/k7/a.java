package k7;

import c7.u;
import c7.v;
import k8.c0;

/* loaded from: classes2.dex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final e f11879a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11880b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11881c;
    public final h d;

    /* renamed from: e  reason: collision with root package name */
    public int f11882e;

    /* renamed from: f  reason: collision with root package name */
    public long f11883f;

    /* renamed from: g  reason: collision with root package name */
    public long f11884g;

    /* renamed from: h  reason: collision with root package name */
    public long f11885h;

    /* renamed from: i  reason: collision with root package name */
    public long f11886i;

    /* renamed from: j  reason: collision with root package name */
    public long f11887j;

    /* renamed from: k  reason: collision with root package name */
    public long f11888k;

    /* renamed from: l  reason: collision with root package name */
    public long f11889l;

    /* loaded from: classes2.dex */
    public final class b implements u {
        public b(C0172a c0172a) {
        }

        @Override // c7.u
        public boolean d() {
            return true;
        }

        @Override // c7.u
        public u.a i(long j10) {
            a aVar = a.this;
            long j11 = aVar.f11880b;
            long j12 = aVar.f11881c;
            return new u.a(new v(j10, c0.i(((((j12 - j11) * ((aVar.d.f11916i * j10) / 1000000)) / aVar.f11883f) + j11) - 30000, j11, j12 - 1)));
        }

        @Override // c7.u
        public long j() {
            a aVar = a.this;
            return (aVar.f11883f * 1000000) / aVar.d.f11916i;
        }
    }

    public a(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        k8.a.c(j10 >= 0 && j11 > j10);
        this.d = hVar;
        this.f11880b = j10;
        this.f11881c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f11883f = j13;
            this.f11882e = 4;
        } else {
            this.f11882e = 0;
        }
        this.f11879a = new e();
    }

    @Override // k7.f
    public u a() {
        return this.f11883f != 0 ? new b(null) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    @Override // k7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long b(c7.i r23) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.a.b(c7.i):long");
    }

    @Override // k7.f
    public void c(long j10) {
        this.f11885h = c0.i(j10, 0L, this.f11883f - 1);
        this.f11882e = 2;
        this.f11886i = this.f11880b;
        this.f11887j = this.f11881c;
        this.f11888k = 0L;
        this.f11889l = this.f11883f;
    }
}
