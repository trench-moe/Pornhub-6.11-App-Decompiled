package w9;

/* loaded from: classes2.dex */
public final class f8 implements e8 {
    public static final v4 A;
    public static final v4 B;
    public static final v4 C;
    public static final v4 D;
    public static final v4 E;
    public static final v4 F;
    public static final v4 G;
    public static final v4 H;
    public static final v4 I;

    /* renamed from: a  reason: collision with root package name */
    public static final v4 f17136a;

    /* renamed from: b  reason: collision with root package name */
    public static final v4 f17137b;

    /* renamed from: c  reason: collision with root package name */
    public static final v4 f17138c;
    public static final v4 d;

    /* renamed from: e  reason: collision with root package name */
    public static final v4 f17139e;

    /* renamed from: f  reason: collision with root package name */
    public static final v4 f17140f;

    /* renamed from: g  reason: collision with root package name */
    public static final v4 f17141g;

    /* renamed from: h  reason: collision with root package name */
    public static final v4 f17142h;

    /* renamed from: i  reason: collision with root package name */
    public static final v4 f17143i;

    /* renamed from: j  reason: collision with root package name */
    public static final v4 f17144j;

    /* renamed from: k  reason: collision with root package name */
    public static final v4 f17145k;

    /* renamed from: l  reason: collision with root package name */
    public static final v4 f17146l;

    /* renamed from: m  reason: collision with root package name */
    public static final v4 f17147m;
    public static final v4 n;

    /* renamed from: o  reason: collision with root package name */
    public static final v4 f17148o;

    /* renamed from: p  reason: collision with root package name */
    public static final v4 f17149p;

    /* renamed from: q  reason: collision with root package name */
    public static final v4 f17150q;

    /* renamed from: r  reason: collision with root package name */
    public static final v4 f17151r;

    /* renamed from: s  reason: collision with root package name */
    public static final v4 f17152s;

    /* renamed from: t  reason: collision with root package name */
    public static final v4 f17153t;

    /* renamed from: u  reason: collision with root package name */
    public static final v4 f17154u;

    /* renamed from: v  reason: collision with root package name */
    public static final v4 f17155v;

    /* renamed from: w  reason: collision with root package name */
    public static final v4 f17156w;

    /* renamed from: x  reason: collision with root package name */
    public static final v4 f17157x;
    public static final v4 y;

    /* renamed from: z  reason: collision with root package name */
    public static final v4 f17158z;

    static {
        t4 t4Var = new t4(o4.a("com.google.android.gms.measurement"));
        f17136a = t4Var.a("measurement.ad_id_cache_time", 10000L);
        f17137b = t4Var.a("measurement.max_bundles_per_iteration", 100L);
        f17138c = t4Var.a("measurement.config.cache_time", 86400000L);
        new s4(t4Var, "measurement.log_tag", "FA");
        d = new s4(t4Var, "measurement.config.url_authority", "app-measurement.com");
        f17139e = new s4(t4Var, "measurement.config.url_scheme", "https");
        f17140f = t4Var.a("measurement.upload.debug_upload_interval", 1000L);
        f17141g = t4Var.a("measurement.lifetimevalue.max_currency_tracked", 4L);
        f17142h = t4Var.a("measurement.store.max_stored_events_per_app", 100000L);
        f17143i = t4Var.a("measurement.experiment.max_ids", 50L);
        f17144j = t4Var.a("measurement.audience.filter_result_max_count", 200L);
        f17145k = t4Var.a("measurement.alarm_manager.minimum_interval", 60000L);
        f17146l = t4Var.a("measurement.upload.minimum_delay", 500L);
        f17147m = t4Var.a("measurement.monitoring.sample_period_millis", 86400000L);
        n = t4Var.a("measurement.upload.realtime_upload_interval", 10000L);
        f17148o = t4Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        t4Var.a("measurement.config.cache_time.service", 3600000L);
        f17149p = t4Var.a("measurement.service_client.idle_disconnect_millis", 5000L);
        new s4(t4Var, "measurement.log_tag.service", "FA-SVC");
        f17150q = t4Var.a("measurement.upload.stale_data_deletion_interval", 86400000L);
        f17151r = t4Var.a("measurement.sdk.attribution.cache.ttl", 604800000L);
        f17152s = t4Var.a("measurement.upload.backoff_period", 43200000L);
        f17153t = t4Var.a("measurement.upload.initial_upload_delay_time", 15000L);
        f17154u = t4Var.a("measurement.upload.interval", 3600000L);
        f17155v = t4Var.a("measurement.upload.max_bundle_size", 65536L);
        f17156w = t4Var.a("measurement.upload.max_bundles", 100L);
        f17157x = t4Var.a("measurement.upload.max_conversions_per_day", 500L);
        y = t4Var.a("measurement.upload.max_error_events_per_day", 1000L);
        f17158z = t4Var.a("measurement.upload.max_events_per_bundle", 1000L);
        A = t4Var.a("measurement.upload.max_events_per_day", 100000L);
        B = t4Var.a("measurement.upload.max_public_events_per_day", 50000L);
        C = t4Var.a("measurement.upload.max_queue_time", 2419200000L);
        D = t4Var.a("measurement.upload.max_realtime_events_per_day", 10L);
        E = t4Var.a("measurement.upload.max_batch_size", 65536L);
        F = t4Var.a("measurement.upload.retry_count", 6L);
        G = t4Var.a("measurement.upload.retry_time", 1800000L);
        H = new s4(t4Var, "measurement.upload.url", "https://app-measurement.com/a");
        I = t4Var.a("measurement.upload.window_interval", 3600000L);
    }

