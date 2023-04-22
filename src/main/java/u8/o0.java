package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o0 implements Parcelable.Creator<MediaInfo> {
    @Override // android.os.Parcelable.Creator
    public final MediaInfo createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        j jVar = null;
        ArrayList arrayList = null;
        q qVar = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        r rVar = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 3:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 5:
                    jVar = (j) SafeParcelReader.e(parcel, readInt, j.CREATOR);
                    break;
                case 6:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 7:
                    arrayList = SafeParcelReader.j(parcel, readInt, MediaTrack.CREATOR);
                    break;
                case '\b':
                    qVar = (q) SafeParcelReader.e(parcel, readInt, q.CREATOR);
                    break;
                case '\t':
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\n':
                    arrayList2 = SafeParcelReader.j(parcel, readInt, b.CREATOR);
                    break;
                case 11:
                    arrayList3 = SafeParcelReader.j(parcel, readInt, a.CREATOR);
                    break;
                case '\f':
                    str4 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\r':
                    rVar = (r) SafeParcelReader.e(parcel, readInt, r.CREATOR);
                    break;
                case 14:
                    j11 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 15:
                    str5 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 16:
                    str6 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 17:
                    str7 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 18:
                    str8 = SafeParcelReader.f(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new MediaInfo(str, i10, str2, jVar, j10, arrayList, qVar, str3, arrayList2, arrayList3, str4, rVar, j11, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaInfo[] newArray(int i10) {
        return new MediaInfo[i10];
    }
}
