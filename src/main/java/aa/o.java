package aa;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import t9.k0;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<b> {
    public static void a(b bVar, Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, bVar.f323c, false);
        k0.q(parcel, 3, bVar.f324f, i10, false);
        k0.q(parcel, 4, bVar.f325j, i10, false);
        long j10 = bVar.f326m;
        parcel.writeInt(524293);
        parcel.writeLong(j10);
        k0.m(parcel, 6, bVar.n, false);
        k0.z(parcel, v2);
    }

    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j10 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 3) {
                dataHolder = (DataHolder) SafeParcelReader.e(parcel, readInt, DataHolder.CREATOR);
            } else if (c10 == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c10 == 5) {
                j10 = SafeParcelReader.r(parcel, readInt);
            } else if (c10 != 6) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                bArr = SafeParcelReader.b(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new b(str, dataHolder, parcelFileDescriptor, j10, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
