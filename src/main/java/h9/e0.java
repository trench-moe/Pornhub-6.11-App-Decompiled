package h9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class e0 implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final l createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 2:
                    i11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 3:
                    i12 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 5:
                    j11 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 6:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 7:
                    str2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\b':
                    i13 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\t':
                    i14 = SafeParcelReader.q(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new l(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i10) {
        return new l[i10];
    }
}
