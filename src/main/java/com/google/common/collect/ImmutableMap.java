package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kb.v;
import kb.x;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    @LazyInit

    /* renamed from: c  reason: collision with root package name */
    public transient ImmutableSet<Map.Entry<K, V>> f7948c;
    @RetainedWith
    @LazyInit

    /* renamed from: f  reason: collision with root package name */
    public transient ImmutableSet<K> f7949f;
    @RetainedWith
    @LazyInit

    /* renamed from: j  reason: collision with root package name */
    public transient ImmutableCollection<V> f7950j;

    /* loaded from: classes.dex */
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] keys;
        private final Object[] values;

        public SerializedForm(ImmutableMap<?, ?> immutableMap) {
            this.keys = new Object[immutableMap.size()];
            this.values = new Object[immutableMap.size()];
            x<Map.Entry<?, ?>> it = immutableMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                this.keys[i10] = next.getKey();
                this.values[i10] = next.getValue();
                i10++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            a aVar = new a(this.keys.length);
            int i10 = 0;
            while (true) {
                Object[] objArr = this.keys;
                if (i10 >= objArr.length) {
                    return aVar.a();
                }
                aVar.c(objArr[i10], this.values[i10]);
                i10++;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f7951a;

        /* renamed from: b  reason: collision with root package name */
        public int f7952b = 0;

        public a(int i10) {
            this.f7951a = new Object[i10 * 2];
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
            r5[r10] = r8;
            r3 = r3 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.google.common.collect.ImmutableMap<K, V> a() {
            /*
                Method dump skipped, instructions count: 189
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableMap.a.a():com.google.common.collect.ImmutableMap");
        }

        public final void b(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f7951a;
            if (i11 > objArr.length) {
                this.f7951a = Arrays.copyOf(objArr, ImmutableCollection.b.a(objArr.length, i11));
            }
        }

        @CanIgnoreReturnValue
        public a<K, V> c(K k10, V v2) {
            b(this.f7952b + 1);
            kb.d.a(k10, v2);
            Object[] objArr = this.f7951a;
            int i10 = this.f7952b;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v2;
            this.f7952b = i10 + 1;
            return this;
        }
    }

    public static <K, V> a<K, V> a(int i10) {
        kb.d.b(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <K, V> ImmutableMap<K, V> g() {
        return (ImmutableMap<K, V>) RegularImmutableMap.f7966u;
    }

    public abstract ImmutableSet<Map.Entry<K, V>> b();

    public abstract ImmutableSet<K> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableCollection<V> d();

    @Override // java.util.Map
    /* renamed from: e */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f7948c;
        if (immutableSet == null) {
            ImmutableSet<Map.Entry<K, V>> b10 = b();
            this.f7948c = b10;
            return b10;
        }
        return immutableSet;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract boolean f();

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v2) {
        V v10 = get(obj);
        if (v10 != null) {
            v2 = v10;
        }
        return v2;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f7950j;
        if (immutableCollection == null) {
            immutableCollection = d();
            this.f7950j = immutableCollection;
        }
        return immutableCollection;
    }

    @Override // java.util.Map
    public int hashCode() {
        return v.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public Set keySet() {
        ImmutableSet<K> immutableSet = this.f7949f;
        if (immutableSet == null) {
            immutableSet = c();
            this.f7949f = immutableSet;
        }
        return immutableSet;
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k10, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        kb.d.b(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
