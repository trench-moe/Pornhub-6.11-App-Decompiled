package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzis extends zziv {
    private final int zzc;

    public zzis(byte[] bArr, int i10) {
        super(bArr);
        zzix.p(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final byte b(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(android.support.v4.media.b.e(22, "Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(a1.a.h(40, "Index > length: ", i10, ", ", i11));
        }
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final byte e(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final int g() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final int s() {
        return 0;
    }
}
