package com.squareup.moshi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends jd.j {
    public String A;

    /* renamed from: z  reason: collision with root package name */
    public Object[] f8548z = new Object[32];

    public i() {
        n(6);
    }

    @Override // jd.j
    public jd.j E(String str) {
        if (this.f11700w) {
            this.f11700w = false;
            i(str);
            return this;
        }
        J(str);
        int[] iArr = this.f11697m;
        int i10 = this.f11694c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // jd.j
    public jd.j F(boolean z10) {
        if (this.f11700w) {
            StringBuilder m10 = a1.a.m("Boolean cannot be used as a map key in JSON at path ");
            m10.append(h());
            throw new IllegalStateException(m10.toString());
        }
        J(Boolean.valueOf(z10));
        int[] iArr = this.f11697m;
        int i10 = this.f11694c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final i J(Object obj) {
        String str;
        Object put;
        int m10 = m();
        int i10 = this.f11694c;
        if (i10 == 1) {
            if (m10 != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.f11695f[i10 - 1] = 7;
            this.f8548z[i10 - 1] = obj;
        } else if (m10 != 3 || (str = this.A) == null) {
            if (m10 != 1) {
                if (m10 == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
            ((List) this.f8548z[i10 - 1]).add(obj);
        } else if ((obj != null || this.f11699u) && (put = ((Map) this.f8548z[i10 - 1]).put(str, obj)) != null) {
            StringBuilder m11 = a1.a.m("Map key '");
            m11.append(this.A);
            m11.append("' has multiple values at path ");
            m11.append(h());
            m11.append(": ");
            m11.append(put);
            m11.append(" and ");
            m11.append(obj);
            throw new IllegalArgumentException(m11.toString());
        } else {
            this.A = null;
        }
        return this;
    }

    @Override // jd.j
    public jd.j a() {
        if (this.f11700w) {
            StringBuilder m10 = a1.a.m("Array cannot be used as a map key in JSON at path ");
            m10.append(h());
            throw new IllegalStateException(m10.toString());
        }
        int i10 = this.f11694c;
        int i11 = this.y;
        if (i10 == i11 && this.f11695f[i10 - 1] == 1) {
            this.y = ~i11;
            return this;
        }
        d();
        ArrayList arrayList = new ArrayList();
        J(arrayList);
        Object[] objArr = this.f8548z;
        int i12 = this.f11694c;
        objArr[i12] = arrayList;
        this.f11697m[i12] = 0;
        n(1);
        return this;
    }

    @Override // jd.j
    public jd.j c() {
        if (this.f11700w) {
            StringBuilder m10 = a1.a.m("Object cannot be used as a map key in JSON at path ");
            m10.append(h());
            throw new IllegalStateException(m10.toString());
        }
        int i10 = this.f11694c;
        int i11 = this.y;
        if (i10 == i11 && this.f11695f[i10 - 1] == 3) {
            this.y = ~i11;
            return this;
        }
        d();
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        J(linkedHashTreeMap);
        this.f8548z[this.f11694c] = linkedHashTreeMap;
        n(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i10 = this.f11694c;
        if (i10 > 1 || (i10 == 1 && this.f11695f[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f11694c = 0;
    }

    @Override // jd.j
    public jd.j e() {
        if (m() == 1) {
            int i10 = this.f11694c;
            int i11 = this.y;
            if (i10 == (~i11)) {
                this.y = ~i11;
                return this;
            }
            int i12 = i10 - 1;
            this.f11694c = i12;
            this.f8548z[i12] = null;
            int[] iArr = this.f11697m;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // jd.j
    public jd.j f() {
        if (m() == 3) {
            if (this.A != null) {
                StringBuilder m10 = a1.a.m("Dangling name: ");
                m10.append(this.A);
                throw new IllegalStateException(m10.toString());
            }
            int i10 = this.f11694c;
            int i11 = this.y;
            if (i10 == (~i11)) {
                this.y = ~i11;
                return this;
            }
            this.f11700w = false;
            int i12 = i10 - 1;
            this.f11694c = i12;
            this.f8548z[i12] = null;
            this.f11696j[i12] = null;
            int[] iArr = this.f11697m;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f11694c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // jd.j
    public jd.j i(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r2 = "name == null"
            r0 = r2
            java.util.Objects.requireNonNull(r7, r0)
            int r0 = r6.f11694c
            if (r0 == 0) goto L38
            int r2 = r6.m()
            r0 = r2
            r2 = 3
            r1 = r2
            if (r0 != r1) goto L2c
            r5 = 2
            java.lang.String r0 = r6.A
            if (r0 != 0) goto L2c
            r4 = 5
            boolean r0 = r6.f11700w
            if (r0 != 0) goto L2c
            r5 = 6
            r6.A = r7
            java.lang.String[] r0 = r6.f11696j
            r3 = 1
            int r1 = r6.f11694c
            r5 = 3
            int r1 = r1 + (-1)
            r0[r1] = r7
            r3 = 6
            return r6
        L2c:
            r5 = 5
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Nesting problem."
            r3 = 2
            r7.<init>(r0)
            r5 = 7
            throw r7
            r4 = 4
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r5 = 7
            java.lang.String r0 = "JsonWriter is closed."
            r7.<init>(r0)
            r5 = 5
            throw r7
            r3 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.i.i(java.lang.String):jd.j");
    }

    @Override // jd.j
    public jd.j k() {
        if (this.f11700w) {
            StringBuilder m10 = a1.a.m("null cannot be used as a map key in JSON at path ");
            m10.append(h());
            throw new IllegalStateException(m10.toString());
        }
        J(null);
        int[] iArr = this.f11697m;
        int i10 = this.f11694c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // jd.j
    public jd.j t(double d) {
        if (!this.f11698t && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f11700w) {
            this.f11700w = false;
            i(Double.toString(d));
            return this;
        } else {
            J(Double.valueOf(d));
            int[] iArr = this.f11697m;
            int i10 = this.f11694c - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
    }

    @Override // jd.j
    public jd.j v(long j10) {
        if (this.f11700w) {
            this.f11700w = false;
            i(Long.toString(j10));
            return this;
        }
        J(Long.valueOf(j10));
        int[] iArr = this.f11697m;
        int i10 = this.f11694c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // jd.j
    public jd.j w(Number number) {
        return ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) ? v(number.longValue()) : t(number.doubleValue());
    }
}
