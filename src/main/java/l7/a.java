package l7;

import c7.u;
import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public final class a implements c7.h {

    /* renamed from: a  reason: collision with root package name */
    public final b f12332a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    public final k8.t f12333b = new k8.t(2786);

    /* renamed from: c  reason: collision with root package name */
    public boolean f12334c;

    static {
        s6.o oVar = s6.o.n;
    }

    @Override // c7.h
    public void a() {
    }

    @Override // c7.h
    public void c(c7.j jVar) {
        b bVar = this.f12332a;
        bVar.d = android.support.v4.media.b.e(BuildConfig.FLAVOR.length() + 11, BuildConfig.FLAVOR, 0);
        bVar.f12341e = jVar.r(0, 1);
        jVar.l();
        jVar.g(new u.b(-9223372036854775807L, 0L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        if ((r5 - r3) < 8192) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
        r15.l();
        r5 = r5 + 1;
     */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(c7.i r15) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.a.f(c7.i):boolean");
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        this.f12334c = false;
        this.f12332a.c();
    }

    @Override // c7.h
    public int h(c7.i iVar, c7.t tVar) {
        int a10 = iVar.a(this.f12333b.f12009a, 0, 2786);
        if (a10 == -1) {
            return -1;
        }
        this.f12333b.D(0);
        this.f12333b.C(a10);
        if (!this.f12334c) {
            this.f12332a.f12348l = 0L;
            this.f12334c = true;
        }
        this.f12332a.b(this.f12333b);
        return 0;
    }
}
