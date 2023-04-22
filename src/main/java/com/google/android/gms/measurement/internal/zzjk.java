package com.google.android.gms.measurement.internal;

import a0.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.b;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import w9.s0;

/* loaded from: classes.dex */
public final class zzjk extends zzf {
    private final zzjj zza;
    private zzdx zzb;
    private volatile Boolean zzc;
    private final zzan zzd;
    private final zzkb zze;
    private final List zzf;
    private final zzan zzg;

    public zzjk(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzf = new ArrayList();
        this.zze = new zzkb(zzfrVar.zzav());
        this.zza = new zzjj(this);
        this.zzd = new zziu(this, zzfrVar);
        this.zzg = new zziw(this, zzfrVar);
    }

    private final zzp zzO(boolean z10) {
        Pair zza;
        this.zzs.zzaw();
        zzdy zzh = this.zzs.zzh();
        String str = null;
        if (z10) {
            zzeh zzay = this.zzs.zzay();
            if (zzay.zzs.zzm().zzb != null && (zza = zzay.zzs.zzm().zzb.zza()) != null && zza != zzew.zza) {
                String valueOf = String.valueOf(zza.second);
                String str2 = (String) zza.first;
                str = b.n(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
            }
        }
        return zzh.zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzs.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable runnable : this.zzf) {
            try {
                runnable.run();
            } catch (RuntimeException e10) {
                this.zzs.zzay().zzd().zzb("Task exception while flushing queue", e10);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzan zzanVar = this.zzd;
        this.zzs.zzf();
        zzanVar.zzd(((Long) zzdu.zzI.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.zzf.size();
        this.zzs.zzf();
        if (size >= 1000) {
            a.t(this.zzs, "Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzs.zzaw();
        return true;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzjk zzjkVar, ComponentName componentName) {
        zzjkVar.zzg();
        if (zzjkVar.zzb != null) {
            zzjkVar.zzb = null;
            zzjkVar.zzs.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjkVar.zzg();
            zzjkVar.zzr();
        }
    }

    public final void zzA(zzau zzauVar, String str) {
        Objects.requireNonNull(zzauVar, "null reference");
        zzg();
        zza();
        zzS();
        zzR(new zziz(this, true, zzO(true), this.zzs.zzi().zzo(zzauVar), zzauVar, str));
    }

    public final void zzB(s0 s0Var, zzau zzauVar, String str) {
        zzg();
        zza();
        if (this.zzs.zzv().zzo(12451000) == 0) {
            zzR(new zziv(this, zzauVar, str, s0Var));
            return;
        }
        android.support.v4.media.a.m(this.zzs, "Not bundling data. Service unavailable or out of date");
        this.zzs.zzv().zzR(s0Var, new byte[0]);
    }

    public final void zzC() {
        zzg();
        zza();
        zzp zzO = zzO(false);
        zzS();
        this.zzs.zzi().zzj();
        zzR(new zzio(this, zzO));
    }

    public final void zzD(zzdx zzdxVar, i9.a aVar, zzp zzpVar) {
        int i10;
        zzg();
        zza();
        zzS();
        this.zzs.zzf();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzs.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i10 = zzi.size();
            } else {
                i10 = 0;
            }
            if (aVar != null && i10 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                i9.a aVar2 = (i9.a) arrayList.get(i13);
                if (aVar2 instanceof zzau) {
                    try {
                        zzdxVar.zzk((zzau) aVar2, zzpVar);
                    } catch (RemoteException e10) {
                        this.zzs.zzay().zzd().zzb("Failed to send event to the service", e10);
                    }
                } else if (aVar2 instanceof zzks) {
                    try {
                        zzdxVar.zzt((zzks) aVar2, zzpVar);
                    } catch (RemoteException e11) {
                        this.zzs.zzay().zzd().zzb("Failed to send user property to the service", e11);
                    }
                } else if (aVar2 instanceof zzab) {
                    try {
                        zzdxVar.zzn((zzab) aVar2, zzpVar);
                    } catch (RemoteException e12) {
                        this.zzs.zzay().zzd().zzb("Failed to send conditional user property to the service", e12);
                    }
                } else {
                    a.t(this.zzs, "Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    public final void zzE(zzab zzabVar) {
        Objects.requireNonNull(zzabVar, "null reference");
        zzg();
        zza();
        this.zzs.zzaw();
        zzR(new zzja(this, true, zzO(true), this.zzs.zzi().zzn(zzabVar), new zzab(zzabVar), zzabVar));
    }

    public final void zzF(boolean z10) {
        zzg();
        zza();
        if (z10) {
            zzS();
            this.zzs.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zziy(this, zzO(false)));
        }
    }

    public final void zzG(zzid zzidVar) {
        zzg();
        zza();
        zzR(new zzis(this, zzidVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzit(this, zzO(false), bundle));
    }

    public final void zzI() {
        zzg();
        zza();
        zzR(new zzix(this, zzO(true)));
    }

    public final void zzJ(zzdx zzdxVar) {
        zzg();
        Objects.requireNonNull(zzdxVar, "null reference");
        this.zzb = zzdxVar;
        zzQ();
        zzP();
    }

    public final void zzK(zzks zzksVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzim(this, zzO(true), this.zzs.zzi().zzp(zzksVar), zzksVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    public final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzs.zzv().zzm() >= ((Integer) zzdu.zzai.zza(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzN() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjk.zzN():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final Boolean zzj() {
        return this.zzc;
    }

    public final void zzq() {
        zzg();
        zza();
        zzp zzO = zzO(true);
        this.zzs.zzi().zzk();
        zzR(new zzir(this, zzO));
    }

    public final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (zzN()) {
            this.zza.zzc();
        } else if (this.zzs.zzf().zzx()) {
        } else {
            this.zzs.zzaw();
            List<ResolveInfo> queryIntentServices = this.zzs.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzs.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                a.t(this.zzs, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            Context zzau = this.zzs.zzau();
            this.zzs.zzaw();
            intent.setComponent(new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
            this.zza.zzb(intent);
        }
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            k9.a.b().c(this.zzs.zzau(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(s0 s0Var) {
        zzg();
        zza();
        zzR(new zziq(this, zzO(false), s0Var));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzip(this, atomicReference, zzO(false)));
    }

    public final void zzv(s0 s0Var, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjc(this, str, str2, zzO(false), s0Var));
    }

    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjb(this, atomicReference, null, str2, str3, zzO(false)));
    }

    public final void zzx(AtomicReference atomicReference, boolean z10) {
        zzg();
        zza();
        zzR(new zzin(this, atomicReference, zzO(false), z10));
    }

    public final void zzy(s0 s0Var, String str, String str2, boolean z10) {
        zzg();
        zza();
        zzR(new zzil(this, str, str2, zzO(false), z10, s0Var));
    }

    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        zzg();
        zza();
        zzR(new zzjd(this, atomicReference, null, str2, str3, zzO(false), z10));
    }
}
