package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.util.Objects;
import okio.ByteString;

/* loaded from: classes.dex */
public final class g extends JsonReader {
    public static final ByteString C = ByteString.d("'\\");
    public static final ByteString D = ByteString.d("\"\\");
    public static final ByteString E = ByteString.d("{}[]:, \n\t\r\f/\\;#=");
    public static final ByteString F = ByteString.d("\n\r");
    public static final ByteString G = ByteString.d("*/");
    public int A;
    public String B;

    /* renamed from: u  reason: collision with root package name */
    public final bf.h f8540u;

    /* renamed from: w  reason: collision with root package name */
    public final bf.f f8541w;
    public int y = 0;

    /* renamed from: z  reason: collision with root package name */
    public long f8542z;

    public g(bf.h hVar) {
        Objects.requireNonNull(hVar, "source == null");
        this.f8540u = hVar;
        this.f8541w = hVar.b();
        E(6);
    }

    @Override // com.squareup.moshi.JsonReader
    public int F(JsonReader.a aVar) {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return c0(this.B, aVar);
        }
        int M = this.f8540u.M(aVar.f8506b);
        if (M != -1) {
            this.y = 0;
            this.f8494j[this.f8492c - 1] = aVar.f8505a[M];
            return M;
        }
        String str = this.f8494j[this.f8492c - 1];
        String i02 = i0();
        int c02 = c0(i02, aVar);
        if (c02 == -1) {
            this.y = 15;
            this.B = i02;
            this.f8494j[this.f8492c - 1] = str;
        }
        return c02;
    }

    @Override // com.squareup.moshi.JsonReader
    public int J(JsonReader.a aVar) {
        int[] iArr;
        int i10;
        int i11 = this.y;
        if (i11 == 0) {
            i11 = Z();
        }
        if (i11 < 8 || i11 > 11) {
            return -1;
        }
        if (i11 == 11) {
            return f0(this.B, aVar);
        }
        int M = this.f8540u.M(aVar.f8506b);
        if (M != -1) {
            this.y = 0;
            int[] iArr2 = this.f8495m;
            int i12 = this.f8492c - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return M;
        }
        String t2 = t();
        int f02 = f0(t2, aVar);
        if (f02 == -1) {
            this.y = 11;
            this.B = t2;
            this.f8495m[this.f8492c - 1] = iArr[i10] - 1;
        }
        return f02;
    }

    @Override // com.squareup.moshi.JsonReader
    public void P() {
        if (this.f8496t) {
            JsonReader.Token v2 = v();
            i0();
            throw new JsonDataException("Cannot skip unexpected " + v2 + " at " + f());
        }
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 14) {
            u0();
        } else if (i10 == 13) {
            s0(D);
        } else if (i10 == 12) {
            s0(C);
        } else if (i10 != 15) {
            StringBuilder m10 = a1.a.m("Expected a name but was ");
            m10.append(v());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        }
        this.y = 0;
        this.f8494j[this.f8492c - 1] = "null";
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
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.S():void");
    }

    public final void Y() {
        if (this.n) {
            return;
        }
        V("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e8, code lost:
        if (g0(r10) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ea, code lost:
        r4 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Z() {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.Z():int");
    }

    @Override // com.squareup.moshi.JsonReader
    public void a() {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 3) {
            E(1);
            this.f8495m[this.f8492c - 1] = 0;
            this.y = 0;
            return;
        }
        StringBuilder m10 = a1.a.m("Expected BEGIN_ARRAY but was ");
        m10.append(v());
        m10.append(" at path ");
        m10.append(f());
        throw new JsonDataException(m10.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public void c() {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 1) {
            E(3);
            this.y = 0;
            return;
        }
        StringBuilder m10 = a1.a.m("Expected BEGIN_OBJECT but was ");
        m10.append(v());
        m10.append(" at path ");
        m10.append(f());
        throw new JsonDataException(m10.toString());
    }

    public final int c0(String str, JsonReader.a aVar) {
        int length = aVar.f8505a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f8505a[i10])) {
                this.y = 0;
                this.f8494j[this.f8492c - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.y = 0;
        this.f8493f[0] = 8;
        this.f8492c = 1;
        bf.f fVar = this.f8541w;
        fVar.l(fVar.f3669f);
        this.f8540u.close();
    }

    @Override // com.squareup.moshi.JsonReader
    public void d() {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 != 4) {
            StringBuilder m10 = a1.a.m("Expected END_ARRAY but was ");
            m10.append(v());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        }
        int i11 = this.f8492c - 1;
        this.f8492c = i11;
        int[] iArr = this.f8495m;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.y = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    public void e() {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 != 2) {
            StringBuilder m10 = a1.a.m("Expected END_OBJECT but was ");
            m10.append(v());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        }
        int i11 = this.f8492c - 1;
        this.f8492c = i11;
        this.f8494j[i11] = null;
        int[] iArr = this.f8495m;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.y = 0;
    }

    public final int f0(String str, JsonReader.a aVar) {
        int length = aVar.f8505a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f8505a[i10])) {
                this.y = 0;
                int[] iArr = this.f8495m;
                int i11 = this.f8492c - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    public final boolean g0(int i10) {
        if (i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 32) {
            if (i10 != 35) {
                if (i10 != 44) {
                    if (i10 != 47 && i10 != 61) {
                        if (i10 != 123 && i10 != 125 && i10 != 58) {
                            if (i10 != 59) {
                                switch (i10) {
                                    case 91:
                                    case 93:
                                        break;
                                    default:
                                        return true;
                                    case 92:
                                        Y();
                                        break;
                                }
                            }
                        }
                    }
                }
            }
            Y();
        }
        return false;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean h() {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean i() {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 5) {
            this.y = 0;
            int[] iArr = this.f8495m;
            int i11 = this.f8492c - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.y = 0;
            int[] iArr2 = this.f8495m;
            int i12 = this.f8492c - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            StringBuilder m10 = a1.a.m("Expected a boolean but was ");
            m10.append(v());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        }
    }

    public String i0() {
        String str;
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 14) {
            str = q0();
        } else if (i10 == 13) {
            str = p0(D);
        } else if (i10 == 12) {
            str = p0(C);
        } else if (i10 != 15) {
            StringBuilder m10 = a1.a.m("Expected a name but was ");
            m10.append(v());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        } else {
            str = this.B;
            this.B = null;
        }
        this.y = 0;
        this.f8494j[this.f8492c - 1] = str;
        return str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final int j0(boolean r12) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.j0(boolean):int");
    }

    @Override // com.squareup.moshi.JsonReader
    public double k() {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 16) {
            this.y = 0;
            int[] iArr = this.f8495m;
            int i11 = this.f8492c - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f8542z;
        }
        if (i10 == 17) {
            this.B = this.f8541w.F(this.A);
        } else if (i10 == 9) {
            this.B = p0(D);
        } else if (i10 == 8) {
            this.B = p0(C);
        } else if (i10 == 10) {
            this.B = q0();
        } else if (i10 != 11) {
            StringBuilder m10 = a1.a.m("Expected a double but was ");
            m10.append(v());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        }
        this.y = 11;
        try {
            double parseDouble = Double.parseDouble(this.B);
            if (!this.n && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + f());
            }
            this.B = null;
            this.y = 0;
            int[] iArr2 = this.f8495m;
            int i12 = this.f8492c - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder m11 = a1.a.m("Expected a double but was ");
            m11.append(this.B);
            m11.append(" at path ");
            m11.append(f());
            throw new JsonDataException(m11.toString());
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
    @Override // com.squareup.moshi.JsonReader
    public int m() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.m():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        r0 = p0(com.squareup.moshi.g.D);
     */
    @Override // com.squareup.moshi.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long n() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.n():long");
    }

    public final String p0(ByteString byteString) {
        StringBuilder sb2 = null;
        while (true) {
            long K = this.f8540u.K(byteString);
            if (K == -1) {
                V("Unterminated string");
                throw null;
            } else if (this.f8541w.f(K) != 92) {
                if (sb2 == null) {
                    String F2 = this.f8541w.F(K);
                    this.f8541w.readByte();
                    return F2;
                }
                sb2.append(this.f8541w.F(K));
                this.f8541w.readByte();
                return sb2.toString();
            } else {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f8541w.F(K));
                this.f8541w.readByte();
                sb2.append(r0());
            }
        }
    }

    public final String q0() {
        long K = this.f8540u.K(E);
        return K != -1 ? this.f8541w.F(K) : this.f8541w.E();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final char r0() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.g.r0():char");
    }

    @Override // com.squareup.moshi.JsonReader
    public <T> T s() {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 7) {
            this.y = 0;
            int[] iArr = this.f8495m;
            int i11 = this.f8492c - 1;
            iArr[i11] = iArr[i11] + 1;
            return null;
        }
        StringBuilder m10 = a1.a.m("Expected null but was ");
        m10.append(v());
        m10.append(" at path ");
        m10.append(f());
        throw new JsonDataException(m10.toString());
    }

    public final void s0(ByteString byteString) {
        while (true) {
            long K = this.f8540u.K(byteString);
            if (K == -1) {
                V("Unterminated string");
                throw null;
            } else if (this.f8541w.f(K) != 92) {
                this.f8541w.l(K + 1);
                return;
            } else {
                this.f8541w.l(K + 1);
                r0();
            }
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public String t() {
        String F2;
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        if (i10 == 10) {
            F2 = q0();
        } else if (i10 == 9) {
            F2 = p0(D);
        } else if (i10 == 8) {
            F2 = p0(C);
        } else if (i10 == 11) {
            F2 = this.B;
            this.B = null;
        } else if (i10 == 16) {
            F2 = Long.toString(this.f8542z);
        } else if (i10 != 17) {
            StringBuilder m10 = a1.a.m("Expected a string but was ");
            m10.append(v());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        } else {
            F2 = this.f8541w.F(this.A);
        }
        this.y = 0;
        int[] iArr = this.f8495m;
        int i11 = this.f8492c - 1;
        iArr[i11] = iArr[i11] + 1;
        return F2;
    }

    public final void t0() {
        long K = this.f8540u.K(F);
        bf.f fVar = this.f8541w;
        fVar.l(K != -1 ? K + 1 : fVar.f3669f);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("JsonReader(");
        m10.append(this.f8540u);
        m10.append(")");
        return m10.toString();
    }

    public final void u0() {
        long K = this.f8540u.K(E);
        bf.f fVar = this.f8541w;
        if (K == -1) {
            K = fVar.f3669f;
        }
        fVar.l(K);
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token v() {
        int i10 = this.y;
        if (i10 == 0) {
            i10 = Z();
        }
        switch (i10) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void w() {
        if (h()) {
            this.B = i0();
            this.y = 11;
        }
    }
}
