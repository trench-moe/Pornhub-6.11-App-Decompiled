package j9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import e9.i;
import h9.f;
import h9.t;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d extends f<a> {

    /* renamed from: c  reason: collision with root package name */
    public final t f11651c;

    public d(Context context, Looper looper, h9.c cVar, t tVar, e9.c cVar2, i iVar) {
        super(context, looper, 270, cVar, cVar2, iVar);
        this.f11651c = tVar;
    }

    @Override // h9.b
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // h9.b
    public final c9.d[] getApiFeatures() {
        return s9.d.f14932b;
    }

    @Override // h9.b
    public final Bundle getGetServiceRequestExtraArgs() {
        t tVar = this.f11651c;
        Objects.requireNonNull(tVar);
        Bundle bundle = new Bundle();
        String str = tVar.f10378b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // h9.b, d9.a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // h9.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // h9.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // h9.b
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
