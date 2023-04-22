package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b0 implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        u8.g gVar = null;
        w8.a aVar = null;
        double d = 0.0d;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 3:
                    arrayList = SafeParcelReader.h(parcel, readInt);
                    break;
                case 4:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    gVar = (u8.g) SafeParcelReader.e(parcel, readInt, u8.g.CREATOR);
                    break;
                case 6:
                    z11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    aVar = (w8.a) SafeParcelReader.e(parcel, readInt, w8.a.CREATOR);
                    break;
                case '\b':
                    z12 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\t':
                    d = SafeParcelReader.n(parcel, readInt);
                    break;
                case '\n':
                    z13 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 11:
                    z14 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\f':
                    z15 = SafeParcelReader.l(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new c(str, arrayList, z10, gVar, z11, aVar, z12, d, z13, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i10) {
        return new c[i10];
    }
}
