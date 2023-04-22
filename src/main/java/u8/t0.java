package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class t0 implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        double d = 0.0d;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 3) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 4) {
                arrayList = SafeParcelReader.j(parcel, readInt, j.CREATOR);
            } else if (c10 == 5) {
                arrayList2 = SafeParcelReader.j(parcel, readInt, g9.a.CREATOR);
            } else if (c10 != 6) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                d = SafeParcelReader.n(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new k(i10, str, arrayList, arrayList2, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i10) {
        return new k[i10];
    }
}
