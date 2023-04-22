package w9;

/* loaded from: classes2.dex */
public final class h8 implements g8 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17185a;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        t4Var.b("measurement.client.consent_state_v1", true);
        t4Var.b("measurement.client.3p_consent_state_v1", true);
        t4Var.b("measurement.service.consent_state_v1_W36", true);
        f17185a = t4Var.a("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // w9.g8
    public final long zza() {
        return ((Long) f17185a.b()).longValue();
    }
}
