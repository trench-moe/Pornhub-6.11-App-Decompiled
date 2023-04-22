package gf;

import gf.a;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import pe.o;
import pe.s;

/* loaded from: classes2.dex */
public abstract class p<T> {

    /* loaded from: classes2.dex */
    public static final class a<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9990a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9991b;

        /* renamed from: c  reason: collision with root package name */
        public final gf.f<T, pe.x> f9992c;

        public a(Method method, int i10, gf.f<T, pe.x> fVar) {
            this.f9990a = method;
            this.f9991b = i10;
            this.f9992c = fVar;
        }

        @Override // gf.p
        public void a(r rVar, T t2) {
            if (t2 == null) {
                throw retrofit2.b.l(this.f9990a, this.f9991b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                rVar.f10041k = this.f9992c.a(t2);
            } catch (IOException e10) {
                Method method = this.f9990a;
                int i10 = this.f9991b;
                throw retrofit2.b.m(method, e10, i10, "Unable to convert " + t2 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f9993a;

        /* renamed from: b  reason: collision with root package name */
        public final gf.f<T, String> f9994b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9995c;

        public b(String str, gf.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f9993a = str;
            this.f9994b = fVar;
            this.f9995c = z10;
        }

        @Override // gf.p
        public void a(r rVar, T t2) {
            String a10;
            if (t2 == null || (a10 = this.f9994b.a(t2)) == null) {
                return;
            }
            rVar.a(this.f9993a, a10, this.f9995c);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> extends p<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f9996a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9997b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9998c;

        public c(Method method, int i10, gf.f<T, String> fVar, boolean z10) {
            this.f9996a = method;
            this.f9997b = i10;
            this.f9998c = z10;
        }

        @Override // gf.p
        public void a(r rVar, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw retrofit2.b.l(this.f9996a, this.f9997b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw retrofit2.b.l(this.f9996a, this.f9997b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw retrofit2.b.l(this.f9996a, this.f9997b, android.support.v4.media.b.j("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String obj2 = value.toString();
                if (obj2 == null) {
                    Method method = this.f9996a;
                    int i10 = this.f9997b;
                    throw retrofit2.b.l(method, i10, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                rVar.a(str, obj2, this.f9998c);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f9999a;

        /* renamed from: b  reason: collision with root package name */
        public final gf.f<T, String> f10000b;

        public d(String str, gf.f<T, String> fVar) {
            Objects.requireNonNull(str, "name == null");
            this.f9999a = str;
            this.f10000b = fVar;
        }

        @Override // gf.p
        public void a(r rVar, T t2) {
            String a10;
            if (t2 == null || (a10 = this.f10000b.a(t2)) == null) {
                return;
            }
            rVar.b(this.f9999a, a10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e<T> extends p<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10001a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10002b;

        public e(Method method, int i10, gf.f<T, String> fVar) {
            this.f10001a = method;
            this.f10002b = i10;
        }

        @Override // gf.p
        public void a(r rVar, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw retrofit2.b.l(this.f10001a, this.f10002b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw retrofit2.b.l(this.f10001a, this.f10002b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw retrofit2.b.l(this.f10001a, this.f10002b, android.support.v4.media.b.j("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                rVar.b(str, value.toString());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends p<pe.o> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10003a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10004b;

        public f(Method method, int i10) {
            this.f10003a = method;
            this.f10004b = i10;
        }

        @Override // gf.p
        public void a(r rVar, pe.o oVar) {
            pe.o headers = oVar;
            if (headers == null) {
                throw retrofit2.b.l(this.f10003a, this.f10004b, "Headers parameter must not be null.", new Object[0]);
            }
            o.a aVar = rVar.f10036f;
            Objects.requireNonNull(aVar);
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                aVar.b(headers.e(i10), headers.h(i10));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class g<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10005a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10006b;

        /* renamed from: c  reason: collision with root package name */
        public final pe.o f10007c;
        public final gf.f<T, pe.x> d;

        public g(Method method, int i10, pe.o oVar, gf.f<T, pe.x> fVar) {
            this.f10005a = method;
            this.f10006b = i10;
            this.f10007c = oVar;
            this.d = fVar;
        }

        @Override // gf.p
        public void a(r rVar, T t2) {
            if (t2 == null) {
                return;
            }
            try {
                rVar.c(this.f10007c, this.d.a(t2));
            } catch (IOException e10) {
                Method method = this.f10005a;
                int i10 = this.f10006b;
                throw retrofit2.b.l(method, i10, "Unable to convert " + t2 + " to RequestBody", e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class h<T> extends p<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10008a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10009b;

        /* renamed from: c  reason: collision with root package name */
        public final gf.f<T, pe.x> f10010c;
        public final String d;

        public h(Method method, int i10, gf.f<T, pe.x> fVar, String str) {
            this.f10008a = method;
            this.f10009b = i10;
            this.f10010c = fVar;
            this.d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gf.p
        public void a(r rVar, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw retrofit2.b.l(this.f10008a, this.f10009b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw retrofit2.b.l(this.f10008a, this.f10009b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw retrofit2.b.l(this.f10008a, this.f10009b, android.support.v4.media.b.j("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                rVar.c(pe.o.f13982f.c("Content-Disposition", android.support.v4.media.b.j("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d), (pe.x) this.f10010c.a(value));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class i<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10011a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10012b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10013c;
        public final gf.f<T, String> d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f10014e;

        public i(Method method, int i10, String str, gf.f<T, String> fVar, boolean z10) {
            this.f10011a = method;
            this.f10012b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f10013c = str;
            this.d = fVar;
            this.f10014e = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
        @Override // gf.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(gf.r r18, T r19) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.p.i.a(gf.r, java.lang.Object):void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class j<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f10015a;

        /* renamed from: b  reason: collision with root package name */
        public final gf.f<T, String> f10016b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10017c;

        public j(String str, gf.f<T, String> fVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f10015a = str;
            this.f10016b = fVar;
            this.f10017c = z10;
        }

        @Override // gf.p
        public void a(r rVar, T t2) {
            String a10;
            if (t2 == null || (a10 = this.f10016b.a(t2)) == null) {
                return;
            }
            rVar.d(this.f10015a, a10, this.f10017c);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k<T> extends p<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10018a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10019b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10020c;

        public k(Method method, int i10, gf.f<T, String> fVar, boolean z10) {
            this.f10018a = method;
            this.f10019b = i10;
            this.f10020c = z10;
        }

        @Override // gf.p
        public void a(r rVar, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw retrofit2.b.l(this.f10018a, this.f10019b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw retrofit2.b.l(this.f10018a, this.f10019b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw retrofit2.b.l(this.f10018a, this.f10019b, android.support.v4.media.b.j("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String obj2 = value.toString();
                if (obj2 == null) {
                    Method method = this.f10018a;
                    int i10 = this.f10019b;
                    throw retrofit2.b.l(method, i10, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                rVar.d(str, obj2, this.f10020c);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class l<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f10021a;

        public l(gf.f<T, String> fVar, boolean z10) {
            this.f10021a = z10;
        }

        @Override // gf.p
        public void a(r rVar, T t2) {
            if (t2 == null) {
                return;
            }
            rVar.d(t2.toString(), null, this.f10021a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends p<s.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f10022a = new m();

        @Override // gf.p
        public void a(r rVar, s.b bVar) {
            s.b part = bVar;
            if (part != null) {
                s.a aVar = rVar.f10039i;
                Objects.requireNonNull(aVar);
                Intrinsics.checkNotNullParameter(part, "part");
                aVar.f14018c.add(part);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends p<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10023a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10024b;

        public n(Method method, int i10) {
            this.f10023a = method;
            this.f10024b = i10;
        }

        @Override // gf.p
        public void a(r rVar, Object obj) {
            if (obj == null) {
                throw retrofit2.b.l(this.f10023a, this.f10024b, "@Url parameter is null.", new Object[0]);
            }
            Objects.requireNonNull(rVar);
            rVar.f10034c = obj.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class o<T> extends p<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f10025a;

        public o(Class<T> cls) {
            this.f10025a = cls;
        }

        @Override // gf.p
        public void a(r rVar, T t2) {
            rVar.f10035e.f(this.f10025a, t2);
        }
    }

    public abstract void a(r rVar, T t2);
}
