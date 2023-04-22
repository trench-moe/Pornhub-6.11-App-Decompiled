package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u0 implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final l createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        k kVar = null;
        ArrayList arrayList = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
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
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 6:
                    kVar = (k) SafeParcelReader.e(parcel, readInt, k.CREATOR);
                    break;
                case 7:
                    i11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\b':
                    arrayList = SafeParcelReader.j(parcel, readInt, m.CREATOR);
                    break;
                case '\t':
                    i12 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\n':
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new l(str, str2, i10, str3, kVar, i11, arrayList, i12, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i10) {
        return new l[i10];
    }
}
