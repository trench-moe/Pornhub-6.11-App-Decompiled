package l7;

import c7.u;
import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public final class c implements c7.h {

    /* renamed from: a  reason: collision with root package name */
    public final d f12357a = new d(null);

    /* renamed from: b  reason: collision with root package name */
    public final k8.t f12358b = new k8.t(16384);

    /* renamed from: c  reason: collision with root package name */
    public boolean f12359c;

    static {
        l6.s sVar = l6.s.n;
    }

    @Override // c7.h
    public void a() {
    }

    @Override // c7.h
    public void c(c7.j jVar) {
        d dVar = this.f12357a;
        dVar.d = android.support.v4.media.b.e(BuildConfig.FLAVOR.length() + 11, BuildConfig.FLAVOR, 0);
        dVar.f12386e = jVar.r(0, 1);
        jVar.l();
        jVar.g(new u.b(-9223372036854775807L, 0L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        r15.l();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
        if ((r4 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        return false;
     */
    @Override // c7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(c7.i r15) {
        /*
            r14 = this;
            k8.t r0 = new k8.t
            r1 = 27502(0x6b6e, float:3.8539E-41)
            r1 = 10
            r0.<init>(r1)
            r2 = 1
            r2 = 0
            r3 = 4
            r3 = 0
        Ld:
            byte[] r4 = r0.f12009a
            r15.o(r4, r2, r1)
            r0.D(r2)
            int r4 = r0.u()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 6
            r6 = 3
            if (r4 == r5) goto L97
            r15.l()
            r15.g(r3)
            r4 = r3
        L27:
            r1 = 0
        L28:
            byte[] r5 = r0.f12009a
            r7 = 2
            r7 = 7
            r15.o(r5, r2, r7)
            r0.D(r2)
            int r5 = r0.x()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L50
            if (r5 == r9) goto L50
            r15.l()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L4c
            return r2
        L4c:
            r15.g(r4)
            goto L27
        L50:
            r8 = 1
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L57
            return r8
        L57:
            byte[] r8 = r0.f12009a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L60
            r11 = 6
            r11 = -1
            goto L8e
        L60:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L88
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 2
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L89
        L88:
            r7 = 4
        L89:
            if (r5 != r9) goto L8d
            int r7 = r7 + 2
        L8d:
            int r11 = r11 + r7
        L8e:
            if (r11 != r12) goto L91
            return r2
        L91:
            int r11 = r11 + (-7)
            r15.g(r11)
            goto L28
        L97:
            r0.E(r6)
            int r4 = r0.r()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.g(r4)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.c.f(c7.i):boolean");
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        this.f12359c = false;
        this.f12357a.c();
    }

    @Override // c7.h
    public int h(c7.i iVar, c7.t tVar) {
        int a10 = iVar.a(this.f12358b.f12009a, 0, 16384);
        if (a10 == -1) {
            return -1;
        }
        this.f12358b.D(0);
        this.f12358b.C(a10);
        if (!this.f12359c) {
            this.f12357a.f12394m = 0L;
            this.f12359c = true;
        }
        this.f12357a.b(this.f12358b);
        return 0;
    }
}
