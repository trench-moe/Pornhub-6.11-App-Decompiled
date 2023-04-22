package a9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import d9.c;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c0 extends h9.f<f> {

    /* renamed from: g  reason: collision with root package name */
    public static final b f268g = new b("CastClientImplCxless");

    /* renamed from: c  reason: collision with root package name */
    public final CastDevice f269c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f270e;

    /* renamed from: f  reason: collision with root package name */
    public final String f271f;

    public c0(Context context, Looper looper, h9.c cVar, CastDevice castDevice, long j10, Bundle bundle, String str, c.a aVar, c.b bVar) {
        super(context, looper, 10, cVar, aVar, bVar);
        this.f269c = castDevice;
        this.d = j10;
        this.f270e = bundle;
        this.f271f = str;
    }

    @Override // h9.b
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // h9.b
    public final void disconnect() {
        try {
            try {
                ((f) getService()).e1();
            } catch (RemoteException | IllegalStateException e10) {
                f268g.b(e10, "Error while disconnecting the controller interface", new Object[0]);
            }
        } finally {
            super.disconnect();
        }
    }

    @Override // h9.b
    public final c9.d[] getApiFeatures() {
        return u8.z.f15770e;
    }

    @Override // h9.b
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f268g.a("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.f269c;
        Objects.requireNonNull(castDevice);
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.d);
        bundle.putString("connectionless_client_record_id", this.f271f);
        Bundle bundle2 = this.f270e;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // h9.b, d9.a.f
    public final int getMinApkVersion() {
        return 19390000;
    }

    @Override // h9.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
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
