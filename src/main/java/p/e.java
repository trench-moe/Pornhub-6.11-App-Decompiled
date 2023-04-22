package p;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class e<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public e(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i10;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int safeSizeOf(K k10, V v2) {
        int sizeOf = sizeOf(k10, v2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v2);
    }

    public V create(K k10) {
        return null;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public void entryRemoved(boolean z10, K k10, V v2, V v10) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.evictionCount;
    }

    public final V get(K k10) {
        V put;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            try {
                V v2 = this.map.get(k10);
                if (v2 != null) {
                    this.hitCount++;
                    return v2;
                }
                this.missCount++;
                V create = create(k10);
                if (create == null) {
                    return null;
                }
                synchronized (this) {
                    this.createCount++;
                    put = this.map.put(k10, create);
                    if (put != null) {
                        this.map.put(k10, put);
                    } else {
                        this.size += safeSizeOf(k10, create);
                    }
                }
                if (put != null) {
                    entryRemoved(false, k10, create, put);
                    return put;
                }
                trimToSize(this.maxSize);
                return create;
            } finally {
            }
        }
    }

    public final synchronized int hitCount() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.hitCount;
    }

    public final synchronized int maxSize() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.maxSize;
    }

    public final synchronized int missCount() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.missCount;
    }

    public final V put(K k10, V v2) {
        V put;
        if (k10 == null || v2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(k10, v2);
            put = this.map.put(k10, v2);
            if (put != null) {
                this.size -= safeSizeOf(k10, put);
            }
        }
        if (put != null) {
            entryRemoved(false, k10, put, v2);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final synchronized int putCount() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.putCount;
    }

    public final V remove(K k10) {
        V remove;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            try {
                remove = this.map.remove(k10);
                if (remove != null) {
                    this.size -= safeSizeOf(k10, remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            entryRemoved(false, k10, remove, null);
        }
        return remove;
    }

    public void resize(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            try {
                this.maxSize = i10;
            } catch (Throwable th) {
                throw th;
            }
        }
        trimToSize(i10);
    }

    public final synchronized int size() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.size;
    }

    public int sizeOf(K k10, V v2) {
        return 1;
    }

    public final synchronized Map<K, V> snapshot() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.hitCount;
        i11 = this.missCount + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void trimToSize(int r8) {
        /*
            r7 = this;
            r4 = r7
        L1:
            monitor-enter(r4)
            r6 = 3
            int r0 = r4.size     // Catch: java.lang.Throwable -> L8b
            if (r0 < 0) goto L68
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L8b
            r6 = 5
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8b
            r0 = r6
            if (r0 == 0) goto L15
            int r0 = r4.size     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L68
        L15:
            r6 = 3
            int r0 = r4.size     // Catch: java.lang.Throwable -> L8b
            r6 = 1
            if (r0 <= r8) goto L65
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L8b
            r6 = 4
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8b
            r0 = r6
            if (r0 == 0) goto L27
            r6 = 7
            goto L65
        L27:
            r6 = 2
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L8b
            java.util.Set r6 = r0.entrySet()     // Catch: java.lang.Throwable -> L8b
            r0 = r6
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L8b
            r0 = r6
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L8b
            r0 = r6
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L8b
            r6 = 6
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8b
            java.util.LinkedHashMap<K, V> r2 = r4.map     // Catch: java.lang.Throwable -> L8b
            r2.remove(r1)     // Catch: java.lang.Throwable -> L8b
            int r2 = r4.size     // Catch: java.lang.Throwable -> L8b
            int r6 = r4.safeSizeOf(r1, r0)     // Catch: java.lang.Throwable -> L8b
            r3 = r6
            int r2 = r2 - r3
            r6 = 4
            r4.size = r2     // Catch: java.lang.Throwable -> L8b
            r6 = 7
            int r2 = r4.evictionCount     // Catch: java.lang.Throwable -> L8b
            r6 = 1
            r3 = r6
            int r2 = r2 + r3
            r6 = 7
            r4.evictionCount = r2     // Catch: java.lang.Throwable -> L8b
            r6 = 6
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8b
            r6 = 0
            r2 = r6
            r4.entryRemoved(r3, r1, r0, r2)
            goto L1
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8b
            r6 = 7
            return
        L68:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8b
            r6 = 4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r6 = 7
            r0.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L8b
            r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r6 = 3
            r0.append(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8b
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            throw r8     // Catch: java.lang.Throwable -> L8b
            r6 = 3
        L8b:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8b
            throw r8
            r6 = 5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.trimToSize(int):void");
    }
}
