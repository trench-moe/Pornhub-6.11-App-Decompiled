package jd;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i extends j {
    public static final String[] C = new String[128];
    public String A = ":";
    public String B;

    /* renamed from: z  reason: collision with root package name */
    public final bf.g f11693z;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            C[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = C;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public i(bf.g gVar) {
        Objects.requireNonNull(gVar, "sink == null");
        this.f11693z = gVar;
        n(6);
    }

    public static void X(bf.g gVar, String str) {
        int i10;
        String str2;
        String[] strArr = C;
        gVar.D(34);
        int length = str.length();
        int i11 = 0;
        for (i10 = 0; i10 < length; i10 = i10 + 1) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i10 = str2 == null ? i10 + 1 : 0;
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else {
                if (charAt == 8233) {
                    str2 = "\\u2029";
                }
            }
            if (i11 < i10) {
                gVar.T(str, i11, i10);
            }
            gVar.N(str2);
            i11 = i10 + 1;
        }
        if (i11 < length) {
            gVar.T(str, i11, length);
        }
        gVar.D(34);
    }

    @Override // jd.j
    public j E(String str) {
        if (str == null) {
            k();
            return this;
        } else if (this.f11700w) {
            this.f11700w = false;
            i(str);
            return this;
        } else {
            Y();
            J();
            X(this.f11693z, str);
            int[] iArr = this.f11697m;
            int i10 = this.f11694c - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
    }

    @Override // jd.j
    public j F(boolean z10) {
        if (this.f11700w) {
            StringBuilder m10 = a1.a.m("Boolean cannot be used as a map key in JSON at path ");
            m10.append(h());
            throw new IllegalStateException(m10.toString());
        }
        Y();
        J();
        this.f11693z.N(z10 ? "true" : "false");
        int[] iArr = this.f11697m;
        int i10 = this.f11694c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final void J() {
        int m10 = m();
        int i10 = 2;
        if (m10 != 1) {
            if (m10 != 2) {
                if (m10 == 4) {
                    i10 = 5;
                    this.f11693z.N(this.A);
                } else if (m10 == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else {
                    if (m10 != 6) {
                        if (m10 != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        if (!this.f11698t) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    }
                    i10 = 7;
                }
                this.f11695f[this.f11694c - 1] = i10;
            }
            this.f11693z.D(44);
        }
        S();
        this.f11695f[this.f11694c - 1] = i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final jd.j P(int r8, int r9, char r10) {
        /*
            r7 = this;
            r3 = r7
            int r0 = r3.m()
            if (r0 == r9) goto L17
            r6 = 1
            if (r0 != r8) goto Lb
            goto L18
        Lb:
            r5 = 4
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r5 = "Nesting problem."
            r9 = r5
            r8.<init>(r9)
            r6 = 3
            throw r8
            r6 = 3
        L17:
            r6 = 3
        L18:
            java.lang.String r8 = r3.B
            r5 = 2
            if (r8 != 0) goto L51
            int r8 = r3.f11694c
            int r1 = r3.y
            r5 = 3
            int r2 = ~r1
            r5 = 1
            if (r8 != r2) goto L2a
            int r8 = ~r1
            r3.y = r8
            return r3
        L2a:
            int r8 = r8 + (-1)
            r5 = 6
            r3.f11694c = r8
            r5 = 2
            java.lang.String[] r1 = r3.f11696j
            r5 = 6
            r6 = 0
            r2 = r6
            r1[r8] = r2
            r6 = 2
            int[] r1 = r3.f11697m
            int r8 = r8 + (-1)
            r2 = r1[r8]
            int r2 = r2 + 1
            r1[r8] = r2
            if (r0 != r9) goto L49
            r5 = 4
            r3.S()
            r6 = 7
        L49:
            r5 = 5
            bf.g r8 = r3.f11693z
            r5 = 5
            r8.D(r10)
            return r3
        L51:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r5 = 7
            java.lang.String r9 = "Dangling name: "
            r5 = 1
            java.lang.StringBuilder r9 = a1.a.m(r9)
            java.lang.String r10 = r3.B
            r9.append(r10)
            java.lang.String r6 = r9.toString()
            r9 = r6
            r8.<init>(r9)
            throw r8
            r5 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.i.P(int, int, char):jd.j");
    }

    public final void S() {
        if (this.n == null) {
            return;
        }
        this.f11693z.D(10);
        int i10 = this.f11694c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f11693z.N(this.n);
        }
    }

    public final j V(int i10, int i11, char c10) {
        int i12 = this.f11694c;
        int i13 = this.y;
        if (i12 == i13) {
            int[] iArr = this.f11695f;
            if (iArr[i12 - 1] != i10) {
                if (iArr[i12 - 1] == i11) {
                }
            }
            this.y = ~i13;
            return this;
        }
        J();
        d();
        int[] iArr2 = this.f11695f;
        int i14 = this.f11694c;
        int i15 = i14 + 1;
        this.f11694c = i15;
        iArr2[i14] = i10;
        this.f11697m[i15 - 1] = 0;
        this.f11693z.D(c10);
        return this;
    }

    public final void Y() {
        if (this.B != null) {
            int m10 = m();
            if (m10 == 5) {
                this.f11693z.D(44);
            } else if (m10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            S();
            this.f11695f[this.f11694c - 1] = 4;
            X(this.f11693z, this.B);
            this.B = null;
        }
    }

    @Override // jd.j
    public j a() {
        if (this.f11700w) {
            StringBuilder m10 = a1.a.m("Array cannot be used as a map key in JSON at path ");
            m10.append(h());
            throw new IllegalStateException(m10.toString());
        }
        Y();
        V(1, 2, '[');
        return this;
    }

    @Override // jd.j
    public j c() {
        if (this.f11700w) {
            StringBuilder m10 = a1.a.m("Object cannot be used as a map key in JSON at path ");
            m10.append(h());
            throw new IllegalStateException(m10.toString());
        }
        Y();
        V(3, 5, '{');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11693z.close();
        int i10 = this.f11694c;
        if (i10 > 1 || (i10 == 1 && this.f11695f[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f11694c = 0;
    }

    @Override // jd.j
    public j e() {
        P(1, 2, ']');
        return this;
    }

    @Override // jd.j
    public j f() {
        this.f11700w = false;
        P(3, 5, '}');
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f11694c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f11693z.flush();
    }

    @Override // jd.j
    public j i(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f11694c != 0) {
            int m10 = m();
            if (m10 != 3) {
                if (m10 == 5) {
                }
                throw new IllegalStateException("Nesting problem.");
            }
            if (this.B == null && !this.f11700w) {
                this.B = str;
                this.f11696j[this.f11694c - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // jd.j
    public j k() {
        if (this.f11700w) {
            StringBuilder m10 = a1.a.m("null cannot be used as a map key in JSON at path ");
            m10.append(h());
            throw new IllegalStateException(m10.toString());
        }
        if (this.B != null) {
            if (!this.f11699u) {
                this.B = null;
                return this;
            }
            Y();
        }
        J();
        this.f11693z.N("null");
        int[] iArr = this.f11697m;
        int i10 = this.f11694c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // jd.j
    public void s(String str) {
        super.s(str);
        this.A = !str.isEmpty() ? ": " : ":";
    }

    @Override // jd.j
    public j t(double d) {
        if (!this.f11698t && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        if (this.f11700w) {
            this.f11700w = false;
            i(Double.toString(d));
            return this;
        }
        Y();
        J();
        this.f11693z.N(Double.toString(d));
        int[] iArr = this.f11697m;
        int i10 = this.f11694c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // jd.j
    public j v(long j10) {
        if (this.f11700w) {
            this.f11700w = false;
            i(Long.toString(j10));
            return this;
        }
        Y();
        J();
        this.f11693z.N(Long.toString(j10));
        int[] iArr = this.f11697m;
        int i10 = this.f11694c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // jd.j
    public j w(Number number) {
        String obj = number.toString();
        if (!this.f11698t && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f11700w) {
            this.f11700w = false;
            i(obj);
            return this;
        }
        Y();
        J();
        this.f11693z.N(obj);
        int[] iArr = this.f11697m;
        int i10 = this.f11694c - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }
}
