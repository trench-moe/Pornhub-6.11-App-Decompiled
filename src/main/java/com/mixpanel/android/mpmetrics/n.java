package com.mixpanel.android.mpmetrics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.mixpanel.android.mpmetrics.k;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

@TargetApi(14)
/* loaded from: classes.dex */
public class n implements Application.ActivityLifecycleCallbacks {

    /* renamed from: w  reason: collision with root package name */
    public static Double f8295w;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f8297f;
    public final k n;

    /* renamed from: t  reason: collision with root package name */
    public final cd.c f8300t;

    /* renamed from: u  reason: collision with root package name */
    public WeakReference<Activity> f8301u;

    /* renamed from: c  reason: collision with root package name */
    public Handler f8296c = new Handler(Looper.getMainLooper());

    /* renamed from: j  reason: collision with root package name */
    public boolean f8298j = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8299m = true;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r11 = this;
                r7 = r11
                com.mixpanel.android.mpmetrics.n r0 = com.mixpanel.android.mpmetrics.n.this
                java.lang.String r10 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                boolean r1 = r0.f8298j
                if (r1 == 0) goto La0
                r9 = 7
                boolean r1 = r0.f8299m
                if (r1 == 0) goto La0
                r10 = 7
                r1 = 0
                r0.f8298j = r1
                long r0 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L86
                double r0 = (double) r0     // Catch: org.json.JSONException -> L86
                java.lang.Double r2 = com.mixpanel.android.mpmetrics.n.f8295w     // Catch: org.json.JSONException -> L86
                r10 = 4
                double r2 = r2.doubleValue()     // Catch: org.json.JSONException -> L86
                double r0 = r0 - r2
                r9 = 1
                com.mixpanel.android.mpmetrics.n r2 = com.mixpanel.android.mpmetrics.n.this     // Catch: org.json.JSONException -> L86
                r10 = 1
                cd.c r2 = r2.f8300t     // Catch: org.json.JSONException -> L86
                r10 = 7
                int r3 = r2.f4053x     // Catch: org.json.JSONException -> L86
                double r3 = (double) r3     // Catch: org.json.JSONException -> L86
                r9 = 7
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 < 0) goto L8a
                int r2 = r2.y     // Catch: org.json.JSONException -> L86
                double r2 = (double) r2     // Catch: org.json.JSONException -> L86
                r10 = 7
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r9 = 1
                if (r4 >= 0) goto L8a
                r9 = 2
                r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
                r9 = 6
                double r0 = r0 / r2
                r10 = 4
                r2 = 4621819117588971520(0x4024000000000000, double:10.0)
                r9 = 7
                double r0 = r0 * r2
                r9 = 3
                long r0 = java.lang.Math.round(r0)     // Catch: org.json.JSONException -> L86
                double r0 = (double) r0     // Catch: org.json.JSONException -> L86
                double r0 = r0 / r2
                r9 = 1
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L86
                r10 = 2
                r2.<init>()     // Catch: org.json.JSONException -> L86
                r9 = 7
                java.lang.String r9 = "$ae_session_length"
                r3 = r9
                r2.put(r3, r0)     // Catch: org.json.JSONException -> L86
                com.mixpanel.android.mpmetrics.n r3 = com.mixpanel.android.mpmetrics.n.this     // Catch: org.json.JSONException -> L86
                com.mixpanel.android.mpmetrics.k r3 = r3.n     // Catch: org.json.JSONException -> L86
                r9 = 5
                com.mixpanel.android.mpmetrics.k$e r3 = r3.f8277e     // Catch: org.json.JSONException -> L86
                java.lang.String r10 = "$ae_total_app_sessions"
                r4 = r10
                r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r9 = 3
                r3.e(r4, r5)     // Catch: org.json.JSONException -> L86
                com.mixpanel.android.mpmetrics.n r3 = com.mixpanel.android.mpmetrics.n.this     // Catch: org.json.JSONException -> L86
                com.mixpanel.android.mpmetrics.k r3 = r3.n     // Catch: org.json.JSONException -> L86
                com.mixpanel.android.mpmetrics.k$e r3 = r3.f8277e     // Catch: org.json.JSONException -> L86
                r10 = 2
                java.lang.String r10 = "$ae_total_app_session_length"
                r4 = r10
                r3.e(r4, r0)     // Catch: org.json.JSONException -> L86
                com.mixpanel.android.mpmetrics.n r0 = com.mixpanel.android.mpmetrics.n.this     // Catch: org.json.JSONException -> L86
                r9 = 7
                com.mixpanel.android.mpmetrics.k r0 = r0.n     // Catch: org.json.JSONException -> L86
                r10 = 1
                java.lang.String r10 = "$ae_session"
                r1 = r10
                r3 = 1
                r10 = 2
                r0.q(r1, r2, r3)     // Catch: org.json.JSONException -> L86
                goto L8b
            L86:
                r0 = move-exception
                r0.printStackTrace()
            L8a:
                r10 = 6
            L8b:
                com.mixpanel.android.mpmetrics.n r0 = com.mixpanel.android.mpmetrics.n.this
                r9 = 2
                com.mixpanel.android.mpmetrics.k r0 = r0.n
                cd.c r1 = r0.f8276c
                boolean r1 = r1.f4034c
                if (r1 == 0) goto L9a
                r9 = 6
                r0.f()
            L9a:
                fd.e r0 = r0.f8278f
                r0.e()
                r9 = 7
            La0:
                r9 = 2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.n.a.run():void");
        }
    }

    public n(k kVar, cd.c cVar) {
        this.n = kVar;
        this.f8300t = cVar;
        if (f8295w == null) {
            f8295w = Double.valueOf(System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f8299m = true;
        Runnable runnable = this.f8297f;
        if (runnable != null) {
            this.f8296c.removeCallbacks(runnable);
        }
        this.f8301u = null;
        Handler handler = this.f8296c;
        a aVar = new a();
        this.f8297f = aVar;
        handler.postDelayed(aVar, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        JSONArray jSONArray;
        if (this.f8300t.f4046q) {
            k.e eVar = this.n.f8277e;
            c cVar = k.this.f8282j;
            synchronized (cVar) {
                jSONArray = cVar.f8237h;
            }
            k.this.f8278f.f(jSONArray);
        }
        this.f8301u = new WeakReference<>(activity);
        this.f8299m = false;
        boolean z10 = !this.f8298j;
        this.f8298j = true;
        Runnable runnable = this.f8297f;
        if (runnable != null) {
            this.f8296c.removeCallbacks(runnable);
        }
        if (z10) {
            f8295w = Double.valueOf(System.currentTimeMillis());
            this.n.n.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            if (intent.hasExtra("mp_campaign_id") && intent.hasExtra("mp_message_id")) {
                k.r(this.n.f8274a, intent, "$app_open", new JSONObject());
            }
        }
        if (this.f8300t.f4046q) {
            k.e eVar = this.n.f8277e;
            Objects.requireNonNull(eVar);
            activity.runOnUiThread(new m(eVar, null, activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
