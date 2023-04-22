package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import t9.t1;

/* loaded from: classes.dex */
public abstract class zzoe implements Iterable<Byte>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final zzoe f6957c = new zzoc(t1.f15354b);
    private int zzc = 0;

    static {
        int i10 = t9.y0.f15369a;
    }

    public static int p(int i10, int i11, int i12) {
        if (((i12 - i11) | i11) >= 0) {
            return i11;
        }
        throw new IndexOutOfBoundsException(a1.a.h(37, "End index: ", i11, " >= ", i12));
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
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new t9.z0(this);
    }

    public abstract zzoe j(int i10, int i11);

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
        objArr[2] = g() <= 50 ? o9.b.c(this) : o9.b.c(j(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
