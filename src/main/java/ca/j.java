package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import h9.h0;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final i createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        h0 h0Var = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 2) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                h0Var = (h0) SafeParcelReader.e(parcel, readInt, h0.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new i(i10, h0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i10) {
        return new i[i10];
    }
}
