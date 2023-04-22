package com.google.android.gms.internal.gtm;

import java.util.Objects;
import l9.b;
import r3.c;

/* loaded from: classes.dex */
public final class zzez {
    private long zzb;
    private final b zze;
    private final Object zzc = new Object();
    private double zza = 60.0d;
    private final String zzd = "tracking";

    public zzez(int i10, long j10, String str, b bVar) {
        this.zze = bVar;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            Objects.requireNonNull((c) this.zze);
            long currentTimeMillis = System.currentTimeMillis();
            double d = this.zza;
            if (d < 60.0d) {
                double d10 = (currentTimeMillis - this.zzb) / 2000.0d;
                if (d10 > 0.0d) {
                    d = Math.min(60.0d, d + d10);
                    this.zza = d;
                }
            }
            this.zzb = currentTimeMillis;
            if (d >= 1.0d) {
                this.zza = d - 1.0d;
                return true;
            }
            String str = this.zzd;
            StringBuilder sb2 = new StringBuilder(str.length() + 34);
            sb2.append("Excessive ");
            sb2.append(str);
            sb2.append(" detected; call ignored.");
            zzfa.zze(sb2.toString());
            return false;
        }
    }
}
