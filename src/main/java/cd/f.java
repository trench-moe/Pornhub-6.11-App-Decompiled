package cd;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"CommitPrefEdits"})
/* loaded from: classes.dex */
public class f {

    /* renamed from: p  reason: collision with root package name */
    public static Integer f4055p = null;

    /* renamed from: q  reason: collision with root package name */
    public static Boolean f4056q = null;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f4057r = true;

    /* renamed from: s  reason: collision with root package name */
    public static final Object f4058s = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Future<SharedPreferences> f4059a;

    /* renamed from: b  reason: collision with root package name */
    public final Future<SharedPreferences> f4060b;

    /* renamed from: c  reason: collision with root package name */
    public final Future<SharedPreferences> f4061c;
    public final Future<SharedPreferences> d;

    /* renamed from: j  reason: collision with root package name */
    public String f4067j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4068k;

    /* renamed from: l  reason: collision with root package name */
    public String f4069l;

    /* renamed from: m  reason: collision with root package name */
    public String f4070m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public Boolean f4071o;

    /* renamed from: g  reason: collision with root package name */
    public Object f4064g = new Object();

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f4063f = null;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, String> f4065h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4066i = false;

    /* renamed from: e  reason: collision with root package name */
    public final SharedPreferences.OnSharedPreferenceChangeListener f4062e = new a();

