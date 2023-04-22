package cc;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.h0;
import cb.e;
import com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior;
import dc.f;
import e.p;
import ea.h;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import vb.s;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4017a;

    /* renamed from: b  reason: collision with root package name */
    public final f f4018b;

    /* renamed from: c  reason: collision with root package name */
    public final d3.d f4019c;
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public final p f4020e;

    /* renamed from: f  reason: collision with root package name */
    public final h0 f4021f;

    /* renamed from: g  reason: collision with root package name */
    public final s f4022g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<dc.d> f4023h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<h<dc.a>> f4024i;

    public b(Context context, f fVar, e eVar, d3.d dVar, p pVar, h0 h0Var, s sVar) {
        AtomicReference<dc.d> atomicReference = new AtomicReference<>();
        this.f4023h = atomicReference;
        this.f4024i = new AtomicReference<>(new h());
        this.f4017a = context;
        this.f4018b = fVar;
        this.d = eVar;
        this.f4019c = dVar;
        this.f4020e = pVar;
        this.f4021f = h0Var;
        this.f4022g = sVar;
        JSONObject jSONObject = new JSONObject();
        atomicReference.set(new dc.e(r3.c.h(eVar, 3600L, jSONObject), null, new dc.c(jSONObject.optInt("max_custom_exception_events", 8), 4), r3.c.f(jSONObject), 0, 3600));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a2 -> B:44:0x00a3). Please submit an issue!!! */
    public final dc.e a(SettingsCacheBehavior settingsCacheBehavior) {
        dc.e eVar = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject e10 = this.f4020e.e();
                if (e10 != null) {
                    dc.e d = this.f4019c.d(e10);
                    if (d == null) {
                        Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                        return null;
                    }
                    c(e10, "Loaded cached settings: ");
                    Objects.requireNonNull(this.d);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior)) {
                        if (d.d < currentTimeMillis) {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                                return null;
                            }
                        }
                    }
                    try {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                        }
                        return d;
                    } catch (Exception e11) {
                        e = e11;
                        eVar = d;
                        Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                        return eVar;
                    }
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                    return null;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        return eVar;
    }

    public dc.d b() {
        return this.f4023h.get();
    }

    public final void c(JSONObject jSONObject, String str) {
        StringBuilder m10 = a1.a.m(str);
        m10.append(jSONObject.toString());
        String sb2 = m10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }
}
