package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class x0 implements Parcelable.Creator<MediaTrack> {
    @Override // android.os.Parcelable.Creator
    public final MediaTrack createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 3:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.f(parcel, readInt);
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
                    i11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\t':
                    arrayList = SafeParcelReader.h(parcel, readInt);
                    break;
                case '\n':
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new MediaTrack(j10, i10, str2, str3, str4, str5, i11, arrayList, a9.a.a(str));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaTrack[] newArray(int i10) {
        return new MediaTrack[i10];
    }
}
