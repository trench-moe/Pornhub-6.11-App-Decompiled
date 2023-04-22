package w9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class q0 extends c0 implements s0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // w9.s0
    public final void m(Bundle bundle) {
        Parcel zza = zza();
        e0.b(zza, bundle);
        zzc(1, zza);
    }
}
