package n1;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import n1.e;
import n1.h;

/* loaded from: classes2.dex */
public abstract class n<T> extends n1.e<Integer, T> {

    /* loaded from: classes2.dex */
    public static class a<Value> extends n1.c<Integer, Value> {

        /* renamed from: c  reason: collision with root package name */
        public final n<Value> f13252c;

        public a(n<Value> nVar) {
            this.f13252c = nVar;
        }

        @Override // n1.e
        public void a(e.b bVar) {
            this.f13252c.f13198b.add(bVar);
        }

        @Override // n1.e
        public void b() {
            this.f13252c.b();
        }

        @Override // n1.e
        public boolean d() {
            return this.f13252c.d();
        }

        @Override // n1.e
        public void e(e.b bVar) {
            this.f13252c.f13198b.remove(bVar);
        }

        @Override // n1.c
        public void f(int i10, Value value, int i11, Executor executor, h.a<Value> aVar) {
            this.f13252c.g(1, i10 + 1, i11, executor, aVar);
        }

        @Override // n1.c
        public void g(int i10, Value value, int i11, Executor executor, h.a<Value> aVar) {
            int i12 = i10 - 1;
            if (i12 < 0) {
                this.f13252c.g(2, i12, 0, executor, aVar);
                return;
            }
            int min = Math.min(i11, i12 + 1);
            this.f13252c.g(2, (i12 - min) + 1, min, executor, aVar);
        }

        @Override // n1.c
        public void h(Integer num, int i10, int i11, boolean z10, Executor executor, h.a aVar) {
            Integer valueOf;
            Integer num2 = num;
            if (num2 == null) {
                valueOf = 0;
            } else {
                i10 = Math.max(i10 / i11, 2) * i11;
                valueOf = Integer.valueOf(Math.max(0, ((num2.intValue() - (i10 / 2)) / i11) * i11));
            }
            this.f13252c.f(false, valueOf.intValue(), i10, i11, executor, aVar);
        }

        @Override // n1.c
        public Integer i(int i10, Object obj) {
            return Integer.valueOf(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b<T> {
    }

    /* loaded from: classes2.dex */
    public static class c<T> extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final e.c<T> f13253a;

        public c(n nVar, boolean z10, int i10, h.a<T> aVar) {
            this.f13253a = new e.c<>(nVar, 0, null, aVar);
            if (i10 < 1) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d {
        public d(int i10, int i11, int i12, boolean z10) {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e<T> {
    }

    /* loaded from: classes2.dex */
    public static class f<T> extends e<T> {

        /* renamed from: a  reason: collision with root package name */
        public e.c<T> f13254a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13255b;

        public f(n nVar, int i10, int i11, Executor executor, h.a<T> aVar) {
            this.f13254a = new e.c<>(nVar, i10, executor, aVar);
            this.f13255b = i11;
        }
    }

    /* loaded from: classes2.dex */
    public static class g {
        public g(int i10, int i11) {
        }
    }

    @Override // n1.e
    public boolean c() {
        return false;
    }

    public final void f(boolean z10, int i10, int i11, int i12, Executor executor, h.a<T> aVar) {
        c cVar = new c(this, z10, i12, aVar);
        h(new d(i10, i11, i12, z10), cVar);
        e.c<T> cVar2 = cVar.f13253a;
        synchronized (cVar2.d) {
            cVar2.f13202e = executor;
        }
    }

    public final void g(int i10, int i11, int i12, Executor executor, h.a<T> aVar) {
        f fVar = new f(this, i10, i11, executor, aVar);
        if (i12 != 0) {
            i(new g(i11, i12), fVar);
            return;
        }
        List emptyList = Collections.emptyList();
        if (fVar.f13254a.a()) {
            return;
        }
        fVar.f13254a.b(new h<>(emptyList, 0, 0, fVar.f13255b));
    }

    public abstract void h(d dVar, b<T> bVar);

    public abstract void i(g gVar, e<T> eVar);
}
