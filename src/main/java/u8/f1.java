package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f1 implements Parcelable.Creator<CastDevice> {
    @Override // android.os.Parcelable.Creator
    public final CastDevice createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
        boolean z10 = false;
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
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 6:
                    str5 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 7:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\b':
                    arrayList = SafeParcelReader.j(parcel, readInt, g9.a.CREATOR);
                    break;
                case '\t':
                    i11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\n':
                    i12 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 11:
                    str6 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\f':
                    str7 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\r':
                    i13 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 14:
                    str8 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 15:
                    bArr = SafeParcelReader.b(parcel, readInt);
                    break;
                case 16:
                    str9 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 17:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new CastDevice(str, str2, str3, str4, str5, i10, arrayList, i11, i12, str6, str7, i13, str8, bArr, str9, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastDevice[] newArray(int i10) {
        return new CastDevice[i10];
    }
}
