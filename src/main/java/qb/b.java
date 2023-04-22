package qb;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Class<? super T>> f14446a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<l> f14447b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14448c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final e<T> f14449e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f14450f;

    /* renamed from: qb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0250b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Class<? super T>> f14451a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<l> f14452b;

        /* renamed from: c  reason: collision with root package name */
        public int f14453c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public e<T> f14454e;

        /* renamed from: f  reason: collision with root package name */
        public Set<Class<?>> f14455f;

        public C0250b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.f14451a = hashSet;
            this.f14452b = new HashSet();
            this.f14453c = 0;
            this.d = 0;
            this.f14455f = new HashSet();
            Objects.requireNonNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                Objects.requireNonNull(cls2, "Null interface");
            }
            Collections.addAll(this.f14451a, clsArr);
        }

        public C0250b<T> a(l lVar) {
            if (!this.f14451a.contains(lVar.f14471a)) {
                this.f14452b.add(lVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b() {
            if (this.f14454e != null) {
                return new b<>(new HashSet(this.f14451a), new HashSet(this.f14452b), this.f14453c, this.d, this.f14454e, this.f14455f, null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public C0250b<T> c() {
            if (this.f14453c == 0) {
                this.f14453c = 2;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }

        public C0250b<T> d(e<T> eVar) {
            this.f14454e = eVar;
            return this;
        }
    }

    public b(Set set, Set set2, int i10, int i11, e eVar, Set set3, a aVar) {
        this.f14446a = Collections.unmodifiableSet(set);
        this.f14447b = Collections.unmodifiableSet(set2);
        this.f14448c = i10;
        this.d = i11;
        this.f14449e = eVar;
        this.f14450f = Collections.unmodifiableSet(set3);
    }

    public static <T> C0250b<T> a(Class<T> cls) {
        return new C0250b<>(cls, new Class[0], null);
    }

    @SafeVarargs
    public static <T> b<T> c(T t2, Class<T> cls, Class<? super T>... clsArr) {
        C0250b c0250b = new C0250b(cls, clsArr, null);
        c0250b.f14454e = new qb.a(t2);
        return c0250b.b();
    }

    public boolean b() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f14446a.toArray()) + ">{" + this.f14448c + ", type=" + this.d + ", deps=" + Arrays.toString(this.f14447b.toArray()) + "}";
    }
}
