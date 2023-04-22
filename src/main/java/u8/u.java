package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class u implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final f createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 != 2) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                str2 = SafeParcelReader.f(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new f(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i10) {
        return new f[i10];
    }
}
