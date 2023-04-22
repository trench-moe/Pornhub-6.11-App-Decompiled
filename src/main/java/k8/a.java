package k8;

import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes2.dex */
public final class a {
    @Pure
    public static String a(String str, Throwable th) {
        boolean z10;
        String replace;
        if (th == null) {
            replace = null;
        } else {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z10 = false;
                    break;
                } else if (th2 instanceof UnknownHostException) {
                    z10 = true;
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            replace = z10 ? "UnknownHostException (no network)" : Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace2 = replace.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(a0.a.e(replace2, valueOf.length() + 4));
        sb2.append(valueOf);
        sb2.append("\n  ");
        sb2.append(replace2);
        sb2.append('\n');
        return sb2.toString();
    }

    public static void b(String str) {
        if (c0.f11939a >= 18) {
            Trace.beginSection(str);
        }
    }

    @Pure
    public static void c(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void d(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @Pure
    public static int e(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    @Pure
    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static Object g(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static Object h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.valueOf(obj2));
    }

    @Pure
    public static void i(String str, String str2, Throwable th) {
        Log.e(str, a(str2, th));
    }

    public static void j() {
        if (c0.f11939a >= 18) {
            Trace.endSection();
        }
    }

    @Pure
    public static void k(String str, String str2, Throwable th) {
        Log.w(str, a(str2, th));
    }
}
