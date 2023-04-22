package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final /* synthetic */ int B = 0;
    @MonotonicNonNullDecl
    public transient Collection<V> A;
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    public transient int[] f7921c;
    @MonotonicNonNullDecl

    /* renamed from: f  reason: collision with root package name */
    public transient long[] f7922f;
    @MonotonicNonNullDecl

    /* renamed from: j  reason: collision with root package name */
    public transient Object[] f7923j;
    @MonotonicNonNullDecl

    /* renamed from: m  reason: collision with root package name */
    public transient Object[] f7924m;
    public transient float n;

    /* renamed from: t  reason: collision with root package name */
    public transient int f7925t;

    /* renamed from: u  reason: collision with root package name */
    public transient int f7926u;

    /* renamed from: w  reason: collision with root package name */
    public transient int f7927w;
    @MonotonicNonNullDecl
    public transient Set<K> y;
    @MonotonicNonNullDecl

    /* renamed from: z  reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f7928z;

    /* loaded from: classes.dex */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            boolean z10 = false;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                CompactHashMap compactHashMap = CompactHashMap.this;
                Object key = entry.getKey();
                int i10 = CompactHashMap.B;
                int d = compactHashMap.d(key);
                if (d != -1 && jb.d.a(CompactHashMap.this.f7924m[d], entry.getValue())) {
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Objects.requireNonNull(compactHashMap);
            return new com.google.common.collect.c(compactHashMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                CompactHashMap compactHashMap = CompactHashMap.this;
                Object key = entry.getKey();
                int i10 = CompactHashMap.B;
                int d = compactHashMap.d(key);
                if (d != -1 && jb.d.a(CompactHashMap.this.f7924m[d], entry.getValue())) {
                    CompactHashMap.a(CompactHashMap.this, d);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.f7927w;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b<T> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        public int f7930c;

        /* renamed from: f  reason: collision with root package name */
        public int f7931f;

        /* renamed from: j  reason: collision with root package name */
        public int f7932j;

        public b(com.google.common.collect.b bVar) {
            this.f7930c = CompactHashMap.this.f7925t;
            this.f7931f = CompactHashMap.this.isEmpty() ? -1 : 0;
            this.f7932j = -1;
        }

        public abstract T a(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7931f >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (CompactHashMap.this.f7925t == this.f7930c) {
                if (hasNext()) {
                    int i10 = this.f7931f;
                    this.f7932j = i10;
                    T a10 = a(i10);
                    CompactHashMap compactHashMap = CompactHashMap.this;
                    int i11 = this.f7931f + 1;
                    if (i11 >= compactHashMap.f7927w) {
                        i11 = -1;
                    }
                    this.f7931f = i11;
                    return a10;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (CompactHashMap.this.f7925t != this.f7930c) {
                throw new ConcurrentModificationException();
            }
            kb.d.c(this.f7932j >= 0);
            this.f7930c++;
            CompactHashMap.a(CompactHashMap.this, this.f7932j);
            CompactHashMap compactHashMap = CompactHashMap.this;
            int i10 = this.f7931f;
            Objects.requireNonNull(compactHashMap);
            this.f7931f = i10 - 1;
            this.f7932j = -1;
        }
    }

    /* loaded from: classes.dex */
    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Objects.requireNonNull(compactHashMap);
            return new com.google.common.collect.b(compactHashMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            int i10 = CompactHashMap.B;
            int d = compactHashMap.d(obj);
            if (d == -1) {
                return false;
            }
            CompactHashMap.a(CompactHashMap.this, d);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.f7927w;
        }
    }

    /* loaded from: classes.dex */
    public final class d extends kb.b<K, V> {
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        public final K f7935c;

        /* renamed from: f  reason: collision with root package name */
        public int f7936f;

        public d(int i10) {
            this.f7935c = (K) CompactHashMap.this.f7923j[i10];
            this.f7936f = i10;
        }

        public final void a() {
            int i10 = this.f7936f;
            if (i10 == -1 || i10 >= CompactHashMap.this.size() || !jb.d.a(this.f7935c, CompactHashMap.this.f7923j[this.f7936f])) {
                CompactHashMap compactHashMap = CompactHashMap.this;
                K k10 = this.f7935c;
                int i11 = CompactHashMap.B;
                this.f7936f = compactHashMap.d(k10);
            }
        }

        @Override // kb.b, java.util.Map.Entry
        public K getKey() {
            return this.f7935c;
        }

        @Override // kb.b, java.util.Map.Entry
        public V getValue() {
            a();
            int i10 = this.f7936f;
            if (i10 == -1) {
                return null;
            }
            return (V) CompactHashMap.this.f7924m[i10];
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            a();
            int i10 = this.f7936f;
            if (i10 == -1) {
                CompactHashMap.this.put(this.f7935c, v2);
                return null;
            }
            Object[] objArr = CompactHashMap.this.f7924m;
            V v10 = (V) objArr[i10];
            objArr[i10] = v2;
            return v10;
        }
    }

    /* loaded from: classes.dex */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Objects.requireNonNull(compactHashMap);
            return new com.google.common.collect.d(compactHashMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.f7927w;
        }
    }

    public CompactHashMap() {
        e(3, 1.0f);
    }

    public CompactHashMap(int i10) {
        e(i10, 1.0f);
    }

    public static Object a(CompactHashMap compactHashMap, int i10) {
        return compactHashMap.f(compactHashMap.f7923j[i10], b(compactHashMap.f7922f[i10]));
    }

    public static int b(long j10) {
        return (int) (j10 >>> 32);
    }

    public static long g(long j10, int i10) {
        return (j10 & (-4294967296L)) | (i10 & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        e(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt < 0) {
                return;
            }
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f7927w);
        for (int i10 = 0; i10 < this.f7927w; i10++) {
            objectOutputStream.writeObject(this.f7923j[i10]);
            objectOutputStream.writeObject(this.f7924m[i10]);
        }
    }

    public final int c() {
        return this.f7921c.length - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f7925t++;
        Arrays.fill(this.f7923j, 0, this.f7927w, (Object) null);
        Arrays.fill(this.f7924m, 0, this.f7927w, (Object) null);
        Arrays.fill(this.f7921c, -1);
        Arrays.fill(this.f7922f, -1L);
        this.f7927w = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i10 = 0; i10 < this.f7927w; i10++) {
            if (jb.d.a(obj, this.f7924m[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(@NullableDecl Object obj) {
        int c10 = kb.f.c(obj);
        int i10 = this.f7921c[c() & c10];
        while (i10 != -1) {
            long j10 = this.f7922f[i10];
            if (b(j10) == c10 && jb.d.a(obj, this.f7923j[i10])) {
                return i10;
            }
            i10 = (int) j10;
        }
        return -1;
    }

    public void e(int i10, float f10) {
        jb.e.c(i10 >= 0, "Initial capacity must be non-negative");
        jb.e.c(f10 > 0.0f, "Illegal load factor");
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (f10 * highestOneBit))) {
            highestOneBit <<= 1;
            if (highestOneBit <= 0) {
                highestOneBit = 1073741824;
            }
            int[] iArr = new int[highestOneBit];
            Arrays.fill(iArr, -1);
            this.f7921c = iArr;
            this.n = f10;
            this.f7923j = new Object[i10];
            this.f7924m = new Object[i10];
            long[] jArr = new long[i10];
            Arrays.fill(jArr, -1L);
            this.f7922f = jArr;
            this.f7926u = Math.max(1, (int) (highestOneBit * f10));
        }
        int[] iArr2 = new int[highestOneBit];
        Arrays.fill(iArr2, -1);
        this.f7921c = iArr2;
        this.n = f10;
        this.f7923j = new Object[i10];
        this.f7924m = new Object[i10];
        long[] jArr2 = new long[i10];
        Arrays.fill(jArr2, -1L);
        this.f7922f = jArr2;
        this.f7926u = Math.max(1, (int) (highestOneBit * f10));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f7928z;
        if (set == null) {
            set = new a();
            this.f7928z = set;
        }
        return set;
    }

    @NullableDecl
    public final V f(@NullableDecl Object obj, int i10) {
        long[] jArr;
        long j10;
        int c10 = c() & i10;
        int i11 = this.f7921c[c10];
        if (i11 == -1) {
            return null;
        }
        int i12 = -1;
        while (true) {
            if (b(this.f7922f[i11]) == i10 && jb.d.a(obj, this.f7923j[i11])) {
                V v2 = (V) this.f7924m[i11];
                if (i12 == -1) {
                    this.f7921c[c10] = (int) this.f7922f[i11];
                } else {
                    long[] jArr2 = this.f7922f;
                    jArr2[i12] = g(jArr2[i12], (int) jArr2[i11]);
                }
                int size = size() - 1;
                if (i11 < size) {
                    Object[] objArr = this.f7923j;
                    objArr[i11] = objArr[size];
                    Object[] objArr2 = this.f7924m;
                    objArr2[i11] = objArr2[size];
                    objArr[size] = null;
                    objArr2[size] = null;
                    long[] jArr3 = this.f7922f;
                    long j11 = jArr3[size];
                    jArr3[i11] = j11;
                    jArr3[size] = -1;
                    int b10 = b(j11) & c();
                    int[] iArr = this.f7921c;
                    int i13 = iArr[b10];
                    if (i13 == size) {
                        iArr[b10] = i11;
                    } else {
                        while (true) {
                            jArr = this.f7922f;
                            j10 = jArr[i13];
                            int i14 = (int) j10;
                            if (i14 == size) {
                                break;
                            }
                            i13 = i14;
                        }
                        jArr[i13] = g(j10, i11);
                    }
                } else {
                    this.f7923j[i11] = null;
                    this.f7924m[i11] = null;
                    this.f7922f[i11] = -1;
                }
                this.f7927w--;
                this.f7925t++;
                return v2;
            }
            int i15 = (int) this.f7922f[i11];
            if (i15 == -1) {
                return null;
            }
            i12 = i11;
            i11 = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int d10 = d(obj);
        if (d10 == -1) {
            return null;
        }
        return (V) this.f7924m[d10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f7927w == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.y;
        if (set == null) {
            set = new c();
            this.y = set;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V put(@NullableDecl K k10, @NullableDecl V v2) {
        long[] jArr = this.f7922f;
        Object[] objArr = this.f7923j;
        Object[] objArr2 = this.f7924m;
        int c10 = kb.f.c(k10);
        int c11 = c() & c10;
        int i10 = this.f7927w;
        int[] iArr = this.f7921c;
        int i11 = iArr[c11];
        if (i11 == -1) {
            iArr[c11] = i10;
        } else {
            while (true) {
                long j10 = jArr[i11];
                if (b(j10) == c10 && jb.d.a(k10, objArr[i11])) {
                    V v10 = (V) objArr2[i11];
                    objArr2[i11] = v2;
                    return v10;
                }
                int i12 = (int) j10;
                if (i12 == -1) {
                    jArr[i11] = g(j10, i10);
                    break;
                }
                i11 = i12;
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            int i13 = i10 + 1;
            int length = this.f7922f.length;
            if (i13 > length) {
                int max = Math.max(1, length >>> 1) + length;
                if (max < 0) {
                    max = IntCompanionObject.MAX_VALUE;
                }
                if (max != length) {
                    this.f7923j = Arrays.copyOf(this.f7923j, max);
                    this.f7924m = Arrays.copyOf(this.f7924m, max);
                    long[] jArr2 = this.f7922f;
                    int length2 = jArr2.length;
                    long[] copyOf = Arrays.copyOf(jArr2, max);
                    if (max > length2) {
                        Arrays.fill(copyOf, length2, max, -1L);
                    }
                    this.f7922f = copyOf;
                }
            }
            this.f7922f[i10] = (c10 << 32) | 4294967295L;
            this.f7923j[i10] = k10;
            this.f7924m[i10] = v2;
            this.f7927w = i13;
            if (i10 >= this.f7926u) {
                int[] iArr2 = this.f7921c;
                int length3 = iArr2.length * 2;
                if (iArr2.length >= 1073741824) {
                    this.f7926u = IntCompanionObject.MAX_VALUE;
                    this.f7925t++;
                    return null;
                }
                int i14 = ((int) (length3 * this.n)) + 1;
                int[] iArr3 = new int[length3];
                Arrays.fill(iArr3, -1);
                long[] jArr3 = this.f7922f;
                int i15 = length3 - 1;
                for (int i16 = 0; i16 < this.f7927w; i16++) {
                    int b10 = b(jArr3[i16]);
                    int i17 = b10 & i15;
                    int i18 = iArr3[i17];
                    iArr3[i17] = i16;
                    jArr3[i16] = (b10 << 32) | (i18 & 4294967295L);
                }
                this.f7926u = i14;
                this.f7921c = iArr3;
            }
            this.f7925t++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return f(obj, kb.f.c(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7927w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.A;
        if (collection == null) {
            collection = new e();
            this.A = collection;
        }
        return collection;
    }
}
