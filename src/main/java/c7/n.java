package c7;

import c7.p;
import java.io.EOFException;
import java.util.Arrays;
import t7.g;

/* loaded from: classes.dex */
public final class n {
    public static o7.a a(i iVar, boolean z10) {
        g.a aVar = z10 ? null : t7.g.f15149f;
        k8.t tVar = new k8.t(10);
        o7.a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                iVar.o(tVar.f12009a, 0, 10);
                tVar.D(0);
                if (tVar.u() != 4801587) {
                    break;
                }
                tVar.E(3);
                int r10 = tVar.r();
                int i11 = r10 + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(tVar.f12009a, 0, bArr, 0, 10);
                    iVar.o(bArr, 10, r10);
                    aVar2 = new t7.g(aVar).j(bArr, i11);
                } else {
                    iVar.g(r10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        iVar.l();
        iVar.g(i10);
        if (aVar2 == null || aVar2.f13605c.length == 0) {
            return null;
        }
        return aVar2;
    }

    public static p.a b(k8.t tVar) {
        tVar.E(1);
        int u2 = tVar.u();
        long j10 = tVar.f12010b + u2;
        int i10 = u2 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long m10 = tVar.m();
            if (m10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = m10;
            jArr2[i11] = tVar.m();
            tVar.E(2);
            i11++;
        }
        tVar.E((int) (j10 - tVar.f12010b));
        return new p.a(jArr, jArr2);
    }
}
