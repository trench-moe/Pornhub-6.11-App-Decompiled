package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f1140a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1140a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1140a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1140a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e10) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
            }
        }
    }

    public static boolean b(View view) {
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        return x.e.d(view) == 1;
    }
}
