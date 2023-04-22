package vb;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class w implements x {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f16182g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f16183h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final y f16184a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f16185b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16186c;
    public final nc.b d;

    /* renamed from: e  reason: collision with root package name */
    public final s f16187e;

    /* renamed from: f  reason: collision with root package name */
    public String f16188f;

    public w(Context context, String str, nc.b bVar, s sVar) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f16185b = context;
        this.f16186c = str;
        this.d = bVar;
        this.f16187e = sVar;
        this.f16184a = new y();
    }

    public static String b() {
        StringBuilder m10 = a1.a.m("SYN_");
        m10.append(UUID.randomUUID().toString());
        return m10.toString();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : f16182g.matcher(uuid).replaceAll(BuildConfig.FLAVOR).toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: all -> 0x012d, TryCatch #1 {, blocks: (B:3:0x0001, B:10:0x000a, B:12:0x001a, B:13:0x001f, B:15:0x004c, B:16:0x0053, B:18:0x005b, B:19:0x0062, B:23:0x0074, B:25:0x0091, B:29:0x009c, B:32:0x00a4, B:34:0x00ab, B:44:0x00eb, B:46:0x00ef, B:47:0x0104, B:49:0x0124, B:50:0x0129, B:35:0x00b6, B:22:0x006b, B:37:0x00c1, B:42:0x00d2, B:43:0x00de), top: B:58:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6 A[Catch: all -> 0x012d, TryCatch #1 {, blocks: (B:3:0x0001, B:10:0x000a, B:12:0x001a, B:13:0x001f, B:15:0x004c, B:16:0x0053, B:18:0x005b, B:19:0x0062, B:23:0x0074, B:25:0x0091, B:29:0x009c, B:32:0x00a4, B:34:0x00ab, B:44:0x00eb, B:46:0x00ef, B:47:0x0104, B:49:0x0124, B:50:0x0129, B:35:0x00b6, B:22:0x006b, B:37:0x00c1, B:42:0x00d2, B:43:0x00de), top: B:58:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String c() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.w.c():java.lang.String");
    }

    public String d() {
        String str;
        y yVar = this.f16184a;
        Context context = this.f16185b;
        synchronized (yVar) {
            try {
                if (yVar.f16190b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = BuildConfig.FLAVOR;
                    }
                    yVar.f16190b = installerPackageName;
                }
                str = BuildConfig.FLAVOR.equals(yVar.f16190b) ? null : yVar.f16190b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final String e(String str) {
        return str.replaceAll(f16183h, BuildConfig.FLAVOR);
    }
}
