package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.oaid.BuildConfig;
import d3.d;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import l9.b;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
import r3.c;
import w9.f4;
import w9.h4;
import w9.m4;
import w9.u4;
import w9.v4;
import w9.w4;
import w9.y0;

/* loaded from: classes.dex */
public final class zzfr implements zzgm {
    private static volatile zzfr zzd;
    private zzdy zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;
    public Boolean zza;
    public Boolean zzb;
    public final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzaa zzj;
    private final zzaf zzk;
    private final zzew zzl;
    private final zzeh zzm;
    private final zzfo zzn;
    private final zzka zzo;
    private final zzkw zzp;
    private final zzec zzq;
    private final b zzr;
    private final zzik zzs;
    private final zzhw zzt;
    private final zzd zzu;
    private final zzia zzv;
    private final String zzw;
    private zzea zzx;
    private zzjk zzy;
    private zzao zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    public zzfr(zzgu zzguVar) {
        long currentTimeMillis;
        Context context;
        Bundle bundle;
        boolean z10 = false;
        Objects.requireNonNull(zzguVar, "null reference");
        Context context2 = zzguVar.zza;
        zzaa zzaaVar = new zzaa(context2);
        this.zzj = zzaaVar;
        zzdr.zza = zzaaVar;
        this.zze = context2;
        this.zzf = zzguVar.zzb;
        this.zzg = zzguVar.zzc;
        this.zzh = zzguVar.zzd;
        this.zzi = zzguVar.zzh;
        this.zzE = zzguVar.zze;
        this.zzw = zzguVar.zzj;
        this.zzF = true;
        y0 y0Var = zzguVar.zzg;
        if (y0Var != null && (bundle = y0Var.f17377u) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = y0Var.f17377u.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        if (v4.f17335g == null) {
            Object obj3 = v4.f17334f;
            synchronized (obj3) {
                if (v4.f17335g == null) {
                    synchronized (obj3) {
                        u4 u4Var = v4.f17335g;
                        Context applicationContext = context2.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context2;
                        }
                        if (u4Var == null || u4Var.a() != applicationContext) {
                            h4.d();
                            w4.c();
                            synchronized (m4.class) {
                                m4 m4Var = m4.f17239c;
                                if (m4Var != null && (context = m4Var.f17240a) != null && m4Var.f17241b != null) {
                                    context.getContentResolver().unregisterContentObserver(m4.f17239c.f17241b);
                                }
                                m4.f17239c = null;
                            }
                            v4.f17335g = new f4(applicationContext, com.google.android.gms.internal.measurement.b.b(new d(applicationContext, 8)));
                            v4.f17336h.incrementAndGet();
                        }
                    }
                }
            }
        }
        c cVar = c.f14634j;
        this.zzr = cVar;
        Long l10 = zzguVar.zzi;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            Objects.requireNonNull(cVar);
            currentTimeMillis = System.currentTimeMillis();
        }
        this.zzc = currentTimeMillis;
        this.zzk = new zzaf(this);
        zzew zzewVar = new zzew(this);
        zzewVar.zzv();
        this.zzl = zzewVar;
        zzeh zzehVar = new zzeh(this);
        zzehVar.zzv();
        this.zzm = zzehVar;
        zzkw zzkwVar = new zzkw(this);
        zzkwVar.zzv();
        this.zzp = zzkwVar;
        this.zzq = new zzec(new zzgt(zzguVar, this));
        this.zzu = new zzd(this);
        zzik zzikVar = new zzik(this);
        zzikVar.zzb();
        this.zzs = zzikVar;
        zzhw zzhwVar = new zzhw(this);
        zzhwVar.zzb();
        this.zzt = zzhwVar;
        zzka zzkaVar = new zzka(this);
        zzkaVar.zzb();
        this.zzo = zzkaVar;
        zzia zziaVar = new zzia(this);
        zziaVar.zzv();
        this.zzv = zziaVar;
        zzfo zzfoVar = new zzfo(this);
        zzfoVar.zzv();
        this.zzn = zzfoVar;
        y0 y0Var2 = zzguVar.zzg;
        z10 = (y0Var2 == null || y0Var2.f17373f == 0) ? true : true;
        if (context2.getApplicationContext() instanceof Application) {
            zzhw zzq = zzq();
            if (zzq.zzs.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzs.zze.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new zzhv(zzq, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    android.support.v4.media.b.s(zzq.zzs, "Registered activity lifecycle callback");
                }
            }
        } else {
            a.m(this, "Application context is not an Application");
        }
        zzfoVar.zzp(new zzfq(this, zzguVar));
    }

    public static /* bridge */ /* synthetic */ void zzA(zzfr zzfrVar, zzgu zzguVar) {
        zzfrVar.zzaz().zzg();
        zzfrVar.zzk.zzn();
        zzao zzaoVar = new zzao(zzfrVar);
        zzaoVar.zzv();
        zzfrVar.zzz = zzaoVar;
        zzdy zzdyVar = new zzdy(zzfrVar, zzguVar.zzf);
        zzdyVar.zzb();
        zzfrVar.zzA = zzdyVar;
        zzea zzeaVar = new zzea(zzfrVar);
        zzeaVar.zzb();
        zzfrVar.zzx = zzeaVar;
        zzjk zzjkVar = new zzjk(zzfrVar);
        zzjkVar.zzb();
        zzfrVar.zzy = zzjkVar;
        zzfrVar.zzp.zzw();
        zzfrVar.zzl.zzw();
        zzfrVar.zzA.zzc();
        zzef zzi = zzfrVar.zzay().zzi();
        zzfrVar.zzk.zzh();
        zzi.zzb("App measurement initialized, version", 55005L);
        zzfrVar.zzay().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzdyVar.zzl();
        if (TextUtils.isEmpty(zzfrVar.zzf)) {
            if (zzfrVar.zzv().zzad(zzl)) {
                zzfrVar.zzay().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzef zzi2 = zzfrVar.zzay().zzi();
                String valueOf = String.valueOf(zzl);
                zzi2.zza(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        zzfrVar.zzay().zzc().zza("Debug-level message logging enabled");
        if (zzfrVar.zzG != zzfrVar.zzH.get()) {
            zzfrVar.zzay().zzd().zzc("Not all components initialized", Integer.valueOf(zzfrVar.zzG), Integer.valueOf(zzfrVar.zzH.get()));
        }
        zzfrVar.zzB = true;
    }

    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzgk zzgkVar) {
        if (zzgkVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static final void zzQ(com.google.android.gms.measurement.internal.zzf r5) {
        /*
            if (r5 == 0) goto L20
            boolean r0 = r5.zze()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Component not initialized: "
            r3 = 7
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            r3 = 3
            throw r0
            r3 = 3
        L20:
            r4 = 5
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r2 = "Component not created"
            r0 = r2
            r5.<init>(r0)
            throw r5
            r3 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfr.zzQ(com.google.android.gms.measurement.internal.zzf):void");
    }

    private static final void zzR(zzgl zzglVar) {
        if (zzglVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzglVar.zzx()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzglVar.getClass())));
        }
    }

    public static zzfr zzp(Context context, y0 y0Var, Long l10) {
        Bundle bundle;
        if (y0Var != null && (y0Var.n == null || y0Var.f17376t == null)) {
            y0Var = new y0(y0Var.f17372c, y0Var.f17373f, y0Var.f17374j, y0Var.f17375m, null, null, y0Var.f17377u, null);
        }
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (zzd == null) {
            synchronized (zzfr.class) {
                if (zzd == null) {
                    zzd = new zzfr(new zzgu(context, y0Var, l10));
                }
            }
        } else if (y0Var != null && (bundle = y0Var.f17377u) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Objects.requireNonNull(zzd, "null reference");
            zzd.zzE = Boolean.valueOf(y0Var.f17377u.getBoolean("dataCollectionDefaultEnabled"));
        }
        Objects.requireNonNull(zzd, "null reference");
        return zzd;
    }

    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    public final /* synthetic */ void zzC(String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
        }
        if (th == null) {
            zzm().zzm.zza(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", BuildConfig.FLAVOR);
                    String optString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        zzay().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzkw zzv = zzv();
                    zzfr zzfrVar = zzv.zzs;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzs.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.zzt.zzG("auto", "_cmp", bundle);
                        zzkw zzv2 = zzv();
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = zzv2.zzs.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                zzv2.zzs.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            }
                            return;
                        } catch (RuntimeException e10) {
                            zzv2.zzs.zzay().zzd().zzb("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                    zzay().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e11) {
                    zzay().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e11);
                    return;
                }
            }
            zzay().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    public final void zzD() {
        this.zzG++;
    }

    public final void zzE() {
        zzaz().zzg();
        zzR(zzr());
        String zzl = zzh().zzl();
        Pair zzb = zzm().zzb(zzl);
        if (!this.zzk.zzr() || ((Boolean) zzb.second).booleanValue() || TextUtils.isEmpty((CharSequence) zzb.first)) {
            zzay().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzia zzr = zzr();
        zzr.zzu();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzs.zze.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
            if (networkInfo != null || !networkInfo.isConnected()) {
                a.m(this, "Network is not available for Deferred Deep Link request. Skipping");
            }
            zzkw zzv = zzv();
            zzh().zzs.zzk.zzh();
            URL zzD = zzv.zzD(55005L, zzl, (String) zzb.first, zzm().zzn.zza() - 1);
            if (zzD != null) {
                zzia zzr2 = zzr();
                zzfp zzfpVar = new zzfp(this);
                zzr2.zzg();
                zzr2.zzu();
                zzr2.zzs.zzaz().zzo(new zzhz(zzr2, zzl, zzD, null, null, zzfpVar, null));
                return;
            }
            return;
        }
        if (networkInfo != null) {
        }
        a.m(this, "Network is not available for Deferred Deep Link request. Skipping");
    }

    public final void zzF(boolean z10) {
        this.zzE = Boolean.valueOf(z10);
    }

    public final void zzG(boolean z10) {
        zzaz().zzg();
        this.zzF = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzH(w9.y0 r15) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfr.zzH(w9.y0):void");
    }

    public final boolean zzI() {
        return this.zzE != null && this.zzE.booleanValue();
    }

    public final boolean zzJ() {
        return zza() == 0;
    }

    public final boolean zzK() {
        zzaz().zzg();
        return this.zzF;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r9.zzD) > 1000) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzM() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfr.zzM():boolean");
    }

    @Pure
    public final boolean zzN() {
        return this.zzi;
    }

    public final int zza() {
        zzaz().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaz().zzg();
        if (this.zzF) {
            Boolean zzd2 = zzm().zzd();
            if (zzd2 != null) {
                return zzd2.booleanValue() ? 0 : 3;
            }
            zzaf zzafVar = this.zzk;
            zzaa zzaaVar = zzafVar.zzs.zzj;
            Boolean zzk = zzafVar.zzk("firebase_analytics_collection_enabled");
            if (zzk != null) {
                return zzk.booleanValue() ? 0 : 4;
            }
            Boolean bool2 = this.zza;
            return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzE == null || this.zzE.booleanValue()) ? 0 : 7;
        }
        return 8;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final Context zzau() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final b zzav() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzaa zzaw() {
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzeh zzay() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    @Pure
    public final zzfo zzaz() {
        zzR(this.zzn);
        return this.zzn;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzaf zzf() {
        return this.zzk;
    }

    @Pure
    public final zzao zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    @Pure
    public final zzdy zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    @Pure
    public final zzea zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzec zzj() {
        return this.zzq;
    }

    public final zzeh zzl() {
        zzeh zzehVar = this.zzm;
        if (zzehVar == null || !zzehVar.zzx()) {
            return null;
        }
        return zzehVar;
    }

    @Pure
    public final zzew zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    @SideEffectFree
    public final zzfo zzo() {
        return this.zzn;
    }

    @Pure
    public final zzhw zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzia zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    @Pure
    public final zzik zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    @Pure
    public final zzjk zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzka zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    @Pure
    public final zzkw zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzg;
    }

    @Pure
    public final String zzy() {
        return this.zzh;
    }

    @Pure
    public final String zzz() {
        return this.zzw;
    }
}
