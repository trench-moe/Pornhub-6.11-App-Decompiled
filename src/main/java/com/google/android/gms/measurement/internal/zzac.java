package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class zzac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        zzks zzksVar = null;
        String str3 = null;
        zzau zzauVar = null;
        zzau zzauVar2 = null;
        zzau zzauVar3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 4:
                    zzksVar = (zzks) SafeParcelReader.e(parcel, readInt, zzks.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 6:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\b':
                    zzauVar = (zzau) SafeParcelReader.e(parcel, readInt, zzau.CREATOR);
                    break;
                case '\t':
                    j11 = SafeParcelReader.r(parcel, readInt);
                    break;
                case '\n':
                    zzauVar2 = (zzau) SafeParcelReader.e(parcel, readInt, zzau.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.r(parcel, readInt);
                    break;
                case '\f':
                    zzauVar3 = (zzau) SafeParcelReader.e(parcel, readInt, zzau.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new zzab(str, str2, zzksVar, j10, z10, str3, zzauVar, j11, zzauVar2, j12, zzauVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzab[i10];
    }
}
