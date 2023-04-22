package wb;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ac.c f17438a;

    static {
        Charset.forName("UTF-8");
    }

    public d(ac.c cVar) {
        this.f17438a = cVar;
    }

    public static Map<String, String> a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public Map<String, String> b(String str, boolean z10) {
        File f10 = z10 ? this.f17438a.f(str, "internal-keys") : this.f17438a.f(str, "keys");
        if (!f10.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(f10);
                try {
                    Map<String, String> a10 = a(CommonUtils.m(fileInputStream2));
                    CommonUtils.a(fileInputStream2, "Failed to close user metadata file.");
                    return a10;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    Log.e("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public String c(String str) {
        FileInputStream fileInputStream;
        File f10 = this.f17438a.f(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!f10.exists()) {
            String l10 = a1.a.l("No userId set for session ", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", l10, null);
            }
            return null;
        }
        try {
            fileInputStream = new FileInputStream(f10);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            CommonUtils.a(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(CommonUtils.m(fileInputStream));
                String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                String str2 = "Loaded userId " + optString + " for session " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                return optString;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                CommonUtils.a(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Log.e("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }
}
