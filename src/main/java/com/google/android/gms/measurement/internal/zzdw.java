package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import w9.d0;
import w9.e0;

/* loaded from: classes.dex */
public abstract class zzdw extends d0 implements zzdx {
    public zzdw() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // w9.d0
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10 = false;
        switch (i10) {
            case 1:
                zzk((zzau) e0.a(parcel, zzau.CREATOR), (zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzt((zzks) e0.a(parcel, zzks.CREATOR), (zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
                return false;
            case 4:
                zzj((zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zzl((zzau) e0.a(parcel, zzau.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzs((zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                zzp zzpVar = (zzp) e0.a(parcel, zzp.CREATOR);
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                List zze = zze(zzpVar, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(zze);
                return true;
            case 9:
                byte[] zzu = zzu((zzau) e0.a(parcel, zzau.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(zzu);
                return true;
            case 10:
                zzq(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String zzd = zzd((zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(zzd);
                return true;
            case 12:
                zzn((zzab) e0.a(parcel, zzab.CREATOR), (zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzo((zzab) e0.a(parcel, zzab.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ClassLoader classLoader = e0.f17118a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                List zzh = zzh(readString, readString2, z10, (zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzh);
                return true;
            case 15:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                ClassLoader classLoader2 = e0.f17118a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                List zzi = zzi(readString3, readString4, readString5, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzi);
                return true;
            case 16:
                List zzf = zzf(parcel.readString(), parcel.readString(), (zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zzf);
                return true;
            case 17:
                List zzg = zzg(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 18:
                zzm((zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                zzr((Bundle) e0.a(parcel, Bundle.CREATOR), (zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                zzp((zzp) e0.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
