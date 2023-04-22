package p8;

import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfr;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public class i extends zzbs {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f13838a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f13839b;

    /* renamed from: c  reason: collision with root package name */
    public final zzez f13840c;
    public final a0 d;

    /* renamed from: e  reason: collision with root package name */
    public b f13841e;

    /* renamed from: f  reason: collision with root package name */
    public zzfr f13842f;

    public i(zzbv zzbvVar, String str, zzez zzezVar) {
        super(zzbvVar);
        HashMap hashMap = new HashMap();
        this.f13838a = hashMap;
        this.f13839b = new HashMap();
        hashMap.put("useSecure", "1");
        hashMap.put("&a", Integer.toString(new Random().nextInt(IntCompanionObject.MAX_VALUE) + 1));
        this.f13840c = new zzez(60, 2000L, "tracking", zzC());
        this.d = new a0(this, zzbvVar);
    }

    public static void e(Map<String, String> map, Map<String, String> map2) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String h10 = h(entry);
            if (h10 != null) {
                map2.put(h10, entry.getValue());
            }
        }
    }

    public static String h(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        if (!key.startsWith("&") || key.length() < 2) {
            return null;
        }
        return entry.getKey().substring(1);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.i.c(java.util.Map):void");
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13838a.put(str, str2);
    }

    public final void f(zzfr zzfrVar) {
        zzO("Loading Tracker config values");
        this.f13842f = zzfrVar;
        String str = zzfrVar.zza;
        if (str != null) {
            d("&tid", str);
            zzP("trackingId loaded", str);
        }
        double d = zzfrVar.zzb;
        if (d >= 0.0d) {
            String d10 = Double.toString(d);
            d("&sf", d10);
            zzP("Sample frequency loaded", d10);
        }
        int i10 = zzfrVar.zzc;
        if (i10 >= 0) {
            a0 a0Var = this.d;
            a0Var.f13823c = i10 * 1000;
            a0Var.c();
            zzP("Session timeout loaded", Integer.valueOf(i10));
        }
        int i11 = zzfrVar.zzd;
        boolean z10 = false;
        if (i11 != -1) {
            boolean z11 = 1 == i11;
            a0 a0Var2 = this.d;
            a0Var2.f13821a = z11;
            a0Var2.c();
            zzP("Auto activity tracking loaded", Boolean.valueOf(z11));
        }
        int i12 = zzfrVar.zze;
        if (i12 != -1) {
            if (i12 != 0) {
                d("&aip", "1");
            }
            zzP("Anonymize ip loaded", Boolean.valueOf(1 == i12));
        }
        boolean z12 = zzfrVar.zzf == 1;
        synchronized (this) {
            b bVar = this.f13841e;
            if (bVar != null) {
                z10 = true;
            }
            if (z10 == z12) {
                return;
            }
            if (z12) {
                b bVar2 = new b(this, Thread.getDefaultUncaughtExceptionHandler(), zzo());
                this.f13841e = bVar2;
                Thread.setDefaultUncaughtExceptionHandler(bVar2);
                zzO("Uncaught exceptions will be reported to Google Analytics");
            } else {
                Thread.setDefaultUncaughtExceptionHandler(bVar.f13826a);
                zzO("Uncaught exceptions will not be reported to Google Analytics");
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.d.zzX();
        String zza = zzB().zza();
        if (zza != null) {
            d("&an", zza);
        }
        String zzb = zzB().zzb();
        if (zzb != null) {
            d("&av", zzb);
        }
    }
}
