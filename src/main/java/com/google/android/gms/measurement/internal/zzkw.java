package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.text.TextUtils;
import android.util.Log;
import c9.f;
import c9.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h9.o;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import l.InterfaceC0186;
import m9.c;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import w9.s0;

/* loaded from: classes.dex */
public final class zzkw extends zzgl {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"firebase_", "google_", "ga_"};
    private static final String[] zzc = {"_err"};
    private SecureRandom zzd;
    private final AtomicLong zze;
    private int zzf;
    private Integer zzg;

    public zzkw(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzg = null;
        this.zze = new AtomicLong(0L);
    }

    public static MessageDigest zzE() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList zzG(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzab zzabVar = (zzab) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzabVar.zza);
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzabVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzabVar.zzd);
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzabVar.zzc.zzb);
            Object zza2 = zzabVar.zzc.zza();
            Objects.requireNonNull(zza2, "null reference");
            zzgn.zzb(bundle, zza2);
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzabVar.zze);
            String str = zzabVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzau zzauVar = zzabVar.zzg;
            if (zzauVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzauVar.zza);
                zzas zzasVar = zzauVar.zzb;
                if (zzasVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzasVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzabVar.zzh);
            zzau zzauVar2 = zzabVar.zzi;
            if (zzauVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzauVar2.zza);
                zzas zzasVar2 = zzauVar2.zzb;
                if (zzasVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzasVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzabVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzabVar.zzj);
            zzau zzauVar3 = zzabVar.zzk;
            if (zzauVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzauVar3.zza);
                zzas zzasVar3 = zzauVar3.zzb;
                if (zzasVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzasVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void zzJ(zzid zzidVar, Bundle bundle, boolean z10) {
        if (bundle != null && zzidVar != null) {
            if (bundle.containsKey("_sc") && !z10) {
                z10 = false;
            }
            String str = zzidVar.zza;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = zzidVar.zzb;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", zzidVar.zzc);
            return;
        }
        if (bundle != null && zzidVar == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzag(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzah(String str) {
        o.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean zzai(Context context) {
        ActivityInfo receiverInfo;
        Objects.requireNonNull(context, "null reference");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzaj(Context context, boolean z10) {
        Objects.requireNonNull(context, "null reference");
        return Build.VERSION.SDK_INT >= 24 ? zzat(context, "com.google.android.gms.measurement.AppMeasurementJobService") : zzat(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzak(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = r3
            if (r0 != 0) goto L9
            if (r4 == 0) goto L6
            goto La
        L6:
            r2 = 1
            r0 = r2
            return r0
        L9:
            r2 = 7
        La:
            if (r0 != 0) goto L10
            r2 = 6
            r2 = 0
            r0 = r2
            return r0
        L10:
            boolean r2 = r0.equals(r4)
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkw.zzak(java.lang.String, java.lang.String):boolean");
    }

    public static boolean zzal(String str) {
        return !zzc[0].equals(str);
    }

    public static final boolean zzao(Bundle bundle, int i10) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i10);
            return true;
        }
        return false;
    }

    public static final boolean zzap(String str) {
        Objects.requireNonNull(str, "null reference");
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int zzaq(String str) {
        if ("_ldl".equals(str)) {
            this.zzs.zzf();
            return InterfaceC0186.f43;
        } else if ("_id".equals(str)) {
            this.zzs.zzf();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.zzs.zzf();
            return 100;
        } else {
            this.zzs.zzf();
            return 36;
        }
    }

    private final Object zzar(int i10, Object obj, boolean z10, boolean z11) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
            } else if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            } else {
                if (!(obj instanceof String) && !(obj instanceof Character)) {
                    if (!(obj instanceof CharSequence)) {
                        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                Bundle zzt = zzt((Bundle) parcelable);
                                if (!zzt.isEmpty()) {
                                    arrayList.add(zzt);
                                }
                            }
                        }
                        return arrayList.toArray(new Bundle[arrayList.size()]);
                    }
                }
                return zzC(obj.toString(), i10, z10);
            }
        }
        return obj;
    }

    private static boolean zzas(String str, String[] strArr) {
        Objects.requireNonNull(strArr, "null reference");
        for (String str2 : strArr) {
            if (zzak(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzat(Context context, String str) {
        PackageManager packageManager;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager == null) {
            return false;
        }
        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
        if (serviceInfo != null) {
            if (serviceInfo.enabled) {
                return true;
            }
        }
        return false;
    }

    public static long zzp(byte[] bArr) {
        Objects.requireNonNull(bArr, "null reference");
        int length = bArr.length;
        int i10 = 0;
        o.j(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public final Object zzA(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.zzs.zzf();
            return zzar(256, obj, true, true);
        }
        if (zzag(str)) {
            this.zzs.zzf();
        } else {
            this.zzs.zzf();
            i10 = 100;
        }
        return zzar(i10, obj, false, true);
    }

    public final Object zzB(String str, Object obj) {
        return "_ldl".equals(str) ? zzar(zzaq(str), obj, true, false) : zzar(zzaq(str), obj, false, false);
    }

    public final String zzC(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i10) {
            if (z10) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
            }
            return null;
        }
        return str;
    }

    public final URL zzD(long j10, String str, String str2, long j11) {
        try {
            o.e(str2);
            o.e(str);
            String format = String.format("https://www.googleadservices.col/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 55005L, Integer.valueOf(zzm())), str2, str, Long.valueOf(j11));
            if (str.equals(this.zzs.zzf().zzm())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            this.zzs.zzay().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom zzF() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new SecureRandom();
        }
        return this.zzd;
    }

    public final void zzH(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.zzs.zzay().zzk().zzb("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void zzI(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (zzao(bundle, i10)) {
            this.zzs.zzf();
            bundle.putString("_ev", zzC(str, 40, true));
            if (obj != null) {
                if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                    return;
                }
                bundle.putLong("_el", obj.toString().length());
            }
        }
    }

    public final void zzK(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        while (true) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.zzs.zzv().zzN(bundle, str, bundle2.get(str));
                }
            }
            return;
        }
    }

    public final void zzL(zzei zzeiVar, int i10) {
        Iterator it = new TreeSet(zzeiVar.zzd.keySet()).iterator();
        int i11 = 0;
        while (true) {
            while (it.hasNext()) {
                String str = (String) it.next();
                if (zzah(str) && (i11 = i11 + 1) > i10) {
                    StringBuilder sb2 = new StringBuilder(48);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    this.zzs.zzay().zze().zzc(sb2.toString(), this.zzs.zzj().zzd(zzeiVar.zza), this.zzs.zzj().zzb(zzeiVar.zzd));
                    zzao(zzeiVar.zzd, 5);
                    zzeiVar.zzd.remove(str);
                }
            }
            return;
        }
    }

    public final void zzM(zzkv zzkvVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        zzao(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 != 6) {
            if (i10 != 7) {
                if (i10 == 2) {
                }
                zzkvVar.zza(str, "_err", bundle);
            }
        }
        bundle.putLong("_el", i11);
        zzkvVar.zza(str, "_err", bundle);
    }

    public final void zzN(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.zzs.zzay().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.zzs.zzj().zze(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zzO(s0 s0Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            s0Var.m(bundle);
        } catch (RemoteException e10) {
            this.zzs.zzay().zzk().zzb("Error returning boolean value to wrapper", e10);
        }
    }

    public final void zzP(s0 s0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            s0Var.m(bundle);
        } catch (RemoteException e10) {
            this.zzs.zzay().zzk().zzb("Error returning bundle list to wrapper", e10);
        }
    }

    public final void zzQ(s0 s0Var, Bundle bundle) {
        try {
            s0Var.m(bundle);
        } catch (RemoteException e10) {
            this.zzs.zzay().zzk().zzb("Error returning bundle value to wrapper", e10);
        }
    }

    public final void zzR(s0 s0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            s0Var.m(bundle);
        } catch (RemoteException e10) {
            this.zzs.zzay().zzk().zzb("Error returning byte array to wrapper", e10);
        }
    }

    public final void zzS(s0 s0Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            s0Var.m(bundle);
        } catch (RemoteException e10) {
            this.zzs.zzay().zzk().zzb("Error returning int value to wrapper", e10);
        }
    }

    public final void zzT(s0 s0Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            s0Var.m(bundle);
        } catch (RemoteException e10) {
            this.zzs.zzay().zzk().zzb("Error returning long value to wrapper", e10);
        }
    }

    public final void zzU(s0 s0Var, String str) {
        try {
            s0Var.m(b.b("r", str));
        } catch (RemoteException e10) {
            this.zzs.zzay().zzk().zzb("Error returning string value to wrapper", e10);
        }
    }

    public final void zzV(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int i10;
        String str4;
        int zza2;
        if (bundle == null) {
            return;
        }
        this.zzs.zzf();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list == null || !list.contains(str5)) {
                int zzj = !z10 ? zzj(str5) : 0;
                if (zzj == 0) {
                    zzj = zzi(str5);
                }
                i10 = zzj;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                zzI(bundle, i10, str5, str5, i10 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (zzae(bundle.get(str5))) {
                    this.zzs.zzay().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    str4 = str5;
                    zza2 = 22;
                } else {
                    str4 = str5;
                    zza2 = zza(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (zza2 != 0 && !"_ev".equals(str4)) {
                    zzI(bundle, zza2, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzah(str4) && !zzas(str4, zzgp.zzd) && (i11 = i11 + 1) > 0) {
                    this.zzs.zzay().zze().zzc("Item cannot contain custom parameters", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                    zzao(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    public final boolean zzW(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                if (this.zzs.zzL()) {
                    this.zzs.zzay().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (!zzap(str2)) {
                this.zzs.zzay().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzeh.zzn(str2));
                return false;
            }
        } else if (!zzap(str)) {
            if (this.zzs.zzL()) {
                this.zzs.zzay().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzeh.zzn(str));
            }
            return false;
        }
        return true;
    }

    public final boolean zzX(String str, int i10, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i10) {
            this.zzs.zzay().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        } else {
            return true;
        }
    }

    public final boolean zzY(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = zzb;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.zzs.zzay().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzas(str2, strArr) || (strArr2 != null && zzas(str2, strArr2))) {
            return true;
        }
        this.zzs.zzay().zze().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zzZ(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character)) {
                if (!(obj instanceof CharSequence)) {
                    return false;
                }
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                this.zzs.zzay().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkw.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzaA() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                a.m(this.zzs, "Utils falling back to Random for random id");
            }
        }
        this.zze.set(nextLong);
    }

    public final boolean zzaa(String str, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzs.zzay().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.zzs.zzay().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.zzs.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean zzab(String str, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzs.zzay().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.zzs.zzay().zze().zzc("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.zzs.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean zzac(String str) {
        zzg();
        if (c.a(this.zzs.zzau()).f13032a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzs.zzay().zzc().zzb("Permission not granted", str);
        return false;
    }

    public final boolean zzad(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzl = this.zzs.zzf().zzl();
        this.zzs.zzaw();
        return zzl.equals(str);
    }

    public final boolean zzae(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean zzaf(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = c.a(context).f13032a.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            this.zzs.zzay().zzd().zzb("Package name not found", e10);
        } catch (CertificateException e11) {
            this.zzs.zzay().zzd().zzb("Error obtaining certificate", e11);
        }
        return true;
    }

    public final boolean zzam(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Objects.requireNonNull(str, "null reference");
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public final byte[] zzan(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final int zzd(String str, Object obj) {
        return "_ldl".equals(str) ? zzZ("user property referrer", str, zzaq(str), obj) : zzZ("user property", str, zzaq(str), obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final boolean zzf() {
        return true;
    }

    public final int zzh(String str) {
        if (zzaa("event", str)) {
            if (zzY("event", zzgo.zza, zzgo.zzb, str)) {
                this.zzs.zzf();
                return !zzX("event", 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    public final int zzi(String str) {
        if (zzaa("event param", str)) {
            if (zzY("event param", null, null, str)) {
                this.zzs.zzf();
                return !zzX("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final int zzj(String str) {
        if (zzab("event param", str)) {
            if (zzY("event param", null, null, str)) {
                this.zzs.zzf();
                return !zzX("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final int zzl(String str) {
        if (zzaa("user property", str)) {
            if (zzY("user property", zzgq.zza, null, str)) {
                this.zzs.zzf();
                return !zzX("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.zzg == null) {
            f fVar = f.f3877b;
            Context zzau = this.zzs.zzau();
            Objects.requireNonNull(fVar);
            AtomicBoolean atomicBoolean = h.f3879a;
            int i10 = 0;
            try {
                i10 = zzau.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.zzg = Integer.valueOf(i10 / 1000);
        }
        return this.zzg.intValue();
    }

    public final int zzo(int i10) {
        return f.f3877b.c(this.zzs.zzau(), 12451000);
    }

    public final long zzq() {
        long andIncrement;
        long j10;
        if (this.zze.get() != 0) {
            synchronized (this.zze) {
                this.zze.compareAndSet(-1L, 1L);
                andIncrement = this.zze.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zze) {
            long nanoTime = System.nanoTime();
            Objects.requireNonNull((r3.c) this.zzs.zzav());
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.zzf + 1;
            this.zzf = i10;
            j10 = nextLong + i10;
        }
        return j10;
    }

    public final long zzr(long j10, long j11) {
        return ((j11 * 60000) + j10) / 86400000;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle zzs(android.net.Uri r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkw.zzs(android.net.Uri, boolean):android.os.Bundle");
    }

    public final Bundle zzt(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzA = zzA(str, bundle.get(str));
                if (zzA == null) {
                    this.zzs.zzay().zzl().zzb("Param value can't be null", this.zzs.zzj().zze(str));
                } else {
                    zzN(bundle2, str, zzA);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle zzy(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkw.zzy(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final zzau zzz(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional property event name", this.zzs.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle zzy = zzy(str, str2, bundle2, Collections.singletonList("_o"), true);
        if (z10) {
            zzy = zzt(zzy);
        }
        Objects.requireNonNull(zzy, "null reference");
        return new zzau(str2, new zzas(zzy), str3, j10);
    }
}
