package w9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class f0 extends c0 implements h0 {
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // w9.h0
    public final Bundle m(Bundle bundle) {
        Parcel zza = zza();
        e0.b(zza, bundle);
        Parcel zzb = zzb(1, zza);
        Bundle bundle2 = (Bundle) e0.a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }
}
