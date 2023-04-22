package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h9.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l9.i;
import r3.c;

/* loaded from: classes.dex */
public final class zzhw extends zzf {
    public zzhv zza;
    public final zzr zzb;
    public boolean zzc;
    private zzgr zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzah zzi;
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzkv zzn;

    public zzhw(zzfr zzfrVar) {
        super(zzfrVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzhk(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzah(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzr(zzfrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzab */
    public final void zzB(Bundle bundle, long j10) {
        if (TextUtils.isEmpty(this.zzs.zzh().zzm())) {
            zzR(bundle, 0, j10);
        } else {
            this.zzs.zzay().zzl().zza("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(Boolean bool, boolean z10) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().zzh(bool);
        if (z10) {
            zzew zzm = this.zzs.zzm();
            zzfr zzfrVar = zzm.zzs;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzs.zzK() || !(bool == null || bool.booleanValue())) {
            zzad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad() {
        zzg();
        String zza = this.zzs.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                Objects.requireNonNull((c) this.zzs.zzav());
                zzZ("app", "_npa", null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(zza) ? 0L : 1L);
                Objects.requireNonNull((c) this.zzs.zzav());
                zzZ("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        if (!this.zzs.zzJ() || !this.zzc) {
            this.zzs.zzay().zzc().zza("Updating Scion state (FE)");
            this.zzs.zzt().zzI();
            return;
        }
        this.zzs.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzy();
        u.b();
        if (this.zzs.zzf().zzs(null, zzdu.zzad)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzs.zzaz().zzp(new zzgz(this));
    }

    public static /* synthetic */ void zzv(zzhw zzhwVar, zzah zzahVar, int i10, long j10, boolean z10, boolean z11) {
        zzhwVar.zzg();
        zzhwVar.zza();
        if (j10 <= zzhwVar.zzl && zzah.zzj(zzhwVar.zzm, i10)) {
            zzhwVar.zzs.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzahVar);
            return;
        }
        zzew zzm = zzhwVar.zzs.zzm();
        zzfr zzfrVar = zzm.zzs;
        zzm.zzg();
        if (!zzm.zzl(i10)) {
            zzhwVar.zzs.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
            return;
        }
        SharedPreferences.Editor edit = zzm.zza().edit();
        edit.putString("consent_settings", zzahVar.zzh());
        edit.putInt("consent_source", i10);
        edit.apply();
        zzhwVar.zzl = j10;
        zzhwVar.zzm = i10;
        zzhwVar.zzs.zzt().zzF(z10);
        if (z11) {
            zzhwVar.zzs.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA() {
        if ((this.zzs.zzau().getApplicationContext() instanceof Application) && this.zza != null) {
            ((Application) this.zzs.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().zzr.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzs.zzm().zzr.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().zzae(obj)) {
                    this.zzs.zzv().zzM(this.zzn, null, 27, null, null, 0);
                }
                this.zzs.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzkw.zzag(str)) {
                this.zzs.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzkw zzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzv.zzZ("param", str, 100, obj)) {
                    this.zzs.zzv().zzN(zza, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int zzc = this.zzs.zzf().zzc();
        if (zza.size() > zzc) {
            Iterator it = new TreeSet(zza.keySet()).iterator();
            int i10 = 0;
            loop1: while (true) {
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    i10++;
                    if (i10 > zzc) {
                        zza.remove(str2);
                    }
                }
            }
            this.zzs.zzv().zzM(this.zzn, null, 26, null, null, 0);
            this.zzs.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().zzr.zzb(zza);
        this.zzs.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        Objects.requireNonNull((c) this.zzs.zzav());
        zzE(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzkw.zzak(str2, "screen_view")) {
            this.zzs.zzs().zzx(bundle2, j10);
        } else {
            zzM(str3, str2, j10, bundle2, z11, !z11 || this.zzd == null || zzkw.zzag(str2), z10, null);
        }
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzfr.zzO();
        Objects.requireNonNull((c) this.zzs.zzav());
        zzM("auto", str2, System.currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        Objects.requireNonNull((c) this.zzs.zzav());
        zzH(str, str2, System.currentTimeMillis(), bundle);
    }

    public final void zzH(String str, String str2, long j10, Bundle bundle) {
        zzg();
        zzI(str, str2, j10, bundle, true, this.zzd == null || zzkw.zzag(str2), true, null);
    }

    public final void zzI(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        boolean z14;
        String str4;
        boolean z15;
        long j11;
        Bundle[] bundleArr;
        o.e(str);
        Objects.requireNonNull(bundle, "null reference");
        zzg();
        zza();
        if (!this.zzs.zzJ()) {
            this.zzs.zzay().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List zzn = this.zzs.zzh().zzn();
        if (zzn != null && !zzn.contains(str2)) {
            this.zzs.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzs.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzs.zzau().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzs.zzau());
                } catch (Exception e10) {
                    this.zzs.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.zzs.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzs.zzaw();
            String string = bundle.getString("gclid");
            Objects.requireNonNull((c) this.zzs.zzav());
            z13 = true;
            zzZ("auto", "_lgclid", string, System.currentTimeMillis());
        } else {
            z13 = true;
        }
        this.zzs.zzaw();
        if (z10 && zzkw.zzal(str2)) {
            this.zzs.zzv().zzK(bundle, this.zzs.zzm().zzr.zza());
        }
        if (!z12) {
            this.zzs.zzaw();
            if (!"_iap".equals(str2)) {
                zzkw zzv = this.zzs.zzv();
                int i10 = 2;
                if (zzv.zzab("event", str2)) {
                    if (zzv.zzY("event", zzgo.zza, zzgo.zzb, str2)) {
                        zzv.zzs.zzf();
                        if (zzv.zzX("event", 40, str2)) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 13;
                    }
                }
                if (i10 != 0) {
                    this.zzs.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                    zzkw zzv2 = this.zzs.zzv();
                    this.zzs.zzf();
                    this.zzs.zzv().zzM(this.zzn, null, i10, "_ev", zzv2.zzC(str2, 40, z13), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        c0.b();
        if (this.zzs.zzf().zzs(null, zzdu.zzat)) {
            this.zzs.zzaw();
            zzid zzj = this.zzs.zzs().zzj(false);
            if (zzj != null && !bundle.containsKey("_sc")) {
                zzj.zzd = z13;
            }
            zzkw.zzJ(zzj, bundle, z10 && !z12);
        } else {
            this.zzs.zzaw();
            zzid zzj2 = this.zzs.zzs().zzj(false);
            if (zzj2 != null && !bundle.containsKey("_sc")) {
                zzj2.zzd = z13;
            }
            zzkw.zzJ(zzj2, bundle, z10 && !z12);
        }
        boolean equals = "am".equals(str);
        boolean zzag = zzkw.zzag(str2);
        if (!z10 || this.zzd == null || zzag) {
            z14 = equals;
        } else if (!equals) {
            this.zzs.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
            Objects.requireNonNull(this.zzd, "null reference");
            this.zzd.interceptEvent(str, str2, bundle, j10);
            return;
        } else {
            z14 = true;
        }
        if (this.zzs.zzM()) {
            int zzh = this.zzs.zzv().zzh(str2);
            if (zzh != 0) {
                this.zzs.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                zzkw zzv3 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().zzM(this.zzn, str3, zzh, "_ev", zzv3.zzC(str2, 40, z13), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle zzy = this.zzs.zzv().zzy(str3, str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z12);
            Objects.requireNonNull(zzy, "null reference");
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) != null && "_ae".equals(str2)) {
                zzjy zzjyVar = this.zzs.zzu().zzb;
                Objects.requireNonNull((c) zzjyVar.zzc.zzs.zzav());
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = elapsedRealtime - zzjyVar.zzb;
                zzjyVar.zzb = elapsedRealtime;
                if (j12 > 0) {
                    this.zzs.zzv().zzH(zzy, j12);
                }
            }
            r.b();
            if (this.zzs.zzf().zzs(null, zzdu.zzac)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    zzkw zzv4 = this.zzs.zzv();
                    String string2 = zzy.getString("_ffr");
                    String trim = i.a(string2) ? null : string2 != null ? string2.trim() : string2;
                    if (zzkw.zzak(trim, zzv4.zzs.zzm().zzo.zza())) {
                        zzv4.zzs.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzv4.zzs.zzm().zzo.zzb(trim);
                } else if ("_ae".equals(str2)) {
                    String zza = this.zzs.zzv().zzs.zzm().zzo.zza();
                    if (!TextUtils.isEmpty(zza)) {
                        zzy.putString("_ffr", zza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzy);
            if (this.zzs.zzm().zzj.zza() > 0 && this.zzs.zzm().zzk(j10) && this.zzs.zzm().zzl.zzb()) {
                b.s(this.zzs, "Current session is expired, remove the session number, ID, and engagement time");
                Objects.requireNonNull((c) this.zzs.zzav());
                str4 = "_ae";
                z15 = z14;
                j11 = 0;
                zzZ("auto", "_sid", null, System.currentTimeMillis());
                Objects.requireNonNull((c) this.zzs.zzav());
                zzZ("auto", "_sno", null, System.currentTimeMillis());
                Objects.requireNonNull((c) this.zzs.zzav());
                zzZ("auto", "_se", null, System.currentTimeMillis());
            } else {
                str4 = "_ae";
                z15 = z14;
                j11 = 0;
            }
            if (zzy.getLong("extend_session", j11) == 1) {
                b.s(this.zzs, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzs.zzu().zza.zzb(j10, true);
            }
            ArrayList arrayList2 = new ArrayList(zzy.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str5 = (String) arrayList2.get(i11);
                if (str5 != null) {
                    this.zzs.zzv();
                    Object obj = zzy.get(str5);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        zzy.putParcelableArray(str5, bundleArr);
                    }
                }
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i12);
                String str6 = i12 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str);
                if (z11) {
                    bundle2 = this.zzs.zzv().zzt(bundle2);
                }
                Bundle bundle3 = bundle2;
                this.zzs.zzt().zzA(new zzau(str6, new zzas(bundle3), str, j10), str3);
                if (!z15) {
                    for (zzgs zzgsVar : this.zze) {
                        zzgsVar.onEvent(str, str2, new Bundle(bundle3), j10);
                    }
                }
                i12++;
            }
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) == null || !str4.equals(str2)) {
                return;
            }
            zzka zzu = this.zzs.zzu();
            Objects.requireNonNull((c) this.zzs.zzav());
            zzu.zzb.zzd(true, true, SystemClock.elapsedRealtime());
        }
    }

    public final void zzJ(zzgs zzgsVar) {
        zza();
        Objects.requireNonNull(zzgsVar, "null reference");
        if (this.zze.add(zzgsVar)) {
            return;
        }
        a.m(this.zzs, "OnEventListener already registered");
    }

    public final void zzK(long j10) {
        this.zzg.set(null);
        this.zzs.zzaz().zzp(new zzhe(this, j10));
    }

    public final void zzL(long j10, boolean z10) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zza("Resetting analytics data (FE)");
        zzka zzu = this.zzs.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        boolean zzJ = this.zzs.zzJ();
        zzew zzm = this.zzs.zzm();
        zzm.zzc.zzb(j10);
        if (!TextUtils.isEmpty(zzm.zzs.zzm().zzo.zza())) {
            zzm.zzo.zzb(null);
        }
        u.b();
        zzaf zzf = zzm.zzs.zzf();
        zzdt zzdtVar = zzdu.zzad;
        if (zzf.zzs(null, zzdtVar)) {
            zzm.zzj.zzb(0L);
        }
        if (!zzm.zzs.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzp.zzb(null);
        zzm.zzq.zzb(0L);
        zzm.zzr.zzb(null);
        if (z10) {
            this.zzs.zzt().zzC();
        }
        u.b();
        if (this.zzs.zzf().zzs(null, zzdtVar)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    public final void zzM(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.zzs.zzaz().zzp(new zzhb(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    public final void zzN(String str, String str2, long j10, Object obj) {
        this.zzs.zzaz().zzp(new zzhc(this, str, str2, obj, j10));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        Objects.requireNonNull((c) this.zzs.zzav());
        zzQ(bundle, System.currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j10) {
        Objects.requireNonNull(bundle, "null reference");
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            a.m(this.zzs, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zzgn.zza(bundle2, "app_id", String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        o.e(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        o.e(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Objects.requireNonNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE), "null reference");
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j10);
        String string = bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.zzs.zzv().zzl(string) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
        } else if (this.zzs.zzv().zzd(string, obj) != 0) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
        } else {
            Object zzB = this.zzs.zzv().zzB(string, obj);
            if (zzB == null) {
                this.zzs.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
                return;
            }
            zzgn.zzb(bundle2, zzB);
            long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                this.zzs.zzf();
                if (j11 > 15552000000L || j11 < 1) {
                    this.zzs.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j11));
                    return;
                }
            }
            long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            this.zzs.zzf();
            if (j12 > 15552000000L || j12 < 1) {
                this.zzs.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j12));
            } else {
                this.zzs.zzaz().zzp(new zzhf(this, bundle2));
            }
        }
    }

    public final void zzR(Bundle bundle, int i10, long j10) {
        zza();
        String zzg = zzah.zzg(bundle);
        if (zzg != null) {
            this.zzs.zzay().zzl().zzb("Ignoring invalid consent setting", zzg);
            this.zzs.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzah.zza(bundle), i10, j10);
    }

    public final void zzS(zzah zzahVar, int i10, long j10) {
        boolean z10;
        boolean z11;
        zzah zzahVar2;
        boolean z12;
        zza();
        if (i10 != -10 && zzahVar.zze() == null && zzahVar.zzf() == null) {
            this.zzs.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            z10 = true;
            z11 = false;
            if (zzah.zzj(i10, this.zzj)) {
                boolean zzk = zzahVar.zzk(this.zzi);
                zzag zzagVar = zzag.ANALYTICS_STORAGE;
                if (zzahVar.zzi(zzagVar) && !this.zzi.zzi(zzagVar)) {
                    z11 = true;
                }
                zzah zzd = zzahVar.zzd(this.zzi);
                this.zzi = zzd;
                this.zzj = i10;
                zzahVar2 = zzd;
                z12 = z11;
                z11 = zzk;
            } else {
                zzahVar2 = zzahVar;
                z12 = false;
                z10 = false;
            }
        }
        if (!z10) {
            this.zzs.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzahVar2);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z11) {
            this.zzg.set(null);
            this.zzs.zzaz().zzq(new zzhq(this, zzahVar2, j10, i10, andIncrement, z12));
        } else if (i10 == 30 || i10 == -10) {
            this.zzs.zzaz().zzq(new zzhr(this, zzahVar2, i10, andIncrement, z12));
        } else {
            this.zzs.zzaz().zzp(new zzhs(this, zzahVar2, i10, andIncrement, z12));
        }
    }

    public final void zzT(final Bundle bundle, final long j10) {
        s.f7019f.zza().zza();
        if (this.zzs.zzf().zzs(null, zzdu.zzal)) {
            this.zzs.zzaz().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgx
                @Override // java.lang.Runnable
                public final void run() {
                    zzhw.this.zzB(bundle, j10);
                }
            });
        } else {
            zzB(bundle, j10);
        }
    }

    public final void zzU(zzgr zzgrVar) {
        zzgr zzgrVar2;
        zzg();
        zza();
        if (zzgrVar != null && zzgrVar != (zzgrVar2 = this.zzd)) {
            o.k(zzgrVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzgrVar;
    }

    public final void zzV(Boolean bool) {
        zza();
        this.zzs.zzaz().zzp(new zzhp(this, bool));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzW(com.google.android.gms.measurement.internal.zzah r10) {
        /*
            r9 = this;
            r5 = r9
            r5.zzg()
            com.google.android.gms.measurement.internal.zzag r0 = com.google.android.gms.measurement.internal.zzag.ANALYTICS_STORAGE
            boolean r7 = r10.zzi(r0)
            r0 = r7
            r1 = 0
            r7 = 1
            r2 = 1
            if (r0 == 0) goto L1c
            r7 = 4
            com.google.android.gms.measurement.internal.zzag r0 = com.google.android.gms.measurement.internal.zzag.AD_STORAGE
            r8 = 7
            boolean r8 = r10.zzi(r0)
            r10 = r8
            if (r10 != 0) goto L29
            r7 = 1
        L1c:
            com.google.android.gms.measurement.internal.zzfr r10 = r5.zzs
            com.google.android.gms.measurement.internal.zzjk r7 = r10.zzt()
            r10 = r7
            boolean r10 = r10.zzM()
            if (r10 == 0) goto L2b
        L29:
            r10 = 1
            goto L2e
        L2b:
            r7 = 7
            r7 = 0
            r10 = r7
        L2e:
            com.google.android.gms.measurement.internal.zzfr r0 = r5.zzs
            boolean r8 = r0.zzK()
            r0 = r8
            if (r10 == r0) goto L81
            com.google.android.gms.measurement.internal.zzfr r0 = r5.zzs
            r0.zzG(r10)
            com.google.android.gms.measurement.internal.zzfr r0 = r5.zzs
            com.google.android.gms.measurement.internal.zzew r8 = r0.zzm()
            r0 = r8
            com.google.android.gms.measurement.internal.zzfr r3 = r0.zzs
            r8 = 1
            r0.zzg()
            r7 = 6
            android.content.SharedPreferences r3 = r0.zza()
            java.lang.String r7 = "measurement_enabled_from_api"
            r4 = r7
            boolean r7 = r3.contains(r4)
            r3 = r7
            if (r3 == 0) goto L69
            r8 = 6
            android.content.SharedPreferences r8 = r0.zza()
            r0 = r8
            boolean r8 = r0.getBoolean(r4, r2)
            r0 = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r0 = r8
            goto L6c
        L69:
            r8 = 7
            r7 = 0
            r0 = r7
        L6c:
            if (r10 == 0) goto L79
            r7 = 1
            if (r0 == 0) goto L79
            r7 = 5
            boolean r7 = r0.booleanValue()
            r0 = r7
            if (r0 == 0) goto L81
        L79:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r10)
            r10 = r8
            r5.zzac(r10, r1)
        L81:
            r8 = 7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhw.zzW(com.google.android.gms.measurement.internal.zzah):void");
    }

    public final void zzX(String str, String str2, Object obj, boolean z10) {
        Objects.requireNonNull((c) this.zzs.zzav());
        zzY("auto", "_ldl", obj, true, System.currentTimeMillis());
    }

    public final void zzY(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        String str3 = str == null ? "app" : str;
        if (z10) {
            i10 = this.zzs.zzv().zzl(str2);
        } else {
            zzkw zzv = this.zzs.zzv();
            if (zzv.zzab("user property", str2)) {
                if (zzv.zzY("user property", zzgq.zza, null, str2)) {
                    zzv.zzs.zzf();
                    if (zzv.zzX("user property", 24, str2)) {
                        i10 = 0;
                    }
                } else {
                    i10 = 15;
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            zzkw zzv2 = this.zzs.zzv();
            this.zzs.zzf();
            this.zzs.zzv().zzM(this.zzn, null, i10, "_ev", zzv2.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj == null) {
            zzN(str3, str2, j10, null);
        } else {
            int zzd = this.zzs.zzv().zzd(str2, obj);
            if (zzd != 0) {
                zzkw zzv3 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().zzM(this.zzn, null, zzd, "_ev", zzv3.zzC(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object zzB = this.zzs.zzv().zzB(str2, obj);
            if (zzB != null) {
                zzN(str3, str2, j10, zzB);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzZ(java.lang.String r11, java.lang.String r12, java.lang.Object r13, long r14) {
        /*
            r10 = this;
            h9.o.e(r11)
            h9.o.e(r12)
            r10.zzg()
            r10.zza()
            r9 = 3
            java.lang.String r0 = "allow_personalized_ads"
            r9 = 2
            boolean r8 = r0.equals(r12)
            r0 = r8
            java.lang.String r8 = "_npa"
            r1 = r8
            if (r0 == 0) goto L76
            boolean r0 = r13 instanceof java.lang.String
            if (r0 == 0) goto L61
            r9 = 6
            r0 = r13
            java.lang.String r0 = (java.lang.String) r0
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            r2 = r8
            if (r2 != 0) goto L61
            r12 = 1
            r9 = 5
            java.util.Locale r13 = java.util.Locale.ENGLISH
            r9 = 5
            java.lang.String r13 = r0.toLowerCase(r13)
            java.lang.String r8 = "false"
            r0 = r8
            boolean r13 = r0.equals(r13)
            r2 = 1
            if (r12 == r13) goto L42
            r9 = 5
            r12 = 0
            r9 = 6
            goto L43
        L42:
            r12 = r2
        L43:
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            com.google.android.gms.measurement.internal.zzfr r13 = r10.zzs
            r9 = 7
            com.google.android.gms.measurement.internal.zzew r8 = r13.zzm()
            r13 = r8
            com.google.android.gms.measurement.internal.zzev r13 = r13.zzh
            long r4 = r12.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L5c
            java.lang.String r8 = "true"
            r0 = r8
        L5c:
            r13.zzb(r0)
            r13 = r12
            goto L73
        L61:
            r9 = 6
            if (r13 != 0) goto L76
            com.google.android.gms.measurement.internal.zzfr r12 = r10.zzs
            r9 = 7
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzm()
            com.google.android.gms.measurement.internal.zzev r12 = r12.zzh
            java.lang.String r0 = "unset"
            r12.zzb(r0)
            r9 = 4
        L73:
            r6 = r13
            r3 = r1
            goto L79
        L76:
            r9 = 3
            r3 = r12
            r6 = r13
        L79:
            com.google.android.gms.measurement.internal.zzfr r12 = r10.zzs
            boolean r12 = r12.zzJ()
            if (r12 != 0) goto L8b
            com.google.android.gms.measurement.internal.zzfr r11 = r10.zzs
            java.lang.String r8 = "User property not set since app measurement is disabled"
            r12 = r8
            android.support.v4.media.b.s(r11, r12)
            r9 = 6
            return
        L8b:
            com.google.android.gms.measurement.internal.zzfr r12 = r10.zzs
            r9 = 2
            boolean r12 = r12.zzM()
            if (r12 != 0) goto L96
            r9 = 1
            return
        L96:
            r9 = 7
            com.google.android.gms.measurement.internal.zzks r12 = new com.google.android.gms.measurement.internal.zzks
            r9 = 2
            r2 = r12
            r4 = r14
            r7 = r11
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzfr r11 = r10.zzs
            r9 = 3
            com.google.android.gms.measurement.internal.zzjk r11 = r11.zzt()
            r11.zzK(r12)
            r9 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhw.zzZ(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzaa(zzgs zzgsVar) {
        zza();
        Objects.requireNonNull(zzgsVar, "null reference");
        if (this.zze.remove(zzgsVar)) {
            return;
        }
        a.m(this.zzs, "OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        o.e(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaz().zzd(atomicReference, 15000L, "boolean test flag value", new zzhh(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaz().zzd(atomicReference, 15000L, "double test flag value", new zzho(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaz().zzd(atomicReference, 15000L, "int test flag value", new zzhn(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaz().zzd(atomicReference, 15000L, "long test flag value", new zzhm(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzid zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzid zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaz().zzd(atomicReference, 15000L, "String test flag value", new zzhl(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get conditional user properties", new zzhi(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzkw.zzG(list);
    }

    public final List zzt(boolean z10) {
        zza();
        b.s(this.zzs, "Getting user properties (FE)");
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhd(this, atomicReference, z10));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyList();
        }
        return list;
    }

    public final Map zzu(String str, String str2, boolean z10) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhj(this, atomicReference, null, str, str2, z10));
        List<zzks> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        p.a aVar = new p.a(list.size());
        while (true) {
            for (zzks zzksVar : list) {
                Object zza = zzksVar.zza();
                if (zza != null) {
                    aVar.put(zzksVar.zzb, zza);
                }
            }
            return aVar;
        }
    }

    public final void zzy() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs(null, zzdu.zzX)) {
                zzaf zzf = this.zzs.zzf();
                zzf.zzs.zzaw();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzs.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzhw zzhwVar = zzhw.this;
                            zzhwVar.zzg();
                            if (zzhwVar.zzs.zzm().zzm.zzb()) {
                                zzhwVar.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zzhwVar.zzs.zzm().zzn.zza();
                            zzhwVar.zzs.zzm().zzn.zzb(1 + zza);
                            zzhwVar.zzs.zzf();
                            if (zza < 5) {
                                zzhwVar.zzs.zzE();
                                return;
                            }
                            a.m(zzhwVar.zzs, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            zzhwVar.zzs.zzm().zzm.zza(true);
                        }
                    });
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            zzew zzm = this.zzs.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzs.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG("auto", "_ou", bundle);
        }
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        Objects.requireNonNull((c) this.zzs.zzav());
        long currentTimeMillis = System.currentTimeMillis();
        o.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaz().zzp(new zzhg(this, bundle2));
    }
}
