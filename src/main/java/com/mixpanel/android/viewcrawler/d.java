package com.mixpanel.android.viewcrawler;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import cd.h;
import cd.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mixpanel.android.mpmetrics.k;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.viewcrawler.EditProtocol;
import com.mixpanel.android.viewcrawler.EditorConnection;
import com.mixpanel.android.viewcrawler.b;
import com.mixpanel.android.viewcrawler.e;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(16)
/* loaded from: classes.dex */
public class d implements fd.e, fd.d, e.j {

    /* renamed from: a  reason: collision with root package name */
    public final cd.c f8361a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8362b;

    /* renamed from: c  reason: collision with root package name */
    public final k f8363c;
    public final com.mixpanel.android.viewcrawler.a d;

    /* renamed from: f  reason: collision with root package name */
    public final cd.k f8365f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, String> f8366g;

    /* renamed from: h  reason: collision with root package name */
    public final g f8367h;

    /* renamed from: e  reason: collision with root package name */
    public final fd.b f8364e = new fd.b();

    /* renamed from: i  reason: collision with root package name */
    public final float f8368i = Resources.getSystem().getDisplayMetrics().scaledDensity;

    /* renamed from: j  reason: collision with root package name */
    public final Set<cd.d> f8369j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* loaded from: classes.dex */
    public class a {
        public a(d dVar) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements EditorConnection.b {
        public b(a aVar) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public volatile boolean f8371c = true;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f8371c) {
                d.this.f8367h.sendMessage(d.this.f8367h.obtainMessage(1));
            }
            d.this.f8367h.postDelayed(this, 30000L);
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0113d implements Application.ActivityLifecycleCallbacks, b.a {

        /* renamed from: c  reason: collision with root package name */
        public final com.mixpanel.android.viewcrawler.b f8373c = new com.mixpanel.android.viewcrawler.b(this);

        /* renamed from: f  reason: collision with root package name */
        public final c f8374f;

        public C0113d() {
            this.f8374f = new c();
        }

        public final boolean a() {
            String str = Build.HARDWARE;
            if (str.toLowerCase().equals("goldfish") || str.toLowerCase().equals("ranchu")) {
                String str2 = Build.BRAND;
                return (str2.toLowerCase().startsWith("generic") || str2.toLowerCase().equals("android") || str2.toLowerCase().equals("google")) && Build.DEVICE.toLowerCase().startsWith("generic") && Build.PRODUCT.toLowerCase().contains("sdk") && Build.MODEL.toLowerCase(Locale.US).contains("sdk");
            }
            return false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            fd.b bVar = d.this.f8364e;
            Objects.requireNonNull(bVar);
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new RuntimeException("Can't remove an activity when not on the UI thread");
            }
            ((Set) bVar.f8949c).remove(activity);
            if (!a() || d.this.f8361a.f4038h) {
                if (!d.this.f8361a.f4037g) {
                    ((SensorManager) activity.getSystemService("sensor")).unregisterListener(this.f8373c);
                }
                return;
            }
            c cVar = this.f8374f;
            cVar.f8371c = true;
            d.this.f8367h.removeCallbacks(cVar);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (a() && !d.this.f8361a.f4038h) {
                c cVar = this.f8374f;
                cVar.f8371c = false;
                d.this.f8367h.post(cVar);
            } else if (!d.this.f8361a.f4037g) {
                SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
                sensorManager.registerListener(this.f8373c, sensorManager.getDefaultSensor(1), 3);
            }
            fd.b bVar = d.this.f8364e;
            Objects.requireNonNull(bVar);
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new RuntimeException("Can't add an activity when not on the UI thread");
            }
            ((Set) bVar.f8949c).add(activity);
            bVar.g();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f8376a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8377b;

        /* renamed from: c  reason: collision with root package name */
        public final JSONObject f8378c;
        public final ed.e<Integer, Integer> d;

        public e(String str, String str2, JSONObject jSONObject, ed.e<Integer, Integer> eVar) {
            this.f8376a = str;
            this.f8377b = str2;
            this.f8378c = jSONObject;
            this.d = eVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && obj.hashCode() == hashCode();
        }

