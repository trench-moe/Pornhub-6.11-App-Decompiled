package k6;

/* loaded from: classes2.dex */
public final class e implements gc.d<m> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f11841a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f11842b = gc.c.a("requestTimeMs");

    /* renamed from: c  reason: collision with root package name */
    public static final gc.c f11843c = gc.c.a("requestUptimeMs");
    public static final gc.c d = gc.c.a("clientInfo");

    /* renamed from: e  reason: collision with root package name */
    public static final gc.c f11844e = gc.c.a("logSource");

    /* renamed from: f  reason: collision with root package name */
    public static final gc.c f11845f = gc.c.a("logSourceName");

    /* renamed from: g  reason: collision with root package name */
    public static final gc.c f11846g = gc.c.a("logEvent");

    /* renamed from: h  reason: collision with root package name */
    public static final gc.c f11847h = gc.c.a("qosTier");

    @Override // gc.b
    public void a(Object obj, gc.e eVar) {
        m mVar = (m) obj;
        gc.e eVar2 = eVar;
        eVar2.a(f11842b, mVar.f());
        eVar2.a(f11843c, mVar.g());
        eVar2.f(d, mVar.a());
        eVar2.f(f11844e, mVar.c());
        eVar2.f(f11845f, mVar.d());
        eVar2.f(f11846g, mVar.b());
        eVar2.f(f11847h, mVar.e());
    }
}
