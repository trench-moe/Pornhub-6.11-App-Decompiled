package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhh implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzhw zzb;

    public zzhh(zzhw zzhwVar, AtomicReference atomicReference) {
        this.zzb = zzhwVar;
        this.zza = atomicReference;
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
            r9 = this;
            r5 = r9
            java.util.concurrent.atomic.AtomicReference r0 = r5.zza
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r5.zza     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.measurement.internal.zzhw r2 = r5.zzb     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.measurement.internal.zzfr r2 = r2.zzs     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.measurement.internal.zzaf r8 = r2.zzf()     // Catch: java.lang.Throwable -> L36
            r2 = r8
            com.google.android.gms.measurement.internal.zzhw r3 = r5.zzb     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.measurement.internal.zzfr r3 = r3.zzs     // Catch: java.lang.Throwable -> L36
            r7 = 4
            com.google.android.gms.measurement.internal.zzdy r8 = r3.zzh()     // Catch: java.lang.Throwable -> L36
            r3 = r8
            java.lang.String r8 = r3.zzl()     // Catch: java.lang.Throwable -> L36
            r3 = r8
            com.google.android.gms.measurement.internal.zzdt r4 = com.google.android.gms.measurement.internal.zzdu.zzJ     // Catch: java.lang.Throwable -> L36
            boolean r8 = r2.zzs(r3, r4)     // Catch: java.lang.Throwable -> L36
            r2 = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L36
            r2 = r8
            r1.set(r2)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.atomic.AtomicReference r1 = r5.zza     // Catch: java.lang.Throwable -> L40
            r1.notify()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            return
        L36:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r5.zza     // Catch: java.lang.Throwable -> L40
            r7 = 1
            r2.notify()     // Catch: java.lang.Throwable -> L40
            r8 = 1
            throw r1     // Catch: java.lang.Throwable -> L40
            r7 = 1
        L40:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r1
            r8 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhh.run():void");
    }
}
