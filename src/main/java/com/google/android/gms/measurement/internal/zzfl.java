package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfl implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ zzfo zza;
    private final String zzb;

    public zzfl(zzfo zzfoVar, String str) {
        this.zza = zzfoVar;
        Objects.requireNonNull(str, "null reference");
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        try {
            this.zza.zzs.zzay().zzd().zzb(this.zzb, th);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
