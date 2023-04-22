package q0;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Field f14159a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f14160b;

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f14160b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f14159a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
            }
            f14160b = true;
        }
        Field field = f14159a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e11) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                f14159a = null;
            }
        }
        return null;
    }
}
