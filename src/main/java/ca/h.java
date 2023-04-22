package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final g createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = SafeParcelReader.h(parcel, readInt);
            } else if (c10 != 2) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                str = SafeParcelReader.f(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new g(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i10) {
        return new g[i10];
    }
}
