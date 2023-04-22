package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzdt {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzdq zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf = new Object();
    private volatile Object zzg = null;
    private volatile Object zzh = null;

    public /* synthetic */ zzdt(String str, Object obj, Object obj2, zzdq zzdqVar, zzds zzdsVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzdqVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.lang.Object zza(java.lang.Object r8) {
        /*
            r7 = this;
            r3 = r7
            java.lang.Object r0 = r3.zzf
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto Lb
            r5 = 1
            return r8
        Lb:
            com.google.android.gms.measurement.internal.zzaa r8 = com.google.android.gms.measurement.internal.zzdr.zza
            r6 = 5
            if (r8 != 0) goto L13
            java.lang.Object r8 = r3.zzd
            return r8
        L13:
            r6 = 7
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzdt.zza
            monitor-enter(r8)
            r5 = 7
            boolean r6 = com.google.android.gms.measurement.internal.zzaa.zza()     // Catch: java.lang.Throwable -> L89
            r0 = r6
            if (r0 == 0) goto L30
            r5 = 3
            java.lang.Object r0 = r3.zzh     // Catch: java.lang.Throwable -> L89
            r6 = 1
            if (r0 != 0) goto L29
            r6 = 5
            java.lang.Object r0 = r3.zzd     // Catch: java.lang.Throwable -> L89
            goto L2d
        L29:
            r5 = 7
            java.lang.Object r0 = r3.zzh     // Catch: java.lang.Throwable -> L89
            r5 = 2
        L2d:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L89
            r5 = 5
            return r0
        L30:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L89
            java.util.List r6 = com.google.android.gms.measurement.internal.zzdu.zzb()     // Catch: java.lang.SecurityException -> L71
            r8 = r6
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.SecurityException -> L71
        L3a:
            boolean r5 = r8.hasNext()     // Catch: java.lang.SecurityException -> L71
            r0 = r5
            if (r0 == 0) goto L72
            r6 = 2
            java.lang.Object r0 = r8.next()     // Catch: java.lang.SecurityException -> L71
            com.google.android.gms.measurement.internal.zzdt r0 = (com.google.android.gms.measurement.internal.zzdt) r0     // Catch: java.lang.SecurityException -> L71
            r6 = 4
            boolean r6 = com.google.android.gms.measurement.internal.zzaa.zza()     // Catch: java.lang.SecurityException -> L71
            r1 = r6
            if (r1 != 0) goto L66
            r5 = 0
            r1 = r5
            com.google.android.gms.measurement.internal.zzdq r2 = r0.zzc     // Catch: java.lang.IllegalStateException -> L5b java.lang.SecurityException -> L71
            r6 = 4
            if (r2 == 0) goto L5b
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L5b java.lang.SecurityException -> L71
        L5b:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzdt.zza     // Catch: java.lang.SecurityException -> L71
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L71
            r0.zzh = r1     // Catch: java.lang.Throwable -> L62
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L62
            goto L3a
        L62:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L62
            throw r8     // Catch: java.lang.SecurityException -> L71
            r5 = 5
        L66:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L71
            r6 = 3
            java.lang.String r6 = "Refreshing flag cache must be done on a worker thread."
            r0 = r6
            r8.<init>(r0)     // Catch: java.lang.SecurityException -> L71
            r6 = 4
            throw r8     // Catch: java.lang.SecurityException -> L71
        L71:
        L72:
            com.google.android.gms.measurement.internal.zzdq r8 = r3.zzc
            if (r8 != 0) goto L7b
            r6 = 4
            java.lang.Object r8 = r3.zzd
            r6 = 3
            return r8
        L7b:
            r5 = 4
            java.lang.Object r6 = r8.zza()     // Catch: java.lang.IllegalStateException -> L82 java.lang.SecurityException -> L85
            r8 = r6
            return r8
        L82:
            java.lang.Object r8 = r3.zzd
            return r8
        L85:
            java.lang.Object r8 = r3.zzd
            r6 = 5
            return r8
        L89:
            r0 = move-exception
            r5 = 4
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L89
            throw r0
            r5 = 5
        L8e:
            r8 = move-exception
            r6 = 6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdt.zza(java.lang.Object):java.lang.Object");
    }

    public final String zzb() {
        return this.zzb;
    }
}
