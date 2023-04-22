package w9;

/* loaded from: classes2.dex */
public final class l8 implements k8 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17230a;

    /* renamed from: b  reason: collision with root package name */
    public static final v4 f17231b;

    static {
        t4 t4Var = new t4(null, o4.a("com.google.android.gms.measurement"), true);
        t4Var.b("measurement.collection.event_safelist", true);
        f17230a = t4Var.b("measurement.service.store_null_safelist", false);
        f17231b = t4Var.b("measurement.service.store_safelist", false);
        t4Var.a("measurement.id.service.store_safelist", 0L);
    }

    @Override // w9.k8
    public final boolean a() {
        return ((Boolean) f17231b.b()).booleanValue();
    }

    @Override // w9.k8
    public final boolean zza() {
        return true;
    }

    @Override // w9.k8
    public final boolean zzb() {
        return ((Boolean) f17230a.b()).booleanValue();
    }
}
