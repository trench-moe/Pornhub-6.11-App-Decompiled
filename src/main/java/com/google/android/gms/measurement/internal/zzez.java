package com.google.android.gms.measurement.internal;

import m9.b;
import m9.c;

/* loaded from: classes.dex */
public final class zzez {
    public final zzfr zza;

    public zzez(zzkp zzkpVar) {
        this.zza = zzkpVar.zzq();
    }

    public final boolean zza() {
        try {
            b a10 = c.a(this.zza.zzau());
            if (a10 != null) {
                return a10.f13032a.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zza.zzay().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.zza.zzay().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
