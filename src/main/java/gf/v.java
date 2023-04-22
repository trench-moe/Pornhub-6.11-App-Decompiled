package gf;

import gf.a;
import gf.p;
import gf.s;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import jf.y;
import kotlin.coroutines.Continuation;
import pe.a0;
import pe.d;
import pe.o;
import pe.s;
import retrofit2.a;
import retrofit2.b;

/* loaded from: classes2.dex */
public abstract class v<T> {
    public static <T> v<T> b(u uVar, Method method) {
        Annotation[] annotationArr;
        Type genericReturnType;
        boolean z10;
        Type[] genericParameterTypes;
        int i10;
        int i11;
        p<?> pVar;
        int i12;
        int i13;
        int i14;
        int i15;
        p<?> pVar2;
        p<?> gVar;
        p<?> oVar;
        p<?> cVar;
        p<?> bVar;
        s.a aVar = new s.a(uVar, method);
        for (Annotation annotation : aVar.f10057c) {
            if (annotation instanceof jf.b) {
                aVar.b("DELETE", ((jf.b) annotation).value(), false);
            } else if (annotation instanceof jf.f) {
                aVar.b("GET", ((jf.f) annotation).value(), false);
            } else if (annotation instanceof jf.g) {
                aVar.b("HEAD", ((jf.g) annotation).value(), false);
            } else if (annotation instanceof jf.n) {
                aVar.b("PATCH", ((jf.n) annotation).value(), true);
            } else if (annotation instanceof jf.o) {
                aVar.b("POST", ((jf.o) annotation).value(), true);
            } else if (annotation instanceof jf.p) {
                aVar.b("PUT", ((jf.p) annotation).value(), true);
            } else if (annotation instanceof jf.m) {
                aVar.b("OPTIONS", ((jf.m) annotation).value(), false);
            } else if (annotation instanceof jf.h) {
                jf.h hVar = (jf.h) annotation;
                aVar.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof jf.k) {
                String[] value = ((jf.k) annotation).value();
                if (value.length == 0) {
                    throw retrofit2.b.j(aVar.f10056b, "@Headers annotation is empty.", new Object[0]);
                }
                o.a aVar2 = new o.a();
                for (String str : value) {
                    int indexOf = str.indexOf(58);
                    if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                        throw retrofit2.b.j(aVar.f10056b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                    }
                    String substring = str.substring(0, indexOf);
                    String trim = str.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            aVar.f10072t = pe.r.b(trim);
                        } catch (IllegalArgumentException e10) {
                            throw retrofit2.b.k(aVar.f10056b, e10, "Malformed content type: %s", trim);
                        }
                    } else {
                        aVar2.a(substring, trim);
                    }
                }
                aVar.f10071s = aVar2.c();
            } else if (annotation instanceof jf.l) {
                if (aVar.f10068p) {
                    throw retrofit2.b.j(aVar.f10056b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar.f10069q = true;
            } else if (!(annotation instanceof jf.e)) {
                continue;
            } else if (aVar.f10069q) {
                throw retrofit2.b.j(aVar.f10056b, "Only one encoding annotation is allowed.", new Object[0]);
            } else {
                aVar.f10068p = true;
            }
        }
        if (aVar.n != null) {
            if (!aVar.f10067o) {
                if (aVar.f10069q) {
                    throw retrofit2.b.j(aVar.f10056b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (aVar.f10068p) {
                    throw retrofit2.b.j(aVar.f10056b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = aVar.d.length;
            aVar.f10074v = new p[length];
            int i16 = length - 1;
            int i17 = 0;
            while (i17 < length) {
                p<?>[] pVarArr = aVar.f10074v;
                Type type = aVar.f10058e[i17];
                Annotation[] annotationArr2 = aVar.d[i17];
                boolean z11 = i17 == i16;
                if (annotationArr2 != null) {
                    int length2 = annotationArr2.length;
                    pVar = null;
                    int i18 = 0;
                    while (i18 < length2) {
                        Annotation annotation2 = annotationArr2[i18];
                        int i19 = length;
                        if (annotation2 instanceof y) {
                            aVar.c(i17, type);
                            if (aVar.f10066m) {
                                throw retrofit2.b.l(aVar.f10056b, i17, "Multiple @Url method annotations found.", new Object[0]);
                            }
                            if (aVar.f10062i) {
                                throw retrofit2.b.l(aVar.f10056b, i17, "@Path parameters may not be used with @Url.", new Object[0]);
                            }
                            if (aVar.f10063j) {
                                throw retrofit2.b.l(aVar.f10056b, i17, "A @Url parameter must not come after a @Query.", new Object[0]);
                            }
                            if (aVar.f10064k) {
                                throw retrofit2.b.l(aVar.f10056b, i17, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                            }
                            if (aVar.f10065l) {
                                throw retrofit2.b.l(aVar.f10056b, i17, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            if (aVar.f10070r != null) {
                                throw retrofit2.b.l(aVar.f10056b, i17, "@Url cannot be used with @%s URL", aVar.n);
                            }
                            aVar.f10066m = true;
                            if (type != pe.p.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                throw retrofit2.b.l(aVar.f10056b, i17, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                            }
                            pVar2 = new p.n(aVar.f10056b, i17);
                            i12 = i16;
                            i13 = i18;
                            i15 = length2;
                        } else {
                            i12 = i16;
                            if (annotation2 instanceof jf.s) {
                                aVar.c(i17, type);
                                if (aVar.f10063j) {
                                    throw retrofit2.b.l(aVar.f10056b, i17, "A @Path parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar.f10064k) {
                                    throw retrofit2.b.l(aVar.f10056b, i17, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar.f10065l) {
                                    throw retrofit2.b.l(aVar.f10056b, i17, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar.f10066m) {
                                    throw retrofit2.b.l(aVar.f10056b, i17, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar.f10070r == null) {
                                    throw retrofit2.b.l(aVar.f10056b, i17, "@Path can only be used with relative url on @%s", aVar.n);
                                }
                                aVar.f10062i = true;
                                jf.s sVar = (jf.s) annotation2;
                                String value2 = sVar.value();
                                if (!s.a.y.matcher(value2).matches()) {
                                    throw retrofit2.b.l(aVar.f10056b, i17, "@Path parameter name must match %s. Found: %s", s.a.f10054x.pattern(), value2);
                                }
                                if (!aVar.f10073u.contains(value2)) {
                                    throw retrofit2.b.l(aVar.f10056b, i17, "URL \"%s\" does not contain \"{%s}\".", aVar.f10070r, value2);
                                }
                                aVar.f10055a.f(type, annotationArr2);
                                i13 = i18;
                                i14 = length2;
                                gVar = new p.i<>(aVar.f10056b, i17, value2, a.d.f9948a, sVar.encoded());
                            } else {
                                i13 = i18;
                                i14 = length2;
                                if (annotation2 instanceof jf.t) {
                                    aVar.c(i17, type);
                                    jf.t tVar = (jf.t) annotation2;
                                    String value3 = tVar.value();
                                    boolean encoded = tVar.encoded();
                                    Class<?> f10 = retrofit2.b.f(type);
                                    aVar.f10063j = true;
                                    if (Iterable.class.isAssignableFrom(f10)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.g(f10, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                        }
                                        aVar.f10055a.f(retrofit2.b.e(0, (ParameterizedType) type), annotationArr2);
                                        gVar = new n(new p.j(value3, a.d.f9948a, encoded));
                                    } else if (f10.isArray()) {
                                        aVar.f10055a.f(s.a.a(f10.getComponentType()), annotationArr2);
                                        gVar = new o(new p.j(value3, a.d.f9948a, encoded));
                                    } else {
                                        aVar.f10055a.f(type, annotationArr2);
                                        bVar = new p.j<>(value3, a.d.f9948a, encoded);
                                        i15 = i14;
                                        pVar2 = bVar;
                                    }
                                } else if (annotation2 instanceof jf.v) {
                                    aVar.c(i17, type);
                                    boolean encoded2 = ((jf.v) annotation2).encoded();
                                    Class<?> f11 = retrofit2.b.f(type);
                                    aVar.f10064k = true;
                                    if (Iterable.class.isAssignableFrom(f11)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.g(f11, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                        }
                                        aVar.f10055a.f(retrofit2.b.e(0, (ParameterizedType) type), annotationArr2);
                                        gVar = new n(new p.l(a.d.f9948a, encoded2));
                                    } else if (f11.isArray()) {
                                        aVar.f10055a.f(s.a.a(f11.getComponentType()), annotationArr2);
                                        gVar = new o(new p.l(a.d.f9948a, encoded2));
                                    } else {
                                        aVar.f10055a.f(type, annotationArr2);
                                        cVar = new p.l<>(a.d.f9948a, encoded2);
                                        i15 = i14;
                                        pVar2 = cVar;
                                    }
                                } else {
                                    if (annotation2 instanceof jf.u) {
                                        aVar.c(i17, type);
                                        Class<?> f12 = retrofit2.b.f(type);
                                        aVar.f10065l = true;
                                        if (!Map.class.isAssignableFrom(f12)) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type g10 = retrofit2.b.g(type, f12, Map.class);
                                        if (!(g10 instanceof ParameterizedType)) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType = (ParameterizedType) g10;
                                        Type e11 = retrofit2.b.e(0, parameterizedType);
                                        if (String.class != e11) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.h("@QueryMap keys must be of type String: ", e11), new Object[0]);
                                        }
                                        aVar.f10055a.f(retrofit2.b.e(1, parameterizedType), annotationArr2);
                                        cVar = new p.k<>(aVar.f10056b, i17, a.d.f9948a, ((jf.u) annotation2).encoded());
                                    } else if (annotation2 instanceof jf.i) {
                                        aVar.c(i17, type);
                                        String value4 = ((jf.i) annotation2).value();
                                        Class<?> f13 = retrofit2.b.f(type);
                                        if (Iterable.class.isAssignableFrom(f13)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.g(f13, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            aVar.f10055a.f(retrofit2.b.e(0, (ParameterizedType) type), annotationArr2);
                                            gVar = new n(new p.d(value4, a.d.f9948a));
                                        } else if (f13.isArray()) {
                                            aVar.f10055a.f(s.a.a(f13.getComponentType()), annotationArr2);
                                            gVar = new o(new p.d(value4, a.d.f9948a));
                                        } else {
                                            aVar.f10055a.f(type, annotationArr2);
                                            cVar = new p.d<>(value4, a.d.f9948a);
                                        }
                                    } else if (annotation2 instanceof jf.j) {
                                        if (type == pe.o.class) {
                                            gVar = new p.f(aVar.f10056b, i17);
                                        } else {
                                            aVar.c(i17, type);
                                            Class<?> f14 = retrofit2.b.f(type);
                                            if (!Map.class.isAssignableFrom(f14)) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "@HeaderMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type g11 = retrofit2.b.g(type, f14, Map.class);
                                            if (!(g11 instanceof ParameterizedType)) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType2 = (ParameterizedType) g11;
                                            Type e12 = retrofit2.b.e(0, parameterizedType2);
                                            if (String.class != e12) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.h("@HeaderMap keys must be of type String: ", e12), new Object[0]);
                                            }
                                            aVar.f10055a.f(retrofit2.b.e(1, parameterizedType2), annotationArr2);
                                            oVar = new p.e<>(aVar.f10056b, i17, a.d.f9948a);
                                            i15 = i14;
                                            pVar2 = oVar;
                                        }
                                    } else if (annotation2 instanceof jf.c) {
                                        aVar.c(i17, type);
                                        if (!aVar.f10068p) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, "@Field parameters can only be used with form encoding.", new Object[0]);
                                        }
                                        jf.c cVar2 = (jf.c) annotation2;
                                        String value5 = cVar2.value();
                                        boolean encoded3 = cVar2.encoded();
                                        aVar.f10059f = true;
                                        Class<?> f15 = retrofit2.b.f(type);
                                        if (Iterable.class.isAssignableFrom(f15)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.g(f15, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                            aVar.f10055a.f(retrofit2.b.e(0, (ParameterizedType) type), annotationArr2);
                                            gVar = new n(new p.b(value5, a.d.f9948a, encoded3));
                                        } else if (f15.isArray()) {
                                            aVar.f10055a.f(s.a.a(f15.getComponentType()), annotationArr2);
                                            gVar = new o(new p.b(value5, a.d.f9948a, encoded3));
                                        } else {
                                            aVar.f10055a.f(type, annotationArr2);
                                            bVar = new p.b<>(value5, a.d.f9948a, encoded3);
                                            i15 = i14;
                                            pVar2 = bVar;
                                        }
                                    } else if (annotation2 instanceof jf.d) {
                                        aVar.c(i17, type);
                                        if (!aVar.f10068p) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                        }
                                        Class<?> f16 = retrofit2.b.f(type);
                                        if (!Map.class.isAssignableFrom(f16)) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, "@FieldMap parameter type must be Map.", new Object[0]);
                                        }
                                        Type g12 = retrofit2.b.g(type, f16, Map.class);
                                        if (!(g12 instanceof ParameterizedType)) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                        }
                                        ParameterizedType parameterizedType3 = (ParameterizedType) g12;
                                        Type e13 = retrofit2.b.e(0, parameterizedType3);
                                        if (String.class != e13) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.h("@FieldMap keys must be of type String: ", e13), new Object[0]);
                                        }
                                        aVar.f10055a.f(retrofit2.b.e(1, parameterizedType3), annotationArr2);
                                        a.d dVar = a.d.f9948a;
                                        aVar.f10059f = true;
                                        cVar = new p.c<>(aVar.f10056b, i17, dVar, ((jf.d) annotation2).encoded());
                                    } else if (annotation2 instanceof jf.q) {
                                        aVar.c(i17, type);
                                        if (!aVar.f10069q) {
                                            throw retrofit2.b.l(aVar.f10056b, i17, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                        }
                                        jf.q qVar = (jf.q) annotation2;
                                        aVar.f10060g = true;
                                        String value6 = qVar.value();
                                        Class<?> f17 = retrofit2.b.f(type);
                                        if (value6.isEmpty()) {
                                            if (Iterable.class.isAssignableFrom(f17)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.g(f17, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                }
                                                if (!s.b.class.isAssignableFrom(retrofit2.b.f(retrofit2.b.e(0, (ParameterizedType) type)))) {
                                                    throw retrofit2.b.l(aVar.f10056b, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                                oVar = new n(p.m.f10022a);
                                            } else if (f17.isArray()) {
                                                if (!s.b.class.isAssignableFrom(f17.getComponentType())) {
                                                    throw retrofit2.b.l(aVar.f10056b, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                                oVar = new o(p.m.f10022a);
                                            } else if (!s.b.class.isAssignableFrom(f17)) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                            } else {
                                                gVar = p.m.f10022a;
                                            }
                                            i15 = i14;
                                            pVar2 = oVar;
                                        } else {
                                            i15 = i14;
                                            pe.o c10 = pe.o.f13982f.c("Content-Disposition", android.support.v4.media.b.j("form-data; name=\"", value6, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                            if (Iterable.class.isAssignableFrom(f17)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.g(f17, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                }
                                                Type e14 = retrofit2.b.e(0, (ParameterizedType) type);
                                                if (s.b.class.isAssignableFrom(retrofit2.b.f(e14))) {
                                                    throw retrofit2.b.l(aVar.f10056b, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                }
                                                pVar2 = new n(new p.g(aVar.f10056b, i17, c10, aVar.f10055a.d(e14, annotationArr2, aVar.f10057c)));
                                            } else if (f17.isArray()) {
                                                Class<?> a10 = s.a.a(f17.getComponentType());
                                                if (s.b.class.isAssignableFrom(a10)) {
                                                    throw retrofit2.b.l(aVar.f10056b, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                }
                                                pVar2 = new o(new p.g(aVar.f10056b, i17, c10, aVar.f10055a.d(a10, annotationArr2, aVar.f10057c)));
                                            } else if (s.b.class.isAssignableFrom(f17)) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                            } else {
                                                gVar = new p.g<>(aVar.f10056b, i17, c10, aVar.f10055a.d(type, annotationArr2, aVar.f10057c));
                                                pVar2 = gVar;
                                            }
                                        }
                                    } else {
                                        i15 = i14;
                                        if (annotation2 instanceof jf.r) {
                                            aVar.c(i17, type);
                                            if (!aVar.f10069q) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                            aVar.f10060g = true;
                                            Class<?> f18 = retrofit2.b.f(type);
                                            if (!Map.class.isAssignableFrom(f18)) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "@PartMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type g13 = retrofit2.b.g(type, f18, Map.class);
                                            if (!(g13 instanceof ParameterizedType)) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType4 = (ParameterizedType) g13;
                                            Type e15 = retrofit2.b.e(0, parameterizedType4);
                                            if (String.class != e15) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, android.support.v4.media.a.h("@PartMap keys must be of type String: ", e15), new Object[0]);
                                            }
                                            Type e16 = retrofit2.b.e(1, parameterizedType4);
                                            if (s.b.class.isAssignableFrom(retrofit2.b.f(e16))) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                            }
                                            pVar2 = new p.h<>(aVar.f10056b, i17, aVar.f10055a.d(e16, annotationArr2, aVar.f10057c), ((jf.r) annotation2).encoding());
                                        } else if (annotation2 instanceof jf.a) {
                                            aVar.c(i17, type);
                                            if (aVar.f10068p || aVar.f10069q) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                            }
                                            if (aVar.f10061h) {
                                                throw retrofit2.b.l(aVar.f10056b, i17, "Multiple @Body method annotations found.", new Object[0]);
                                            }
                                            try {
                                                f<T, pe.x> d = aVar.f10055a.d(type, annotationArr2, aVar.f10057c);
                                                aVar.f10061h = true;
                                                pVar2 = new p.a<>(aVar.f10056b, i17, d);
                                            } catch (RuntimeException e17) {
                                                throw retrofit2.b.m(aVar.f10056b, e17, i17, "Unable to create @Body converter for %s", type);
                                            }
                                        } else if (annotation2 instanceof jf.x) {
                                            aVar.c(i17, type);
                                            Class<?> f19 = retrofit2.b.f(type);
                                            for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                                p<?> pVar3 = aVar.f10074v[i20];
                                                if ((pVar3 instanceof p.o) && ((p.o) pVar3).f10025a.equals(f19)) {
                                                    Method method2 = aVar.f10056b;
                                                    StringBuilder m10 = a1.a.m("@Tag type ");
                                                    m10.append(f19.getName());
                                                    m10.append(" is duplicate of parameter #");
                                                    m10.append(i20 + 1);
                                                    m10.append(" and would always overwrite its value.");
                                                    throw retrofit2.b.l(method2, i17, m10.toString(), new Object[0]);
                                                }
                                            }
                                            pVar2 = new p.o<>(f19);
                                        } else {
                                            pVar2 = null;
                                        }
                                    }
                                    i15 = i14;
                                    pVar2 = cVar;
                                }
                            }
                            i15 = i14;
                            pVar2 = gVar;
                        }
                        if (pVar2 != null) {
                            if (pVar != null) {
                                throw retrofit2.b.l(aVar.f10056b, i17, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                            }
                            pVar = pVar2;
                        }
                        i18 = i13 + 1;
                        length = i19;
                        i16 = i12;
                        length2 = i15;
                    }
                    i10 = length;
                    i11 = i16;
                } else {
                    i10 = length;
                    i11 = i16;
                    pVar = null;
                }
                if (pVar == null) {
                    if (z11) {
                        try {
                            if (retrofit2.b.f(type) == Continuation.class) {
                                aVar.f10075w = true;
                                pVar = null;
                            }
                        } catch (NoClassDefFoundError unused) {
                        }
                    }
                    throw retrofit2.b.l(aVar.f10056b, i17, "No Retrofit annotation found.", new Object[0]);
                }
                pVarArr[i17] = pVar;
                i17++;
                length = i10;
                i16 = i11;
            }
            if (aVar.f10070r != null || aVar.f10066m) {
                boolean z12 = aVar.f10068p;
                if (z12 || aVar.f10069q || aVar.f10067o || !aVar.f10061h) {
                    if (!z12 || aVar.f10059f) {
                        if (!aVar.f10069q || aVar.f10060g) {
                            s sVar2 = new s(aVar);
                            Type genericReturnType2 = method.getGenericReturnType();
                            if (retrofit2.b.h(genericReturnType2)) {
                                throw retrofit2.b.j(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                            }
                            if (genericReturnType2 != Void.TYPE) {
                                boolean z13 = sVar2.f10053k;
                                Annotation[] annotations = method.getAnnotations();
                                if (z13) {
                                    Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                                    if (type2 instanceof WildcardType) {
                                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                                    }
                                    if (retrofit2.b.f(type2) == t.class && (type2 instanceof ParameterizedType)) {
                                        type2 = retrofit2.b.e(0, (ParameterizedType) type2);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    genericReturnType = new b.C0258b(null, b.class, type2);
                                    if (!retrofit2.b.i(annotations, w.class)) {
                                        Annotation[] annotationArr3 = new Annotation[annotations.length + 1];
                                        annotationArr3[0] = x.f10090a;
                                        System.arraycopy(annotations, 0, annotationArr3, 1, annotations.length);
                                        annotations = annotationArr3;
                                    }
                                } else {
                                    genericReturnType = method.getGenericReturnType();
                                    z10 = false;
                                }
                                try {
                                    c<?, ?> a11 = uVar.a(genericReturnType, annotations);
                                    Type a12 = a11.a();
                                    if (a12 == pe.y.class) {
                                        StringBuilder m11 = a1.a.m("'");
                                        m11.append(retrofit2.b.f(a12).getName());
                                        m11.append("' is not a valid response body type. Did you mean ResponseBody?");
                                        throw retrofit2.b.j(method, m11.toString(), new Object[0]);
                                    } else if (a12 != t.class) {
                                        if (!sVar2.f10046c.equals("HEAD") || Void.class.equals(a12)) {
                                            try {
                                                f<a0, T> e18 = uVar.e(a12, method.getAnnotations());
                                                d.a aVar3 = uVar.f10079b;
                                                return !z13 ? new a.C0257a(sVar2, aVar3, e18, a11) : z10 ? new a.c(sVar2, aVar3, e18, a11) : new a.b(sVar2, aVar3, e18, a11, false);
                                            } catch (RuntimeException e19) {
                                                throw retrofit2.b.k(method, e19, "Unable to create converter for %s", a12);
                                            }
                                        }
                                        throw retrofit2.b.j(method, "HEAD method must use Void as response type.", new Object[0]);
                                    } else {
                                        throw retrofit2.b.j(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                                    }
                                } catch (RuntimeException e20) {
                                    throw retrofit2.b.k(method, e20, "Unable to create call adapter for %s", genericReturnType);
                                }
                            }
                            throw retrofit2.b.j(method, "Service methods cannot return void.", new Object[0]);
                        }
                        throw retrofit2.b.j(aVar.f10056b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                    throw retrofit2.b.j(aVar.f10056b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                throw retrofit2.b.j(aVar.f10056b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            throw retrofit2.b.j(aVar.f10056b, "Missing either @%s URL or @Url parameter.", aVar.n);
        }
        throw retrofit2.b.j(aVar.f10056b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
    }

    public abstract T a(Object[] objArr);
}
