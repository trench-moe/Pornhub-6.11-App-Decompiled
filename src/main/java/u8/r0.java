package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class r0 implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                j10 = SafeParcelReader.r(parcel, readInt);
            } else if (c10 == 3) {
                j11 = SafeParcelReader.r(parcel, readInt);
            } else if (c10 == 4) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 5) {
                str2 = SafeParcelReader.f(parcel, readInt);
            } else if (c10 != 6) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                j12 = SafeParcelReader.r(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new c(j10, j11, str, str2, j12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i10) {
        return new c[i10];
    }
}
