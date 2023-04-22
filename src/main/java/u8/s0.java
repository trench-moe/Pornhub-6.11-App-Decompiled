package u8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class s0 implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final j createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                arrayList = SafeParcelReader.j(parcel, readInt, g9.a.CREATOR);
            } else if (c10 == 3) {
                bundle = SafeParcelReader.a(parcel, readInt);
            } else if (c10 != 4) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                i10 = SafeParcelReader.q(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new j(arrayList, bundle, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}
