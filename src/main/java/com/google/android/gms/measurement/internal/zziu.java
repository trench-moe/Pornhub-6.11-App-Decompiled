package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziu extends zzan {
    public final /* synthetic */ zzjk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziu(zzjk zzjkVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzjkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        zzjk zzjkVar = this.zza;
        zzjkVar.zzg();
        if (zzjkVar.zzL()) {
            zzjkVar.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzjkVar.zzs();
        }
    }
}
