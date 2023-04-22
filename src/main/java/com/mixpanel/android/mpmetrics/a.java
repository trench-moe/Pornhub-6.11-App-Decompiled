package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.mixpanel.android.mpmetrics.MPDbAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static final Map<Context, a> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final h f8205a = new h();

    /* renamed from: b  reason: collision with root package name */
    public final Context f8206b;

    /* renamed from: c  reason: collision with root package name */
    public final cd.c f8207c;

    /* renamed from: com.mixpanel.android.mpmetrics.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0108a extends d {

        /* renamed from: c  reason: collision with root package name */
        public final String f8208c;
        public final JSONObject d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f8209e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0108a(String str, JSONObject jSONObject, String str2) {
            super(str2, jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            this.f8208c = str;
            this.f8209e = false;
            this.d = jSONObject2;
        }

        public C0108a(String str, JSONObject jSONObject, String str2, boolean z10, JSONObject jSONObject2) {
            super(str2, jSONObject);
            this.f8208c = str;
            this.f8209e = z10;
            this.d = jSONObject2;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends d {
        public String toString() {
            return this.f8211b.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f8210a;

        public c(String str) {
            this.f8210a = str;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final JSONObject f8211b;

        public d(String str, JSONObject jSONObject) {
            super(str);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.get(next).toString();
                    } catch (AssertionError e10) {
                        jSONObject.remove(next);
                        cb.e.D("MixpanelAPI.Messages", "Removing people profile property from update (see https://github.com/mixpanel/mixpanel-android/issues/567)", e10);
                    } catch (JSONException unused) {
                    }
                }
            }
            this.f8211b = jSONObject;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public e(JSONObject jSONObject, String str) {
            super(str, jSONObject);
        }

        public String toString() {
            return this.f8211b.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class f extends c {

        /* renamed from: b  reason: collision with root package name */
        public final String f8212b;

        public f(String str, String str2) {
            super(str2);
            this.f8212b = str;
        }

        public String toString() {
            return this.f8212b;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends c {

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f8213b;

        public g(String str, Map<String, String> map) {
            super(str);
            this.f8213b = map;
        }
    }

    /* loaded from: classes.dex */
    public class h {

        /* renamed from: b  reason: collision with root package name */
        public Handler f8215b;

        /* renamed from: f  reason: collision with root package name */
        public cd.j f8218f;

        /* renamed from: a  reason: collision with root package name */
        public final Object f8214a = new Object();

        /* renamed from: c  reason: collision with root package name */
        public long f8216c = 0;
        public long d = 0;

        /* renamed from: e  reason: collision with root package name */
        public long f8217e = -1;

        /* renamed from: com.mixpanel.android.mpmetrics.a$h$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0109a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public MPDbAdapter f8220a;

            /* renamed from: b  reason: collision with root package name */
            public final DecideChecker f8221b;

            /* renamed from: c  reason: collision with root package name */
            public final long f8222c;
            public long d;

            /* renamed from: e  reason: collision with root package name */
            public long f8223e;

            /* renamed from: f  reason: collision with root package name */
            public int f8224f;

            public HandlerC0109a(Looper looper) {
                super(looper);
                this.f8220a = null;
                h.this.f8218f = cd.j.a(a.this.f8206b);
                a aVar = a.this;
                this.f8221b = new DecideChecker(aVar.f8206b, aVar.f8207c);
                this.f8222c = a.this.f8207c.f4033b;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(41:1|(1:3)|4|(1:6)|7|(1:9)|10|(1:12)(1:134)|13|(5:14|15|(2:17|(2:19|(2:21|(2:23|(1:25)(1:127))(1:128))(1:129))(1:130))(1:131)|26|28)|29|(1:31)|32|(1:34)|35|(1:37)|38|(1:40)|41|(1:43)(1:125)|(1:47)|48|(3:50|(1:123)|56)(1:124)|(1:58)|59|(16:61|(2:63|(1:65)(2:66|(16:68|(1:70)(1:120)|71|(1:75)|76|77|78|(8:82|(1:84)|85|(1:87)(2:98|(1:100)(1:101))|88|(3:90|(2:93|91)|94)|95|96)|103|(0)|85|(0)(0)|88|(0)|95|96)))|121|(0)|76|77|78|(9:80|82|(0)|85|(0)(0)|88|(0)|95|96)|103|(0)|85|(0)(0)|88|(0)|95|96)|122|121|(0)|76|77|78|(0)|103|(0)|85|(0)(0)|88|(0)|95|96) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0251  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0276 A[Catch: NoClassDefFoundError | SecurityException -> 0x0289, TryCatch #1 {NoClassDefFoundError | SecurityException -> 0x0289, blocks: (B:107:0x0260, B:109:0x0276, B:111:0x027d), top: B:135:0x0260 }] */
            /* JADX WARN: Removed duplicated region for block: B:116:0x028e  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x02ac  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x02b1  */
            /* JADX WARN: Removed duplicated region for block: B:126:0x02d9  */
            /* JADX WARN: Type inference failed for: r0v0, types: [org.json.JSONObject] */
            /* JADX WARN: Type inference failed for: r2v30 */
            /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Boolean] */
            /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Boolean] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:132:0x00b8). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final org.json.JSONObject a(com.mixpanel.android.mpmetrics.a.C0108a r12) {
                /*
                    Method dump skipped, instructions count: 818
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.a.h.HandlerC0109a.a(com.mixpanel.android.mpmetrics.a$a):org.json.JSONObject");
            }

            public final void b(MPDbAdapter mPDbAdapter, String str) {
                boolean z10;
                Objects.requireNonNull(a.this);
                a aVar = a.this;
                Context context = aVar.f8206b;
                synchronized (aVar.f8207c) {
                }
                if (com.mixpanel.android.util.a.f8329a) {
                    z10 = false;
                } else {
                    z10 = true;
                    try {
                        ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                        NetworkInfo networkInfo = null;
                        if (0 == 0) {
                            cb.e.h0("MixpanelAPI.Message", "A default network has not been set so we cannot be certain whether we are offline");
                        } else {
                            boolean isConnectedOrConnecting = networkInfo.isConnectedOrConnecting();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("ConnectivityManager says we ");
                            sb2.append(isConnectedOrConnecting ? "are" : "are not");
                            sb2.append(" online");
                            cb.e.h0("MixpanelAPI.Message", sb2.toString());
                            z10 = isConnectedOrConnecting;
                        }
                    } catch (SecurityException unused) {
                        cb.e.h0("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
                    }
                }
                if (!z10) {
                    a.a(a.this, "Not flushing data to Mixpanel because the device is not connected to the internet.");
                    return;
                }
                c(mPDbAdapter, str, MPDbAdapter.Table.EVENTS, a.this.f8207c.f4043m);
                c(mPDbAdapter, str, MPDbAdapter.Table.PEOPLE, a.this.f8207c.n);
                c(mPDbAdapter, str, MPDbAdapter.Table.GROUPS, a.this.f8207c.f4044o);
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x02e8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0228  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void c(com.mixpanel.android.mpmetrics.MPDbAdapter r27, java.lang.String r28, com.mixpanel.android.mpmetrics.MPDbAdapter.Table r29, java.lang.String r30) {
                /*
                    Method dump skipped, instructions count: 830
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.a.h.HandlerC0109a.c(com.mixpanel.android.mpmetrics.MPDbAdapter, java.lang.String, com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:103:0x0370  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x03f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x032f  */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void handleMessage(android.os.Message r15) {
                /*
                    Method dump skipped, instructions count: 1051
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.a.h.HandlerC0109a.handleMessage(android.os.Message):void");
            }
        }

        public h() {
            HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
            handlerThread.start();
            this.f8215b = new HandlerC0109a(handlerThread.getLooper());
        }

        public static void a(h hVar) {
            Objects.requireNonNull(hVar);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = hVar.f8216c;
            long j11 = 1 + j10;
            long j12 = hVar.f8217e;
            if (j12 > 0) {
                long j13 = ((hVar.d * j10) + (currentTimeMillis - j12)) / j11;
                hVar.d = j13;
                a aVar = a.this;
                a.a(aVar, "Average send frequency approximately " + (j13 / 1000) + " seconds.");
            }
            hVar.f8217e = currentTimeMillis;
            hVar.f8216c = j11;
        }

        public void b(Message message) {
            synchronized (this.f8214a) {
                Handler handler = this.f8215b;
                if (handler == null) {
                    a aVar = a.this;
                    a.a(aVar, "Dead mixpanel worker dropping a message: " + message.what);
                } else {
                    handler.sendMessage(message);
                }
            }
        }
    }

    public a(Context context) {
        this.f8206b = context;
        this.f8207c = cd.c.b(context);
        new Thread(new ed.c(new com.mixpanel.android.util.a())).start();
    }

    public static void a(a aVar, String str) {
        Objects.requireNonNull(aVar);
        cb.e.h0("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")");
    }

    public static void b(a aVar, String str, Throwable th) {
        Objects.requireNonNull(aVar);
        cb.e.i0("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")", th);
    }
}
