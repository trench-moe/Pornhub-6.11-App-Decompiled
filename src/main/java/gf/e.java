package gf;

import gf.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;

@IgnoreJRERequirement
/* loaded from: classes2.dex */
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f9951a = new e();

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class a<R> implements gf.c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f9952a;

        @IgnoreJRERequirement
        /* renamed from: gf.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0142a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<R> f9953a;

            public C0142a(a aVar, CompletableFuture<R> completableFuture) {
                this.f9953a = completableFuture;
            }

            @Override // gf.d
            public void a(gf.b<R> bVar, Throwable th) {
                this.f9953a.completeExceptionally(th);
            }

            @Override // gf.d
            public void b(gf.b<R> bVar, t<R> tVar) {
                if (tVar.a()) {
                    this.f9953a.complete(tVar.f10077b);
                } else {
                    this.f9953a.completeExceptionally(new HttpException(tVar));
                }
            }
        }

        public a(Type type) {
            this.f9952a = type;
        }

        @Override // gf.c
        public Type a() {
            return this.f9952a;
        }

        @Override // gf.c
        public Object b(gf.b bVar) {
            b bVar2 = new b(bVar);
            bVar.V(new C0142a(this, bVar2));
            return bVar2;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: c  reason: collision with root package name */
        public final gf.b<?> f9954c;

        public b(gf.b<?> bVar) {
            this.f9954c = bVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f9954c.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class c<R> implements gf.c<R, CompletableFuture<t<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f9955a;

        @IgnoreJRERequirement
        /* loaded from: classes2.dex */
        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<t<R>> f9956a;

            public a(c cVar, CompletableFuture<t<R>> completableFuture) {
                this.f9956a = completableFuture;
            }

            @Override // gf.d
            public void a(gf.b<R> bVar, Throwable th) {
                this.f9956a.completeExceptionally(th);
            }

            @Override // gf.d
            public void b(gf.b<R> bVar, t<R> tVar) {
                this.f9956a.complete(tVar);
            }
        }

        public c(Type type) {
            this.f9955a = type;
        }

        @Override // gf.c
        public Type a() {
            return this.f9955a;
        }

        @Override // gf.c
        public Object b(gf.b bVar) {
            b bVar2 = new b(bVar);
            bVar.V(new a(this, bVar2));
            return bVar2;
        }
    }

    @Override // gf.c.a
    public gf.c<?, ?> a(Type type, Annotation[] annotationArr, u uVar) {
        if (retrofit2.b.f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e10 = retrofit2.b.e(0, (ParameterizedType) type);
            if (retrofit2.b.f(e10) != t.class) {
                return new a(e10);
            }
            if (e10 instanceof ParameterizedType) {
                return new c(retrofit2.b.e(0, (ParameterizedType) e10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
