package k7;

import c7.k;
import com.google.android.exoplayer2.ParserException;
import k8.t;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f11902a;

    /* renamed from: b  reason: collision with root package name */
    public long f11903b;

    /* renamed from: c  reason: collision with root package name */
    public int f11904c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f11905e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f11906f = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* renamed from: g  reason: collision with root package name */
    public final t f11907g = new t((int) KotlinVersion.MAX_COMPONENT_VALUE);

    public boolean a(c7.i iVar, boolean z10) {
        int i10;
        b();
        this.f11907g.z(27);
        if (k.b(iVar, this.f11907g.f12009a, 0, 27, z10) && this.f11907g.t() == 1332176723) {
            if (this.f11907g.s() != 0) {
                if (z10) {
                    return false;
                }
                throw ParserException.b("unsupported bit stream revision");
            }
            this.f11902a = this.f11907g.s();
            t tVar = this.f11907g;
            byte[] bArr = tVar.f12009a;
            int i11 = tVar.f12010b + 1;
            tVar.f12010b = i11;
            int i12 = i11 + 1;
            tVar.f12010b = i12;
            int i13 = i12 + 1;
            tVar.f12010b = i13;
            int i14 = i13 + 1;
            tVar.f12010b = i14;
            int i15 = i14 + 1;
            tVar.f12010b = i15;
            int i16 = i15 + 1;
            tVar.f12010b = i16;
            int i17 = i16 + 1;
            tVar.f12010b = i17;
            tVar.f12010b = i17 + 1;
            this.f11903b = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40) | ((bArr[i16] & 255) << 48) | ((bArr[i17] & 255) << 56);
            tVar.j();
            this.f11907g.j();
            this.f11907g.j();
            int s10 = this.f11907g.s();
            this.f11904c = s10;
            this.d = s10 + 27;
            this.f11907g.z(s10);
            if (k.b(iVar, this.f11907g.f12009a, 0, this.f11904c, z10)) {
                for (int i18 = 0; i18 < this.f11904c; i18++) {
                    this.f11906f[i18] = this.f11907g.s();
                    this.f11905e += this.f11906f[i18];
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void b() {
        this.f11902a = 0;
        this.f11903b = 0L;
        this.f11904c = 0;
        this.d = 0;
        this.f11905e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r0 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r12.getPosition() >= r13) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r12.h(1) == (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(c7.i r12, long r13) {
        /*
            r11 = this;
            long r0 = r12.getPosition()
            long r2 = r12.f()
            r8 = 0
            r4 = r8
            r8 = 1
            r5 = r8
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            k8.a.c(r0)
            r10 = 6
            k8.t r0 = r11.f11907g
            r8 = 4
            r1 = r8
            r0.z(r1)
        L1e:
            r2 = -1
            r9 = 3
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            r10 = 2
            long r2 = r12.getPosition()
            r6 = 4
            long r2 = r2 + r6
            int r6 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r9 = 7
            if (r6 >= 0) goto L5a
        L32:
            k8.t r2 = r11.f11907g
            byte[] r2 = r2.f12009a
            boolean r8 = c7.k.b(r12, r2, r4, r1, r5)
            r2 = r8
            if (r2 == 0) goto L5a
            k8.t r0 = r11.f11907g
            r0.D(r4)
            r10 = 2
            k8.t r0 = r11.f11907g
            r9 = 1
            long r2 = r0.t()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L55
            r12.l()
            return r5
        L55:
            r9 = 7
            r12.m(r5)
            goto L1e
        L5a:
            if (r0 == 0) goto L66
            r10 = 1
            long r1 = r12.getPosition()
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            r9 = 4
            if (r3 >= 0) goto L6f
        L66:
            int r1 = r12.h(r5)
            r2 = -1
            if (r1 == r2) goto L6f
            r9 = 1
            goto L5a
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.e.c(c7.i, long):boolean");
    }
}
