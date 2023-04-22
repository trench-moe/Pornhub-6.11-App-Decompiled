package k5;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class h implements k5.b {

    /* renamed from: a  reason: collision with root package name */
    public final f<a, Object> f11792a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f11793b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f11794c = new HashMap();
    public final Map<Class<?>, k5.a<?>> d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f11795e;

    /* renamed from: f  reason: collision with root package name */
    public int f11796f;

    /* loaded from: classes2.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final b f11797a;

        /* renamed from: b  reason: collision with root package name */
        public int f11798b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f11799c;

        public a(b bVar) {
            this.f11797a = bVar;
        }

        @Override // k5.k
        public void a() {
            this.f11797a.e(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f11798b == aVar.f11798b && this.f11799c == aVar.f11799c;
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f11798b * 31;
            Class<?> cls = this.f11799c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("Key{size=");
            m10.append(this.f11798b);
            m10.append("array=");
            m10.append(this.f11799c);
            m10.append('}');
            return m10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h2.k {
        @Override // h2.k
        public k c() {
            return new a(this);
        }

        public a v(int i10, Class<?> cls) {
            a aVar = (a) d();
            aVar.f11798b = i10;
            aVar.f11799c = cls;
            return aVar;
        }
    }

    public h(int i10) {
        this.f11795e = i10;
    }

    @Override // k5.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                synchronized (this) {
                    g(0);
                }
            } else {
                if (i10 < 20) {
                    if (i10 == 15) {
                    }
                }
                g(this.f11795e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // k5.b
    public synchronized void b() {
        try {
            g(0);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k5.b
    public synchronized <T> T c(int i10, Class<T> cls) {
        a aVar;
        aVar = (a) this.f11793b.d();
        aVar.f11798b = i10;
        aVar.f11799c = cls;
        return (T) i(aVar, cls);
    }

    @Override // k5.b
    public synchronized <T> void d(T t2) {
        try {
            Class<?> cls = t2.getClass();
            k5.a<T> h10 = h(cls);
            int b10 = h10.b(t2);
            int a10 = h10.a() * b10;
            int i10 = 1;
            if (a10 <= this.f11795e / 2) {
                a v2 = this.f11793b.v(b10, cls);
                this.f11792a.b(v2, t2);
                NavigableMap<Integer, Integer> j10 = j(cls);
                Integer num = (Integer) j10.get(Integer.valueOf(v2.f11798b));
                Integer valueOf = Integer.valueOf(v2.f11798b);
                if (num != null) {
                    i10 = 1 + num.intValue();
                }
                j10.put(valueOf, Integer.valueOf(i10));
                this.f11796f += a10;
                g(this.f11795e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0002, B:6:0x0018, B:8:0x001d, B:15:0x002f, B:21:0x003f, B:23:0x005a, B:22:0x004a), top: B:31:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0002, B:6:0x0018, B:8:0x001d, B:15:0x002f, B:21:0x003f, B:23:0x005a, B:22:0x004a), top: B:31:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0002, B:6:0x0018, B:8:0x001d, B:15:0x002f, B:21:0x003f, B:23:0x005a, B:22:0x004a), top: B:31:0x0002 }] */
    @Override // k5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized <T> T e(int r9, java.lang.Class<T> r10) {
        /*
            r8 = this;
            r5 = r8
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.j(r10)     // Catch: java.lang.Throwable -> L62
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L62
            r0 = r7
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L62
            r7 = 5
            r7 = 1
            r1 = r7
            r7 = 0
            r2 = r7
            if (r0 == 0) goto L39
            int r3 = r5.f11796f     // Catch: java.lang.Throwable -> L62
            r7 = 7
            if (r3 == 0) goto L2a
            int r4 = r5.f11795e     // Catch: java.lang.Throwable -> L62
            r7 = 1
            int r4 = r4 / r3
            r7 = 6
            r3 = 2
            r7 = 6
            if (r4 < r3) goto L27
            goto L2b
        L27:
            r7 = 4
            r3 = 0
            goto L2d
        L2a:
            r7 = 1
        L2b:
            r3 = 1
            r7 = 7
        L2d:
            if (r3 != 0) goto L3c
            r7 = 3
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L62
            int r4 = r9 * 8
            if (r3 > r4) goto L39
            goto L3d
        L39:
            r7 = 1
            r7 = 0
            r1 = r7
        L3c:
            r7 = 2
        L3d:
            if (r1 == 0) goto L4a
            k5.h$b r9 = r5.f11793b     // Catch: java.lang.Throwable -> L62
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L62
            k5.h$a r9 = r9.v(r0, r10)     // Catch: java.lang.Throwable -> L62
            goto L5a
        L4a:
            r7 = 2
            k5.h$b r0 = r5.f11793b     // Catch: java.lang.Throwable -> L62
            r7 = 6
            k5.k r7 = r0.d()     // Catch: java.lang.Throwable -> L62
            r0 = r7
            k5.h$a r0 = (k5.h.a) r0     // Catch: java.lang.Throwable -> L62
            r0.f11798b = r9     // Catch: java.lang.Throwable -> L62
            r0.f11799c = r10     // Catch: java.lang.Throwable -> L62
            r9 = r0
        L5a:
            java.lang.Object r7 = r5.i(r9, r10)     // Catch: java.lang.Throwable -> L62
            r9 = r7
            monitor-exit(r5)
            r7 = 7
            return r9
        L62:
            r9 = move-exception
            monitor-exit(r5)
            r7 = 2
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.h.e(int, java.lang.Class):java.lang.Object");
    }

    public final void f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> j10 = j(cls);
        Integer num = (Integer) j10.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                j10.remove(Integer.valueOf(i10));
                return;
            } else {
                j10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void g(int i10) {
        while (true) {
            while (this.f11796f > i10) {
                Object c10 = this.f11792a.c();
                Objects.requireNonNull(c10, "Argument must not be null");
                k5.a h10 = h(c10.getClass());
                this.f11796f -= h10.a() * h10.b(c10);
                f(h10.b(c10), c10.getClass());
                if (Log.isLoggable(h10.o(), 2)) {
                    String o10 = h10.o();
                    StringBuilder m10 = a1.a.m("evicted: ");
                    m10.append(h10.b(c10));
                    Log.v(o10, m10.toString());
                }
            }
            return;
        }
    }

    public final <T> k5.a<T> h(Class<T> cls) {
        g gVar = (k5.a<T>) this.d.get(cls);
        if (gVar == null) {
            if (cls.equals(int[].class)) {
                gVar = new g();
            } else if (!cls.equals(byte[].class)) {
                StringBuilder m10 = a1.a.m("No array pool found for: ");
                m10.append(cls.getSimpleName());
                throw new IllegalArgumentException(m10.toString());
            } else {
                gVar = new e();
            }
            this.d.put(cls, gVar);
        }
        return gVar;
    }

    public final <T> T i(a aVar, Class<T> cls) {
        k5.a<T> h10 = h(cls);
        T t2 = (T) this.f11792a.a(aVar);
        if (t2 != null) {
            this.f11796f -= h10.a() * h10.b(t2);
            f(h10.b(t2), cls);
        }
        if (t2 == null) {
            if (Log.isLoggable(h10.o(), 2)) {
                String o10 = h10.o();
                StringBuilder m10 = a1.a.m("Allocated ");
                m10.append(aVar.f11798b);
                m10.append(" bytes");
                Log.v(o10, m10.toString());
            }
            return h10.newArray(aVar.f11798b);
        }
        return t2;
    }

    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f11794c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f11794c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }
}
