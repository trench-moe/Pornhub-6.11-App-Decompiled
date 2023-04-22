package c9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator<x> {
    @Override // android.os.Parcelable.Creator
    public final x createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 2) {
                z10 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 == 3) {
                z11 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 == 4) {
                iBinder = SafeParcelReader.p(parcel, readInt);
            } else if (c10 != 5) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                z12 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new x(str, z10, z11, iBinder, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x[] newArray(int i10) {
        return new x[i10];
    }
}
