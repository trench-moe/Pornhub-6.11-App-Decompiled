package f0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Method f9328a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f9329b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f9330c;
    public static boolean d;

    public static void a(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            a(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof e) {
            a(((e) drawable).b());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                Drawable child = drawableContainerState.getChild(i10);
                if (child != null) {
                    a(child);
                }
            }
        }
    }

    public static int b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f9330c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            d = true;
        }
        Method method = f9330c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                f9330c = null;
            }
        }
        return 0;
    }

    public static boolean c(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i10);
        }
        if (!f9329b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f9328a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f9329b = true;
        }
        Method method = f9328a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                f9328a = null;
            }
        }
        return false;
    }

    public static void d(Drawable drawable, int i10) {
        drawable.setTint(i10);
    }

    public static void e(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void f(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T g(Drawable drawable) {
        return drawable instanceof e ? (T) ((e) drawable).b() : drawable;
    }

    public static Drawable h(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof d)) ? new g(drawable) : drawable;
    }
}
