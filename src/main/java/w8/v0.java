package w8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class v0 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final e createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 3) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 4) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                str2 = SafeParcelReader.f(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new e(str, i10, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
