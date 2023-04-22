package sb;

import android.content.Context;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14944a;

    /* renamed from: b  reason: collision with root package name */
    public b f14945b = null;

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f14946a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14947b;

        /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(sb.d r5, sb.d.a r6) {
            /*
                r4 = this;
                r4.<init>()
                android.content.Context r6 = r5.f14944a
                java.lang.String r0 = "com.google.firebase.crashlytics.unity_version"
                java.lang.String r1 = "string"
                int r6 = com.google.firebase.crashlytics.internal.common.CommonUtils.f(r6, r0, r1)
                r0 = 2
                java.lang.String r1 = "FirebaseCrashlytics"
                r2 = 0
                if (r6 == 0) goto L33
                java.lang.String r3 = "Unity"
                r4.f14946a = r3
                android.content.Context r5 = r5.f14944a
                android.content.res.Resources r5 = r5.getResources()
                java.lang.String r5 = r5.getString(r6)
                r4.f14947b = r5
                java.lang.String r6 = "Unity Editor version is: "
                java.lang.String r5 = a1.a.l(r6, r5)
                boolean r6 = android.util.Log.isLoggable(r1, r0)
                if (r6 == 0) goto L68
                android.util.Log.v(r1, r5, r2)
                goto L68
            L33:
                java.lang.String r6 = "flutter_assets"
                android.content.Context r3 = r5.f14944a     // Catch: java.io.IOException -> L4f
                android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.io.IOException -> L4f
                if (r3 != 0) goto L3e
                goto L4f
            L3e:
                android.content.Context r5 = r5.f14944a     // Catch: java.io.IOException -> L4f
                android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.io.IOException -> L4f
                java.lang.String[] r5 = r5.list(r6)     // Catch: java.io.IOException -> L4f
                if (r5 == 0) goto L4f
                int r5 = r5.length     // Catch: java.io.IOException -> L4f
                if (r5 <= 0) goto L4f
                r5 = 1
                goto L50
            L4f:
                r5 = 0
            L50:
                if (r5 == 0) goto L64
                java.lang.String r5 = "Flutter"
                r4.f14946a = r5
                r4.f14947b = r2
                boolean r5 = android.util.Log.isLoggable(r1, r0)
                if (r5 == 0) goto L68
                java.lang.String r5 = "Development platform is: Flutter"
                android.util.Log.v(r1, r5, r2)
                goto L68
            L64:
                r4.f14946a = r2
                r4.f14947b = r2
            L68:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sb.d.b.<init>(sb.d, sb.d$a):void");
        }
    }

    public d(Context context) {
        this.f14944a = context;
    }
}
