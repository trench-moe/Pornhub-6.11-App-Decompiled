package le;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import le.e0;
import ne.g;

@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes3.dex */
public class h0 implements e0, n0 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12803c = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes3.dex */
    public static final class a extends g0 {
        public final h0 n;

        /* renamed from: t  reason: collision with root package name */
        public final b f12804t;

        /* renamed from: u  reason: collision with root package name */
        public final j f12805u;

        /* renamed from: w  reason: collision with root package name */
        public final Object f12806w;

        public a(h0 h0Var, b bVar, j jVar, Object obj) {
            this.n = h0Var;
            this.f12804t = bVar;
            this.f12805u = jVar;
            this.f12806w = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            k(th);
            return Unit.INSTANCE;
        }

        @Override // le.o
        public void k(Throwable th) {
            h0 h0Var = this.n;
            b bVar = this.f12804t;
            j jVar = this.f12805u;
            Object obj = this.f12806w;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0.f12803c;
            j u2 = h0Var.u(jVar);
            if (u2 == null || !h0Var.B(bVar, u2, obj)) {
                h0Var.b(h0Var.n(bVar, obj));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements z {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: c  reason: collision with root package name */
        public final k0 f12807c;

        public b(k0 k0Var, boolean z10, Throwable th) {
            this.f12807c = k0Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        @Override // le.z
        public k0 a() {
            return this.f12807c;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th == th2) {
            } else {
                ?? r02 = this._exceptionsHolder;
                if (r02 == 0) {
                    this._exceptionsHolder = th;
                } else if (!(r02 instanceof Throwable)) {
                    if (!(r02 instanceof ArrayList)) {
                        throw new IllegalStateException(Intrinsics.stringPlus("State is ", r02).toString());
                    }
                    ((ArrayList) r02).add(th);
                } else if (th == r02) {
                } else {
                    ArrayList<Throwable> c10 = c();
                    c10.add(r02);
                    c10.add(th);
                    Unit unit = Unit.INSTANCE;
                    this._exceptionsHolder = c10;
                }
            }
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        @Override // le.z
        public boolean e() {
            return ((Throwable) this._rootCause) == null;
        }

        public final boolean f() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            return this._exceptionsHolder == i0.f12812e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            ?? r02 = this._exceptionsHolder;
            if (r02 == 0) {
                arrayList = c();
            } else if (r02 instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(r02);
                arrayList = c10;
            } else if (!(r02 instanceof ArrayList)) {
                throw new IllegalStateException(Intrinsics.stringPlus("State is ", r02).toString());
            } else {
                arrayList = (ArrayList) r02;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !Intrinsics.areEqual(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = i0.f12812e;
            return arrayList;
        }

        public final void j(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
        public String toString() {
            StringBuilder m10 = a1.a.m("Finishing[cancelling=");
            m10.append(f());
            m10.append(", completing=");
            m10.append((boolean) this._isCompleting);
            m10.append(", rootCause=");
            m10.append((Throwable) this._rootCause);
            m10.append(", exceptions=");
            m10.append(this._exceptionsHolder);
            m10.append(", list=");
            m10.append(this.f12807c);
            m10.append(']');
            return m10.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends g.a {
        public final /* synthetic */ h0 d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f12808e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ne.g gVar, h0 h0Var, Object obj) {
            super(gVar);
            this.d = h0Var;
            this.f12808e = obj;
        }

        @Override // ne.c
        public Object c(ne.g gVar) {
            if (this.d.q() == this.f12808e) {
                return null;
            }
            return a0.b.B;
        }
    }

    public final Object A(Object obj, Object obj2) {
        boolean z10;
        if (obj instanceof z) {
            boolean z11 = false;
            if (((obj instanceof v) || (obj instanceof g0)) && !(obj instanceof j) && !(obj2 instanceof m)) {
                z zVar = (z) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12803c;
                Object a0Var = obj2 instanceof z ? new a0((z) obj2) : obj2;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, zVar, a0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != zVar) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    w(obj2);
                    l(zVar, obj2);
                    z11 = true;
                }
                return z11 ? obj2 : i0.f12811c;
            }
            z zVar2 = (z) obj;
            k0 p10 = p(zVar2);
            if (p10 == null) {
                return i0.f12811c;
            }
            j jVar = null;
            b bVar = zVar2 instanceof b ? (b) zVar2 : null;
            if (bVar == null) {
                bVar = new b(p10, false, null);
            }
            synchronized (bVar) {
                if (bVar.g()) {
                    return i0.f12809a;
                }
                bVar.j(true);
                if (bVar != zVar2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12803c;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, zVar2, bVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != zVar2) {
                                break;
                            }
                        } else {
                            z11 = true;
                            break;
                        }
                    }
                    if (!z11) {
                        return i0.f12811c;
                    }
                }
                boolean f10 = bVar.f();
                m mVar = obj2 instanceof m ? (m) obj2 : null;
                if (mVar != null) {
                    bVar.b(mVar.f12823a);
                }
                Throwable d = bVar.d();
                if (!(!f10)) {
                    d = null;
                }
                Unit unit = Unit.INSTANCE;
                if (d != null) {
                    v(p10, d);
                }
                j jVar2 = zVar2 instanceof j ? (j) zVar2 : null;
                if (jVar2 == null) {
                    k0 a10 = zVar2.a();
                    if (a10 != null) {
                        jVar = u(a10);
                    }
                } else {
                    jVar = jVar2;
                }
                return (jVar == null || !B(bVar, jVar, obj2)) ? n(bVar, obj2) : i0.f12810b;
            }
        }
        return i0.f12809a;
    }

    public final boolean B(b bVar, j jVar, Object obj) {
        e0.a.a(null, false, false, new a(this, bVar, jVar, obj), 1, null);
        throw null;
    }

    public final boolean a(Object obj, k0 k0Var, g0 g0Var) {
        boolean z10;
        char c10;
        c cVar = new c(g0Var, this, obj);
        do {
            ne.g h10 = k0Var.h();
            ne.g.f13446f.lazySet(g0Var, h10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ne.g.f13445c;
            atomicReferenceFieldUpdater.lazySet(g0Var, k0Var);
            cVar.f13449c = k0Var;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(h10, k0Var, cVar)) {
                    if (atomicReferenceFieldUpdater.get(h10) != k0Var) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            c10 = !z10 ? (char) 0 : cVar.a(h10) == null ? (char) 1 : (char) 2;
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    public void b(Object obj) {
    }

    @Override // le.e0
    public final u c(boolean z10, boolean z11, Function1<? super Throwable, Unit> function1) {
        g0 g0Var;
        boolean z12;
        Throwable th;
        if (z10) {
            g0Var = function1 instanceof f0 ? (f0) function1 : null;
            if (g0Var == null) {
                g0Var = new c0(function1);
            }
        } else {
            g0Var = function1 instanceof g0 ? (g0) function1 : null;
            if (g0Var == null) {
                g0Var = null;
            }
            if (g0Var == null) {
                g0Var = new d0(function1);
            }
        }
        g0Var.f12802m = this;
        while (true) {
            Object q10 = q();
            if (q10 instanceof v) {
                v vVar = (v) q10;
                if (vVar.f12838c) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12803c;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, q10, g0Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != q10) {
                                z12 = false;
                                break;
                            }
                        } else {
                            z12 = true;
                            break;
                        }
                    }
                    if (z12) {
                        return g0Var;
                    }
                } else {
                    k0 k0Var = new k0();
                    z yVar = vVar.f12838c ? k0Var : new y(k0Var);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12803c;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar, yVar) && atomicReferenceFieldUpdater2.get(this) == vVar) {
                    }
                }
            } else if (!(q10 instanceof z)) {
                if (z11) {
                    m mVar = q10 instanceof m ? (m) q10 : null;
                    function1.invoke(mVar != null ? mVar.f12823a : null);
                }
                return l0.f12821c;
            } else {
                k0 a10 = ((z) q10).a();
                if (a10 == null) {
                    Objects.requireNonNull(q10, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    x((g0) q10);
                } else {
                    u uVar = l0.f12821c;
                    if (z10 && (q10 instanceof b)) {
                        synchronized (q10) {
                            th = ((b) q10).d();
                            if (th == null || ((function1 instanceof j) && !((b) q10).g())) {
                                if (a(q10, a10, g0Var)) {
                                    if (th == null) {
                                        return g0Var;
                                    }
                                    uVar = g0Var;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z11) {
                            function1.invoke(th);
                        }
                        return uVar;
                    } else if (a(q10, a10, g0Var)) {
                        return g0Var;
                    }
                }
            }
        }
    }

    @Override // le.e0
    public final CancellationException d() {
        Object q10 = q();
        if (!(q10 instanceof b)) {
            if (q10 instanceof z) {
                throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
            }
            return q10 instanceof m ? z(((m) q10).f12823a, null) : new JobCancellationException(Intrinsics.stringPlus(getClass().getSimpleName(), " has completed normally"), null, this);
        }
        Throwable d = ((b) q10).d();
        if (d != null) {
            return z(d, Intrinsics.stringPlus(getClass().getSimpleName(), " is cancelling"));
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Job is still new or active: ", this).toString());
    }

    @Override // le.e0
    public boolean e() {
        Object q10 = q();
        return (q10 instanceof z) && ((z) q10).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: le.h0.f(java.lang.Object):boolean");
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r10, function2);
    }

    public final boolean g(Throwable th) {
        if (s()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        i iVar = (i) this._parentHandle;
        return (iVar == null || iVar == l0.f12821c) ? z10 : iVar.b(th) || z10;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return e0.b.f12796c;
    }

    @Override // le.n0
    public CancellationException i() {
        Throwable th;
        Object q10 = q();
        if (q10 instanceof b) {
            th = ((b) q10).d();
        } else if (q10 instanceof m) {
            th = ((m) q10).f12823a;
        } else if (q10 instanceof z) {
            throw new IllegalStateException(Intrinsics.stringPlus("Cannot be cancelling child in this state: ", q10).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        return cancellationException == null ? new JobCancellationException(Intrinsics.stringPlus("Parent job is ", y(q10)), th, this) : cancellationException;
    }

    public String j() {
        return "Job was cancelled";
    }

    public final void l(z zVar, Object obj) {
        CompletionHandlerException completionHandlerException;
        i iVar = (i) this._parentHandle;
        if (iVar != null) {
            iVar.dispose();
            this._parentHandle = l0.f12821c;
        }
        m mVar = obj instanceof m ? (m) obj : null;
        Throwable th = mVar == null ? null : mVar.f12823a;
        if (zVar instanceof g0) {
            try {
                ((g0) zVar).k(th);
                return;
            } catch (Throwable th2) {
                r(new CompletionHandlerException("Exception in completion handler " + zVar + " for " + this, th2));
                return;
            }
        }
        k0 a10 = zVar.a();
        if (a10 == null) {
            return;
        }
        CompletionHandlerException completionHandlerException2 = null;
        for (ne.g gVar = (ne.g) a10.f(); !Intrinsics.areEqual(gVar, a10); gVar = gVar.g()) {
            if (gVar instanceof g0) {
                g0 g0Var = (g0) gVar;
                try {
                    g0Var.k(th);
                } catch (Throwable th3) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        ExceptionsKt.addSuppressed(completionHandlerException2, th3);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + g0Var + " for " + this, th3);
                    }
                }
            }
        }
        if (completionHandlerException2 == null) {
            return;
        }
        r(completionHandlerException2);
    }

    public final Throwable m(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(j(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((n0) obj).i();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public final Object n(b bVar, Object obj) {
        Throwable o10;
        m mVar = obj instanceof m ? (m) obj : null;
        Throwable th = mVar != null ? mVar.f12823a : null;
        synchronized (bVar) {
            bVar.f();
            List<Throwable> i10 = bVar.i(th);
            o10 = o(bVar, i10);
            if (o10 != null && i10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i10.size()));
                for (Throwable th2 : i10) {
                    if (th2 != o10 && th2 != o10 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        ExceptionsKt.addSuppressed(o10, th2);
                    }
                }
            }
        }
        if (o10 != null && o10 != th) {
            obj = new m(o10, false, 2);
        }
        if (o10 != null && g(o10)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            m.f12822b.compareAndSet((m) obj, 0, 1);
        }
        w(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12803c;
        Object a0Var = obj instanceof z ? new a0((z) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, bVar, a0Var) && atomicReferenceFieldUpdater.get(this) == bVar) {
        }
        l(bVar, obj);
        return obj;
    }

    public final Throwable o(b bVar, List<? extends Throwable> list) {
        Object obj;
        boolean z10;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (bVar.f()) {
                return new JobCancellationException(j(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final k0 p(z zVar) {
        k0 a10 = zVar.a();
        if (a10 == null) {
            if (zVar instanceof v) {
                return new k0();
            }
            if (zVar instanceof g0) {
                x((g0) zVar);
                return null;
            }
            throw new IllegalStateException(Intrinsics.stringPlus("State should have list: ", zVar).toString());
        }
        return a10;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public final Object q() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof ne.k)) {
                return obj;
            }
            ((ne.k) obj).a(this);
        }
    }

    public void r(Throwable th) {
        throw th;
    }

    public boolean s() {
        return false;
    }

    public String t() {
        return getClass().getSimpleName();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t() + '{' + y(q()) + '}');
        sb2.append('@');
        sb2.append(a0.b.B(this));
        return sb2.toString();
    }

    public final j u(ne.g gVar) {
        while (gVar.i()) {
            gVar = gVar.h();
        }
        while (true) {
            gVar = gVar.g();
            if (!gVar.i()) {
                if (gVar instanceof j) {
                    return (j) gVar;
                }
                if (gVar instanceof k0) {
                    return null;
                }
            }
        }
    }

    public final void v(k0 k0Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (ne.g gVar = (ne.g) k0Var.f(); !Intrinsics.areEqual(gVar, k0Var); gVar = gVar.g()) {
            if (gVar instanceof f0) {
                g0 g0Var = (g0) gVar;
                try {
                    g0Var.k(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        ExceptionsKt.addSuppressed(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + g0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            r(completionHandlerException2);
        }
        g(th);
    }

    public void w(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0027, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(le.g0 r5) {
        /*
            r4 = this;
            le.k0 r0 = new le.k0
            r0.<init>()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = ne.g.f13446f
            r1.lazySet(r0, r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = ne.g.f13445c
            r1.lazySet(r0, r5)
        Lf:
            java.lang.Object r1 = r5.f()
            r2 = 0
            if (r1 == r5) goto L17
            goto L2c
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = ne.g.f13445c
        L19:
            boolean r3 = r1.compareAndSet(r5, r5, r0)
            if (r3 == 0) goto L21
            r2 = 1
            goto L27
        L21:
            java.lang.Object r3 = r1.get(r5)
            if (r3 == r5) goto L19
        L27:
            if (r2 == 0) goto Lf
            r0.d(r5)
        L2c:
            ne.g r1 = r5.g()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = le.h0.f12803c
        L32:
            boolean r0 = r2.compareAndSet(r4, r5, r1)
            if (r0 == 0) goto L39
            goto L3f
        L39:
            java.lang.Object r0 = r2.get(r4)
            if (r0 == r5) goto L32
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le.h0.x(le.g0):void");
    }

    public final String y(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof z ? ((z) obj).e() ? "Active" : "New" : obj instanceof m ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.f() ? "Cancelling" : bVar.g() ? "Completing" : "Active";
    }

    public final CancellationException z(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = j();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }
}
