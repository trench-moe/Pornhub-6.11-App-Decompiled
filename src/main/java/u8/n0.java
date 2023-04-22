package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class n0 implements Parcelable.Creator<MediaError> {
    @Override // android.os.Parcelable.Creator
    public final MediaError createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        Integer num = null;
        String str2 = null;
        long j10 = 0;
        String str3 = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 3) {
                j10 = SafeParcelReader.r(parcel, readInt);
            } else if (c10 == 4) {
                int s10 = SafeParcelReader.s(parcel, readInt);
                if (s10 == 0) {
                    num = null;
                } else {
                    SafeParcelReader.v(parcel, readInt, s10, 4);
                    num = Integer.valueOf(parcel.readInt());
                }
            } else if (c10 == 5) {
                str2 = SafeParcelReader.f(parcel, readInt);
            } else if (c10 != 6) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                str3 = SafeParcelReader.f(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new MediaError(str, j10, num, str2, a9.a.a(str3));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaError[] newArray(int i10) {
        return new MediaError[i10];
    }
}
