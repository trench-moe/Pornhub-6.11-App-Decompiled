package l7;

import c7.u;
import kotlin.jvm.internal.IntCompanionObject;
import l.InterfaceC0186;
import l7.d0;

/* loaded from: classes2.dex */
public final class e implements c7.h {

    /* renamed from: c  reason: collision with root package name */
    public final k8.t f12406c;
    public final k8.s d;

    /* renamed from: e  reason: collision with root package name */
    public c7.j f12407e;

    /* renamed from: f  reason: collision with root package name */
    public long f12408f;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12411i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12412j;

    /* renamed from: a  reason: collision with root package name */
    public final f f12404a = new f(true, null);

    /* renamed from: b  reason: collision with root package name */
    public final k8.t f12405b = new k8.t((int) InterfaceC0186.f43);

    /* renamed from: h  reason: collision with root package name */
    public int f12410h = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f12409g = -1;

    static {
        k0.c cVar = k0.c.C;
    }

    public e(int i10) {
        k8.t tVar = new k8.t(10);
        this.f12406c = tVar;
        this.d = new k8.s(tVar.f12009a);
    }

    @Override // c7.h
    public void a() {
    }

    public final int b(c7.i iVar) {
        int i10 = 0;
        while (true) {
            iVar.o(this.f12406c.f12009a, 0, 10);
            this.f12406c.D(0);
            if (this.f12406c.u() != 4801587) {
                break;
            }
            this.f12406c.E(3);
            int r10 = this.f12406c.r();
            i10 += r10 + 10;
            iVar.g(r10);
        }
        iVar.l();
        iVar.g(i10);
        if (this.f12409g == -1) {
            this.f12409g = i10;
        }
        return i10;
    }

    @Override // c7.h
    public void c(c7.j jVar) {
        this.f12407e = jVar;
        this.f12404a.d(jVar, new d0.d(IntCompanionObject.MIN_VALUE, 0, 1));
        jVar.l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
        r13.l();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
        if ((r3 - r11) < 8192) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
        return false;
     */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(c7.i r13) {
        /*
            r12 = this;
            r8 = r12
            int r11 = r8.b(r13)
            r0 = r11
            r11 = 0
            r1 = r11
            r3 = r0
        L9:
            r10 = 0
            r2 = r10
            r4 = 0
        Lc:
            k8.t r5 = r8.f12406c
            byte[] r5 = r5.f12009a
            r6 = 2
            r13.o(r5, r1, r6)
            k8.t r5 = r8.f12406c
            r5.D(r1)
            r11 = 7
            k8.t r5 = r8.f12406c
            r11 = 6
            int r5 = r5.x()
            boolean r10 = l7.f.g(r5)
            r5 = r10
            if (r5 != 0) goto L3d
            r13.l()
            r11 = 1
            int r3 = r3 + 1
            r11 = 2
            int r2 = r3 - r0
            r11 = 2
            r10 = 8192(0x2000, float:1.148E-41)
            r4 = r10
            if (r2 < r4) goto L38
            return r1
        L38:
            r11 = 4
            r13.g(r3)
            goto L9
        L3d:
            r11 = 1
            r5 = r11
            int r2 = r2 + r5
            r11 = 7
            r11 = 4
            r6 = r11
            if (r2 < r6) goto L4d
            r11 = 5
            r11 = 188(0xbc, float:2.63E-43)
            r7 = r11
            if (r4 <= r7) goto L4d
            r11 = 5
            return r5
        L4d:
            r11 = 6
            k8.t r5 = r8.f12406c
            r10 = 5
            byte[] r5 = r5.f12009a
            r13.o(r5, r1, r6)
            r11 = 2
            k8.s r5 = r8.d
            r6 = 14
            r5.k(r6)
            k8.s r5 = r8.d
            r6 = 13
            r11 = 6
            int r10 = r5.g(r6)
            r5 = r10
            r6 = 6
            r11 = 6
            if (r5 > r6) goto L6d
            return r1
        L6d:
            int r6 = r5 + (-6)
            r11 = 2
            r13.g(r6)
            r11 = 2
            int r4 = r4 + r5
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.e.f(c7.i):boolean");
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        this.f12411i = false;
        this.f12404a.c();
        this.f12408f = j11;
    }

    @Override // c7.h
    public int h(c7.i iVar, c7.t tVar) {
        k8.a.g(this.f12407e);
        iVar.b();
        int a10 = iVar.a(this.f12405b.f12009a, 0, InterfaceC0186.f43);
        boolean z10 = a10 == -1;
        if (!this.f12412j) {
            this.f12407e.g(new u.b(-9223372036854775807L, 0L));
            this.f12412j = true;
        }
        if (z10) {
            return -1;
        }
        this.f12405b.D(0);
        this.f12405b.C(a10);
        if (!this.f12411i) {
            this.f12404a.f12432s = this.f12408f;
            this.f12411i = true;
        }
        this.f12404a.b(this.f12405b);
        return 0;
    }
}
