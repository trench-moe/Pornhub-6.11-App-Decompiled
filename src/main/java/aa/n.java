package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final m createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 3) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                z10 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new m(i10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m[] newArray(int i10) {
        return new m[i10];
    }
}
