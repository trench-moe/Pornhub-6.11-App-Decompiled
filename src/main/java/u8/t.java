package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class t implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        r rVar = null;
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
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\b':
                    str6 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\t':
                    str7 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\n':
                    str8 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 11:
                    j11 = SafeParcelReader.r(parcel, readInt);
                    break;
                case '\f':
                    str9 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\r':
                    rVar = (r) SafeParcelReader.e(parcel, readInt, r.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new a(str, str2, j10, str3, str4, str5, str6, str7, str8, j11, str9, rVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
