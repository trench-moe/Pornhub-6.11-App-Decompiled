package gf;

import gf.c;
import gf.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class g extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9957a;

    /* loaded from: classes2.dex */
    public class a implements c<Object, gf.b<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Type f9958a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Executor f9959b;

        public a(g gVar, Type type, Executor executor) {
            this.f9958a = type;
            this.f9959b = executor;
        }

        @Override // gf.c
        public Type a() {
            return this.f9958a;
        }

        @Override // gf.c
        public gf.b<?> b(gf.b<Object> bVar) {
            Executor executor = this.f9959b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements gf.b<T> {

        /* renamed from: c  reason: collision with root package name */
        public final Executor f9960c;

        /* renamed from: f  reason: collision with root package name */
        public final gf.b<T> f9961f;

        /* loaded from: classes2.dex */
        public class a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f9962a;

            public a(d dVar) {
                this.f9962a = dVar;
            }

            @Override // gf.d
            public void a(gf.b<T> bVar, final Throwable th) {
                Executor executor = b.this.f9960c;
                final d dVar = this.f9962a;
                executor.execute(new Runnable() { // from class: gf.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.b.a aVar = g.b.a.this;
                        dVar.a(g.b.this, th);
                    }
                });
            }

            @Override // gf.d
            public void b(gf.b<T> bVar, t<T> tVar) {
                b.this.f9960c.execute(new androidx.emoji2.text.e(this, this.f9962a, tVar, 3));
            }
        }

        public b(Executor executor, gf.b<T> bVar) {
            this.f9960c = executor;
            this.f9961f = bVar;
        }

        @Override // gf.b
        /* renamed from: S */
        public gf.b<T> clone() {
            return new b(this.f9960c, this.f9961f.S());
        }

        @Override // gf.b
        public void V(d<T> dVar) {
            this.f9961f.V(new a(dVar));
        }

        @Override // gf.b
        public void cancel() {
            this.f9961f.cancel();
        }

        @Override // gf.b
        public t<T> e() {
            return this.f9961f.e();
        }

        @Override // gf.b
        public boolean h() {
            return this.f9961f.h();
        }

        @Override // gf.b
        public pe.u m() {
            return this.f9961f.m();
        }
    }

    public g(Executor executor) {
        this.f9957a = executor;
    }

    @Override // gf.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, u uVar) {
        if (retrofit2.b.f(type) != gf.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(this, retrofit2.b.e(0, (ParameterizedType) type), retrofit2.b.i(annotationArr, w.class) ? null : this.f9957a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
