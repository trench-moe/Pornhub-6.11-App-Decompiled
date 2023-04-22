package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzki implements zzej {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzkp zzb;

    public zzki(zzkp zzkpVar, String str) {
        this.zzb = zzkpVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zza(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzJ(i10, th, bArr, this.zza);
    }
}
