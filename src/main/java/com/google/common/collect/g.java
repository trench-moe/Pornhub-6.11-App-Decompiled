package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.MultimapBuilder;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import kb.k;

/* loaded from: classes.dex */
public class g extends MultimapBuilder.a<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7987a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MultimapBuilder.b f7988b;

    public g(MultimapBuilder.b bVar, int i10) {
        this.f7988b = bVar;
        this.f7987a = i10;
    }

    public <K, V> k<K, V> b() {
        final Map a10 = this.f7988b.a();
        final MultimapBuilder.ArrayListSupplier arrayListSupplier = new MultimapBuilder.ArrayListSupplier(this.f7987a);
        return new AbstractListMultimap<K, V>(a10, arrayListSupplier) { // from class: com.google.common.collect.Multimaps$CustomListMultimap
            private static final long serialVersionUID = 0;

            /* renamed from: t  reason: collision with root package name */
            public transient jb.k<? extends List<V>> f7962t;

            {
                Objects.requireNonNull(arrayListSupplier);
                this.f7962t = arrayListSupplier;
            }

            private void readObject(ObjectInputStream objectInputStream) {
                objectInputStream.defaultReadObject();
                this.f7962t = (jb.k) objectInputStream.readObject();
                Map<K, Collection<V>> map = (Map) objectInputStream.readObject();
                this.f7893m = map;
                this.n = 0;
                for (Collection<V> collection : map.values()) {
                    jb.e.b(!collection.isEmpty());
                    this.n = collection.size() + this.n;
                }
            }

            private void writeObject(ObjectOutputStream objectOutputStream) {
                objectOutputStream.defaultWriteObject();
                objectOutputStream.writeObject(this.f7962t);
                objectOutputStream.writeObject(this.f7893m);
            }

            @Override // com.google.common.collect.a
            public Map<K, Collection<V>> c() {
                Map<K, Collection<V>> map = this.f7893m;
                return map instanceof NavigableMap ? new AbstractMapBasedMultimap.e(this, (NavigableMap) this.f7893m) : map instanceof SortedMap ? new AbstractMapBasedMultimap.h(this, (SortedMap) this.f7893m) : new AbstractMapBasedMultimap.b(this, this.f7893m);
            }

            @Override // com.google.common.collect.a
            public Set<K> d() {
                Map<K, Collection<V>> map = this.f7893m;
                return map instanceof NavigableMap ? new AbstractMapBasedMultimap.f(this, (NavigableMap) this.f7893m) : map instanceof SortedMap ? new AbstractMapBasedMultimap.i(this, (SortedMap) this.f7893m) : new AbstractMapBasedMultimap.d(this, this.f7893m);
            }

            @Override // com.google.common.collect.AbstractMapBasedMultimap
            public Collection h() {
                return this.f7962t.get();
            }
        };
    }
}
