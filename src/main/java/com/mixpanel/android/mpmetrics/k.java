package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import com.mixpanel.android.mpmetrics.a;
import com.mixpanel.android.mpmetrics.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: o  reason: collision with root package name */
    public static final Map<String, Map<Context, k>> f8270o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    public static final q f8271p = new q();

    /* renamed from: q  reason: collision with root package name */
    public static final cd.k f8272q = new cd.k();

    /* renamed from: r  reason: collision with root package name */
    public static Future<SharedPreferences> f8273r;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8274a;

    /* renamed from: b  reason: collision with root package name */
    public final com.mixpanel.android.mpmetrics.a f8275b;

    /* renamed from: c  reason: collision with root package name */
    public final cd.c f8276c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final e f8277e;

    /* renamed from: f  reason: collision with root package name */
    public final fd.e f8278f;

    /* renamed from: g  reason: collision with root package name */
    public final cd.f f8279g;

    /* renamed from: h  reason: collision with root package name */
    public final fd.d f8280h;

    /* renamed from: i  reason: collision with root package name */
    public final com.mixpanel.android.mpmetrics.b f8281i;

    /* renamed from: j  reason: collision with root package name */
    public final com.mixpanel.android.mpmetrics.c f8282j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, String> f8283k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, Long> f8284l;

    /* renamed from: m  reason: collision with root package name */
    public n f8285m;
    public final cd.i n;

    /* loaded from: classes.dex */
    public static class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            JSONObject jSONObject = new JSONObject();
            Bundle bundleExtra = intent.getBundleExtra("event_args");
            if (bundleExtra != null) {
                for (String str : bundleExtra.keySet()) {
                    try {
                        jSONObject.put(str, bundleExtra.get(str));
                    } catch (JSONException e10) {
                        cb.e.D("MixpanelAPI.AL", "failed to add key \"" + str + "\" to properties for tracking bolts event", e10);
                    }
                }
            }
            k kVar = k.this;
            StringBuilder m10 = a1.a.m("$");
            m10.append(intent.getStringExtra("event_name"));
            kVar.p(m10.toString(), jSONObject);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c implements fd.e {
        public c(k kVar, cd.k kVar2) {
        }

        @Override // fd.e
        public void b(JSONArray jSONArray) {
        }

        @Override // fd.e
        public void c(JSONArray jSONArray) {
        }

        @Override // fd.e
        public void d() {
        }

        @Override // fd.e
        public void e() {
        }

        @Override // fd.e
        public void f(JSONArray jSONArray) {
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public class e implements d {
        public e(i iVar) {
        }

        @Override // com.mixpanel.android.mpmetrics.k.d
        public void a(String str) {
            if (k.this.l()) {
                return;
            }
            if (str == null) {
                cb.e.B("MixpanelAPI.API", "Can't identify with null distinct_id.");
                return;
            }
            synchronized (k.this.f8279g) {
                cd.f fVar = k.this.f8279g;
                synchronized (fVar) {
                    if (!fVar.f4066i) {
                        fVar.g();
                    }
                    fVar.f4069l = str;
                    fVar.o();
                }
                k.this.f8282j.c(str);
            }
            k.b(k.this, str);
        }

        public void b(String str, Object obj) {
            if (k.this.l()) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                k.a(k.this, h("$append", jSONObject));
            } catch (JSONException e10) {
                cb.e.D("MixpanelAPI.API", "Exception appending a property", e10);
            }
        }

        public String c() {
            return k.this.f8279g.c();
        }

        public InAppNotification d() {
            k kVar = k.this;
            com.mixpanel.android.mpmetrics.c cVar = kVar.f8282j;
            boolean z10 = kVar.f8276c.f4036f;
            synchronized (cVar) {
                try {
                    if (cVar.d.isEmpty()) {
                        cb.e.h0("MixpanelAPI.DecideUpdts", "No unseen notifications exist, none will be returned.");
                        return null;
                    }
                    InAppNotification remove = cVar.d.remove(0);
                    if (z10) {
                        cVar.d.add(remove);
                    } else {
                        cb.e.h0("MixpanelAPI.DecideUpdts", "Recording notification " + remove + " as seen.");
                    }
                    return remove;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void e(String str, double d) {
            if (k.this.l()) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(str, Double.valueOf(d));
            if (k.this.l()) {
                return;
            }
            try {
                k.a(k.this, h("$add", new JSONObject(hashMap)));
            } catch (JSONException e10) {
                cb.e.D("MixpanelAPI.API", "Exception incrementing properties", e10);
            }
        }

        public void f(String str, Object obj) {
            if (k.this.l()) {
                return;
            }
            try {
                g(new JSONObject().put(str, obj));
            } catch (JSONException e10) {
                cb.e.D("MixpanelAPI.API", "set", e10);
            }
        }

        public void g(JSONObject jSONObject) {
            if (k.this.l()) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(k.this.f8283k);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                k.a(k.this, h("$set", jSONObject2));
            } catch (JSONException e10) {
                cb.e.D("MixpanelAPI.API", "Exception setting people properties", e10);
            }
        }

        public final JSONObject h(String str, Object obj) {
            boolean z10;
            JSONObject jSONObject = new JSONObject();
            String c10 = c();
            String i10 = k.this.i();
            jSONObject.put(str, obj);
            jSONObject.put("$token", k.this.d);
            jSONObject.put("$time", System.currentTimeMillis());
            cd.f fVar = k.this.f8279g;
            synchronized (fVar) {
                if (!fVar.f4066i) {
                    fVar.g();
                }
                z10 = fVar.n;
            }
            jSONObject.put("$had_persisted_distinct_id", z10);
            if (i10 != null) {
                jSONObject.put("$device_id", i10);
            }
            if (c10 != null) {
                jSONObject.put("$distinct_id", c10);
                jSONObject.put("$user_id", c10);
            }
            jSONObject.put("$mp_metadata", k.this.n.a(false));
            return jSONObject;
        }

        public void i(String str, InAppNotification inAppNotification, JSONObject jSONObject) {
            if (k.this.l()) {
                return;
            }
            JSONObject a10 = inAppNotification.a();
            if (jSONObject != null) {
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a10.put(next, jSONObject.get(next));
                    }
                } catch (JSONException e10) {
                    cb.e.D("MixpanelAPI.API", "Exception merging provided properties with notification properties", e10);
                }
            }
            k kVar = k.this;
            if (kVar.l()) {
                return;
            }
            kVar.q(str, a10, false);
        }

        public void j(InAppNotification inAppNotification) {
            cd.f fVar = k.this.f8279g;
            Integer valueOf = Integer.valueOf(inAppNotification.f8169j);
            synchronized (fVar) {
                try {
                    try {
                        SharedPreferences sharedPreferences = fVar.f4059a.get();
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString("seen_campaign_ids", sharedPreferences.getString("seen_campaign_ids", BuildConfig.FLAVOR) + valueOf + ",");
                        edit.apply();
                    } catch (InterruptedException e10) {
                        cb.e.D("MixpanelAPI.PIdentity", "Can't write campaign id to shared preferences", e10);
                    }
                } catch (ExecutionException e11) {
                    cb.e.D("MixpanelAPI.PIdentity", "Can't write campaign d to shared preferences", e11.getCause());
                }
            }
            if (k.this.l()) {
                return;
            }
            l lVar = null;
            i("$campaign_delivery", inAppNotification, null);
            e eVar = k.this.f8277e;
            String c10 = c();
            Objects.requireNonNull(eVar);
            if (c10 != null) {
                lVar = new l(eVar, c10);
            }
            if (lVar == null) {
                cb.e.B("MixpanelAPI.API", "No identity found. Make sure to call getPeople().identify() before showing in-app notifications.");
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            JSONObject a10 = inAppNotification.a();
            try {
                a10.put("$time", simpleDateFormat.format(new Date()));
            } catch (JSONException e12) {
                cb.e.D("MixpanelAPI.API", "Exception trying to track an in-app notification seen", e12);
            }
            lVar.b("$campaigns", Integer.valueOf(inAppNotification.f8169j));
            lVar.b("$notifications", a10);
        }
    }

    /* loaded from: classes.dex */
    public class f implements c.a, Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final Set<cd.e> f8288c = Collections.newSetFromMap(new ConcurrentHashMap());

        /* renamed from: f  reason: collision with root package name */
        public final Executor f8289f = Executors.newSingleThreadExecutor();

        public f(i iVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Set<String> set;
            for (cd.e eVar : this.f8288c) {
                eVar.a();
            }
            k kVar = k.this;
            com.mixpanel.android.mpmetrics.b bVar = kVar.f8281i;
            com.mixpanel.android.mpmetrics.c cVar = kVar.f8282j;
            synchronized (cVar) {
                try {
                    set = cVar.f8240k;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Objects.requireNonNull(bVar);
            if (set.contains("urbanairship")) {
                bVar.a();
            }
            if (set.contains("braze")) {
                try {
                    Object invoke = Class.forName("com.appboy.Appboy").getMethod("getInstance", Context.class).invoke(null, bVar.f8227b);
                    String str = (String) invoke.getClass().getMethod("getDeviceId", new Class[0]).invoke(invoke, new Object[0]);
                    Object invoke2 = invoke.getClass().getMethod("getCurrentUser", new Class[0]).invoke(invoke, new Object[0]);
                    if (invoke2 == null) {
                        cb.e.j0("MixpanelAPI.CnctInts", "Make sure Braze is initialized properly before Mixpanel.");
                        return;
                    }
                    String str2 = (String) invoke2.getClass().getMethod("getUserId", new Class[0]).invoke(invoke2, new Object[0]);
                    if (str != null && !str.isEmpty()) {
                        k kVar2 = bVar.f8226a;
                        kVar2.c(str, kVar2.j());
                        bVar.f8226a.f8277e.f("$braze_device_id", str);
                    }
                    if (str2 == null || str2.isEmpty()) {
                        return;
                    }
                    k kVar3 = bVar.f8226a;
                    kVar3.c(str2, kVar3.j());
                    bVar.f8226a.f8277e.f("$braze_external_id", str2);
                } catch (ClassNotFoundException e10) {
                    cb.e.k0("MixpanelAPI.CnctInts", "Braze SDK not found but Braze is integrated on Mixpanel", e10);
                } catch (IllegalAccessException e11) {
                    cb.e.D("MixpanelAPI.CnctInts", "method invocation failed", e11);
                } catch (NoSuchMethodException e12) {
                    cb.e.D("MixpanelAPI.CnctInts", "Braze SDK class exists but methods do not", e12);
                } catch (InvocationTargetException e13) {
                    cb.e.D("MixpanelAPI.CnctInts", "method invocation failed", e13);
                } catch (Exception e14) {
                    cb.e.D("MixpanelAPI.CnctInts", "Error setting braze people properties", e14);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0181, code lost:
        if (r10 != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(android.content.Context r10, java.util.concurrent.Future<android.content.SharedPreferences> r11, java.lang.String r12, boolean r13, org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.k.<init>(android.content.Context, java.util.concurrent.Future, java.lang.String, boolean, org.json.JSONObject):void");
    }

    public static void a(k kVar, JSONObject jSONObject) {
        if (kVar.l()) {
            return;
        }
        com.mixpanel.android.mpmetrics.a aVar = kVar.f8275b;
        a.e eVar = new a.e(jSONObject, kVar.d);
        Objects.requireNonNull(aVar);
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = eVar;
        aVar.f8205a.b(obtain);
    }

    public static void b(k kVar, String str) {
        com.mixpanel.android.mpmetrics.a aVar = kVar.f8275b;
        a.f fVar = new a.f(str, kVar.d);
        Objects.requireNonNull(aVar);
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = fVar;
        aVar.f8205a.b(obtain);
    }

    public static void d(b bVar) {
        Map<String, Map<Context, k>> map = f8270o;
        synchronized (map) {
            try {
                for (Map map2 : ((HashMap) map).values()) {
                    for (k kVar : map2.values()) {
                        ((p) bVar).a(kVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(Context context) {
        if (!(context instanceof Activity)) {
            cb.e.x("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
            return;
        }
        try {
            Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", Context.class, Intent.class).invoke(null, context, ((Activity) context).getIntent());
        } catch (ClassNotFoundException e10) {
            StringBuilder m10 = a1.a.m("Please install the Bolts library >= 1.1.2 to track App Links: ");
            m10.append(e10.getMessage());
            cb.e.x("MixpanelAPI.AL", m10.toString());
        } catch (IllegalAccessException e11) {
            StringBuilder m11 = a1.a.m("Unable to detect inbound App Links: ");
            m11.append(e11.getMessage());
            cb.e.x("MixpanelAPI.AL", m11.toString());
        } catch (NoSuchMethodException e12) {
            StringBuilder m12 = a1.a.m("Please install the Bolts library >= 1.1.2 to track App Links: ");
            m12.append(e12.getMessage());
            cb.e.x("MixpanelAPI.AL", m12.toString());
        } catch (InvocationTargetException e13) {
            cb.e.z("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x000d, B:11:0x0015, B:12:0x0022, B:14:0x002e, B:15:0x003b, B:17:0x0043, B:21:0x0057, B:23:0x0061, B:27:0x007c, B:29:0x009a, B:35:0x00ab, B:36:0x00ae, B:32:0x00a0, B:25:0x0073), top: B:46:0x000d, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mixpanel.android.mpmetrics.k k(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 183
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.k.k(android.content.Context, java.lang.String):com.mixpanel.android.mpmetrics.k");
    }

    public static void n(Context context, k kVar) {
        try {
            f1.a.class.getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class).invoke(f1.a.class.getMethod("getInstance", Context.class).invoke(null, context), new a(), new IntentFilter("com.parse.bolts.measurement_event"));
        } catch (ClassNotFoundException e10) {
            StringBuilder m10 = a1.a.m("To enable App Links tracking android.support.v4 must be installed: ");
            m10.append(e10.getMessage());
            cb.e.x("MixpanelAPI.AL", m10.toString());
        } catch (IllegalAccessException e11) {
            StringBuilder m11 = a1.a.m("App Links tracking will not be enabled due to this exception: ");
            m11.append(e11.getMessage());
            cb.e.x("MixpanelAPI.AL", m11.toString());
        } catch (NoSuchMethodException e12) {
            StringBuilder m12 = a1.a.m("To enable App Links tracking android.support.v4 must be installed: ");
            m12.append(e12.getMessage());
            cb.e.x("MixpanelAPI.AL", m12.toString());
        } catch (InvocationTargetException e13) {
            cb.e.z("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", e13);
        }
    }

    public static void r(Context context, Intent intent, String str, JSONObject jSONObject) {
        if (!intent.hasExtra(PerformersConfig.DEFAULT_LISTINGS_ORDER) || !intent.hasExtra("mp_campaign_id") || !intent.hasExtra("mp_message_id")) {
            cb.e.B("MixpanelAPI.API", "Intent is missing Mixpanel notification metadata, not tracking event: \"" + str + "\"");
            return;
        }
        String stringExtra = intent.getStringExtra("mp_message_id");
        String stringExtra2 = intent.getStringExtra("mp_campaign_id");
        String stringExtra3 = intent.getStringExtra("mp_canonical_notification_id");
        Integer valueOf = Integer.valueOf(stringExtra2);
        Integer valueOf2 = Integer.valueOf(stringExtra);
        String stringExtra4 = intent.getStringExtra(PerformersConfig.DEFAULT_LISTINGS_ORDER);
        try {
            JSONObject jSONObject2 = new JSONObject(stringExtra4);
            if (jSONObject2.optString("token") == null) {
                cb.e.B("MixpanelAPI.API", "\"token\" not found in mp payload, not tracking event: \"" + str + "\"");
                return;
            }
            jSONObject2.remove("token");
            if (jSONObject2.optString("distinct_id") == null) {
                cb.e.B("MixpanelAPI.API", "\"distinct_id\" not found in mp payload, not tracking event: \"" + str + "\"");
                return;
            }
            jSONObject2.remove("distinct_id");
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                jSONObject2.put("message_id", valueOf2);
                jSONObject2.put("campaign_id", valueOf);
                jSONObject2.put("$android_notification_id", stringExtra3);
            } catch (JSONException e10) {
                cb.e.D("MixpanelAPI.API", "Error setting tracking JSON properties.", e10);
            }
            k kVar = null;
            try {
                String optString = new JSONObject(stringExtra4).optString("token");
                if (optString != null) {
                    kVar = k(context, optString);
                }
            } catch (JSONException unused) {
            }
            if (kVar != null) {
                if (!kVar.l()) {
                    kVar.q(str, jSONObject2, false);
                }
                kVar.g();
                return;
            }
            cb.e.B("MixpanelAPI.API", "Got null instance, not tracking \"" + str + "\"");
        } catch (JSONException e11) {
            cb.e.D("MixpanelAPI.API", "Exception parsing mp payload from intent extras, not tracking event: \"" + str + "\"", e11);
        }
    }

    public void c(String str, String str2) {
        if (l()) {
            return;
        }
        if (str2 == null) {
            str2 = j();
        }
        if (str.equals(str2)) {
            cb.e.j0("MixpanelAPI.API", "Attempted to alias identical distinct_ids " + str + ". Alias message will not be sent.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alias", str);
            jSONObject.put("original", str2);
            if (!l()) {
                q("$create_alias", jSONObject, false);
            }
        } catch (JSONException e10) {
            cb.e.D("MixpanelAPI.API", "Failed to alias", e10);
        }
        f();
    }

    public void f() {
        if (l()) {
            return;
        }
        com.mixpanel.android.mpmetrics.a aVar = this.f8275b;
        String str = this.d;
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = str;
        obtain.arg1 = 1;
        aVar.f8205a.b(obtain);
    }

    public void g() {
        if (l()) {
            return;
        }
        com.mixpanel.android.mpmetrics.a aVar = this.f8275b;
        String str = this.d;
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = str;
        obtain.arg1 = 0;
        aVar.f8205a.b(obtain);
    }

    public com.mixpanel.android.mpmetrics.a h() {
        com.mixpanel.android.mpmetrics.a aVar;
        Context context = this.f8274a;
        Map<Context, com.mixpanel.android.mpmetrics.a> map = com.mixpanel.android.mpmetrics.a.d;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (((HashMap) map).containsKey(applicationContext)) {
                aVar = (com.mixpanel.android.mpmetrics.a) ((HashMap) map).get(applicationContext);
            } else {
                aVar = new com.mixpanel.android.mpmetrics.a(applicationContext);
                ((HashMap) map).put(applicationContext, aVar);
            }
        }
        return aVar;
    }

    public String i() {
        String str;
        cd.f fVar = this.f8279g;
        synchronized (fVar) {
            if (!fVar.f4066i) {
                fVar.g();
            }
            str = fVar.f4070m;
        }
        return str;
    }

    public String j() {
        return this.f8279g.b();
    }

    public boolean l() {
        boolean booleanValue;
        cd.f fVar = this.f8279g;
        String str = this.d;
        synchronized (fVar) {
            if (fVar.f4071o == null) {
                fVar.h(str);
            }
            booleanValue = fVar.f4071o.booleanValue();
        }
        return booleanValue;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void m() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.k.m():void");
    }

    public void o(String str) {
        if (!l() && !l()) {
            q(str, null, false);
        }
    }

    public void p(String str, JSONObject jSONObject) {
        if (l()) {
            return;
        }
        q(str, jSONObject, false);
    }

    public void q(String str, JSONObject jSONObject, boolean z10) {
        Long l10;
        String str2;
        boolean z11;
        if (l()) {
            return;
        }
        if (z10) {
            Boolean bool = this.f8282j.f8238i;
            if (!(bool == null ? true : bool.booleanValue())) {
                return;
            }
        }
        synchronized (this.f8284l) {
            l10 = this.f8284l.get(str);
            this.f8284l.remove(str);
            cd.f fVar = this.f8279g;
            Objects.requireNonNull(fVar);
            try {
                SharedPreferences.Editor edit = fVar.f4061c.get().edit();
                edit.remove(str);
                edit.apply();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            } catch (ExecutionException e11) {
                e11.printStackTrace();
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : this.f8279g.d().entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            this.f8279g.a(jSONObject2);
            double currentTimeMillis = System.currentTimeMillis() / 1000.0d;
            long j10 = (long) currentTimeMillis;
            String j11 = j();
            String i10 = i();
            cd.f fVar2 = this.f8279g;
            synchronized (fVar2) {
                if (!fVar2.f4066i) {
                    fVar2.g();
                }
                str2 = fVar2.f4068k ? fVar2.f4067j : null;
            }
            jSONObject2.put("time", j10);
            jSONObject2.put("distinct_id", j11);
            cd.f fVar3 = this.f8279g;
            synchronized (fVar3) {
                if (!fVar3.f4066i) {
                    fVar3.g();
                }
                z11 = fVar3.n;
            }
            jSONObject2.put("$had_persisted_distinct_id", z11);
            if (i10 != null) {
                jSONObject2.put("$device_id", i10);
            }
            if (str2 != null) {
                jSONObject2.put("$user_id", str2);
            }
            if (l10 != null) {
                jSONObject2.put("$duration", currentTimeMillis - (l10.longValue() / 1000.0d));
            }
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            a.C0108a c0108a = new a.C0108a(str, jSONObject2, this.d, z10, this.n.a(true));
            com.mixpanel.android.mpmetrics.a aVar = this.f8275b;
            Objects.requireNonNull(aVar);
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = c0108a;
            aVar.f8205a.b(obtain);
            WeakReference<Activity> weakReference = this.f8285m.f8301u;
            if ((weakReference != null ? weakReference.get() : null) != null) {
                e eVar = this.f8277e;
                InAppNotification a10 = this.f8282j.a(c0108a, this.f8276c.f4036f);
                WeakReference<Activity> weakReference2 = this.f8285m.f8301u;
                Activity activity = weakReference2 != null ? weakReference2.get() : null;
                Objects.requireNonNull(eVar);
                if (a10 != null) {
                    activity.runOnUiThread(new m(eVar, a10, activity));
                }
            }
            fd.d dVar = this.f8280h;
            if (dVar != null) {
                dVar.a(str);
            }
        } catch (JSONException e12) {
            cb.e.D("MixpanelAPI.API", "Exception tracking event " + str, e12);
        }
    }
}
