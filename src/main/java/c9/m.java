package c9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 2) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 3) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                j10 = SafeParcelReader.r(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new d(str, i10, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}
