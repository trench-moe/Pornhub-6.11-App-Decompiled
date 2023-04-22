package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import h9.o;
import k9.a;
import p8.w;

/* loaded from: classes.dex */
public final class zzcb implements ServiceConnection {
    public final /* synthetic */ zzcc zza;
    private volatile boolean zzb;
    private volatile zzey zzc;

    public zzcb(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #4 {, blocks: (B:7:0x0016, B:8:0x0019, B:33:0x00a1, B:34:0x00a6, B:6:0x000c, B:11:0x001e, B:13:0x002b, B:15:0x0037, B:17:0x0042, B:25:0x005b, B:27:0x0066, B:29:0x0080, B:31:0x0084, B:32:0x009f, B:16:0x003b, B:20:0x004d), top: B:49:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcb.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o.d("AnalyticsServiceConnection.onServiceDisconnected");
        this.zza.zzq().c(new zzca(this, componentName));
    }

    public final zzey zza() {
        zzcb zzcbVar;
        w.b();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context zzo = this.zza.zzo();
        intent.putExtra("app_package_name", zzo.getPackageName());
        a b10 = a.b();
        synchronized (this) {
            this.zzc = null;
            this.zzb = true;
            zzcbVar = this.zza.zza;
            boolean a10 = b10.a(zzo, intent, zzcbVar, 129);
            this.zza.zzP("Bind to service requested", Boolean.valueOf(a10));
            if (!a10) {
                this.zzb = false;
                return null;
            }
            try {
                this.zza.zzw();
                wait(zzeu.zzL.zzb().longValue());
            } catch (InterruptedException unused) {
                this.zza.zzR("Wait for service connect was interrupted");
            }
            this.zzb = false;
            zzey zzeyVar = this.zzc;
            this.zzc = null;
            if (zzeyVar == null) {
                this.zza.zzJ("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzeyVar;
        }
    }
}
