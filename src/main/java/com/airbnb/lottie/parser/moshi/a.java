package com.airbnb.lottie.parser.moshi;

import bf.f;
import bf.h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import java.util.Objects;
import okio.ByteString;

/* loaded from: classes.dex */
public final class a extends JsonReader {
    public static final ByteString B = ByteString.d("'\\");
    public static final ByteString C = ByteString.d("\"\\");
    public static final ByteString D = ByteString.d("{}[]:, \n\t\r\f/\\;#=");
    public static final ByteString E = ByteString.d("\n\r");
    public static final ByteString F = ByteString.d("*/");
    public String A;

    /* renamed from: t  reason: collision with root package name */
    public final h f4256t;

    /* renamed from: u  reason: collision with root package name */
    public final f f4257u;

    /* renamed from: w  reason: collision with root package name */
    public int f4258w = 0;
    public long y;

    /* renamed from: z  reason: collision with root package name */
    public int f4259z;

    public a(h hVar) {
        Objects.requireNonNull(hVar, "source == null");
        this.f4256t = hVar;
        this.f4257u = hVar.q();
        v(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void E() {
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 14) {
            i0();
        } else if (i10 == 13) {
            g0(C);
        } else if (i10 == 12) {
            g0(B);
        } else if (i10 != 15) {
            StringBuilder m10 = a1.a.m("Expected a name but was ");
            m10.append(t());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        }
        this.f4258w = 0;
        this.f4244j[this.f4242c - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void F() {
        int i10 = 0;
        do {
            int i11 = this.f4258w;
            if (i11 == 0) {
                i11 = S();
            }
            if (i11 == 3) {
                v(1);
            } else if (i11 == 1) {
                v(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 < 0) {
                        StringBuilder m10 = a1.a.m("Expected a value but was ");
                        m10.append(t());
                        m10.append(" at path ");
                        m10.append(f());
                        throw new JsonDataException(m10.toString());
                    }
                    this.f4242c--;
                } else if (i11 == 2) {
                    i10--;
                    if (i10 < 0) {
                        StringBuilder m11 = a1.a.m("Expected a value but was ");
                        m11.append(t());
                        m11.append(" at path ");
                        m11.append(f());
                        throw new JsonDataException(m11.toString());
                    }
                    this.f4242c--;
                } else {
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 9 && i11 != 13) {
                            if (i11 != 8 && i11 != 12) {
                                if (i11 == 17) {
                                    this.f4257u.l(this.f4259z);
                                } else if (i11 == 18) {
                                    StringBuilder m12 = a1.a.m("Expected a value but was ");
                                    m12.append(t());
                                    m12.append(" at path ");
                                    m12.append(f());
                                    throw new JsonDataException(m12.toString());
                                }
                            }
                            g0(B);
                        }
                        g0(C);
                    }
                    i0();
                }
                this.f4258w = 0;
            }
            i10++;
            this.f4258w = 0;
        } while (i10 != 0);
        int[] iArr = this.f4245m;
        int i12 = this.f4242c;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f4244j[i12 - 1] = "null";
    }

