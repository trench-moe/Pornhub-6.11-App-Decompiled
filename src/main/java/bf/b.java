package bf;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@JvmName(name = "-Util")
/* loaded from: classes2.dex */
public final class b {
    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final String c(byte b10) {
        char[] cArr = a0.b.f121m;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }
}
