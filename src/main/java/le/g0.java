package le;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class g0 extends o implements u, z {

    /* renamed from: m  reason: collision with root package name */
    public h0 f12802m;

    @Override // le.z
    public k0 a() {
        return null;
    }

    @Override // le.u
    public void dispose() {
        boolean z10;
        h0 l10 = l();
        do {
            Object q10 = l10.q();
            if (!(q10 instanceof g0)) {
                if (!(q10 instanceof z) || ((z) q10).a() == null) {
                    return;
                }
                j();
                return;
            } else if (q10 == this) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0.f12803c;
                v vVar = i0.f12813f;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(l10, q10, vVar)) {
                        if (atomicReferenceFieldUpdater.get(l10) != q10) {
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
    }

    @Override // le.z
    public boolean e() {
        return true;
    }

    public final h0 l() {
        h0 h0Var = this.f12802m;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        throw null;
    }

    @Override // ne.g
    public String toString() {
        return getClass().getSimpleName() + '@' + a0.b.B(this) + "[job@" + a0.b.B(l()) + ']';
    }
}
