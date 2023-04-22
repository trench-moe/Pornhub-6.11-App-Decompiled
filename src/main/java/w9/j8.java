package w9;

/* loaded from: classes2.dex */
public final class j8 implements i8 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17209a;

    /* renamed from: b  reason: collision with root package name */
    public static final v4 f17210b;

    static {
        t4 t4Var = new t4(null, o4.a("com.google.android.gms.measurement"), true);
        f17209a = t4Var.b("measurement.enhanced_campaign.client", false);
        f17210b = t4Var.b("measurement.enhanced_campaign.service", false);
    }

    @Override // w9.i8
    public final boolean a() {
        return ((Boolean) f17210b.b()).booleanValue();
    }

    @Override // w9.i8
    public final boolean zza() {
        return true;
    }

    @Override // w9.i8
    public final boolean zzb() {
        return ((Boolean) f17209a.b()).booleanValue();
    }
}
