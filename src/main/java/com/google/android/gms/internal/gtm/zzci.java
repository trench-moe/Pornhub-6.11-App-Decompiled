package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzci implements Runnable {
    public final /* synthetic */ zzck zza;

    public zzci(zzck zzckVar) {
        this.zza = zzckVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzab();
    }
}
