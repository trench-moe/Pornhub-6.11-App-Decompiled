package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import h9.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p.a;
import p.e;
import w9.aa;
import w9.m0;
import w9.p2;
import w9.r2;
import w9.s2;
import w9.t2;
import w9.v2;
import w9.w5;
import w9.x9;
import w9.y3;
import w9.z3;
import w9.z9;

/* loaded from: classes.dex */
public final class zzfi extends zzkf implements zzae {
    public final Map zza;
    public final Map zzb;
    public final e zzc;
    public final x9 zzd;
    private final Map zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;

    public zzfi(zzkp zzkpVar) {
        super(zzkpVar);
        this.zze = new a();
        this.zza = new a();
        this.zzb = new a();
        this.zzg = new a();
        this.zzi = new a();
        this.zzh = new a();
        this.zzc = new zzff(this, 20);
        this.zzd = new zzfg(this);
    }

    public static /* bridge */ /* synthetic */ m0 zzd(zzfi zzfiVar, String str) {
        zzfiVar.zzW();
        o.e(str);
        if (zzfiVar.zzl(str)) {
            if (!zzfiVar.zzg.containsKey(str) || zzfiVar.zzg.get(str) == null) {
                zzfiVar.zzt(str);
            } else {
                zzfiVar.zzu(str, (t2) zzfiVar.zzg.get(str));
            }
            return (m0) zzfiVar.zzc.snapshot().get(str);
        }
        return null;
    }

