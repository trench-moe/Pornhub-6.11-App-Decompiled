package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkm implements zzkv {
    public final /* synthetic */ zzkp zza;

    public zzkm(zzkp zzkpVar) {
        this.zza = zzkpVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zza(String str, String str2, Bundle bundle) {
        zzfr zzfrVar;
        zzfr zzfrVar2;
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzaz().zzp(new zzkl(this, str, "_err", bundle));
            return;
        }
        zzkp zzkpVar = this.zza;
        zzfrVar = zzkpVar.zzn;
        if (zzfrVar != null) {
            zzfrVar2 = zzkpVar.zzn;
            zzfrVar2.zzay().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
