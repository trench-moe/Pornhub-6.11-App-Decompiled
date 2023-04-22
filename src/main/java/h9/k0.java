package h9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class k0 implements Parcelable.Creator<j0> {
    @Override // android.os.Parcelable.Creator
    public final j0 createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        IBinder iBinder = null;
        c9.b bVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 2) {
                iBinder = SafeParcelReader.p(parcel, readInt);
            } else if (c10 == 3) {
                bVar = (c9.b) SafeParcelReader.e(parcel, readInt, c9.b.CREATOR);
            } else if (c10 == 4) {
                z10 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 != 5) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                z11 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new j0(i10, iBinder, bVar, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j0[] newArray(int i10) {
        return new j0[i10];
    }
}
