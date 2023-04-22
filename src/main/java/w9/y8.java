package w9;

/* loaded from: classes2.dex */
public final class y8 implements x8 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17384a;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        t4Var.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        t4Var.b("measurement.sdk.collection.last_deep_link_referrer2", true);
        f17384a = t4Var.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        t4Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // w9.x8
    public final boolean zza() {
        return ((Boolean) f17384a.b()).booleanValue();
    }
}
