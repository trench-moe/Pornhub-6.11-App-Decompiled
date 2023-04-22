package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final f createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                str = SafeParcelReader.f(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new f(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f[] newArray(int i10) {
        return new f[i10];
    }
}
