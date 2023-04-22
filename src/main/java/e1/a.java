package e1;

import androidx.lifecycle.b0;
import androidx.lifecycle.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public static <T extends k & b0> a b(T t2) {
        return new b(t2, t2.j());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
