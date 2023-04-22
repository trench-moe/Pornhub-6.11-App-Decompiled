package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class w implements Parcelable.Creator<v> {
    @Override // android.os.Parcelable.Creator
    public final v createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                f10 = SafeParcelReader.o(parcel, readInt);
            } else if (c10 == 3) {
                f11 = SafeParcelReader.o(parcel, readInt);
            } else if (c10 != 4) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                f12 = SafeParcelReader.o(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new v(f10, f11, f12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v[] newArray(int i10) {
        return new v[i10];
    }
}
