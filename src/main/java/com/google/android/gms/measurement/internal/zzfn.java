package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfn extends Thread {
    public final /* synthetic */ zzfo zza;
    private final Object zzb;
    private final BlockingQueue zzc;
    private boolean zzd = false;

    public zzfn(zzfo zzfoVar, String str, BlockingQueue blockingQueue) {
        this.zza = zzfoVar;
        Objects.requireNonNull(str, "null reference");
        Objects.requireNonNull(blockingQueue, "null reference");
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzfn zzfnVar;
        zzfn zzfnVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            if (!this.zzd) {
                semaphore = this.zza.zzi;
                semaphore.release();
                obj2 = this.zza.zzh;
                obj2.notifyAll();
                zzfo zzfoVar = this.zza;
                zzfnVar = zzfoVar.zzb;
                if (this == zzfnVar) {
                    zzfoVar.zzb = null;
                } else {
                    zzfnVar2 = zzfoVar.zzc;
                    if (this == zzfnVar2) {
                        zzfoVar.zzc = null;
                    } else {
                        zzfoVar.zzs.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                    }
                }
                this.zzd = true;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzs.zzay().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object obj;
        Semaphore semaphore;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                zzc(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfm zzfmVar = (zzfm) this.zzc.poll();
                if (zzfmVar != null) {
                    Process.setThreadPriority(true != zzfmVar.zza ? 10 : threadPriority);
                    zzfmVar.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzfo.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e11) {
                                zzc(e11);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        if (this.zzc.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.zza.zzs.zzf().zzs(null, zzdu.zzae)) {
                zzb();
            }
        } finally {
            zzb();
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}
