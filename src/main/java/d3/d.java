package d3;

import a9.c0;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import b7.k;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.cast.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e9.l;
import h9.r;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import t9.g0;
import t9.h0;
import t9.i0;
import t9.o0;
import t9.r0;
import t9.v;
import u8.k0;
import u8.l0;
import v8.h;
import w9.j4;
import w9.x4;

/* loaded from: classes.dex */
public class d implements x8.a, l, h, j4, x4, tb.b, ub.b, ae.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8751c;

    /* renamed from: f  reason: collision with root package name */
    public Object f8752f;

    public d(int i10) {
        this.f8751c = i10;
        if (i10 != 10) {
            this.f8752f = new HashMap();
        }
    }

    public d(b3.c channelsRepository) {
        this.f8751c = 1;
        Intrinsics.checkNotNullParameter(channelsRepository, "channelsRepository");
        this.f8752f = channelsRepository;
    }

    public d(b3.f dvdsRepository) {
        this.f8751c = 2;
        Intrinsics.checkNotNullParameter(dvdsRepository, "dvdsRepository");
        this.f8752f = dvdsRepository;
    }

    public d(Boolean bool) {
        this.f8751c = 12;
        this.f8752f = new f1.a(bool.booleanValue());
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.f8751c = i10;
        this.f8752f = obj;
    }

    public static String m(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // v8.h
    public void a(v8.f fVar, int i10) {
        g0 g0Var = (g0) this.f8752f;
        a9.b bVar = g0.f15217g;
        g0Var.d((v8.d) fVar);
        Objects.requireNonNull(((g0) this.f8752f).f15222f, "null reference");
        Object obj = this.f8752f;
        ((g0) this.f8752f).f15218a.a(((g0) obj).f15219b.a(((g0) obj).f15222f, i10), 225);
        g0.b((g0) this.f8752f);
        g0 g0Var2 = (g0) this.f8752f;
        g0Var2.d.removeCallbacks(g0Var2.f15220c);
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        switch (this.f8751c) {
            case 4:
                c0 c0Var = (c0) obj;
                a9.f fVar = (a9.f) c0Var.getService();
                k0 k0Var = ((l0) this.f8752f).f15712k;
                Parcel a12 = fVar.a1();
                v.d(a12, k0Var);
                fVar.d1(18, a12);
                a9.f fVar2 = (a9.f) c0Var.getService();
                fVar2.d1(17, fVar2.a1());
                ((ea.h) obj2).f9273a.p(null);
                return;
            default:
                ea.h hVar = (ea.h) obj2;
                j9.a aVar = (j9.a) ((j9.d) obj).getService();
                Parcel a13 = aVar.a1();
                s9.c.b(a13, (r) this.f8752f);
                try {
                    aVar.f14928a.transact(1, a13, null, 1);
                    a13.recycle();
                    hVar.f9273a.p(null);
                    return;
                } catch (Throwable th) {
                    a13.recycle();
                    throw th;
                }
        }
    }

    @Override // ub.b
    public void b(ub.a aVar) {
        this.f8752f = aVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // tb.b
    public void c(String str, Bundle bundle) {
        ub.a aVar = (ub.a) this.f8752f;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + m(str, bundle));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public dc.e d(JSONObject jSONObject) {
        return (jSONObject.getInt("settings_version") != 3 ? new r3.c() : new k()).e((cb.e) this.f8752f, jSONObject);
    }

    @Override // v8.h
    public /* synthetic */ void e(v8.f fVar, int i10) {
        g0.a((g0) this.f8752f, (v8.d) fVar, i10);
    }

    @Override // v8.h
    public void f(v8.f fVar, boolean z10) {
        g0 g0Var = (g0) this.f8752f;
        a9.b bVar = g0.f15217g;
        g0Var.d((v8.d) fVar);
        Objects.requireNonNull(((g0) this.f8752f).f15222f, "null reference");
        g0 g0Var2 = (g0) this.f8752f;
        r0 b10 = g0Var2.f15219b.b(g0Var2.f15222f);
        i0.c(b10, z10);
        ((g0) this.f8752f).f15218a.a(b10.c(), 227);
        g0.b((g0) this.f8752f);
        g0 g0Var3 = (g0) this.f8752f;
        Handler handler = g0Var3.d;
        Objects.requireNonNull(handler, "null reference");
        Runnable runnable = g0Var3.f15220c;
        Objects.requireNonNull(runnable, "null reference");
        handler.postDelayed(runnable, 300000L);
    }

    @Override // v8.h
    public /* bridge */ /* synthetic */ void g(v8.f fVar) {
        v8.d dVar = (v8.d) fVar;
    }

    @Override // v8.h
    public void h(v8.f fVar, String str) {
        g0 g0Var = (g0) this.f8752f;
        a9.b bVar = g0.f15217g;
        g0Var.d((v8.d) fVar);
        g0 g0Var2 = (g0) this.f8752f;
        h0 h0Var = g0Var2.f15222f;
        h0Var.f15235e = str;
        ((g0) this.f8752f).f15218a.a(g0Var2.f15219b.b(h0Var).c(), 222);
        g0.b((g0) this.f8752f);
        g0 g0Var3 = (g0) this.f8752f;
        Handler handler = g0Var3.d;
        Objects.requireNonNull(handler, "null reference");
        Runnable runnable = g0Var3.f15220c;
        Objects.requireNonNull(runnable, "null reference");
        handler.postDelayed(runnable, 300000L);
    }

    @Override // x8.a
    public void i(Bitmap bitmap) {
        a9.b bVar = x8.k.C;
        ((x8.k) this.f8752f).h(bitmap, 3);
    }

    @Override // v8.h
    public void j(v8.f fVar, String str) {
        v8.d dVar = (v8.d) fVar;
        g0 g0Var = (g0) this.f8752f;
        SharedPreferences sharedPreferences = g0Var.f15221e;
        if (g0Var.g(str)) {
            g0.f15217g.a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            Objects.requireNonNull(g0Var.f15222f, "null reference");
        } else {
            a9.b bVar = h0.f15230i;
            h0 h0Var = null;
            if (sharedPreferences != null) {
                h0 h0Var2 = new h0();
                if (sharedPreferences.contains("application_id")) {
                    h0Var2.f15232a = sharedPreferences.getString("application_id", BuildConfig.FLAVOR);
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        h0Var2.f15233b = sharedPreferences.getString("receiver_metrics_id", BuildConfig.FLAVOR);
                        if (sharedPreferences.contains("analytics_session_id")) {
                            h0Var2.f15234c = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                h0Var2.d = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    h0Var2.f15235e = sharedPreferences.getString("receiver_session_id", BuildConfig.FLAVOR);
                                    h0Var2.f15236f = sharedPreferences.getInt("device_capabilities", 0);
                                    h0Var2.f15237g = sharedPreferences.getString("device_model_name", BuildConfig.FLAVOR);
                                    h0Var2.f15238h = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    h0Var = h0Var2;
                                }
                            }
                        }
                    }
                }
            }
            g0Var.f15222f = h0Var;
            if (g0Var.g(str)) {
                g0.f15217g.a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                Objects.requireNonNull(g0Var.f15222f, "null reference");
                h0.f15231j = g0Var.f15222f.f15234c + 1;
            } else {
                g0.f15217g.a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                h0 h0Var3 = new h0();
                h0.f15231j++;
                g0Var.f15222f = h0Var3;
                h0Var3.f15232a = g0.c();
                g0Var.f15222f.f15235e = str;
            }
        }
        Objects.requireNonNull(((g0) this.f8752f).f15222f, "null reference");
        Object obj = this.f8752f;
        r0 b10 = ((g0) obj).f15219b.b(((g0) obj).f15222f);
        o0 n = i.n(b10.l());
        n.l(10);
        b10.o(n.c());
        i0.c(b10, true);
        ((g0) this.f8752f).f15218a.a(b10.c(), 226);
    }

    @Override // v8.h
    public void k(v8.f fVar) {
        v8.d dVar = (v8.d) fVar;
        if (((g0) this.f8752f).f15222f != null) {
            a9.b bVar = g0.f15217g;
            Log.w(bVar.f254a, bVar.e("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        ((g0) this.f8752f).e(dVar);
        Object obj = this.f8752f;
        i0 i0Var = ((g0) obj).f15219b;
        h0 h0Var = ((g0) obj).f15222f;
        r0 b10 = i0Var.b(h0Var);
        if (h0Var.f15238h == 1) {
            o0 n = i.n(b10.l());
            n.l(17);
            b10.o(n.c());
        }
        ((g0) this.f8752f).f15218a.a(b10.c(), 221);
    }

    @Override // v8.h
    public /* synthetic */ void l(v8.f fVar, int i10) {
        g0.a((g0) this.f8752f, (v8.d) fVar, i10);
    }

    @Override // v8.h
    public /* synthetic */ void n(v8.f fVar, int i10) {
        g0.a((g0) this.f8752f, (v8.d) fVar, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (r4.equals("userdebug") == false) goto L32;
     */
    @Override // w9.j4, w9.x4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object zza() {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.d.zza():java.lang.Object");
    }
}
