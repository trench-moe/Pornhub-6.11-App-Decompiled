package f7;

import c7.h;
import c7.i;
import c7.j;
import c7.u;
import k8.t;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s6.p;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: f  reason: collision with root package name */
    public j f9467f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9469h;

    /* renamed from: i  reason: collision with root package name */
    public long f9470i;

    /* renamed from: j  reason: collision with root package name */
    public int f9471j;

    /* renamed from: k  reason: collision with root package name */
    public int f9472k;

    /* renamed from: l  reason: collision with root package name */
    public int f9473l;

    /* renamed from: m  reason: collision with root package name */
    public long f9474m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.flv.a f9475o;

    /* renamed from: p  reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.flv.b f9476p;

    /* renamed from: a  reason: collision with root package name */
    public final t f9463a = new t(4);

    /* renamed from: b  reason: collision with root package name */
    public final t f9464b = new t(9);

    /* renamed from: c  reason: collision with root package name */
    public final t f9465c = new t(11);
    public final t d = new t();

    /* renamed from: e  reason: collision with root package name */
    public final b f9466e = new b();

    /* renamed from: g  reason: collision with root package name */
    public int f9468g = 1;

    static {
        p pVar = p.f14877m;
    }

    @Override // c7.h
    public void a() {
    }

    @RequiresNonNull({"extractorOutput"})
    public final void b() {
        if (this.n) {
            return;
        }
        this.f9467f.g(new u.b(-9223372036854775807L, 0L));
        this.n = true;
    }

    @Override // c7.h
    public void c(j jVar) {
        this.f9467f = jVar;
    }

    public final t d(i iVar) {
        int i10 = this.f9473l;
        t tVar = this.d;
        byte[] bArr = tVar.f12009a;
        if (i10 > bArr.length) {
            tVar.f12009a = new byte[Math.max(bArr.length * 2, i10)];
            tVar.f12011c = 0;
            tVar.f12010b = 0;
        } else {
            tVar.D(0);
        }
        this.d.C(this.f9473l);
        iVar.readFully(this.d.f12009a, 0, this.f9473l);
        return this.d;
    }

    @Override // c7.h
    public boolean f(i iVar) {
        iVar.o(this.f9463a.f12009a, 0, 3);
        this.f9463a.D(0);
        if (this.f9463a.u() != 4607062) {
            return false;
        }
        iVar.o(this.f9463a.f12009a, 0, 2);
        this.f9463a.D(0);
        if ((this.f9463a.x() & 250) != 0) {
            return false;
        }
        iVar.o(this.f9463a.f12009a, 0, 4);
        this.f9463a.D(0);
        int f10 = this.f9463a.f();
        iVar.l();
        iVar.g(f10);
        iVar.o(this.f9463a.f12009a, 0, 4);
        this.f9463a.D(0);
        return this.f9463a.f() == 0;
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        if (j10 == 0) {
            this.f9468g = 1;
            this.f9469h = false;
        } else {
            this.f9468g = 3;
        }
        this.f9471j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0009 A[SYNTHETIC] */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(c7.i r17, c7.t r18) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.a.h(c7.i, c7.t):int");
    }
}
