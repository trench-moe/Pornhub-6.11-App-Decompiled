package w9;

/* loaded from: classes2.dex */
public final class e9 implements d9 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17126a;

    /* renamed from: b  reason: collision with root package name */
    public static final v4 f17127b;

    /* renamed from: c  reason: collision with root package name */
    public static final v4 f17128c;
    public static final v4 d;

    /* renamed from: e  reason: collision with root package name */
    public static final v4 f17129e;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        f17126a = t4Var.b("measurement.test.boolean_flag", false);
        f17127b = new r4(t4Var, Double.valueOf(-3.0d));
        f17128c = t4Var.a("measurement.test.int_flag", -2L);
        d = t4Var.a("measurement.test.long_flag", -1L);
        f17129e = new s4(t4Var, "measurement.test.string_flag", "---");
    }

    @Override // w9.d9
    public final long a() {
        return ((Long) d.b()).longValue();
    }

    @Override // w9.d9
    public final String c() {
        return (String) f17129e.b();
    }

    @Override // w9.d9
    public final boolean d() {
        return ((Boolean) f17126a.b()).booleanValue();
    }

    @Override // w9.d9
    public final double zza() {
        return ((Double) f17127b.b()).doubleValue();
    }

    @Override // w9.d9
    public final long zzb() {
        return ((Long) f17128c.b()).longValue();
    }
}
