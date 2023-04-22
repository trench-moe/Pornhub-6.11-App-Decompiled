package w9;

/* loaded from: classes2.dex */
public final class c9 implements b9 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17097a;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        f17097a = t4Var.b("measurement.validation.internal_limits_internal_event_params", true);
        t4Var.a("measurement.id.validation.internal_limits_internal_event_params", 0L);
    }

    @Override // w9.b9
    public final boolean zza() {
        return ((Boolean) f17097a.b()).booleanValue();
    }
}
