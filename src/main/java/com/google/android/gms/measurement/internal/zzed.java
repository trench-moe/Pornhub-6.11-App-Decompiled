package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import h9.b;

/* loaded from: classes.dex */
public final class zzed extends b {
    public zzed(Context context, Looper looper, b.a aVar, b.InterfaceC0147b interfaceC0147b) {
        super(context, looper, 93, aVar, interfaceC0147b, null);
    }

    @Override // h9.b
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(iBinder);
    }

    @Override // h9.b, d9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // h9.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // h9.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
