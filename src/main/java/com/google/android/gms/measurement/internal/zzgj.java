package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import c9.h;
import c9.i;
import com.appsflyer.oaid.BuildConfig;
import h9.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import l9.j;
import r3.c;
import w9.b;
import w9.m0;

/* loaded from: classes.dex */
public final class zzgj extends zzdw {
    private final zzkp zza;
    private Boolean zzb;
    private String zzc;

    public zzgj(zzkp zzkpVar, String str) {
        Objects.requireNonNull(zzkpVar, "null reference");
        this.zza = zzkpVar;
        this.zzc = null;
    }

    private final void zzA(zzau zzauVar, zzp zzpVar) {
        this.zza.zzA();
        this.zza.zzD(zzauVar, zzpVar);
    }

    private final void zzy(zzp zzpVar, boolean z10) {
        Objects.requireNonNull(zzpVar, "null reference");
        o.e(zzpVar.zza);
        zzz(zzpVar.zza, false);
        this.zza.zzv().zzW(zzpVar.zzb, zzpVar.zzq);
    }

    private final void zzz(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            this.zza.zzay().zzd().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.zzb == null) {
                    if (!"com.google.android.gms".equals(this.zzc) && !j.a(this.zza.zzau(), Binder.getCallingUid()) && !i.a(this.zza.zzau()).b(Binder.getCallingUid())) {
                        z11 = false;
                        this.zzb = Boolean.valueOf(z11);
                    }
                    z11 = true;
                    this.zzb = Boolean.valueOf(z11);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.zza.zzay().zzd().zzb("Measurement Service called with invalid calling package. appId", zzeh.zzn(str));
                throw e10;
            }
        }
        if (this.zzc == null) {
            Context zzau = this.zza.zzau();
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = h.f3879a;
            if (j.b(zzau, callingUid, str)) {
                this.zzc = str;
            }
        }
        if (str.equals(this.zzc)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    public final zzau zzb(zzau zzauVar, zzp zzpVar) {
        zzas zzasVar;
        if ("_cmp".equals(zzauVar.zza) && (zzasVar = zzauVar.zzb) != null) {
            if (zzasVar.zza() == 0) {
                return zzauVar;
            }
            String zzg = zzauVar.zzb.zzg("_cis");
            if ("referrer broadcast".equals(zzg) || "referrer API".equals(zzg)) {
                this.zza.zzay().zzi().zzb("Event has been filtered ", zzauVar.toString());
                return new zzau("_cmpx", zzauVar.zzb, zzauVar.zzc, zzauVar.zzd);
            }
        }
        return zzauVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final String zzd(zzp zzpVar) {
        zzy(zzpVar, false);
        return this.zza.zzx(zzpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zze(zzp zzpVar, boolean z10) {
        zzy(zzpVar, false);
        String str = zzpVar.zza;
        Objects.requireNonNull(str, "null reference");
        try {
            List<zzku> list = (List) this.zza.zzaz().zzh(new zzgg(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzku zzkuVar : list) {
                if (!z10 && zzkw.zzag(zzkuVar.zzc)) {
                }
                arrayList.add(new zzks(zzkuVar));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzay().zzd().zzc("Failed to get user properties. appId", zzeh.zzn(zzpVar.zza), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzf(String str, String str2, zzp zzpVar) {
        zzy(zzpVar, false);
        String str3 = zzpVar.zza;
        Objects.requireNonNull(str3, "null reference");
        try {
            return (List) this.zza.zzaz().zzh(new zzfx(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzay().zzd().zzb("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzg(String str, String str2, String str3) {
        zzz(str, true);
        try {
            return (List) this.zza.zzaz().zzh(new zzfy(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzay().zzd().zzb("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzh(String str, String str2, boolean z10, zzp zzpVar) {
        zzy(zzpVar, false);
        String str3 = zzpVar.zza;
        Objects.requireNonNull(str3, "null reference");
        try {
            List<zzku> list = (List) this.zza.zzaz().zzh(new zzfv(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzku zzkuVar : list) {
                if (z10 || !zzkw.zzag(zzkuVar.zzc)) {
                    arrayList.add(new zzks(zzkuVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzay().zzd().zzc("Failed to query user properties. appId", zzeh.zzn(zzpVar.zza), e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List zzi(String str, String str2, String str3, boolean z10) {
        zzz(str, true);
        try {
            List<zzku> list = (List) this.zza.zzaz().zzh(new zzfw(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzku zzkuVar : list) {
                if (z10 || !zzkw.zzag(zzkuVar.zzc)) {
                    arrayList.add(new zzks(zzkuVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzay().zzd().zzc("Failed to get user properties as. appId", zzeh.zzn(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzj(zzp zzpVar) {
        zzy(zzpVar, false);
        zzx(new zzgh(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzk(zzau zzauVar, zzp zzpVar) {
        Objects.requireNonNull(zzauVar, "null reference");
        zzy(zzpVar, false);
        zzx(new zzgc(this, zzauVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzl(zzau zzauVar, String str, String str2) {
        Objects.requireNonNull(zzauVar, "null reference");
        o.e(str);
        zzz(str, true);
        zzx(new zzgd(this, zzauVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzm(zzp zzpVar) {
        o.e(zzpVar.zza);
        zzz(zzpVar.zza, false);
        zzx(new zzfz(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzn(zzab zzabVar, zzp zzpVar) {
        Objects.requireNonNull(zzabVar, "null reference");
        Objects.requireNonNull(zzabVar.zzc, "null reference");
        zzy(zzpVar, false);
        zzab zzabVar2 = new zzab(zzabVar);
        zzabVar2.zza = zzpVar.zza;
        zzx(new zzft(this, zzabVar2, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzo(zzab zzabVar) {
        Objects.requireNonNull(zzabVar, "null reference");
        Objects.requireNonNull(zzabVar.zzc, "null reference");
        o.e(zzabVar.zza);
        zzz(zzabVar.zza, true);
        zzx(new zzfu(this, new zzab(zzabVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzp(zzp zzpVar) {
        o.e(zzpVar.zza);
        Objects.requireNonNull(zzpVar.zzv, "null reference");
        zzgb zzgbVar = new zzgb(this, zzpVar);
        if (this.zza.zzaz().zzs()) {
            zzgbVar.run();
        } else {
            this.zza.zzaz().zzq(zzgbVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzq(long j10, String str, String str2, String str3) {
        zzx(new zzgi(this, str2, str3, str, j10));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzr(final Bundle bundle, zzp zzpVar) {
        zzy(zzpVar, false);
        final String str = zzpVar.zza;
        Objects.requireNonNull(str, "null reference");
        zzx(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzfs
            @Override // java.lang.Runnable
            public final void run() {
                zzgj.this.zzw(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzs(zzp zzpVar) {
        zzy(zzpVar, false);
        zzx(new zzga(this, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzt(zzks zzksVar, zzp zzpVar) {
        Objects.requireNonNull(zzksVar, "null reference");
        zzy(zzpVar, false);
        zzx(new zzgf(this, zzksVar, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final byte[] zzu(zzau zzauVar, String str) {
        o.e(str);
        Objects.requireNonNull(zzauVar, "null reference");
        zzz(str, true);
        this.zza.zzay().zzc().zzb("Log and bundle. event", this.zza.zzj().zzd(zzauVar.zza));
        Objects.requireNonNull((c) this.zza.zzav());
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzaz().zzi(new zzge(this, zzauVar, str)).get();
            if (bArr == null) {
                this.zza.zzay().zzd().zzb("Log and bundle returned null. appId", zzeh.zzn(str));
                bArr = new byte[0];
            }
            Objects.requireNonNull((c) this.zza.zzav());
            this.zza.zzay().zzc().zzd("Log and bundle processed. event, size, time_ms", this.zza.zzj().zzd(zzauVar.zza), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.zza.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzeh.zzn(str), this.zza.zzj().zzd(zzauVar.zza), e10);
            return null;
        }
    }

    public final void zzv(zzau zzauVar, zzp zzpVar) {
        Map zzs;
        String zza;
        if (!this.zza.zzo().zzl(zzpVar.zza)) {
            zzA(zzauVar, zzpVar);
            return;
        }
        this.zza.zzay().zzj().zzb("EES config found for", zzpVar.zza);
        zzfi zzo = this.zza.zzo();
        String str = zzpVar.zza;
        m0 m0Var = TextUtils.isEmpty(str) ? null : (m0) zzo.zzc.get(str);
        if (m0Var == null) {
            this.zza.zzay().zzj().zzb("EES not loaded for", zzpVar.zza);
            zzA(zzauVar, zzpVar);
            return;
        }
        try {
            zzs = this.zza.zzu().zzs(zzauVar.zzb.zzc(), true);
            zza = zzgo.zza(zzauVar.zza);
            if (zza == null) {
                zza = zzauVar.zza;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzay().zzd().zzc("EES error. appId, eventName", zzpVar.zzb, zzauVar.zza);
        }
        if (!m0Var.b(new b(zza, zzauVar.zzd, zzs))) {
            this.zza.zzay().zzj().zzb("EES was not applied to event", zzauVar.zza);
            zzA(zzauVar, zzpVar);
            return;
        }
        if (m0Var.c()) {
            this.zza.zzay().zzj().zzb("EES edited event", zzauVar.zza);
            zzA(this.zza.zzu().zzi((b) m0Var.f17235c.f13277j), zzpVar);
        } else {
            zzA(zzauVar, zzpVar);
        }
        if (!((List) m0Var.f17235c.f13278m).isEmpty()) {
            for (b bVar : (List) m0Var.f17235c.f13278m) {
                this.zza.zzay().zzj().zzb("EES logging created event", bVar.f17072a);
                zzA(this.zza.zzu().zzi(bVar), zzpVar);
            }
        }
    }

    public final /* synthetic */ void zzw(String str, Bundle bundle) {
        zzak zzi = this.zza.zzi();
        zzi.zzg();
        zzi.zzW();
        byte[] i10 = zzi.zzf.zzu().zzj(new zzap(zzi.zzs, BuildConfig.FLAVOR, str, "dep", 0L, 0L, bundle)).i();
        zzi.zzs.zzay().zzj().zzc("Saving default event parameters, appId, data size", zzi.zzs.zzj().zzd(str), Integer.valueOf(i10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", i10);
        try {
            if (zzi.zzh().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzi.zzs.zzay().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e10) {
            zzi.zzs.zzay().zzd().zzc("Error storing default event parameters. appId", zzeh.zzn(str), e10);
        }
    }

    public final void zzx(Runnable runnable) {
        Objects.requireNonNull(runnable, "null reference");
        if (this.zza.zzaz().zzs()) {
            runnable.run();
        } else {
            this.zza.zzaz().zzp(runnable);
        }
    }
}
