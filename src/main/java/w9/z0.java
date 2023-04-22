package w9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 2:
                    j11 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 3:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 5:
                    str2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, readInt);
                    break;
                case '\b':
                    str4 = SafeParcelReader.f(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new y0(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new y0[i10];
    }
}
