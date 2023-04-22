package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import h9.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import p8.a;
import p8.j;
import p8.k;
import p8.p;
import p8.r;
import p8.w;
import p8.y;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzck extends zzbs {
    private boolean zza;
    private final zzce zzb;
    private final zzfe zzc;
    private final zzfc zzd;
    private final zzcc zze;
    private long zzf;
    private final zzcw zzg;
    private final zzcw zzh;
    private final zzfo zzi;
    private long zzj;
    private boolean zzk;

    public zzck(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        Objects.requireNonNull(zzbwVar, "null reference");
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzfc(zzbvVar);
        this.zzb = new zzce(zzbvVar);
        this.zzc = new zzfe(zzbvVar);
        this.zze = new zzcc(zzbvVar);
        this.zzi = new zzfo(zzC());
        this.zzg = new zzcg(this, zzbvVar);
        this.zzh = new zzch(this, zzbvVar);
    }

    private final void zzag() {
        zzcy zzy = zzy();
        if (zzy.zze()) {
            zzy.zza();
        }
    }

    private final void zzah() {
        if (this.zzg.zzh()) {
            zzO("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzai() {
        long j10;
        zzcy zzy = zzy();
        if (zzy.zzc() && !zzy.zze()) {
            w.b();
            zzW();
            try {
                j10 = this.zzb.zzc();
            } catch (SQLiteException e10) {
                zzK("Failed to get min/max hit times from local store", e10);
                j10 = 0;
            }
            if (j10 != 0) {
                Objects.requireNonNull((c) zzC());
                long abs = Math.abs(System.currentTimeMillis() - j10);
                zzw();
                if (abs <= zzeu.zzn.zzb().longValue()) {
                    zzw();
                    zzP("Dispatch alarm scheduled (ms)", Long.valueOf(zzct.zzd()));
                    zzy.zzb();
                }
            }
        }
    }

    private final void zzaj(zzbx zzbxVar, zzaw zzawVar) {
        Objects.requireNonNull(zzbxVar, "null reference");
        Objects.requireNonNull(zzawVar, "null reference");
        j jVar = new j(zzt());
        String zzc = zzbxVar.zzc();
        o.e(zzc);
        Uri c10 = k.c(zzc);
        ListIterator<y> listIterator = jVar.f13844b.f13863k.listIterator();
        while (listIterator.hasNext()) {
            if (c10.equals(listIterator.next().zzb())) {
                listIterator.remove();
            }
        }
        jVar.f13844b.f13863k.add(new k(jVar.d, zzc));
        jVar.f13846e = zzbxVar.zzf();
        p8.o oVar = new p8.o(jVar.f13844b);
        oVar.b(jVar.d.zzh().zza());
        oVar.b(jVar.d.zzk().zza());
        for (p pVar : jVar.f13845c) {
            pVar.zza();
        }
        zzbe zzbeVar = (zzbe) oVar.a(zzbe.class);
        zzbeVar.zzk("data");
        zzbeVar.zzl(true);
        oVar.b(zzawVar);
        zzaz zzazVar = (zzaz) oVar.a(zzaz.class);
        zzav zzavVar = (zzav) oVar.a(zzav.class);
        for (Map.Entry<String, String> entry : zzbxVar.zzd().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("an".equals(key)) {
                zzavVar.zzk(value);
            } else if ("av".equals(key)) {
                zzavVar.zzl(value);
            } else if ("aid".equals(key)) {
                zzavVar.zzi(value);
            } else if ("aiid".equals(key)) {
                zzavVar.zzj(value);
            } else if ("uid".equals(key)) {
                zzbeVar.zzm(value);
            } else {
                zzazVar.zze(key, value);
            }
        }
        zzH("Sending installation campaign to", zzbxVar.zzc(), zzawVar);
        oVar.f13857e = zzA().zza();
        w wVar = oVar.f13854a.f13843a;
        Objects.requireNonNull(wVar);
        if (oVar.f13861i) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (oVar.f13856c) {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        p8.o oVar2 = new p8.o(oVar);
        Objects.requireNonNull((c) oVar2.f13855b);
        oVar2.f13858f = SystemClock.elapsedRealtime();
        long j10 = oVar2.f13857e;
        if (j10 != 0) {
            oVar2.d = j10;
        } else {
            Objects.requireNonNull((c) oVar2.f13855b);
            oVar2.d = System.currentTimeMillis();
        }
        oVar2.f13856c = true;
        wVar.f13873c.execute(new r(wVar, oVar2));
    }

    private final boolean zzak(String str) {
        return m9.c.a(zzo()).f13032a.checkCallingOrSelfPermission(str) == 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzck zzckVar) {
        try {
            zzckVar.zzb.zza();
            zzckVar.zzae();
        } catch (SQLiteException e10) {
            zzckVar.zzS("Failed to delete stale hits", e10);
        }
        zzcw zzcwVar = zzckVar.zzh;
        zzckVar.zzw();
        zzcwVar.zzg(86400000L);
    }

    public final long zza() {
        long j10 = this.zzf;
        if (j10 != Long.MIN_VALUE) {
            return j10;
        }
        zzw();
        long longValue = zzeu.zzi.zzb().longValue();
        zzft zzB = zzB();
        zzB.zzW();
        if (zzB.zzc) {
            zzft zzB2 = zzB();
            zzB2.zzW();
            return zzB2.zzd * 1000;
        }
        return longValue;
    }

    public final void zzaa() {
        zzW();
        o.k(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().c(new zzci(this));
    }

    public final void zzab() {
        zzW();
        zzw();
        w.b();
        Context zza = zzt().zza();
        if (!zzfi.zza(zza)) {
            zzR("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfn.zzh(zza)) {
            zzJ("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!a.zzb(zza)) {
            zzR("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzak("android.permission.ACCESS_NETWORK_STATE")) {
            zzJ("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (!zzak("android.permission.INTERNET")) {
            zzJ("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (zzfn.zzh(zzo())) {
            zzO("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzR("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzac()) {
                zzi();
            }
        }
        zzae();
    }

    public final void zzac() {
        w.b();
        zzW();
        zzF("Sync dispatching local hits");
        long j10 = this.zzj;
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (this.zzj != j10) {
                this.zzd.zzb();
            }
        } catch (Exception e10) {
            zzK("Sync local dispatch failed", e10);
            zzae();
        }
    }

    public final void zzad() {
        zzW();
        w.b();
        this.zzk = true;
        this.zze.zzc();
        zzae();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzae() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzae():void");
    }

    public final boolean zzaf() {
        boolean z10;
        w.b();
        zzW();
        zzO("Dispatching a batch of local hits");
        if (this.zze.zzg()) {
            z10 = false;
        } else {
            zzw();
            z10 = true;
        }
        boolean zze = true ^ this.zzc.zze();
        if (z10 && zze) {
            zzO("No network or service available. Will retry later");
            return false;
        }
        zzw();
        int zzh = zzct.zzh();
        zzw();
        long max = Math.max(zzh, zzct.zzg());
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        while (true) {
            try {
                this.zzb.zzm();
                arrayList.clear();
                try {
                    List<zzex> zzj = this.zzb.zzj(max);
                    if (zzj.isEmpty()) {
                        zzO("Store is empty, nothing to dispatch");
                        zzah();
                        zzag();
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e10) {
                            zzK("Failed to commit local dispatch transaction", e10);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                    zzP("Hits loaded from store. count", Integer.valueOf(zzj.size()));
                    Iterator<zzex> it = zzj.iterator();
                    while (it.hasNext()) {
                        if (it.next().zzb() == j10) {
                            zzL("Database contains successfully uploaded hit", Long.valueOf(j10), Integer.valueOf(zzj.size()));
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e11) {
                                zzK("Failed to commit local dispatch transaction", e11);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                    }
                    if (this.zze.zzg()) {
                        zzw();
                        zzO("Service connected, sending hits to the service");
                        while (!zzj.isEmpty()) {
                            zzex zzexVar = zzj.get(0);
                            if (!this.zze.zzh(zzexVar)) {
                                break;
                            }
                            j10 = Math.max(j10, zzexVar.zzb());
                            zzj.remove(zzexVar);
                            zzG("Hit sent do device AnalyticsService for delivery", zzexVar);
                            try {
                                this.zzb.zzn(zzexVar.zzb());
                                arrayList.add(Long.valueOf(zzexVar.zzb()));
                            } catch (SQLiteException e12) {
                                zzK("Failed to remove hit that was send for delivery", e12);
                                zzah();
                                zzag();
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e13) {
                                    zzK("Failed to commit local dispatch transaction", e13);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                    }
                    if (this.zzc.zze()) {
                        List<Long> zzc = this.zzc.zzc(zzj);
                        for (Long l10 : zzc) {
                            j10 = Math.max(j10, l10.longValue());
                        }
                        try {
                            this.zzb.zzZ(zzc);
                            arrayList.addAll(zzc);
                        } catch (SQLiteException e14) {
                            zzK("Failed to remove successfully uploaded hits", e14);
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e15) {
                                zzK("Failed to commit local dispatch transaction", e15);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e16) {
                            zzK("Failed to commit local dispatch transaction", e16);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                    try {
                        this.zzb.zzab();
                        this.zzb.zzaa();
                    } catch (SQLiteException e17) {
                        zzK("Failed to commit local dispatch transaction", e17);
                        zzah();
                        zzag();
                        return false;
                    }
                } catch (SQLiteException e18) {
                    zzS("Failed to read hits from persisted store", e18);
                    zzah();
                    zzag();
                    try {
                        this.zzb.zzab();
                        this.zzb.zzaa();
                        return false;
                    } catch (SQLiteException e19) {
                        zzK("Failed to commit local dispatch transaction", e19);
                        zzah();
                        zzag();
                        return false;
                    }
                }
            } catch (Throwable th) {
                this.zzb.zzab();
                this.zzb.zzaa();
                throw th;
            }
            try {
                this.zzb.zzab();
                this.zzb.zzaa();
                throw th;
            } catch (SQLiteException e20) {
                zzK("Failed to commit local dispatch transaction", e20);
                zzah();
                zzag();
                return false;
            }
        }
    }

    public final long zzb(zzbx zzbxVar, boolean z10) {
        Objects.requireNonNull(zzbxVar, "null reference");
        zzW();
        w.b();
        try {
            try {
                this.zzb.zzm();
                zzce zzceVar = this.zzb;
                String zzb = zzbxVar.zzb();
                o.e(zzb);
                zzceVar.zzW();
                w.b();
                int delete = zzceVar.zzf().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", zzb});
                if (delete > 0) {
                    zzceVar.zzP("Deleted property records", Integer.valueOf(delete));
                }
                long zze = this.zzb.zze(0L, zzbxVar.zzb(), zzbxVar.zzc());
                zzbxVar.zze(1 + zze);
                zzce zzceVar2 = this.zzb;
                zzceVar2.zzW();
                w.b();
                SQLiteDatabase zzf = zzceVar2.zzf();
                Map<String, String> zzd = zzbxVar.zzd();
                Objects.requireNonNull(zzd, "null reference");
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry<String, String> entry : zzd.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = BuildConfig.FLAVOR;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", (Long) 0L);
                contentValues.put("cid", zzbxVar.zzb());
                contentValues.put("tid", zzbxVar.zzc());
                contentValues.put("adid", Integer.valueOf(zzbxVar.zzf() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzbxVar.zza()));
                contentValues.put("params", encodedQuery);
                try {
                    if (zzf.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                        zzceVar2.zzJ("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e10) {
                    zzceVar2.zzK("Error storing a property", e10);
                }
                this.zzb.zzab();
                try {
                    this.zzb.zzaa();
                } catch (SQLiteException e11) {
                    zzK("Failed to end transaction", e11);
                }
                return zze;
            } catch (SQLiteException e12) {
                zzK("Failed to update Analytics property", e12);
                try {
                    this.zzb.zzaa();
                } catch (SQLiteException e13) {
                    zzK("Failed to end transaction", e13);
                }
                return -1L;
            }
        } catch (Throwable th) {
            try {
                this.zzb.zzaa();
            } catch (SQLiteException e14) {
                zzK("Failed to end transaction", e14);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.zzb.zzX();
        this.zzc.zzX();
        this.zze.zzX();
    }

    public final void zzf(zzcz zzczVar) {
        zzg(zzczVar, this.zzj);
    }

    public final void zzg(zzcz zzczVar, long j10) {
        long j11;
        w.b();
        zzW();
        long zzb = zzA().zzb();
        if (zzb != 0) {
            Objects.requireNonNull((c) zzC());
            j11 = Math.abs(System.currentTimeMillis() - zzb);
        } else {
            j11 = -1;
        }
        zzG("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j11));
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(null);
            }
            if (this.zzj != j10) {
                this.zzd.zzb();
            }
        } catch (Exception e10) {
            zzK("Local dispatch failed", e10);
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(e10);
            }
        }
    }

    public final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (zzct.zzl() && !this.zze.zzg()) {
            zzw();
            if (this.zzi.zzc(zzeu.zzO.zzb().longValue())) {
                this.zzi.zzb();
                zzO("Connecting to service");
                if (this.zze.zzf()) {
                    zzO("Connected to service");
                    this.zzi.zza();
                    zzm();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0177, code lost:
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192 A[Catch: SQLiteException -> 0x01fe, TryCatch #5 {SQLiteException -> 0x01fe, blocks: (B:16:0x0085, B:17:0x00a1, B:19:0x00a7, B:21:0x00bb, B:23:0x00c3, B:25:0x00cb, B:26:0x00d5, B:29:0x00e1, B:31:0x00ec, B:72:0x01fa, B:32:0x00f7, B:34:0x0112, B:36:0x0123, B:54:0x017d, B:37:0x0128, B:52:0x0179, B:58:0x0192, B:59:0x0195, B:60:0x0196, B:62:0x01c4, B:64:0x01d3, B:71:0x01f5, B:63:0x01cc, B:65:0x01d8, B:67:0x01e4, B:68:0x01ea), top: B:83:0x0085, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(com.google.android.gms.internal.gtm.zzex r22) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzj(com.google.android.gms.internal.gtm.zzex):void");
    }

    public final void zzk(zzbx zzbxVar) {
        w.b();
        zzG("Sending first hit to property", zzbxVar.zzc());
        zzfo zzf = zzA().zzf();
        zzw();
        if (zzf.zzc(zzct.zzc())) {
            return;
        }
        String zzg = zzA().zzg();
        if (TextUtils.isEmpty(zzg)) {
            return;
        }
        zzaw zzb = zzfs.zzb(zzz(), zzg);
        zzG("Found relevant installation campaign", zzb);
        zzaj(zzbxVar, zzb);
    }

    public final void zzl() {
        w.b();
        Objects.requireNonNull((c) zzC());
        this.zzj = System.currentTimeMillis();
    }

    public final void zzm() {
        w.b();
        zzw();
        w.b();
        zzW();
        zzE();
        zzw();
        if (!zzct.zzl()) {
            zzR("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zze.zzg()) {
            zzO("Service not connected");
        } else if (this.zzb.zzac()) {
        } else {
            zzO("Dispatching local hits to device AnalyticsService");
            while (true) {
                try {
                    zzce zzceVar = this.zzb;
                    zzw();
                    List<zzex> zzj = zzceVar.zzj(zzct.zzh());
                    if (zzj.isEmpty()) {
                        zzae();
                        return;
                    }
                    while (true) {
                        if (!zzj.isEmpty()) {
                            zzex zzexVar = zzj.get(0);
                            if (!this.zze.zzh(zzexVar)) {
                                zzae();
                                return;
                            }
                            zzj.remove(zzexVar);
                            try {
                                this.zzb.zzn(zzexVar.zzb());
                            } catch (SQLiteException e10) {
                                zzK("Failed to remove hit that was send for delivery", e10);
                                zzah();
                                zzag();
                                return;
                            }
                        }
                    }
                } catch (SQLiteException e11) {
                    zzK("Failed to read hits from store", e11);
                    zzah();
                    zzag();
                    return;
                }
            }
        }
    }
}
