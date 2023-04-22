package h9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class d1 implements Parcelable.Creator<c1> {
    @Override // android.os.Parcelable.Creator
    public final c1 createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        Bundle bundle = null;
        c9.d[] dVarArr = null;
        d dVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                bundle = SafeParcelReader.a(parcel, readInt);
            } else if (c10 == 2) {
                dVarArr = (c9.d[]) SafeParcelReader.i(parcel, readInt, c9.d.CREATOR);
            } else if (c10 == 3) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 4) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                dVar = (d) SafeParcelReader.e(parcel, readInt, d.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new c1(bundle, dVarArr, i10, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c1[] newArray(int i10) {
        return new c1[i10];
    }
}
