package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<Scope> {
    @Override // android.os.Parcelable.Creator
    public final Scope createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 2) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                str = SafeParcelReader.f(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new Scope(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i10) {
        return new Scope[i10];
    }
}
