package vb;

import android.content.SharedPreferences;
import android.util.Log;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f16169a;

    /* renamed from: b  reason: collision with root package name */
    public final mb.c f16170b;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16172e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f16173f;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16171c = new Object();
    public ea.h<Void> d = new ea.h<>();

    /* renamed from: g  reason: collision with root package name */
    public final ea.h<Void> f16174g = new ea.h<>();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(mb.c r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f16171c = r0
            ea.h r0 = new ea.h
            r0.<init>()
            r6.d = r0
            r0 = 0
            r6.f16172e = r0
            ea.h r1 = new ea.h
            r1.<init>()
            r6.f16174g = r1
            r7.a()
            android.content.Context r1 = r7.f13066a
            r6.f16170b = r7
            android.content.SharedPreferences r7 = com.google.firebase.crashlytics.internal.common.CommonUtils.g(r1)
            r6.f16169a = r7
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3d
            r6.f16172e = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L3e
        L3d:
            r7 = r5
        L3e:
            if (r7 != 0) goto L84
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r1 == 0) goto L71
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            boolean r2 = r2.containsKey(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r2 == 0) goto L71
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            boolean r7 = r1.getBoolean(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            goto L72
        L69:
            r7 = move-exception
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L71:
            r7 = r5
        L72:
            if (r7 != 0) goto L78
            r6.f16172e = r0
            r7 = r5
            goto L84
        L78:
            r6.f16172e = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L84:
            r6.f16173f = r7
            java.lang.Object r7 = r6.f16171c
            monitor-enter(r7)
            boolean r0 = r6.a()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L94
            ea.h<java.lang.Void> r0 = r6.d     // Catch: java.lang.Throwable -> L96
            r0.b(r5)     // Catch: java.lang.Throwable -> L96
        L94:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            return
        L96:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.s.<init>(mb.c):void");
    }

    public synchronized boolean a() {
        boolean booleanValue;
        Boolean bool = this.f16173f;
        booleanValue = bool != null ? bool.booleanValue() : this.f16170b.f();
        b(booleanValue);
        return booleanValue;
    }

    public final void b(boolean z10) {
        boolean z11 = false;
        String format = String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f16173f == null ? "global Firebase setting" : this.f16172e ? "firebase_crashlytics_collection_enabled manifest flag" : "API");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z11 = true;
        }
        if (z11) {
            Log.d("FirebaseCrashlytics", format, null);
        }
    }
}
