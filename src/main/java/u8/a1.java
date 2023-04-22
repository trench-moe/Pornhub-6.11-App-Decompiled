package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class a1 implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final q createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    f10 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 3:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    i11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 5:
                    i12 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 6:
                    i13 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 7:
                    i14 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\b':
                    i15 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\t':
                    i16 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\n':
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 11:
                    i17 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\f':
                    i18 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\r':
                    str2 = SafeParcelReader.f(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new q(f10, i10, i11, i12, i13, i14, i15, i16, str, i17, i18, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q[] newArray(int i10) {
        return new q[i10];
    }
}
