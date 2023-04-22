package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import w9.a5;
import w9.b6;
import w9.d5;

/* loaded from: classes.dex */
public abstract class zzix implements Iterable, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final zzix f7071c = new zziv(b6.f17082b);
    private int zzc = 0;

    static {
        int i10 = a5.f17066a;
    }

    public static int p(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(a1.a.h(66, "Beginning index larger than ending index: ", i10, ", ", i11));
                }
                throw new IndexOutOfBoundsException(a1.a.h(37, "End index: ", i11, " >= ", i12));
            }
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        return i13;
    }

    public static zzix r(byte[] bArr, int i10, int i11) {
        p(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zziv(bArr2);
    }

    public abstract byte b(int i10);

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public abstract int h(int i10, int i11, int i12);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int g10 = g();
            i10 = h(g10, 0, g10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new d5(this);
    }

    public abstract zzix j(int i10, int i11);

    public abstract String l(Charset charset);

    public abstract void m(cb.e eVar);

    public abstract boolean o();

    public final int q() {
        return this.zzc;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(g());
        objArr[2] = g() <= 50 ? m9.a.I(this) : m9.a.I(j(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
