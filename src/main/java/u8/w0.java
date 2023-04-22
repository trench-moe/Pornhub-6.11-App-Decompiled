package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class w0 implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public final o createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        double d = 0.0d;
        double d10 = 0.0d;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        c cVar = null;
        s sVar = null;
        h hVar = null;
        l lVar = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.e(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 4:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 5:
                    d = SafeParcelReader.n(parcel, readInt);
                    break;
                case 6:
                    i11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 7:
                    i12 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\b':
                    j11 = SafeParcelReader.r(parcel, readInt);
                    break;
                case '\t':
                    j12 = SafeParcelReader.r(parcel, readInt);
                    break;
                case '\n':
                    d10 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 11:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\f':
                    jArr = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\r':
                    i13 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 14:
                    i14 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 15:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 16:
                    i15 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 17:
                    arrayList = SafeParcelReader.j(parcel, readInt, m.CREATOR);
                    break;
                case 18:
                    z11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 19:
                    cVar = (c) SafeParcelReader.e(parcel, readInt, c.CREATOR);
                    break;
                case 20:
                    sVar = (s) SafeParcelReader.e(parcel, readInt, s.CREATOR);
                    break;
                case 21:
                    hVar = (h) SafeParcelReader.e(parcel, readInt, h.CREATOR);
                    break;
                case 22:
                    lVar = (l) SafeParcelReader.e(parcel, readInt, l.CREATOR);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new o(mediaInfo, j10, i10, d, i11, i12, j11, j12, d10, z10, jArr, i13, i14, str, i15, arrayList, z11, cVar, sVar, hVar, lVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o[] newArray(int i10) {
        return new o[i10];
    }
}
