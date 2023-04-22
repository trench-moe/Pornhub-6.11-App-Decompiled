package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import d0.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class f extends k {

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f8976b;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<?> f8977c;
    public static Method d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f8978e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f8979f;

    public static boolean f(Object obj, String str, int i10, boolean z10) {
        g();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Class<?>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Class] */
    public static void g() {
        ?? r22;
        Method method;
        Method method2;
        if (f8979f) {
            return;
        }
        f8979f = true;
        Constructor<?> constructor = null;
        try {
            r22 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = r22.getConstructor(new Class[0]);
            method = r22.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) r22, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            Constructor<?> constructor3 = constructor;
            r22 = constructor3;
            method = r22;
            method2 = constructor3;
        }
        f8977c = constructor;
        f8976b = r22;
        d = method;
        f8978e = method2;
    }

    @Override // e0.k
    public Typeface a(Context context, d.b bVar, Resources resources, int i10) {
        d.c[] cVarArr;
        g();
        try {
            Object newInstance = f8977c.newInstance(new Object[0]);
            for (d.c cVar : bVar.f8596a) {
                File c10 = l.c(context);
                if (c10 == null) {
                    return null;
                }
                try {
                    if (!l.a(c10, resources, cVar.f8601f)) {
                        return null;
                    } else if (!f(newInstance, c10.getPath(), cVar.f8598b, cVar.f8599c)) {
                        return null;
                    } else {
                        c10.delete();
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    c10.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(f8976b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f8978e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // e0.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, j0.l[] lVarArr, int i10) {
        File file;
        FileInputStream fileInputStream;
        String readlink;
        if (lVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e(lVarArr, i10).f11121a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface c10 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c10;
                }
                Typeface c102 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c102;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}
