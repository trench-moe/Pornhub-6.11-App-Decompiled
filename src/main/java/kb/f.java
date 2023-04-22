package kb;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public final class f {
    @CanIgnoreReturnValue
    public static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a1.a.j("at index ", i10));
    }

    public static int b(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int c(@NullableDecl Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
