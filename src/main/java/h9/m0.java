package h9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class m0 implements Parcelable.Creator<l0> {
    @Override // android.os.Parcelable.Creator
    public final l0 createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        Scope[] scopeArr = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 2) {
                i11 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 3) {
                i12 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 4) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.i(parcel, readInt, Scope.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new l0(i10, i11, i12, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l0[] newArray(int i10) {
        return new l0[i10];
    }
}
