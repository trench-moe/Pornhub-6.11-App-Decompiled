package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Comparator<Comparable> f8507c = new a();
    private LinkedHashTreeMap<K, V>.c entrySet;
    private LinkedHashTreeMap<K, V>.d keySet;
    public int size = 0;
    public int modCount = 0;
    public final Comparator<? super K> comparator = f8507c;
    public final f<K, V> header = new f<>();
    public f<K, V>[] table = new f[16];
    public int threshold = 12;

    /* loaded from: classes.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public f<K, V> f8508a;

        /* renamed from: b  reason: collision with root package name */
        public int f8509b;

        /* renamed from: c  reason: collision with root package name */
        public int f8510c;
        public int d;

        public void a(f<K, V> fVar) {
            fVar.f8519j = null;
            fVar.f8517c = null;
            fVar.f8518f = null;
            fVar.y = 1;
            int i10 = this.f8509b;
            if (i10 > 0) {
                int i11 = this.d;
                if ((i11 & 1) == 0) {
                    this.d = i11 + 1;
                    this.f8509b = i10 - 1;
                    this.f8510c++;
                }
            }
            fVar.f8517c = this.f8508a;
            this.f8508a = fVar;
            int i12 = this.d + 1;
            this.d = i12;
            int i13 = this.f8509b;
            if (i13 > 0 && (i12 & 1) == 0) {
                this.d = i12 + 1;
                this.f8509b = i13 - 1;
                this.f8510c++;
            }
            int i14 = 4;
            while (true) {
                int i15 = i14 - 1;
                if ((this.d & i15) != i15) {
                    return;
                }
                int i16 = this.f8510c;
                if (i16 == 0) {
                    f<K, V> fVar2 = this.f8508a;
                    f<K, V> fVar3 = fVar2.f8517c;
                    f<K, V> fVar4 = fVar3.f8517c;
                    fVar3.f8517c = fVar4.f8517c;
                    this.f8508a = fVar3;
                    fVar3.f8518f = fVar4;
                    fVar3.f8519j = fVar2;
                    fVar3.y = fVar2.y + 1;
                    fVar4.f8517c = fVar3;
                    fVar2.f8517c = fVar3;
                } else if (i16 == 1) {
                    f<K, V> fVar5 = this.f8508a;
                    f<K, V> fVar6 = fVar5.f8517c;
                    this.f8508a = fVar6;
                    fVar6.f8519j = fVar5;
                    fVar6.y = fVar5.y + 1;
                    fVar5.f8517c = fVar6;
                    this.f8510c = 0;
                } else if (i16 == 2) {
                    this.f8510c = 0;
                }
                i14 *= 2;
            }
        }

        public void b(int i10) {
            this.f8509b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.d = 0;
            this.f8510c = 0;
            this.f8508a = null;
        }
    }

    /* loaded from: classes.dex */
    public final class c extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        public class a extends LinkedHashTreeMap<K, V>.e<Map.Entry<K, V>> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a();
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            f<K, V> b10;
            if ((obj instanceof Map.Entry) && (b10 = LinkedHashTreeMap.this.b((Map.Entry) obj)) != null) {
                LinkedHashTreeMap.this.e(b10, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* loaded from: classes.dex */
    public final class d extends AbstractSet<K> {

        /* loaded from: classes.dex */
        public class a extends LinkedHashTreeMap<K, V>.e<K> {
            public a(d dVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f8521t;
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            f<K, V> c10 = linkedHashTreeMap.c(obj);
            if (c10 != null) {
                linkedHashTreeMap.e(c10, true);
            }
            return c10 != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* loaded from: classes.dex */
    public abstract class e<T> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        public f<K, V> f8513c;

        /* renamed from: f  reason: collision with root package name */
        public f<K, V> f8514f = null;

        /* renamed from: j  reason: collision with root package name */
        public int f8515j;

        public e() {
            this.f8513c = LinkedHashTreeMap.this.header.f8520m;
            this.f8515j = LinkedHashTreeMap.this.modCount;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public final com.squareup.moshi.LinkedHashTreeMap.f<K, V> a() {
            /*
                r6 = this;
                com.squareup.moshi.LinkedHashTreeMap$f<K, V> r0 = r6.f8513c
                java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                com.squareup.moshi.LinkedHashTreeMap r1 = com.squareup.moshi.LinkedHashTreeMap.this
                com.squareup.moshi.LinkedHashTreeMap$f<K, V> r2 = r1.header
                r4 = 5
                if (r0 == r2) goto L20
                int r1 = r1.modCount
                int r2 = r6.f8515j
                if (r1 != r2) goto L18
                com.squareup.moshi.LinkedHashTreeMap$f<K, V> r1 = r0.f8520m
                r6.f8513c = r1
                r6.f8514f = r0
                return r0
            L18:
                r5 = 4
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
                r4 = 5
            L20:
                r5 = 4
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r4 = 5
                r0.<init>()
                throw r0
                r4 = 3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.e.a():com.squareup.moshi.LinkedHashTreeMap$f");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f8513c != LinkedHashTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            f<K, V> fVar = this.f8514f;
            if (fVar == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap.this.e(fVar, true);
            this.f8514f = null;
            this.f8515j = LinkedHashTreeMap.this.modCount;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<K, V> implements Map.Entry<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public f<K, V> f8517c;

        /* renamed from: f  reason: collision with root package name */
        public f<K, V> f8518f;

        /* renamed from: j  reason: collision with root package name */
        public f<K, V> f8519j;

        /* renamed from: m  reason: collision with root package name */
        public f<K, V> f8520m;
        public f<K, V> n;

        /* renamed from: t  reason: collision with root package name */
        public final K f8521t;

        /* renamed from: u  reason: collision with root package name */
        public final int f8522u;

        /* renamed from: w  reason: collision with root package name */
        public V f8523w;
        public int y;

        public f() {
            this.f8521t = null;
            this.f8522u = -1;
            this.n = this;
            this.f8520m = this;
        }

        public f(f<K, V> fVar, K k10, int i10, f<K, V> fVar2, f<K, V> fVar3) {
            this.f8517c = fVar;
            this.f8521t = k10;
            this.f8522u = i10;
            this.y = 1;
            this.f8520m = fVar2;
            this.n = fVar3;
            fVar3.f8520m = this;
            fVar2.n = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f8521t;
                if (k10 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k10.equals(entry.getKey())) {
                    return false;
                }
                V v2 = this.f8523w;
                if (v2 == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v2.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f8521t;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f8523w;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f8521t;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v2 = this.f8523w;
            if (v2 != null) {
                i10 = v2.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            V v10 = this.f8523w;
            this.f8523w = v2;
            return v10;
        }

        public String toString() {
            return this.f8521t + "=" + this.f8523w;
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public f<K, V> a(K k10, boolean z10) {
        f<K, V> fVar;
        int i10;
        f<K, V> fVar2;
        f<K, V> fVar3;
        f<K, V> fVar4;
        f<K, V> fVar5;
        f<K, V> fVar6;
        Comparator<? super K> comparator = this.comparator;
        f<K, V>[] fVarArr = this.table;
        int hashCode = k10.hashCode();
        int i11 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i12 = ((i11 >>> 7) ^ i11) ^ (i11 >>> 4);
        int length = i12 & (fVarArr.length - 1);
        f<K, V> fVar7 = fVarArr[length];
        if (fVar7 != null) {
            Comparable comparable = comparator == f8507c ? (Comparable) k10 : null;
            while (true) {
                int compareTo = comparable != null ? comparable.compareTo(fVar7.f8521t) : comparator.compare(k10, (K) fVar7.f8521t);
                if (compareTo == 0) {
                    return fVar7;
                }
                f<K, V> fVar8 = compareTo < 0 ? fVar7.f8518f : fVar7.f8519j;
                if (fVar8 == null) {
                    fVar = fVar7;
                    i10 = compareTo;
                    break;
                }
                fVar7 = fVar8;
            }
        } else {
            fVar = fVar7;
            i10 = 0;
        }
        if (z10) {
            f<K, V> fVar9 = this.header;
            if (fVar != null) {
                f<K, V> fVar10 = new f<>(fVar, k10, i12, fVar9, fVar9.n);
                if (i10 < 0) {
                    fVar.f8518f = fVar10;
                } else {
                    fVar.f8519j = fVar10;
                }
                d(fVar, true);
                fVar2 = fVar10;
            } else if (comparator == f8507c && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            } else {
                fVar2 = new f<>(fVar, k10, i12, fVar9, fVar9.n);
                fVarArr[length] = fVar2;
            }
            int i13 = this.size;
            this.size = i13 + 1;
            if (i13 > this.threshold) {
                f<K, V>[] fVarArr2 = this.table;
                int length2 = fVarArr2.length;
                int i14 = length2 * 2;
                f<K, V>[] fVarArr3 = new f[i14];
                b bVar = new b();
                b bVar2 = new b();
                for (int i15 = 0; i15 < length2; i15++) {
                    f<K, V> fVar11 = fVarArr2[i15];
                    if (fVar11 != null) {
                        f<K, V> fVar12 = null;
                        for (f<K, V> fVar13 = fVar11; fVar13 != null; fVar13 = fVar13.f8518f) {
                            fVar13.f8517c = fVar12;
                            fVar12 = fVar13;
                        }
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            if (fVar12 == null) {
                                fVar3 = fVar12;
                                fVar12 = null;
                            } else {
                                fVar3 = fVar12.f8517c;
                                fVar12.f8517c = null;
                                for (f<K, V> fVar14 = fVar12.f8519j; fVar14 != null; fVar14 = fVar14.f8518f) {
                                    fVar14.f8517c = fVar3;
                                    fVar3 = fVar14;
                                }
                            }
                            if (fVar12 == null) {
                                break;
                            }
                            if ((fVar12.f8522u & length2) == 0) {
                                i16++;
                            } else {
                                i17++;
                            }
                            fVar12 = fVar3;
                        }
                        bVar.b(i16);
                        bVar2.b(i17);
                        f<K, V> fVar15 = null;
                        while (fVar11 != null) {
                            fVar11.f8517c = fVar15;
                            f<K, V> fVar16 = fVar11;
                            fVar11 = fVar11.f8518f;
                            fVar15 = fVar16;
                        }
                        while (true) {
                            if (fVar15 != null) {
                                f<K, V> fVar17 = fVar15.f8517c;
                                fVar15.f8517c = null;
                                f<K, V> fVar18 = fVar15.f8519j;
                                while (true) {
                                    f<K, V> fVar19 = fVar18;
                                    fVar4 = fVar17;
                                    fVar17 = fVar19;
                                    if (fVar17 == null) {
                                        break;
                                    }
                                    fVar17.f8517c = fVar4;
                                    fVar18 = fVar17.f8518f;
                                }
                            } else {
                                fVar4 = fVar15;
                                fVar15 = null;
                            }
                            if (fVar15 == null) {
                                break;
                            }
                            if ((fVar15.f8522u & length2) == 0) {
                                bVar.a(fVar15);
                            } else {
                                bVar2.a(fVar15);
                            }
                            fVar15 = fVar4;
                        }
                        if (i16 > 0) {
                            fVar5 = bVar.f8508a;
                            if (fVar5.f8517c != null) {
                                throw new IllegalStateException();
                            }
                        } else {
                            fVar5 = null;
                        }
                        fVarArr3[i15] = fVar5;
                        int i18 = i15 + length2;
                        if (i17 > 0) {
                            fVar6 = bVar2.f8508a;
                            if (fVar6.f8517c != null) {
                                throw new IllegalStateException();
                            }
                        } else {
                            fVar6 = null;
                        }
                        fVarArr3[i18] = fVar6;
                    }
                }
                this.table = fVarArr3;
                this.threshold = (i14 / 4) + (i14 / 2);
            }
            this.modCount++;
            return fVar2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ((r3 == r8 || (r3 != null && r3.equals(r8))) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.squareup.moshi.LinkedHashTreeMap.f<K, V> b(java.util.Map.Entry<?, ?> r8) {
        /*
            r7 = this;
            r4 = r7
            java.lang.Object r6 = r8.getKey()
            r0 = r6
            com.squareup.moshi.LinkedHashTreeMap$f r0 = r4.c(r0)
            r6 = 1
            r1 = r6
            r6 = 0
            r2 = r6
            if (r0 == 0) goto L2b
            V r3 = r0.f8523w
            r6 = 7
            java.lang.Object r8 = r8.getValue()
            if (r3 == r8) goto L26
            if (r3 == 0) goto L22
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L22
            goto L27
        L22:
            r6 = 3
            r6 = 0
            r8 = r6
            goto L28
        L26:
            r6 = 2
        L27:
            r8 = 1
        L28:
            if (r8 == 0) goto L2b
            goto L2d
        L2b:
            r1 = 0
            r6 = 5
        L2d:
            if (r1 == 0) goto L31
            r6 = 7
            goto L33
        L31:
            r6 = 3
            r0 = 0
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.b(java.util.Map$Entry):com.squareup.moshi.LinkedHashTreeMap$f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f<K, V> c(Object obj) {
        f<K, V> fVar = null;
        if (obj != 0) {
            try {
                fVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        f<K, V> fVar = this.header;
        f<K, V> fVar2 = fVar.f8520m;
        while (fVar2 != fVar) {
            f<K, V> fVar3 = fVar2.f8520m;
            fVar2.n = null;
            fVar2.f8520m = null;
            fVar2 = fVar3;
        }
        fVar.n = fVar;
        fVar.f8520m = fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(f<K, V> fVar, boolean z10) {
        while (fVar != null) {
            f<K, V> fVar2 = fVar.f8518f;
            f<K, V> fVar3 = fVar.f8519j;
            int i10 = 0;
            int i11 = fVar2 != null ? fVar2.y : 0;
            int i12 = fVar3 != null ? fVar3.y : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                f<K, V> fVar4 = fVar3.f8518f;
                f<K, V> fVar5 = fVar3.f8519j;
                int i14 = fVar5 != null ? fVar5.y : 0;
                if (fVar4 != null) {
                    i10 = fVar4.y;
                }
                int i15 = i10 - i14;
                if (i15 != -1) {
                    if (i15 == 0) {
                        if (z10) {
                        }
                    }
                    h(fVar3);
                }
                g(fVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 2) {
                f<K, V> fVar6 = fVar2.f8518f;
                f<K, V> fVar7 = fVar2.f8519j;
                int i16 = fVar7 != null ? fVar7.y : 0;
                if (fVar6 != null) {
                    i10 = fVar6.y;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    g(fVar2);
                }
                h(fVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 0) {
                fVar.y = i11 + 1;
                if (z10) {
                    return;
                }
            } else {
                fVar.y = Math.max(i11, i12) + 1;
                if (!z10) {
                    return;
                }
            }
            fVar = fVar.f8517c;
        }
    }

    public void e(f<K, V> fVar, boolean z10) {
        f<K, V> fVar2;
        f<K, V> fVar3;
        int i10;
        if (z10) {
            f<K, V> fVar4 = fVar.n;
            fVar4.f8520m = fVar.f8520m;
            fVar.f8520m.n = fVar4;
            fVar.n = null;
            fVar.f8520m = null;
        }
        f<K, V> fVar5 = fVar.f8518f;
        f<K, V> fVar6 = fVar.f8519j;
        f<K, V> fVar7 = fVar.f8517c;
        int i11 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                f(fVar, fVar5);
                fVar.f8518f = null;
            } else if (fVar6 != null) {
                f(fVar, fVar6);
                fVar.f8519j = null;
            } else {
                f(fVar, null);
            }
            d(fVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (fVar5.y > fVar6.y) {
            f<K, V> fVar8 = fVar5.f8519j;
            while (true) {
                f<K, V> fVar9 = fVar8;
                fVar3 = fVar5;
                fVar5 = fVar9;
                if (fVar5 == null) {
                    break;
                }
                fVar8 = fVar5.f8519j;
            }
        } else {
            f<K, V> fVar10 = fVar6.f8518f;
            while (true) {
                fVar2 = fVar6;
                fVar6 = fVar10;
                if (fVar6 == null) {
                    break;
                }
                fVar10 = fVar6.f8518f;
            }
            fVar3 = fVar2;
        }
        e(fVar3, false);
        f<K, V> fVar11 = fVar.f8518f;
        if (fVar11 != null) {
            i10 = fVar11.y;
            fVar3.f8518f = fVar11;
            fVar11.f8517c = fVar3;
            fVar.f8518f = null;
        } else {
            i10 = 0;
        }
        f<K, V> fVar12 = fVar.f8519j;
        if (fVar12 != null) {
            i11 = fVar12.y;
            fVar3.f8519j = fVar12;
            fVar12.f8517c = fVar3;
            fVar.f8519j = null;
        }
        fVar3.y = Math.max(i10, i11) + 1;
        f(fVar, fVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.c cVar = this.entrySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.c cVar2 = new c();
        this.entrySet = cVar2;
        return cVar2;
    }

    public final void f(f<K, V> fVar, f<K, V> fVar2) {
        f<K, V> fVar3 = fVar.f8517c;
        fVar.f8517c = null;
        if (fVar2 != null) {
            fVar2.f8517c = fVar3;
        }
        if (fVar3 == null) {
            int i10 = fVar.f8522u;
            f<K, V>[] fVarArr = this.table;
            fVarArr[i10 & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f8518f == fVar) {
            fVar3.f8518f = fVar2;
        } else {
            fVar3.f8519j = fVar2;
        }
    }

    public final void g(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.f8518f;
        f<K, V> fVar3 = fVar.f8519j;
        f<K, V> fVar4 = fVar3.f8518f;
        f<K, V> fVar5 = fVar3.f8519j;
        fVar.f8519j = fVar4;
        if (fVar4 != null) {
            fVar4.f8517c = fVar;
        }
        f(fVar, fVar3);
        fVar3.f8518f = fVar;
        fVar.f8517c = fVar3;
        int i10 = 0;
        int max = Math.max(fVar2 != null ? fVar2.y : 0, fVar4 != null ? fVar4.y : 0) + 1;
        fVar.y = max;
        if (fVar5 != null) {
            i10 = fVar5.y;
        }
        fVar3.y = Math.max(max, i10) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        f<K, V> c10 = c(obj);
        if (c10 != null) {
            return c10.f8523w;
        }
        return null;
    }

    public final void h(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.f8518f;
        f<K, V> fVar3 = fVar.f8519j;
        f<K, V> fVar4 = fVar2.f8518f;
        f<K, V> fVar5 = fVar2.f8519j;
        fVar.f8518f = fVar5;
        if (fVar5 != null) {
            fVar5.f8517c = fVar;
        }
        f(fVar, fVar2);
        fVar2.f8519j = fVar;
        fVar.f8517c = fVar2;
        int max = Math.max(fVar3 != null ? fVar3.y : 0, fVar5 != null ? fVar5.y : 0) + 1;
        fVar.y = max;
        fVar2.y = Math.max(max, fVar4 != null ? fVar4.y : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.keySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new d();
        this.keySet = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v2) {
        Objects.requireNonNull(k10, "key == null");
        f<K, V> a10 = a(k10, true);
        V v10 = a10.f8523w;
        a10.f8523w = v2;
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f<K, V> c10 = c(obj);
        if (c10 != null) {
            e(c10, true);
        }
        if (c10 != null) {
            return c10.f8523w;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }
}
