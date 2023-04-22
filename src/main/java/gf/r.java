package gf;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import pe.n;
import pe.o;
import pe.p;
import pe.s;
import pe.u;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f10030l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f10031m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f10032a;

    /* renamed from: b  reason: collision with root package name */
    public final pe.p f10033b;

    /* renamed from: c  reason: collision with root package name */
    public String f10034c;
    public p.a d;

    /* renamed from: e  reason: collision with root package name */
    public final u.a f10035e = new u.a();

    /* renamed from: f  reason: collision with root package name */
    public final o.a f10036f;

    /* renamed from: g  reason: collision with root package name */
    public pe.r f10037g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10038h;

    /* renamed from: i  reason: collision with root package name */
    public s.a f10039i;

    /* renamed from: j  reason: collision with root package name */
    public n.a f10040j;

    /* renamed from: k  reason: collision with root package name */
    public pe.x f10041k;

    /* loaded from: classes2.dex */
    public static class a extends pe.x {

        /* renamed from: a  reason: collision with root package name */
        public final pe.x f10042a;

        /* renamed from: b  reason: collision with root package name */
        public final pe.r f10043b;

        public a(pe.x xVar, pe.r rVar) {
            this.f10042a = xVar;
            this.f10043b = rVar;
        }

        @Override // pe.x
        public long a() {
            return this.f10042a.a();
        }

        @Override // pe.x
        public pe.r b() {
            return this.f10043b;
        }

        @Override // pe.x
        public void c(bf.g gVar) {
            this.f10042a.c(gVar);
        }
    }

    public r(String str, pe.p pVar, String str2, pe.o oVar, pe.r rVar, boolean z10, boolean z11, boolean z12) {
        this.f10032a = str;
        this.f10033b = pVar;
        this.f10034c = str2;
        this.f10037g = rVar;
        this.f10038h = z10;
        if (oVar != null) {
            this.f10036f = oVar.g();
        } else {
            this.f10036f = new o.a();
        }
        if (z11) {
            this.f10040j = new n.a();
        } else if (z12) {
            s.a aVar = new s.a();
            this.f10039i = aVar;
            pe.r type = pe.s.f14009f;
            Objects.requireNonNull(aVar);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.f14006b, "multipart")) {
                aVar.f14017b = type;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
    }

    public void a(String name, String value, boolean z10) {
        if (z10) {
            n.a aVar = this.f10040j;
            Objects.requireNonNull(aVar);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<String> list = aVar.f13979a;
            p.b bVar = pe.p.f13986l;
            list.add(p.b.a(bVar, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f13981c, 83));
            aVar.f13980b.add(p.b.a(bVar, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f13981c, 83));
            return;
        }
        n.a aVar2 = this.f10040j;
        Objects.requireNonNull(aVar2);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        List<String> list2 = aVar2.f13979a;
        p.b bVar2 = pe.p.f13986l;
        list2.add(p.b.a(bVar2, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar2.f13981c, 91));
        aVar2.f13980b.add(p.b.a(bVar2, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar2.f13981c, 91));
    }

    public void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f10036f.a(str, str2);
            return;
        }
        try {
            this.f10037g = pe.r.b(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(a1.a.l("Malformed content type: ", str2), e10);
        }
    }

    public void c(pe.o oVar, pe.x body) {
        s.a aVar = this.f10039i;
        Objects.requireNonNull(aVar);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(body, "body");
        if (!((oVar != null ? oVar.b("Content-Type") : null) == null)) {
            throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
        }
        if (!((oVar != null ? oVar.b("Content-Length") : null) == null)) {
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        s.b part = new s.b(oVar, body, null);
        Intrinsics.checkNotNullParameter(part, "part");
        aVar.f14018c.add(part);
    }

    public void d(String name, String str, boolean z10) {
        String str2 = this.f10034c;
        if (str2 != null) {
            p.a f10 = this.f10033b.f(str2);
            this.d = f10;
            if (f10 == null) {
                StringBuilder m10 = a1.a.m("Malformed URL. Base: ");
                m10.append(this.f10033b);
                m10.append(", Relative: ");
                m10.append(this.f10034c);
                throw new IllegalArgumentException(m10.toString());
            }
            this.f10034c = null;
        }
        if (z10) {
            p.a aVar = this.d;
            Objects.requireNonNull(aVar);
            Intrinsics.checkNotNullParameter(name, "encodedName");
            if (aVar.f14001g == null) {
                aVar.f14001g = new ArrayList();
            }
            List<String> list = aVar.f14001g;
            Intrinsics.checkNotNull(list);
            p.b bVar = pe.p.f13986l;
            list.add(p.b.a(bVar, name, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            List<String> list2 = aVar.f14001g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? p.b.a(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211) : null);
            return;
        }
        p.a aVar2 = this.d;
        Objects.requireNonNull(aVar2);
        Intrinsics.checkNotNullParameter(name, "name");
        if (aVar2.f14001g == null) {
            aVar2.f14001g = new ArrayList();
        }
        List<String> list3 = aVar2.f14001g;
        Intrinsics.checkNotNull(list3);
        p.b bVar2 = pe.p.f13986l;
        list3.add(p.b.a(bVar2, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        List<String> list4 = aVar2.f14001g;
        Intrinsics.checkNotNull(list4);
        list4.add(str != null ? p.b.a(bVar2, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219) : null);
    }
}
