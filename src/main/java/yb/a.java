package yb;

import android.util.Base64;
import android.util.JsonReader;
import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ic.d;
import ic.e;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Objects;
import s6.q;
import xb.a0;
import xb.b;
import xb.b0;
import xb.c;
import xb.g;
import xb.h;
import xb.j;
import xb.k;
import xb.l;
import xb.m;
import xb.o;
import xb.p;
import xb.r;
import xb.s;
import xb.t;
import xb.u;
import xb.v;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final gc.a f18630a;

    /* renamed from: yb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0311a<T> {
        T c(JsonReader jsonReader);
    }

    static {
        e eVar = new e();
        ((xb.a) xb.a.f18091a).a(eVar);
        eVar.d = true;
        f18630a = new d(eVar);
    }

    public static a0.e.d.a.b.AbstractC0300d.AbstractC0301a a(JsonReader jsonReader) {
        r.b bVar = new r.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (!nextName.equals("symbol")) {
                        break;
                    } else {
                        c10 = 1;
                        break;
                    }
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (!nextName.equals("file")) {
                        break;
                    } else {
                        c10 = 3;
                        break;
                    }
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    bVar.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null symbol");
                    bVar.f18311b = nextString;
                    break;
                case 2:
                    bVar.f18310a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    bVar.f18312c = jsonReader.nextString();
                    break;
                case 4:
                    bVar.f18313e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    public static a0.c b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null key");
            } else if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                str2 = jsonReader.nextString();
                Objects.requireNonNull(str2, "Null value");
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : BuildConfig.FLAVOR;
        if (str2 == null) {
            str3 = a1.a.l(str3, " value");
        }
        if (str3.isEmpty()) {
            return new xb.d(str, str2, null);
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str3));
    }

    public static <T> b0<T> c(JsonReader jsonReader, InterfaceC0311a<T> interfaceC0311a) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC0311a.c(jsonReader));
        }
        jsonReader.endArray();
        return new b0<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [xb.a0$e$d$a$b$b] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [xb.a0$e$d$a$b$b] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [xb.a0$e$d$a$b$c] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v6 */
    public static a0.e.d d(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        k.b bVar = new k.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str = BuildConfig.FLAVOR;
            m mVar = null;
            if (c10 == 0) {
                s.b bVar2 = new s.b();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    Objects.requireNonNull(nextName2);
                    switch (nextName2.hashCode()) {
                        case -1708606089:
                            if (nextName2.equals("batteryLevel")) {
                                c15 = 0;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case -1455558134:
                            if (nextName2.equals("batteryVelocity")) {
                                c15 = 1;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case -1439500848:
                            if (nextName2.equals("orientation")) {
                                c15 = 2;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 279795450:
                            if (nextName2.equals("diskUsed")) {
                                c15 = 3;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 976541947:
                            if (nextName2.equals("ramUsed")) {
                                c15 = 4;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 1516795582:
                            if (nextName2.equals("proximityOn")) {
                                c15 = 5;
                                break;
                            }
                            c15 = 65535;
                            break;
                        default:
                            c15 = 65535;
                            break;
                    }
                    if (c15 == 0) {
                        bVar2.f18319a = Double.valueOf(jsonReader.nextDouble());
                    } else if (c15 == 1) {
                        bVar2.f18320b = Integer.valueOf(jsonReader.nextInt());
                    } else if (c15 == 2) {
                        bVar2.d = Integer.valueOf(jsonReader.nextInt());
                    } else if (c15 == 3) {
                        bVar2.f18323f = Long.valueOf(jsonReader.nextLong());
                    } else if (c15 == 4) {
                        bVar2.f18322e = Long.valueOf(jsonReader.nextLong());
                    } else if (c15 != 5) {
                        jsonReader.skipValue();
                    } else {
                        bVar2.f18321c = Boolean.valueOf(jsonReader.nextBoolean());
                    }
                }
                jsonReader.endObject();
                bVar.d = bVar2.a();
            } else if (c10 == 1) {
                jsonReader.beginObject();
                Integer num = null;
                b0 b0Var = null;
                b0 b0Var2 = null;
                Boolean bool = null;
                Long l10 = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    Objects.requireNonNull(nextName3);
                    switch (nextName3.hashCode()) {
                        case -1332194002:
                            if (nextName3.equals("background")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1090974952:
                            if (nextName3.equals("execution")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -80231855:
                            if (nextName3.equals("internalKeys")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 555169704:
                            if (nextName3.equals("customAttributes")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 928737948:
                            if (nextName3.equals("uiOrientation")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    if (c11 == 0) {
                        bool = Boolean.valueOf(jsonReader.nextBoolean());
                    } else if (c11 != 1) {
                        if (c11 == 2) {
                            ArrayList arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(b(jsonReader));
                            }
                            jsonReader.endArray();
                            b0Var2 = new b0(arrayList);
                        } else if (c11 == 3) {
                            ArrayList arrayList2 = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList2.add(b(jsonReader));
                            }
                            jsonReader.endArray();
                            b0Var = new b0(arrayList2);
                        } else if (c11 != 4) {
                            jsonReader.skipValue();
                        } else {
                            num = Integer.valueOf(jsonReader.nextInt());
                        }
                        l10 = l10;
                    } else {
                        jsonReader.beginObject();
                        b0 b0Var3 = l10;
                        ?? r19 = b0Var3;
                        a0.a aVar = r19;
                        p pVar = aVar;
                        b0 b0Var4 = pVar;
                        while (jsonReader.hasNext()) {
                            String nextName4 = jsonReader.nextName();
                            Objects.requireNonNull(nextName4);
                            switch (nextName4.hashCode()) {
                                case -1375141843:
                                    if (nextName4.equals("appExitInfo")) {
                                        c12 = 0;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case -1337936983:
                                    if (nextName4.equals("threads")) {
                                        c12 = 1;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case -902467928:
                                    if (nextName4.equals("signal")) {
                                        c12 = 2;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case 937615455:
                                    if (nextName4.equals("binaries")) {
                                        c12 = 3;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case 1481625679:
                                    if (nextName4.equals("exception")) {
                                        c12 = 4;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                default:
                                    c12 = 65535;
                                    break;
                            }
                            if (c12 == 0) {
                                c.b bVar3 = new c.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName5);
                                    switch (nextName5.hashCode()) {
                                        case 110987:
                                            if (nextName5.equals("pid")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 111312:
                                            if (nextName5.equals("pss")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 113234:
                                            if (nextName5.equals("rss")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 55126294:
                                            if (nextName5.equals("timestamp")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 202325402:
                                            if (nextName5.equals("processName")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 722137681:
                                            if (nextName5.equals("reasonCode")) {
                                                c13 = 5;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 723857505:
                                            if (nextName5.equals("traceFile")) {
                                                c13 = 6;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 2125650548:
                                            if (nextName5.equals("importance")) {
                                                c13 = 7;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            bVar3.f18218a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 1:
                                            bVar3.f18221e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 2:
                                            bVar3.f18222f = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            bVar3.f18223g = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 4:
                                            String nextString = jsonReader.nextString();
                                            Objects.requireNonNull(nextString, "Null processName");
                                            bVar3.f18219b = nextString;
                                            break;
                                        case 5:
                                            bVar3.f18220c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            bVar3.f18224h = jsonReader.nextString();
                                            break;
                                        case 7:
                                            bVar3.d = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar = bVar3.a();
                                pVar = pVar;
                            } else if (c12 == 1) {
                                b0Var3 = c(jsonReader, q.n);
                                pVar = pVar;
                            } else if (c12 == 2) {
                                jsonReader.beginObject();
                                String str2 = l10;
                                String str3 = str2;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName6);
                                    int hashCode = nextName6.hashCode();
                                    if (hashCode == -1147692044) {
                                        if (nextName6.equals("address")) {
                                            c14 = 0;
                                        }
                                        c14 = 65535;
                                    } else if (hashCode != 3059181) {
                                        if (hashCode == 3373707 && nextName6.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                                            c14 = 2;
                                        }
                                        c14 = 65535;
                                    } else {
                                        if (nextName6.equals("code")) {
                                            c14 = 1;
                                        }
                                        c14 = 65535;
                                    }
                                    if (c14 == 0) {
                                        l10 = Long.valueOf(jsonReader.nextLong());
                                    } else if (c14 == 1) {
                                        String nextString2 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString2, "Null code");
                                        str3 = nextString2;
                                    } else if (c14 != 2) {
                                        jsonReader.skipValue();
                                    } else {
                                        String nextString3 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString3, "Null name");
                                        str2 = nextString3;
                                    }
                                }
                                jsonReader.endObject();
                                String str4 = str2 == null ? " name" : BuildConfig.FLAVOR;
                                if (str3 == null) {
                                    str4 = a1.a.l(str4, " code");
                                }
                                if (l10 == 0) {
                                    str4 = a1.a.l(str4, " address");
                                }
                                if (!str4.isEmpty()) {
                                    throw new IllegalStateException(a1.a.l("Missing required properties:", str4));
                                }
                                pVar = new p(str2, str3, l10.longValue(), null);
                            } else if (c12 == 3) {
                                b0Var4 = c(jsonReader, r3.a.f14628t);
                            } else if (c12 != 4) {
                                jsonReader.skipValue();
                            } else {
                                r19 = e(jsonReader);
                            }
                            l10 = 0;
                        }
                        jsonReader.endObject();
                        String str5 = pVar == 0 ? " signal" : BuildConfig.FLAVOR;
                        if (b0Var4 == null) {
                            str5 = a1.a.l(str5, " binaries");
                        }
                        if (!str5.isEmpty()) {
                            throw new IllegalStateException(a1.a.l("Missing required properties:", str5));
                        }
                        mVar = new m(b0Var3, r19, aVar, pVar, b0Var4, null);
                    }
                    l10 = 0;
                    l10 = l10;
                }
                jsonReader.endObject();
                if (mVar == null) {
                    str = " execution";
                }
                if (num == null) {
                    str = a1.a.l(str, " uiOrientation");
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException(a1.a.l("Missing required properties:", str));
                }
                bVar.f18279c = new l(mVar, b0Var, b0Var2, bool, num.intValue(), null);
            } else if (c10 == 2) {
                jsonReader.beginObject();
                String str6 = null;
                while (jsonReader.hasNext()) {
                    String nextName7 = jsonReader.nextName();
                    Objects.requireNonNull(nextName7);
                    if (nextName7.equals("content")) {
                        str6 = jsonReader.nextString();
                        Objects.requireNonNull(str6, "Null content");
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str6 == null) {
                    str = " content";
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException(a1.a.l("Missing required properties:", str));
                }
                bVar.f18280e = new t(str6, null);
            } else if (c10 == 3) {
                bVar.e(jsonReader.nextString());
            } else if (c10 != 4) {
                jsonReader.skipValue();
            } else {
                bVar.d(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    public static a0.e.d.a.b.AbstractC0299b e(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        b0 b0Var = null;
        a0.e.d.a.b.AbstractC0299b abstractC0299b = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (!nextName.equals("frames")) {
                        break;
                    } else {
                        c10 = 0;
                        break;
                    }
                case -934964668:
                    if (!nextName.equals("reason")) {
                        break;
                    } else {
                        c10 = 1;
                        break;
                    }
                case 3575610:
                    if (!nextName.equals("type")) {
                        break;
                    } else {
                        c10 = 2;
                        break;
                    }
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (!nextName.equals("overflowCount")) {
                        break;
                    } else {
                        c10 = 4;
                        break;
                    }
            }
            switch (c10) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(a(jsonReader));
                    }
                    jsonReader.endArray();
                    b0Var = new b0(arrayList);
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null type");
                    break;
                case 3:
                    abstractC0299b = e(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " type" : BuildConfig.FLAVOR;
        if (b0Var == null) {
            str3 = a1.a.l(str3, " frames");
        }
        if (num == null) {
            str3 = a1.a.l(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new o(str, str2, b0Var, abstractC0299b, num.intValue(), null);
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a0 f(JsonReader jsonReader) {
        char c10;
        char c11;
        String str;
        char c12;
        char c13;
        String str2;
        char c14;
        Charset charset = a0.f18195a;
        b.C0305b c0305b = new b.C0305b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str3 = BuildConfig.FLAVOR;
            switch (c10) {
                case 0:
                    jsonReader.beginObject();
                    String str4 = null;
                    b0 b0Var = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        Objects.requireNonNull(nextName2);
                        if (nextName2.equals("files")) {
                            b0Var = c(jsonReader, s6.p.y);
                        } else if (nextName2.equals("orgId")) {
                            str4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str5 = b0Var == null ? " files" : BuildConfig.FLAVOR;
                    if (str5.isEmpty()) {
                        c0305b.f18209h = new xb.e(b0Var, str4, null);
                        break;
                    } else {
                        throw new IllegalStateException(a1.a.l("Missing required properties:", str5));
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null sdkVersion");
                    c0305b.f18203a = nextString;
                    break;
                case 2:
                    String nextString2 = jsonReader.nextString();
                    Objects.requireNonNull(nextString2, "Null buildVersion");
                    c0305b.f18206e = nextString2;
                    break;
                case 3:
                    String nextString3 = jsonReader.nextString();
                    Objects.requireNonNull(nextString3, "Null gmpAppId");
                    c0305b.f18204b = nextString3;
                    break;
                case 4:
                    String nextString4 = jsonReader.nextString();
                    Objects.requireNonNull(nextString4, "Null installationUuid");
                    c0305b.d = nextString4;
                    break;
                case 5:
                    c0305b.f18205c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 6:
                    String nextString5 = jsonReader.nextString();
                    Objects.requireNonNull(nextString5, "Null displayVersion");
                    c0305b.f18207f = nextString5;
                    break;
                case 7:
                    g.b bVar = new g.b();
                    bVar.b(false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        Objects.requireNonNull(nextName3);
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals(UsersConfig.USER_PREF_KEY)) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                str = str3;
                                bVar.f18243c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                str = str3;
                                bVar.f18242b = new String(Base64.decode(jsonReader.nextString(), 2), a0.f18195a);
                                break;
                            case 2:
                                str = str3;
                                bVar.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 3:
                                str = str3;
                                j.b bVar2 = new j.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName4);
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c12 = '\b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            bVar2.f18269f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString6, "Null manufacturer");
                                            bVar2.f18271h = nextString6;
                                            break;
                                        case 2:
                                            bVar2.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            bVar2.f18265a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            bVar2.f18268e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            bVar2.f18267c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString7, "Null model");
                                            bVar2.f18266b = nextString7;
                                            break;
                                        case 7:
                                            bVar2.f18270g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            Objects.requireNonNull(nextString8, "Null modelClass");
                                            bVar2.f18272i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bVar.f18248i = bVar2.a();
                                break;
                            case 4:
                                str = str3;
                                bVar.f18249j = c(jsonReader, k0.c.G);
                                break;
                            case 5:
                                str = str3;
                                jsonReader.beginObject();
                                Boolean bool = null;
                                Integer num = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName5);
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    if (c13 == 0) {
                                        String nextString9 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString9, "Null buildVersion");
                                        str7 = nextString9;
                                    } else if (c13 == 1) {
                                        bool = Boolean.valueOf(jsonReader.nextBoolean());
                                    } else if (c13 == 2) {
                                        String nextString10 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString10, "Null version");
                                        str6 = nextString10;
                                    } else if (c13 != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        num = Integer.valueOf(jsonReader.nextInt());
                                    }
                                }
                                jsonReader.endObject();
                                String str8 = num == null ? " platform" : str;
                                if (str6 == null) {
                                    str8 = a1.a.l(str8, " version");
                                }
                                if (str7 == null) {
                                    str8 = a1.a.l(str8, " buildVersion");
                                }
                                if (bool == null) {
                                    str8 = a1.a.l(str8, " jailbroken");
                                }
                                if (str8.isEmpty()) {
                                    bVar.f18247h = new u(num.intValue(), str6, str7, bool.booleanValue(), null);
                                    break;
                                } else {
                                    throw new IllegalStateException(a1.a.l("Missing required properties:", str8));
                                }
                            case 6:
                                jsonReader.beginObject();
                                String str9 = null;
                                String str10 = null;
                                String str11 = null;
                                String str12 = null;
                                String str13 = null;
                                String str14 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName6);
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            str2 = str3;
                                            if (nextName6.equals("identifier")) {
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case -519438642:
                                            str2 = str3;
                                            if (nextName6.equals("developmentPlatform")) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 213652010:
                                            str2 = str3;
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c14 = 3;
                                                str2 = str3;
                                                break;
                                            }
                                            str2 = str3;
                                            c14 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c14 = 4;
                                                str2 = str3;
                                                break;
                                            }
                                            str2 = str3;
                                            c14 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c14 = 5;
                                                str2 = str3;
                                                break;
                                            }
                                            str2 = str3;
                                            c14 = 65535;
                                            break;
                                        default:
                                            str2 = str3;
                                            c14 = 65535;
                                            break;
                                    }
                                    if (c14 == 0) {
                                        String nextString11 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString11, "Null identifier");
                                        str9 = nextString11;
                                    } else if (c14 == 1) {
                                        str13 = jsonReader.nextString();
                                    } else if (c14 == 2) {
                                        str14 = jsonReader.nextString();
                                    } else if (c14 == 3) {
                                        String nextString12 = jsonReader.nextString();
                                        Objects.requireNonNull(nextString12, "Null version");
                                        str10 = nextString12;
                                    } else if (c14 == 4) {
                                        str12 = jsonReader.nextString();
                                    } else if (c14 != 5) {
                                        jsonReader.skipValue();
                                    } else {
                                        str11 = jsonReader.nextString();
                                    }
                                    str3 = str2;
                                }
                                str = str3;
                                jsonReader.endObject();
                                String str15 = str9 == null ? " identifier" : str;
                                if (str10 == null) {
                                    str15 = a1.a.l(str15, " version");
                                }
                                if (str15.isEmpty()) {
                                    bVar.f18245f = new h(str9, str10, str11, null, str12, str13, str14, null);
                                    break;
                                } else {
                                    throw new IllegalStateException(a1.a.l("Missing required properties:", str15));
                                }
                            case 7:
                                jsonReader.beginObject();
                                String str16 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName7 = jsonReader.nextName();
                                    Objects.requireNonNull(nextName7);
                                    if (nextName7.equals("identifier")) {
                                        str16 = jsonReader.nextString();
                                        Objects.requireNonNull(str16, "Null identifier");
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str17 = str16 == null ? " identifier" : str3;
                                if (str17.isEmpty()) {
                                    bVar.f18246g = new v(str16, null);
                                    str = str3;
                                    break;
                                } else {
                                    throw new IllegalStateException(a1.a.l("Missing required properties:", str17));
                                }
                            case '\b':
                                String nextString13 = jsonReader.nextString();
                                Objects.requireNonNull(nextString13, "Null generator");
                                bVar.f18241a = nextString13;
                                str = str3;
                                break;
                            case '\t':
                                bVar.b(jsonReader.nextBoolean());
                                str = str3;
                                break;
                            case '\n':
                                bVar.f18250k = Integer.valueOf(jsonReader.nextInt());
                                str = str3;
                                break;
                            default:
                                str = str3;
                                jsonReader.skipValue();
                                break;
                        }
                        str3 = str;
                    }
                    jsonReader.endObject();
                    c0305b.f18208g = bVar.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0305b.a();
    }

    public a0 g(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a0 f10 = f(jsonReader);
            jsonReader.close();
            return f10;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String h(a0 a0Var) {
        d dVar = (d) f18630a;
        Objects.requireNonNull(dVar);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(a0Var, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
