package w8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class l0 implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 3) {
                i11 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 4) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                i12 = SafeParcelReader.q(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new b(i10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
