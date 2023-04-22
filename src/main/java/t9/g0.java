package t9;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.databinding.ViewDataBinding;
import com.google.android.gms.cast.CastDevice;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: g  reason: collision with root package name */
    public static final a9.b f15217g = new a9.b("ApplicationAnalytics");

    /* renamed from: a  reason: collision with root package name */
    public final y f15218a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f15219b;

    /* renamed from: e  reason: collision with root package name */
    public final SharedPreferences f15221e;

    /* renamed from: f  reason: collision with root package name */
    public h0 f15222f;
    public final Handler d = new x(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f15220c = new a9.p(this, 2);

    public g0(SharedPreferences sharedPreferences, y yVar, Bundle bundle, String str) {
        this.f15221e = sharedPreferences;
        this.f15218a = yVar;
        this.f15219b = new i0(bundle, str);
    }

    public static void a(g0 g0Var, v8.d dVar, int i10) {
        g0Var.d(dVar);
        g0Var.f15218a.a(g0Var.f15219b.a(g0Var.f15222f, i10), 228);
        g0Var.d.removeCallbacks(g0Var.f15220c);
        g0Var.f15222f = null;
    }

    public static void b(g0 g0Var) {
        h0 h0Var = g0Var.f15222f;
        SharedPreferences sharedPreferences = g0Var.f15221e;
        Objects.requireNonNull(h0Var);
        if (sharedPreferences == null) {
            return;
        }
        h0.f15230i.a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", h0Var.f15232a);
        edit.putString("receiver_metrics_id", h0Var.f15233b);
        edit.putLong("analytics_session_id", h0Var.f15234c);
        edit.putInt("event_sequence_number", h0Var.d);
        edit.putString("receiver_session_id", h0Var.f15235e);
        edit.putInt("device_capabilities", h0Var.f15236f);
        edit.putString("device_model_name", h0Var.f15237g);
        edit.putInt("analytics_session_start_type", h0Var.f15238h);
        edit.apply();
    }

    @Pure
    public static String c() {
        a9.b bVar = v8.b.f16060i;
        h9.o.d("Must be called from the main thread.");
        v8.b bVar2 = v8.b.f16062k;
        Objects.requireNonNull(bVar2, "null reference");
        return bVar2.a().f16070c;
    }

    @EnsuresNonNull({"analyticsSession"})
    public final void d(v8.d dVar) {
        h0 h0Var;
        if (!f()) {
            a9.b bVar = f15217g;
            Log.w(bVar.f254a, bVar.e("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            e(dVar);
            return;
        }
        CastDevice k10 = dVar != null ? dVar.k() : null;
        if (k10 != null && !TextUtils.equals(this.f15222f.f15233b, k10.B) && (h0Var = this.f15222f) != null) {
            h0Var.f15233b = k10.B;
            h0Var.f15236f = k10.y;
            h0Var.f15237g = k10.n;
        }
        Objects.requireNonNull(this.f15222f, "null reference");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"analyticsSession"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(v8.d r11) {
        /*
            r10 = this;
            r7 = r10
            a9.b r0 = t9.g0.f15217g
            r9 = 0
            r1 = r9
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 2
            java.lang.String r9 = "Create a new ApplicationAnalyticsSession based on CastSession"
            r3 = r9
            r0.a(r3, r2)
            t9.h0 r0 = new t9.h0
            r9 = 1
            r0.<init>()
            long r2 = t9.h0.f15231j
            r9 = 6
            r4 = 1
            long r2 = r2 + r4
            r9 = 6
            t9.h0.f15231j = r2
            r9 = 7
            r7.f15222f = r0
            r9 = 5
            java.lang.String r2 = c()
            r0.f15232a = r2
            r9 = 3
            if (r11 != 0) goto L2e
            r9 = 3
            r9 = 0
            r0 = r9
            goto L32
        L2e:
            com.google.android.gms.cast.CastDevice r0 = r11.k()
        L32:
            if (r0 == 0) goto L48
            t9.h0 r2 = r7.f15222f
            if (r2 != 0) goto L3a
            r9 = 1
            goto L49
        L3a:
            r9 = 5
            java.lang.String r3 = r0.B
            r2.f15233b = r3
            int r3 = r0.y
            r9 = 7
            r2.f15236f = r3
            java.lang.String r0 = r0.n
            r2.f15237g = r0
        L48:
            r9 = 1
        L49:
            t9.h0 r0 = r7.f15222f
            r9 = 1
            java.lang.String r2 = "null reference"
            r9 = 6
            java.util.Objects.requireNonNull(r0, r2)
            t9.h0 r0 = r7.f15222f
            r9 = 6
            if (r11 != 0) goto L58
            goto L92
        L58:
            r9 = 5
            java.lang.String r3 = "Must be called from the main thread."
            r9 = 6
            h9.o.d(r3)
            v8.r r3 = r11.f16092a
            if (r3 == 0) goto L91
            int r3 = r3.d()     // Catch: android.os.RemoteException -> L74
            r4 = 211100000(0xc952160, float:2.2977172E-31)
            if (r3 < r4) goto L91
            v8.r r11 = r11.f16092a     // Catch: android.os.RemoteException -> L74
            int r9 = r11.e()     // Catch: android.os.RemoteException -> L74
            r1 = r9
            goto L92
        L74:
            r11 = move-exception
            a9.b r3 = v8.f.f16091b
            r4 = 2
            r9 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "getSessionStartType"
            r9 = 4
            r4[r1] = r5
            r9 = 1
            r5 = r9
            java.lang.Class<v8.r> r6 = v8.r.class
            java.lang.String r6 = r6.getSimpleName()
            r4[r5] = r6
            java.lang.String r9 = "Unable to call %s on %s."
            r5 = r9
            r3.b(r11, r5, r4)
            r9 = 4
        L91:
            r9 = 3
        L92:
            r0.f15238h = r1
            r9 = 4
            t9.h0 r11 = r7.f15222f
            r9 = 7
            java.util.Objects.requireNonNull(r11, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.g0.e(v8.d):void");
    }

    @EnsuresNonNullIf(expression = {"analyticsSession"}, result = ViewDataBinding.f1896i)
    public final boolean f() {
        String str;
        if (this.f15222f == null) {
            f15217g.a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String c10 = c();
        if (c10 != null && (str = this.f15222f.f15232a) != null) {
            if (TextUtils.equals(str, c10)) {
                Objects.requireNonNull(this.f15222f, "null reference");
                return true;
            }
        }
        f15217g.a("The analytics session doesn't match the application ID %s", c10);
        return false;
    }

    public final boolean g(String str) {
        String str2;
        if (f()) {
            Objects.requireNonNull(this.f15222f, "null reference");
            if (str != null && (str2 = this.f15222f.f15235e) != null && TextUtils.equals(str2, str)) {
                return true;
            }
            f15217g.a("The analytics session doesn't match the receiver session ID %s.", str);
            return false;
        }
        return false;
    }
}
