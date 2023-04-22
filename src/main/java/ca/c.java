package ca;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 2) {
                i11 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 3) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, readInt, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new b(i10, i11, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
