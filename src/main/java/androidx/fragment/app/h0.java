package androidx.fragment.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h0 implements ea.e, e9.l {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2144c;

    /* renamed from: f  reason: collision with root package name */
    public final Object f2145f;

    /* renamed from: j  reason: collision with root package name */
    public final Object f2146j;

    /* renamed from: m  reason: collision with root package name */
    public Object f2147m;

    public h0() {
        this.f2144c = 0;
        this.f2145f = new ArrayList();
        this.f2146j = new HashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType(), 1);
        this.f2144c = 1;
    }

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, int i10) {
        this.f2144c = i10;
        this.f2145f = obj;
        this.f2146j = obj2;
        this.f2147m = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(String str, b7.k kVar) {
        this(str, kVar, m9.a.A0);
        this.f2144c = 5;
    }

    public h0(String str, b7.k kVar, m9.a aVar) {
        this.f2144c = 5;
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f2147m = aVar;
        this.f2146j = kVar;
        this.f2145f = str;
    }

    public h0(List list) {
        this.f2144c = 2;
        this.f2147m = list;
        this.f2145f = new ArrayList(list.size());
        this.f2146j = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((List) this.f2145f).add(((Mask) list.get(i10)).f4133b.a());
            ((List) this.f2146j).add(((Mask) list.get(i10)).f4134c.a());
        }
    }

    public void a(Fragment fragment) {
        if (((ArrayList) this.f2145f).contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (((ArrayList) this.f2145f)) {
            ((ArrayList) this.f2145f).add(fragment);
        }
        fragment.B = true;
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        u8.l0 l0Var = (u8.l0) this.f2145f;
        String str = (String) this.f2146j;
        String str2 = (String) this.f2147m;
        a9.c0 c0Var = (a9.c0) obj;
        ea.h<Void> hVar = (ea.h) obj2;
        long incrementAndGet = l0Var.f15717q.incrementAndGet();
        l0Var.g();
        try {
            l0Var.B.put(Long.valueOf(incrementAndGet), hVar);
            a9.f fVar = (a9.f) c0Var.getService();
            Parcel a12 = fVar.a1();
            a12.writeString(str);
            a12.writeString(str2);
            a12.writeLong(incrementAndGet);
            fVar.d1(9, a12);
        } catch (RemoteException e10) {
            l0Var.B.remove(Long.valueOf(incrementAndGet));
            hVar.f9273a.o(e10);
        }
    }

    public zb.a b(zb.a aVar, dc.f fVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f8901a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.8");
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f8902b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f8903c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((vb.w) fVar.f8904e).c());
        return aVar;
    }

    public void c(zb.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f21939c.put(str, str2);
        }
    }

    public void d() {
        ((HashMap) this.f2146j).values().removeAll(Collections.singleton(null));
    }

    public boolean e(String str) {
        return ((HashMap) this.f2146j).get(str) != null;
    }

    public zb.a f(Map map) {
        Objects.requireNonNull((b7.k) this.f2146j);
        zb.a aVar = new zb.a((String) this.f2145f, map);
        aVar.f21939c.put("User-Agent", "Crashlytics Android SDK/18.2.8");
        aVar.f21939c.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return aVar;
    }

    public Fragment g(String str) {
        f0 f0Var = (f0) ((HashMap) this.f2146j).get(str);
        if (f0Var != null) {
            return f0Var.f2128c;
        }
        return null;
    }

    public Fragment h(String str) {
        for (f0 f0Var : ((HashMap) this.f2146j).values()) {
            if (f0Var != null) {
                Fragment fragment = f0Var.f2128c;
                if (!str.equals(fragment.f2018t)) {
                    fragment = fragment.K.f2285c.h(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public List i() {
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : ((HashMap) this.f2146j).values()) {
            if (f0Var != null) {
                arrayList.add(f0Var);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : ((HashMap) this.f2146j).values()) {
            if (f0Var != null) {
                arrayList.add(f0Var.f2128c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public f0 k(String str) {
        return (f0) ((HashMap) this.f2146j).get(str);
    }

    public List l() {
        ArrayList arrayList;
        if (((ArrayList) this.f2145f).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f2145f)) {
            arrayList = new ArrayList((ArrayList) this.f2145f);
        }
        return arrayList;
    }

    public JSONObject m(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            StringBuilder m10 = a1.a.m("Failed to parse settings JSON from ");
            m10.append((String) this.f2145f);
            ((m9.a) this.f2147m).H(m10.toString(), e10);
            ((m9.a) this.f2147m).G("Settings response " + str);
            return null;
        }
    }

    public Map n(dc.f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f8907h);
        hashMap.put("display_version", fVar.f8906g);
        hashMap.put("source", Integer.toString(fVar.f8908i));
        String str = fVar.f8905f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject o(zb.b r8) {
        /*
            r7 = this;
            r4 = r7
            int r0 = r8.f21940a
            java.lang.Object r1 = r4.f2147m
            m9.a r1 = (m9.a) r1
            r6 = 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r6 = 7
            java.lang.String r3 = "Settings response code was: "
            r6 = 5
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.E(r2)
            r6 = 6
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L39
            r1 = 201(0xc9, float:2.82E-43)
            r6 = 7
            if (r0 == r1) goto L39
            r1 = 202(0xca, float:2.83E-43)
            r6 = 6
            if (r0 == r1) goto L39
            r6 = 7
            r1 = 203(0xcb, float:2.84E-43)
            r6 = 7
            if (r0 != r1) goto L35
            r6 = 5
            goto L3a
        L35:
            r6 = 3
            r6 = 0
            r1 = r6
            goto L3b
        L39:
            r6 = 5
        L3a:
            r1 = 1
        L3b:
            if (r1 == 0) goto L45
            java.lang.String r8 = r8.f21941b
            r6 = 6
            org.json.JSONObject r8 = r4.m(r8)
            goto L66
        L45:
            java.lang.Object r8 = r4.f2147m
            r6 = 6
            m9.a r8 = (m9.a) r8
            r6 = 7
            java.lang.String r1 = "Settings request failed; (status: "
            r6 = 6
            java.lang.String r6 = ") from "
            r2 = r6
            java.lang.StringBuilder r0 = a1.a.n(r1, r0, r2)
            java.lang.Object r1 = r4.f2145f
            java.lang.String r1 = (java.lang.String) r1
            r6 = 7
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.q(r0)
            r8 = 0
            r6 = 1
        L66:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h0.o(zb.b):org.json.JSONObject");
    }

    @Override // ea.e
    public void onSuccess(Object obj) {
        v8.b bVar = (v8.b) this.f2145f;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f2147m;
        Objects.requireNonNull(bVar.f16065c, "null reference");
        bVar.f16065c.a(new d3.d(new t9.g0(sharedPreferences, (t9.y) this.f2146j, (Bundle) obj, bVar.f16063a.getPackageName()), 6), v8.d.class);
    }

    public void p(f0 f0Var) {
        Fragment fragment = f0Var.f2128c;
        if (e(fragment.f2018t)) {
            return;
        }
        ((HashMap) this.f2146j).put(fragment.f2018t, f0Var);
        if (y.P(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public void q(f0 f0Var) {
        Fragment fragment = f0Var.f2128c;
        if (fragment.R) {
            ((b0) this.f2147m).c(fragment);
        }
        if (((f0) ((HashMap) this.f2146j).put(fragment.f2018t, null)) == null) {
            return;
        }
        if (y.P(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public void r(Fragment fragment) {
        synchronized (((ArrayList) this.f2145f)) {
            try {
                ((ArrayList) this.f2145f).remove(fragment);
            } catch (Throwable th) {
                throw th;
            }
        }
        fragment.B = false;
    }

    public String toString() {
        switch (this.f2144c) {
            case 1:
                StringBuilder l10 = android.support.v4.media.a.l("NavDeepLinkRequest", "{");
                if (((Uri) this.f2145f) != null) {
                    l10.append(" uri=");
                    l10.append(((Uri) this.f2145f).toString());
                }
                if (((String) this.f2146j) != null) {
                    l10.append(" action=");
                    l10.append((String) this.f2146j);
                }
                if (((String) this.f2147m) != null) {
                    l10.append(" mimetype=");
                    l10.append((String) this.f2147m);
                }
                l10.append(" }");
                return l10.toString();
            default:
                return super.toString();
        }
    }
}
