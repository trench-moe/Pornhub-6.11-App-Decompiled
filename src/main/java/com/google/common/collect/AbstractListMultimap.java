package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kb.k;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements k<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.a, kb.q
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f7983j;
        if (map == null) {
            Map<K, Collection<V>> c10 = c();
            this.f7983j = c10;
            return c10;
        }
        return map;
    }

    @Override // com.google.common.collect.a
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> i(K k10, Collection<V> collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new AbstractMapBasedMultimap.g(this, k10, list, null) : new AbstractMapBasedMultimap.k(k10, list, null);
    }

    @Override // kb.q
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k10, @NullableDecl V v2) {
        Collection<V> collection = this.f7893m.get(k10);
        if (collection != null) {
            if (collection.add(v2)) {
                this.n++;
                return true;
            }
            return false;
        }
        Collection<V> h10 = h();
        if (h10.add(v2)) {
            this.n++;
            this.f7893m.put(k10, h10);
            return true;
        }
        throw new AssertionError("New Collection violated the Collection spec");
    }
}