    @Override // w9.e8
    public final String A() {
        return (String) f17139e.b();
    }

    @Override // w9.e8
    public final String B() {
        return (String) H.b();
    }

    @Override // w9.e8
    public final long C() {
        return ((Long) C.b()).longValue();
    }

    @Override // w9.e8
    public final long a() {
        return ((Long) f17138c.b()).longValue();
    }

    @Override // w9.e8
    public final long b() {
        return ((Long) f17143i.b()).longValue();
    }

    @Override // w9.e8
    public final long c() {
        return ((Long) f17140f.b()).longValue();
    }

    @Override // w9.e8
    public final long d() {
        return ((Long) f17141g.b()).longValue();
    }

    @Override // w9.e8
    public final long e() {
        return ((Long) f17142h.b()).longValue();
    }

    @Override // w9.e8
    public final long f() {
        return ((Long) f17152s.b()).longValue();
    }

    @Override // w9.e8
    public final long g() {
        return ((Long) f17150q.b()).longValue();
    }

    @Override // w9.e8
    public final long h() {
        return ((Long) n.b()).longValue();
    }

    @Override // w9.e8
    public final long i() {
        return ((Long) f17158z.b()).longValue();
    }

    @Override // w9.e8
    public final long j() {
        return ((Long) f17151r.b()).longValue();
    }

    @Override // w9.e8
    public final long k() {
        return ((Long) f17154u.b()).longValue();
    }

    @Override // w9.e8
    public final long l() {
        return ((Long) I.b()).longValue();
    }

    @Override // w9.e8
    public final long m() {
        return ((Long) A.b()).longValue();
    }

    @Override // w9.e8
    public final long n() {
        return ((Long) B.b()).longValue();
    }

    @Override // w9.e8
    public final String o() {
        return (String) d.b();
    }

    @Override // w9.e8
    public final long p() {
        return ((Long) f17153t.b()).longValue();
    }

    @Override // w9.e8
    public final long q() {
        return ((Long) f17149p.b()).longValue();
    }

    @Override // w9.e8
    public final long r() {
        return ((Long) y.b()).longValue();
    }

    @Override // w9.e8
    public final long s() {
        return ((Long) F.b()).longValue();
    }

    @Override // w9.e8
    public final long t() {
        return ((Long) f17155v.b()).longValue();
    }

    @Override // w9.e8
    public final long u() {
        return ((Long) G.b()).longValue();
    }

    @Override // w9.e8
    public final long v() {
        return ((Long) D.b()).longValue();
    }

    @Override // w9.e8
    public final long w() {
        return ((Long) f17156w.b()).longValue();
    }

    @Override // w9.e8
    public final long x() {
        return ((Long) f17148o.b()).longValue();
    }

    @Override // w9.e8
    public final long y() {
        return ((Long) f17157x.b()).longValue();
    }

    @Override // w9.e8
    public final long z() {
        return ((Long) E.b()).longValue();
    }

    @Override // w9.e8
    public final long zza() {
        return ((Long) f17136a.b()).longValue();
    }

    @Override // w9.e8
    public final long zzb() {
        return ((Long) f17137b.b()).longValue();
    }

    @Override // w9.e8
    public final long zzh() {
        return ((Long) f17144j.b()).longValue();
    }

    @Override // w9.e8
    public final long zzi() {
        return ((Long) f17145k.b()).longValue();
    }

    @Override // w9.e8
    public final long zzj() {
        return ((Long) f17146l.b()).longValue();
    }

    @Override // w9.e8
    public final long zzk() {
        return ((Long) f17147m.b()).longValue();
    }
}