    /* loaded from: classes.dex */
    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            Integer num = f.f4055p;
            synchronized (f.f4058s) {
                f.this.i();
                f.f4057r = false;
            }
        }
    }

    public f(Future<SharedPreferences> future, Future<SharedPreferences> future2, Future<SharedPreferences> future3, Future<SharedPreferences> future4) {
        this.f4060b = future;
        this.f4059a = future2;
        this.f4061c = future3;
        this.d = future4;
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f4064g) {
            JSONObject e10 = e();
            Iterator<String> keys = e10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject.put(next, e10.get(next));
                } catch (JSONException e11) {
                    cb.e.D("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", e11);
                }
            }
        }
    }

    public synchronized String b() {
        try {
            if (!this.f4066i) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4067j;
    }

    public synchronized String c() {
        if (!this.f4066i) {
            g();
        }
        return this.f4069l;
    }

    public Map<String, String> d() {
        synchronized (f4058s) {
            if (!f4057r) {
                if (this.f4065h == null) {
                }
            }
            i();
            f4057r = false;
        }
        return this.f4065h;
    }

    public final JSONObject e() {
        if (this.f4063f == null) {
            j();
        }
        return this.f4063f;
    }

    public synchronized boolean f(String str) {
        if (str == null) {
            return false;
        }
        Integer valueOf = Integer.valueOf(str);
        try {
            try {
                if (f4055p == null) {
                    Integer valueOf2 = Integer.valueOf(this.d.get().getInt("latest_version_code", -1));
                    f4055p = valueOf2;
                    if (valueOf2.intValue() == -1) {
                        f4055p = valueOf;
                        SharedPreferences.Editor edit = this.d.get().edit();
                        edit.putInt("latest_version_code", valueOf.intValue());
                        edit.apply();
                    }
                }
                if (f4055p.intValue() < valueOf.intValue()) {
                    SharedPreferences.Editor edit2 = this.d.get().edit();
                    edit2.putInt("latest_version_code", valueOf.intValue());
                    edit2.apply();
                    return true;
                }
            } catch (ExecutionException e10) {
                cb.e.D("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10.getCause());
            }
        } catch (InterruptedException e11) {
            cb.e.D("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e11);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r5 = this;
            java.lang.String r4 = "Cannot read distinct ids from sharedPreferences."
            r0 = r4
            java.lang.String r4 = "MixpanelAPI.PIdentity"
            r1 = r4
            r2 = 0
            r4 = 2
            java.util.concurrent.Future<android.content.SharedPreferences> r3 = r5.f4059a     // Catch: java.lang.InterruptedException -> L12 java.util.concurrent.ExecutionException -> L18
            java.lang.Object r4 = r3.get()     // Catch: java.lang.InterruptedException -> L12 java.util.concurrent.ExecutionException -> L18
            r3 = r4
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch: java.lang.InterruptedException -> L12 java.util.concurrent.ExecutionException -> L18
            goto L22
        L12:
            r3 = move-exception
            cb.e.D(r1, r0, r3)
            r4 = 6
            goto L21
        L18:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            r3 = r4
            cb.e.D(r1, r0, r3)
        L21:
            r3 = r2
        L22:
            if (r3 != 0) goto L25
            return
        L25:
            r4 = 2
            java.lang.String r4 = "events_distinct_id"
            r0 = r4
            java.lang.String r4 = r3.getString(r0, r2)
            r0 = r4
            r5.f4067j = r0
            java.lang.String r0 = "events_user_id_present"
            r1 = 0
            boolean r4 = r3.getBoolean(r0, r1)
            r0 = r4
            r5.f4068k = r0
            r4 = 7
            java.lang.String r4 = "people_distinct_id"
            r0 = r4
            java.lang.String r0 = r3.getString(r0, r2)
            r5.f4069l = r0
            r4 = 4
            java.lang.String r4 = "anonymous_id"
            r0 = r4
            java.lang.String r4 = r3.getString(r0, r2)
            r0 = r4
            r5.f4070m = r0
            java.lang.String r4 = "had_persisted_distinct_id"
            r0 = r4
            boolean r0 = r3.getBoolean(r0, r1)
            r5.n = r0
            r4 = 7
            java.lang.String r0 = r5.f4067j
            if (r0 != 0) goto L70
            r4 = 7
            java.util.UUID r4 = java.util.UUID.randomUUID()
            r0 = r4
            java.lang.String r0 = r0.toString()
            r5.f4070m = r0
            r5.f4067j = r0
            r5.f4068k = r1
            r5.o()
        L70:
            r4 = 5
            r4 = 1
            r0 = r4
            r5.f4066i = r0
            r4 = 6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.f.g():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r7) {
        /*
            r6 = this;
            r3 = r6
            java.lang.String r0 = "Cannot read opt out flag from sharedPreferences."
            java.lang.String r1 = "MixpanelAPI.PIdentity"
            java.util.concurrent.Future<android.content.SharedPreferences> r2 = r3.d     // Catch: java.lang.InterruptedException -> Lf java.util.concurrent.ExecutionException -> L15
            java.lang.Object r5 = r2.get()     // Catch: java.lang.InterruptedException -> Lf java.util.concurrent.ExecutionException -> L15
            r2 = r5
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch: java.lang.InterruptedException -> Lf java.util.concurrent.ExecutionException -> L15
            goto L1e
        Lf:
            r2 = move-exception
            cb.e.D(r1, r0, r2)
            r5 = 6
            goto L1d
        L15:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
            cb.e.D(r1, r0, r2)
        L1d:
            r2 = 0
        L1e:
            if (r2 != 0) goto L21
            return
        L21:
            r5 = 5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = 3
            java.lang.String r1 = "opt_out_"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            r7 = r5
            r0 = 0
            r5 = 5
            boolean r7 = r2.getBoolean(r7, r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3.f4071o = r7
            r5 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.f.h(java.lang.String):void");
    }

    public final void i() {
        this.f4065h = new HashMap();
        try {
            SharedPreferences sharedPreferences = this.f4060b.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.f4062e);
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f4062e);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                this.f4065h.put(entry.getKey(), value.toString());
            }
        } catch (InterruptedException e10) {
            cb.e.D("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e10);
        } catch (ExecutionException e11) {
            cb.e.D("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e11.getCause());
        }
    }

    public final void j() {
        JSONObject jSONObject;
        try {
            try {
                try {
                    String string = this.f4059a.get().getString("super_properties", "{}");
                    cb.e.h0("MixpanelAPI.PIdentity", "Loading Super Properties " + string);
                    this.f4063f = new JSONObject(string);
                } catch (InterruptedException e10) {
                    cb.e.D("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e10);
                    if (this.f4063f == null) {
                        jSONObject = new JSONObject();
                        this.f4063f = jSONObject;
                    }
                } catch (JSONException unused) {
                    cb.e.B("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
                    n();
                    if (this.f4063f == null) {
                        jSONObject = new JSONObject();
                        this.f4063f = jSONObject;
                    }
                }
            } catch (ExecutionException e11) {
                cb.e.D("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e11.getCause());
                if (this.f4063f == null) {
                    jSONObject = new JSONObject();
                    this.f4063f = jSONObject;
                }
            }
        } catch (Throwable th) {
            if (this.f4063f == null) {
                this.f4063f = new JSONObject();
            }
            throw th;
        }
    }

    public synchronized void k(String str) {
        try {
            SharedPreferences.Editor edit = this.d.get().edit();
            edit.putBoolean("has_launched_" + str, true);
            edit.apply();
        } catch (InterruptedException e10) {
            cb.e.D("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e10);
        } catch (ExecutionException e11) {
            cb.e.D("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e11.getCause());
        }
    }

    public synchronized void l(String str) {
        try {
            try {
                SharedPreferences.Editor edit = this.d.get().edit();
                edit.putBoolean(str, true);
                edit.apply();
            } catch (InterruptedException e10) {
                cb.e.D("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e10);
            } catch (ExecutionException e11) {
                cb.e.D("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e11.getCause());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void m(String str) {
        try {
            SharedPreferences.Editor edit = this.f4059a.get().edit();
            edit.putString("push_id", str);
            edit.apply();
        } catch (InterruptedException e10) {
            cb.e.D("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e10);
        } catch (ExecutionException e11) {
            cb.e.D("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", e11.getCause());
        }
    }

    public final void n() {
        JSONObject jSONObject = this.f4063f;
        if (jSONObject == null) {
            cb.e.B("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String jSONObject2 = jSONObject.toString();
        cb.e.h0("MixpanelAPI.PIdentity", "Storing Super Properties " + jSONObject2);
        try {
            SharedPreferences.Editor edit = this.f4059a.get().edit();
            edit.putString("super_properties", jSONObject2);
            edit.apply();
        } catch (InterruptedException e10) {
            cb.e.D("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e10);
        } catch (ExecutionException e11) {
            cb.e.D("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e11.getCause());
        }
    }

    public final void o() {
        try {
            SharedPreferences.Editor edit = this.f4059a.get().edit();
            edit.putString("events_distinct_id", this.f4067j);
            edit.putBoolean("events_user_id_present", this.f4068k);
            edit.putString("people_distinct_id", this.f4069l);
            edit.putString("anonymous_id", this.f4070m);
            edit.putBoolean("had_persisted_distinct_id", this.n);
            edit.apply();
        } catch (InterruptedException e10) {
            cb.e.D("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e10);
        } catch (ExecutionException e11) {
            cb.e.D("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e11.getCause());
        }
    }

    public final void p(String str) {
        try {
            SharedPreferences.Editor edit = this.d.get().edit();
            edit.putBoolean("opt_out_" + str, this.f4071o.booleanValue());
            edit.apply();
        } catch (InterruptedException e10) {
            cb.e.D("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e10);
        } catch (ExecutionException e11) {
            cb.e.D("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e11.getCause());
        }
    }
}
