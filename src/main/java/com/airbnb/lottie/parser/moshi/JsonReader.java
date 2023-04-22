package com.airbnb.lottie.parser.moshi;

import bf.f;
import bf.p;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import kotlin.text.Typography;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    public static final String[] n = new String[128];

    /* renamed from: c  reason: collision with root package name */
    public int f4242c;

    /* renamed from: f  reason: collision with root package name */
    public int[] f4243f = new int[32];

    /* renamed from: j  reason: collision with root package name */
    public String[] f4244j = new String[32];

    /* renamed from: m  reason: collision with root package name */
    public int[] f4245m = new int[32];

    /* loaded from: classes.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f4254a;

        /* renamed from: b  reason: collision with root package name */
        public final p f4255b;

        public a(String[] strArr, p pVar) {
            this.f4254a = strArr;
            this.f4255b = pVar;
        }

        public static a a(String... strArr) {
            int i10;
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                f fVar = new f();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    String str2 = strArr[i11];
                    String[] strArr2 = JsonReader.n;
                    fVar.i0(34);
                    int length = str2.length();
                    int i12 = 0;
                    for (i10 = 0; i10 < length; i10 = i10 + 1) {
                        char charAt = str2.charAt(i10);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            i10 = str == null ? i10 + 1 : 0;
                        } else if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i12 < i10) {
                            fVar.t0(str2, i12, i10);
                        }
                        fVar.s0(str);
                        i12 = i10 + 1;
                    }
                    if (i12 < length) {
                        fVar.t0(str2, i12, length);
                    }
                    fVar.i0(34);
                    fVar.readByte();
                    byteStringArr[i11] = fVar.t();
                }
                return new a((String[]) strArr.clone(), p.f3685j.c(byteStringArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            n[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void E();

    public abstract void F();

    public final JsonEncodingException J(String str) {
        StringBuilder l10 = android.support.v4.media.a.l(str, " at path ");
        l10.append(f());
        throw new JsonEncodingException(l10.toString());
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final String f() {
        int i10 = this.f4242c;
        int[] iArr = this.f4243f;
        String[] strArr = this.f4244j;
        int[] iArr2 = this.f4245m;
        StringBuilder m10 = a0.a.m(Typography.dollar);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                m10.append('[');
                m10.append(iArr2[i11]);
                m10.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                m10.append('.');
                if (strArr[i11] != null) {
                    m10.append(strArr[i11]);
                }
            }
        }
        return m10.toString();
    }

    public abstract boolean h();

    public abstract boolean i();

    public abstract double k();

    public abstract int m();

    public abstract String n();

    public abstract String s();

    public abstract Token t();

    public final void v(int i10) {
        int i11 = this.f4242c;
        int[] iArr = this.f4243f;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                StringBuilder m10 = a1.a.m("Nesting too deep at ");
                m10.append(f());
                throw new JsonDataException(m10.toString());
            }
            this.f4243f = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4244j;
            this.f4244j = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f4245m;
            this.f4245m = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4243f;
        int i12 = this.f4242c;
        this.f4242c = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int w(a aVar);
}
