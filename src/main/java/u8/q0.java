package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class q0 implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final i createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        long j10 = 0;
        long j11 = 0;
        MediaInfo mediaInfo = null;
        l lVar = null;
        Boolean bool = null;
        long[] jArr = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        double d = 0.0d;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.e(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    lVar = (l) SafeParcelReader.e(parcel, readInt, l.CREATOR);
                    break;
                case 4:
                    bool = SafeParcelReader.m(parcel, readInt);
                    break;
                case 5:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 6:
                    d = SafeParcelReader.n(parcel, readInt);
                    break;
                case 7:
                    jArr = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\t':
                    str2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\n':
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 11:
                    str4 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\f':
                    str5 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\r':
                    j11 = SafeParcelReader.r(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new i(mediaInfo, lVar, bool, j10, d, jArr, a9.a.a(str), str2, str3, str4, str5, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i10) {
        return new i[i10];
    }
}
