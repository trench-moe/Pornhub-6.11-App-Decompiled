package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class v0 implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final m createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        double d = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.e(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    d = SafeParcelReader.n(parcel, readInt);
                    break;
                case 6:
                    d10 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 7:
                    d11 = SafeParcelReader.n(parcel, readInt);
                    break;
                case '\b':
                    jArr = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\t':
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new m(mediaInfo, i10, z10, d, d10, d11, jArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i10) {
        return new m[i10];
    }
}
