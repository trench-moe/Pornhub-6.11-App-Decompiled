package f9;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final DataHolder createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                strArr = SafeParcelReader.g(parcel, readInt);
            } else if (c10 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.i(parcel, readInt, CursorWindow.CREATOR);
            } else if (c10 == 3) {
                i12 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 4) {
                bundle = SafeParcelReader.a(parcel, readInt);
            } else if (c10 != 1000) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                i11 = SafeParcelReader.q(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        DataHolder dataHolder = new DataHolder(i11, strArr, cursorWindowArr, i12, bundle);
        dataHolder.f6865j = new Bundle();
        int i13 = 0;
        while (true) {
            String[] strArr2 = dataHolder.f6864f;
            if (i13 >= strArr2.length) {
                break;
            }
            dataHolder.f6865j.putInt(strArr2[i13], i13);
            i13++;
        }
        dataHolder.f6868u = new int[dataHolder.f6866m.length];
        int i14 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr2 = dataHolder.f6866m;
            if (i10 >= cursorWindowArr2.length) {
                return dataHolder;
            }
            dataHolder.f6868u[i10] = i14;
            i14 += dataHolder.f6866m[i10].getNumRows() - (i14 - cursorWindowArr2[i10].getStartPosition());
            i10++;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
