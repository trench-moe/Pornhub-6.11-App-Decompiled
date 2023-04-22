package c9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator<b0> {
    @Override // android.os.Parcelable.Creator
    public final b0 createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        boolean z10 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z11 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 2) {
                iBinder = SafeParcelReader.p(parcel, readInt);
            } else if (c10 == 3) {
                z10 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 != 4) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                z11 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new b0(str, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b0[] newArray(int i10) {
        return new b0[i10];
    }
}
