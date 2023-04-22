package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import t9.k0;

/* loaded from: classes.dex */
public final class zzav implements Parcelable.Creator {
    public static void zza(zzau zzauVar, Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, zzauVar.zza, false);
        k0.q(parcel, 3, zzauVar.zzb, i10, false);
        k0.r(parcel, 4, zzauVar.zzc, false);
        long j10 = zzauVar.zzd;
        parcel.writeInt(524293);
        parcel.writeLong(j10);
        k0.z(parcel, v2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        zzas zzasVar = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 3) {
                zzasVar = (zzas) SafeParcelReader.e(parcel, readInt, zzas.CREATOR);
            } else if (c10 == 4) {
                str2 = SafeParcelReader.f(parcel, readInt);
            } else if (c10 != 5) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                j10 = SafeParcelReader.r(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new zzau(str, zzasVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzau[i10];
    }
}
