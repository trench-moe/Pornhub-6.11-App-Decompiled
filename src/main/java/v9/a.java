package v9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n9.a;

/* loaded from: classes.dex */
public class a extends Binder implements IInterface {
    public a() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        p9.b bVar = (p9.b) this;
        if (i10 == 1) {
            bVar.init(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        boolean z10 = false;
        if (i10 == 2) {
            String readString = parcel.readString();
            int i12 = b.f16108a;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            boolean booleanFlagValue = bVar.getBooleanFlagValue(readString, z10, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        } else if (i10 == 3) {
            int intFlagValue = bVar.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        } else if (i10 == 4) {
            long longFlagValue = bVar.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        } else if (i10 != 5) {
            return false;
        } else {
            String stringFlagValue = bVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
            return true;
        }
    }
}
