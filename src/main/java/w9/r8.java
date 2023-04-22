package w9;

/* loaded from: classes2.dex */
public final class r8 implements q8 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17298a;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        t4Var.b("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f17298a = t4Var.b("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    @Override // w9.q8
    public final boolean zza() {
        return true;
    }

    @Override // w9.q8
    public final boolean zzb() {
        return ((Boolean) f17298a.b()).booleanValue();
    }
}
