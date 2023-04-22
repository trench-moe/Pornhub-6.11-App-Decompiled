package h9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class e1 implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        q qVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    qVar = (q) SafeParcelReader.e(parcel, readInt, q.CREATOR);
                    break;
                case 2:
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 3:
                    z11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    iArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 5:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.c(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new d(qVar, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}
