package gf;

import com.appsflyer.oaid.BuildConfig;
import gf.a;
import gf.c;
import gf.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import pe.a0;
import pe.d;
import pe.p;
import pe.t;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Method, v<?>> f10078a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final d.a f10079b;

    /* renamed from: c  reason: collision with root package name */
    public final pe.p f10080c;
    public final List<f.a> d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f10081e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10082f;

    /* loaded from: classes2.dex */
    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final q f10083a = q.f10026c;

        /* renamed from: b  reason: collision with root package name */
        public final Object[] f10084b = new Object[0];

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Class f10085c;

        public a(Class cls) {
            this.f10085c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f10084b;
            }
            return this.f10083a.f10027a && method.isDefault() ? this.f10083a.b(method, this.f10085c, obj, objArr) : u.this.c(method).a(objArr);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final q f10086a;

        /* renamed from: b  reason: collision with root package name */
        public d.a f10087b;

        /* renamed from: c  reason: collision with root package name */
        public pe.p f10088c;
        public final List<f.a> d;

        /* renamed from: e  reason: collision with root package name */
        public final List<c.a> f10089e;

        public b() {
            q qVar = q.f10026c;
            this.d = new ArrayList();
            this.f10089e = new ArrayList();
            this.f10086a = qVar;
        }

        public b a(String toHttpUrl) {
            Objects.requireNonNull(toHttpUrl, "baseUrl == null");
            Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            p.a aVar = new p.a();
            aVar.d(null, toHttpUrl);
            pe.p a10 = aVar.a();
            List<String> list = a10.f13992g;
            if (BuildConfig.FLAVOR.equals(list.get(list.size() - 1))) {
                this.f10088c = a10;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + a10);
        }

        public u b() {
            if (this.f10088c != null) {
                d.a aVar = this.f10087b;
                if (aVar == null) {
                    aVar = new pe.t(new t.a());
                }
                d.a aVar2 = aVar;
                Executor a10 = this.f10086a.a();
                ArrayList arrayList = new ArrayList(this.f10089e);
                q qVar = this.f10086a;
                Objects.requireNonNull(qVar);
                g gVar = new g(a10);
                arrayList.addAll(qVar.f10027a ? Arrays.asList(e.f9951a, gVar) : Collections.singletonList(gVar));
                ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + (this.f10086a.f10027a ? 1 : 0));
                arrayList2.add(new gf.a());
                arrayList2.addAll(this.d);
                arrayList2.addAll(this.f10086a.f10027a ? Collections.singletonList(m.f9986a) : Collections.emptyList());
                return new u(aVar2, this.f10088c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), a10, false);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b c(pe.t tVar) {
            Objects.requireNonNull(tVar, "client == null");
            this.f10087b = tVar;
            return this;
        }
    }

    public u(d.a aVar, pe.p pVar, List<f.a> list, List<c.a> list2, Executor executor, boolean z10) {
        this.f10079b = aVar;
        this.f10080c = pVar;
        this.d = list;
        this.f10081e = list2;
        this.f10082f = z10;
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f10081e.indexOf(null) + 1;
        int size = this.f10081e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            c<?, ?> a10 = this.f10081e.get(i10).a(type, annotationArr, this);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f10081e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f10081e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> T b(Class<T> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f10082f) {
                q qVar = q.f10026c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!(qVar.f10027a && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public v<?> c(Method method) {
        v<?> vVar;
        v<?> vVar2 = this.f10078a.get(method);
        if (vVar2 != null) {
            return vVar2;
        }
        synchronized (this.f10078a) {
            vVar = this.f10078a.get(method);
            if (vVar == null) {
                vVar = v.b(this, method);
                this.f10078a.put(method, vVar);
            }
        }
        return vVar;
    }

    public <T> f<T, pe.x> d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf(null) + 1;
        int size = this.d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<T, pe.x> fVar = (f<T, pe.x>) this.d.get(i10).a(type, annotationArr, annotationArr2, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<a0, T> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf(null) + 1;
        int size = this.d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<a0, T> fVar = (f<a0, T>) this.d.get(i10).b(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> f<T, String> f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i10 = 0; i10 < size; i10++) {
            Objects.requireNonNull(this.d.get(i10));
        }
        return a.d.f9948a;
    }
}
