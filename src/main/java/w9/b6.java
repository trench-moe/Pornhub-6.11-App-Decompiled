package w9;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class b6 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f17081a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f17082b;

    static {
        Charset.forName("US-ASCII");
        f17081a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f17082b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static Object c(Object obj, Object obj2) {
        s6 s6Var = (s6) obj2;
        r5 r5Var = (r5) ((s6) obj).c();
        if (r5Var.f17294c.getClass().isInstance(s6Var)) {
            r5Var.j((u5) ((com.google.android.gms.internal.measurement.c) s6Var));
            return r5Var.n();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
