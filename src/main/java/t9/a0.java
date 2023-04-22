package t9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15170a;

    static {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
        }
        f15170a = obj;
        if (obj != null) {
            a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (obj != null) {
            try {
                Method a10 = a("getStackTraceDepth", Throwable.class);
                if (a10 == null) {
                    return;
                }
                a10.invoke(obj, new Throwable());
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused2) {
            }
        }
    }

    public static Method a(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }
}
