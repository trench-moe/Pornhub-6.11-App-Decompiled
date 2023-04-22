package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends JsonReader {

    /* renamed from: w  reason: collision with root package name */
    public static final Object f8543w = new Object();

    /* renamed from: u  reason: collision with root package name */
    public Object[] f8544u;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<Object>, Cloneable {

        /* renamed from: c  reason: collision with root package name */
        public final JsonReader.Token f8545c;

        /* renamed from: f  reason: collision with root package name */
        public final Object[] f8546f;

        /* renamed from: j  reason: collision with root package name */
        public int f8547j;

        public a(JsonReader.Token token, Object[] objArr, int i10) {
            this.f8545c = token;
            this.f8546f = objArr;
            this.f8547j = i10;
        }

        public Object clone() {
            return new a(this.f8545c, this.f8546f, this.f8547j);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8547j < this.f8546f.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.f8546f;
            int i10 = this.f8547j;
            this.f8547j = i10 + 1;
            return objArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public h(Object obj) {
        int[] iArr = this.f8493f;
        int i10 = this.f8492c;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f8544u = objArr;
        this.f8492c = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // com.squareup.moshi.JsonReader
    public int F(JsonReader.a aVar) {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) f0(Map.Entry.class, token);
        Object key = entry.getKey();
        if (key instanceof String) {
            String str = (String) key;
            int length = aVar.f8505a.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (aVar.f8505a[i10].equals(str)) {
                    this.f8544u[this.f8492c - 1] = entry.getValue();
                    this.f8494j[this.f8492c - 2] = str;
                    return i10;
                }
            }
            return -1;
        }
        throw X(key, token);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object[]] */
    @Override // com.squareup.moshi.JsonReader
    public int J(JsonReader.a aVar) {
        int i10 = this.f8492c;
        String str = i10 != 0 ? this.f8544u[i10 - 1] : null;
        if (!(str instanceof String)) {
            if (str != f8543w) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str2 = str;
        int length = aVar.f8505a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (aVar.f8505a[i11].equals(str2)) {
                c0();
                return i11;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public void P() {
        if (!this.f8496t) {
            this.f8544u[this.f8492c - 1] = ((Map.Entry) f0(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.f8494j[this.f8492c - 2] = "null";
            return;
        }
        JsonReader.Token v2 = v();
        Y();
        throw new JsonDataException("Cannot skip unexpected " + v2 + " at " + f());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.squareup.moshi.JsonReader
    public void S() {
        /*
            r10 = this;
            r6 = r10
            boolean r0 = r6.f8496t
            if (r0 != 0) goto L95
            int r0 = r6.f8492c
            r8 = 1
            r1 = r8
            if (r0 <= r1) goto L16
            r8 = 4
            java.lang.String[] r2 = r6.f8494j
            int r3 = r0 + (-2)
            r8 = 4
            java.lang.String r4 = "null"
            r8 = 6
            r2[r3] = r4
        L16:
            if (r0 == 0) goto L22
            r8 = 3
            java.lang.Object[] r2 = r6.f8544u
            r9 = 3
            int r3 = r0 + (-1)
            r2 = r2[r3]
            r8 = 6
            goto L24
        L22:
            r8 = 0
            r2 = r8
        L24:
            boolean r3 = r2 instanceof com.squareup.moshi.h.a
            java.lang.String r4 = " at path "
            r8 = 3
            java.lang.String r8 = "Expected a value but was "
            r5 = r8
            if (r3 != 0) goto L73
            boolean r2 = r2 instanceof java.util.Map.Entry
            if (r2 == 0) goto L47
            r9 = 4
            java.lang.Object[] r2 = r6.f8544u
            int r3 = r0 + (-1)
            r9 = 6
            r3 = r2[r3]
            r9 = 7
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r8 = 7
            int r0 = r0 - r1
            java.lang.Object r1 = r3.getValue()
            r2[r0] = r1
            r8 = 1
            goto L4e
        L47:
            r8 = 1
            if (r0 <= 0) goto L4f
            r6.c0()
            r9 = 3
        L4e:
            return
        L4f:
            com.squareup.moshi.JsonDataException r0 = new com.squareup.moshi.JsonDataException
            r8 = 7
            java.lang.StringBuilder r8 = a1.a.m(r5)
            r1 = r8
            com.squareup.moshi.JsonReader$Token r8 = r6.v()
            r2 = r8
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = r6.f()
            r1.append(r2)
            java.lang.String r8 = r1.toString()
            r1 = r8
            r0.<init>(r1)
            throw r0
            r8 = 2
        L73:
            com.squareup.moshi.JsonDataException r0 = new com.squareup.moshi.JsonDataException
            java.lang.StringBuilder r9 = a1.a.m(r5)
            r1 = r9
            com.squareup.moshi.JsonReader$Token r2 = r6.v()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = r6.f()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r8 = 5
            throw r0
            r8 = 6
        L95:
            com.squareup.moshi.JsonDataException r0 = new com.squareup.moshi.JsonDataException
            r8 = 3
            java.lang.String r8 = "Cannot skip unexpected "
            r1 = r8
            java.lang.StringBuilder r1 = a1.a.m(r1)
            com.squareup.moshi.JsonReader$Token r9 = r6.v()
            r2 = r9
            r1.append(r2)
            java.lang.String r2 = " at "
            r8 = 6
            r1.append(r2)
            java.lang.String r2 = r6.f()
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            r1 = r9
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.h.S():void");
    }

    public String Y() {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) f0(Map.Entry.class, token);
        Object key = entry.getKey();
        if (key instanceof String) {
            String str = (String) key;
            this.f8544u[this.f8492c - 1] = entry.getValue();
            this.f8494j[this.f8492c - 2] = str;
            return str;
        }
        throw X(key, token);
    }

    public final void Z(Object obj) {
        int i10 = this.f8492c;
        if (i10 == this.f8544u.length) {
            if (i10 == 256) {
                StringBuilder m10 = a1.a.m("Nesting too deep at ");
                m10.append(f());
                throw new JsonDataException(m10.toString());
            }
            int[] iArr = this.f8493f;
            this.f8493f = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f8494j;
            this.f8494j = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f8495m;
            this.f8495m = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f8544u;
            this.f8544u = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f8544u;
        int i11 = this.f8492c;
        this.f8492c = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // com.squareup.moshi.JsonReader
    public void a() {
        List list = (List) f0(List.class, JsonReader.Token.BEGIN_ARRAY);
        a aVar = new a(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f8544u;
        int i10 = this.f8492c;
        objArr[i10 - 1] = aVar;
        this.f8493f[i10 - 1] = 1;
        this.f8495m[i10 - 1] = 0;
        if (aVar.hasNext()) {
            Z(aVar.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void c() {
        Map map = (Map) f0(Map.class, JsonReader.Token.BEGIN_OBJECT);
        a aVar = new a(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f8544u;
        int i10 = this.f8492c;
        objArr[i10 - 1] = aVar;
        this.f8493f[i10 - 1] = 3;
        if (aVar.hasNext()) {
            Z(aVar.next());
        }
    }

    public final void c0() {
        int i10 = this.f8492c - 1;
        this.f8492c = i10;
        Object[] objArr = this.f8544u;
        objArr[i10] = null;
        this.f8493f[i10] = 0;
        if (i10 > 0) {
            int[] iArr = this.f8495m;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            Object obj = objArr[i10 - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    Z(it.next());
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.f8544u, 0, this.f8492c, (Object) null);
        this.f8544u[0] = f8543w;
        this.f8493f[0] = 8;
        this.f8492c = 1;
    }

    @Override // com.squareup.moshi.JsonReader
    public void d() {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        a aVar = (a) f0(a.class, token);
        if (aVar.f8545c != token || aVar.hasNext()) {
            throw X(aVar, token);
        }
        c0();
    }

    @Override // com.squareup.moshi.JsonReader
    public void e() {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        a aVar = (a) f0(a.class, token);
        if (aVar.f8545c != token || aVar.hasNext()) {
            throw X(aVar, token);
        }
        this.f8494j[this.f8492c - 1] = null;
        c0();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final <T> T f0(java.lang.Class<T> r8, com.squareup.moshi.JsonReader.Token r9) {
        /*
            r7 = this;
            r3 = r7
            int r0 = r3.f8492c
            r5 = 0
            r1 = r5
            if (r0 == 0) goto L12
            r6 = 7
            java.lang.Object[] r2 = r3.f8544u
            r5 = 6
            int r0 = r0 + (-1)
            r5 = 4
            r0 = r2[r0]
            r6 = 1
            goto L14
        L12:
            r5 = 7
            r0 = r1
        L14:
            boolean r5 = r8.isInstance(r0)
            r2 = r5
            if (r2 == 0) goto L21
            java.lang.Object r6 = r8.cast(r0)
            r8 = r6
            return r8
        L21:
            r5 = 1
            if (r0 != 0) goto L2c
            r6 = 1
            com.squareup.moshi.JsonReader$Token r8 = com.squareup.moshi.JsonReader.Token.NULL
            r5 = 7
            if (r9 != r8) goto L2c
            r5 = 6
            return r1
        L2c:
            r5 = 6
            java.lang.Object r8 = com.squareup.moshi.h.f8543w
            if (r0 != r8) goto L3b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "JsonReader is closed"
            r6 = 3
            r8.<init>(r9)
            throw r8
            r5 = 5
        L3b:
            com.squareup.moshi.JsonDataException r8 = r3.X(r0, r9)
            throw r8
            r6 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.h.f0(java.lang.Class, com.squareup.moshi.JsonReader$Token):java.lang.Object");
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean h() {
        int i10 = this.f8492c;
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f8544u[i10 - 1];
        if (obj instanceof Iterator) {
            if (((Iterator) obj).hasNext()) {
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean i() {
        c0();
        return ((Boolean) f0(Boolean.class, JsonReader.Token.BOOLEAN)).booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.squareup.moshi.JsonReader
    public double k() {
        /*
            r9 = this;
            r5 = r9
            com.squareup.moshi.JsonReader$Token r0 = com.squareup.moshi.JsonReader.Token.NUMBER
            r8 = 4
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r1 = r5.f0(r1, r0)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L17
            r7 = 4
            java.lang.Number r1 = (java.lang.Number) r1
            r7 = 1
            double r0 = r1.doubleValue()
            goto L27
        L17:
            r7 = 1
            boolean r2 = r1 instanceof java.lang.String
            r8 = 6
            if (r2 == 0) goto L71
            r7 = 1
            r8 = 1
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L6a
            r7 = 6
            double r0 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L6a
        L27:
            boolean r2 = r5.n
            if (r2 != 0) goto L64
            r8 = 4
            boolean r8 = java.lang.Double.isNaN(r0)
            r2 = r8
            if (r2 != 0) goto L3d
            r8 = 1
            boolean r7 = java.lang.Double.isInfinite(r0)
            r2 = r7
            if (r2 != 0) goto L3d
            r7 = 1
            goto L65
        L3d:
            com.squareup.moshi.JsonEncodingException r2 = new com.squareup.moshi.JsonEncodingException
            r7 = 3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r8 = 3
            java.lang.String r8 = "JSON forbids NaN and infinities: "
            r4 = r8
            r3.append(r4)
            r3.append(r0)
            java.lang.String r8 = " at path "
            r0 = r8
            r3.append(r0)
            java.lang.String r0 = r5.f()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L64:
            r7 = 1
        L65:
            r5.c0()
            r8 = 6
            return r0
        L6a:
            com.squareup.moshi.JsonDataException r8 = r5.X(r1, r0)
            r0 = r8
            throw r0
            r8 = 5
        L71:
            r8 = 5
            com.squareup.moshi.JsonDataException r0 = r5.X(r1, r0)
            throw r0
            r7 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.h.k():double");
    }

    @Override // com.squareup.moshi.JsonReader
    public int m() {
        int intValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object f02 = f0(Object.class, token);
        if (f02 instanceof Number) {
            intValueExact = ((Number) f02).intValue();
        } else if (!(f02 instanceof String)) {
            throw X(f02, token);
        } else {
            try {
                try {
                    intValueExact = Integer.parseInt((String) f02);
                } catch (NumberFormatException unused) {
                    throw X(f02, token);
                }
            } catch (NumberFormatException unused2) {
                intValueExact = new BigDecimal((String) f02).intValueExact();
            }
        }
        c0();
        return intValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public long n() {
        long longValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object f02 = f0(Object.class, token);
        if (f02 instanceof Number) {
            longValueExact = ((Number) f02).longValue();
        } else if (!(f02 instanceof String)) {
            throw X(f02, token);
        } else {
            try {
                try {
                    longValueExact = Long.parseLong((String) f02);
                } catch (NumberFormatException unused) {
                    longValueExact = new BigDecimal((String) f02).longValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw X(f02, token);
            }
        }
        c0();
        return longValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public <T> T s() {
        f0(Void.class, JsonReader.Token.NULL);
        c0();
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public String t() {
        int i10 = this.f8492c;
        String str = i10 != 0 ? this.f8544u[i10 - 1] : null;
        if (str instanceof String) {
            c0();
            return str;
        } else if (str instanceof Number) {
            c0();
            return str.toString();
        } else if (str == f8543w) {
            throw new IllegalStateException("JsonReader is closed");
        } else {
            throw X(str, JsonReader.Token.STRING);
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token v() {
        int i10 = this.f8492c;
        if (i10 == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.f8544u[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f8545c;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj == f8543w) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw X(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.JsonReader
    public void w() {
        if (h()) {
            Z(Y());
        }
    }
}
