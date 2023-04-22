package qb;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class o<T> implements mc.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    public volatile Set<T> f14480b = null;

    /* renamed from: a  reason: collision with root package name */
    public volatile Set<mc.b<T>> f14479a = Collections.newSetFromMap(new ConcurrentHashMap());

    public o(Collection<mc.b<T>> collection) {
        this.f14479a.addAll(collection);
    }

    @Override // mc.b
    public Object get() {
        if (this.f14480b == null) {
            synchronized (this) {
                if (this.f14480b == null) {
                    this.f14480b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        for (mc.b<T> bVar : this.f14479a) {
                            this.f14480b.add(bVar.get());
                        }
                        this.f14479a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f14480b);
    }
}
