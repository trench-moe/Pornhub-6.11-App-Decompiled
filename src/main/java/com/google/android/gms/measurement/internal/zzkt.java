package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import t9.k0;

/* loaded from: classes.dex */
public final class zzkt implements Parcelable.Creator {
    public static void zza(zzks zzksVar, Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = zzksVar.zza;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        k0.r(parcel, 2, zzksVar.zzb, false);
        long j10 = zzksVar.zzc;
        parcel.writeInt(524291);
        parcel.writeLong(j10);
        Long l10 = zzksVar.zzd;
        if (l10 != null) {
            parcel.writeInt(524292);
            parcel.writeLong(l10.longValue());
        }
        k0.r(parcel, 6, zzksVar.zze, false);
        k0.r(parcel, 7, zzksVar.zzf, false);
        Double d = zzksVar.zzg;
        if (d != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d.doubleValue());
        }
        k0.z(parcel, v2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 3:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 4:
                    int s10 = SafeParcelReader.s(parcel, readInt);
                    if (s10 != 0) {
                        SafeParcelReader.v(parcel, readInt, s10, 8);
                        l10 = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l10 = null;
                        break;
                    }
                case 5:
                    int s11 = SafeParcelReader.s(parcel, readInt);
                    if (s11 != 0) {
                        SafeParcelReader.v(parcel, readInt, s11, 4);
                        f10 = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f10 = null;
                        break;
                    }
                case 6:
                    str2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\b':
                    int s12 = SafeParcelReader.s(parcel, readInt);
                    if (s12 != 0) {
                        SafeParcelReader.v(parcel, readInt, s12, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new zzks(i10, str, j10, l10, f10, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzks[i10];
    }
}
