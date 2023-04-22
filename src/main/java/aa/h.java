package aa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        byte[] bArr = null;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 3) {
                bArr = SafeParcelReader.b(parcel, readInt);
            } else if (c10 != 4) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                i10 = SafeParcelReader.q(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new a(str, bArr, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