    private final t2 zzr(String str, byte[] bArr) {
        if (bArr == null) {
            return t2.y();
        }
        try {
            t2 t2Var = (t2) ((s2) zzkr.zzl(t2.w(), bArr)).l();
            zzef zzj = this.zzs.zzay().zzj();
            String str2 = null;
            Long valueOf = t2Var.H() ? Long.valueOf(t2Var.u()) : null;
            if (t2Var.G()) {
                str2 = t2Var.z();
            }
            zzj.zzc("Parsed config. version, gmp_app_id", valueOf, str2);
            return t2Var;
        } catch (com.google.android.gms.internal.measurement.zzkh e10) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e10);
            return t2.y();
        } catch (RuntimeException e11) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e11);
            return t2.y();
        }
    }

    private final void zzs(String str, s2 s2Var) {
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (s2Var != null) {
            for (int i10 = 0; i10 < ((t2) s2Var.f17295f).t(); i10++) {
                p2 p2Var = (p2) ((t2) s2Var.f17295f).v(i10).n();
                if (TextUtils.isEmpty(p2Var.p())) {
                    android.support.v4.media.a.m(this.zzs, "EventConfig contained null event name");
                } else {
                    String p10 = p2Var.p();
                    String zzb = zzgo.zzb(p2Var.p());
                    if (!TextUtils.isEmpty(zzb)) {
                        if (p2Var.f17296j) {
                            p2Var.g();
                            p2Var.f17296j = false;
                        }
                        r2.v((r2) p2Var.f17295f, zzb);
                        if (s2Var.f17296j) {
                            s2Var.g();
                            s2Var.f17296j = false;
                        }
                        t2.D((t2) s2Var.f17295f, i10, (r2) p2Var.l());
                    }
                    if (((r2) p2Var.f17295f).y() && ((r2) p2Var.f17295f).w()) {
                        aVar.put(p10, Boolean.TRUE);
                    }
                    if (((r2) p2Var.f17295f).z() && ((r2) p2Var.f17295f).x()) {
                        aVar2.put(p2Var.p(), Boolean.TRUE);
                    }
                    if (((r2) p2Var.f17295f).A()) {
                        if (p2Var.o() >= 2 && p2Var.o() <= 65535) {
                            aVar3.put(p2Var.p(), Integer.valueOf(p2Var.o()));
                        }
                        this.zzs.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", p2Var.p(), Integer.valueOf(p2Var.o()));
                    }
                }
            }
        }
        this.zza.put(str, aVar);
        this.zzb.put(str, aVar2);
        this.zzh.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0121: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:33:0x0121 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzt(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfi.zzt(java.lang.String):void");
    }

    private final void zzu(final String str, t2 t2Var) {
        if (t2Var.s() == 0) {
            this.zzc.remove(str);
            return;
        }
        this.zzs.zzay().zzj().zzb("EES programs found", Integer.valueOf(t2Var.s()));
        z3 z3Var = (z3) t2Var.B().get(0);
        try {
            m0 m0Var = new m0();
            ((Map) m0Var.f17233a.d.f8752f).put("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new w5("internal.remoteConfig", new zzfh(zzfi.this, str));
                }
            });
            ((Map) m0Var.f17233a.d.f8752f).put("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfi zzfiVar = zzfi.this;
                    final String str2 = str;
                    return new aa(new Callable() { // from class: com.google.android.gms.measurement.internal.zzfd
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfi zzfiVar2 = zzfi.this;
                            String str3 = str2;
                            zzg zzj = zzfiVar2.zzf.zzi().zzj(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            zzfiVar2.zzs.zzf().zzh();
                            hashMap.put("gmp_version", 55005L);
                            if (zzj != null) {
                                String zzw = zzj.zzw();
                                if (zzw != null) {
                                    hashMap.put("app_version", zzw);
                                }
                                hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
                                hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            ((Map) m0Var.f17233a.d.f8752f).put("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new z9(zzfi.this.zzd);
                }
            });
            m0Var.a(z3Var);
            this.zzc.put(str, m0Var);
            this.zzs.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(z3Var.s().s()));
            for (y3 y3Var : z3Var.s().v()) {
                this.zzs.zzay().zzj().zzb("EES program activity", y3Var.t());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzs.zzay().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map zzv(t2 t2Var) {
        a aVar = new a();
        if (t2Var != null) {
            for (v2 v2Var : t2Var.C()) {
                aVar.put(v2Var.t(), v2Var.u());
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzae
    public final String zza(String str, String str2) {
        zzg();
        zzt(str);
        Map map = (Map) this.zze.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }

    public final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzt(str);
        Map map = (Map) this.zzh.get(str);
        if (map != null && (num = (Integer) map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    public final t2 zze(String str) {
        zzW();
        zzg();
        o.e(str);
        zzt(str);
        return (t2) this.zzg.get(str);
    }

    public final String zzf(String str) {
        zzg();
        return (String) this.zzi.get(str);
    }

    public final void zzi(String str) {
        zzg();
        this.zzi.put(str, null);
    }

    public final void zzj(String str) {
        zzg();
        this.zzg.remove(str);
    }

    public final boolean zzk(String str) {
        zzg();
        t2 zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.F();
    }

    public final boolean zzl(String str) {
        t2 t2Var;
        return (TextUtils.isEmpty(str) || (t2Var = (t2) this.zzg.get(str)) == null || t2Var.s() == 0) ? false : true;
    }

    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzn(String str, String str2) {
        Boolean bool;
        zzg();
        zzt(str);
        if (!"ecommerce_purchase".equals(str2) && !"purchase".equals(str2) && !"refund".equals(str2)) {
            Map map = (Map) this.zzb.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean zzo(String str, String str2) {
        Boolean bool;
        zzg();
        zzt(str);
        if (zzm(str) && zzkw.zzag(str2)) {
            return true;
        }
        if (zzp(str) && zzkw.zzah(str2)) {
            return true;
        }
        Map map = (Map) this.zza.get(str);
        if (map != null && (bool = (Boolean) map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzq(String str, byte[] bArr, String str2) {
        zzW();
        zzg();
        o.e(str);
        s2 s2Var = (s2) zzr(str, bArr).n();
        zzs(str, s2Var);
        zzu(str, (t2) s2Var.l());
        this.zzg.put(str, (t2) s2Var.l());
        this.zzi.put(str, str2);
        this.zze.put(str, zzv((t2) s2Var.l()));
        this.zzf.zzi().zzB(str, new ArrayList(Collections.unmodifiableList(((t2) s2Var.f17295f).A())));
        try {
            if (s2Var.f17296j) {
                s2Var.g();
                s2Var.f17296j = false;
            }
            t2.E((t2) s2Var.f17295f);
            bArr = ((t2) s2Var.l()).i();
        } catch (RuntimeException e10) {
            this.zzs.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeh.zzn(str), e10);
        }
        zzak zzi = this.zzf.zzi();
        o.e(str);
        zzi.zzg();
        zzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (zzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzi.zzs.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e11) {
            zzi.zzs.zzay().zzd().zzc("Error storing remote config. appId", zzeh.zzn(str), e11);
        }
        this.zzg.put(str, (t2) s2Var.l());
        return true;
    }
}
