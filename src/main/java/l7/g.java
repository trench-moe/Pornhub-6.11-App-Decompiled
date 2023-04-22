package l7;

import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import l7.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class g implements d0.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f12435a;

    /* renamed from: b  reason: collision with root package name */
    public final List<w6.y> f12436b;

    public g(int i10) {
        ImmutableList w10 = ImmutableList.w();
        this.f12435a = i10;
        this.f12436b = w10;
    }

    @Override // l7.d0.c
    public d0 a(int i10, d0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new t(new q(bVar.f12397a));
            }
            if (i10 != 21) {
                if (i10 == 27) {
                    if (d(4)) {
                        return null;
                    }
                    return new t(new m(new z(c(bVar)), d(1), d(8)));
                } else if (i10 != 36) {
                    if (i10 != 89) {
                        if (i10 != 138) {
                            if (i10 != 172) {
                                if (i10 != 257) {
                                    if (i10 != 129) {
                                        if (i10 != 130) {
                                            if (i10 == 134) {
                                                if (d(16)) {
                                                    return null;
                                                }
                                                return new y(new s("application/x-scte35"));
                                            } else if (i10 != 135) {
                                                switch (i10) {
                                                    case 15:
                                                        if (d(2)) {
                                                            return null;
                                                        }
                                                        return new t(new f(false, bVar.f12397a));
                                                    case 16:
                                                        return new t(new l(new e0(c(bVar))));
                                                    case 17:
                                                        if (d(2)) {
                                                            return null;
                                                        }
                                                        return new t(new p(bVar.f12397a));
                                                    default:
                                                        return null;
                                                }
                                            }
                                        } else if (!d(64)) {
                                            return null;
                                        }
                                    }
                                    return new t(new b(bVar.f12397a));
                                }
                                return new y(new s("application/vnd.dvb.ait"));
                            }
                            return new t(new d(bVar.f12397a));
                        }
                        return new t(new h(bVar.f12397a));
                    }
                    return new t(new i(bVar.f12398b));
                } else {
                    return new t(new n(new z(c(bVar))));
                }
            }
            return new t(new o());
        }
        return new t(new k(new e0(c(bVar))));
    }

    public SparseArray<d0> b() {
        return new SparseArray<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final List<w6.y> c(d0.b bVar) {
        String str;
        int i10;
        if (d(32)) {
            return this.f12436b;
        }
        byte[] bArr = bVar.f12399c;
        int length = bArr.length;
        int i11 = 0;
        ArrayList arrayList = this.f12436b;
        while (length - i11 > 0) {
            int i12 = i11 + 1;
            int i13 = bArr[i11] & UByte.MAX_VALUE;
            int i14 = i12 + 1;
            int i15 = (bArr[i12] & UByte.MAX_VALUE) + i14;
            boolean z10 = true;
            if (i13 == 134) {
                arrayList = new ArrayList();
                int i16 = i14 + 1;
                int i17 = bArr[i14] & UByte.MAX_VALUE & 31;
                int i18 = 0;
                while (i18 < i17) {
                    String str2 = new String(bArr, i16, 3, jb.b.f11660c);
                    int i19 = i16 + 3;
                    int i20 = i19 + 1;
                    int i21 = bArr[i19] & UByte.MAX_VALUE;
                    boolean z11 = (i21 & 128) != 0;
                    if (z11) {
                        i10 = i21 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    int i22 = i20 + 1;
                    byte b10 = (byte) (bArr[i20] & UByte.MAX_VALUE);
                    int i23 = i22 + 1;
                    k8.a.c(i23 >= 0 && i23 <= length);
                    List<byte[]> list = null;
                    if (z11) {
                        list = Collections.singletonList((b10 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    y.b bVar2 = new y.b();
                    bVar2.f16879k = str;
                    bVar2.f16872c = str2;
                    bVar2.C = i10;
                    bVar2.f16881m = list;
                    arrayList.add(bVar2.a());
                    i18++;
                    i16 = i23;
                }
            }
            if (i15 < 0 || i15 > length) {
                z10 = false;
            }
            k8.a.c(z10);
            i11 = i15;
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean d(int i10) {
        return (i10 & this.f12435a) != 0;
    }
}
