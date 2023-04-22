package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class b0 implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String[] strArr = null;
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 3:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 4:
                    j11 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 5:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 6:
                    strArr = SafeParcelReader.g(parcel, readInt);
                    break;
                case 7:
                    z11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    z12 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new b(j10, str, j11, z10, strArr, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
