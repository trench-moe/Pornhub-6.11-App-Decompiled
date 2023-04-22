package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class p0 implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final h createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                j10 = SafeParcelReader.r(parcel, readInt);
            } else if (c10 == 3) {
                j11 = SafeParcelReader.r(parcel, readInt);
            } else if (c10 == 4) {
                z10 = SafeParcelReader.l(parcel, readInt);
            } else if (c10 != 5) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                z11 = SafeParcelReader.l(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new h(j10, j11, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i10) {
        return new h[i10];
    }
}
