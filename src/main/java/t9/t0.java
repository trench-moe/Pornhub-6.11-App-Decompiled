package t9;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.cast.zzju;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a9.b f15343i = new a9.b("FeatureUsageAnalytics");

    /* renamed from: j  reason: collision with root package name */
    public static final String f15344j = "20.1.0";

    /* renamed from: k  reason: collision with root package name */
    public static t0 f15345k;

    /* renamed from: a  reason: collision with root package name */
    public final y f15346a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f15347b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15348c;
    public final Runnable d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f15349e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<zzju> f15350f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<zzju> f15351g;

    /* renamed from: h  reason: collision with root package name */
    public long f15352h;

    public t0(SharedPreferences sharedPreferences, y yVar, String str) {
        zzju zzjuVar;
        zzju zzjuVar2;
        zzju zzjuVar3 = zzju.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        this.f15347b = sharedPreferences;
        this.f15346a = yVar;
        this.f15348c = str;
        HashSet hashSet = new HashSet();
        this.f15350f = hashSet;
        HashSet hashSet2 = new HashSet();
        this.f15351g = hashSet2;
        this.f15349e = new x(Looper.getMainLooper());
        this.d = new a9.p(this, 3);
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        hashSet.clear();
        hashSet2.clear();
        this.f15352h = 0L;
        if (!f15344j.equals(string) || !str.equals(string2)) {
            HashSet hashSet3 = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    hashSet3.add(str2);
                }
            }
            hashSet3.add("feature_usage_last_report_time");
            d(hashSet3);
            this.f15347b.edit().putString("feature_usage_sdk_version", f15344j).putString("feature_usage_package_name", this.f15348c).apply();
            return;
        }
        this.f15352h = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet4 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                long j10 = this.f15347b.getLong(str3, 0L);
                if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                    hashSet4.add(str3);
                } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                    try {
                        zzjuVar = zzju.b(Integer.parseInt(str3.substring(41)));
                    } catch (NumberFormatException unused) {
                        zzjuVar = zzjuVar3;
                    }
                    this.f15351g.add(zzjuVar);
                    this.f15350f.add(zzjuVar);
                } else if (str3.startsWith("feature_usage_timestamp_detected_feature_")) {
                    try {
                        zzjuVar2 = zzju.b(Integer.parseInt(str3.substring(41)));
                    } catch (NumberFormatException unused2) {
                        zzjuVar2 = zzjuVar3;
                    }
                    this.f15350f.add(zzjuVar2);
                }
            }
        }
        d(hashSet4);
        Objects.requireNonNull(this.f15349e, "null reference");
        Objects.requireNonNull(this.d, "null reference");
        this.f15349e.post(this.d);
    }

    public static String a(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static void b(zzju zzjuVar) {
        t0 t0Var = f15345k;
        if (t0Var == null) {
            return;
        }
        t0Var.f15347b.edit().putLong(t0Var.c(Integer.toString(zzjuVar.zza())), System.currentTimeMillis()).apply();
        t0Var.f15350f.add(zzjuVar);
        t0Var.f15349e.post(t0Var.d);
    }

    @RequiresNonNull({"sharedPreferences"})
    public final String c(String str) {
        String a10 = a("feature_usage_timestamp_reported_feature_", str);
        return this.f15347b.contains(a10) ? a10 : a("feature_usage_timestamp_detected_feature_", str);
    }

    public final void d(Set<String> set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.f15347b.edit();
        for (String str : set) {
            edit.remove(str);
        }
        edit.apply();
    }
}
