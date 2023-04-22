package w9;

/* loaded from: classes2.dex */
public final class x7 implements w7 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17365a;

    /* renamed from: b  reason: collision with root package name */
    public static final v4 f17366b;

    /* renamed from: c  reason: collision with root package name */
    public static final v4 f17367c;
    public static final v4 d;

    /* renamed from: e  reason: collision with root package name */
    public static final v4 f17368e;

    /* renamed from: f  reason: collision with root package name */
    public static final v4 f17369f;

    static {
        t4 t4Var = new t4(null, o4.a("com.google.android.gms.measurement"), true);
        f17365a = t4Var.b("measurement.adid_zero.app_instance_id_fix", true);
        f17366b = t4Var.b("measurement.adid_zero.service", true);
        f17367c = t4Var.b("measurement.adid_zero.adid_uid", false);
        t4Var.a("measurement.id.adid_zero.service", 0L);
        d = t4Var.b("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f17368e = t4Var.b("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        f17369f = t4Var.b("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    @Override // w9.w7
    public final boolean a() {
        return ((Boolean) f17366b.b()).booleanValue();
    }

    @Override // w9.w7
    public final boolean b() {
        return ((Boolean) f17369f.b()).booleanValue();
    }

    @Override // w9.w7
    public final boolean c() {
        return ((Boolean) f17367c.b()).booleanValue();
    }

    @Override // w9.w7
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // w9.w7
    public final boolean e() {
        return ((Boolean) f17368e.b()).booleanValue();
    }

    @Override // w9.w7
    public final boolean zza() {
        return true;
    }

    @Override // w9.w7
    public final boolean zzb() {
        return ((Boolean) f17365a.b()).booleanValue();
    }
}
