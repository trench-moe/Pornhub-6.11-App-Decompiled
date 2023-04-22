package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class b1 implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final r createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 != 3) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                str2 = SafeParcelReader.f(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new r(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i10) {
        return new r[i10];
    }
}
