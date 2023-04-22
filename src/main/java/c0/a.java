package c0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import d0.f;
import java.io.File;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3717a = new Object();

    /* renamed from: c0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0047a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        Objects.requireNonNull(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static int b(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 23 ? d.a(context, i10) : context.getResources().getColor(i10);
    }

    /* JADX WARN: Finally extract failed */
    public static ColorStateList c(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.a aVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = d0.f.f8607a;
        f.b bVar = new f.b(resources, theme);
        synchronized (d0.f.f8609c) {
            try {
                SparseArray<f.a> sparseArray = d0.f.f8608b.get(bVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i10)) != null) {
                    if (aVar.f8611b.equals(resources.getConfiguration())) {
                        colorStateList2 = aVar.f8610a;
                    } else {
                        sparseArray.remove(i10);
                    }
                }
                colorStateList2 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal2 = d0.f.f8607a;
        TypedValue typedValue = threadLocal2.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal2.set(typedValue);
        }
        boolean z10 = true;
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            z10 = false;
        }
        if (!z10) {
            try {
                colorStateList = d0.b.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList == null) {
            return Build.VERSION.SDK_INT >= 23 ? resources.getColorStateList(i10, theme) : resources.getColorStateList(i10);
        }
        synchronized (d0.f.f8609c) {
            WeakHashMap<f.b, SparseArray<f.a>> weakHashMap = d0.f.f8608b;
            SparseArray<f.a> sparseArray2 = weakHashMap.get(bVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(bVar, sparseArray2);
            }
            sparseArray2.append(i10, new f.a(colorStateList, bVar.f8612a.getConfiguration()));
        }
        return colorStateList;
    }
}
