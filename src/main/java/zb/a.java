package zb;

import com.appsflyer.oaid.BuildConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f21937a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f21938b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f21939c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f21937a = str;
        this.f21938b = map;
    }

    public final String a(String str, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(next.getKey());
        sb3.append("=");
        sb3.append(next.getValue() != null ? next.getValue() : BuildConfig.FLAVOR);
        sb2.append(sb3.toString());
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            StringBuilder m10 = a1.a.m("&");
            m10.append(next2.getKey());
            m10.append("=");
            m10.append(next2.getValue() != null ? next2.getValue() : BuildConfig.FLAVOR);
            sb2.append(m10.toString());
        }
        String sb4 = sb2.toString();
        if (sb4.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb4 = a1.a.l("&", sb4);
            }
            return a1.a.l(str, sb4);
        }
        return android.support.v4.media.b.j(str, "?", sb4);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zb.b b() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.a.b():zb.b");
    }
}
