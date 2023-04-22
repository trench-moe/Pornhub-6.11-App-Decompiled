package e7;

import c7.a;
import c7.i;
import c7.k;
import c7.m;
import c7.p;
import k8.t;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class a extends c7.a {

    /* loaded from: classes.dex */
    public static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final p f9126a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9127b;

        /* renamed from: c  reason: collision with root package name */
        public final m.a f9128c = new m.a();

        public b(p pVar, int i10, C0128a c0128a) {
            this.f9126a = pVar;
            this.f9127b = i10;
        }

        @Override // c7.a.f
        public a.e a(i iVar, long j10) {
            long position = iVar.getPosition();
            long c10 = c(iVar);
            long f10 = iVar.f();
            iVar.g(Math.max(6, this.f9126a.f3810c));
            long c11 = c(iVar);
            return (c10 > j10 || c11 <= j10) ? c11 <= j10 ? a.e.c(c11, iVar.f()) : a.e.a(c10, position) : a.e.b(f10);
        }

        @Override // c7.a.f
        public /* synthetic */ void b() {
        }

        public final long c(i iVar) {
            while (iVar.f() < iVar.b() - 6) {
                p pVar = this.f9126a;
                int i10 = this.f9127b;
                m.a aVar = this.f9128c;
                long f10 = iVar.f();
                byte[] bArr = new byte[2];
                boolean z10 = false;
                iVar.o(bArr, 0, 2);
                if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i10) {
                    iVar.l();
                    iVar.g((int) (f10 - iVar.getPosition()));
                } else {
                    t tVar = new t(16);
                    System.arraycopy(bArr, 0, tVar.f12009a, 0, 2);
                    tVar.C(k.c(iVar, tVar.f12009a, 2, 14));
                    iVar.l();
                    iVar.g((int) (f10 - iVar.getPosition()));
                    z10 = m.b(tVar, pVar, i10, aVar);
                }
                if (z10) {
                    break;
                }
                iVar.g(1);
            }
            if (iVar.f() >= iVar.b() - 6) {
                iVar.g((int) (iVar.b() - iVar.f()));
                return this.f9126a.f3816j;
            }
            return this.f9128c.f3805a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(c7.p r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            s4.f r1 = new s4.f
            r2 = 10
            r1.<init>(r0, r2)
            e7.a$b r2 = new e7.a$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4, r3)
            long r3 = r17.d()
            long r7 = r0.f3816j
            int r5 = r0.d
            if (r5 <= 0) goto L29
            long r5 = (long) r5
            int r9 = r0.f3810c
            long r9 = (long) r9
            long r5 = r5 + r9
            r9 = 2
            long r5 = r5 / r9
            r9 = 1
            goto L44
        L29:
            int r5 = r0.f3808a
            int r6 = r0.f3809b
            if (r5 != r6) goto L33
            if (r5 <= 0) goto L33
            long r5 = (long) r5
            goto L35
        L33:
            r5 = 4096(0x1000, double:2.0237E-320)
        L35:
            int r9 = r0.f3813g
            long r9 = (long) r9
            long r5 = r5 * r9
            int r9 = r0.f3814h
            long r9 = (long) r9
            long r5 = r5 * r9
            r9 = 8
            long r5 = r5 / r9
            r9 = 64
        L44:
            long r13 = r5 + r9
            r5 = 6
            int r0 = r0.f3810c
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.<init>(c7.p, int, long, long):void");
    }
}
