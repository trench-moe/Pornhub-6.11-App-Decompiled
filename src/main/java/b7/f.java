package b7;

import android.media.MediaDrm;
import java.util.Objects;
import k8.c0;

/* loaded from: classes.dex */
public final class f {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        String[] split;
        int length;
        String diagnosticInfo = ((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo();
        int i10 = c0.f11939a;
        int i11 = 0;
        if (diagnosticInfo != null && (length = (split = diagnosticInfo.split("_", -1)).length) >= 2) {
            String str = split[length - 1];
            boolean z10 = length >= 3 && "neg".equals(split[length - 2]);
            try {
                Objects.requireNonNull(str);
                i11 = Integer.parseInt(str);
                if (z10) {
                    i11 = -i11;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return w6.g.a(i11);
    }
}
