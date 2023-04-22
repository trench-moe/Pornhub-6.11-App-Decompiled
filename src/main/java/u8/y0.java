package u8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class y0 implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
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
                    SafeParcelReader.j(parcel, readInt, g9.a.CREATOR);
                    break;
                case 5:
                    arrayList = SafeParcelReader.h(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) SafeParcelReader.e(parcel, readInt, Uri.CREATOR);
                    break;
                case '\b':
                    str4 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\t':
                    str5 = SafeParcelReader.f(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new d(str, str2, arrayList, str3, uri, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}
