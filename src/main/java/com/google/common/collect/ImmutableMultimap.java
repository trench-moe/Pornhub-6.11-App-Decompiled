package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kb.s;
import kb.x;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class ImmutableMultimap<K, V> extends kb.c<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: m  reason: collision with root package name */
    public final transient ImmutableMap<K, ? extends ImmutableCollection<V>> f7953m;
    public final transient int n;

    /* loaded from: classes.dex */
    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        @Weak

        /* renamed from: f  reason: collision with root package name */
        public final transient ImmutableMultimap<K, V> f7954f;

        public Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.f7954f = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return this.f7954f.b(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int e(Object[] objArr, int i10) {
            x<? extends ImmutableCollection<V>> it = this.f7954f.f7953m.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().e(objArr, i10);
            }
            return i10;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: m */
        public x<V> iterator() {
            ImmutableMultimap<K, V> immutableMultimap = this.f7954f;
            Objects.requireNonNull(immutableMultimap);
            return new kb.g(immutableMultimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f7954f.n;
        }
    }

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Map<K, Collection<V>> f7955a = new CompactHashMap();
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final s<ImmutableMultimap> f7956a;

        /* renamed from: b  reason: collision with root package name */
        public static final s<ImmutableMultimap> f7957b;

        static {
            try {
                f7956a = new s<>(ImmutableMultimap.class.getDeclaredField("m"), null);
                try {
                    f7957b = new s<>(ImmutableMultimap.class.getDeclaredField("n"), null);
                } catch (NoSuchFieldException e10) {
                    throw new AssertionError(e10);
                }
            } catch (NoSuchFieldException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i10) {
        this.f7953m = immutableMap;
        this.n = i10;
    }

    @Override // com.google.common.collect.a, kb.q
    public Map a() {
        return this.f7953m;
    }

    @Override // com.google.common.collect.a
    public boolean b(@NullableDecl Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // com.google.common.collect.a
    public Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Override // kb.q
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a
    public Set<K> d() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.a
    public Iterator e() {
        return new kb.g(this);
    }

    public Collection f() {
        return new Values(this);
    }

    @Override // kb.q
    @CanIgnoreReturnValue
    @Deprecated
    public boolean put(K k10, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // kb.q
    public int size() {
        return this.n;
    }

    @Override // kb.q
    public Collection values() {
        Collection<V> collection = this.f7982f;
        if (collection == null) {
            collection = f();
            this.f7982f = collection;
        }
        return (ImmutableCollection) collection;
    }
}
