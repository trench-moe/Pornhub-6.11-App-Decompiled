package gf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Method f10044a;

    /* renamed from: b  reason: collision with root package name */
    public final pe.p f10045b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10046c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final pe.o f10047e;

    /* renamed from: f  reason: collision with root package name */
    public final pe.r f10048f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10049g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10050h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10051i;

    /* renamed from: j  reason: collision with root package name */
    public final p<?>[] f10052j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f10053k;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f10054x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final u f10055a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f10056b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f10057c;
        public final Annotation[][] d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f10058e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10059f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10060g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10061h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10062i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f10063j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f10064k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10065l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f10066m;
        public String n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f10067o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f10068p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f10069q;

        /* renamed from: r  reason: collision with root package name */
        public String f10070r;

        /* renamed from: s  reason: collision with root package name */
        public pe.o f10071s;

        /* renamed from: t  reason: collision with root package name */
        public pe.r f10072t;

        /* renamed from: u  reason: collision with root package name */
        public Set<String> f10073u;

        /* renamed from: v  reason: collision with root package name */
        public p<?>[] f10074v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f10075w;

        public a(u uVar, Method method) {
            this.f10055a = uVar;
            this.f10056b = method;
            this.f10057c = method.getAnnotations();
            this.f10058e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.n;
            if (str3 != null) {
                throw retrofit2.b.j(this.f10056b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.n = str;
            this.f10067o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (f10054x.matcher(substring).find()) {
                    throw retrofit2.b.j(this.f10056b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f10070r = str2;
            Matcher matcher = f10054x.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f10073u = linkedHashSet;
        }

        public final void c(int i10, Type type) {
            if (retrofit2.b.h(type)) {
                throw retrofit2.b.l(this.f10056b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public s(a aVar) {
        this.f10044a = aVar.f10056b;
        this.f10045b = aVar.f10055a.f10080c;
        this.f10046c = aVar.n;
        this.d = aVar.f10070r;
        this.f10047e = aVar.f10071s;
        this.f10048f = aVar.f10072t;
        this.f10049g = aVar.f10067o;
        this.f10050h = aVar.f10068p;
        this.f10051i = aVar.f10069q;
        this.f10052j = aVar.f10074v;
        this.f10053k = aVar.f10075w;
    }
}
