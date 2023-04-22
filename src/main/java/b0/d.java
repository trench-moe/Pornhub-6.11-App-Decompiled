package b0;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f3387a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f3388b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f3389c;
    public static final Method d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f3390e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f3391f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f3392g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f3393c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f3394f;

        public a(c cVar, Object obj) {
            this.f3393c = cVar;
            this.f3394f = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3393c.f3397c = this.f3394f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Application f3395c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f3396f;

        public b(Application application, c cVar) {
            this.f3395c = application;
            this.f3396f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3395c.unregisterActivityLifecycleCallbacks(this.f3396f);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: c  reason: collision with root package name */
        public Object f3397c;

        /* renamed from: f  reason: collision with root package name */
        public Activity f3398f;

        /* renamed from: j  reason: collision with root package name */
        public final int f3399j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3400m = false;
        public boolean n = false;

        /* renamed from: t  reason: collision with root package name */
        public boolean f3401t = false;

        public c(Activity activity) {
            this.f3398f = activity;
            this.f3399j = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3398f == activity) {
                this.f3398f = null;
                this.n = true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
            r8.f3401t = true;
            r8.f3397c = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
            return;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onActivityPaused(android.app.Activity r9) {
            /*
                r8 = this;
                r5 = r8
                boolean r0 = r5.n
                r7 = 7
                if (r0 == 0) goto L52
                r7 = 6
                boolean r0 = r5.f3401t
                if (r0 != 0) goto L52
                r7 = 5
                boolean r0 = r5.f3400m
                r7 = 6
                if (r0 != 0) goto L52
                r7 = 2
                java.lang.Object r0 = r5.f3397c
                int r1 = r5.f3399j
                r7 = 7
                r7 = 0
                r2 = r7
                r7 = 1
                r3 = r7
                java.lang.reflect.Field r4 = b0.d.f3389c     // Catch: java.lang.Throwable -> L42
                java.lang.Object r4 = r4.get(r9)     // Catch: java.lang.Throwable -> L42
                if (r4 != r0) goto L4b
                int r7 = r9.hashCode()     // Catch: java.lang.Throwable -> L42
                r0 = r7
                if (r0 == r1) goto L2c
                r7 = 2
                goto L4b
            L2c:
                java.lang.reflect.Field r0 = b0.d.f3388b     // Catch: java.lang.Throwable -> L42
                r7 = 4
                java.lang.Object r7 = r0.get(r9)     // Catch: java.lang.Throwable -> L42
                r9 = r7
                android.os.Handler r0 = b0.d.f3392g     // Catch: java.lang.Throwable -> L42
                r7 = 4
                b0.e r1 = new b0.e     // Catch: java.lang.Throwable -> L42
                r1.<init>(r9, r4)     // Catch: java.lang.Throwable -> L42
                r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L42
                r7 = 1
                r2 = r7
                goto L4b
            L42:
                r9 = move-exception
                java.lang.String r7 = "ActivityRecreator"
                r0 = r7
                java.lang.String r1 = "Exception while fetching field values"
                android.util.Log.e(r0, r1, r9)
            L4b:
                if (r2 == 0) goto L52
                r5.f3401t = r3
                r9 = 0
                r5.f3397c = r9
            L52:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.d.c.onActivityPaused(android.app.Activity):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3398f == activity) {
                this.f3400m = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            b0.d.f3392g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            b0.d.f3387a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            b0.d.f3388b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            b0.d.f3389c = r0
            java.lang.Class<?> r0 = b0.d.f3387a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L3e
        L3c:
            r0 = r1
            goto L53
        L3e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3c
            r7[r2] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L3c
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3c
        L53:
            b0.d.d = r0
            java.lang.Class<?> r0 = b0.d.f3387a
            if (r0 != 0) goto L5b
        L59:
            r0 = r1
            goto L6c
        L5b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L59
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L59
            r7[r2] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L59
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L59
        L6c:
            b0.d.f3390e = r0
            java.lang.Class<?> r0 = b0.d.f3387a
            boolean r4 = a()
            if (r4 == 0) goto Lad
            if (r0 != 0) goto L79
            goto Lad
        L79:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 7
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 8
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lad
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lad
            r1 = r0
        Lad:
            b0.d.f3391f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.d.<clinit>():void");
    }

    public static boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26 && i10 != 27) {
            return false;
        }
        return true;
    }

    public static boolean b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f3391f == null) {
            return false;
        } else {
            if (f3390e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = f3389c.get(activity);
                if (obj2 == null || (obj = f3388b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                c cVar = new c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                Handler handler = f3392g;
                handler.post(new a(cVar, obj2));
                if (a()) {
                    Method method = f3391f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, cVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
