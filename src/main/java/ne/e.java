package ne;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.ThreadContextKt;
import le.e0;
import le.p0;
import le.q0;
import le.w;
import t9.k0;
import vb.y;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final y f13443a = new y("UNDEFINED");
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final y f13444b = new y("REUSABLE_CLAIMED");

    public static void a(Continuation continuation, Object obj, Function1 function1, int i10) {
        boolean z10;
        if (!(continuation instanceof d)) {
            continuation.resumeWith(obj);
            return;
        }
        d dVar = (d) continuation;
        Object j10 = k0.j(obj, null);
        if (dVar.f13440m.n(dVar.getContext())) {
            dVar.f13441t = j10;
            dVar.f12834j = 1;
            dVar.f13440m.m(dVar.getContext(), dVar);
            return;
        }
        p0 p0Var = p0.f12827a;
        w a10 = p0.a();
        if (a10.E()) {
            dVar.f13441t = j10;
            dVar.f12834j = 1;
            a10.v(dVar);
            return;
        }
        a10.w(true);
        try {
            e0 e0Var = (e0) dVar.getContext().get(e0.b.f12796c);
            if (e0Var == null || e0Var.e()) {
                z10 = false;
            } else {
                CancellationException d = e0Var.d();
                if (j10 instanceof le.n) {
                    ((le.n) j10).f12825b.invoke(d);
                }
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(d)));
                z10 = true;
            }
            if (!z10) {
                Continuation<T> continuation2 = dVar.n;
                Object obj2 = dVar.f13442u;
                CoroutineContext context = continuation2.getContext();
                Object b10 = ThreadContextKt.b(context, obj2);
                q0<?> a11 = b10 != ThreadContextKt.f12118a ? le.p.a(continuation2, context, b10) : null;
                dVar.n.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                if (a11 == null || a11.D()) {
                    ThreadContextKt.a(context, b10);
                }
            }
            do {
            } while (a10.F());
        } finally {
            try {
            } finally {
            }
        }
    }
}
