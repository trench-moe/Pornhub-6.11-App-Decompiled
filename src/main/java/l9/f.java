package l9;

import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f {
    static {
        Pattern.compile("\\\\.");
        Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
                if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    JSONArray jSONArray = (JSONArray) obj;
                    JSONArray jSONArray2 = (JSONArray) obj2;
                    if (jSONArray.length() == jSONArray2.length()) {
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            if (!a(jSONArray.get(i10), jSONArray2.get(i10))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                } else {
                    return obj.equals(obj2);
                }
            }
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    Objects.requireNonNull(next, "null reference");
                } catch (JSONException unused) {
                }
                if (!a(jSONObject.get(next), jSONObject2.get(next))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
