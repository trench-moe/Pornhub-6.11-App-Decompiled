package w6;

import android.net.Uri;
import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16452a;

    /* renamed from: b  reason: collision with root package name */
    public final g f16453b;

    /* renamed from: c  reason: collision with root package name */
    public final f f16454c;
    public final d0 d;

    /* renamed from: e  reason: collision with root package name */
    public final d f16455e;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f16456a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f16457b;

        public b(Uri uri, Object obj, a aVar) {
            this.f16456a = uri;
            this.f16457b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f16456a.equals(bVar.f16456a) && k8.c0.a(this.f16457b, bVar.f16457b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f16456a.hashCode() * 31;
            Object obj = this.f16457b;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public String f16458a;

        /* renamed from: b  reason: collision with root package name */
        public Uri f16459b;

        /* renamed from: c  reason: collision with root package name */
        public String f16460c;
        public long d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16461e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16462f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f16463g;

        /* renamed from: h  reason: collision with root package name */
        public Uri f16464h;

        /* renamed from: j  reason: collision with root package name */
        public UUID f16466j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f16467k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f16468l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f16469m;

        /* renamed from: o  reason: collision with root package name */
        public byte[] f16470o;

        /* renamed from: q  reason: collision with root package name */
        public String f16472q;

        /* renamed from: s  reason: collision with root package name */
        public Uri f16474s;

        /* renamed from: t  reason: collision with root package name */
        public Object f16475t;

        /* renamed from: u  reason: collision with root package name */
        public Object f16476u;

        /* renamed from: v  reason: collision with root package name */
        public d0 f16477v;
        public List<Integer> n = Collections.emptyList();

        /* renamed from: i  reason: collision with root package name */
        public Map<String, String> f16465i = Collections.emptyMap();

        /* renamed from: p  reason: collision with root package name */
        public List<Object> f16471p = Collections.emptyList();

        /* renamed from: r  reason: collision with root package name */
        public List<h> f16473r = Collections.emptyList();

        /* renamed from: w  reason: collision with root package name */
        public long f16478w = -9223372036854775807L;

        /* renamed from: x  reason: collision with root package name */
        public long f16479x = -9223372036854775807L;
        public long y = -9223372036854775807L;

        /* renamed from: z  reason: collision with root package name */
        public float f16480z = -3.4028235E38f;
        public float A = -3.4028235E38f;

        public c0 a() {
            g gVar;
            k8.a.f(this.f16464h == null || this.f16466j != null);
            Uri uri = this.f16459b;
            if (uri != null) {
                String str = this.f16460c;
                UUID uuid = this.f16466j;
                e eVar = uuid != null ? new e(uuid, this.f16464h, this.f16465i, this.f16467k, this.f16469m, this.f16468l, this.n, this.f16470o, null) : null;
                Uri uri2 = this.f16474s;
                gVar = new g(uri, str, eVar, uri2 != null ? new b(uri2, this.f16475t, null) : null, this.f16471p, this.f16472q, this.f16473r, this.f16476u, null);
            } else {
                gVar = null;
            }
            String str2 = this.f16458a;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            String str3 = str2;
            d dVar = new d(this.d, Long.MIN_VALUE, this.f16461e, this.f16462f, this.f16463g, null);
            f fVar = new f(this.f16478w, this.f16479x, this.y, this.f16480z, this.A);
            d0 d0Var = this.f16477v;
            if (d0Var == null) {
                d0Var = d0.D;
            }
            return new c0(str3, dVar, gVar, fVar, d0Var, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f16481a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16482b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16483c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16484e;

        static {
            r3.a aVar = r3.a.f14625f;
        }

        public d(long j10, long j11, boolean z10, boolean z11, boolean z12, a aVar) {
            this.f16481a = j10;
            this.f16482b = j11;
            this.f16483c = z10;
            this.d = z11;
            this.f16484e = z12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f16481a == dVar.f16481a && this.f16482b == dVar.f16482b && this.f16483c == dVar.f16483c && this.d == dVar.d && this.f16484e == dVar.f16484e;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f16481a;
            long j11 = this.f16482b;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f16483c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f16484e ? 1 : 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f16485a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f16486b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, String> f16487c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16488e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f16489f;

        /* renamed from: g  reason: collision with root package name */
        public final List<Integer> f16490g;

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f16491h;

        public e(UUID uuid, Uri uri, Map map, boolean z10, boolean z11, boolean z12, List list, byte[] bArr, a aVar) {
            k8.a.c((z11 && uri == null) ? false : true);
            this.f16485a = uuid;
            this.f16486b = uri;
            this.f16487c = map;
            this.d = z10;
            this.f16489f = z11;
            this.f16488e = z12;
            this.f16490g = list;
            this.f16491h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public byte[] a() {
            byte[] bArr = this.f16491h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.f16485a.equals(eVar.f16485a) && k8.c0.a(this.f16486b, eVar.f16486b) && k8.c0.a(this.f16487c, eVar.f16487c) && this.d == eVar.d && this.f16489f == eVar.f16489f && this.f16488e == eVar.f16488e && this.f16490g.equals(eVar.f16490g) && Arrays.equals(this.f16491h, eVar.f16491h);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f16485a.hashCode() * 31;
            Uri uri = this.f16486b;
            int hashCode2 = uri != null ? uri.hashCode() : 0;
            int hashCode3 = this.f16487c.hashCode();
            return Arrays.hashCode(this.f16491h) + ((this.f16490g.hashCode() + ((((((((hashCode3 + ((hashCode + hashCode2) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f16489f ? 1 : 0)) * 31) + (this.f16488e ? 1 : 0)) * 31)) * 31);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f16492a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16493b;

        /* renamed from: c  reason: collision with root package name */
        public final long f16494c;
        public final float d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16495e;

        public f(long j10, long j11, long j12, float f10, float f11) {
            this.f16492a = j10;
            this.f16493b = j11;
            this.f16494c = j12;
            this.d = f10;
            this.f16495e = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f16492a == fVar.f16492a && this.f16493b == fVar.f16493b && this.f16494c == fVar.f16494c && this.d == fVar.d && this.f16495e == fVar.f16495e;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f16492a;
            long j11 = this.f16493b;
            long j12 = this.f16494c;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            float f10 = this.d;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f16495e;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f16496a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16497b;

        /* renamed from: c  reason: collision with root package name */
        public final e f16498c;
        public final b d;

        /* renamed from: e  reason: collision with root package name */
        public final List<Object> f16499e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16500f;

        /* renamed from: g  reason: collision with root package name */
        public final List<h> f16501g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f16502h;

        public g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj, a aVar) {
            this.f16496a = uri;
            this.f16497b = str;
            this.f16498c = eVar;
            this.d = bVar;
            this.f16499e = list;
            this.f16500f = str2;
            this.f16501g = list2;
            this.f16502h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.f16496a.equals(gVar.f16496a) && k8.c0.a(this.f16497b, gVar.f16497b) && k8.c0.a(this.f16498c, gVar.f16498c) && k8.c0.a(this.d, gVar.d) && this.f16499e.equals(gVar.f16499e) && k8.c0.a(this.f16500f, gVar.f16500f) && this.f16501g.equals(gVar.f16501g) && k8.c0.a(this.f16502h, gVar.f16502h);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f16496a.hashCode() * 31;
            String str = this.f16497b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.f16498c;
            int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            b bVar = this.d;
            int hashCode4 = (this.f16499e.hashCode() + ((hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            String str2 = this.f16500f;
            int hashCode5 = (this.f16501g.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f16502h;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode5 + i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                Objects.requireNonNull((h) obj);
                throw null;
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }
    }

    static {
        new c().a();
    }

    public c0(String str, d dVar, g gVar, f fVar, d0 d0Var, a aVar) {
        this.f16452a = str;
        this.f16453b = gVar;
        this.f16454c = fVar;
        this.d = d0Var;
        this.f16455e = dVar;
    }

    public static c0 b(String str) {
        c cVar = new c();
        cVar.f16459b = str == null ? null : Uri.parse(str);
        return cVar.a();
    }

    public c a() {
        c cVar = new c();
        d dVar = this.f16455e;
        long j10 = dVar.f16482b;
        cVar.f16461e = dVar.f16483c;
        cVar.f16462f = dVar.d;
        cVar.d = dVar.f16481a;
        cVar.f16463g = dVar.f16484e;
        cVar.f16458a = this.f16452a;
        cVar.f16477v = this.d;
        f fVar = this.f16454c;
        cVar.f16478w = fVar.f16492a;
        cVar.f16479x = fVar.f16493b;
        cVar.y = fVar.f16494c;
        cVar.f16480z = fVar.d;
        cVar.A = fVar.f16495e;
        g gVar = this.f16453b;
        if (gVar != null) {
            cVar.f16472q = gVar.f16500f;
            cVar.f16460c = gVar.f16497b;
            cVar.f16459b = gVar.f16496a;
            cVar.f16471p = gVar.f16499e;
            cVar.f16473r = gVar.f16501g;
            cVar.f16476u = gVar.f16502h;
            e eVar = gVar.f16498c;
            if (eVar != null) {
                cVar.f16464h = eVar.f16486b;
                cVar.f16465i = eVar.f16487c;
                cVar.f16467k = eVar.d;
                cVar.f16469m = eVar.f16489f;
                cVar.f16468l = eVar.f16488e;
                cVar.n = eVar.f16490g;
                cVar.f16466j = eVar.f16485a;
                cVar.f16470o = eVar.a();
            }
            b bVar = gVar.d;
            if (bVar != null) {
                cVar.f16474s = bVar.f16456a;
                cVar.f16475t = bVar.f16457b;
            }
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return k8.c0.a(this.f16452a, c0Var.f16452a) && this.f16455e.equals(c0Var.f16455e) && k8.c0.a(this.f16453b, c0Var.f16453b) && k8.c0.a(this.f16454c, c0Var.f16454c) && k8.c0.a(this.d, c0Var.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f16452a.hashCode() * 31;
        g gVar = this.f16453b;
        int hashCode2 = gVar != null ? gVar.hashCode() : 0;
        int hashCode3 = this.f16454c.hashCode();
        return this.d.hashCode() + ((this.f16455e.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}
