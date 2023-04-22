package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.support.v4.media.a;
import android.support.v4.media.b;
import w9.f0;
import w9.g0;
import w9.h0;

/* loaded from: classes.dex */
public final class zzey implements ServiceConnection {
    public final /* synthetic */ zzez zza;
    private final String zzb;

    public zzey(zzez zzezVar, String str) {
        this.zza = zzezVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            a.m(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i10 = g0.f17161a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            h0 f0Var = queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new f0(iBinder);
            if (f0Var == null) {
                this.zza.zza.zzay().zzk().zza("Install Referrer Service implementation was not found");
                return;
            }
            this.zza.zza.zzay().zzj().zza("Install Referrer Service connected");
            this.zza.zza.zzaz().zzp(new zzex(this, f0Var, this));
        } catch (RuntimeException e10) {
            this.zza.zza.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b.s(this.zza.zza, "Install Referrer Service disconnected");
    }
}