    public final void P() {
        J("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01df, code lost:
        if (X(r2) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01e3, code lost:
        if (r1 != 2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e5, code lost:
        if (r6 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01eb, code lost:
        if (r7 != Long.MIN_VALUE) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01ed, code lost:
        if (r9 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01f3, code lost:
        if (r7 != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01f5, code lost:
        if (r9 != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01f7, code lost:
        if (r9 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01fa, code lost:
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01fb, code lost:
        r17.y = r7;
        r17.f4257u.l(r5);
        r15 = 16;
        r17.f4258w = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x020a, code lost:
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x020c, code lost:
        if (r1 == r2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x020f, code lost:
        if (r1 == 4) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0213, code lost:
        if (r1 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0215, code lost:
        r17.f4259z = r5;
        r15 = 17;
        r17.f4258w = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0256, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0157, code lost:
        r2 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int S() {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.a.S():int");
    }

    public final int V(String str, JsonReader.a aVar) {
        int length = aVar.f4254a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f4254a[i10])) {
                this.f4258w = 0;
                this.f4244j[this.f4242c - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean X(int i10) {
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
                                    case 92:
                                        P();
                                        throw null;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            P();
            throw null;
        }
        return false;
    }

    public final int Y(boolean z10) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!this.f4256t.request(i11)) {
                if (z10) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            byte f10 = this.f4257u.f(i10);
            if (f10 != 10 && f10 != 32 && f10 != 13 && f10 != 9) {
                this.f4257u.l(i11 - 1);
                if (f10 == 47) {
                    if (this.f4256t.request(2L)) {
                        P();
                        throw null;
                    }
                    return f10;
                } else if (f10 != 35) {
                    return f10;
                } else {
                    P();
                    throw null;
                }
            }
            i10 = i11;
        }
    }

    public final String Z(ByteString byteString) {
        StringBuilder sb2 = null;
        while (true) {
            long K = this.f4256t.K(byteString);
            if (K == -1) {
                J("Unterminated string");
                throw null;
            } else if (this.f4257u.f(K) != 92) {
                if (sb2 == null) {
                    String F2 = this.f4257u.F(K);
                    this.f4257u.readByte();
                    return F2;
                }
                sb2.append(this.f4257u.F(K));
                this.f4257u.readByte();
                return sb2.toString();
            } else {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f4257u.F(K));
                this.f4257u.readByte();
                sb2.append(f0());
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void a() {
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 3) {
            v(1);
            this.f4245m[this.f4242c - 1] = 0;
            this.f4258w = 0;
            return;
        }
        StringBuilder m10 = a1.a.m("Expected BEGIN_ARRAY but was ");
        m10.append(t());
        m10.append(" at path ");
        m10.append(f());
        throw new JsonDataException(m10.toString());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void c() {
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 1) {
            v(3);
            this.f4258w = 0;
            return;
        }
        StringBuilder m10 = a1.a.m("Expected BEGIN_OBJECT but was ");
        m10.append(t());
        m10.append(" at path ");
        m10.append(f());
        throw new JsonDataException(m10.toString());
    }

    public final String c0() {
        long K = this.f4256t.K(D);
        return K != -1 ? this.f4257u.F(K) : this.f4257u.E();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4258w = 0;
        this.f4243f[0] = 8;
        this.f4242c = 1;
        f fVar = this.f4257u;
        fVar.l(fVar.f3669f);
        this.f4256t.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void d() {
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 != 4) {
            StringBuilder m10 = a1.a.m("Expected END_ARRAY but was ");
            m10.append(t());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        }
        int i11 = this.f4242c - 1;
        this.f4242c = i11;
        int[] iArr = this.f4245m;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f4258w = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void e() {
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 != 2) {
            StringBuilder m10 = a1.a.m("Expected END_OBJECT but was ");
            m10.append(t());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        }
        int i11 = this.f4242c - 1;
        this.f4242c = i11;
        this.f4244j[i11] = null;
        int[] iArr = this.f4245m;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f4258w = 0;
    }

    public final char f0() {
        int i10;
        int i11;
        if (!this.f4256t.request(1L)) {
            J("Unterminated escape sequence");
            throw null;
        }
        byte readByte = this.f4257u.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte != 98) {
            if (readByte != 102) {
                if (readByte != 110) {
                    if (readByte != 114) {
                        if (readByte != 116) {
                            if (readByte != 117) {
                                StringBuilder m10 = a1.a.m("Invalid escape sequence: \\");
                                m10.append((char) readByte);
                                J(m10.toString());
                                throw null;
                            } else if (!this.f4256t.request(4L)) {
                                StringBuilder m11 = a1.a.m("Unterminated escape sequence at path ");
                                m11.append(f());
                                throw new EOFException(m11.toString());
                            } else {
                                char c10 = 0;
                                for (int i12 = 0; i12 < 4; i12++) {
                                    byte f10 = this.f4257u.f(i12);
                                    char c11 = (char) (c10 << 4);
                                    if (f10 < 48 || f10 > 57) {
                                        if (f10 >= 97 && f10 <= 102) {
                                            i10 = f10 - 97;
                                        } else if (f10 < 65 || f10 > 70) {
                                            StringBuilder m12 = a1.a.m("\\u");
                                            m12.append(this.f4257u.F(4L));
                                            J(m12.toString());
                                            throw null;
                                        } else {
                                            i10 = f10 - 65;
                                        }
                                        i11 = i10 + 10;
                                    } else {
                                        i11 = f10 - 48;
                                    }
                                    c10 = (char) (i11 + c11);
                                }
                                this.f4257u.l(4L);
                                return c10;
                            }
                        }
                        return '\t';
                    }
                    return '\r';
                }
                return '\n';
            }
            return '\f';
        }
        return '\b';
    }

    public final void g0(ByteString byteString) {
        while (true) {
            long K = this.f4256t.K(byteString);
            if (K == -1) {
                J("Unterminated string");
                throw null;
            } else if (this.f4257u.f(K) != 92) {
                this.f4257u.l(K + 1);
                return;
            } else {
                this.f4257u.l(K + 1);
                f0();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean h() {
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean i() {
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 5) {
            this.f4258w = 0;
            int[] iArr = this.f4245m;
            int i11 = this.f4242c - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f4258w = 0;
            int[] iArr2 = this.f4245m;
            int i12 = this.f4242c - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            StringBuilder m10 = a1.a.m("Expected a boolean but was ");
            m10.append(t());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        }
    }

    public final void i0() {
        long K = this.f4256t.K(D);
        f fVar = this.f4257u;
        if (K == -1) {
            K = fVar.f3669f;
        }
        fVar.l(K);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double k() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.a.k():double");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int m() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.a.m():int");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String n() {
        String str;
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 14) {
            str = c0();
        } else if (i10 == 13) {
            str = Z(C);
        } else if (i10 == 12) {
            str = Z(B);
        } else if (i10 != 15) {
            StringBuilder m10 = a1.a.m("Expected a name but was ");
            m10.append(t());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        } else {
            str = this.A;
        }
        this.f4258w = 0;
        this.f4244j[this.f4242c - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String s() {
        String F2;
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 == 10) {
            F2 = c0();
        } else if (i10 == 9) {
            F2 = Z(C);
        } else if (i10 == 8) {
            F2 = Z(B);
        } else if (i10 == 11) {
            F2 = this.A;
            this.A = null;
        } else if (i10 == 16) {
            F2 = Long.toString(this.y);
        } else if (i10 != 17) {
            StringBuilder m10 = a1.a.m("Expected a string but was ");
            m10.append(t());
            m10.append(" at path ");
            m10.append(f());
            throw new JsonDataException(m10.toString());
        } else {
            F2 = this.f4257u.F(this.f4259z);
        }
        this.f4258w = 0;
        int[] iArr = this.f4245m;
        int i11 = this.f4242c - 1;
        iArr[i11] = iArr[i11] + 1;
        return F2;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token t() {
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
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

    public String toString() {
        StringBuilder m10 = a1.a.m("JsonReader(");
        m10.append(this.f4256t);
        m10.append(")");
        return m10.toString();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int w(JsonReader.a aVar) {
        int i10 = this.f4258w;
        if (i10 == 0) {
            i10 = S();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return V(this.A, aVar);
        }
        int M = this.f4256t.M(aVar.f4255b);
        if (M != -1) {
            this.f4258w = 0;
            this.f4244j[this.f4242c - 1] = aVar.f4254a[M];
            return M;
        }
        String str = this.f4244j[this.f4242c - 1];
        String n = n();
        int V = V(n, aVar);
        if (V == -1) {
            this.f4258w = 15;
            this.A = n;
            this.f4244j[this.f4242c - 1] = str;
        }
        return V;
    }
}
