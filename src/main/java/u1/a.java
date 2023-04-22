package u1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static Method f15463a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f15464b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f15465c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i10 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        } else {
            if (!f15465c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f15463a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f15464b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f15465c = true;
            }
            if (z10) {
                try {
                    Method method2 = f15463a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                        if (!z10 || (method = f15464b) == null) {
                        }
                        method.invoke(canvas, new Object[0]);
                        return;
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException(e10.getCause());
                }
            }
            if (z10) {
            }
        }
    }
}
