package j6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import ic.e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import k6.c;
import k6.d;
import k6.f;
import k6.g;
import k6.h;
import k6.i;
import k6.l;
import k6.m;
import l6.m;
import m6.k;

/* loaded from: classes2.dex */
public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final gc.a f11421a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f11422b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f11423c;
    public final URL d;

    /* renamed from: e  reason: collision with root package name */
    public final u6.a f11424e;

    /* renamed from: f  reason: collision with root package name */
    public final u6.a f11425f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11426g;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f11427a;

        /* renamed from: b  reason: collision with root package name */
        public final k6.k f11428b;

        /* renamed from: c  reason: collision with root package name */
        public final String f11429c;

        public a(URL url, k6.k kVar, String str) {
            this.f11427a = url;
            this.f11428b = kVar;
            this.f11429c = str;
        }
    }

    /* renamed from: j6.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0165b {

        /* renamed from: a  reason: collision with root package name */
        public final int f11430a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f11431b;

        /* renamed from: c  reason: collision with root package name */
        public final long f11432c;

        public C0165b(int i10, URL url, long j10) {
            this.f11430a = i10;
            this.f11431b = url;
            this.f11432c = j10;
        }
    }

    public b(Context context, u6.a aVar, u6.a aVar2) {
        e eVar = new e();
        c cVar = c.f11832a;
        eVar.a(k6.k.class, cVar);
        eVar.a(g.class, cVar);
        k6.e eVar2 = k6.e.f11841a;
        eVar.a(m.class, eVar2);
        eVar.a(i.class, eVar2);
        com.google.android.datatransport.cct.internal.a aVar3 = com.google.android.datatransport.cct.internal.a.f5945a;
        eVar.a(ClientInfo.class, aVar3);
        eVar.a(com.google.android.datatransport.cct.internal.c.class, aVar3);
        k6.b bVar = k6.b.f11820a;
        eVar.a(k6.a.class, bVar);
        eVar.a(f.class, bVar);
        d dVar = d.f11834a;
        eVar.a(l.class, dVar);
        eVar.a(h.class, dVar);
        com.google.android.datatransport.cct.internal.b bVar2 = com.google.android.datatransport.cct.internal.b.f5948a;
        eVar.a(NetworkConnectionInfo.class, bVar2);
        eVar.a(com.google.android.datatransport.cct.internal.d.class, bVar2);
        eVar.d = true;
        this.f11421a = new ic.d(eVar);
        this.f11423c = context;
        this.f11422b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = c(j6.a.f11417c);
        this.f11424e = aVar2;
        this.f11425f = aVar;
        this.f11426g = 40000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(a1.a.l("Invalid url: ", str), e10);
        }
    }

    @Override // m6.k
    public BackendResponse a(m6.e eVar) {
        String str;
        BackendResponse.Status status;
        Object apply;
        Integer num;
        String str2;
        BackendResponse.Status status2;
        h.b bVar;
        BackendResponse.Status status3 = BackendResponse.Status.TRANSIENT_ERROR;
        HashMap hashMap = new HashMap();
        m6.a aVar = (m6.a) eVar;
        for (l6.m mVar : aVar.f12911a) {
            String h10 = mVar.h();
            if (hashMap.containsKey(h10)) {
                ((List) hashMap.get(h10)).add(mVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(mVar);
                hashMap.put(h10, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l6.m mVar2 = (l6.m) ((List) entry.getValue()).get(0);
            QosTier qosTier = QosTier.DEFAULT;
            Long valueOf = Long.valueOf(this.f11425f.a());
            Long valueOf2 = Long.valueOf(this.f11424e.a());
            com.google.android.datatransport.cct.internal.c cVar = new com.google.android.datatransport.cct.internal.c(ClientInfo.ClientType.ANDROID_FIREBASE, new f(Integer.valueOf(mVar2.g("sdk-version")), mVar2.b("model"), mVar2.b("hardware"), mVar2.b("device"), mVar2.b("product"), mVar2.b("os-uild"), mVar2.b("manufacturer"), mVar2.b("fingerprint"), mVar2.b("locale"), mVar2.b("country"), mVar2.b("mcc_mnc"), mVar2.b("application_build"), null), null);
            try {
                str2 = null;
                num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                num = null;
                str2 = (String) entry.getKey();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                l6.m mVar3 = (l6.m) it2.next();
                l6.l e10 = mVar3.e();
                Iterator it3 = it;
                i6.b bVar2 = e10.f12303a;
                Iterator it4 = it2;
                if (bVar2.equals(new i6.b("proto"))) {
                    byte[] bArr = e10.f12304b;
                    bVar = new h.b();
                    bVar.d = bArr;
                } else if (bVar2.equals(new i6.b("json"))) {
                    String str3 = new String(e10.f12304b, Charset.forName("UTF-8"));
                    bVar = new h.b();
                    bVar.f11869e = str3;
                } else {
                    status2 = status3;
                    Log.w(cb.e.L("CctTransportBackend"), String.format("Received event of unsupported encoding %s. Skipping...", bVar2));
                    it2 = it4;
                    it = it3;
                    status3 = status2;
                }
                bVar.f11866a = Long.valueOf(mVar3.f());
                bVar.f11868c = Long.valueOf(mVar3.i());
                String str4 = mVar3.c().get("tz-offset");
                bVar.f11870f = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                status2 = status3;
                bVar.f11871g = new com.google.android.datatransport.cct.internal.d(NetworkConnectionInfo.NetworkType.f5941f.get(mVar3.g("net-type")), NetworkConnectionInfo.MobileSubtype.f5938j.get(mVar3.g("mobile-subtype")), null);
                if (mVar3.d() != null) {
                    bVar.f11867b = mVar3.d();
                }
                String str5 = bVar.f11866a == null ? " eventTimeMs" : BuildConfig.FLAVOR;
                if (bVar.f11868c == null) {
                    str5 = a1.a.l(str5, " eventUptimeMs");
                }
                if (bVar.f11870f == null) {
                    str5 = a1.a.l(str5, " timezoneOffsetSeconds");
                }
                if (!str5.isEmpty()) {
                    throw new IllegalStateException(a1.a.l("Missing required properties:", str5));
                }
                arrayList3.add(new h(bVar.f11866a.longValue(), bVar.f11867b, bVar.f11868c.longValue(), bVar.d, bVar.f11869e, bVar.f11870f.longValue(), bVar.f11871g, null));
                it2 = it4;
                it = it3;
                status3 = status2;
            }
            Iterator it5 = it;
            BackendResponse.Status status4 = status3;
            String str6 = valueOf == null ? " requestTimeMs" : BuildConfig.FLAVOR;
            if (valueOf2 == null) {
                str6 = a1.a.l(str6, " requestUptimeMs");
            }
            if (!str6.isEmpty()) {
                throw new IllegalStateException(a1.a.l("Missing required properties:", str6));
            }
            arrayList2.add(new i(valueOf.longValue(), valueOf2.longValue(), cVar, num, str2, arrayList3, qosTier, null));
            it = it5;
            status3 = status4;
        }
        BackendResponse.Status status5 = status3;
        g gVar = new g(arrayList2);
        URL url = this.d;
        if (aVar.f12912b != null) {
            try {
                j6.a a10 = j6.a.a(((m6.a) eVar).f12912b);
                str = a10.f11420b;
                if (str == null) {
                    str = null;
                }
                String str7 = a10.f11419a;
                if (str7 != null) {
                    url = c(str7);
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.a();
            }
        } else {
            str = null;
        }
        int i10 = 5;
        try {
            a aVar2 = new a(url, gVar, str);
            s4.f fVar = new s4.f(this, 3);
            do {
                apply = fVar.apply(aVar2);
                C0165b c0165b = (C0165b) apply;
                URL url2 = c0165b.f11431b;
                if (url2 != null) {
                    cb.e.y("CctTransportBackend", "Following redirect to: %s", url2);
                    aVar2 = new a(c0165b.f11431b, aVar2.f11428b, aVar2.f11429c);
                } else {
                    aVar2 = null;
                }
                if (aVar2 == null) {
                    break;
                }
                i10--;
            } while (i10 >= 1);
            C0165b c0165b2 = (C0165b) apply;
            int i11 = c0165b2.f11430a;
            if (i11 == 200) {
                return new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.OK, c0165b2.f11432c);
            }
            if (i11 < 500 && i11 != 404) {
                return i11 == 400 ? new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.INVALID_PAYLOAD, -1L) : BackendResponse.a();
            }
            status = status5;
            try {
                return new com.google.android.datatransport.runtime.backends.a(status, -1L);
            } catch (IOException e11) {
                e = e11;
                cb.e.C("CctTransportBackend", "Could not make request to the backend", e);
                return new com.google.android.datatransport.runtime.backends.a(status, -1L);
            }
        } catch (IOException e12) {
            e = e12;
            status = status5;
        }
    }

    @Override // m6.k
    public l6.m b(l6.m mVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f11422b.getActiveNetworkInfo();
        m.a j10 = mVar.j();
        j10.c().put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        j10.c().put("model", Build.MODEL);
        j10.c().put("hardware", Build.HARDWARE);
        j10.c().put("device", Build.DEVICE);
        j10.c().put("product", Build.PRODUCT);
        j10.c().put("os-uild", Build.ID);
        j10.c().put("manufacturer", Build.MANUFACTURER);
        j10.c().put("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        j10.c().put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        j10.c().put("net-type", String.valueOf(activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.b() : activeNetworkInfo.getType()));
        int i10 = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.b();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == i10) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.b();
            } else if (NetworkConnectionInfo.MobileSubtype.f5938j.get(subtype) == null) {
                subtype = 0;
            }
        }
        j10.c().put("mobile-subtype", String.valueOf(subtype));
        j10.c().put("country", Locale.getDefault().getCountry());
        j10.c().put("locale", Locale.getDefault().getLanguage());
        j10.c().put("mcc_mnc", ((TelephonyManager) this.f11423c.getSystemService("phone")).getSimOperator());
        Context context = this.f11423c;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            cb.e.C("CctTransportBackend", "Unable to find version code for package", e10);
        }
        j10.c().put("application_build", Integer.toString(i10));
        return j10.b();
    }
}
