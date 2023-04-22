package a9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d9.c;

/* loaded from: classes.dex */
public final class y extends h9.f<i> {
    public y(Context context, Looper looper, h9.c cVar, c.a aVar, c.b bVar) {
        super(context, looper, 161, cVar, aVar, bVar);
    }

    @Override // h9.b
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
    }

    @Override // h9.b
    public final c9.d[] getApiFeatures() {
        return u8.z.f15770e;
    }

    @Override // h9.b, d9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // h9.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // h9.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // h9.b
    public final boolean usesClientTelemetry() {
        return true;
    }
}
