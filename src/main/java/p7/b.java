package p7;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import jd.e;
import k8.s;
import o7.d;

/* loaded from: classes2.dex */
public final class b extends e {
    @Override // jd.e
    public o7.a g(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            s sVar = new s(byteBuffer.array(), byteBuffer.limit());
            sVar.m(12);
            int d = (sVar.d() + sVar.g(12)) - 4;
            sVar.m(44);
            sVar.n(sVar.g(12));
            sVar.m(16);
            ArrayList arrayList = new ArrayList();
            while (sVar.d() < d) {
                sVar.m(48);
                int g10 = sVar.g(8);
                sVar.m(4);
                int d10 = sVar.d() + sVar.g(12);
                String str = null;
                String str2 = null;
                while (sVar.d() < d10) {
                    int g11 = sVar.g(8);
                    int g12 = sVar.g(8);
                    int d11 = sVar.d() + g12;
                    if (g11 == 2) {
                        int g13 = sVar.g(16);
                        sVar.m(8);
                        if (g13 != 3) {
                        }
                        while (sVar.d() < d11) {
                            int g14 = sVar.g(8);
                            Charset charset = jb.b.f11658a;
                            byte[] bArr = new byte[g14];
                            sVar.i(bArr, 0, g14);
                            str = new String(bArr, charset);
                            int g15 = sVar.g(8);
                            for (int i10 = 0; i10 < g15; i10++) {
                                sVar.n(sVar.g(8));
                            }
                        }
                    } else if (g11 == 21) {
                        Charset charset2 = jb.b.f11658a;
                        byte[] bArr2 = new byte[g12];
                        sVar.i(bArr2, 0, g12);
                        str2 = new String(bArr2, charset2);
                    }
                    sVar.k(d11 * 8);
                }
                sVar.k(d10 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new a(g10, str2.length() != 0 ? str.concat(str2) : new String(str)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new o7.a(arrayList);
            }
        }
        return null;
    }
}
