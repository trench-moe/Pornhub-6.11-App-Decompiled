package w9;

/* loaded from: classes2.dex */
public final class a9 implements z8 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17070a;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        t4Var.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        t4Var.b("measurement.lifecycle.app_backgrounded_tracking", true);
        f17070a = t4Var.b("measurement.lifecycle.app_in_background_parameter", false);
        t4Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // w9.z8
    public final boolean zza() {
        return ((Boolean) f17070a.b()).booleanValue();
    }
}
