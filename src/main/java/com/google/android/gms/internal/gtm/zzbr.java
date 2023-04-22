package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import l9.b;
import p8.c;
import p8.w;

/* loaded from: classes.dex */
public class zzbr {
    private final zzbv zza;

    public zzbr(zzbv zzbvVar) {
        Objects.requireNonNull(zzbvVar, "null reference");
        this.zza = zzbvVar;
    }

    public static String zzD(String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String zza = zza(obj);
        String zza2 = zza(obj2);
        String zza3 = zza(obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza)) {
            sb2.append(str2);
            sb2.append(zza);
            str2 = str3;
        }
        if (TextUtils.isEmpty(zza2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(zza2);
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb2.append(str3);
            sb2.append(zza3);
        }
        return sb2.toString();
    }

    public static final boolean zzV() {
        return Log.isLoggable(zzeu.zzc.zzb(), 2);
    }

    private static String zza(Object obj) {
        return obj == null ? BuildConfig.FLAVOR : obj instanceof String ? (String) obj : obj instanceof Boolean ? obj == Boolean.TRUE ? "true" : "false" : obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    private final void zzb(int i10, String str, Object obj, Object obj2, Object obj3) {
        zzbv zzbvVar = this.zza;
        zzfb zzn = zzbvVar != null ? zzbvVar.zzn() : null;
        if (zzn != null) {
            String zzb = zzeu.zzc.zzb();
            if (Log.isLoggable(zzb, i10)) {
                Log.println(i10, zzb, zzD(str, obj, obj2, obj3));
            }
            if (i10 >= 5) {
                zzn.zze(i10, str, obj, obj2, obj3);
            }
        } else {
            String zzb2 = zzeu.zzc.zzb();
            if (Log.isLoggable(zzb2, i10)) {
                Log.println(i10, zzb2, zzD(str, obj, obj2, obj3));
            }
        }
    }

    public final zzfh zzA() {
        return this.zza.zzo();
    }

    public final zzft zzB() {
        return this.zza.zzq();
    }

    public final b zzC() {
        return this.zza.zzr();
    }

    public final void zzE() {
        this.zza.zzj();
    }

    public final void zzF(String str) {
        zzb(3, str, null, null, null);
    }

    public final void zzG(String str, Object obj) {
        zzb(3, str, obj, null, null);
    }

    public final void zzH(String str, Object obj, Object obj2) {
        zzb(3, str, obj, obj2, null);
    }

    public final void zzI(String str, Object obj, Object obj2, Object obj3) {
        zzb(3, "POST compressed size, ratio %, url", obj, obj2, obj3);
    }

    public final void zzJ(String str) {
        zzb(6, str, null, null, null);
    }

    public final void zzK(String str, Object obj) {
        zzb(6, str, obj, null, null);
    }

    public final void zzL(String str, Object obj, Object obj2) {
        zzb(6, str, obj, obj2, null);
    }

    public final void zzM(String str) {
        zzb(4, str, null, null, null);
    }

    public final void zzN(String str, Object obj) {
        zzb(4, str, obj, null, null);
    }

    public final void zzO(String str) {
        zzb(2, str, null, null, null);
    }

    public final void zzP(String str, Object obj) {
        zzb(2, str, obj, null, null);
    }

    public final void zzQ(String str, Object obj, Object obj2) {
        zzb(2, str, obj, obj2, null);
    }

    public final void zzR(String str) {
        zzb(5, str, null, null, null);
    }

    public final void zzS(String str, Object obj) {
        zzb(5, str, obj, null, null);
    }

    public final void zzT(String str, Object obj, Object obj2) {
        zzb(5, str, obj, obj2, null);
    }

    public final void zzU(String str, Object obj, Object obj2, Object obj3) {
        zzb(5, "Deleted fewer hits then expected", obj, obj2, obj3);
    }

    public final Context zzo() {
        return this.zza.zza();
    }

    public final c zzp() {
        return this.zza.zzc();
    }

    public final w zzq() {
        return this.zza.zzd();
    }

    public final zzbi zzr() {
        return this.zza.zze();
    }

    public final zzbq zzs() {
        return this.zza.zzf();
    }

    public final zzbv zzt() {
        return this.zza;
    }

    public final zzcf zzu() {
        return this.zza.zzh();
    }

    public final zzcn zzv() {
        return this.zza.zzi();
    }

    public final zzct zzw() {
        return this.zza.zzj();
    }

    public final zzcx zzx() {
        return this.zza.zzk();
    }

    public final zzcy zzy() {
        return this.zza.zzl();
    }

    public final zzfb zzz() {
        return this.zza.zzm();
    }
}
