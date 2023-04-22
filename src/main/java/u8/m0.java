package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class m0 implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final g createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        boolean z10 = false;
        String str = null;
        f fVar = null;
        boolean z11 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                z10 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 == 3) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 4) {
                z11 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 != 5) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                fVar = (f) SafeParcelReader.e(parcel, readInt, f.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new g(z10, str, z11, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i10) {
        return new g[i10];
    }
}
