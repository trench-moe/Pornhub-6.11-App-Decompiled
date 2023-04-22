package wb;

import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f17432a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f17433b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17434c;

    public b(int i10, int i11) {
        this.f17433b = i10;
        this.f17434c = i11;
    }

    public synchronized void a(Map<String, String> map) {
        String trim;
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                int i11 = this.f17434c;
                String trim2 = key.trim();
                if (trim2.length() > i11) {
                    trim2 = trim2.substring(0, i11);
                }
                if (this.f17432a.size() >= this.f17433b && !this.f17432a.containsKey(trim2)) {
                    i10++;
                }
                String value = entry.getValue();
                Map<String, String> map2 = this.f17432a;
                if (value == null) {
                    trim = BuildConfig.FLAVOR;
                } else {
                    int i12 = this.f17434c;
                    trim = value.trim();
                    if (trim.length() > i12) {
                        trim = trim.substring(0, i12);
                    }
                }
                map2.put(trim2, trim);
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f17433b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
