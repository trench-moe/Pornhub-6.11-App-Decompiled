package com.google.android.gms.internal.gtm;

import android.util.DisplayMetrics;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzcx extends zzbs {
    public zzcx(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public final zzba zza() {
        zzW();
        DisplayMetrics displayMetrics = zzq().f13871a.getResources().getDisplayMetrics();
        zzba zzbaVar = new zzba();
        zzbaVar.zze(zzfs.zzd(Locale.getDefault()));
        zzbaVar.zza = displayMetrics.widthPixels;
        zzbaVar.zzb = displayMetrics.heightPixels;
        return zzbaVar;
    }

    public final String zzb() {
        zzW();
        zzba zza = zza();
        int i10 = zza.zza;
        int i11 = zza.zzb;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }
}
