package ne;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public abstract class c<T> extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13438a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = b.f13437a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ne.k
    public final Object a(Object obj) {
        boolean z10;
        Object obj2 = this._consensus;
        Object obj3 = b.f13437a;
        if (obj2 == obj3) {
            Object c10 = c(obj);
            obj2 = this._consensus;
            if (obj2 == obj3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13438a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                obj2 = z10 ? c10 : this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t2, Object obj);

    public abstract Object c(T t2);
}
