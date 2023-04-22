package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import kb.x;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final ImmutableMap<Object, Object> f7966u = new RegularImmutableMap(null, new Object[0], 0);

    /* renamed from: m  reason: collision with root package name */
    public final transient int[] f7967m;
    public final transient Object[] n;

    /* renamed from: t  reason: collision with root package name */
    public final transient int f7968t;

    /* loaded from: classes.dex */
    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: m  reason: collision with root package name */
        public final transient ImmutableMap<K, V> f7969m;
        public final transient Object[] n;

        /* renamed from: t  reason: collision with root package name */
        public final transient int f7970t;

        /* renamed from: u  reason: collision with root package name */
        public final transient int f7971u;

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i10, int i11) {
            this.f7969m = immutableMap;
            this.n = objArr;
            this.f7970t = i10;
            this.f7971u = i11;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f7969m.get(key));
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int e(Object[] objArr, int i10) {
            return b().e(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean l() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: m */
        public x<Map.Entry<K, V>> iterator() {
            return b().listIterator();
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> s() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public Object get(int i10) {
                    jb.e.d(i10, EntrySet.this.f7971u);
                    EntrySet entrySet = EntrySet.this;
                    Object[] objArr = entrySet.n;
                    int i11 = i10 * 2;
                    int i12 = entrySet.f7970t;
                    return new AbstractMap.SimpleImmutableEntry(objArr[i11 + i12], objArr[i11 + (i12 ^ 1)]);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public boolean l() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.f7971u;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7971u;
        }
    }

    /* loaded from: classes.dex */
    public static final class KeySet<K> extends ImmutableSet<K> {

        /* renamed from: m  reason: collision with root package name */
        public final transient ImmutableMap<K, ?> f7972m;
        public final transient ImmutableList<K> n;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f7972m = immutableMap;
            this.n = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> b() {
            return this.n;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return this.f7972m.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int e(Object[] objArr, int i10) {
            return this.n.e(objArr, i10);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean l() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: m */
        public x<K> iterator() {
            return this.n.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7972m.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* renamed from: j  reason: collision with root package name */
        public final transient Object[] f7973j;

        /* renamed from: m  reason: collision with root package name */
        public final transient int f7974m;
        public final transient int n;

        public KeysOrValuesAsList(Object[] objArr, int i10, int i11) {
            this.f7973j = objArr;
            this.f7974m = i10;
            this.n = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            jb.e.d(i10, this.n);
            return this.f7973j[(i10 * 2) + this.f7974m];
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.n;
        }
    }

    public RegularImmutableMap(int[] iArr, Object[] objArr, int i10) {
        this.f7967m = iArr;
        this.n = objArr;
        this.f7968t = i10;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> b() {
        return new EntrySet(this, this.n, 0, this.f7968t);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> c() {
        return new KeySet(this, new KeysOrValuesAsList(this.n, 0, this.f7968t));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> d() {
        return new KeysOrValuesAsList(this.n, 1, this.f7968t);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean f() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int[] iArr = this.f7967m;
        Object[] objArr = this.n;
        int i10 = this.f7968t;
        V v2 = null;
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int b10 = kb.f.b(obj.hashCode());
            while (true) {
                int i11 = b10 & length;
                int i12 = iArr[i11];
                if (i12 == -1) {
                    return null;
                }
                if (objArr[i12].equals(obj)) {
                    v2 = (V) objArr[i12 ^ 1];
                    break;
                }
                b10 = i11 + 1;
            }
        }
        return v2;
    }

    @Override // java.util.Map
    public int size() {
        return this.f7968t;
    }
}
