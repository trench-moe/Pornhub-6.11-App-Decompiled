package com.google.android.gms.measurement.internal;

import java.util.List;
import w9.x9;

/* loaded from: classes.dex */
final class zzfg implements x9 {
    public final /* synthetic */ zzfi zza;

    public zzfg(zzfi zzfiVar) {
        this.zza = zzfiVar;
    }

    @Override // w9.x9
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        int i11 = i10 - 1;
        zzef zzi = i11 != 0 ? i11 != 1 ? i11 != 3 ? i11 != 4 ? this.zza.zzs.zzay().zzi() : z10 ? this.zza.zzs.zzay().zzm() : !z11 ? this.zza.zzs.zzay().zzl() : this.zza.zzs.zzay().zzk() : this.zza.zzs.zzay().zzj() : z10 ? this.zza.zzs.zzay().zzh() : !z11 ? this.zza.zzs.zzay().zze() : this.zza.zzs.zzay().zzd() : this.zza.zzs.zzay().zzc();
        int size = list.size();
        if (size == 1) {
            zzi.zzb(str, list.get(0));
        } else if (size == 2) {
            zzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzi.zza(str);
        } else {
            zzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
