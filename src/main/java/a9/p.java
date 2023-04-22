package a9;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.zzju;
import e9.p0;
import java.util.ArrayList;
import java.util.Objects;
import t9.g0;
import t9.h0;
import t9.m0;
import t9.n0;
import t9.r0;
import t9.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f301c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f302f;

    public /* synthetic */ p(Object obj, int i10) {
        this.f301c = i10;
        this.f302f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f301c) {
            case 0:
                q qVar = (q) this.f302f;
                synchronized (q.f304g) {
                    if (qVar.f307c == -1) {
                        return;
                    }
                    qVar.f(15, null);
                    return;
                }
            case 1:
                ((e9.c0) ((p0) this.f302f).f9242g).b(new c9.b(4));
                return;
            case 2:
                g0 g0Var = (g0) this.f302f;
                h0 h0Var = g0Var.f15222f;
                if (h0Var != null) {
                    g0Var.f15218a.a(g0Var.f15219b.b(h0Var).c(), 223);
                }
                Handler handler = g0Var.d;
                Objects.requireNonNull(handler, "null reference");
                Runnable runnable = g0Var.f15220c;
                Objects.requireNonNull(runnable, "null reference");
                handler.postDelayed(runnable, 300000L);
                return;
            case 3:
                t0 t0Var = (t0) this.f302f;
                if (t0Var.f15350f.isEmpty()) {
                    return;
                }
                long j10 = true != t0Var.f15351g.equals(t0Var.f15350f) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = t0Var.f15352h;
                if (j11 == 0 || currentTimeMillis - j11 >= j10) {
                    t0.f15343i.a("Upload the feature usage report.", new Object[0]);
                    n0 m10 = com.google.android.gms.internal.cast.h.m();
                    String str = t0.f15344j;
                    if (m10.f15273j) {
                        m10.j();
                        m10.f15273j = false;
                    }
                    com.google.android.gms.internal.cast.h.p((com.google.android.gms.internal.cast.h) m10.f15272f, str);
                    String str2 = t0Var.f15348c;
                    if (m10.f15273j) {
                        m10.j();
                        m10.f15273j = false;
                    }
                    com.google.android.gms.internal.cast.h.o((com.google.android.gms.internal.cast.h) m10.f15272f, str2);
                    com.google.android.gms.internal.cast.h c10 = m10.c();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(t0Var.f15350f);
                    m0 m11 = com.google.android.gms.internal.cast.e.m();
                    if (m11.f15273j) {
                        m11.j();
                        m11.f15273j = false;
                    }
                    com.google.android.gms.internal.cast.e.p((com.google.android.gms.internal.cast.e) m11.f15272f, arrayList);
                    if (m11.f15273j) {
                        m11.j();
                        m11.f15273j = false;
                    }
                    com.google.android.gms.internal.cast.e.o((com.google.android.gms.internal.cast.e) m11.f15272f, c10);
                    com.google.android.gms.internal.cast.e c11 = m11.c();
                    r0 n = com.google.android.gms.internal.cast.m.n();
                    if (n.f15273j) {
                        n.j();
                        n.f15273j = false;
                    }
                    com.google.android.gms.internal.cast.m.t((com.google.android.gms.internal.cast.m) n.f15272f, c11);
                    t0Var.f15346a.a(n.c(), 243);
                    SharedPreferences.Editor edit = t0Var.f15347b.edit();
                    if (!t0Var.f15351g.equals(t0Var.f15350f)) {
                        t0Var.f15351g.clear();
                        t0Var.f15351g.addAll(t0Var.f15350f);
                        for (zzju zzjuVar : t0Var.f15351g) {
                            String num = Integer.toString(zzjuVar.zza());
                            String c12 = t0Var.c(num);
                            String a10 = t0.a("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(c12, a10)) {
                                long j12 = t0Var.f15347b.getLong(c12, 0L);
                                edit.remove(c12);
                                if (j12 != 0) {
                                    edit.putLong(a10, j12);
                                }
                            }
                        }
                    }
                    t0Var.f15352h = currentTimeMillis;
                    edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                }
                return;
            default:
                synchronized (((ea.n) this.f302f).f9293j) {
                    Object obj = ((ea.n) this.f302f).f9294m;
                    if (((ea.b) obj) != null) {
                        ((ea.b) obj).l();
                    }
                }
                return;
        }
    }
}
