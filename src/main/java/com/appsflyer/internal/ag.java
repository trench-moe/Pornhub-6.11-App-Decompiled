package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ag {
    public static b AFInAppEventParameterName = null;
    public static long AFKeystoreWrapper = 500;

    /* renamed from: com.appsflyer.internal.ag$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass3 implements Application.ActivityLifecycleCallbacks {
        private /* synthetic */ Executor AFInAppEventType;
        public boolean AFKeystoreWrapper = true;
        public boolean valueOf;
        public final /* synthetic */ b values;

        public AnonymousClass3(Executor executor, b bVar) {
            this.AFInAppEventType = executor;
            this.values = bVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(final Activity activity, Bundle bundle) {
            this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.ag.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    j.valueOf();
                    Intent intent = activity.getIntent();
                    if (j.AFInAppEventType(intent) == null || intent == j.AFInAppEventType) {
                        return;
                    }
                    j.AFInAppEventType = intent;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(final Activity activity) {
            this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.ag.3.4
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass3.this.AFKeystoreWrapper = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.ag.3.4.4
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                if (anonymousClass3.valueOf && anonymousClass3.AFKeystoreWrapper) {
                                    anonymousClass3.valueOf = false;
                                    try {
                                        anonymousClass3.values.AFInAppEventType(applicationContext);
                                    } catch (Exception e10) {
                                        AFLogger.AFInAppEventParameterName("Listener threw exception! ", e10);
                                    }
                                }
                            }
                        }, ag.AFKeystoreWrapper);
                    } catch (Throwable th) {
                        AFLogger.AFInAppEventParameterName("Background task failed with a throwable: ", th);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.AFInAppEventType.execute(new Runnable() { // from class: com.appsflyer.internal.ag.3.5
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                    if (!anonymousClass3.valueOf) {
                        try {
                            anonymousClass3.values.AFKeystoreWrapper(activity);
                        } catch (Exception e10) {
                            AFLogger.AFInAppEventType("Listener thrown an exception: ", e10);
                        }
                    }
                    AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                    anonymousClass32.AFKeystoreWrapper = false;
                    anonymousClass32.valueOf = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void AFInAppEventType(Context context);

        void AFKeystoreWrapper(Activity activity);
    }

    public static void AFInAppEventParameterName(Context context, b bVar, Executor executor) {
        AFInAppEventParameterName = bVar;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(executor, bVar);
        if (context instanceof Activity) {
            anonymousClass3.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass3);
    }
}
