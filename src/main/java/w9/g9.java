package w9;

/* loaded from: classes2.dex */
public final class g9 implements f9 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17169a;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        t4Var.b("measurement.module.pixie.ees", true);
        f17169a = t4Var.b("measurement.module.pixie.fix_array", true);
    }

    @Override // w9.f9
    public final boolean zza() {
        return true;
    }

    @Override // w9.f9
    public final boolean zzb() {
        return ((Boolean) f17169a.b()).booleanValue();
    }
}
