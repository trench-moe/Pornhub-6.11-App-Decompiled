package c7;

import java.io.EOFException;
import t7.g;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final k8.t f3824a = new k8.t(10);

    public o7.a a(i iVar, g.a aVar) {
        o7.a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                iVar.o(this.f3824a.f12009a, 0, 10);
                this.f3824a.D(0);
                if (this.f3824a.u() != 4801587) {
                    break;
                }
                this.f3824a.E(3);
                int r10 = this.f3824a.r();
                int i11 = r10 + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f3824a.f12009a, 0, bArr, 0, 10);
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
        return aVar2;
    }
}
