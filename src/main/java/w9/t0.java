package w9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class t0 extends c0 implements v0 {
    public t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // w9.v0
    public final int c() {
        Parcel zzb = zzb(2, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // w9.v0
    public final void w(String str, String str2, Bundle bundle, long j10) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        e0.b(zza, bundle);
        zza.writeLong(j10);
        zzc(1, zza);
    }
}
