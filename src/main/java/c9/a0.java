package c9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public final z createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        boolean z10 = false;
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z10 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 == 2) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 != 3) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                i10 = SafeParcelReader.q(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new z(z10, str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z[] newArray(int i10) {
        return new z[i10];
    }
}
