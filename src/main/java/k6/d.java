package k6;

/* loaded from: classes2.dex */
public final class d implements gc.d<l> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f11834a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f11835b = gc.c.a("eventTimeMs");

    /* renamed from: c  reason: collision with root package name */
    public static final gc.c f11836c = gc.c.a("eventCode");
    public static final gc.c d = gc.c.a("eventUptimeMs");

    /* renamed from: e  reason: collision with root package name */
    public static final gc.c f11837e = gc.c.a("sourceExtension");

    /* renamed from: f  reason: collision with root package name */
    public static final gc.c f11838f = gc.c.a("sourceExtensionJsonProto3");

    /* renamed from: g  reason: collision with root package name */
    public static final gc.c f11839g = gc.c.a("timezoneOffsetSeconds");

    /* renamed from: h  reason: collision with root package name */
    public static final gc.c f11840h = gc.c.a("networkConnectionInfo");

    @Override // gc.b
    public void a(Object obj, gc.e eVar) {
        l lVar = (l) obj;
        gc.e eVar2 = eVar;
        eVar2.a(f11835b, lVar.b());
        eVar2.f(f11836c, lVar.a());
        eVar2.a(d, lVar.c());
        eVar2.f(f11837e, lVar.e());
        eVar2.f(f11838f, lVar.f());
        eVar2.a(f11839g, lVar.g());
        eVar2.f(f11840h, lVar.d());
    }
}
