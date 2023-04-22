package h9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final r createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 2) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.j(parcel, readInt, l.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new r(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i10) {
        return new r[i10];
    }
}
