package le;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletionHandlerException;

@PublishedApi
/* loaded from: classes3.dex */
public class f<T> extends s<T> implements e<T>, CoroutineStackFrame {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12797u = AtomicIntegerFieldUpdater.newUpdater(f.class, "_decision");

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12798w = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: m  reason: collision with root package name */
    public final Continuation<T> f12799m;
    public final CoroutineContext n;

    /* renamed from: t  reason: collision with root package name */
    public u f12800t;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Continuation<? super T> continuation, int i10) {
        super(i10);
        this.f12799m = continuation;
        this.n = continuation.getContext();
        this._decision = 0;
        this._state = b.f12792c;
    }

    @Override // le.s
    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof m0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof m) {
                return;
            }
            boolean z10 = false;
            if (obj2 instanceof l) {
                l lVar = (l) obj2;
                if (!(!(lVar.f12820e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                l a10 = l.a(lVar, null, null, null, null, th, 15);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12798w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    d dVar = lVar.f12818b;
                    if (dVar != null) {
                        h(dVar, th);
                    }
                    Function1<Throwable, Unit> function1 = lVar.f12819c;
                    if (function1 == null) {
                        return;
                    }
                    i(function1, th);
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12798w;
                l lVar2 = new l(obj2, null, null, null, th, 14);
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, lVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    @Override // le.s
    public final Continuation<T> b() {
        return this.f12799m;
    }

    @Override // le.s
    public Throwable c(Object obj) {
        Throwable c10 = super.c(obj);
        if (c10 == null) {
            return null;
        }
        return c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // le.s
    public <T> T d(Object obj) {
        return obj instanceof l ? (T) ((l) obj).f12817a : obj;
    }

    @Override // le.s
    public Object f() {
        return this._state;
    }

    public final void g(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            l9.e.g(this.n, new CompletionHandlerException(Intrinsics.stringPlus("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f12799m;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.n;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void h(d dVar, Throwable th) {
        try {
            dVar.a(th);
        } catch (Throwable th2) {
            l9.e.g(this.n, new CompletionHandlerException(Intrinsics.stringPlus("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void i(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            l9.e.g(this.n, new CompletionHandlerException(Intrinsics.stringPlus("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0020, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j(java.lang.Throwable r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._state
            boolean r1 = r0 instanceof le.m0
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            le.g r1 = new le.g
            boolean r3 = r0 instanceof le.d
            r1.<init>(r7, r8, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = le.f.f12798w
        L11:
            boolean r5 = r4.compareAndSet(r7, r0, r1)
            r6 = 1
            if (r5 == 0) goto L1a
            r2 = 1
            goto L20
        L1a:
            java.lang.Object r5 = r4.get(r7)
            if (r5 == r0) goto L11
        L20:
            if (r2 != 0) goto L23
            goto L0
        L23:
            if (r3 == 0) goto L28
            le.d r0 = (le.d) r0
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 != 0) goto L2c
            goto L2f
        L2c:
            r7.h(r0, r8)
        L2f:
            r7.l()
            int r8 = r7.f12834j
            r7.m(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: le.f.j(java.lang.Throwable):boolean");
    }

    public final void k() {
        u uVar = this.f12800t;
        if (uVar == null) {
            return;
        }
        uVar.dispose();
        this.f12800t = l0.f12821c;
    }

    public final void l() {
        if (p()) {
            return;
        }
        k();
    }

    /* JADX WARN: Finally extract failed */
    public final void m(int i10) {
        boolean z10;
        while (true) {
            int i11 = this._decision;
            if (i11 == 0) {
                if (f12797u.compareAndSet(this, 0, 2)) {
                    z10 = true;
                    break;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            } else {
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        Continuation<T> b10 = b();
        boolean z11 = i10 == 4;
        if (z11 || !(b10 instanceof ne.d) || a0.b.M(i10) != a0.b.M(this.f12834j)) {
            a0.b.X(this, b10, z11);
            return;
        }
        kotlinx.coroutines.b bVar = ((ne.d) b10).f13440m;
        CoroutineContext context = b10.getContext();
        if (bVar.n(context)) {
            bVar.m(context, this);
            return;
        }
        p0 p0Var = p0.f12827a;
        w a10 = p0.a();
        if (a10.E()) {
            a10.v(this);
            return;
        }
        a10.w(true);
        try {
            a0.b.X(this, b(), true);
            do {
            } while (a10.F());
        } catch (Throwable th) {
            try {
                e(th, null);
            } finally {
                a10.s(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r2 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r8.f12800t != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        r1 = r8.n;
        r2 = le.e0.d;
        r2 = (le.e0) r1.get(le.e0.b.f12796c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        r8.f12800t = le.e0.a.a(r2, true, false, new le.h(r8), 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r0 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        r0 = r8._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        if ((r0 instanceof le.m) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (a0.b.M(r8.f12834j) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        r1 = r8.n;
        r2 = le.e0.d;
        r1 = (le.e0) r1.get(le.e0.b.f12796c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r1.e() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        r1 = r1.d();
        a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
        return d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
        throw ((le.m) r0).f12823a;
     */
    @kotlin.PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n() {
        /*
            r8 = this;
            boolean r0 = r8.p()
        L4:
            int r1 = r8._decision
            r2 = 0
            if (r1 == 0) goto L19
            r3 = 2
            if (r1 != r3) goto Ld
            goto L23
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = le.f.f12797u
            r3 = 1
            boolean r1 = r1.compareAndSet(r8, r2, r3)
            if (r1 == 0) goto L4
            r2 = 1
        L23:
            if (r2 == 0) goto L52
            le.u r1 = r8.f12800t
            if (r1 != 0) goto L48
            kotlin.coroutines.CoroutineContext r1 = r8.n
            int r2 = le.e0.d
            le.e0$b r2 = le.e0.b.f12796c
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            r2 = r1
            le.e0 r2 = (le.e0) r2
            if (r2 != 0) goto L39
            goto L48
        L39:
            r3 = 1
            r4 = 0
            le.h r5 = new le.h
            r5.<init>(r8)
            r6 = 2
            r7 = 0
            le.u r1 = le.e0.a.a(r2, r3, r4, r5, r6, r7)
            r8.f12800t = r1
        L48:
            if (r0 == 0) goto L4d
            r8.r()
        L4d:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        L52:
            if (r0 == 0) goto L57
            r8.r()
        L57:
            java.lang.Object r0 = r8._state
            boolean r1 = r0 instanceof le.m
            if (r1 != 0) goto L87
            int r1 = r8.f12834j
            boolean r1 = a0.b.M(r1)
            if (r1 == 0) goto L82
            kotlin.coroutines.CoroutineContext r1 = r8.n
            int r2 = le.e0.d
            le.e0$b r2 = le.e0.b.f12796c
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            le.e0 r1 = (le.e0) r1
            if (r1 == 0) goto L82
            boolean r2 = r1.e()
            if (r2 == 0) goto L7a
            goto L82
        L7a:
            java.util.concurrent.CancellationException r1 = r1.d()
            r8.a(r0, r1)
            throw r1
        L82:
            java.lang.Object r0 = r8.d(r0)
            return r0
        L87:
            le.m r0 = (le.m) r0
            java.lang.Throwable r0 = r0.f12823a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: le.f.n():java.lang.Object");
    }

    public void o(Function1<? super Throwable, Unit> function1) {
        d b0Var = function1 instanceof d ? (d) function1 : new b0(function1);
        while (true) {
            Object obj = this._state;
            boolean z10 = false;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12798w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                if (obj instanceof d) {
                    q(function1, obj);
                    throw null;
                }
                boolean z11 = obj instanceof m;
                if (z11) {
                    m mVar = (m) obj;
                    Objects.requireNonNull(mVar);
                    if (!m.f12822b.compareAndSet(mVar, 0, 1)) {
                        q(function1, obj);
                        throw null;
                    } else if (obj instanceof g) {
                        if (!z11) {
                            mVar = null;
                        }
                        g(function1, mVar != null ? mVar.f12823a : null);
                        return;
                    } else {
                        return;
                    }
                } else if (obj instanceof l) {
                    l lVar = (l) obj;
                    if (lVar.f12818b != null) {
                        q(function1, obj);
                        throw null;
                    }
                    Throwable th = lVar.f12820e;
                    if (th != null) {
                        g(function1, th);
                        return;
                    }
                    l a10 = l.a(lVar, null, b0Var, null, null, null, 29);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12798w;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a10)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                } else {
                    l lVar2 = new l(obj, b0Var, null, null, null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f12798w;
                    while (true) {
                        if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, lVar2)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean p() {
        Continuation<T> continuation = this.f12799m;
        return (continuation instanceof ne.d) && ((ne.d) continuation).g(this);
    }

    public final void q(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    public final void r() {
        Continuation<T> continuation = this.f12799m;
        ne.d dVar = continuation instanceof ne.d ? (ne.d) continuation : null;
        Throwable j10 = dVar != null ? dVar.j(this) : null;
        if (j10 == null) {
            return;
        }
        k();
        j(j10);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        boolean z10;
        Object obj2;
        Throwable m19exceptionOrNullimpl = Result.m19exceptionOrNullimpl(obj);
        if (m19exceptionOrNullimpl != null) {
            obj = new m(m19exceptionOrNullimpl, false, 2);
        }
        int i10 = this.f12834j;
        do {
            Object obj3 = this._state;
            z10 = true;
            if (!(obj3 instanceof m0)) {
                if (obj3 instanceof g) {
                    g gVar = (g) obj3;
                    Objects.requireNonNull(gVar);
                    if (g.f12801c.compareAndSet(gVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(Intrinsics.stringPlus("Already resumed, but proposed with update ", obj).toString());
            }
            m0 m0Var = (m0) obj3;
            if (!(obj instanceof m) && a0.b.M(i10) && (m0Var instanceof d)) {
                obj2 = new l(obj, m0Var instanceof d ? (d) m0Var : null, null, null, null, 16);
            } else {
                obj2 = obj;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12798w;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z10);
        l();
        m(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CancellableContinuation");
        sb2.append('(');
        sb2.append(a0.b.f0(this.f12799m));
        sb2.append("){");
        Object obj = this._state;
        sb2.append(obj instanceof m0 ? "Active" : obj instanceof g ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(a0.b.B(this));
        return sb2.toString();
    }
}
