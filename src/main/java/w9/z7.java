package w9;

/* loaded from: classes2.dex */
public final class z7 implements y7 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17393a;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        f17393a = t4Var.b("measurement.androidId.delete_feature", true);
        t4Var.b("measurement.log_androidId_enabled", false);
    }

    @Override // w9.y7
    public final boolean zza() {
        return ((Boolean) f17393a.b()).booleanValue();
    }
}
