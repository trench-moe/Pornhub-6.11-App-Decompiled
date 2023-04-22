package c7;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class k {
    @Pure
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw ParserException.a(str, null);
        }
    }

    public static boolean b(i iVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return iVar.e(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(i iVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iVar.i(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }
}
