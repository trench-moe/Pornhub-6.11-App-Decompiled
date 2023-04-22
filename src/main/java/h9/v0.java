package h9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class v0 implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final q createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 2) {
                z10 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 == 3) {
                z11 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 == 4) {
                i11 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 5) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                i12 = SafeParcelReader.q(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new q(i10, z10, z11, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q[] newArray(int i10) {
        return new q[i10];
    }
}
