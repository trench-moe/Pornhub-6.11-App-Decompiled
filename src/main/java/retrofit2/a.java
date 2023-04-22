package retrofit2;

import gf.f;
import gf.j;
import gf.k;
import gf.l;
import gf.s;
import gf.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import pe.a0;
import pe.d;

/* loaded from: classes3.dex */
public abstract class a<ResponseT, ReturnT> extends v<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final s f14764a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f14765b;

    /* renamed from: c  reason: collision with root package name */
    public final f<a0, ResponseT> f14766c;

    /* renamed from: retrofit2.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0257a<ResponseT, ReturnT> extends a<ResponseT, ReturnT> {
        public final gf.c<ResponseT, ReturnT> d;

        public C0257a(s sVar, d.a aVar, f<a0, ResponseT> fVar, gf.c<ResponseT, ReturnT> cVar) {
            super(sVar, aVar, fVar);
            this.d = cVar;
        }

        @Override // retrofit2.a
        public ReturnT c(gf.b<ResponseT> bVar, Object[] objArr) {
            return this.d.b(bVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<ResponseT> extends a<ResponseT, Object> {
        public final gf.c<ResponseT, gf.b<ResponseT>> d;

        public b(s sVar, d.a aVar, f<a0, ResponseT> fVar, gf.c<ResponseT, gf.b<ResponseT>> cVar, boolean z10) {
            super(sVar, aVar, fVar);
            this.d = cVar;
        }

        @Override // retrofit2.a
        public Object c(gf.b<ResponseT> bVar, Object[] objArr) {
            final gf.b<ResponseT> b10 = this.d.b(bVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                le.f fVar = new le.f(IntrinsicsKt.intercepted(continuation), 1);
                fVar.o(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        gf.b.this.cancel();
                        return Unit.INSTANCE;
                    }
                });
                b10.V(new j(fVar));
                Object n = fVar.n();
                if (n == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return n;
            } catch (Exception e10) {
                return KotlinExtensions.a(e10, continuation);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<ResponseT> extends a<ResponseT, Object> {
        public final gf.c<ResponseT, gf.b<ResponseT>> d;

        public c(s sVar, d.a aVar, f<a0, ResponseT> fVar, gf.c<ResponseT, gf.b<ResponseT>> cVar) {
            super(sVar, aVar, fVar);
            this.d = cVar;
        }

        @Override // retrofit2.a
        public Object c(gf.b<ResponseT> bVar, Object[] objArr) {
            final gf.b<ResponseT> b10 = this.d.b(bVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                le.f fVar = new le.f(IntrinsicsKt.intercepted(continuation), 1);
                fVar.o(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        gf.b.this.cancel();
                        return Unit.INSTANCE;
                    }
                });
                b10.V(new k(fVar));
                Object n = fVar.n();
                if (n == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return n;
            } catch (Exception e10) {
                return KotlinExtensions.a(e10, continuation);
            }
        }
    }

    public a(s sVar, d.a aVar, f<a0, ResponseT> fVar) {
        this.f14764a = sVar;
        this.f14765b = aVar;
        this.f14766c = fVar;
    }

    @Override // gf.v
    public final ReturnT a(Object[] objArr) {
        return c(new l(this.f14764a, objArr, this.f14765b, this.f14766c), objArr);
    }

    public abstract ReturnT c(gf.b<ResponseT> bVar, Object[] objArr);
}
