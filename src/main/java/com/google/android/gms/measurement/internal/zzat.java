package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class zzat implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                bundle = SafeParcelReader.a(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new zzas(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzas[i10];
    }
}
