package v8;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class w extends t9.l implements x {
    public w() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    @Override // t9.l
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10 = false;
        switch (i10) {
            case 1:
                n9.b bVar = new n9.b(((y) this).f16105a);
                parcel2.writeNoException();
                t9.v.d(parcel2, bVar);
                break;
            case 2:
                ((y) this).f16105a.h((Bundle) t9.v.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                ((y) this).f16105a.g((Bundle) t9.v.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                int i12 = t9.v.f15358a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                ((y) this).f16105a.a(z10);
                parcel2.writeNoException();
                break;
            case 5:
                long b10 = ((y) this).f16105a.b();
                parcel2.writeNoException();
                parcel2.writeLong(b10);
                break;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                break;
            case 7:
                ((y) this).f16105a.f((Bundle) t9.v.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                ((y) this).f16105a.e((Bundle) t9.v.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 9:
                ((y) this).f16105a.i((Bundle) t9.v.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
