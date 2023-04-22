package l8;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import k8.q;
import k8.t;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f12646a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12647b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12648c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12649e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12650f;

    public a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f12646a = list;
        this.f12647b = i10;
        this.f12648c = i11;
        this.d = i12;
        this.f12649e = f10;
        this.f12650f = str;
    }

    public static byte[] a(t tVar) {
        int x10 = tVar.x();
        int i10 = tVar.f12010b;
        tVar.E(x10);
        byte[] bArr = tVar.f12009a;
        byte[] bArr2 = cb.e.y;
        byte[] bArr3 = new byte[bArr2.length + x10];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, x10);
        return bArr3;
    }

    public static a b(t tVar) {
        String str;
        int i10;
        int i11;
        float f10;
        try {
            tVar.E(4);
            int s10 = (tVar.s() & 3) + 1;
            if (s10 != 3) {
                ArrayList arrayList = new ArrayList();
                int s11 = tVar.s() & 31;
                for (int i12 = 0; i12 < s11; i12++) {
                    arrayList.add(a(tVar));
                }
                int s12 = tVar.s();
                for (int i13 = 0; i13 < s12; i13++) {
                    arrayList.add(a(tVar));
                }
                if (s11 > 0) {
                    q.b d = k8.q.d((byte[]) arrayList.get(0), s10, ((byte[]) arrayList.get(0)).length);
                    int i14 = d.f11991e;
                    int i15 = d.f11992f;
                    float f11 = d.f11993g;
                    str = cb.e.p(d.f11988a, d.f11989b, d.f11990c);
                    i10 = i14;
                    i11 = i15;
                    f10 = f11;
                } else {
                    str = null;
                    i10 = -1;
                    i11 = -1;
                    f10 = 1.0f;
                }
                return new a(arrayList, s10, i10, i11, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing AVC config", e10);
        }
    }
}
