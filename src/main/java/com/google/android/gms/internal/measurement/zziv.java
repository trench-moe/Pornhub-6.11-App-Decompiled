package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Objects;
import w9.b6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zziv extends zziu {
    public final byte[] zza;

    public zziv(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte b(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte e(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzix) && g() == ((zzix) obj).g()) {
            if (g() == 0) {
                return true;
            }
            if (obj instanceof zziv) {
                zziv zzivVar = (zziv) obj;
                int q10 = q();
                int q11 = zzivVar.q();
                if (q10 != 0 && q11 != 0 && q10 != q11) {
                    return false;
                }
                int g10 = g();
                if (g10 > zzivVar.g()) {
                    int g11 = g();
                    StringBuilder sb2 = new StringBuilder(40);
                    sb2.append("Length too large: ");
                    sb2.append(g10);
                    sb2.append(g11);
                    throw new IllegalArgumentException(sb2.toString());
                } else if (g10 <= zzivVar.g()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzivVar.zza;
                    zzivVar.s();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < g10) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                } else {
                    throw new IllegalArgumentException(a1.a.h(59, "Ran off end of other: 0, ", g10, ", ", zzivVar.g()));
                }
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public int g() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final int h(int i10, int i11, int i12) {
        byte[] bArr = this.zza;
        Charset charset = b6.f17081a;
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final zzix j(int i10, int i11) {
        int p10 = zzix.p(0, i11, g());
        return p10 == 0 ? zzix.f7071c : new zzis(this.zza, p10);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final String l(Charset charset) {
        return new String(this.zza, 0, g(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final void m(cb.e eVar) {
        ((d) eVar).J0(this.zza, 0, g());
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean o() {
        return h.d(this.zza, 0, g());
    }

    public int s() {
        return 0;
    }
}
