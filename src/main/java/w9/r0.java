package w9;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class r0 extends d0 implements s0 {
    public r0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // w9.d0
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            ((l0) this).m((Bundle) e0.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
