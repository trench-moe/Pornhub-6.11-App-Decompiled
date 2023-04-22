package com.appsflyer.internal;

import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m implements Runnable {
    private final bf AFInAppEventParameterName;

    public m() {
    }

    public m(bf bfVar) {
        this.AFInAppEventParameterName = bfVar;
    }

    public static JSONObject AFInAppEventParameterName(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), valueOf(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static Map<String, Object> AFInAppEventType(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = AFKeystoreWrapper((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFInAppEventType((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static List<Object> AFKeystoreWrapper(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            List<Object> list = jSONArray.get(i10);
            if (list instanceof JSONArray) {
                list = AFKeystoreWrapper((JSONArray) list);
            } else if (list instanceof JSONObject) {
                list = AFInAppEventType((JSONObject) list);
            }
            arrayList.add(list);
        }
        return arrayList;
    }

    private static Object valueOf(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject) && !obj.equals(JSONObject.NULL)) {
            try {
                if (obj instanceof Collection) {
                    JSONArray jSONArray = new JSONArray();
                    for (Object obj2 : (Collection) obj) {
                        jSONArray.put(valueOf(obj2));
                    }
                    return jSONArray;
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i10 = 0; i10 < length; i10++) {
                        jSONArray2.put(valueOf(Array.get(obj, i10)));
                    }
                    return jSONArray2;
                } else if (obj instanceof Map) {
                    return AFInAppEventParameterName((Map) obj);
                } else {
                    if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short)) {
                        if (obj instanceof String) {
                            return obj;
                        }
                        obj = obj.toString();
                    }
                    return obj;
                }
            } catch (Exception unused) {
                return JSONObject.NULL;
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.net.HttpURLConnection AFInAppEventType() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.m.AFInAppEventType():java.net.HttpURLConnection");
    }

    @Override // java.lang.Runnable
    public void run() {
        HttpURLConnection AFInAppEventType = AFInAppEventType();
        if (AFInAppEventType != null) {
            AFInAppEventType.disconnect();
        }
    }
}
