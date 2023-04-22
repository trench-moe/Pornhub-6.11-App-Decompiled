package x9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d9.c;

/* loaded from: classes2.dex */
public final class c extends h9.f<i> {
    public c(Context context, Looper looper, h9.c cVar, c.a aVar, c.b bVar) {
        super(context, looper, 45, cVar, aVar, bVar);
    }

    @Override // h9.b
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
    }

    @Override // h9.b, d9.a.f
    public final int getMinApkVersion() {
        return 12200000;
    }

    @Override // h9.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // h9.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // h9.b
    public final boolean usesClientTelemetry() {
        return true;
    }
}
