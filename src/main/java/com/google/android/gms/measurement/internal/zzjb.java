package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjb implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzp zzd;
    public final /* synthetic */ zzjk zze;

    public zzjb(zzjk zzjkVar, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar) {
        this.zze = zzjkVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzpVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            r10 = this;
            r7 = r10
            java.util.concurrent.atomic.AtomicReference r0 = r7.zza
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            monitor-enter(r0)
            r9 = 0
            r1 = r9
            r9 = 3
            com.google.android.gms.measurement.internal.zzjk r2 = r7.zze     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            com.google.android.gms.measurement.internal.zzdx r9 = com.google.android.gms.measurement.internal.zzjk.zzh(r2)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r3 = r9
            if (r3 != 0) goto L3d
            r9 = 7
            com.google.android.gms.measurement.internal.zzfr r2 = r2.zzs     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            com.google.android.gms.measurement.internal.zzeh r9 = r2.zzay()     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r2 = r9
            com.google.android.gms.measurement.internal.zzef r9 = r2.zzd()     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r2 = r9
            java.lang.String r3 = "(legacy) Failed to get conditional properties; not connected to service"
            java.lang.String r4 = r7.zzb     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            java.lang.String r5 = r7.zzc     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r9 = 1
            r2.zzd(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            java.util.concurrent.atomic.AtomicReference r2 = r7.zza     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r9 = 4
            java.util.List r9 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r3 = r9
            r2.set(r3)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r9 = 5
            java.util.concurrent.atomic.AtomicReference r1 = r7.zza     // Catch: java.lang.Throwable -> Lb1
            r1.notify()     // Catch: java.lang.Throwable -> Lb1
            r9 = 6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            return
        L3d:
            r9 = 3
            r9 = 2
            boolean r9 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r2 = r9
            if (r2 == 0) goto L67
            com.google.android.gms.measurement.internal.zzp r2 = r7.zzd     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r9 = 6
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r2, r4)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            java.util.concurrent.atomic.AtomicReference r2 = r7.zza     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            java.lang.String r4 = r7.zzb     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r9 = 3
            java.lang.String r5 = r7.zzc     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r9 = 1
            com.google.android.gms.measurement.internal.zzp r6 = r7.zzd     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r9 = 7
            java.util.List r9 = r3.zzf(r4, r5, r6)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r3 = r9
            r2.set(r3)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r9 = 5
            goto L75
        L63:
            r1 = move-exception
            goto La9
        L65:
            r2 = move-exception
            goto L81
        L67:
            java.util.concurrent.atomic.AtomicReference r2 = r7.zza     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            java.lang.String r4 = r7.zzb     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            java.lang.String r5 = r7.zzc     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            java.util.List r9 = r3.zzg(r1, r4, r5)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r3 = r9
            r2.set(r3)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
        L75:
            com.google.android.gms.measurement.internal.zzjk r2 = r7.zze     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            r9 = 2
            com.google.android.gms.measurement.internal.zzjk.zzp(r2)     // Catch: java.lang.Throwable -> L63 android.os.RemoteException -> L65
            java.util.concurrent.atomic.AtomicReference r1 = r7.zza     // Catch: java.lang.Throwable -> Lb1
        L7d:
            r1.notify()     // Catch: java.lang.Throwable -> Lb1
            goto La6
        L81:
            com.google.android.gms.measurement.internal.zzjk r3 = r7.zze     // Catch: java.lang.Throwable -> L63
            r9 = 6
            com.google.android.gms.measurement.internal.zzfr r3 = r3.zzs     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.measurement.internal.zzeh r3 = r3.zzay()     // Catch: java.lang.Throwable -> L63
            com.google.android.gms.measurement.internal.zzef r9 = r3.zzd()     // Catch: java.lang.Throwable -> L63
            r3 = r9
            java.lang.String r4 = "(legacy) Failed to get conditional properties; remote exception"
            r9 = 2
            java.lang.String r5 = r7.zzb     // Catch: java.lang.Throwable -> L63
            r9 = 7
            r3.zzd(r4, r1, r5, r2)     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.atomic.AtomicReference r1 = r7.zza     // Catch: java.lang.Throwable -> L63
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L63
            r1.set(r2)     // Catch: java.lang.Throwable -> L63
            r9 = 3
            java.util.concurrent.atomic.AtomicReference r1 = r7.zza     // Catch: java.lang.Throwable -> Lb1
            r9 = 5
            goto L7d
        La6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            r9 = 4
            return
        La9:
            java.util.concurrent.atomic.AtomicReference r2 = r7.zza     // Catch: java.lang.Throwable -> Lb1
            r2.notify()     // Catch: java.lang.Throwable -> Lb1
            r9 = 6
            throw r1     // Catch: java.lang.Throwable -> Lb1
            r9 = 5
        Lb1:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            throw r1
            r9 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjb.run():void");
    }
}
