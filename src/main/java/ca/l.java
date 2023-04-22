package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import h9.j0;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        c9.b bVar = null;
        j0 j0Var = null;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 2) {
                bVar = (c9.b) SafeParcelReader.e(parcel, readInt, c9.b.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                j0Var = (j0) SafeParcelReader.e(parcel, readInt, j0.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new k(i10, bVar, j0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i10) {
        return new k[i10];
    }
}
