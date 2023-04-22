package kb;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* loaded from: classes.dex */
public abstract class p<K, V> extends AbstractMap<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f12057c;
    @MonotonicNonNullDecl

    /* renamed from: f  reason: collision with root package name */
    public transient Collection<V> f12058f;

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f12057c;
        if (set == null) {
            AbstractMapBasedMultimap.b.a aVar = new AbstractMapBasedMultimap.b.a();
            this.f12057c = aVar;
            return aVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f12058f;
        if (collection == null) {
            o oVar = new o(this);
            this.f12058f = oVar;
            return oVar;
        }
        return collection;
    }
}
