package le;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.internal.ThreadContextKt;
import le.e0;

/* loaded from: classes3.dex */
public abstract class s<T> extends oe.f {
    @JvmField

    /* renamed from: j  reason: collision with root package name */
    public int f12834j;

    public s(int i10) {
        this.f12834j = i10;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract Continuation<T> b();

    public Throwable c(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar == null) {
            return null;
        }
        return mVar.f12823a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T d(Object obj) {
        return obj;
    }

    public final void e(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        l9.e.g(b().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object f();

    @Override // java.lang.Runnable
    public final void run() {
        Object m16constructorimpl;
        e0 e0Var;
        Object m16constructorimpl2;
        oe.g gVar = this.f13651f;
        try {
            ne.d dVar = (ne.d) b();
            Continuation<T> continuation = dVar.n;
            Object obj = dVar.f13442u;
            CoroutineContext context = continuation.getContext();
            Object b10 = ThreadContextKt.b(context, obj);
            q0<?> a10 = b10 != ThreadContextKt.f12118a ? p.a(continuation, context, b10) : null;
            CoroutineContext context2 = continuation.getContext();
            Object f10 = f();
            Throwable c10 = c(f10);
            if (c10 == null && a0.b.M(this.f12834j)) {
                int i10 = e0.d;
                e0Var = (e0) context2.get(e0.b.f12796c);
            } else {
                e0Var = null;
            }
            if (e0Var != null && !e0Var.e()) {
                CancellationException d = e0Var.d();
                a(f10, d);
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(d)));
            } else if (c10 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(c10)));
            } else {
                T d10 = d(f10);
                Result.Companion companion3 = Result.Companion;
                continuation.resumeWith(Result.m16constructorimpl(d10));
            }
            Unit unit = Unit.INSTANCE;
            if (a10 == null || a10.D()) {
                ThreadContextKt.a(context, b10);
            }
            try {
                Result.Companion companion4 = Result.Companion;
                gVar.a();
                m16constructorimpl2 = Result.m16constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion5 = Result.Companion;
                m16constructorimpl2 = Result.m16constructorimpl(ResultKt.createFailure(th));
            }
            e(null, Result.m19exceptionOrNullimpl(m16constructorimpl2));
        } catch (Throwable th2) {
            try {
                Result.Companion companion6 = Result.Companion;
                gVar.a();
                m16constructorimpl = Result.m16constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion7 = Result.Companion;
                m16constructorimpl = Result.m16constructorimpl(ResultKt.createFailure(th3));
            }
            e(th2, Result.m19exceptionOrNullimpl(m16constructorimpl));
        }
    }
}
