package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import h9.b;
import h9.o;
import java.util.Objects;
import k9.a;

/* loaded from: classes.dex */
public final class zzjj implements ServiceConnection, b.a, b.InterfaceC0147b {
    public final /* synthetic */ zzjk zza;
    private volatile boolean zzb;
    private volatile zzed zzc;

    public zzjj(zzjk zzjkVar) {
        this.zza = zzjkVar;
    }

    @Override // h9.b.a
    public final void onConnected(Bundle bundle) {
        o.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Objects.requireNonNull(this.zzc, "null reference");
                this.zza.zzs.zzaz().zzp(new zzjg(this, (zzdx) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // h9.b.InterfaceC0147b
    public final void onConnectionFailed(c9.b bVar) {
        o.d("MeasurementServiceConnection.onConnectionFailed");
        zzeh zzl = this.zza.zzs.zzl();
        if (zzl != null) {
            zzl.zzk().zzb("Service connection failed", bVar);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzs.zzaz().zzp(new zzji(this));
    }

    @Override // h9.b.a
    public final void onConnectionSuspended(int i10) {
        o.d("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzs.zzay().zzc().zza("Service connection suspended");
        this.zza.zzs.zzaz().zzp(new zzjh(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjj zzjjVar;
        o.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzs.zzay().zzd().zza("Service connected with null binder");
                return;
            }
            zzdx zzdxVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzdxVar = queryLocalInterface instanceof zzdx ? (zzdx) queryLocalInterface : new zzdv(iBinder);
                    this.zza.zzs.zzay().zzj().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzs.zzay().zzd().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzs.zzay().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if (zzdxVar == null) {
                this.zzb = false;
                try {
                    a b10 = a.b();
                    Context zzau = this.zza.zzs.zzau();
                    zzjjVar = this.zza.zza;
                    b10.c(zzau, zzjjVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzs.zzaz().zzp(new zzje(this, zzdxVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o.d("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzs.zzay().zzc().zza("Service disconnected");
        this.zza.zzs.zzaz().zzp(new zzjf(this, componentName));
    }

    public final void zzb(Intent intent) {
        zzjj zzjjVar;
        this.zza.zzg();
        Context zzau = this.zza.zzs.zzau();
        a b10 = a.b();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzs.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzs.zzay().zzj().zza("Using local app measurement service");
            this.zzb = true;
            zzjjVar = this.zza.zza;
            b10.a(zzau, intent, zzjjVar, 129);
        }
    }

    public final void zzc() {
        this.zza.zzg();
        Context zzau = this.zza.zzs.zzau();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzs.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            if (this.zzc == null || (!this.zzc.isConnecting() && !this.zzc.isConnected())) {
                this.zzc = new zzed(zzau, Looper.getMainLooper(), this, this);
                this.zza.zzs.zzay().zzj().zza("Connecting to remote service");
                this.zzb = true;
                Objects.requireNonNull(this.zzc, "null reference");
                this.zzc.checkAvailabilityAndConnect();
                return;
            }
            this.zza.zzs.zzay().zzj().zza("Already awaiting connection attempt");
        }
    }

    public final void zzd() {
        if (this.zzc != null) {
            if (!this.zzc.isConnected()) {
                if (this.zzc.isConnecting()) {
                }
            }
            this.zzc.disconnect();
        }
        this.zzc = null;
    }
}
