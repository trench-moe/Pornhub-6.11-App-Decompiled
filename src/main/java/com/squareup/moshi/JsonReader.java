package com.squareup.moshi;

import bf.p;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public int f8492c;

    /* renamed from: f  reason: collision with root package name */
    public int[] f8493f = new int[32];

    /* renamed from: j  reason: collision with root package name */
    public String[] f8494j = new String[32];

    /* renamed from: m  reason: collision with root package name */
    public int[] f8495m = new int[32];
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8496t;

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
        public final String[] f8505a;

        /* renamed from: b  reason: collision with root package name */
        public final p f8506b;

        public a(String[] strArr, p pVar) {
            this.f8505a = strArr;
            this.f8506b = pVar;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                bf.f fVar = new bf.f();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    jd.i.X(fVar, strArr[i10]);
                    fVar.readByte();
                    byteStringArr[i10] = fVar.t();
                }
                return new a((String[]) strArr.clone(), p.f3685j.c(byteStringArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public final void E(int i10) {
        int i11 = this.f8492c;
        int[] iArr = this.f8493f;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                StringBuilder m10 = a1.a.m("Nesting too deep at ");
                m10.append(f());
                throw new JsonDataException(m10.toString());
            }
            this.f8493f = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f8494j;
            this.f8494j = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f8495m;
            this.f8495m = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f8493f;
        int i12 = this.f8492c;
        this.f8492c = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int F(a aVar);

    public abstract int J(a aVar);

    public abstract void P();

    public abstract void S();

    public final JsonEncodingException V(String str) {
        StringBuilder l10 = android.support.v4.media.a.l(str, " at path ");
        l10.append(f());
        throw new JsonEncodingException(l10.toString());
    }

    public final JsonDataException X(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + f());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + f());
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final String f() {
        return m9.a.u(this.f8492c, this.f8493f, this.f8494j, this.f8495m);
    }

    public abstract boolean h();

    public abstract boolean i();

    public abstract double k();

    public abstract int m();

    public abstract long n();

    public abstract <T> T s();

    public abstract String t();

    public abstract Token v();

    public abstract void w();
}
