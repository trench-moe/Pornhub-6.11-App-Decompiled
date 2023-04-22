package ne;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13445c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_next");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13446f = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_prev");

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13447j = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    @PublishedApi
    /* loaded from: classes3.dex */
    public static abstract class a extends c<g> {
        @JvmField

        /* renamed from: b  reason: collision with root package name */
        public final g f13448b;
        @JvmField

        /* renamed from: c  reason: collision with root package name */
        public g f13449c;

        public a(g gVar) {
            this.f13448b = gVar;
        }

        @Override // ne.c
        public void b(g gVar, Object obj) {
            g gVar2 = gVar;
            boolean z10 = false;
            boolean z11 = obj == null;
            g gVar3 = z11 ? this.f13448b : this.f13449c;
            if (gVar3 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g.f13445c;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(gVar2, this, gVar3)) {
                        if (atomicReferenceFieldUpdater.get(gVar2) != this) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10 && z11) {
                    g gVar4 = this.f13448b;
                    g gVar5 = this.f13449c;
                    Intrinsics.checkNotNull(gVar5);
                    gVar4.d(gVar5);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
        r6 = ne.g.f13445c;
        r3 = ((ne.l) r3).f13459a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        if (r6.compareAndSet(r2, r1, r3) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
        if (r6.get(r2) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
        if (r4 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ne.g c(ne.k r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r10 = r9._prev
            ne.g r10 = (ne.g) r10
            r0 = 0
            r1 = r10
        L6:
            r2 = r0
        L7:
            java.lang.Object r3 = r1._next
            r4 = 0
            r5 = 1
            if (r3 != r9) goto L24
            if (r10 != r1) goto L10
            return r1
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = ne.g.f13446f
        L12:
            boolean r0 = r6.compareAndSet(r9, r10, r1)
            if (r0 == 0) goto L1a
            r4 = 1
            goto L20
        L1a:
            java.lang.Object r0 = r6.get(r9)
            if (r0 == r10) goto L12
        L20:
            if (r4 != 0) goto L23
            goto L0
        L23:
            return r1
        L24:
            boolean r6 = r9.i()
            if (r6 == 0) goto L2b
            return r0
        L2b:
            if (r3 != 0) goto L2e
            return r1
        L2e:
            boolean r6 = r3 instanceof ne.k
            if (r6 == 0) goto L38
            ne.k r3 = (ne.k) r3
            r3.a(r1)
            goto L0
        L38:
            boolean r6 = r3 instanceof ne.l
            if (r6 == 0) goto L5c
            if (r2 == 0) goto L57
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = ne.g.f13445c
            ne.l r3 = (ne.l) r3
            ne.g r3 = r3.f13459a
        L44:
            boolean r7 = r6.compareAndSet(r2, r1, r3)
            if (r7 == 0) goto L4c
            r4 = 1
            goto L52
        L4c:
            java.lang.Object r7 = r6.get(r2)
            if (r7 == r1) goto L44
        L52:
            if (r4 != 0) goto L55
            goto L0
        L55:
            r1 = r2
            goto L6
        L57:
            java.lang.Object r1 = r1._prev
            ne.g r1 = (ne.g) r1
            goto L7
        L5c:
            r2 = r3
            ne.g r2 = (ne.g) r2
            r8 = r2
            r2 = r1
            r1 = r8
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.g.c(ne.k):ne.g");
    }

    public final void d(g gVar) {
        boolean z10;
        do {
            g gVar2 = (g) gVar._prev;
            if (f() == gVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13446f;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(gVar, gVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != gVar2) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z10);
        if (i()) {
            gVar.c(null);
        }
    }

    public final Object f() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof k)) {
                return obj;
            }
            ((k) obj).a(this);
        }
    }

    public final g g() {
        Object f10 = f();
        l lVar = f10 instanceof l ? (l) f10 : null;
        g gVar = lVar != null ? lVar.f13459a : null;
        return gVar == null ? (g) f10 : gVar;
    }

    public final g h() {
        g c10 = c(null);
        if (c10 == null) {
            Object obj = this._prev;
            while (true) {
                c10 = (g) obj;
                if (!c10.i()) {
                    break;
                }
                obj = c10._prev;
            }
        }
        return c10;
    }

    public boolean i() {
        return f() instanceof l;
    }

    public boolean j() {
        g gVar;
        boolean z10;
        while (true) {
            Object f10 = f();
            if (!(f10 instanceof l)) {
                if (f10 != this) {
                    g gVar2 = (g) f10;
                    l lVar = (l) gVar2._removedRef;
                    if (lVar == null) {
                        lVar = new l(gVar2);
                        f13447j.lazySet(gVar2, lVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13445c;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, f10, lVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != f10) {
                                z10 = false;
                                continue;
                                break;
                            }
                        } else {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                    if (z10) {
                        gVar = null;
                        gVar2.c(null);
                        break;
                    }
                } else {
                    gVar = (g) f10;
                    break;
                }
            } else {
                gVar = ((l) f10).f13459a;
                break;
            }
        }
        return gVar == null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append('@');
        sb2.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb2.toString();
    }
}
