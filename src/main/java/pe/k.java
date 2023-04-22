package pe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import te.e;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f13971a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<e.a> f13972b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<e.a> f13973c = new ArrayDeque<>();
    public final ArrayDeque<te.e> d = new ArrayDeque<>();

    public final <T> void a(Deque<T> deque, T t2) {
        synchronized (this) {
            if (!deque.remove(t2)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.INSTANCE;
        }
        c();
    }

    public final void b(e.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f15450c.decrementAndGet();
        a(this.f13973c, call);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.k.c():boolean");
    }
}
