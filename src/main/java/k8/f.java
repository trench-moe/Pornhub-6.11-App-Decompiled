package k8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f<E> implements Iterable<E> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f11952c = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final Map<E, Integer> f11953f = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public Set<E> f11954j = Collections.emptySet();

    /* renamed from: m  reason: collision with root package name */
    public List<E> f11955m = Collections.emptyList();

    public int b(E e10) {
        int intValue;
        synchronized (this.f11952c) {
            intValue = this.f11953f.containsKey(e10) ? this.f11953f.get(e10).intValue() : 0;
        }
        return intValue;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f11952c) {
            it = this.f11955m.iterator();
        }
        return it;
    }
}
