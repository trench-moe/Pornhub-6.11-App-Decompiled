package a9;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class g extends t9.l implements h {
    public g() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // t9.l
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10 = false;
        switch (i10) {
            case 1:
                l(parcel.readInt());
                break;
            case 2:
                u8.d dVar = (u8.d) t9.v.a(parcel, u8.d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                P0(dVar, readString, readString2, z10);
                break;
            case 3:
                zzc(parcel.readInt());
                break;
            case 4:
                String readString3 = parcel.readString();
                double readDouble = parcel.readDouble();
                int i12 = t9.v.f15358a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                B0(readString3, readDouble, z10);
                break;
            case 5:
                d0(parcel.readString(), parcel.readString());
                break;
            case 6:
                T0(parcel.readString(), parcel.createByteArray());
                break;
            case 7:
                k(parcel.readInt());
                break;
            case 8:
                zzg(parcel.readInt());
                break;
            case 9:
                i(parcel.readInt());
                break;
            case 10:
                H(parcel.readString(), parcel.readLong(), parcel.readInt());
                break;
            case 11:
                F0(parcel.readString(), parcel.readLong());
                break;
            case 12:
                u((c) t9.v.a(parcel, c.CREATOR));
                break;
            case 13:
                X0((d0) t9.v.a(parcel, d0.CREATOR));
                break;
            case 14:
                v0(parcel.readInt());
                break;
            case 15:
                J0(parcel.readInt());
                break;
            default:
                return false;
        }
        return true;
    }
}
