package p8;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzex;
import com.google.android.gms.internal.gtm.zzfs;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class k extends zzbr implements y {

    /* renamed from: m  reason: collision with root package name */
    public static DecimalFormat f13847m;

    /* renamed from: c  reason: collision with root package name */
    public final zzbv f13848c;

    /* renamed from: f  reason: collision with root package name */
    public final String f13849f;

    /* renamed from: j  reason: collision with root package name */
    public final Uri f13850j;

    public k(zzbv zzbvVar, String str) {
        super(zzbvVar);
        h9.o.e(str);
        this.f13848c = zzbvVar;
        this.f13849f = str;
        this.f13850j = c(str);
    }

    public static Uri c(String str) {
        h9.o.e(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    public static String d(double d) {
        if (f13847m == null) {
            f13847m = new DecimalFormat("0.######");
        }
        return f13847m.format(d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[LOOP:1: B:6:0x002c->B:30:0x0084, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> e(p8.o r13) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.k.e(p8.o):java.util.Map");
    }

    public static void f(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    @Override // p8.y
    public final void a(o oVar) {
        h9.o.b(oVar.f13856c, "Can't deliver not submitted measurement");
        h9.o.g("deliver should be called on worker thread");
        o oVar2 = new o(oVar);
        zzbe zzbeVar = (zzbe) oVar2.a(zzbe.class);
        if (TextUtils.isEmpty(zzbeVar.zzf())) {
            zzz().zzc(e(oVar2), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(zzbeVar.zze())) {
            zzz().zzc(e(oVar2), "Ignoring measurement without client id");
        } else {
            Objects.requireNonNull(this.f13848c.zzc());
            if (zzfs.zzj(0.0d, zzbeVar.zze())) {
                zzG("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            Map<String, String> e10 = e(oVar2);
            HashMap hashMap = (HashMap) e10;
            hashMap.put("v", "1");
            hashMap.put("_v", zzbt.zzb);
            hashMap.put("tid", this.f13849f);
            if (this.f13848c.zzc().f13834i) {
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append("=");
                    sb2.append((String) entry.getValue());
                }
                zzN("Dry run is enabled. GoogleAnalytics would have sent", sb2.toString());
                return;
            }
            HashMap hashMap2 = new HashMap();
            zzfs.zzg(hashMap2, "uid", zzbeVar.zzg());
            zzav zzavVar = (zzav) oVar.f13862j.get(zzav.class);
            if (zzavVar != null) {
                zzfs.zzg(hashMap2, "an", zzavVar.zzf());
                zzfs.zzg(hashMap2, "aid", zzavVar.zzd());
                zzfs.zzg(hashMap2, "av", zzavVar.zzg());
                zzfs.zzg(hashMap2, "aiid", zzavVar.zze());
            }
            hashMap.put("_s", String.valueOf(zzs().zza(new zzbx(0L, zzbeVar.zze(), this.f13849f, !TextUtils.isEmpty(zzbeVar.zzd()), 0L, hashMap2))));
            zzs().zzh(new zzex(zzz(), e10, oVar.d, true));
        }
    }

    @Override // p8.y
    public final Uri zzb() {
        return this.f13850j;
    }
}
