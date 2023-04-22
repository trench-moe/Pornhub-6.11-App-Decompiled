package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import w9.e3;
import w9.n3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzko {
    public n3 zza;
    public List zzb;
    public List zzc;
    public long zzd;
    public final /* synthetic */ zzkp zze;

    public /* synthetic */ zzko(zzkp zzkpVar, zzkn zzknVar) {
        this.zze = zzkpVar;
    }

    private static final long zzb(e3 e3Var) {
        return ((e3Var.v() / 1000) / 60) / 60;
    }

    public final boolean zza(long j10, e3 e3Var) {
        Objects.requireNonNull(e3Var, "null reference");
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (this.zzc.size() <= 0 || zzb((e3) this.zzc.get(0)) == zzb(e3Var)) {
            long b10 = this.zzd + e3Var.b();
            this.zze.zzg();
            if (b10 >= Math.max(0, ((Integer) zzdu.zzh.zza(null)).intValue())) {
                return false;
            }
            this.zzd = b10;
            this.zzc.add(e3Var);
            this.zzb.add(Long.valueOf(j10));
            int size = this.zzc.size();
            this.zze.zzg();
            return size < Math.max(1, ((Integer) zzdu.zzi.zza(null)).intValue());
        }
        return false;
    }
}
