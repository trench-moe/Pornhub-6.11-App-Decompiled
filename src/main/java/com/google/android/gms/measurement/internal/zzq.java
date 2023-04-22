package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = BuildConfig.FLAVOR;
        long j15 = -2147483648L;
        boolean z10 = true;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = true;
        boolean z13 = false;
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
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 6:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 7:
                    j11 = SafeParcelReader.r(parcel, readInt);
                    break;
                case '\b':
                    str5 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\t':
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\n':
                    z11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 11:
                    j15 = SafeParcelReader.r(parcel, readInt);
                    break;
                case '\f':
                    str6 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\r':
                    j12 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 14:
                    j13 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 15:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 16:
                    z12 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
                case 18:
                    z13 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 19:
                    str7 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 21:
                    bool = SafeParcelReader.m(parcel, readInt);
                    break;
                case 22:
                    j14 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 23:
                    arrayList = SafeParcelReader.h(parcel, readInt);
                    break;
                case 24:
                    str8 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 25:
                    str9 = SafeParcelReader.f(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new zzp(str, str2, str3, str4, j10, j11, str5, z10, z11, j15, str6, j12, j13, i10, z12, z13, str7, bool, j14, arrayList, str8, str9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
