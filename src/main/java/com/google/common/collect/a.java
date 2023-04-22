package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kb.q;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class a<K, V> implements q<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    public transient Set<K> f7981c;
    @MonotonicNonNullDecl

    /* renamed from: f  reason: collision with root package name */
    public transient Collection<V> f7982f;
    @MonotonicNonNullDecl

    /* renamed from: j  reason: collision with root package name */
    public transient Map<K, Collection<V>> f7983j;

    /* renamed from: com.google.common.collect.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0101a extends AbstractCollection<V> {
        public C0101a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return a.this.b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return a.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a.this.size();
        }
    }

    @Override // kb.q
    public abstract Map<K, Collection<V>> a();

    public boolean b(@NullableDecl Object obj) {
        for (Collection<V> collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> c();

    public abstract Set<K> d();

    public abstract Iterator<V> e();

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return a().equals(((q) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
