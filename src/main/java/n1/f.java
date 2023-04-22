package n1;

import java.util.Objects;
import java.util.concurrent.Executor;
import n1.e;
import n1.i;
import n1.n;

/* loaded from: classes2.dex */
public final class f extends androidx.lifecycle.c<i<Object>> {

    /* renamed from: g  reason: collision with root package name */
    public i<Object> f13206g;

    /* renamed from: h  reason: collision with root package name */
    public e<Object, Object> f13207h;

    /* renamed from: i  reason: collision with root package name */
    public final e.b f13208i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f13209j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e.a f13210k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ i.b f13211l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Executor f13212m;
    public final /* synthetic */ Executor n;

    /* loaded from: classes2.dex */
    public class a implements e.b {
        public a() {
        }

        @Override // n1.e.b
        public void a() {
            f fVar = f.this;
            Objects.requireNonNull(fVar);
            l.a s10 = l.a.s();
            Runnable runnable = fVar.f2369f;
            if (s10.k()) {
                runnable.run();
            } else {
                s10.q(runnable);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Executor executor, Object obj, e.a aVar, i.b bVar, Executor executor2, Executor executor3) {
        super(executor);
        this.f13209j = obj;
        this.f13210k = aVar;
        this.f13211l = bVar;
        this.f13212m = executor2;
        this.n = executor3;
        this.f13208i = new a();
    }

    @Override // androidx.lifecycle.c
    public i<Object> a() {
        i<Object> iVar;
        e<Object, Object> eVar;
        int i10;
        Object obj = this.f13209j;
        i<Object> iVar2 = this.f13206g;
        if (iVar2 != null) {
            obj = iVar2.l();
        }
        do {
            e<Object, Object> eVar2 = this.f13207h;
            if (eVar2 != null) {
                eVar2.e(this.f13208i);
            }
            e<Object, Object> a10 = this.f13210k.a();
            this.f13207h = a10;
            a10.a(this.f13208i);
            e<Object, Object> eVar3 = this.f13207h;
            i.b bVar = this.f13211l;
            if (eVar3 == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            }
            if (bVar == null) {
                throw new IllegalArgumentException("Config may not be null");
            }
            Executor executor = this.f13212m;
            Executor executor2 = this.n;
            if (executor == null) {
                throw new IllegalArgumentException("MainThreadExecutor required");
            }
            if (executor2 == null) {
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            int i11 = i.B;
            if (!eVar3.c() && bVar.f13234c) {
                iVar = new p<>((n) eVar3, executor, executor2, bVar, obj != null ? ((Integer) obj).intValue() : 0);
                this.f13206g = iVar;
            }
            if (!eVar3.c()) {
                eVar = new n.a<>((n) eVar3);
                if (obj != null) {
                    i10 = ((Integer) obj).intValue();
                    iVar = new d<>((c) eVar, executor, executor2, bVar, obj, i10);
                    this.f13206g = iVar;
                } else {
                    eVar3 = eVar;
                }
            }
            eVar = eVar3;
            i10 = -1;
            iVar = new d<>((c) eVar, executor, executor2, bVar, obj, i10);
            this.f13206g = iVar;
        } while (iVar.o());
        return this.f13206g;
    }
}
