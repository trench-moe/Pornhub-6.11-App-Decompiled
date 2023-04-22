package n1;

import a4.a;
import com.app.pornhub.domain.config.FiltersConfig;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import n1.e;
import n1.g;
import n1.h;

/* loaded from: classes.dex */
public abstract class g<Key, Value> extends n1.c<Key, Value> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f13214c = new Object();
    public Key d = null;

    /* renamed from: e  reason: collision with root package name */
    public Key f13215e = null;

    /* loaded from: classes2.dex */
    public static abstract class a<Key, Value> {
    }

    /* loaded from: classes2.dex */
    public static class b<Key, Value> extends a<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        public final e.c<Value> f13216a;

        /* renamed from: b  reason: collision with root package name */
        public final g<Key, Value> f13217b;

        public b(g<Key, Value> gVar, int i10, Executor executor, h.a<Value> aVar) {
            this.f13216a = new e.c<>(gVar, i10, executor, aVar);
            this.f13217b = gVar;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c<Key, Value> {
    }

    /* loaded from: classes2.dex */
    public static class d<Key, Value> extends c<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        public final e.c<Value> f13218a;

        /* renamed from: b  reason: collision with root package name */
        public final g<Key, Value> f13219b;

        public d(g<Key, Value> gVar, boolean z10, h.a<Value> aVar) {
            this.f13218a = new e.c<>(gVar, 0, null, aVar);
            this.f13219b = gVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class e<Key> {
        public e(int i10, boolean z10) {
        }
    }

    /* loaded from: classes2.dex */
    public static class f<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final Key f13220a;

        public f(Key key, int i10) {
            this.f13220a = key;
        }
    }

    @Override // n1.c
    public final void f(int i10, Value value, int i11, Executor executor, h.a<Value> aVar) {
        Key key;
        synchronized (this.f13214c) {
            try {
                key = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (key == null) {
            aVar.a(1, h.f13221c);
            return;
        }
        final f params = new f(key, i11);
        final b callback = new b(this, 1, executor, aVar);
        final u4.n nVar = (u4.n) this;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o3.h hVar = nVar.f15557f;
        String orderAbbr = VideosConfig.Companion.getOrderAbbr(nVar.f15558g);
        String filterAbbr = FiltersConfig.Companion.getFilterAbbr(nVar.f15559h);
        String str = nVar.f15560i;
        Intrinsics.checkNotNullExpressionValue(key, "params.key");
        Disposable subscribe = hVar.a(orderAbbr, filterAbbr, str, ((Number) key).intValue()).subscribe(new Consumer() { // from class: u4.l
            /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Integer, Key] */
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                a.InterfaceC0004a interfaceC0004a;
                n this$0 = n.this;
                g.a callback2 = callback;
                g.f params2 = params;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                Intrinsics.checkNotNullParameter(params2, "$params");
                if (useCaseResult instanceof UseCaseResult.a) {
                    a.InterfaceC0004a interfaceC0004a2 = this$0.f15561j;
                    if (interfaceC0004a2 == null) {
                        return;
                    }
                    interfaceC0004a2.c(false);
                } else if (!(useCaseResult instanceof UseCaseResult.Result)) {
                    if (!(useCaseResult instanceof UseCaseResult.Failure) || (interfaceC0004a = this$0.f15561j) == null) {
                        return;
                    }
                    interfaceC0004a.b(false, ((UseCaseResult.Failure) useCaseResult).a());
                } else {
                    a.InterfaceC0004a interfaceC0004a3 = this$0.f15561j;
                    if (interfaceC0004a3 != null) {
                        interfaceC0004a3.a(false, ((Collection) ((UseCaseResult.Result) useCaseResult).a()).size());
                    }
                    UseCaseResult.Result result = (UseCaseResult.Result) useCaseResult;
                    List list = (List) result.a();
                    ?? valueOf = Integer.valueOf(((List) result.a()).size() + ((Number) params2.f13220a).intValue());
                    g.b bVar = (g.b) callback2;
                    if (bVar.f13216a.a()) {
                        return;
                    }
                    if (bVar.f13216a.f13199a == 1) {
                        n1.g<Key, Value> gVar = bVar.f13217b;
                        synchronized (gVar.f13214c) {
                            gVar.d = valueOf;
                        }
                    } else {
                        n1.g<Key, Value> gVar2 = bVar.f13217b;
                        synchronized (gVar2.f13214c) {
                            gVar2.f13215e = valueOf;
                        }
                    }
                    bVar.f13216a.b(new n1.h(list, 0, 0, 0));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "getVideosUseCase.execute…}\n            }\n        }");
        DisposableKt.addTo(subscribe, nVar.f15562k);
    }

    @Override // n1.c
    public final void g(int i10, Value value, int i11, Executor executor, h.a<Value> aVar) {
        Key key;
        synchronized (this.f13214c) {
            key = this.f13215e;
        }
        if (key == null) {
            aVar.a(2, h.f13221c);
            return;
        }
        f params = new f(key, i11);
        b callback = new b(this, 2, executor, aVar);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // n1.c
    public final void h(Key key, int i10, int i11, boolean z10, Executor executor, h.a<Value> aVar) {
        final d callback = new d(this, z10, aVar);
        e params = new e(i10, z10);
        final u4.n nVar = (u4.n) this;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Disposable subscribe = nVar.f15557f.a(VideosConfig.Companion.getOrderAbbr(nVar.f15558g), FiltersConfig.Companion.getFilterAbbr(nVar.f15559h), nVar.f15560i, 0).subscribe(new Consumer() { // from class: u4.m
            /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Integer, Key] */
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                a.InterfaceC0004a interfaceC0004a;
                n this$0 = n.this;
                g.c callback2 = callback;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                if (useCaseResult instanceof UseCaseResult.a) {
                    a.InterfaceC0004a interfaceC0004a2 = this$0.f15561j;
                    if (interfaceC0004a2 == null) {
                        return;
                    }
                    interfaceC0004a2.c(true);
                } else if (!(useCaseResult instanceof UseCaseResult.Result)) {
                    if (!(useCaseResult instanceof UseCaseResult.Failure) || (interfaceC0004a = this$0.f15561j) == null) {
                        return;
                    }
                    interfaceC0004a.b(true, ((UseCaseResult.Failure) useCaseResult).a());
                } else {
                    a.InterfaceC0004a interfaceC0004a3 = this$0.f15561j;
                    if (interfaceC0004a3 != null) {
                        interfaceC0004a3.a(true, ((Collection) ((UseCaseResult.Result) useCaseResult).a()).size());
                    }
                    UseCaseResult.Result result = (UseCaseResult.Result) useCaseResult;
                    List list = (List) result.a();
                    ?? valueOf = Integer.valueOf(((List) result.a()).size());
                    g.d dVar = (g.d) callback2;
                    if (dVar.f13218a.a()) {
                        return;
                    }
                    n1.g<Key, Value> gVar = dVar.f13219b;
                    synchronized (gVar.f13214c) {
                        gVar.f13215e = null;
                        gVar.d = valueOf;
                    }
                    dVar.f13218a.b(new n1.h(list, 0, 0, 0));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "getVideosUseCase.execute…}\n            }\n        }");
        DisposableKt.addTo(subscribe, nVar.f15562k);
        e.c<Value> cVar = callback.f13218a;
        synchronized (cVar.d) {
            cVar.f13202e = executor;
        }
    }

    @Override // n1.c
    public final Key i(int i10, Value value) {
        return null;
    }

    @Override // n1.c
    public boolean j() {
        return false;
    }
}
