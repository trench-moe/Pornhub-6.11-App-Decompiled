package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class zzeh extends zzgl {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzef zzd;
    private final zzef zze;
    private final zzef zzf;
    private final zzef zzg;
    private final zzef zzh;
    private final zzef zzi;
    private final zzef zzj;
    private final zzef zzk;
    private final zzef zzl;

    public zzeh(zzfr zzfrVar) {
        super(zzfrVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzef(this, 6, false, false);
        this.zze = new zzef(this, 6, true, false);
        this.zzf = new zzef(this, 6, false, true);
        this.zzg = new zzef(this, 5, false, false);
        this.zzh = new zzef(this, 5, true, false);
        this.zzi = new zzef(this, 5, false, true);
        this.zzj = new zzef(this, 4, false, false);
        this.zzk = new zzef(this, 3, false, false);
        this.zzl = new zzef(this, 2, false, false);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzeg(str);
    }

    public static String zzo(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String zzp = zzp(z10, obj);
        String zzp2 = zzp(z10, obj2);
        String zzp3 = zzp(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb2.append(str2);
            sb2.append(zzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb2.append(str3);
            sb2.append(zzp3);
        }
        return sb2.toString();
    }

    public static String zzp(boolean z10, Object obj) {
        String str;
        String str2 = BuildConfig.FLAVOR;
        if (obj == null) {
            return str2;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (z10) {
                Long l10 = (Long) obj;
                if (Math.abs(l10.longValue()) < 100) {
                    return obj.toString();
                }
                if (obj.toString().charAt(0) == '-') {
                    str2 = "-";
                }
                String valueOf = String.valueOf(Math.abs(l10.longValue()));
                long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
                long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
                StringBuilder sb2 = new StringBuilder(str2.length() + str2.length() + 43);
                sb2.append(str2);
                sb2.append(round);
                sb2.append("...");
                sb2.append(str2);
                sb2.append(round2);
                return sb2.toString();
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof zzeg)) {
                    return z10 ? "-" : obj.toString();
                }
                str = ((zzeg) obj).zza;
                return str;
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb3 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
            String zzy = zzy(zzfr.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i10];
                if (!stackTraceElement.isNativeMethod()) {
                    String className = stackTraceElement.getClassName();
                    if (className != null && zzy(className).equals(zzy)) {
                        sb3.append(": ");
                        sb3.append(stackTraceElement);
                        break;
                    }
                }
                i10++;
            }
            return sb3.toString();
        }
    }

    private static String zzy(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final zzef zzc() {
        return this.zzk;
    }

    public final zzef zzd() {
        return this.zzd;
    }

    public final zzef zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final boolean zzf() {
        return false;
    }

    public final zzef zzh() {
        return this.zze;
    }

    public final zzef zzi() {
        return this.zzj;
    }

    public final zzef zzj() {
        return this.zzl;
    }

    public final zzef zzk() {
        return this.zzg;
    }

    public final zzef zzl() {
        return this.zzi;
    }

    public final zzef zzm() {
        return this.zzh;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String zzq() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzs.zzy() != null) {
                    this.zzc = this.zzs.zzy();
                } else {
                    this.zzc = this.zzs.zzf().zzn();
                }
            }
            Objects.requireNonNull(this.zzc, "null reference");
            str = this.zzc;
        }
        return str;
    }

    public final void zzt(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(zzq(), i10)) {
            Log.println(i10, zzq(), zzo(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        Objects.requireNonNull(str, "null reference");
        zzfo zzo = this.zzs.zzo();
        if (zzo == null) {
            Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
        } else if (zzo.zzx()) {
            zzo.zzp(new zzee(this, i10 >= 9 ? 8 : i10, str, obj, obj2, obj3));
        } else {
            Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
        }
    }
}
