package e;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static Field f8950a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f8951b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f8952c;
    public static boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f8953e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f8954f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f8955g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f8956h;

    public static void a(Object obj) {
        if (!d) {
            try {
                f8952c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            d = true;
        }
        Class<?> cls = f8952c;
        if (cls == null) {
            return;
        }
        if (!f8954f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f8953e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f8954f = true;
        }
        Field field = f8953e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
