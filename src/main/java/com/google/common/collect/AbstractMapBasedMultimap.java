package com.google.common.collect;

import com.google.common.collect.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import kb.m;
import kb.n;
import kb.p;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class AbstractMapBasedMultimap<K, V> extends com.google.common.collect.a<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: m  reason: collision with root package name */
    public transient Map<K, Collection<V>> f7893m;
    public transient int n;

    /* loaded from: classes.dex */
    public class a extends AbstractMapBasedMultimap<K, V>.c<V> {
        public a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.c
        public V a(K k10, V v2) {
            return v2;
        }
    }

    /* loaded from: classes.dex */
    public class b extends p<K, Collection<V>> {

        /* renamed from: j  reason: collision with root package name */
        public final transient Map<K, Collection<V>> f7894j;

        /* loaded from: classes.dex */
        public class a extends m<K, Collection<V>> {
            public a() {
            }

            @Override // kb.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = b.this.f7894j.entrySet();
                Objects.requireNonNull(entrySet);
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0100b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                Collection<V> collection;
                if (contains(obj)) {
                    AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                    Object key = ((Map.Entry) obj).getKey();
                    Map<K, Collection<V>> map = abstractMapBasedMultimap.f7893m;
                    Objects.requireNonNull(map);
                    try {
                        collection = map.remove(key);
                    } catch (ClassCastException | NullPointerException unused) {
                        collection = null;
                    }
                    Collection<V> collection2 = collection;
                    if (collection2 != null) {
                        int size = collection2.size();
                        collection2.clear();
                        abstractMapBasedMultimap.n -= size;
                    }
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0100b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: c  reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f7897c;
            @NullableDecl

            /* renamed from: f  reason: collision with root package name */
            public Collection<V> f7898f;

            public C0100b() {
                this.f7897c = b.this.f7894j.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7897c.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry<K, Collection<V>> next = this.f7897c.next();
                this.f7898f = next.getValue();
                return b.this.a(next);
            }

            @Override // java.util.Iterator
            public void remove() {
                kb.d.c(this.f7898f != null);
                this.f7897c.remove();
                AbstractMapBasedMultimap.this.n -= this.f7898f.size();
                this.f7898f.clear();
                this.f7898f = null;
            }
        }

        public b(Map<K, Collection<V>> map) {
            this.f7894j = map;
        }

        public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return new ImmutableEntry(key, AbstractMapBasedMultimap.this.i(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Map<K, Collection<V>> map = this.f7894j;
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            if (map == abstractMapBasedMultimap.f7893m) {
                abstractMapBasedMultimap.clear();
                return;
            }
            Iterator<Map.Entry<K, Collection<V>>> it = this.f7894j.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                Collection<V> value = next.getValue();
                a(next);
                kb.d.c(value != null);
                it.remove();
                AbstractMapBasedMultimap.this.n -= value.size();
                value.clear();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f7894j;
            Objects.requireNonNull(map);
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            if (this != obj && !this.f7894j.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f7894j;
            Objects.requireNonNull(map);
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.i(obj, collection2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f7894j.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Set<K> set = abstractMapBasedMultimap.f7981c;
            if (set == null) {
                Set<K> d = abstractMapBasedMultimap.d();
                abstractMapBasedMultimap.f7981c = d;
                return d;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            Collection<V> remove = this.f7894j.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> h10 = AbstractMapBasedMultimap.this.h();
            h10.addAll(remove);
            AbstractMapBasedMultimap.this.n -= remove.size();
            remove.clear();
            return h10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f7894j.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f7894j.toString();
        }
    }

    /* loaded from: classes.dex */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f7900c;
        @NullableDecl

        /* renamed from: f  reason: collision with root package name */
        public K f7901f = null;
        @MonotonicNonNullDecl

        /* renamed from: j  reason: collision with root package name */
        public Collection<V> f7902j = null;

        /* renamed from: m  reason: collision with root package name */
        public Iterator<V> f7903m = Iterators$EmptyModifiableIterator.INSTANCE;

        public c() {
            this.f7900c = AbstractMapBasedMultimap.this.f7893m.entrySet().iterator();
        }

        public abstract T a(K k10, V v2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f7900c.hasNext() && !this.f7903m.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f7903m.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f7900c.next();
                this.f7901f = next.getKey();
                Collection<V> value = next.getValue();
                this.f7902j = value;
                this.f7903m = value.iterator();
            }
            return a(this.f7901f, this.f7903m.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7903m.remove();
            if (this.f7902j.isEmpty()) {
                this.f7900c.remove();
            }
            AbstractMapBasedMultimap.g(AbstractMapBasedMultimap.this);
        }
    }

    /* loaded from: classes.dex */
    public class d extends n<K, Collection<V>> {

        /* loaded from: classes.dex */
        public class a implements Iterator<K> {
            @NullableDecl

            /* renamed from: c  reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f7905c;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Iterator f7906f;

            public a(Iterator it) {
                this.f7906f = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7906f.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f7906f.next();
                this.f7905c = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                kb.d.c(this.f7905c != null);
                Collection<V> value = this.f7905c.getValue();
                this.f7906f.remove();
                AbstractMapBasedMultimap.this.n -= value.size();
                value.clear();
                this.f7905c = null;
            }
        }

        public d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f12055c.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            if (this != obj && !this.f12055c.keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f12055c.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this.f12055c.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection collection = (Collection) this.f12055c.remove(obj);
            if (collection != null) {
                i10 = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.this.n -= i10;
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* loaded from: classes.dex */
    public class e extends AbstractMapBasedMultimap<K, V>.h implements NavigableMap<K, Collection<V>> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h
        public SortedSet b() {
            return new f(d());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = d().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return d().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return ((e) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(d().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, com.google.common.collect.AbstractMapBasedMultimap.b, java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public NavigableSet<K> keySet() {
            SortedSet<K> sortedSet = this.n;
            if (sortedSet == null) {
                sortedSet = b();
                this.n = sortedSet;
            }
            return (NavigableSet) sortedSet;
        }

        public Map.Entry<K, Collection<V>> f(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                Collection<V> h10 = AbstractMapBasedMultimap.this.h();
                h10.addAll(next.getValue());
                it.remove();
                K key = next.getKey();
                Objects.requireNonNull((AbstractListMultimap) AbstractMapBasedMultimap.this);
                return new ImmutableEntry(key, Collections.unmodifiableList((List) h10));
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = d().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return d().floorKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h
        /* renamed from: g */
        public NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.f7894j);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(d().headMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, java.util.SortedMap, java.util.NavigableMap
        public SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = d().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return d().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = d().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return d().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return f(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return f(((p) descendingMap()).entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(d().subMap(k10, z10, k11, z11));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, java.util.SortedMap, java.util.NavigableMap
        public SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(d().tailMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, java.util.SortedMap, java.util.NavigableMap
        public SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* loaded from: classes.dex */
    public class f extends AbstractMapBasedMultimap<K, V>.i implements NavigableSet<K> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return b().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return ((d) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new f(b().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* renamed from: e */
        public NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) ((SortedMap) this.f12055c);
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return b().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(b().headMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedSet, java.util.NavigableSet
        public SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return b().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            d.a aVar = (d.a) iterator();
            if (aVar.hasNext()) {
                K k10 = (K) aVar.next();
                aVar.remove();
                return k10;
            }
            return null;
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            Iterator<K> descendingIterator = descendingIterator();
            if (descendingIterator.hasNext()) {
                K next = descendingIterator.next();
                descendingIterator.remove();
                return next;
            }
            return null;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(b().subMap(k10, z10, k11, z11));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedSet, java.util.NavigableSet
        public SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(b().tailMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedSet, java.util.NavigableSet
        public SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AbstractMapBasedMultimap<K, V>.k implements RandomAccess {
        public g(@NullableDecl AbstractMapBasedMultimap abstractMapBasedMultimap, K k10, @NullableDecl List<V> list, AbstractMapBasedMultimap<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AbstractMapBasedMultimap<K, V>.b implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl
        public SortedSet<K> n;

        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> b() {
            return new i(d());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.b, java.util.AbstractMap, java.util.Map
        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.n;
            if (sortedSet == null) {
                sortedSet = b();
                this.n = sortedSet;
            }
            return sortedSet;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.f7894j;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(d().headMap(k10));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(d().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(d().tailMap(k10));
        }
    }

    /* loaded from: classes.dex */
    public class i extends AbstractMapBasedMultimap<K, V>.d implements SortedSet<K> {
        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> b() {
            return (SortedMap) this.f12055c;
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(b().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(b().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(b().tailMap(k10));
        }
    }

    /* loaded from: classes.dex */
    public class j extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        public final K f7912c;

        /* renamed from: f  reason: collision with root package name */
        public Collection<V> f7913f;
        @NullableDecl

        /* renamed from: j  reason: collision with root package name */
        public final AbstractMapBasedMultimap<K, V>.j f7914j;
        @NullableDecl

        /* renamed from: m  reason: collision with root package name */
        public final Collection<V> f7915m;

        /* loaded from: classes.dex */
        public class a implements Iterator<V> {

            /* renamed from: c  reason: collision with root package name */
            public final Iterator<V> f7916c;

            /* renamed from: f  reason: collision with root package name */
            public final Collection<V> f7917f;

            public a() {
                Collection<V> collection = j.this.f7913f;
                this.f7917f = collection;
                this.f7916c = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public a(Iterator<V> it) {
                this.f7917f = j.this.f7913f;
                this.f7916c = it;
            }

            public void a() {
                j.this.e();
                if (j.this.f7913f != this.f7917f) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f7916c.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                a();
                return this.f7916c.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f7916c.remove();
                AbstractMapBasedMultimap.g(AbstractMapBasedMultimap.this);
                j.this.g();
            }
        }

        public j(@NullableDecl K k10, Collection<V> collection, @NullableDecl AbstractMapBasedMultimap<K, V>.j jVar) {
            this.f7912c = k10;
            this.f7913f = collection;
            this.f7914j = jVar;
            this.f7915m = jVar == null ? null : jVar.f7913f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v2) {
            e();
            boolean isEmpty = this.f7913f.isEmpty();
            boolean add = this.f7913f.add(v2);
            if (add) {
                AbstractMapBasedMultimap.f(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    b();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f7913f.addAll(collection);
            if (addAll) {
                int size2 = this.f7913f.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.n = (size2 - size) + abstractMapBasedMultimap.n;
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        public void b() {
            AbstractMapBasedMultimap<K, V>.j jVar = this.f7914j;
            if (jVar != null) {
                jVar.b();
            } else {
                AbstractMapBasedMultimap.this.f7893m.put(this.f7912c, this.f7913f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f7913f.clear();
            AbstractMapBasedMultimap.this.n -= size;
            g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.f7913f.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            e();
            return this.f7913f.containsAll(collection);
        }

        public void e() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.j jVar = this.f7914j;
            if (jVar != null) {
                jVar.e();
                if (this.f7914j.f7913f != this.f7915m) {
                    throw new ConcurrentModificationException();
                }
                return;
            }
            if (this.f7913f.isEmpty() && (collection = AbstractMapBasedMultimap.this.f7893m.get(this.f7912c)) != null) {
                this.f7913f = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f7913f.equals(obj);
        }

        public void g() {
            AbstractMapBasedMultimap<K, V>.j jVar = this.f7914j;
            if (jVar != null) {
                jVar.g();
                return;
            }
            if (this.f7913f.isEmpty()) {
                AbstractMapBasedMultimap.this.f7893m.remove(this.f7912c);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.f7913f.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean remove = this.f7913f.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.g(AbstractMapBasedMultimap.this);
                g();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f7913f.removeAll(collection);
            if (removeAll) {
                int size2 = this.f7913f.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.n = (size2 - size) + abstractMapBasedMultimap.n;
                g();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            int size = size();
            boolean retainAll = this.f7913f.retainAll(collection);
            if (retainAll) {
                int size2 = this.f7913f.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.n = (size2 - size) + abstractMapBasedMultimap.n;
                g();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.f7913f.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.f7913f.toString();
        }
    }

    /* loaded from: classes.dex */
    public class k extends AbstractMapBasedMultimap<K, V>.j implements List<V> {

        /* loaded from: classes.dex */
        public class a extends AbstractMapBasedMultimap<K, V>.j.a implements ListIterator<V> {
            public a() {
                super();
            }

            public a(int i10) {
                super(((List) k.this.f7913f).listIterator(i10));
            }

            @Override // java.util.ListIterator
            public void add(V v2) {
                boolean isEmpty = k.this.isEmpty();
                c().add(v2);
                AbstractMapBasedMultimap.f(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    k.this.b();
                }
            }

            public final ListIterator<V> c() {
                a();
                return (ListIterator) this.f7916c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v2) {
                c().set(v2);
            }
        }

        public k(@NullableDecl K k10, List<V> list, @NullableDecl AbstractMapBasedMultimap<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        @Override // java.util.List
        public void add(int i10, V v2) {
            e();
            boolean isEmpty = this.f7913f.isEmpty();
            ((List) this.f7913f).add(i10, v2);
            AbstractMapBasedMultimap.f(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f7913f).addAll(i10, collection);
            if (addAll) {
                int size2 = this.f7913f.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.n = (size2 - size) + abstractMapBasedMultimap.n;
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            e();
            return (V) ((List) this.f7913f).get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            e();
            return ((List) this.f7913f).indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            e();
            return ((List) this.f7913f).lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            e();
            return new a(i10);
        }

        @Override // java.util.List
        public V remove(int i10) {
            e();
            V v2 = (V) ((List) this.f7913f).remove(i10);
            AbstractMapBasedMultimap.g(AbstractMapBasedMultimap.this);
            g();
            return v2;
        }

        @Override // java.util.List
        public V set(int i10, V v2) {
            e();
            return (V) ((List) this.f7913f).set(i10, v2);
        }

        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            e();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            K k10 = this.f7912c;
            List subList = ((List) this.f7913f).subList(i10, i11);
            AbstractMapBasedMultimap<K, V>.j jVar = this.f7914j;
            if (jVar == null) {
                jVar = this;
            }
            Objects.requireNonNull(abstractMapBasedMultimap);
            return subList instanceof RandomAccess ? new g(abstractMapBasedMultimap, k10, subList, jVar) : new k(k10, subList, jVar);
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        jb.e.b(map.isEmpty());
        this.f7893m = map;
    }

    public static /* synthetic */ int f(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.n;
        abstractMapBasedMultimap.n = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int g(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.n;
        abstractMapBasedMultimap.n = i10 - 1;
        return i10;
    }

    @Override // kb.q
    public void clear() {
        for (Collection<V> collection : this.f7893m.values()) {
            collection.clear();
        }
        this.f7893m.clear();
        this.n = 0;
    }

    @Override // com.google.common.collect.a
    public Iterator<V> e() {
        return new a(this);
    }

    public abstract Collection<V> h();

    public abstract Collection<V> i(@NullableDecl K k10, Collection<V> collection);

    @Override // kb.q
    public int size() {
        return this.n;
    }

    @Override // kb.q
    public Collection<V> values() {
        Collection<V> collection = this.f7982f;
        if (collection == null) {
            a.C0101a c0101a = new a.C0101a();
            this.f7982f = c0101a;
            return c0101a;
        }
        return collection;
    }
}
