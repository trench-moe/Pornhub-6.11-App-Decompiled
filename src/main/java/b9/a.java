package b9;

import a9.b;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f3621a = new b("MetadataUtils");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f3622b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f3623c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f3622b = strArr;
        String valueOf = String.valueOf(strArr[0]);
        f3623c = valueOf.length() != 0 ? "yyyyMMdd'T'HHmmss".concat(valueOf) : new String("yyyyMMdd'T'HHmmss");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Calendar a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.a.a(java.lang.String):java.util.Calendar");
    }

    public static JSONArray b(List<g9.a> list) {
        Objects.requireNonNull(list);
        JSONArray jSONArray = new JSONArray();
        for (g9.a aVar : list) {
            Objects.requireNonNull(aVar);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", aVar.f9883f.toString());
                jSONObject.put("width", aVar.f9884j);
                jSONObject.put("height", aVar.f9885m);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(List<g9.a> list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    list.add(new g9.a(jSONArray.getJSONObject(i10)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
