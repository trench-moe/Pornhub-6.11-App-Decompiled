package a9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator<d0> {
    @Override // android.os.Parcelable.Creator
    public final d0 createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        u8.d dVar = null;
        u8.x xVar = null;
        double d = 0.0d;
        double d10 = 0.0d;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    d = SafeParcelReader.n(parcel, readInt);
                    break;
                case 3:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 5:
                    dVar = (u8.d) SafeParcelReader.e(parcel, readInt, u8.d.CREATOR);
                    break;
                case 6:
                    i11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 7:
                    xVar = (u8.x) SafeParcelReader.e(parcel, readInt, u8.x.CREATOR);
                    break;
                case '\b':
                    d10 = SafeParcelReader.n(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new d0(d, z10, i10, dVar, i11, xVar, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d0[] newArray(int i10) {
        return new d0[i10];
    }
}
