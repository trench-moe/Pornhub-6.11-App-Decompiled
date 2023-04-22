package t9;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f15353a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f15354b;

    static {
        Charset.forName("US-ASCII");
        f15353a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f15354b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static Object b(Object obj, Object obj2) {
        w0 i10 = ((j2) obj).i();
        j2 j2Var = (j2) obj2;
        Objects.requireNonNull(i10);
        j1 j1Var = (j1) i10;
        if (j1Var.f15271c.getClass().isInstance(j2Var)) {
            j1Var.b((com.google.android.gms.internal.cast.l1) ((com.google.android.gms.internal.cast.h1) j2Var));
            return j1Var.d();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
