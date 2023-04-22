package w8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class j implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final f createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = SafeParcelReader.h(parcel, readInt);
                    break;
                case 3:
                    iArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 4:
                    j10 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 5:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 6:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 7:
                    i11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\b':
                    i12 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\t':
                    i13 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\n':
                    i14 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 11:
                    i15 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\f':
                    i16 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\r':
                    i17 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 14:
                    i18 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 15:
                    i19 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 16:
                    i20 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 17:
                    i21 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 18:
                    i22 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 19:
                    i23 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 20:
                    i24 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 21:
                    i25 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 22:
                    i26 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 23:
                    i27 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 24:
                    i28 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 25:
                    i29 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 26:
                    i30 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 27:
                    i31 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 28:
                    i32 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 29:
                    i33 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 30:
                    i34 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 31:
                    i35 = SafeParcelReader.q(parcel, readInt);
                    break;
                case ' ':
                    i36 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '!':
                    iBinder = SafeParcelReader.p(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new f(arrayList, iArr, j10, str, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i10) {
        return new f[i10];
    }
}
