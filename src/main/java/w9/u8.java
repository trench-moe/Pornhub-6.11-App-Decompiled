package w9;

/* loaded from: classes2.dex */
public final class u8 implements t8 {

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17329a;

    /* renamed from: b  reason: collision with root package name */
    public static final v4 f17330b;

    /* renamed from: c  reason: collision with root package name */
    public static final v4 f17331c;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        t4Var.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f17329a = t4Var.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f17330b = t4Var.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f17331c = t4Var.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // w9.t8
    public final boolean a() {
        return ((Boolean) f17330b.b()).booleanValue();
    }

    @Override // w9.t8
    public final boolean c() {
        return ((Boolean) f17331c.b()).booleanValue();
    }

    @Override // w9.t8
    public final boolean zza() {
        return true;
    }

    @Override // w9.t8
    public final boolean zzb() {
        return ((Boolean) f17329a.b()).booleanValue();
    }
}
