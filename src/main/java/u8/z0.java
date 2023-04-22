package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class z0 implements Parcelable.Creator<p> {
    @Override // android.os.Parcelable.Creator
    public final p createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        i iVar = null;
        String str = null;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                iVar = (i) SafeParcelReader.e(parcel, readInt, i.CREATOR);
            } else if (c10 != 3) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                str = SafeParcelReader.f(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new p(iVar, a9.a.a(str));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p[] newArray(int i10) {
        return new p[i10];
    }
}
