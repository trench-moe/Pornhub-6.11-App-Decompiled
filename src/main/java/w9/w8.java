package w9;

/* loaded from: classes2.dex */
public final class w8 implements v8 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17360a;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        f17360a = t4Var.b("measurement.client.sessions.check_on_reset_and_enable2", true);
        t4Var.b("measurement.client.sessions.check_on_startup", true);
        t4Var.b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // w9.v8
    public final boolean zza() {
        return true;
    }

    @Override // w9.v8
    public final boolean zzb() {
        return ((Boolean) f17360a.b()).booleanValue();
    }
}
