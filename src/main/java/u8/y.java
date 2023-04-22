package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class y implements Parcelable.Creator<x> {
    @Override // android.os.Parcelable.Creator
    public final x createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        v vVar = null;
        v vVar2 = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                vVar = (v) SafeParcelReader.e(parcel, readInt, v.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                vVar2 = (v) SafeParcelReader.e(parcel, readInt, v.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new x(vVar, vVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x[] newArray(int i10) {
        return new x[i10];
    }
}
