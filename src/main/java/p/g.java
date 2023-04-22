package p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: m  reason: collision with root package name */
    public static Object[] f13763m;
    public static int n;

    /* renamed from: t  reason: collision with root package name */
    public static Object[] f13764t;

    /* renamed from: u  reason: collision with root package name */
    public static int f13765u;

    /* renamed from: c  reason: collision with root package name */
    public int[] f13766c;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f13767f;

    /* renamed from: j  reason: collision with root package name */
    public int f13768j;

    public g() {
        this.f13766c = a0.b.E;
        this.f13767f = a0.b.G;
        this.f13768j = 0;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f13766c = a0.b.E;
            this.f13767f = a0.b.G;
        } else {
            a(i10);
        }
        this.f13768j = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (g.class) {
                Object[] objArr = f13764t;
                if (objArr != null) {
                    this.f13767f = objArr;
                    f13764t = (Object[]) objArr[0];
                    this.f13766c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f13765u--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f13763m;
                if (objArr2 != null) {
                    this.f13767f = objArr2;
                    f13763m = (Object[]) objArr2[0];
                    this.f13766c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    n--;
                    return;
                }
            }
        }
        this.f13766c = new int[i10];
        this.f13767f = new Object[i10 << 1];
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void c(int[] r12, java.lang.Object[] r13, int r14) {
        /*
            java.lang.Class<p.g> r0 = p.g.class
            int r1 = r12.length
            r8 = 0
            r2 = r8
            r3 = 2
            r8 = 0
            r4 = r8
            r8 = 10
            r5 = r8
            r6 = 1
            r10 = 4
            r7 = 8
            r9 = 4
            if (r1 != r7) goto L3a
            monitor-enter(r0)
            int r1 = p.g.f13765u     // Catch: java.lang.Throwable -> L36
            r11 = 7
            if (r1 >= r5) goto L34
            java.lang.Object[] r1 = p.g.f13764t     // Catch: java.lang.Throwable -> L36
            r11 = 6
            r13[r4] = r1     // Catch: java.lang.Throwable -> L36
            r13[r6] = r12     // Catch: java.lang.Throwable -> L36
            int r12 = r14 << 1
            int r12 = r12 - r6
        L22:
            if (r12 < r3) goto L2b
            r9 = 5
            r13[r12] = r2     // Catch: java.lang.Throwable -> L36
            r10 = 4
            int r12 = r12 + (-1)
            goto L22
        L2b:
            r10 = 4
            p.g.f13764t = r13     // Catch: java.lang.Throwable -> L36
            int r12 = p.g.f13765u     // Catch: java.lang.Throwable -> L36
            r11 = 6
            int r12 = r12 + r6
            p.g.f13765u = r12     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L69
        L36:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r12
            r9 = 5
        L3a:
            int r1 = r12.length
            r8 = 4
            r7 = r8
            if (r1 != r7) goto L68
            monitor-enter(r0)
            r10 = 4
            int r1 = p.g.n     // Catch: java.lang.Throwable -> L64
            if (r1 >= r5) goto L62
            r10 = 1
            java.lang.Object[] r1 = p.g.f13763m     // Catch: java.lang.Throwable -> L64
            r13[r4] = r1     // Catch: java.lang.Throwable -> L64
            r13[r6] = r12     // Catch: java.lang.Throwable -> L64
            r11 = 5
            int r12 = r14 << 1
            r9 = 6
            int r12 = r12 - r6
        L51:
            if (r12 < r3) goto L59
            r9 = 4
            r13[r12] = r2     // Catch: java.lang.Throwable -> L64
            int r12 = r12 + (-1)
            goto L51
        L59:
            r11 = 2
            p.g.f13763m = r13     // Catch: java.lang.Throwable -> L64
            r10 = 7
            int r12 = p.g.n     // Catch: java.lang.Throwable -> L64
            int r12 = r12 + r6
            p.g.n = r12     // Catch: java.lang.Throwable -> L64
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            goto L69
        L64:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            throw r12
            r11 = 4
        L68:
            r11 = 7
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g.c(int[], java.lang.Object[], int):void");
    }

    public void b(int i10) {
        int i11 = this.f13768j;
        int[] iArr = this.f13766c;
        if (iArr.length < i10) {
            Object[] objArr = this.f13767f;
            a(i10);
            if (this.f13768j > 0) {
                System.arraycopy(iArr, 0, this.f13766c, 0, i11);
                System.arraycopy(objArr, 0, this.f13767f, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f13768j != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f13768j;
        if (i10 > 0) {
            int[] iArr = this.f13766c;
            Object[] objArr = this.f13767f;
            this.f13766c = a0.b.E;
            this.f13767f = a0.b.G;
            this.f13768j = 0;
            c(iArr, objArr, i10);
        }
        if (this.f13768j > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public int d(Object obj, int i10) {
        int i11 = this.f13768j;
        if (i11 == 0) {
            return -1;
        }
        try {
            int g10 = a0.b.g(this.f13766c, i11, i10);
            if (g10 >= 0 && !obj.equals(this.f13767f[g10 << 1])) {
                int i12 = g10 + 1;
                while (i12 < i11 && this.f13766c[i12] == i10) {
                    if (obj.equals(this.f13767f[i12 << 1])) {
                        return i12;
                    }
                    i12++;
                }
                for (int i13 = g10 - 1; i13 >= 0 && this.f13766c[i13] == i10; i13--) {
                    if (obj.equals(this.f13767f[i13 << 1])) {
                        return i13;
                    }
                }
                return ~i12;
            }
            return g10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f13768j != gVar.f13768j) {
                return false;
            }
            for (int i10 = 0; i10 < this.f13768j; i10++) {
                try {
                    K h10 = h(i10);
                    V l10 = l(i10);
                    Object obj2 = gVar.get(h10);
                    if (l10 == null) {
                        if (obj2 == null && gVar.containsKey(h10)) {
                        }
                        return false;
                    } else if (!l10.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f13768j != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f13768j; i11++) {
                try {
                    K h11 = h(i11);
                    V l11 = l(i11);
                    Object obj3 = map.get(h11);
                    if (l11 == null) {
                        if (obj3 == null && map.containsKey(h11)) {
                        }
                        return false;
                    } else if (!l11.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i10 = this.f13768j;
        if (i10 == 0) {
            return -1;
        }
        try {
            int g10 = a0.b.g(this.f13766c, i10, 0);
            if (g10 >= 0 && this.f13767f[g10 << 1] != null) {
                int i11 = g10 + 1;
                while (i11 < i10 && this.f13766c[i11] == 0) {
                    if (this.f13767f[i11 << 1] == null) {
                        return i11;
                    }
                    i11++;
                }
                for (int i12 = g10 - 1; i12 >= 0 && this.f13766c[i12] == 0; i12--) {
                    if (this.f13767f[i12 << 1] == null) {
                        return i12;
                    }
                }
                return ~i11;
            }
            return g10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(Object obj) {
        int i10 = this.f13768j * 2;
        Object[] objArr = this.f13767f;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
        } else {
            for (int i12 = 1; i12 < i10; i12 += 2) {
                if (obj.equals(objArr[i12])) {
                    return i12 >> 1;
                }
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v2) {
        int e10 = e(obj);
        if (e10 >= 0) {
            v2 = (V) this.f13767f[(e10 << 1) + 1];
        }
        return v2;
    }

    public K h(int i10) {
        return (K) this.f13767f[i10 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f13766c;
        Object[] objArr = this.f13767f;
        int i10 = this.f13768j;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public void i(g<? extends K, ? extends V> gVar) {
        int i10 = gVar.f13768j;
        b(this.f13768j + i10);
        if (this.f13768j != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(gVar.h(i11), gVar.l(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(gVar.f13766c, 0, this.f13766c, 0, i10);
            System.arraycopy(gVar.f13767f, 0, this.f13767f, 0, i10 << 1);
            this.f13768j = i10;
        }
    }

    public boolean isEmpty() {
        return this.f13768j <= 0;
    }

    public V j(int i10) {
        Object[] objArr = this.f13767f;
        int i11 = i10 << 1;
        V v2 = (V) objArr[i11 + 1];
        int i12 = this.f13768j;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f13766c, objArr, i12);
            this.f13766c = a0.b.E;
            this.f13767f = a0.b.G;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f13766c;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f13767f;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f13767f;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f13768j) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f13766c, 0, i10);
                    System.arraycopy(objArr, 0, this.f13767f, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f13766c, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f13767f, i11, i19 << 1);
                    i13 = i14;
                }
            }
            i13 = i14;
        }
        if (i12 == this.f13768j) {
            this.f13768j = i13;
            return v2;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i10, V v2) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f13767f;
        V v10 = (V) objArr[i11];
        objArr[i11] = v2;
        return v10;
    }

    public V l(int i10) {
        return (V) this.f13767f[(i10 << 1) + 1];
    }

    public V put(K k10, V v2) {
        int i10;
        int d;
        int i11 = this.f13768j;
        if (k10 == null) {
            d = f();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            d = d(k10, hashCode);
        }
        if (d >= 0) {
            int i12 = (d << 1) + 1;
            Object[] objArr = this.f13767f;
            V v10 = (V) objArr[i12];
            objArr[i12] = v2;
            return v10;
        }
        int i13 = ~d;
        int[] iArr = this.f13766c;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f13767f;
            a(i14);
            if (i11 != this.f13768j) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f13766c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f13767f, 0, objArr2.length);
            }
            c(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f13766c;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f13767f;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f13768j - i13) << 1);
        }
        int i16 = this.f13768j;
        if (i11 == i16) {
            int[] iArr4 = this.f13766c;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f13767f;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v2;
                this.f13768j = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v2) {
        V orDefault = getOrDefault(k10, null);
        return orDefault == null ? put(k10, v2) : orDefault;
    }

    public V remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return j(e10);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        V l10;
        int e10 = e(obj);
        if (e10 < 0 || (obj2 != (l10 = l(e10)) && (obj2 == null || !obj2.equals(l10)))) {
            return false;
        }
        j(e10);
        return true;
    }

    public V replace(K k10, V v2) {
        int e10 = e(k10);
        if (e10 >= 0) {
            return k(e10, v2);
        }
        return null;
    }

    public boolean replace(K k10, V v2, V v10) {
        V l10;
        int e10 = e(k10);
        if (e10 < 0 || ((l10 = l(e10)) != v2 && (v2 == null || !v2.equals(l10)))) {
            return false;
        }
        k(e10, v10);
        return true;
    }

    public int size() {
        return this.f13768j;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f13768j * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f13768j; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K h10 = h(i10);
            if (h10 != this) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
