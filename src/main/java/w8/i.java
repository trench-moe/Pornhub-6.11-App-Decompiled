package w8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        f fVar = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 4:
                    iBinder = SafeParcelReader.p(parcel, readInt);
                    break;
                case 5:
                    fVar = (f) SafeParcelReader.e(parcel, readInt, f.CREATOR);
                    break;
                case 6:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    z11 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new a(str, str2, iBinder, fVar, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