        public int hashCode() {
            return this.f8376a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final String f8379a;

        /* renamed from: b  reason: collision with root package name */
        public final JSONObject f8380b;

        /* renamed from: c  reason: collision with root package name */
        public final ed.e<Integer, Integer> f8381c;

        public f(String str, JSONObject jSONObject, ed.e<Integer, Integer> eVar) {
            this.f8379a = str;
            this.f8380b = jSONObject;
            this.f8381c = eVar;
        }

        public boolean equals(Object obj) {
            boolean z10 = false;
            if ((obj instanceof f) && obj.hashCode() == hashCode()) {
                z10 = true;
            }
            return z10;
        }

        public int hashCode() {
            return this.f8379a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public EditorConnection f8382a;

        /* renamed from: b  reason: collision with root package name */
        public fd.f f8383b;

        /* renamed from: c  reason: collision with root package name */
        public final String f8384c;
        public final Lock d;

        /* renamed from: e  reason: collision with root package name */
        public final EditProtocol f8385e;

        /* renamed from: f  reason: collision with root package name */
        public final ImageStore f8386f;

        /* renamed from: g  reason: collision with root package name */
        public final Map<String, ed.e<String, JSONObject>> f8387g;

        /* renamed from: h  reason: collision with root package name */
        public final Map<String, ed.e<String, Object>> f8388h;

        /* renamed from: i  reason: collision with root package name */
        public final List<String> f8389i;

        /* renamed from: j  reason: collision with root package name */
        public final Map<String, ed.e<String, JSONObject>> f8390j;

        /* renamed from: k  reason: collision with root package name */
        public final Set<e> f8391k;

        /* renamed from: l  reason: collision with root package name */
        public final Set<f> f8392l;

        /* renamed from: m  reason: collision with root package name */
        public final Set<ed.e<Integer, Integer>> f8393m;
        public final Set<ed.e<String, JSONObject>> n;

        /* renamed from: o  reason: collision with root package name */
        public final Set<ed.e<String, JSONObject>> f8394o;

        /* renamed from: p  reason: collision with root package name */
        public final Set<ed.e<Integer, Integer>> f8395p;

        public g(Context context, String str, Looper looper, e.j jVar) {
            super(looper);
            this.f8384c = str;
            this.f8383b = null;
            String str2 = d.this.f8361a.f4048s;
            h.a aVar = new h.a(str2 == null ? context.getPackageName() : str2, context);
            ImageStore imageStore = new ImageStore(context, "ViewCrawler");
            this.f8386f = imageStore;
            this.f8385e = new EditProtocol(context, aVar, imageStore, jVar);
            this.f8394o = new HashSet();
            this.f8387g = new HashMap();
            this.f8388h = new HashMap();
            this.f8389i = new ArrayList();
            this.f8390j = new HashMap();
            this.f8391k = new HashSet();
            this.f8392l = new HashSet();
            this.f8393m = new HashSet();
            this.n = new HashSet();
            this.f8395p = new HashSet();
            ReentrantLock reentrantLock = new ReentrantLock();
            this.d = reentrantLock;
            reentrantLock.lock();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public final void a() {
            /*
                Method dump skipped, instructions count: 1224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.viewcrawler.d.g.a():void");
        }

        public final void b() {
            cb.e.h0("MixpanelAPI.ViewCrawler", "connecting to editor");
            EditorConnection editorConnection = this.f8382a;
            if (editorConnection != null && editorConnection.c()) {
                cb.e.h0("MixpanelAPI.ViewCrawler", "There is already a valid connection to an events editor.");
                return;
            }
            SSLSocketFactory c10 = d.this.f8361a.c();
            if (c10 == null) {
                cb.e.h0("MixpanelAPI.ViewCrawler", "SSL is not available on this device, no connection will be attempted to the events editor.");
                return;
            }
            String str = cd.c.b(d.this.f8362b).f4047r + this.f8384c;
            try {
                this.f8382a = new EditorConnection(new URI(str), new b(null), c10.createSocket());
            } catch (EditorConnection.EditorConnectionException e10) {
                cb.e.D("MixpanelAPI.ViewCrawler", "Error connecting to URI " + str, e10);
            } catch (IOException e11) {
                cb.e.N("MixpanelAPI.ViewCrawler", "Can't create SSL Socket to connect to editor service", e11);
            } catch (URISyntaxException e12) {
                cb.e.D("MixpanelAPI.ViewCrawler", "Error parsing URI " + str + " for editor websocket", e12);
            }
        }

        public final SharedPreferences c() {
            StringBuilder m10 = a1.a.m("mixpanel.viewcrawler.changes");
            m10.append(this.f8384c);
            return d.this.f8362b.getSharedPreferences(m10.toString(), 0);
        }

        public final void d(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("events");
                int length = jSONArray.length();
                this.f8390j.clear();
                if (!this.n.isEmpty() && this.f8394o.isEmpty()) {
                    this.f8394o.addAll(this.n);
                    for (ed.e<String, JSONObject> eVar : this.n) {
                        try {
                            this.f8390j.put(((JSONObject) ((Pair) eVar).second).get("path").toString(), eVar);
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                    this.n.clear();
                }
                for (int i10 = 0; i10 < length; i10++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        this.f8390j.put(jSONObject2.get("path").toString(), new ed.e<>(cb.e.Y(jSONObject2, "target_activity"), jSONObject2));
                    } catch (JSONException e11) {
                        StringBuilder m10 = a1.a.m("Bad event binding received from editor in ");
                        m10.append(jSONArray.toString());
                        cb.e.D("MixpanelAPI.ViewCrawler", m10.toString(), e11);
                    }
                }
                a();
            } catch (JSONException e12) {
                cb.e.D("MixpanelAPI.ViewCrawler", "Bad event bindings received", e12);
            }
        }

        public final void e(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("actions");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    String Y = cb.e.Y(jSONObject2, "target_activity");
                    this.f8387g.put(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), new ed.e<>(Y, jSONObject2));
                }
                a();
            } catch (JSONException e10) {
                cb.e.D("MixpanelAPI.ViewCrawler", "Bad change request received", e10);
            }
        }

        public final void f() {
            this.f8387g.clear();
            this.f8390j.clear();
            this.f8388h.clear();
            this.n.addAll(this.f8394o);
            this.f8394o.clear();
            this.f8383b = null;
            cb.e.h0("MixpanelAPI.ViewCrawler", "Editor closed- freeing snapshot");
            a();
            for (String str : this.f8389i) {
                File c10 = this.f8386f.c(str);
                if (c10 != null) {
                    c10.delete();
                    synchronized (ImageStore.f8325e) {
                        ImageStore.f8325e.remove(str);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("tweaks");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    ed.e<String, Object> h10 = this.f8385e.h(jSONArray.getJSONObject(i10));
                    this.f8388h.put(((Pair) h10).first, h10);
                }
            } catch (EditProtocol.BadInstructionsException e10) {
                cb.e.D("MixpanelAPI.ViewCrawler", "Bad tweaks received", e10);
            } catch (JSONException e11) {
                cb.e.D("MixpanelAPI.ViewCrawler", "Bad tweaks received", e11);
            }
            a();
        }

        public final void h(String str) {
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    this.n.clear();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        this.n.add(new ed.e<>(cb.e.Y(jSONObject, "target_activity"), jSONObject));
                    }
                } catch (JSONException e10) {
                    cb.e.N("MixpanelAPI.ViewCrawler", "JSON error when loading event bindings, clearing persistent memory", e10);
                    SharedPreferences.Editor edit = c().edit();
                    edit.remove("mixpanel.viewcrawler.bindings");
                    edit.apply();
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.d.lock();
            try {
                switch (message.what) {
                    case 0:
                        i();
                        break;
                    case 1:
                        b();
                        break;
                    case 2:
                        o((JSONObject) message.obj);
                        break;
                    case 3:
                        e((JSONObject) message.obj);
                        break;
                    case 4:
                        k();
                        break;
                    case 5:
                        JSONArray jSONArray = (JSONArray) message.obj;
                        SharedPreferences.Editor edit = c().edit();
                        edit.putString("mixpanel.viewcrawler.bindings", jSONArray.toString());
                        edit.apply();
                        h(jSONArray.toString());
                        a();
                        break;
                    case 6:
                        d((JSONObject) message.obj);
                        break;
                    case 7:
                        n((String) message.obj);
                        break;
                    case 8:
                        f();
                        break;
                    case 9:
                        JSONArray jSONArray2 = (JSONArray) message.obj;
                        SharedPreferences.Editor edit2 = c().edit();
                        edit2.putString("mixpanel.viewcrawler.changes", jSONArray2.toString());
                        edit2.apply();
                        j(jSONArray2.toString(), true);
                        a();
                        break;
                    case 10:
                        try {
                            JSONArray jSONArray3 = ((JSONObject) message.obj).getJSONObject("payload").getJSONArray("actions");
                            for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                                this.f8387g.remove(jSONArray3.getString(i10));
                            }
                        } catch (JSONException e10) {
                            cb.e.D("MixpanelAPI.ViewCrawler", "Bad clear request received", e10);
                        }
                        a();
                        break;
                    case 11:
                        g((JSONObject) message.obj);
                        break;
                    case 12:
                        m((e.f) message.obj);
                        break;
                    case 13:
                        SharedPreferences.Editor edit3 = c().edit();
                        edit3.putString("mixpanel.viewcrawler.changes", ((JSONArray) message.obj).toString());
                        edit3.apply();
                        break;
                }
                this.d.unlock();
            } catch (Throwable th) {
                this.d.unlock();
                throw th;
            }
        }

        public final void i() {
            SharedPreferences c10 = c();
            String string = c10.getString("mixpanel.viewcrawler.changes", null);
            String string2 = c10.getString("mixpanel.viewcrawler.bindings", null);
            this.f8391k.clear();
            this.f8392l.clear();
            this.f8395p.clear();
            j(string, false);
            this.n.clear();
            h(string2);
            a();
        }

        public final void j(String str, boolean z10) {
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        ed.e<Integer, Integer> eVar = new ed.e<>(Integer.valueOf(jSONObject.getInt("experiment_id")), Integer.valueOf(jSONObject.getInt("id")));
                        JSONArray jSONArray2 = jSONObject.getJSONArray("actions");
                        int length2 = jSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                            this.f8391k.add(new e(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), cb.e.Y(jSONObject2, "target_activity"), jSONObject2, eVar));
                        }
                        JSONArray jSONArray3 = jSONObject.getJSONArray("tweaks");
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            JSONObject jSONObject3 = jSONArray3.getJSONObject(i12);
                            this.f8392l.add(new f(jSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), jSONObject3, eVar));
                        }
                        if (!z10) {
                            this.f8395p.add(eVar);
                        }
                        if (length3 == 0 && length2 == 0) {
                            this.f8393m.add(eVar);
                        }
                    }
                } catch (JSONException e10) {
                    cb.e.N("MixpanelAPI.ViewCrawler", "JSON error when loading ab tests / tweaks, clearing persistent memory", e10);
                    SharedPreferences.Editor edit = c().edit();
                    edit.remove("mixpanel.viewcrawler.changes");
                    edit.apply();
                }
            }
        }

        public final void k() {
            HashMap hashMap;
            String str;
            EditorConnection editorConnection = this.f8382a;
            if (editorConnection != null && editorConnection.c() && this.f8382a.b()) {
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(this.f8382a.a()));
                try {
                    try {
                        jsonWriter.beginObject();
                        jsonWriter.name("type").value("device_info_response");
                        jsonWriter.name("payload").beginObject();
                        jsonWriter.name("device_type").value("Android");
                        jsonWriter.name("device_name").value(Build.BRAND + "/" + Build.MODEL);
                        jsonWriter.name("scaled_density").value((double) d.this.f8368i);
                        for (Map.Entry<String, String> entry : d.this.f8366g.entrySet()) {
                            jsonWriter.name(entry.getKey()).value(entry.getValue());
                        }
                        cd.k kVar = d.this.f8365f;
                        synchronized (kVar) {
                            try {
                                hashMap = new HashMap(kVar.f4088a);
                            } finally {
                            }
                        }
                        jsonWriter.name("tweaks").beginArray();
                        for (Map.Entry entry2 : hashMap.entrySet()) {
                            k.a aVar = (k.a) entry2.getValue();
                            jsonWriter.beginObject();
                            jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value((String) entry2.getKey());
                            jsonWriter.name("minimum").value(aVar.d);
                            jsonWriter.name("maximum").value(aVar.f4094e);
                            int i10 = aVar.f4091a;
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    jsonWriter.name("type").value("number");
                                    jsonWriter.name("encoding").value("d");
                                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(aVar.b().doubleValue());
                                    jsonWriter.name("default").value(((Number) aVar.f4093c).doubleValue());
                                } else if (i10 == 3) {
                                    jsonWriter.name("type").value("number");
                                    jsonWriter.name("encoding").value("l");
                                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(aVar.b().longValue());
                                    jsonWriter.name("default").value(((Number) aVar.f4093c).longValue());
                                } else if (i10 != 4) {
                                    String str2 = "Unrecognized Tweak Type " + aVar.f4091a + " encountered.";
                                    if (cb.e.b0(6)) {
                                        Log.wtf("MixpanelAPI.ViewCrawler", str2);
                                    }
                                } else {
                                    jsonWriter.name("type").value("string");
                                    JsonWriter name = jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                    try {
                                        str = (String) aVar.f4093c;
                                    } catch (ClassCastException unused) {
                                        str = null;
                                    }
                                    try {
                                        str = (String) aVar.f4092b;
                                    } catch (ClassCastException unused2) {
                                    }
                                    name.value(str);
                                    jsonWriter.name("default").value((String) aVar.f4093c);
                                }
                                jsonWriter.endObject();
                            } else {
                                jsonWriter.name("type").value("boolean");
                                JsonWriter name2 = jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                Boolean bool = Boolean.FALSE;
                                Object obj = aVar.f4093c;
                                if (obj != null) {
                                    try {
                                        bool = (Boolean) obj;
                                    } catch (ClassCastException unused3) {
                                    }
                                }
                                Object obj2 = aVar.f4092b;
                                if (obj2 != null) {
                                    try {
                                        bool = (Boolean) obj2;
                                    } catch (ClassCastException unused4) {
                                    }
                                }
                                name2.value(bool.booleanValue());
                                jsonWriter.name("default").value(((Boolean) aVar.f4093c).booleanValue());
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                        jsonWriter.endObject();
                        jsonWriter.endObject();
                    } catch (IOException e10) {
                        cb.e.D("MixpanelAPI.ViewCrawler", "Can't write device_info to server", e10);
                    }
                    try {
                        jsonWriter.close();
                    } catch (IOException e11) {
                        cb.e.D("MixpanelAPI.ViewCrawler", "Can't close websocket writer", e11);
                    }
                } catch (Throwable th) {
                    try {
                        jsonWriter.close();
                    } catch (IOException e12) {
                        cb.e.D("MixpanelAPI.ViewCrawler", "Can't close websocket writer", e12);
                    }
                    throw th;
                }
            }
        }

        public final void l(String str) {
            EditorConnection editorConnection = this.f8382a;
            if (editorConnection != null && editorConnection.c() && this.f8382a.b()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_message", str);
                } catch (JSONException e10) {
                    cb.e.D("MixpanelAPI.ViewCrawler", "Apparently impossible JSONException", e10);
                }
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f8382a.a());
                try {
                    try {
                        try {
                            outputStreamWriter.write("{\"type\": \"error\", ");
                            outputStreamWriter.write("\"payload\": ");
                            outputStreamWriter.write(jSONObject.toString());
                            outputStreamWriter.write("}");
                            outputStreamWriter.close();
                        } catch (IOException e11) {
                            cb.e.D("MixpanelAPI.ViewCrawler", "Can't write error message to editor", e11);
                            outputStreamWriter.close();
                        }
                    } catch (Throwable th) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e12) {
                            cb.e.D("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", e12);
                        }
                        throw th;
                    }
                } catch (IOException e13) {
                    cb.e.D("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", e13);
                }
            }
        }

        public final void m(e.f fVar) {
            EditorConnection editorConnection = this.f8382a;
            if (editorConnection != null && editorConnection.c() && this.f8382a.b()) {
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(this.f8382a.a()));
                try {
                    try {
                        try {
                            jsonWriter.beginObject();
                            jsonWriter.name("type").value("layout_error");
                            jsonWriter.name("exception_type").value(fVar.f8408a);
                            jsonWriter.name("cid").value(fVar.f8409b);
                            jsonWriter.endObject();
                            jsonWriter.close();
                        } catch (IOException e10) {
                            cb.e.D("MixpanelAPI.ViewCrawler", "Can't write track_message to server", e10);
                            jsonWriter.close();
                        }
                    } catch (Throwable th) {
                        try {
                            jsonWriter.close();
                        } catch (IOException e11) {
                            cb.e.D("MixpanelAPI.ViewCrawler", "Can't close writer.", e11);
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    cb.e.D("MixpanelAPI.ViewCrawler", "Can't close writer.", e12);
                }
            }
        }

        public final void n(String str) {
            EditorConnection editorConnection = this.f8382a;
            if (editorConnection == null || !editorConnection.c()) {
                return;
            }
            if (this.f8382a.b()) {
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(this.f8382a.a()));
                try {
                    try {
                        try {
                            jsonWriter.beginObject();
                            jsonWriter.name("type").value("track_message");
                            jsonWriter.name("payload");
                            jsonWriter.beginObject();
                            jsonWriter.name("event_name").value(str);
                            jsonWriter.endObject();
                            jsonWriter.endObject();
                            jsonWriter.flush();
                            jsonWriter.close();
                        } catch (IOException e10) {
                            cb.e.D("MixpanelAPI.ViewCrawler", "Can't write track_message to server", e10);
                            jsonWriter.close();
                        }
                    } catch (Throwable th) {
                        try {
                            jsonWriter.close();
                        } catch (IOException e11) {
                            cb.e.D("MixpanelAPI.ViewCrawler", "Can't close writer.", e11);
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    cb.e.D("MixpanelAPI.ViewCrawler", "Can't close writer.", e12);
                }
            }
        }

        public final void o(JSONObject jSONObject) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                if (jSONObject2.has("config")) {
                    this.f8383b = this.f8385e.g(jSONObject2);
                    cb.e.h0("MixpanelAPI.ViewCrawler", "Initializing snapshot with configuration");
                }
                if (this.f8383b == null) {
                    l("No snapshot configuration (or a malformed snapshot configuration) was sent.");
                    cb.e.j0("MixpanelAPI.ViewCrawler", "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration.");
                    return;
                }
                BufferedOutputStream a10 = this.f8382a.a();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(a10);
                try {
                    try {
                        try {
                            outputStreamWriter.write("{");
                            outputStreamWriter.write("\"type\": \"snapshot_response\",");
                            outputStreamWriter.write("\"payload\": {");
                            outputStreamWriter.write("\"activities\":");
                            outputStreamWriter.flush();
                            this.f8383b.b(d.this.f8364e, a10);
                            outputStreamWriter.write(",\"snapshot_time_millis\": ");
                            outputStreamWriter.write(Long.toString(System.currentTimeMillis() - currentTimeMillis));
                            outputStreamWriter.write("}");
                            outputStreamWriter.write("}");
                            outputStreamWriter.close();
                        } catch (IOException e10) {
                            cb.e.D("MixpanelAPI.ViewCrawler", "Can't write snapshot request to server", e10);
                            outputStreamWriter.close();
                        }
                    } catch (Throwable th) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e11) {
                            cb.e.D("MixpanelAPI.ViewCrawler", "Can't close writer.", e11);
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    cb.e.D("MixpanelAPI.ViewCrawler", "Can't close writer.", e12);
                }
            } catch (EditProtocol.BadInstructionsException e13) {
                cb.e.D("MixpanelAPI.ViewCrawler", "Editor sent malformed message with snapshot request", e13);
                l(e13.getMessage());
            } catch (JSONException e14) {
                cb.e.D("MixpanelAPI.ViewCrawler", "Payload with snapshot config required with snapshot request", e14);
                l("Payload with snapshot config required with snapshot request");
            }
        }
    }

    public d(Context context, String str, com.mixpanel.android.mpmetrics.k kVar, cd.k kVar2) {
        this.f8361a = cd.c.b(context);
        this.f8362b = context;
        this.f8365f = kVar2;
        this.f8366g = kVar.f8283k;
        HandlerThread handlerThread = new HandlerThread(d.class.getCanonicalName());
        handlerThread.setPriority(10);
        handlerThread.start();
        g gVar = new g(context, str, handlerThread.getLooper(), this);
        this.f8367h = gVar;
        this.d = new com.mixpanel.android.viewcrawler.a(kVar, gVar);
        this.f8363c = kVar;
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0113d());
        a aVar = new a(this);
        synchronized (kVar2) {
            kVar2.d.add(aVar);
        }
    }

    @Override // fd.d
    public void a(String str) {
        Message obtainMessage = this.f8367h.obtainMessage();
        obtainMessage.what = 7;
        obtainMessage.obj = str;
        this.f8367h.sendMessage(obtainMessage);
    }

    @Override // fd.e
    public void b(JSONArray jSONArray) {
        if (jSONArray != null) {
            Message obtainMessage = this.f8367h.obtainMessage(5);
            obtainMessage.obj = jSONArray;
            this.f8367h.sendMessage(obtainMessage);
        }
    }

    @Override // fd.e
    public void c(JSONArray jSONArray) {
        if (jSONArray != null) {
            Message obtainMessage = this.f8367h.obtainMessage(13);
            obtainMessage.obj = jSONArray;
            this.f8367h.sendMessage(obtainMessage);
        }
    }

    @Override // fd.e
    public void d() {
        this.f8367h.d.unlock();
        g gVar = this.f8367h;
        gVar.sendMessage(gVar.obtainMessage(0));
    }

    @Override // fd.e
    public void e() {
        g gVar = this.f8367h;
        gVar.sendMessage(gVar.obtainMessage(0));
    }

    @Override // fd.e
    public void f(JSONArray jSONArray) {
        if (jSONArray != null) {
            Message obtainMessage = this.f8367h.obtainMessage(9);
            obtainMessage.obj = jSONArray;
            this.f8367h.sendMessage(obtainMessage);
        }
    }
}
