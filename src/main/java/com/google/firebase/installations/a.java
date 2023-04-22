package com.google.firebase.installations;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.emoji2.text.l;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;
import com.google.firebase.installations.local.b;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.b;
import ea.h;
import ea.j;
import h9.o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import mb.c;
import nc.b;
import nc.d;
import nc.e;
import nc.f;
import org.json.JSONException;
import org.json.JSONObject;
import sc.g;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f8049m = new Object();
    public static final ThreadFactory n = new ThreadFactoryC0102a();

    /* renamed from: a  reason: collision with root package name */
    public final c f8050a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.firebase.installations.remote.c f8051b;

    /* renamed from: c  reason: collision with root package name */
    public final PersistedInstallation f8052c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final pc.a f8053e;

    /* renamed from: f  reason: collision with root package name */
    public final d f8054f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f8055g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f8056h;

    /* renamed from: i  reason: collision with root package name */
    public final ExecutorService f8057i;

    /* renamed from: j  reason: collision with root package name */
    public String f8058j;

    /* renamed from: k  reason: collision with root package name */
    public Set<oc.a> f8059k;

    /* renamed from: l  reason: collision with root package name */
    public final List<e> f8060l;

    /* renamed from: com.google.firebase.installations.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0102a implements ThreadFactory {

        /* renamed from: c  reason: collision with root package name */
        public final AtomicInteger f8061c = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f8061c.getAndIncrement())));
        }
    }

    public a(c cVar, mc.b<g> bVar, mc.b<HeartBeatInfo> bVar2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        cVar.a();
        com.google.firebase.installations.remote.c cVar2 = new com.google.firebase.installations.remote.c(cVar.f13066a, bVar, bVar2);
        PersistedInstallation persistedInstallation = new PersistedInstallation(cVar);
        f c10 = f.c();
        pc.a aVar = new pc.a(cVar);
        d dVar = new d();
        this.f8055g = new Object();
        this.f8059k = new HashSet();
        this.f8060l = new ArrayList();
        this.f8050a = cVar;
        this.f8051b = cVar2;
        this.f8052c = persistedInstallation;
        this.d = c10;
        this.f8053e = aVar;
        this.f8054f = dVar;
        this.f8056h = threadPoolExecutor;
        this.f8057i = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    public static a e() {
        c b10 = c.b();
        b10.a();
        return (a) b10.d.a(b.class);
    }

    @Override // nc.b
    public ea.g<String> a() {
        String str;
        o.f(d(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.f(f(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.f(c(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String d = d();
        Pattern pattern = f.f13425c;
        o.b(d.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(f.f13425c.matcher(c()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        synchronized (this) {
            try {
                str = this.f8058j;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            return j.d(str);
        }
        h hVar = new h();
        nc.c cVar = new nc.c(hVar);
        synchronized (this.f8055g) {
            this.f8060l.add(cVar);
        }
        ea.g gVar = hVar.f9273a;
        this.f8056h.execute(new l(this, 6));
        return gVar;
    }

    public final com.google.firebase.installations.local.b b(com.google.firebase.installations.local.b bVar) {
        int responseCode;
        TokenResult f10;
        FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.UNAVAILABLE;
        com.google.firebase.installations.remote.c cVar = this.f8051b;
        String c10 = c();
        com.google.firebase.installations.local.a aVar = (com.google.firebase.installations.local.a) bVar;
        String str = aVar.f8069b;
        String f11 = f();
        String str2 = aVar.f8071e;
        if (cVar.d.a()) {
            URL a10 = cVar.a(String.format("projects/%s/installations/%s/authTokens:generate", f11, str));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c11 = cVar.c(a10, c10);
                try {
                    c11.setRequestMethod("POST");
                    c11.addRequestProperty("Authorization", "FIS_v2 " + str2);
                    c11.setDoOutput(true);
                    cVar.h(c11);
                    responseCode = c11.getResponseCode();
                    cVar.d.b(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c11.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    f10 = cVar.f(c11);
                } else {
                    com.google.firebase.installations.remote.c.b(c11, null, c10, f11);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            b.C0105b c0105b = (b.C0105b) TokenResult.a();
                            c0105b.f8098c = TokenResult.ResponseCode.BAD_CONFIG;
                            f10 = c0105b.a();
                        } else {
                            c11.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    b.C0105b c0105b2 = (b.C0105b) TokenResult.a();
                    c0105b2.f8098c = TokenResult.ResponseCode.AUTH_ERROR;
                    f10 = c0105b2.a();
                }
                c11.disconnect();
                TrafficStats.clearThreadStatsTag();
                com.google.firebase.installations.remote.b bVar2 = (com.google.firebase.installations.remote.b) f10;
                int ordinal = bVar2.f8095c.ordinal();
                if (ordinal == 0) {
                    String str3 = bVar2.f8093a;
                    long j10 = bVar2.f8094b;
                    long b10 = this.d.b();
                    a.b bVar3 = (a.b) bVar.j();
                    bVar3.f8077c = str3;
                    bVar3.f8078e = Long.valueOf(j10);
                    bVar3.f8079f = Long.valueOf(b10);
                    return bVar3.a();
                } else if (ordinal == 1) {
                    a.b bVar4 = (a.b) bVar.j();
                    bVar4.f8080g = "BAD CONFIG";
                    bVar4.b(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
                    return bVar4.a();
                } else if (ordinal == 2) {
                    synchronized (this) {
                        this.f8058j = null;
                    }
                    b.a j11 = bVar.j();
                    j11.b(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
                    return j11.a();
                } else {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
    }

    public String c() {
        c cVar = this.f8050a;
        cVar.a();
        return cVar.f13068c.f13077a;
    }

    public String d() {
        c cVar = this.f8050a;
        cVar.a();
        return cVar.f13068c.f13078b;
    }

    public String f() {
        c cVar = this.f8050a;
        cVar.a();
        return cVar.f13068c.f13082g;
    }

    public final String g(com.google.firebase.installations.local.b bVar) {
        String string;
        c cVar = this.f8050a;
        cVar.a();
        if (!cVar.f13067b.equals("CHIME_ANDROID_SDK")) {
            if (this.f8050a.g()) {
            }
            return this.f8054f.a();
        }
        if (((com.google.firebase.installations.local.a) bVar).f8070c == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            pc.a aVar = this.f8053e;
            synchronized (aVar.f13897a) {
                synchronized (aVar.f13897a) {
                    string = aVar.f13897a.getString("|S|id", null);
                }
                if (string == null) {
                    string = aVar.a();
                }
            }
            if (TextUtils.isEmpty(string)) {
                string = this.f8054f.a();
            }
            return string;
        }
        return this.f8054f.a();
    }

    public final com.google.firebase.installations.local.b h(com.google.firebase.installations.local.b bVar) {
        int responseCode;
        InstallationResponse e10;
        FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.UNAVAILABLE;
        com.google.firebase.installations.local.a aVar = (com.google.firebase.installations.local.a) bVar;
        String str = aVar.f8069b;
        String str2 = null;
        if (str != null && str.length() == 11) {
            pc.a aVar2 = this.f8053e;
            synchronized (aVar2.f13897a) {
                String[] strArr = pc.a.f13896c;
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    String str3 = strArr[i10];
                    String str4 = aVar2.f13898b;
                    String string = aVar2.f13897a.getString("|T|" + str4 + "|" + str3, null);
                    if (string == null || string.isEmpty()) {
                        i10++;
                    } else if (string.startsWith("{")) {
                        try {
                            str2 = new JSONObject(string).getString("token");
                        } catch (JSONException unused) {
                        }
                    } else {
                        str2 = string;
                    }
                }
            }
        }
        com.google.firebase.installations.remote.c cVar = this.f8051b;
        String c10 = c();
        String str5 = aVar.f8069b;
        String f10 = f();
        String d = d();
        if (cVar.d.a()) {
            URL a10 = cVar.a(String.format("projects/%s/installations", f10));
            for (int i11 = 0; i11 <= 1; i11++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c11 = cVar.c(a10, c10);
                try {
                    c11.setRequestMethod("POST");
                    c11.setDoOutput(true);
                    if (str2 != null) {
                        c11.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    cVar.g(c11, str5, d);
                    responseCode = c11.getResponseCode();
                    cVar.d.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                } catch (Throwable th) {
                    c11.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    e10 = cVar.e(c11);
                    c11.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    com.google.firebase.installations.remote.c.b(c11, d, c10, f10);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        com.google.firebase.installations.remote.a aVar3 = new com.google.firebase.installations.remote.a(null, null, null, null, InstallationResponse.ResponseCode.BAD_CONFIG, null);
                        c11.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        e10 = aVar3;
                    } else {
                        c11.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                com.google.firebase.installations.remote.a aVar4 = (com.google.firebase.installations.remote.a) e10;
                int ordinal = aVar4.f8092e.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        a.b bVar2 = (a.b) bVar.j();
                        bVar2.f8080g = "BAD CONFIG";
                        bVar2.b(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
                        return bVar2.a();
                    }
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
                }
                String str6 = aVar4.f8090b;
                String str7 = aVar4.f8091c;
                long b10 = this.d.b();
                String c12 = aVar4.d.c();
                long d10 = aVar4.d.d();
                a.b bVar3 = (a.b) bVar.j();
                bVar3.f8075a = str6;
                bVar3.b(PersistedInstallation.RegistrationStatus.REGISTERED);
                bVar3.f8077c = c12;
                bVar3.d = str7;
                bVar3.f8078e = Long.valueOf(d10);
                bVar3.f8079f = Long.valueOf(b10);
                return bVar3.a();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
    }

    public final void i(Exception exc) {
        synchronized (this.f8055g) {
            Iterator<e> it = this.f8060l.iterator();
            while (true) {
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void j(com.google.firebase.installations.local.b bVar) {
        synchronized (this.f8055g) {
            Iterator<e> it = this.f8060l.iterator();
            while (true) {
                while (it.hasNext()) {
                    if (it.next().b(bVar)) {
                        it.remove();
                    }
                }
            }
        }
    }
}
