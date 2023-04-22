package ne;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ThreadContextKt;
import le.p0;
import le.s;
import le.w;
import t9.k0;
import vb.y;

/* loaded from: classes3.dex */
public final class d<T> extends s<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13439w = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    @JvmField

    /* renamed from: m  reason: collision with root package name */
    public final kotlinx.coroutines.b f13440m;
    @JvmField
    public final Continuation<T> n;
    @JvmField

    /* renamed from: t  reason: collision with root package name */
    public Object f13441t;
    @JvmField

    /* renamed from: u  reason: collision with root package name */
    public final Object f13442u;

    /* JADX WARN: Multi-variable type inference failed */
    public d(kotlinx.coroutines.b bVar, Continuation<? super T> continuation) {
        super(-1);
        this.f13440m = bVar;
        this.n = continuation;
        this.f13441t = e.f13443a;
        Object fold = getContext().fold(0, ThreadContextKt.f12119b);
        Intrinsics.checkNotNull(fold);
        this.f13442u = fold;
        this._reusableCancellableContinuation = null;
    }

    @Override // le.s
    public void a(Object obj, Throwable th) {
        if (obj instanceof le.n) {
            ((le.n) obj).f12825b.invoke(th);
        }
    }

    @Override // le.s
    public Continuation<T> b() {
        return this;
    }

    @Override // le.s
    public Object f() {
        Object obj = this.f13441t;
        this.f13441t = e.f13443a;
        return obj;
    }

    public final boolean g(le.f<?> fVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        return !(obj instanceof le.f) || obj == fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.n;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.n.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean h(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            y yVar = e.f13444b;
            boolean z10 = false;
            boolean z11 = true;
            if (Intrinsics.areEqual(obj, yVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13439w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, th)) {
                        if (atomicReferenceFieldUpdater.get(this) != yVar) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13439w;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z11 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z11) {
                    return false;
                }
            }
        }
    }

    public final void i() {
        do {
        } while (this._reusableCancellableContinuation == e.f13444b);
        Object obj = this._reusableCancellableContinuation;
        le.f fVar = obj instanceof le.f ? (le.f) obj : null;
        if (fVar == null) {
            return;
        }
        fVar.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Throwable j(le.e<?> r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6._reusableCancellableContinuation
            vb.y r1 = ne.e.f13444b
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = ne.d.f13439w
        Lb:
            boolean r0 = r5.compareAndSet(r6, r1, r7)
            if (r0 == 0) goto L13
            r3 = 1
            goto L19
        L13:
            java.lang.Object r0 = r5.get(r6)
            if (r0 == r1) goto Lb
        L19:
            if (r3 == 0) goto L0
            return r2
        L1c:
            boolean r7 = r0 instanceof java.lang.Throwable
            if (r7 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = ne.d.f13439w
        L22:
            boolean r1 = r7.compareAndSet(r6, r0, r2)
            if (r1 == 0) goto L2a
            r3 = 1
            goto L30
        L2a:
            java.lang.Object r1 = r7.get(r6)
            if (r1 == r0) goto L22
        L30:
            if (r3 == 0) goto L35
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L35:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L41:
            java.lang.String r7 = "Inconsistent state "
            java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.d.j(le.e):java.lang.Throwable");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        CoroutineContext context = this.n.getContext();
        Object j10 = k0.j(obj, null);
        if (this.f13440m.n(context)) {
            this.f13441t = j10;
            this.f12834j = 0;
            this.f13440m.m(context, this);
            return;
        }
        p0 p0Var = p0.f12827a;
        w a10 = p0.a();
        if (a10.E()) {
            this.f13441t = j10;
            this.f12834j = 0;
            a10.v(this);
            return;
        }
        a10.w(true);
        try {
            CoroutineContext context2 = getContext();
            Object b10 = ThreadContextKt.b(context2, this.f13442u);
            this.n.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
            ThreadContextKt.a(context2, b10);
            do {
            } while (a10.F());
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("DispatchedContinuation[");
        m10.append(this.f13440m);
        m10.append(", ");
        m10.append(a0.b.f0(this.n));
        m10.append(']');
        return m10.toString();
    }
}
