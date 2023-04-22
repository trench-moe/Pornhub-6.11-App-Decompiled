package w9;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class u0 extends d0 implements v0 {
    public u0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // w9.d0
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            w(parcel.readString(), parcel.readString(), (Bundle) e0.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            int c10 = c();
            parcel2.writeNoException();
            parcel2.writeInt(c10);
        }
        return true;
    }
}
