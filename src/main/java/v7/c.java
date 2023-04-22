package v7;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k8.a0;
import k8.s;
import k8.t;
import o7.a;
import v7.d;
import v7.f;

/* loaded from: classes2.dex */
public final class c extends jd.e {

    /* renamed from: c  reason: collision with root package name */
    public final t f16029c = new t();

    /* renamed from: f  reason: collision with root package name */
    public final s f16030f = new s();

    /* renamed from: j  reason: collision with root package name */
    public a0 f16031j;

    @Override // jd.e
    public o7.a g(o7.d dVar, ByteBuffer byteBuffer) {
        int i10;
        long j10;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i11;
        int i12;
        int i13;
        boolean z13;
        long j13;
        List list;
        long j14;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j15;
        int i14;
        int i15;
        int i16;
        boolean z18;
        long j16;
        a0 a0Var = this.f16031j;
        if (a0Var == null || dVar.y != a0Var.d()) {
            a0 a0Var2 = new a0(dVar.n);
            this.f16031j = a0Var2;
            a0Var2.a(dVar.n - dVar.y);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f16029c.B(array, limit);
        this.f16030f.j(array, limit);
        this.f16030f.m(39);
        long g10 = (this.f16030f.g(1) << 32) | this.f16030f.g(32);
        this.f16030f.m(20);
        int g11 = this.f16030f.g(12);
        int g12 = this.f16030f.g(8);
        this.f16029c.E(14);
        a.b bVar = null;
        if (g12 == 0) {
            bVar = new e();
        } else if (g12 != 255) {
            long j17 = 128;
            if (g12 == 4) {
                t tVar = this.f16029c;
                int s10 = tVar.s();
                ArrayList arrayList2 = new ArrayList(s10);
                int i17 = 0;
                while (i17 < s10) {
                    long t2 = tVar.t();
                    boolean z19 = (tVar.s() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z19) {
                        i10 = s10;
                        j10 = j17;
                        arrayList = arrayList3;
                        z10 = false;
                        z11 = false;
                        j11 = -9223372036854775807L;
                        z12 = false;
                        j12 = -9223372036854775807L;
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                    } else {
                        int s11 = tVar.s();
                        boolean z20 = (s11 & 128) != 0;
                        boolean z21 = (s11 & 64) != 0;
                        boolean z22 = (s11 & 32) != 0;
                        long t8 = z21 ? tVar.t() : -9223372036854775807L;
                        if (z21) {
                            i10 = s10;
                        } else {
                            int s12 = tVar.s();
                            ArrayList arrayList4 = new ArrayList(s12);
                            int i18 = 0;
                            while (i18 < s12) {
                                arrayList4.add(new f.b(tVar.s(), tVar.t(), null));
                                i18++;
                                s12 = s12;
                                s10 = s10;
                            }
                            i10 = s10;
                            arrayList3 = arrayList4;
                        }
                        if (z22) {
                            long s13 = tVar.s();
                            j10 = 128;
                            z13 = (s13 & 128) != 0;
                            j13 = ((((s13 & 1) << 32) | tVar.t()) * 1000) / 90;
                        } else {
                            j10 = 128;
                            z13 = false;
                            j13 = -9223372036854775807L;
                        }
                        z12 = z13;
                        j12 = j13;
                        arrayList = arrayList3;
                        i11 = tVar.x();
                        z10 = z20;
                        z11 = z21;
                        j11 = t8;
                        i12 = tVar.s();
                        i13 = tVar.s();
                    }
                    arrayList2.add(new f.c(t2, z19, z10, z11, arrayList, j11, z12, j12, i11, i12, i13));
                    i17++;
                    j17 = j10;
                    s10 = i10;
                }
                bVar = new f(arrayList2);
            } else if (g12 == 5) {
                t tVar2 = this.f16029c;
                a0 a0Var3 = this.f16031j;
                long t10 = tVar2.t();
                boolean z23 = (tVar2.s() & 128) != 0;
                List emptyList = Collections.emptyList();
                if (z23) {
                    list = emptyList;
                    j14 = -9223372036854775807L;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    z17 = false;
                    j15 = -9223372036854775807L;
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                } else {
                    int s14 = tVar2.s();
                    boolean z24 = (s14 & 128) != 0;
                    boolean z25 = (s14 & 64) != 0;
                    boolean z26 = (s14 & 32) != 0;
                    boolean z27 = (s14 & 16) != 0;
                    long a10 = (!z25 || z27) ? -9223372036854775807L : g.a(tVar2, g10);
                    if (!z25) {
                        int s15 = tVar2.s();
                        ArrayList arrayList5 = new ArrayList(s15);
                        for (int i19 = 0; i19 < s15; i19++) {
                            int s16 = tVar2.s();
                            long a11 = !z27 ? g.a(tVar2, g10) : -9223372036854775807L;
                            arrayList5.add(new d.b(s16, a11, a0Var3.b(a11), null));
                        }
                        emptyList = arrayList5;
                    }
                    if (z26) {
                        long s17 = tVar2.s();
                        z18 = (s17 & 128) != 0;
                        j16 = ((((s17 & 1) << 32) | tVar2.t()) * 1000) / 90;
                    } else {
                        z18 = false;
                        j16 = -9223372036854775807L;
                    }
                    int x10 = tVar2.x();
                    int s18 = tVar2.s();
                    i14 = x10;
                    z17 = z18;
                    i16 = tVar2.s();
                    list = emptyList;
                    j15 = j16;
                    i15 = s18;
                    z14 = z24;
                    j14 = a10;
                    z16 = z27;
                    z15 = z25;
                }
                bVar = new d(t10, z23, z14, z15, z16, j14, a0Var3.b(j14), list, z17, j15, i14, i15, i16);
            } else if (g12 == 6) {
                t tVar3 = this.f16029c;
                a0 a0Var4 = this.f16031j;
                long a12 = g.a(tVar3, g10);
                bVar = new g(a12, a0Var4.b(a12));
            }
        } else {
            t tVar4 = this.f16029c;
            long t11 = tVar4.t();
            int i20 = g11 - 4;
            byte[] bArr = new byte[i20];
            System.arraycopy(tVar4.f12009a, tVar4.f12010b, bArr, 0, i20);
            tVar4.f12010b += i20;
            bVar = new a(t11, bArr, g10);
        }
        return bVar == null ? new o7.a(new a.b[0]) : new o7.a(bVar);
    }
}
